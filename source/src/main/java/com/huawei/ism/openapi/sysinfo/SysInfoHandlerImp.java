package com.huawei.ism.openapi.sysinfo;

import java.util.HashMap;
import java.util.Map;
import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.SysStatusE;
import com.huawei.ism.openapi.common.keydeifines.TLV.SYSTEM;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 系统信息对外开放接口的实现类
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class SysInfoHandlerImp extends DefaultCommHandler implements SysInfoHandler
{
    /**
     * 系统信息接口实现类构造函数
     * @param restRequestHandler rest请求
     * @param deviceID 网元id
     */
    protected SysInfoHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 获取系统的基本信息
     * @return 系统信息类
     * @throws ApiException API自定义异常
     */
    public SystemMO systemGet() throws ApiException
    {
        SystemMO systemMO = getSysBaseInfo();
        SysStatusE sysStatus = getSystemStatus();
        systemMO.setSystemStatus(sysStatus);
        long sysTime = getSysUtcTime();
        systemMO.setCmoSysUtcTime(sysTime);
        return systemMO;
    }

    /**
     * 设备重启
     * @throws ApiException API自定义异常
     */
    public void reboot() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "SYSTEM",
            "REBOOT");
        RestManager<SystemMO> restManager = new RestManager<SystemMO>(SystemMO.class, getRestRequestHandler(),
            relativePath, null, null);
        restManager.getPutRequestMO();
    }

    /**
     * 设备下电
     * @throws ApiException API自定义异常
     */
    public void poweroff() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "SYSTEM",
            "POWEROFF");
        RestManager<SystemMO> restManager = new RestManager<SystemMO>(SystemMO.class, getRestRequestHandler(),
            relativePath, null, null);
        restManager.getPutRequestMO();
    }

    /**
     * 设备强制重启
     * @throws ApiException API自定义异常
     */
    public void forceReboot() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "SYSTEM",
            "FORCE_REBOOT");
        RestManager<SystemMO> restManager = new RestManager<SystemMO>(SystemMO.class, getRestRequestHandler(),
            relativePath, null, null);
        restManager.getPutRequestMO();
    }

    /**
     * 获取系统的基本信息
     * @return
     */
    private SystemMO getSysBaseInfo() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "system/");
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(SYSTEM.TYPE, String.valueOf(MOType.SYSTEM.getValue()));

        RestManager<SystemMO> restManager = new RestManager<SystemMO>(SystemMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        SystemMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo;
    }

    /**
     * 获取系统的状态
     * @return
     */
    private SysStatusE getSystemStatus() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "server",
            "status");
        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<SystemMO> restManager = new RestManager<SystemMO>(SystemMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        SystemMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.ptotectedGetSystemStatus();
    }

    /**
     * 获取系统UTC时间
     * @return
     */
    private long getSysUtcTime() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "system_utc_time");
        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<SystemMO> restManager = new RestManager<SystemMO>(SystemMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        SystemMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.protectedGetCmoSysUtcTime();
    }
}
