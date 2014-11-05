package com.huawei.ism.openapi.fcinitiator.system.systime;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 系统时间的实现类
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class SystemTimeHandlerImpl extends DefaultCommHandler implements SystemTimeHandler
{
    /**
     * 系统时间构造函数
     * @param restRequestHandler rest请求
     * @param deviceID 网元id
     */
    protected SystemTimeHandlerImpl(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 获取系统时间
     * @return SystemTimeMO
     * @throws ApiException API自定义异常
     */
    public SystemTimeMO getSystemTime() throws ApiException
    {

        SystemTimeMO systemTimeMO = getSystemTimeZone();

        return systemTimeMO;
    }

    private SystemTimeMO getSystemTimeZone() throws ApiException
    {
        // url
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "system_timezone");

        RestManager<SystemTimeMO> restManager = new RestManager<SystemTimeMO>(SystemTimeMO.class,
            getRestRequestHandler(), realitivePath, null, null);

        SystemTimeMO resMo = restManager.getGetRequestMO();

        return resMo;
    }
}
