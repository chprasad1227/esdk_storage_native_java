package com.huawei.ism.openapi.nas.nfsshare;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.NFSSHARE;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * NFS共享批量查询返回的迭代器
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class NFSShareIterator extends ApiIterator<NFSShareMO, NFSShareQuery>
{
    private static final String[] NFSSHAREFILTER =
    {NFSSHARE.DESCRIPTION};

    /**
     * NFS共享迭代器
     * @param restRequestHandler rest请求
     * @param deviceID 网元ID
     * @param qCondition 请求条件
     */
    public NFSShareIterator(RestRequestHandler restRequestHandler, String deviceID, NFSShareQuery qCondition)
    {
        super(restRequestHandler, deviceID, qCondition, false);
    }

    /**
     * 获取对应MO的数量
     * @return 具体模块数据的数量
     * @throws ApiException 异常
     */
    @Override
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "NFSHARE",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);

        RestManager<NFSShareMO> restManager = new RestManager<NFSShareMO>(NFSShareMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        NFSShareMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }

    /**
     * 获取具体MO批量查询的结果
     * @return 具体模块批量查询的数据
     * @throws ApiException 异常
     */
    @Override
    protected List<NFSShareMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "NFSHARE");
        Map<String, String> headParamMap = composeRequestHeader(true);

        RestManager<NFSShareMO> restManager = new RestManager<NFSShareMO>(NFSShareMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        List<NFSShareMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取存放具体属性的map
     * @param modelMo 模块数据对象
     * @return 存放具体属性的Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(NFSShareMO modelMo)
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
        return NFSSHAREFILTER;
    }

}
