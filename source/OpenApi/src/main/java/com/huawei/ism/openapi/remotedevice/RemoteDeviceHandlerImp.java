package com.huawei.ism.openapi.remotedevice;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.TLV.RemoteDevice;
import com.huawei.ism.openapi.common.keydeifines.TLV.RemoteDeviceBuilder;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

public class RemoteDeviceHandlerImp extends DefaultCommHandler implements RemoteDeviceHandler
{
    RemoteDeviceIterator remoteDeviceIterator = null;

    protected RemoteDeviceHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    @Override
    public RemoteDeviceMO createByFC(RemoteDeviceBuilderFCMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "remotedevice");

        JSONObject requestBody = new JSONObject();
        if (null != mo)
        {
            Map<Object, Object> properties = mo.getMO().getProperties();
            LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO, "the request params is " + properties.toString());
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                    "RemoteDeviceHandlerImp.createByFC()", null, properties.toString());// zwx228053
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
        }

        RestManager<RemoteDeviceMO> restManager = new RestManager<RemoteDeviceMO>(RemoteDeviceMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        RemoteDeviceMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    @Override
    public RemoteDeviceMO createByISCSI(RemoteDeviceBuilderISCSIMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "remotedevice");

        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(RemoteDeviceBuilder.ISCSILINKREMOTETCPPORT, 3260);
            requestBody.put(RemoteDeviceBuilder.ISCSILINKRECOVERYPOLICY, 1);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }
        if (null != mo)
        {
            Map<Object, Object> properties = mo.getMO().getProperties();
            LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO, "the request params is " + properties.toString());
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                    "RemoteDeviceHandlerImp.createByISCSI()", null, properties.toString());//zwx228053
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
        }

        RestManager<RemoteDeviceMO> restManager = new RestManager<RemoteDeviceMO>(RemoteDeviceMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        RemoteDeviceMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    @Override
    public RemoteDeviceMO createByVendor(RemoteDeviceBuilderVendorMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "create", "and",
            "connect");

        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(RemoteDevice.TYPE, MOType.REMOTE_DEVICE.getValue());
            requestBody.put(RemoteDeviceBuilder.ISCSILINKREMOTETCPPORT, 3260);
            requestBody.put(RemoteDeviceBuilder.ISCSILINKRECOVERYPOLICY, 1);

            if (null != mo)
            {
                Map<Object, Object> properties = mo.getMO().getProperties();
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + properties.toString());
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                        "RemoteDeviceHandlerImp.createByVendor()", null, properties.toString());//zwx228053
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<RemoteDeviceMO> restManager = new RestManager<RemoteDeviceMO>(RemoteDeviceMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        RemoteDeviceMO resPonsemo = restManager.getPutRequestMO();
        return resPonsemo;
    }

    @Override
    public void modifyAuthenticationInfo(String id, String remoteUserName, String remotePassword) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;

        try
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance()
                .composeRelativeUri(getDeviceId(), "remote_device", id);
            requestBody = new JSONObject();
            requestBody.put(RemoteDevice.REMOTEUSERNAME, remoteUserName);
            requestBody.put(RemoteDevice.REMOTEPASSWORD, remotePassword);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<RemoteDeviceMO> restManager = new RestManager<RemoteDeviceMO>(RemoteDeviceMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    @Override
    public void delete(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "remote_device",
            id);
        RestManager<RemoteDeviceMO> restManager = new RestManager<RemoteDeviceMO>(RemoteDeviceMO.class,
            getRestRequestHandler(), relativePath, null, null);
        restManager.getDelRequestMO();
    }

    @Override
    public RemoteDeviceMO get(String id) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "remote_device", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(RemoteDevice.TYPE, String.valueOf(MOType.REMOTE_DEVICE.getValue()));
        headParamMap.put(RemoteDevice.ID, id);

        RestManager<RemoteDeviceMO> restManager = new RestManager<RemoteDeviceMO>(RemoteDeviceMO.class,
            getRestRequestHandler(), realitivePath, headParamMap, null);

        RemoteDeviceMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo;
    }

    @Override
    public RemoteDeviceIterator getBatch(RemoteDeviceQuery condition) throws ApiException
    {
        if (null == remoteDeviceIterator)
        {
            remoteDeviceIterator = new RemoteDeviceIterator(getRestRequestHandler(), getDeviceId(), condition);
        }
        return remoteDeviceIterator;
    }

    @Override
    public Long getCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "remote_device",
            "count");
        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<RemoteDeviceMO> restManager = new RestManager<RemoteDeviceMO>(RemoteDeviceMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        RemoteDeviceMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }

}
