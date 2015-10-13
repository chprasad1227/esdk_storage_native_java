package com.huawei.ism.openapi.iscsiinitiator;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.ISCSIInitiator;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * ISCSI启动器迭代器
 * @author gWX183785
 * @version V100R001C10
 */
public class ISCSIInitiatorIterator extends ApiIterator<ISCSIInitiatorMO, ISCSIInitiatorQuery>
{
    /**
     * 批量查询可选过滤条件
     */
    private static final String[] fuzzyFilter =
    {ISCSIInitiator.ID, ISCSIInitiator.NAME};

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     * @param queryCondition 查询条件
     */
    public ISCSIInitiatorIterator(RestRequestHandler restRequestHandler, String deviceID,
        ISCSIInitiatorQuery queryCondition)
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
            "iscsi_initiator", "count");
        Map<String, String> headParamMap = composeRequestHeader(false);
        headParamMap.put(ISCSIInitiator.TYPE, String.valueOf(MOType.ISCSI_INITIATOR.getValue()));
        RestManager<ISCSIInitiatorMO> restManager = new RestManager<ISCSIInitiatorMO>(ISCSIInitiatorMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        ISCSIInitiatorMO iscsiInitiatorMO = restManager.getGetRequestMO();
        return Long.valueOf((String) iscsiInitiatorMO.getMO().getProperty(ISCSIInitiator.COUNT));
    }

    /**
     * 批量查询
     * @return 返回 结果
     * @throws ApiException 异常
     */
    @Override
    protected List<ISCSIInitiatorMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "iscsi_initiator");
        Map<String, String> headParamMap = composeRequestHeader(true);
        headParamMap.put(ISCSIInitiator.TYPE, String.valueOf(MOType.ISCSI_INITIATOR.getValue()));
        RestManager<ISCSIInitiatorMO> restManager = new RestManager<ISCSIInitiatorMO>(ISCSIInitiatorMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        return restManager.getGetRequestMOList();
    }

    /**
     * 获取ISCSIInitiator 属性Map
     * @param modelMo ISCSIInitiator 数据对象
     * @return ISCSIInitiator 属性Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(ISCSIInitiatorMO modelMo)
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
        return fuzzyFilter;
    }

}
