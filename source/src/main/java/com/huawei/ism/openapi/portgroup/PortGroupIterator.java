package com.huawei.ism.openapi.portgroup;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.PORTGROUP;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 端口组迭代器
 * @author gWX183785
 * @version V100R001C10
 */
public class PortGroupIterator extends ApiIterator<PortGroupMO, PortGroupQuery>
{
    /**
     * 批量查询可选过滤条件
     */
    private static final String[] fuzzyFilter =
    {PORTGROUP.ID, PORTGROUP.NAME};

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     * @param queryCondition 查询条件
     */
    public PortGroupIterator(RestRequestHandler restRequestHandler, String deviceID, PortGroupQuery queryCondition,
        boolean isAssociate)
    {
        super(restRequestHandler, deviceID, queryCondition, isAssociate);
    }

    /**
     * 当前数量
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    protected long getConcretCount() throws ApiException
    {

        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "portgroup",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);
        headParamMap.put(PORTGROUP.TYPE, String.valueOf(MOType.PORTGROUP.getValue()));
        RestManager<PortGroupMO> restManager = new RestManager<PortGroupMO>(PortGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        PortGroupMO portGroupMO = restManager.getGetRequestMO();
        return Long.valueOf((String) portGroupMO.getMO().getProperty(PORTGROUP.COUNT));
    }

    /**
     * 批量查询
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    protected List<PortGroupMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath;
        if (isAssociate)
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "portgroup",
                "associate", String.valueOf(MOType.FC_PORT));
        }
        else
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "portgroup");
        }
        Map<String, String> headParamMap = composeRequestHeader(true);
        headParamMap.put(PORTGROUP.TYPE, String.valueOf(MOType.PORTGROUP.getValue()));
        RestManager<PortGroupMO> restManager = new RestManager<PortGroupMO>(PortGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        return restManager.getGetRequestMOList();
    }

    /**
     * 获取端口组的属性Map
     * @param modelMo 端口组数据对象
     * @return 端口组的属性Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(PortGroupMO modelMo)
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
        return fuzzyFilter;
    }

}
