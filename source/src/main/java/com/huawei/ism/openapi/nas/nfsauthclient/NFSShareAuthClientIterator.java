package com.huawei.ism.openapi.nas.nfsauthclient;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.NFSSHAREAUTHCLIENT;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * NFS共享权限控制迭代器
 * @author gWX183785
 * @version V100R001C10
 */
public class NFSShareAuthClientIterator extends ApiIterator<NFSShareAuthClientMO, NFSShareAuthClientQuery>
{
    /**
     * 批量查询可选过滤条件
     */
    private static final String[] NFSSHAREAUTHCLIENTFILTER =
    {NFSSHAREAUTHCLIENT.ID, NFSSHAREAUTHCLIENT.SHAREID, NFSSHAREAUTHCLIENT.ACCESSNAME};

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     * @param queryCondition 查询条件
     */
    public NFSShareAuthClientIterator(RestRequestHandler restRequestHandler, String deviceID,
        NFSShareAuthClientQuery queryCondition)
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
            "SNAS_NFS_SHARE_AUTH_CLIENT", "count");
        Map<String, String> headParamMap = composeRequestHeader(false);
        headParamMap.put(NFSSHAREAUTHCLIENT.TYPE, String.valueOf(MOType.SNAS_NFS_SHARE_AUTH_CLIENT.getValue()));
        RestManager<NFSShareAuthClientMO> restManager = new RestManager<NFSShareAuthClientMO>(
            NFSShareAuthClientMO.class, getRestRequestHandler(), relativePath, headParamMap, null);
        NFSShareAuthClientMO authClientMO = restManager.getGetRequestMO();
        return Long.valueOf((String) authClientMO.getMO().getProperty(NFSSHAREAUTHCLIENT.COUNT));
    }

    /**
     * 批量查询
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    protected List<NFSShareAuthClientMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "SNAS_NFS_SHARE_AUTH_CLIENT");
        Map<String, String> headParamMap = composeRequestHeader(true);
        headParamMap.put(NFSSHAREAUTHCLIENT.TYPE, String.valueOf(MOType.SNAS_NFS_SHARE_AUTH_CLIENT.getValue()));
        RestManager<NFSShareAuthClientMO> restManager = new RestManager<NFSShareAuthClientMO>(
            NFSShareAuthClientMO.class, getRestRequestHandler(), relativePath, headParamMap, null);
        return restManager.getGetRequestMOList();
    }

    /**
     * 获取NFS共享权限控制的属性Map
     * @param modelMo NFS共享权限控制数据对象
     * @return NFS共享权限控制的属性Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(NFSShareAuthClientMO modelMo)
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
        return NFSSHAREAUTHCLIENTFILTER;
    }

    @Override
    protected String[] getFuzzyFilterHeaders()
    {
        return new String[0];
    }

}
