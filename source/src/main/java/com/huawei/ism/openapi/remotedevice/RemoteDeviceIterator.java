package com.huawei.ism.openapi.remotedevice;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.RemoteDevice;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

public class RemoteDeviceIterator extends ApiIterator<RemoteDeviceMO, RemoteDeviceQuery>
{
    private static final String[] preciseFilter =
    {RemoteDevice.HEALTHSTATUS, RemoteDevice.RUNNINGSTATUS};

    private static final String[] fuzzyFilter =
    {RemoteDevice.ID, RemoteDevice.NAME};

    /**
     * RemoteDevice自定义迭代器
     * @param restRequestHandler rest请求
     * @param deviceID 网元id
     * @param queryCondition 请求条件
     */
    protected RemoteDeviceIterator(RestRequestHandler restRequestHandler, String deviceID,
        RemoteDeviceQuery queryCondition)
    {
        super(restRequestHandler, deviceID, queryCondition, false);
    }

    /**
     * 获取具体MO批量查询的结果
     * @return List<RemoteDeviceMO>
     * @throws ApiException API自定义异常
     */
    protected List<RemoteDeviceMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "remote_device");
        Map<String, String> headParamMap = composeRequestHeader(true);
        headParamMap.put("TYPE", String.valueOf(MOType.REMOTE_DEVICE.getValue()));

        RestManager<RemoteDeviceMO> restManager = new RestManager<RemoteDeviceMO>(RemoteDeviceMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        List<RemoteDeviceMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取对应MO的数量
     * @return long
     * @throws ApiException API异常
     */
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "remote_device",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);
        headParamMap.put("TYPE", String.valueOf(MOType.REMOTE_DEVICE.getValue()));

        RestManager<RemoteDeviceMO> restManager = new RestManager<RemoteDeviceMO>(RemoteDeviceMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        RemoteDeviceMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }

    /**
     * 获取RemoteDeviceMo的属性Map
     * @param modelMo RemoteDevice数据模块
     * @return RemoteDeviceMo的属性 Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(RemoteDeviceMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
    }

    /**
     * 获取RemoteDevice批量查询条件数组
     * @return RemoteDevice批量查询条件数组
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
