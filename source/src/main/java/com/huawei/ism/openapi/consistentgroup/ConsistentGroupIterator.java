package com.huawei.ism.openapi.consistentgroup;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.CONSISTENTGROUP;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 远程复制迭代器
 * @author gWX183785
 * @version V100R001C10
 */
public class ConsistentGroupIterator extends ApiIterator<ConsistentGroupMO, ConsistentGroupQuery>
{
    /**
     * 批量查询可选过滤条件
     */
    private static final String[] preciseFilter =
    {CONSISTENTGROUP.HEALTHSTATUS, CONSISTENTGROUP.RUNNINGSTATUS, CONSISTENTGROUP.REPLICATIONMODEL,
            CONSISTENTGROUP.ISPRIMARY,};

    private static final String[] fuzzyFilter =
    {CONSISTENTGROUP.ID, CONSISTENTGROUP.NAME};

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     * @param queryCondition 查询条件
     */
    protected ConsistentGroupIterator(RestRequestHandler restRequestHandler, String deviceID,
        ConsistentGroupQuery queryCondition, boolean isAssociate)
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

        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "CONSISTENTGROUP", "count");
        Map<String, String> headParamMap = composeRequestHeader(false);
        headParamMap.put(CONSISTENTGROUP.TYPE, String.valueOf(MOType.CONSISTENTGROUP.getValue()));
        RestManager<ConsistentGroupMO> restManager = new RestManager<ConsistentGroupMO>(ConsistentGroupMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        ConsistentGroupMO CONSISTENTGROUPMO = restManager.getGetRequestMO();
        return Long.valueOf((String) CONSISTENTGROUPMO.getMO().getProperty(CONSISTENTGROUP.COUNT));
    }

    /**
     * 批量查询
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    protected List<ConsistentGroupMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "CONSISTENTGROUP");
        Map<String, String> headParamMap = composeRequestHeader(true);
        headParamMap.put(CONSISTENTGROUP.TYPE, String.valueOf(MOType.CONSISTENTGROUP.getValue()));
        RestManager<ConsistentGroupMO> restManager = new RestManager<ConsistentGroupMO>(ConsistentGroupMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        return restManager.getGetRequestMOList();
    }

    /**
     * 获取CONSISTENTGROUP 属性Map
     * @param modelMo CONSISTENTGROUP数据对象
     * @return 属性Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(ConsistentGroupMO modelMo)
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
        return preciseFilter;
    }

    @Override
    protected String[] getFuzzyFilterHeaders()
    {
        return fuzzyFilter;
    }

}
