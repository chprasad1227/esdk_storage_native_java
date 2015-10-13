package com.huawei.ism.openapi.fcinitiator.system.systime;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 系统时间
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public interface SystemTimeHandler
{

    /**
     * 获取系统时间
     * @return SystemTimeMO
     * @throws ApiException API自定义异常
     */
    SystemTimeMO getSystemTime() throws ApiException;
}
