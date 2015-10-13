package com.huawei.ism.openapi.common.logmanager;

/**
 * 日志的监听类
 * @author fWX183786
 * @version V100R001C10
 */
public interface LogListener
{
    /**
     * 打印info级别的日志 
     * @param message 日志的内容
     */
    void info(String message);
    
    /**
     * 打印error级别的日志 
     * @param message 日志的内容
     */
    void error(String message);
    
    /**
     * 打印debug级别的日志 
     * @param message 日志的内容
     */
    void debug(String message);
    
    /**
     * 打印warn级别的日志 
     * @param message 日志的内容
     */
    void warn(String message);
    
    /**
     * 打印fail级别的日志 
     * @param message 日志的内容
     */
    void fail(String message);
}
