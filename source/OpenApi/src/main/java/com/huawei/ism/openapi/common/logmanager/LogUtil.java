package com.huawei.ism.openapi.common.logmanager;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.json.JSONException;
import org.json.JSONObject;

import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;

/**
 * 日志工具类
 * @author fWX183786
 * @version V100R001C10
 */
public final class LogUtil
{
    private static LogUtil logUtilInstance = null;

    private static final String splitChar = "|";

    private static String uploadUrl = "";

    /** 日志文件的根目录 */
    private static String basePath = "";

    /** 日志文件是否追加到 */
    private static boolean additivity = false;

    /** 接口日志文件夹 */
    private static String iLoggerFolder = "interfaceLogs";

    /** 运行日志文件夹 */
    private static String rLoggerFolder = "runLogs";

    /** 操作日志文件夹 */
    private static String oLoggerFolder = "operationLogs";

    public static final String INTERFACE_LOGER = "com.huawei.openapi.interfaceLogger";// 配置文件中对应的loger名称

    public static final String RUNNING_LOGER = "com.huawei.openapi.runningLogger";// 配置文件中对应的loger名称

    public static final String OPERATION_LOGER = "com.huawei.openapi.operationLogger";// 配置文件中对应的loger名称

    private static LogListener gLogListener;
    
    private static boolean isStop = false;// 是否停止，主要用于启动时检测

    /**
     * 设置日志路径(需要在调用LogUtil之前设置)<br/>
     * 完整日志路径:<br/>
     * 1.logDir/runLogs/runLog.log<br/>
     * 2.logDir/interfaceLogs/interfaceLog.log<br/>
     * 3.logDir/OpenAPI_logs/runLogs/operationLog.log<br/>
     * 默认路径:<br/>
     * Tomcat_home/OpenAPI_logs/runLogs/runLog.log<br/>
     * ...<br/>
     * 或者<br/>
     * Application/OpenAPI_logs/runLogs/runLog.log<br/>
     * ...
     * @param logDir 需要是完整的绝对路径,路径后面要以"/"或者"\\"结尾
     */
    public static void setLogPath(String logDir)
    {
        basePath = logDir;
    }

    /**
     * 设置OPEN API日志是否追加到用户设置的根日志文件中(需要再调用LogUtil之前设置)，<br/>
     * 默认为false，即不追加到用户设置的根日志文件中
     */
    public static void setAdditivity(boolean bool)
    {
        additivity = bool;
    }

    /**
     * 私有构造函数
     */
    private LogUtil()
    {
        initLogPath();// 初始化日志路径
        createLogDir();// 创建日志文件夹
        URL url = LogUtil.class.getResource("log4j.properties");// 读取配置文件
        PropertyConfigurator.configure(url);// 配置日志记录器
        LogManager.getIlogger().setAdditivity(additivity);
        LogManager.getOlogger().setAdditivity(additivity);
        LogManager.getRlogger().setAdditivity(additivity);
    }

    /** 如果未初始化日志路径 */
    private static void initLogPath()
    {
        /* 判断并设置路径 */
        if (null == basePath || "".equals(basePath))
        {
            URL url = LogUtil.class.getResource("/");
            basePath = url.getFile() + "../OpenAPI_logs";
        }
        iLoggerFolder = basePath + File.separator + iLoggerFolder;
        rLoggerFolder = basePath + File.separator + rLoggerFolder;
        oLoggerFolder = basePath + File.separator + oLoggerFolder;
    }

