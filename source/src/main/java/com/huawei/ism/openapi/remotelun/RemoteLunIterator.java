package com.huawei.ism.openapi.remotelun;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.RemoteLun;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

public class RemoteLunIterator extends ApiIterator<RemoteLunMO, RemoteLunQuery>
{
    private static final String[] preciseFilter =
    {RemoteLun.HEALTHSTATUS, RemoteLun.CAPACITYBYTE};

    private static final String[] fuzzyFilter =
    {RemoteLun.ID, RemoteLun.NAME};

    /**
     * RemoteLun自定义迭代器
     * @param restRequestHandler rest请求
     * @param deviceID 网元id
     * @param queryCondition 请求条件
     */
    protected RemoteLunIterator(RestRequestHandler restRequestHandler, String deviceID, RemoteLunQuery queryCondition)
    {
        super(restRequestHandler, deviceID, queryCondition, false);
    }

    /**
     * 获取具体MO批量查询的结果
     * @return List<RemoteLunMO>
     * @throws ApiException API自定义异常
     */
    protected List<RemoteLunMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "REMOTE_LUN");
        Map<String, String> headParamMap = composeRequestHeader(true);
        // composeHeadParamMap(headParamMap);
        RestManager<RemoteLunMO> restManager = new RestManager<RemoteLunMO>(RemoteLunMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        List<RemoteLunMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取对应MO的数量
     * @return long
     * @throws ApiException API异常
     */
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "REMOTE_LUN",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);
        // composeHeadParamMap(headParamMap);
        RestManager<RemoteLunMO> restManager = new RestManager<RemoteLunMO>(RemoteLunMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        RemoteLunMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }

    /**
     * 获取RemoteLunMo的属性Map
     * @param modelMo RemoteLun数据模块
     * @return RemoteLunMo的属性 Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(RemoteLunMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
    }

    /**
     * 获取RemoteLun批量查询条件数组
     * @return RemoteLun批量查询条件数组
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
