package com.huawei.ism.openapi.replicationpair;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.REPLICATIONPAIR;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 远程复制迭代器
 * @author gWX183785
 * @version V100R001C10
 */
public class ReplicationPairIterator extends ApiIterator<ReplicationPairMO, ReplicationPairQuery>
{
    /**
     * 批量查询可选过滤条件
     */
    private static final String[] REPLICATIONPAIRFILTER =
    {REPLICATIONPAIR.RUNNINGSTATUS, REPLICATIONPAIR.HEALTHSTATUS, REPLICATIONPAIR.ISPRIMARY,
            REPLICATIONPAIR.REPLICATIONMODEL};

    private static final String[] fuzzyFilter =
    {REPLICATIONPAIR.ID, REPLICATIONPAIR.LOCALRESNAME, REPLICATIONPAIR.LOCALRESID, REPLICATIONPAIR.REMOTERESID};

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     * @param queryCondition 查询条件
     */
    protected ReplicationPairIterator(RestRequestHandler restRequestHandler, String deviceID,
        ReplicationPairQuery queryCondition)
    {
        super(restRequestHandler, deviceID, queryCondition, false);
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
            "replicationpair", "count");
        Map<String, String> headParamMap = composeRequestHeader(false);
        headParamMap.put(REPLICATIONPAIR.TYPE, String.valueOf(MOType.REPLICATIONPAIR.getValue()));
        RestManager<ReplicationPairMO> restManager = new RestManager<ReplicationPairMO>(ReplicationPairMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        ReplicationPairMO replicationPairMO = restManager.getGetRequestMO();
        return Long.valueOf((String) replicationPairMO.getMO().getProperty(REPLICATIONPAIR.COUNT));
    }

    /**
     * 批量查询
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    protected List<ReplicationPairMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "replicationpair");
        Map<String, String> headParamMap = composeRequestHeader(true);
        headParamMap.put(REPLICATIONPAIR.TYPE, String.valueOf(MOType.REPLICATIONPAIR.getValue()));
        RestManager<ReplicationPairMO> restManager = new RestManager<ReplicationPairMO>(ReplicationPairMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        return restManager.getGetRequestMOList();
    }

    /**
     * 获取replicationpair 属性Map
     * @param modelMo replicationpair数据对象
     * @return 属性Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(ReplicationPairMO modelMo)
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
        return REPLICATIONPAIRFILTER;
    }

    @Override
    protected String[] getFuzzyFilterHeaders()
    {
        return fuzzyFilter;
    }

}
