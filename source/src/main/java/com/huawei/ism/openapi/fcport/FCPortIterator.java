package com.huawei.ism.openapi.fcport;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.FCPort;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * FC端口批量查询迭代器
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class FCPortIterator extends ApiIterator<FCPortMO, FCPortQuery>
{
    private static final String[] fcPortFuzzyFilter =
    {FCPort.ID};

    /**
     * FCPortIterator
     * @param restRequestHandler REST请求
     * @param deviceID 设备ID
     * @param queryCondition 查询条件
     */
    protected FCPortIterator(RestRequestHandler restRequestHandler, String deviceID, FCPortQuery queryCondition)
    {
        super(restRequestHandler, deviceID, queryCondition, false);
    }

    /**
     * 获取具体MO批量查询的结果
     * @return 返回结果
     * @throws ApiException 异常
     */
    protected List<FCPortMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_port");
        Map<String, String> headParamMap = composeRequestHeader(true);
        headParamMap.put("TYPE", String.valueOf(MOType.FC_PORT.getValue()));

        RestManager<FCPortMO> restManager = new RestManager<FCPortMO>(FCPortMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        List<FCPortMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取对应MO的数量
     * @return long
     * @throws ApiException API异常
     */
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_port",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);
        headParamMap.put("TYPE", String.valueOf(MOType.FC_PORT.getValue()));

        RestManager<FCPortMO> restManager = new RestManager<FCPortMO>(FCPortMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        FCPortMO resPonsemo = restManager.getGetRequestMO();
        return Long.valueOf((String) resPonsemo.getMO().getProperty(FCPort.COUNT));
    }

    /**
     * 获取FCPort 属性Map
     * @param modelMo FCPort 数据对象
     * @return FCPort 属性Map
     */
    protected Map<Object, Object> getConcretMoMap(FCPortMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
    }

    /**
     * 获取FCPORT批量查询条件数组
     * @return FCPORT批量查询条件数组
     */
    protected String[] getConcretFilterHeaders()
    {
        return new String[0];
    }

    @Override
    protected String[] getFuzzyFilterHeaders()
    {
        return fcPortFuzzyFilter;
    }
}
