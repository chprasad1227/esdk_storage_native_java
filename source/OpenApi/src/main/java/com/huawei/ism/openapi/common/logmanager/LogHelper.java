package com.huawei.ism.openapi.common.logmanager;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;

/**
 * 日记的帮助类
 * @author fWX183786
 * @version V100R001C10
 */
public final class LogHelper
{
    private static LogHelper logHelperInstanceHelper = null;

    private static final String NEWLINE_SYMBOL = "\n";
    
    /**
     * 私有构造函数
     */
    private LogHelper()
    {

    }

    /**
     * LogHelper的单例
     * @return LogHelper实例
     */
    public static LogHelper getLogHelperInstance()
    {
        if (null == logHelperInstanceHelper)
        {
            logHelperInstanceHelper = new LogHelper();
        }
        return logHelperInstanceHelper;
    }

    /**
     * 打印日志时获取当前的程序文件名、行号、方法名 输出格式为：[FileName | LineNumber | MethodName]
     * @param traceIndex 堆栈的索引
     * @return 方法的调用堆栈
     */
    protected synchronized String getFileLineMethod(int traceIndex)
    {
        StackTraceElement traceElement = ((new IOException()).getStackTrace())[traceIndex];
        StringBuffer toStringBuffer = new StringBuffer("[").append(traceElement.getFileName()).append(" | ")
            .append(traceElement.getLineNumber()).append(" | ").append(traceElement.getMethodName()).append("]");
        return toStringBuffer.toString();
    }

    /**
     * 获取当前方法名
     * @param traceIndex 堆栈的索引
     * @return 方法名
     */
    protected synchronized String getMethodName(int traceIndex)
    {
        StackTraceElement traceElement = ((new IOException()).getStackTrace())[traceIndex];
        StringBuffer toStringBuffer = new StringBuffer("[").append(traceElement.getMethodName()).append("]");
        return toStringBuffer.toString();
    }

    /**
     * 获取文件名
     * @param traceIndex 堆栈的索引
     * @return 文件名
     */
    protected synchronized String getFileName(int traceIndex)
    {
        StackTraceElement traceElement = ((new IOException()).getStackTrace())[traceIndex];
        return traceElement.getFileName();
    }

    /**
     * 获取当前行号
     * @param traceIndex 堆栈索引
     * @return 行号
     */
    protected synchronized int getLineNumber(int traceIndex)
    {
        StackTraceElement traceElement = ((new IOException()).getStackTrace())[traceIndex];
        return traceElement.getLineNumber();
    }

    /**
     * 获取当前时间
     * @return 当前系统时间
     */
    protected synchronized String getCurTime()
    {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        return sdf.format(now);
    }

    /**
     * 获取堆栈信息
     * @param e ApiException
     * @return 堆栈信息
     */
    protected synchronized String getStackTrace(ApiException e)
    {
        StackTraceElement[] stackElements = e.getStackTrace();
        StringBuilder stringBuilder = new StringBuilder();

        String expMsg = String.format("Exception msg: %s%n", e.getErrMessage().getErrorDescription());
        stringBuilder.append(expMsg);

        for (int i = 0; i < stackElements.length; i++)
        {
            String msg = String.format("%s | %s | %s | %s ", stackElements[i].getFileName(),
                stackElements[i].getClassName(), stackElements[i].getMethodName(), stackElements[i].getLineNumber());
            stringBuilder.append(msg).append(NEWLINE_SYMBOL);
        }
        return stringBuilder.toString();
    }
    
    /**
     * 时间格式化
     * @param pattern 指定日期格式
     * @param time 指定时间
     */
    private static String format(long time,String pattern)
    {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String currentTime = sdf.format(new Date(time));
        return currentTime;
    }
    
    /**
     * 时间格式化，格式为yyyy-mm-dd HH:mm:ss
     * @param time
     * @return
     */
    public static String format(long time)
    {
        return format(time, "yyyy-MM-dd HH:mm:ss");
    }
    