    /**
     * 创建日志文件夹
     */
    private void createLogDir()
    {
        File iLoggerDir = new File(iLoggerFolder);
        File rLoggerDir = new File(rLoggerFolder);
        File oLoggerDir = new File(oLoggerFolder);
        if (!iLoggerDir.exists())
        {
            if (!iLoggerDir.mkdirs())
            {
                Logger.getRootLogger().error("Failed to create interface log folder");
            }
        }
        if (!rLoggerDir.exists())
        {
            if (!rLoggerDir.mkdirs())
            {
                Logger.getRootLogger().error("Failed to create run log folder");
            }
        }
        if (!oLoggerDir.exists())
        {
            if (!oLoggerDir.mkdirs())
            {
                Logger.getRootLogger().error("Failed to create operation log folder");
            }
        }
        System.setProperty("iLoggerPath", iLoggerFolder);// 设置接口日志路径
        System.setProperty("rLoggerPath", rLoggerFolder);// 设置运行日志路径
        System.setProperty("oLoggerPath", oLoggerFolder);// 设置操作日志路径
    }

    /**
     * 获取LogUtil单例
     * @return LogUtil实例
     */
    public synchronized static LogUtil getLogUtilInstance()
    {
        if (null == logUtilInstance)
        {
            logUtilInstance = new LogUtil();
            if(!isStop)
                startUploadTask();// 开启日志上传,不能放在构造函数中，会无限递归
        }
        return logUtilInstance;
    }

    /**
     * 运行日志<br/>
     * 完整格式:略
     * @param logLevel 日志级别
     * @param moduleName 内部模块名称
     * @param essentialMsg 关键信息
     */
    public void showRunningtLog(LOG_TYPE_E logLevel, String moduleName, String essentialMsg)
    {
        String logMsg = LogHelper.format(System.currentTimeMillis());// 当前时间
        logMsg = logMsg + splitChar + logLevel.getValue() + splitChar + moduleName + splitChar + essentialMsg;
        this.showLog(LogManager.getRlogger(), logLevel, logMsg);
    }

    /**
     * 操作日志<br/>
     * 完整格式:当前时间|日志级别|模块名称|用户名|客户端标识|执行结果|日志关键信息
     * @param logLevel
     * @param moduleName 内部模块名称
     * @param user 当前执行操作的用户名
     * @param clientId 客户端标识，无则记录IP
     * @param resultCode 执行结果，用"successful"/"failed"
     * @param essentialMsg 日志关键信息
     */
    public void showOperationLog(LOG_TYPE_E logLevel, String moduleName, String user, String clientId,
        String resultCode, String essentialMsg)
    {
        String logMsg = LogHelper.format(System.currentTimeMillis());// 当前时间
        logMsg = logMsg + splitChar + logLevel.getValue() + splitChar + moduleName + splitChar + user + splitChar
            + clientId + splitChar + resultCode + splitChar + essentialMsg;
        this.showLog(LogManager.getOlogger(), logLevel, logMsg);
    }

    /**
     * 接口日志,用来打印请求信息<br/>
     * 完整格式:当前时间|日志级别|所属业务|接口类型|协议类型|接口名称|本地IP|目标IP|事务ID|请求时间|响应时间|请求参数|结果码|响应参数<br/>
     * 此方法默认打印业务类型为Storage,协议类型默认为Rest,事务Id默认为Null,响应信息全为NULL
     * @param logLevel 日志级别
     * @param iType 接口类型，1南向，2北向
     * @param iName 接口名称
     * @param destIP 目标IP
     * @param properties 请求参数
     */
    public void showInterfaceLog(LOG_TYPE_E logLevel, int iType, String iName, String destIP, String properties)
    {
        showInterfaceLog(logLevel, "Storage", iType, "Rest", iName, null, destIP, null,
            LogHelper.format(System.currentTimeMillis()), null, properties, null, null);
    }

    /**
     * 接口日志，用来打印响应信息<br/>
     * 完整格式:当前时间|日志级别|所属业务|接口类型|协议类型|接口名称|本地IP|目标IP|事务ID|请求时间|响应时间|请求参数|结果码|响应参数<br/>
     * @param logLevel 日志级别
     * @param iType 接口类型，1南向，2北向
     * @param iName 接口名称
     * @param origIP 源端IP
     * @param resultCode 结果码
     * @param respArgs 响应参数
     */
    public void showInterfaceLog(LOG_TYPE_E logLevel, int iType, String iName, String origIP, String resultCode,
        String respArgs)
    {
        showInterfaceLog(logLevel, "Storage", iType, "Rest", iName, origIP, null, null, null,
            LogHelper.format(System.currentTimeMillis()), null, resultCode, respArgs);
    }

