package com.huawei.ism.openapi.common.logmanager;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 上传日志文件的线程<br/>
 * ..加密通信
 * ..查询是否能上传
 * ..查询和判断上传文件是否能上传
 * ..上传
 * @author zWX228053
 */
public class LogFileUploadTask implements Runnable
{
    private LogUtil logUtil = LogUtil.getLogUtilInstance();
    
    private static final String PRODUCT_TYPE = "eSDK-Server";// 不清楚这个字段的功用
    
    private static final String[] logTypes = {"run", "interface", "operation"};
    
    private OpenApiUtils utils = OpenApiUtils.getOpenApiUtilsInstance();
    
    private String serverUrl ;
    
    private boolean isStop = false;// 是否停止
    
    @Override
    public void run()
    {
        long sleepTime;
        try
        {
            while(true)
            {
                sleepTime = getSleepTime();// 获得休眠时间
                TimeUnit.SECONDS.sleep(sleepTime);// 线程休眠
                if(isStop)
                {
                    break;
                }
                logUtil.showRunningtLog(LOG_TYPE_E.LOG_INFO,
                    "LogFileUploadTask.run()", "start to upload log files");
                try
                {
                    if(utils.isNullStr(LogUtil.getUploadUrl()))
                    {
                        continue;// 上传路径为空，则不进行上传
                    }
                    else
                    {
                        serverUrl = LogUtil.getUploadUrl();
                    }
                    uploadLogFiles();// 开始上传
                }
                catch(Exception e)
                {
                    logUtil.showRunningtLog(LOG_TYPE_E.LOG_ERROR,
                            "LogFileUploadTask.run()", "Failed to upload log files");
                }
            }
        }
        catch (InterruptedException e)
        {
            //InterruptedException Exception happened
            logUtil.showRunningtLog(LOG_TYPE_E.LOG_ERROR,
                    "LogFileUploadTask.run()", "InterruptedException Exception happened");
        }
    }
    
    /** 休眠时间0~30分钟 */
    private long getSleepTime()
    {
        Random generator = new Random();
        long result = generator.nextInt(30) * 60L;
        return result;
    }
    
    /** 上传文件 */
    private void uploadLogFiles()
    {
        HttpClient httpClient = new DefaultHttpClient();
        prepare4Https(httpClient);// 进行连接的安全加密配置
        
        if (!hasUploadRights(httpClient))// 判断是否能够上传
        {
            logUtil.showRunningtLog(LOG_TYPE_E.LOG_DEBUG, "LogFileUploadTask.uploadLogFiles()"
                    , "Current machine is not allowed to upload file to server or the server has something wrong.");
            return;
        }
        
        String logFile;// 要上传的日志文件
        File file;
        boolean currentWritingLogFileFlag = false;
        for (String logType : logTypes)
        {
            currentWritingLogFileFlag = false;
            while (true)
            {
                logFile = LogHelper.getOldestLogFile(logType);
                logUtil.showRunningtLog(LOG_TYPE_E.LOG_DEBUG,
                        "LogFileUploadTask.uploadLogFiles()", "upload logFile : " + logFile);
                // 如果是当前正在写入的日志文件则直接跳出循环
                if (utils.isNullStr(logFile)
                    || (currentWritingLogFileFlag && !LogHelper.isBackLogFile(logFile)))
                {
                    break;
                }
                else
                {
                    if (!LogHelper.isBackLogFile(logFile))
                    {
                        currentWritingLogFileFlag = true;
                    }
                    file = new File(logFile);
                    // 如果文件长度为0，则跳过当前文件
                    if (0 == file.length())
                    {
                        continue;
                    }
                    // 如果是当前正在写入的日志文件，则做特别处理
                    if (currentWritingLogFileFlag)
                    {
                        logFile = processCurrentLogFile(logType, logFile);
                    }
                    if (utils.isNullStr(logFile))
                    {
                        continue;
                    }
                    logFile = moveFile(logFile);// 个人理解是将日志文件移动到了temp下，并返回了新路径
                    if (doLogFileUpload(httpClient, logFile, PRODUCT_TYPE))
                    {
                        LogHelper.deleteLogFile(logFile);
                    }
                }
            }
        }
        LogUtil.getLogUtilInstance().showRunningtLog(
                LOG_TYPE_E.LOG_INFO, "LogFileUploaderTask", "upload Log files end");
    }
    
