package com.huawei.ism.openapi.common.exception;

import java.io.Serializable;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine;

/**
 * OpenApi错误信息
 * @author fWX183786
 * @version V100R001C10
 */
public class ApiMessage implements Serializable
{
    private static final long serialVersionUID = 1L;

    private long errCode = ConstantsDefine.HttpErrorConstant.OK;

    private String errDescription;

    private String errSuggestion;

    
    
    /**
     * 构造函数
     * @param errCode 错误代码
     * @param errDescription 错误描述
     * @param errSuggestion 修复建议
     */
    public ApiMessage(long errCode, String errDescription, String errSuggestion)
    {
        this.errCode = errCode;
        this.errDescription = errDescription;
        this.errSuggestion = errSuggestion;
    }

    /**
     * 获取错误代码
     * @return 错误代码
     */
    public long getErrorCode()
    {
        return errCode;
    }

    /**
     * 设置错误描述
     * @param errDescription 错误描述
     */
    public void setErrDescription(String errDescription)
    {
        this.errDescription = errDescription;
    }

    /**
     * 获取错误描述
     * @return 错误描述
     */
    public String getErrorDescription()
    {
        return errDescription;
    }

    /**
     * 设置错误修复建议
     * @param errSuggestion 错误修复建议
     */
    public void setErrSuggestion(String errSuggestion)
    {
        this.errSuggestion = errSuggestion;
    }

    /**
     * 获取错误修复建议
     * @return 错误修复建议
     */
    public String getErrorSuggestion()
    {
        return errSuggestion;
    }

}
