package com.huawei.ism.openapi.common.exception;

/**
 * API异常
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class ApiException extends Exception
{
    /**
     * Api抛出的公共错误类
     * 
     * @author : auto create
     * @version [版本号V001R010C00]
     */
    private static final long serialVersionUID = -1041241007791942503L;

    private ApiMessage msg;

    private Exception exception;

    /**
     * Api错误类构造函数
     * 
     * @param msg 错误信息
     */
    public ApiException(ApiMessage msg)
    {
        super(msg.getErrorDescription());
        this.msg = msg;
    }

    /**
     * Api错误类构造函数
     * 
     * @param msg 错误信息
     * @param e 错误
     */
    public ApiException(ApiMessage msg, Exception e)
    {
        super(msg.getErrorDescription());
        this.msg = msg;
        this.exception = e;
    }

    /**
     * 获取异常信息
     * @return 异常信息
     */
    public ApiMessage getErrMessage()
    {
        return msg;
    }

    /**
     * 设置异常信息
     * @param exception 异常信息
     */
    public void setException(Exception exception)
    {
        this.exception = exception;
    }

    /**
     * 获取异常信息
     * @return Exception
     */
    public Exception getException()
    {
        return exception;
    }
}
