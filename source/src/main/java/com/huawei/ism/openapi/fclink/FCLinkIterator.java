package com.huawei.ism.openapi.fclink;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.FCLink;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

public class FCLinkIterator extends ApiIterator<FCLinkMO, FCLinkQuery>
{
    private static final String[] preciseFilter =
    {FCLink.HEALTHSTATUS, FCLink.RUNNINGSTATUS};

    private static final String[] fuzzyFilter =
    {FCLink.ID};

    /**
     * FC链路迭代器
     * @param restRequestHandler REST请求
     * @param deviceID 设备ID
     * @param queryCondition 查询条件
     */
    protected FCLinkIterator(RestRequestHandler restRequestHandler, String deviceID, FCLinkQuery queryCondition,
        boolean isAssociate)
    {
        super(restRequestHandler, deviceID, queryCondition, false);
    }

    /**
     * 获取具体MO批量查询的结果
     * @return List<FCLinkMO>
     * @throws ApiException API异常
     */
    protected List<FCLinkMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_link");
        Map<String, String> headParamMap = composeRequestHeader(true);

        RestManager<FCLinkMO> restManager = new RestManager<FCLinkMO>(FCLinkMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        List<FCLinkMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取对应MO的数量
     * @return long
     * @throws ApiException API异常
     */
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_link",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);

        RestManager<FCLinkMO> restManager = new RestManager<FCLinkMO>(FCLinkMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        FCLinkMO FCLinkMO = restManager.getGetRequestMO();
        return Long.valueOf((String) FCLinkMO.getMO().getProperty(FCLink.COUNT));
    }

    /**
     * 获取FCLink属性Map
     * @param modelMo FCLink 数据对象
     * @return FCLink属性Map
     */
    protected Map<Object, Object> getConcretMoMap(FCLinkMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
    }

    /**
     * 获取FCLink批量查询条件数组
     * @return FCLink批量查询条件数组
     */
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
