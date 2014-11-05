package com.huawei.ism.openapi.manager;

import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;

/**
 * 内部使用的获取rest请求的类
 * @author fWX183786
 * @version V100R001C10
 */
public class PrivateRestHandlerManager
{
    private DeviceManager deviceManager;

    /**
     * 构造函数
     * @param manager 设备管理类
     */
    public PrivateRestHandlerManager(DeviceManager manager)
    {
        deviceManager = manager;
    }

    /**
     * 设置设备管理类
     * @param manager 设备管理类
     */
    public void setDeviceManager(DeviceManager manager)
    {
        deviceManager = manager;
    }

    /**
     * 获取rest请求处理类
     * @return rest请求处理类
     */
    public RestRequestHandler getRestHandler()
    {
        if (null != deviceManager)
        {
            return deviceManager.getRestRequestHandler();
        }
        return null;
    }
}
