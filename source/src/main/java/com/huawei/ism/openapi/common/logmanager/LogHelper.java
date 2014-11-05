package com.huawei.ism.openapi.common.logmanager;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.huawei.ism.openapi.common.exception.ApiException;

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
}