    private String moveFile(String logFile)
    {
        if (utils.isNullStr(logFile))
        {
            return logFile;
        }// 不明白为什么这个地方还要判断NULL，加入这个地方真的返回NULL，则会引起后续问题
        
        File file = new File(logFile);
        //Move the file to temp folder for uploading
        File destFile = new File(file.getParent() + File.separator + "temp" + File.separator + file.getName());
        try
        {
            if (destFile.exists())
            {
                if(!destFile.delete())
                {
                    logUtil.showRunningtLog(LOG_TYPE_E.LOG_WARN,
                        "LogFileUploadTask.moveFile()", "Failed to delete " + destFile + ".");
                }
            }// 先判断是否存在，不知道是不是担心上次没删除干净
            FileUtils.moveFile(file, destFile);
            file = destFile;
        }
        catch (IOException e)
        {
            logUtil.showRunningtLog(LOG_TYPE_E.LOG_ERROR, "LogFileUploadTask.moveFile()", "IOException: Failed to move " + file +" file");
        }
        
        return file.getPath();
    }
    
    /** 解决findBugs问题 */
    static class UpLoadX509TrustManager implements X509TrustManager
    {

        public java.security.cert.X509Certificate[] getAcceptedIssuers()
        {
            return new java.security.cert.X509Certificate[] {};
        }
        
        @Override
        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType)
            throws java.security.cert.CertificateException
        {
        }
        
