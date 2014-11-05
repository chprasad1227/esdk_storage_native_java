package com.huawei.ism.openapi.nas.cifsshare;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.CIFSSHARE;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * CIFS共享的迭代器
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class CIFSShareIterator extends ApiIterator<CIFSShareMO, CIFSShareQuery>
{
    private static final String[] CIFSSHAREFILTER =
    {CIFSSHARE.SHAREPATH, CIFSSHARE.DESCRIPTION};

    /**
     * CIFS共享迭代器
     * @param restRequestHandler rest请求
     * @param deviceID 网元ID
     * @param qCondition 请求条件
     */
    public CIFSShareIterator(RestRequestHandler restRequestHandler, String deviceID, CIFSShareQuery qCondition)
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
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "SNAS_CIFS_SHARE", "count");
        Map<String, String> headParamMap = composeRequestHeader(false);

        RestManager<CIFSShareMO> restManager = new RestManager<CIFSShareMO>(CIFSShareMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        CIFSShareMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }

    /**
     * 获取具体MO批量查询的结果
     * @return 具体模块批量查询的数据
     * @throws ApiException 异常
     */
    @Override
    protected List<CIFSShareMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "SNAS_CIFS_SHARE");
        Map<String, String> headParamMap = composeRequestHeader(true);

        RestManager<CIFSShareMO> restManager = new RestManager<CIFSShareMO>(CIFSShareMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        List<CIFSShareMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取存放具体属性的map
     * @param modelMo 模块数据对象
     * @return 存放具体属性的Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(CIFSShareMO modelMo)
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
        return CIFSSHAREFILTER;
    }

    @Override
    protected String[] getFuzzyFilterHeaders()
    {
        return new String[0];
    }

}