    /**
     * 接口日志<br/>
     * 完整格式:当前时间|日志级别|所属业务|接口类型|协议类型|接口名称|本地IP|目标IP|事务ID|请求时间|响应时间|请求参数|结果码|响应参数<br/>
     * @param logLevel 日志级别
     * @param product 所属业务 填写接口所属的产品，如UC的接口填写UC。包括UC、IVS、TP、FusionSphere、
     *        Storage等
     * @param iType 接口类型，1南向，2北向
     * @param protocolType 协议类型
     * @param iName 接口名称
     * @param localIP 本地IP
     * @param destIP 目标IP
     * @param transactionId 事务ID，无则填空
     * @param reqTime 请求时间
     * @param reqArgs 请求参数
     * @param resultCode 结果码
     * @param respArgs 响应参数
     */
    public void showInterfaceLog(LOG_TYPE_E logLevel, String product, int iType, String protocolType, String iName,
        String localIP, String destIP, String transactionId, String reqTime, String respTime, String reqArgs,
        String resultCode, String respArgs)
    {
        String logMsg = LogHelper.format(System.currentTimeMillis());// 当前时间
        logMsg += splitChar + logLevel.getValue() + splitChar + product + splitChar + iType + splitChar + protocolType
            + splitChar + iName + splitChar + localIP + splitChar + destIP + splitChar + transactionId + splitChar
            + reqTime + splitChar + respTime + splitChar + reqArgs + splitChar + resultCode + splitChar + respArgs;
        this.showLog(LogManager.getIlogger(), logLevel, logMsg);
    }

    /**
     * 打印日志<br/>
     * @param type 日志的类型
     * @param msg 日志的内容
     */
    private void showLog(Logger logger, LOG_TYPE_E type, String msgString)
    {
        if (null != logger)
        {
            switch (type)
            {
                case LOG_DEBUG:
                    logger.debug(msgString);
                    break;
                case LOG_INFO:
                    logger.info(msgString);
                    break;
                case LOG_WARN:
                    logger.warn(msgString);
                    break;
                case LOG_ERROR:
                    logger.error(msgString);
                default:
                    ;
            }
        }
    }

    /**
     * 打印日志<br/>
     * @param type 日志的类型
     * @param msg 日志的内容
     */
    public void showLog(LOG_TYPE_E type, String msgString)
    {
        if (null != gLogListener)
        {
            switch (type)
            {
                case LOG_DEBUG:
                    gLogListener.debug(msgString);
                    break;
                case LOG_INFO:
                    gLogListener.info(msgString);
                    break;
                case LOG_WARN:
                    gLogListener.warn(msgString);
                    break;
                case LOG_ERROR:
                    gLogListener.error(msgString);
                    break;
                default:;
            }
        }
    }
    
    /**
     * 显示堆栈信息
     * @param e ApiException
     */
    public void showStackTrace(ApiException e)
    {
        if (null != gLogListener)
        {
            String msgString = String.format("the stackTrace is:%n%s", LogHelper.getLogHelperInstance()
                .getStackTrace(e));
            gLogListener.error(msgString);
        }
    }

    public void showInterfaceLog(LOG_TYPE_E logLevel, int iType, String iName, String destIP,
        Map<Object, Object> properties)
    {
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.putAll(properties);
        if (map.keySet().contains("PASSWORD"))
        {
            map.put("PASSWORD", "******");
        }
        showInterfaceLog(logLevel, "Storage", iType, "Rest", iName, null, destIP, null,
            LogHelper.format(System.currentTimeMillis()), null, map.toString(), null, null);
    }

    /**
     * 设置日志的监听
     * @param logListener 日志的监听实现类
     */
    public static void setLogListener(LogListener logListener)
    {
        gLogListener = logListener;
    }

