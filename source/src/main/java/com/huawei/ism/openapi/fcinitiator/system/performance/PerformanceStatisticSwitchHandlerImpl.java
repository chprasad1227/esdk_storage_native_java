package com.huawei.ism.openapi.fcinitiator.system.performance;

import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.TLV.PerformanceStatisticSwitch;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 性能统计开关的实现类
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class PerformanceStatisticSwitchHandlerImpl extends DefaultCommHandler implements
    PerformanceStatisticSwitchHandler
{
    /**
     * 系能统计开关构造函数
     * @param restRequestHandler rest请求
     * @param deviceID 网元id
     */
    protected PerformanceStatisticSwitchHandlerImpl(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 获取性能统计开关信息
     * @return 性能统计开关bean
     * @throws ApiException API自定义异常
     */
    public PerformanceStatisticSwitchMO getPerformanceSwitch() throws ApiException
    {
        // url
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "performace_statistic_switch");

        RestManager<PerformanceStatisticSwitchMO> restManager = new RestManager<PerformanceStatisticSwitchMO>(
            PerformanceStatisticSwitchMO.class, getRestRequestHandler(), realitivePath, null, null);

        PerformanceStatisticSwitchMO resMo = restManager.getGetRequestMO();

        return resMo;
    }

    /**
     * 设置性能统计开关
     * @param mo 性能统计开关bean
     * @throws ApiException API自定义异常
     */
    public void setPerformanceSwitch(PerformanceStatisticSwitchMO mo) throws ApiException
    {
        // url
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "performace_statistic_switch");

        JSONObject requestBody = new JSONObject();

        try
        {
            if (null != mo)
            {
                requestBody.put(PerformanceStatisticSwitch.CMO_PERFORMANCE_SWITCH, mo.getCmoPerformanceSwitch());

                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<PerformanceStatisticSwitchMO> restManager = new RestManager<PerformanceStatisticSwitchMO>(
            PerformanceStatisticSwitchMO.class, getRestRequestHandler(), realitivePath, null, requestBody);
        restManager.getPutRequestMO();

    }

}