        @Override
        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType)
            throws java.security.cert.CertificateException
        {
        }
        
    }
    
    /** 连接的安全加密配置 */
    private void prepare4Https(HttpClient httpClient)
    {
        if (!serverUrl.startsWith("https"))
        {
            return;
        }
        try
        {
            SSLContext ctx = SSLContext.getInstance("TLS");
            X509TrustManager tm = new UpLoadX509TrustManager();
            ctx.init(null, new TrustManager[] {tm}, null);
            SSLSocketFactory ssf = new SSLSocketFactory(ctx, SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            SchemeRegistry registry = httpClient.getConnectionManager().getSchemeRegistry();
            registry.register(new Scheme("https",
                Integer.parseInt(serverUrl.substring(serverUrl.lastIndexOf(":") + 1, serverUrl.indexOf("/", 8))),
                ssf));
        }
        catch (KeyManagementException e)
        {
            logUtil.showRunningtLog(LOG_TYPE_E.LOG_ERROR,
                    "LogFileUploadTask.run()", "KeyManagementException:Failed to create security client");
        }
        catch (NoSuchAlgorithmException e)
        {
            logUtil.showRunningtLog(LOG_TYPE_E.LOG_ERROR,
                    "LogFileUploadTask.run()", "NoSuchAlgorithmException to create security client");
        }
    }
    
    /** 不清楚功能，应该是判断是否有上传的权限 */
    private boolean hasUploadRights(HttpClient httpClient)
    {
        HttpPost httpPost = new HttpPost(serverUrl);
        MultipartEntity mutiEntity = new MultipartEntity(HttpMultipartMode.STRICT);
        httpPost.setEntity(mutiEntity);
        try
        {
            mutiEntity.addPart("LogFileInfo",
                new StringBody("{\"product\":\"" + PRODUCT_TYPE + "\"}", Charset.forName("UTF-8")));
        }
        catch (UnsupportedEncodingException e)
        {
            logUtil.showRunningtLog(LOG_TYPE_E.LOG_ERROR, "LogFileUploadTask.hasUploadRights()", "UTF-8 is not supported encode");
        }
        
        HttpResponse httpResponse;
        try
        {
            httpResponse = httpClient.execute(httpPost);
            HttpEntity httpEntity = httpResponse.getEntity();
            String content = EntityUtils.toString(httpEntity);
            if (content.contains("\"resultCode\":\"3\""))
            {
                return false;
            }
        }
        catch (ClientProtocolException e)
        {
            logUtil.showRunningtLog(LOG_TYPE_E.LOG_ERROR,
                    "LogFileUploadTask.hasUploadRights()", "ClientProtocolException"+e.getMessage());
            return false;
        }
        catch (IOException e)
        {
            logUtil.showRunningtLog(LOG_TYPE_E.LOG_ERROR,
                    "LogFileUploadTask.hasUploadRights()", "IOException"+e.getMessage());
            return false;
        }
        
        return true;
    }
    
    /**
     * @param logType
     * @param logFile
     * @return
     */
    private String processCurrentLogFile(String logType, String logFile)
    {
        File file = new File(logFile);
        //Different appenders for different file types
        if ("interface".equalsIgnoreCase(logType)
            ||"operation".equalsIgnoreCase(logType)
            ||"run".equalsIgnoreCase(logType))
        {
            // 个人觉得这方法也适合根日志，但是不清楚为什么不统一放到上面..?
            // 当然也有可能是考虑到平台和native的区别吧...
            return getCurrentLogFile(file, logFile);
        }
        else
        {
            return "";
        }
        
    }
    
    /** 通过移动来判断当前文件是否处于被打开状态 */
    private String getCurrentLogFile(File file,String logFile)
    {
        try
        {
            File destDir = new File(file.getParent() + File.separator
                + "temp" + File.separator + file.getName());
            FileUtils.moveFile(file, destDir);
            FileUtils.moveFile(destDir, file);
            return logFile;
        }
        catch(IOException e)
        {
            return "";
        }
    }
    
    private boolean doLogFileUpload(HttpClient httpClient, String fileNameWithPath, String product)
    {
        if (utils.isNullStr(fileNameWithPath))
        {
            return true;
        }
        // 当前日志文件正在写的场景...
        HttpPost httpPost = buildHttpPost(fileNameWithPath, product);
        HttpResponse httpResponse;
        try
        {
            String packageName = "org.apache.http.wire";
            Logger logger = LogManager.getLogger(packageName);
            String backupLevel;// 这里的处理据说是担心在httpclient中日志打印在根日志中造成死循环上传，
            //其实我们不上传根日志不就行了，而且根日志记录的信息能上传吗?httpclient中的日志又不可能打印在3种日志中
            if (null != logger && null != logger.getLevel())
            {
                backupLevel = logger.getLevel().toString();
            }
            else
            {
                logger = LogManager.getRootLogger();
                Level level = logger.getLevel();
                if (null != level)
                {
                    backupLevel = level.toString();
                }
                else
                {
                    backupLevel = "INFO";
                }
            }
            LogHelper.setLoggerLevel(packageName, "INFO");
            httpResponse = httpClient.execute(httpPost);
            LogHelper.setLoggerLevel(packageName, backupLevel);
            HttpEntity httpEntity = httpResponse.getEntity();
            String content = EntityUtils.toString(httpEntity);
            if (content.contains("\"resultCode\":\"0\""))
            {
                return true;
            }
            else
            {
                logUtil.showInterfaceLog(LOG_TYPE_E.LOG_WARN, 1, "LogFileUploadTask.buildHttpPost()",
                        null, null, "Failed to upload " + fileNameWithPath + " file, the response from server is " + content);
            }
        }
        catch (ClientProtocolException e)
        {
            logUtil.showRunningtLog(LOG_TYPE_E.LOG_ERROR, "LogFileUploadTask.buildHttpPost()",
                    "ClientProtocolException: Failed to upload " + fileNameWithPath);
        }
        catch (IOException e)
        {
            logUtil.showRunningtLog(LOG_TYPE_E.LOG_ERROR, "LogFileUploadTask.buildHttpPost()",
                    "IOException: Failed to upload " + fileNameWithPath);
        }
        
        return false;
    }
    
    private HttpPost buildHttpPost(String fileNameWithPath, String product)
    {
        HttpPost httpPost = new HttpPost(serverUrl);
        MultipartEntity mutiEntity = new MultipartEntity(HttpMultipartMode.STRICT);
        httpPost.setEntity(mutiEntity);
        File file = new File(fileNameWithPath);
        try
        {
            mutiEntity.addPart("LogFileInfo",
                new StringBody("{\"product\":\"" + product + "\"}", Charset.forName("UTF-8")));
        }
        catch (UnsupportedEncodingException e)
        {
            logUtil.showRunningtLog(LOG_TYPE_E.LOG_ERROR, "LogFileUploadTask.buildHttpPost()", "UTF-8 is not supported encode");
        }
        mutiEntity.addPart("LogFile", new FileBody(file));
        return httpPost;
    }

    public boolean isStop()
    {
        return isStop;
    }

    public void setStop(boolean isStop)
    {
        this.isStop = isStop;
    }
}
