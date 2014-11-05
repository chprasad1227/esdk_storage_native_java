package com.huawei.ism.openapi.hostgroup;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.HOSTGROUP;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 主机组迭代器
 * @author gWX183785
 * @version V100R001C10
 */
public class HostGroupIterator extends ApiIterator<HostGroupMO, HostGroupQuery>
{
    /**
     * 批量查询可选过滤条件 支持精确查询的参数
     */
    private static final String[] HOSTGROUPFILTER =
    {HOSTGROUP.ISADD2MAPPINGVIEW};

    /**
     * 批量查询可选过滤条件 支持模糊查询的参数
     */
    private static final String[] hostGroupFuzzyFilter =
    {HOSTGROUP.ID, HOSTGROUP.NAME};

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     * @param queryCondition 查询条件
     */
    protected HostGroupIterator(RestRequestHandler restRequestHandler, String deviceID, HostGroupQuery queryCondition,
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
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "hostgroup",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);
        headParamMap.put(HOSTGROUP.TYPE, String.valueOf(MOType.HOSTGROUP.getValue()));
        RestManager<HostGroupMO> restManager = new RestManager<HostGroupMO>(HostGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        HostGroupMO hostGroupMO = restManager.getGetRequestMO();
        return Long.valueOf((String) hostGroupMO.getMO().getProperty(HOSTGROUP.COUNT));
    }

    /**
     * 批量查询
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    protected List<HostGroupMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath;
        if (isAssociate)
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "hostgroup",
                "associate");
        }
        else
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "hostgroup");
        }
        Map<String, String> headParamMap = composeRequestHeader(true);
        headParamMap.put(HOSTGROUP.TYPE, String.valueOf(MOType.HOSTGROUP.getValue()));
        RestManager<HostGroupMO> restManager = new RestManager<HostGroupMO>(HostGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        return restManager.getGetRequestMOList();
    }

    /**
     * 获取HostGroup 属性Map
     * @param modelMo HostGroup数据对象
     * @return HostGroup 属性Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(HostGroupMO modelMo)
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
        return HOSTGROUPFILTER;
    }

    @Override
    protected String[] getFuzzyFilterHeaders()
    {
        return hostGroupFuzzyFilter;
    }

}