    /**
     * 根据URL获取ip地址或者网址<br/>
     * 必须是"http://ip地址:端口/目录"格式<br/>
     * 不能去掉端口，否则数组下标越界<br/>
     */
    public static String getDestinationIP(String url)
    {
        
        String destinationIp = "";
        
        if (url != null)
        {
            
            // 校验URL的正则表达式
            if (url.matches("^(https?|http)://" + "[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]"))
            {
                
                destinationIp = url.substring(url.indexOf("://") + 3);
                destinationIp = destinationIp.substring(0, destinationIp.indexOf(":"));
            }
        }
        
        return destinationIp;
    }
    
    /**
     * 根据日志类型查询获得最早的日志文件
     * @param 日志类型
     * @return 返回日志文件，如果没有文件则返回NULL
     */
    public static String getOldestLogFile(String logType)
    {
        List<String> list = getLogFiles(new File(getLogPath(logType)));
        if (list.size() > 0)
        {
            return list.get(0);
        }
        
        return null;
    }
    
    /** 根据日志类型获得日志路径 */
    public static String getLogPath(String logType)
    {
        String file = null;
        String appenName = null;
        Appender appender = null;
        if("interface".equalsIgnoreCase(logType))
        {
            appenName = "iAppender";
            appender  = Logger.getLogger("com.huawei.openapi.interfaceLogger")
                .getAppender(appenName);
        }
        else if("operation".equalsIgnoreCase(logType))
        {
            appenName = "oAppender";
            appender  = Logger.getLogger("com.huawei.openapi.operationLogger")
                .getAppender(appenName);
        }
        else
        {
            appenName = "rAppender";
            appender  = Logger.getLogger("com.huawei.openapi.runningLogger")
                .getAppender(appenName);
        }
        
        FileAppender fAppender = (FileAppender) appender;
        if(null == fAppender)
        {
            return LogUtil.getLogUtilInstance().getILoggerPath();
        }
        file = getLogPathByLogFile(fAppender.getFile());
        if(null == file)
        {
            return LogUtil.getLogUtilInstance().getILoggerPath();
        }
        return file;
    }
    
    private static String getLogPathByLogFile(String logFile)
    {
        String file = null;
        if (null != logFile && !"".equals(logFile))
        {
            File tempFile = new File(logFile);
            if (tempFile.isFile())
            {
                file = tempFile.getParent();
            }
        }
        return file;
    }
    
    /** 获得日志文件夹下的所有日志文件，并排序 */
    public static List<String> getLogFiles(File dir)
    {
        List<String> result = new ArrayList<String>();
        File[] files = null;
        if (null != dir)
        {
            files = dir.listFiles();
        }
        
        if (null != files)
        {
            Arrays.sort(files, new Comparator<File>()
            {
                public int compare(File f1, File f2)
                {
                    return Long.valueOf(f1.lastModified()).compareTo(f2.lastModified());
                }
            });
            
            for (File file : files)
            {
                if (!file.isDirectory())
                {
                    if (file.getName().startsWith("eSDK-Server"))
                    {
                        
                        result.add(file.getPath());
                    }
                }
            }
        }
        
        return result;
    }
    
    /** 判断日志文件是否是备份文件 */
    public static boolean isBackLogFile(String fileNameWithPath)
    {
        if (fileNameWithPath.contains(".log."))
        {
            return true;
        }
        return false;
    }
    
    public static void deleteLogFile(String fileNameWithPath)
    {
        File file = new File(fileNameWithPath);
        if (file.exists() && !file.delete())
        {
            LogUtil.getLogUtilInstance().showRunningtLog(LOG_TYPE_E.LOG_WARN,
                    "LogHelper0.deleteLogFile()", fileNameWithPath + " deleted failed");
        }
    }
    
    public static void setLoggerLevel(String packageName, String levelName)
    {
        LogUtil.getLogUtilInstance().showRunningtLog(LOG_TYPE_E.LOG_INFO, 
                "LogHelper.setLoggerLevel()", "packageName=" + packageName + ", levelName=" + levelName);
        Level level = Level.toLevel(levelName);
        if ("".equals(packageName))
        {
            Logger logger = LogManager.getRootLogger();
            logger.setLevel(level);
        }
        Logger logger = LogManager.getLogger(packageName);
        if (null != logger)
        {
            logger.setLevel(level);
        }
    }

}
