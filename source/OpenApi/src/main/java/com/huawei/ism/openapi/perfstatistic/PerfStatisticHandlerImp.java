package com.huawei.ism.openapi.perfstatistic;

import java.util.HashMap;
import java.util.Map;
import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.PerformanceStatistic;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 性能统计接口的实现类
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class PerfStatisticHandlerImp extends DefaultCommHandler implements PerfStatisticHandler
{
    /**
     * 性能统计接口
     * @param restRequestHandler rest请求
     * @param deviceID 网元id
     */
    protected PerfStatisticHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 获取当前性能值
     * @param mo 性能属性类
     * @return PerfStatisticMO
     * @throws ApiException API自定义异常
     */
    public PerfStatisticMO getCurStatisticDataMO(PerfStatisticMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "performace_statistic", "cur_statistic_data");
        Map<String, String> headParamMap = new HashMap<String, String>();

        // 添加查询的条件
        if (null != mo)
        {
            headParamMap.put(PerformanceStatistic.CMO_STATISTIC_UUID, mo.getUuId());
            Map<String, String> dstMap = OpenApiUtils.getOpenApiUtilsInstance().convertToStringMaps(
                mo.getMO().getProperties());
            headParamMap.putAll(dstMap);
        }

        RestManager<PerfStatisticMO> restManager = new RestManager<PerfStatisticMO>(PerfStatisticMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        PerfStatisticMO resPonseMo = restManager.getGetRequestMO();
        return resPonseMo;
    }

}
