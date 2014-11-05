package com.huawei.ism.openapi.fcinitiator;

import java.util.List;
import java.util.Map;
import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.FCInitiator;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * FC启动器批量查询迭代器
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class FcInitiatorIterator extends ApiIterator<FcInitiatorMO, FcInitiatorQuery>
{
    /**
     * 批量查询可选过滤条件
     */
    private static final String[] fuzzyFilter =
    {FCInitiator.ID, FCInitiator.NAME};

    /**
     * Fc启动器迭代器
     * @param restRequestHandler REST请求
     * @param deviceID 设备ID
     * @param queryCondition 查询条件
     */
    protected FcInitiatorIterator(RestRequestHandler restRequestHandler, String deviceID,
        FcInitiatorQuery queryCondition, boolean isAssociate)
    {
        super(restRequestHandler, deviceID, queryCondition, isAssociate);
    }

    /**
     * 获取具体MO批量查询的结果
     * @return List<FcInitiatorMO>
     * @throws ApiException API异常
     */
    protected List<FcInitiatorMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_initiator");
        Map<String, String> headParamMap = composeRequestHeader(true);
        headParamMap.put("TYPE", String.valueOf(MOType.FC_INITIATOR.getValue()));

        RestManager<FcInitiatorMO> restManager = new RestManager<FcInitiatorMO>(FcInitiatorMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        List<FcInitiatorMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取对应MO的数量
     * @return long
     * @throws ApiException API异常
     */
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_initiator",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);
        headParamMap.put("TYPE", String.valueOf(MOType.FC_INITIATOR.getValue()));

        RestManager<FcInitiatorMO> restManager = new RestManager<FcInitiatorMO>(FcInitiatorMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        FcInitiatorMO fcInitiatorMO = restManager.getGetRequestMO();
        return Long.valueOf((String) fcInitiatorMO.getMO().getProperty(FCInitiator.COUNT));
    }

    /**
     * 获取FcInitiator属性Map
     * @param modelMo FcInitiator 数据对象
     * @return FcInitiator属性Map
     */
    protected Map<Object, Object> getConcretMoMap(FcInitiatorMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
    }

    /**
     * 获取FCINITIATOR批量查询条件数组
     * @return FCINITIATOR批量查询条件数组
     */
    protected String[] getConcretFilterHeaders()
    {
        return new String[0];
    }

    @Override
    protected String[] getFuzzyFilterHeaders()
    {
        return fuzzyFilter;
    }

}
