package com.huawei.ism.openapi.iscsilink;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.ISCSILink;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

public class ISCSILinkIterator extends ApiIterator<ISCSILinkMO, ISCSILinkQuery>
{
    private static final String[] preciseFilter =
    {ISCSILink.HEALTHSTATUS, ISCSILink.RUNNINGSTATUS};

    private static final String[] fuzzyFilter =
    {ISCSILink.ID};

    /**
     * ISCSI链路迭代器
     * @param restRequestHandler REST请求
     * @param deviceID 设备ID
     * @param queryCondition 查询条件
     */
    protected ISCSILinkIterator(RestRequestHandler restRequestHandler, String deviceID, ISCSILinkQuery queryCondition,
        boolean isAssociate)
    {
        super(restRequestHandler, deviceID, queryCondition, isAssociate);
    }

    /**
     * 获取具体MO批量查询的结果
     * @return List<ISCSILinkMO>
     * @throws ApiException API异常
     */
    protected List<ISCSILinkMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath;
        if (isAssociate)
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "iscsi_link",
                "associate");
        }
        else
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "iscsi_link");
        }
        Map<String, String> headParamMap = composeRequestHeader(true);
        headParamMap.put("TYPE", String.valueOf(MOType.ISCSI_LINK.getValue()));

        RestManager<ISCSILinkMO> restManager = new RestManager<ISCSILinkMO>(ISCSILinkMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        List<ISCSILinkMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取对应MO的数量
     * @return long
     * @throws ApiException API异常
     */
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "iscsi_link",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);
        headParamMap.put("TYPE", String.valueOf(MOType.ISCSI_LINK.getValue()));

        RestManager<ISCSILinkMO> restManager = new RestManager<ISCSILinkMO>(ISCSILinkMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        ISCSILinkMO iscsiLinkMO = restManager.getGetRequestMO();
        return Long.valueOf((String) iscsiLinkMO.getMO().getProperty(ISCSILink.COUNT));
    }

    /**
     * 获取ISCSILink属性Map
     * @param modelMo ISCSILink 数据对象
     * @return ISCSILink属性Map
     */
    protected Map<Object, Object> getConcretMoMap(ISCSILinkMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
    }

    /**
     * 获取ISCSILink批量查询条件数组
     * @return ISCSILink批量查询条件数组
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
