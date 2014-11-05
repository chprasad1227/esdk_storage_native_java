package com.huawei.ism.openapi.common;

import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;

/**
 * 模块的公共属性类
 * @author fWX183786
 * @version V100R001C10
 */

public class DefaultCommHandler
{
    private final RestRequestHandler restRequestHandler;

    private final String deviceID;

    /**
     * 构造函数
     * @param restRequestHandler rest请求处理类
     * @param deviceID 设备ID
     */
    protected DefaultCommHandler(final RestRequestHandler restRequestHandler, final String deviceID)
    {
        this.restRequestHandler = restRequestHandler;
        this.deviceID = deviceID;
    }

    /**
     * 获取异常处理类
     * @return 异常处理类
     */
    protected RestRequestHandler getRestRequestHandler()
    {
        return restRequestHandler;
    }

    /**
     * 获取设备ID
     * @return 设备ID
     */
    protected String getDeviceId()
    {
        return deviceID;
    }

}
