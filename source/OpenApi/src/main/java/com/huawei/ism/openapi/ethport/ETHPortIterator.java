package com.huawei.ism.openapi.ethport;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.ETHPort;
import com.huawei.ism.openapi.common.keydeifines.TLV.ISCSIInitiator;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * eth端口迭代器
 * @author gWX183785
 * @version V100R001C10
 */
public class ETHPortIterator extends ApiIterator<ETHPortMO, ETHPortQuery>
{
    private static final String[] ethPortFuzzyFilter =
    {ETHPort.ID};

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     * @param queryCondition 查询条件
     */
    public ETHPortIterator(RestRequestHandler restRequestHandler, String deviceID, ETHPortQuery queryCondition)
    {
        super(restRequestHandler, deviceID, queryCondition, false);
    }

    /**
     * 查询数量
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    protected long getConcretCount() throws ApiException
    {

        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "eth_port",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);
        headParamMap.put(ISCSIInitiator.TYPE, String.valueOf(MOType.ETH_PORT.getValue()));
        RestManager<ETHPortMO> restManager = new RestManager<ETHPortMO>(ETHPortMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        ETHPortMO ethPortMO = restManager.getGetRequestMO();
        return Long.valueOf((String) ethPortMO.getMO().getProperty(ETHPort.COUNT));
    }

    /**
     * 批量查询
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    protected List<ETHPortMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "eth_port");
        Map<String, String> headParamMap = composeRequestHeader(true);
        headParamMap.put(ETHPort.TYPE, String.valueOf(MOType.ETH_PORT.getValue()));
        RestManager<ETHPortMO> restManager = new RestManager<ETHPortMO>(ETHPortMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        return restManager.getGetRequestMOList();
    }

    /**
     * 获取ETHPort 属性Map
     * @param modelMo ETHPort数据对象
     * @return ETHPort 属性Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(ETHPortMO modelMo)
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
        return ethPortFuzzyFilter;
    }

}
