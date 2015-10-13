package com.huawei.ism.openapi.nas.cifsauthclient;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.CIFSSHAREAUTHCLIENT;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * CIFS共享权限控制迭代器
 * @author gWX183785
 * @version V100R001C10
 */
public class CIFSShareAuthClientIterator extends ApiIterator<CIFSShareAuthClientMO, CIFSShareAuthClientQuery>
{
    // 模糊查询条件
    private static final String[] FUZZYFILTER =
    {CIFSSHAREAUTHCLIENT.NAME};
    
    // 精确查询条件
    private static final String[] FILTER =
    {CIFSSHAREAUTHCLIENT.PARENTID};

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     * @param queryCondition 查询条件
     */
    public CIFSShareAuthClientIterator(RestRequestHandler restRequestHandler, String deviceID,
        CIFSShareAuthClientQuery queryCondition)
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
            "CIFS_SHARE_AUTH_CLIENT", "count");// zwx228053 2014-11-17 修改参数
        Map<String, String> headParamMap = composeRequestHeader(false);
        headParamMap.put(CIFSSHAREAUTHCLIENT.TYPE, String.valueOf(MOType.SNAS_CIFS_SHARE_AUTH_CLIENT.getValue()));
        RestManager<CIFSShareAuthClientMO> restManager = new RestManager<CIFSShareAuthClientMO>(
            CIFSShareAuthClientMO.class, getRestRequestHandler(), relativePath, headParamMap, null);
        CIFSShareAuthClientMO authClientMO = restManager.getGetRequestMO();
        return Long.valueOf((String) authClientMO.getMO().getProperty(CIFSSHAREAUTHCLIENT.COUNT));
    }

    /**
     * 批量查询
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    protected List<CIFSShareAuthClientMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "CIFS_SHARE_AUTH_CLIENT");// zwx228053 2014-11-17 修改参数
        Map<String, String> headParamMap = composeRequestHeader(true);
        headParamMap.put(CIFSSHAREAUTHCLIENT.TYPE, String.valueOf(MOType.SNAS_CIFS_SHARE_AUTH_CLIENT.getValue()));
        RestManager<CIFSShareAuthClientMO> restManager = new RestManager<CIFSShareAuthClientMO>(
            CIFSShareAuthClientMO.class, getRestRequestHandler(), relativePath, headParamMap, null);
        return restManager.getGetRequestMOList();
    }

    /**
     * 获取CIFS共享权限控制的属性Map
     * @param modelMo CIFS共享权限控制数据对象
     * @return CIFS共享权限控制的属性Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(CIFSShareAuthClientMO modelMo)
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
        return FILTER;
    }

    @Override
    protected String[] getFuzzyFilterHeaders()
    {
        return FUZZYFILTER;
    }

}
