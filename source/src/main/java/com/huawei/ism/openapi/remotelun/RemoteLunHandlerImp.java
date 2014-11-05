package com.huawei.ism.openapi.remotelun;

import java.util.HashMap;
import java.util.Map;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
import com.huawei.ism.openapi.remotedevice.RemoteDeviceMO;

public class RemoteLunHandlerImp extends DefaultCommHandler implements RemoteLunHandler
{
    RemoteLunIterator remoteLunIterator = null;

    protected RemoteLunHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    @Override
    public RemoteLunIterator getBatch(RemoteLunQuery condition) throws ApiException
    {
        // 根据DeviceID查询远端设备是否本厂商，并赋值
        queryAndSetArrayType(condition);
        if (null == remoteLunIterator)
        {
            remoteLunIterator = new RemoteLunIterator(getRestRequestHandler(), getDeviceId(), condition);
        }
        return remoteLunIterator;
    }

    @Override
    public Long getCount(RemoteLunMO mo) throws ApiException
    {
        // 根据DeviceID查询远端设备是否本厂商，并赋值
        RemoteLunQuery condition = new RemoteLunQuery(mo, 0, 100);
        queryAndSetArrayType(condition);
        // 调用迭代器中的查询数量方法
        RemoteLunIterator iterator = new RemoteLunIterator(getRestRequestHandler(), getDeviceId(), condition);
        return iterator.getConcretCount();
    }

    private RemoteDeviceMO getRemoteDevice(String id) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "remote_device", id);
        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<RemoteDeviceMO> restManager = new RestManager<RemoteDeviceMO>(RemoteDeviceMO.class,
            getRestRequestHandler(), realitivePath, headParamMap, null);

        RemoteDeviceMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo;
    }

    private void queryAndSetArrayType(RemoteLunQuery condition) throws ApiException
    {
        // 根据DeviceID查询远端设备是否本厂商，并赋值
        if (null != condition)
        {
            RemoteLunMO remoteLunMO = condition.getRemoteLunMO();
            if (null != remoteLunMO)
            {
                String deviceId = remoteLunMO.getDeviceId();
                if (null != deviceId)
                {
                    RemoteDeviceMO remoteDeviceMO = getRemoteDevice(deviceId);
                    remoteLunMO.setArratType(remoteDeviceMO.getArrayType());
                    condition.setQueryRemoteLunMO(remoteLunMO);
                }
            }
        }
    }

}
