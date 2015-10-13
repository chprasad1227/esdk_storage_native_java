package com.huawei.ism.openapi.fcoeport;

import java.util.List;
import java.util.Map;
import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.FCoEPort;
import com.huawei.ism.openapi.common.keydeifines.TLV.ISCSIInitiator;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * fcoe端口迭代器
 * @author gWX183785
 * @version V100R001C10
 */
public class FCoEPortIterator extends ApiIterator<FCoEPortMO, FCoEPortQuery>
{
    private static final String[] fcoePortFuzzyFilter =
    {FCoEPort.ID};

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     * @param queryCondition 查询条件
     */
    public FCoEPortIterator(RestRequestHandler restRequestHandler, String deviceID, FCoEPortQuery queryCondition)
    {
        super(restRequestHandler, deviceID, queryCondition, false);
    }

    /**
     * 查询个数
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    protected long getConcretCount() throws ApiException
    {

        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "FCOE_PORT",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);
        headParamMap.put(ISCSIInitiator.TYPE, String.valueOf(MOType.FCOE_PORT.getValue()));
        RestManager<FCoEPortMO> restManager = new RestManager<FCoEPortMO>(FCoEPortMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        FCoEPortMO fcoePortMO = restManager.getGetRequestMO();
        return Long.valueOf((String) fcoePortMO.getMO().getProperty(FCoEPort.COUNT));
    }

    /**
     * 批量查询
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    protected List<FCoEPortMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "FCOE_PORT");
        Map<String, String> headParamMap = composeRequestHeader(true);
        headParamMap.put(FCoEPort.TYPE, String.valueOf(MOType.FCOE_PORT.getValue()));
        RestManager<FCoEPortMO> restManager = new RestManager<FCoEPortMO>(FCoEPortMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        return restManager.getGetRequestMOList();
    }

    /**
     * 获取FCoEPort属性Map
     * @param modelMo FCoEPort数据对象
     * @return FCoEPort属性Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(FCoEPortMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
    }

    /**
     * 获取批量查询的过滤头信息
     * @return 批量查询的过滤头
     */
    @Override
    protected String[] getConcretFilterHeaders()
    {
        return new String[0];
    }

    @Override
    protected String[] getFuzzyFilterHeaders()
    {
        return fcoePortFuzzyFilter;
    }

}
