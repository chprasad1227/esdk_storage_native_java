package com.huawei.ism.openapi.common.logmanager;

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

    private static final int TRACE_INDEX = 2; // 堆栈的索引

    private LogListener gLogListener = null;

    /**
     * 私有构造函数
     */
    private LogUtil()
    {

    }

    /**
     * 获取LogUtil单例
     * @return LogUtil实例
     */
    public static LogUtil getLogUtilInstance()
    {
        if (null == logUtilInstance)
        {
            logUtilInstance = new LogUtil();
        }
        return logUtilInstance;
    }

    /**
     * 打印日志
     * @param type 日志的类型
     * @param msg 日志的内容
     */
    public synchronized void showLog(LOG_TYPE_E type, String msg)
    {
        if (null != gLogListener)
        {
            String msgString = String.format("[%s] %s %s: %s", LogHelper.getLogHelperInstance().getCurTime(),
                type.name(), LogHelper.getLogHelperInstance().getFileLineMethod(TRACE_INDEX), msg);
            switch (type)
            {
                case LOG_INFO:
                    gLogListener.info(msgString);
                    break;
                case LOG_ERROR:
                    gLogListener.error(msgString);
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * 显示堆栈信息
     * @param e ApiException
     */
    public synchronized void showStackTrace(ApiException e)
    {
        if (null != gLogListener)
        {
            String msgString = String.format("the stackTrace is:%n%s", LogHelper.getLogHelperInstance()
                .getStackTrace(e));
            gLogListener.error(msgString);
        }
    }

    /**
     * 设置日志的监听
     * @param logListener 日志的监听实现类
     */
    public synchronized void setLogListener(LogListener logListener)
    {
        gLogListener = logListener;
    }

}
