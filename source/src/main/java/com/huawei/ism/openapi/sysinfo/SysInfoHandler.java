package com.huawei.ism.openapi.sysinfo;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 系统信息
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public interface SysInfoHandler
{
    /**
     * 获取系统的基本信息
     * @return 系统信息类
     * @throws ApiException API自定义异常
     */
    SystemMO systemGet() throws ApiException;

    /**
     * 设备重启
     * @throws ApiException API自定义异常
     */
    void reboot() throws ApiException;

    /**
     * 设备下电
     * @throws ApiException API自定义异常
     */
    void poweroff() throws ApiException;

    /**
     * 设备强制重启
     * @throws ApiException API自定义异常
     */
    void forceReboot() throws ApiException;
}