    public void showInterfaceLog(LOG_TYPE_E logLevel, int iType, String iName, String destIP,
        JSONObject properties)
    {
        String pwd = null;
        try
        {
            pwd = properties.getString("password");
            properties.put("password", "******");
            showInterfaceLog(logLevel, "Storage", iType, "Rest", iName, null, destIP, null,
                LogHelper.format(System.currentTimeMillis()), null, properties.toString(), null, null);
            properties.put("password", pwd);
        }
        catch (JSONException e)
        {
            try
            {
                pwd = properties.getString("PASSWORD");
                properties.put("PASSWORD", "......");
                showInterfaceLog(logLevel, "Storage", iType, "Rest", iName, null, destIP, null,
                    LogHelper.format(System.currentTimeMillis()), null, properties.toString(), null, null);
                properties.put("PASSWORD", pwd);
            }
            catch (JSONException e1)
            {
                showInterfaceLog(logLevel, "Storage", iType, "Rest", iName, null, destIP, null,
                    LogHelper.format(System.currentTimeMillis()), null, properties.toString(), null, null);
            }
        }

    }

    /**
     * 上传日志的服务
     */
    private static LogFileUploadTask upLoadTask = null;
    
    /** 创建日志工具时，开始上传 */
    public static void startUploadTask()
    {
        if(null == upLoadTask)// 线程未开启
        {
            upLoadTask = new LogFileUploadTask();
            Thread t = new Thread(upLoadTask);
            t.setDaemon(true);
            t.start();
        }
        else if(upLoadTask.isStop())// 线程已经关闭
        {
            upLoadTask = new LogFileUploadTask();// 再开启一个线程,替换掉原来线程
            Thread t = new Thread(upLoadTask);
            t.setDaemon(true);
            t.start();
        }
        // 线程已经创建，并且未停止的不处理
        isStop = false;
    }

    /** 关闭日志上传服务 */
    public static void stopUploadTask()
    {
        isStop = true;
        if(null != upLoadTask)// 防止误操作
            upLoadTask.setStop(isStop);
    }

    /** 日志对象销毁则停止上传 */
    @Override
    protected void finalize() throws Throwable
    {
        stopUploadTask();// 当前对象销毁则关闭上传进程
        super.finalize();
    }

    public static String getUploadUrl()
    {
        return uploadUrl;
    }

    public static void setUploadUrl(String uploadUrl)
    {
        LogUtil.uploadUrl = uploadUrl;
    }

    public String getILoggerPath()
    {
        return iLoggerFolder;
    }

    public String getOLoggerPath()
    {
        return oLoggerFolder;
    }

    public String getRLoggerPath()
    {
        return rLoggerFolder;
    }
}
/**
 * 通过静态方法提供接口日志，必须在配置Log4J之后才能使用该类
 * 如果直接将logger作为LogUtil静态变量，可能会引起logger在设置路径前，先被初始化
 * 如果直接将logger作为LogUtil实例变量，有会被fortify检查出问题
 * @author zWX228053
 */
class LogManager
{
    public static final String INTERFACE_LOGER = "com.huawei.openapi.interfaceLogger";// 配置文件中对应的loger名称

    public static final String RUNNING_LOGER = "com.huawei.openapi.runningLogger";// 配置文件中对应的loger名称

    public static final String OPERATION_LOGER = "com.huawei.openapi.operationLogger";// 配置文件中对应的loger名称

    private static final Logger iLogger = Logger.getLogger(INTERFACE_LOGER);// 接口日志

    private static final Logger rLogger = Logger.getLogger(RUNNING_LOGER);// 运行日志

    private static final Logger oLogger = Logger.getLogger(OPERATION_LOGER);// 操作日志

    public static Logger getIlogger()
    {
        return iLogger;
    }

    public static Logger getRlogger()
    {
        return rLogger;
    }

    public static Logger getOlogger()
    {
        return oLogger;
    }
    
}