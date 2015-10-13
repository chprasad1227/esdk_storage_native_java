package com.huawei.ism.openapi.fclink;

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
import com.huawei.ism.openapi.common.keydeifines.TLV.FCLink;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

public class FCLinkHandlerImp extends DefaultCommHandler implements FCLinkHandler
{
    private FCLinkIterator fcLinkIterator = null;

    protected FCLinkHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    @Override
    public void modify(FCLinkMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_link",
                    mo.getId());
                requestBody = new JSONObject();
                requestBody.put(FCLink.TYPE, MOType.FC_LINK.getValue());
                // 遍历属性数组
                Map<Object, Object> properties = mo.getMO().getProperties();
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + properties.toString());
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                        "FCLinkHandlerImp.modify()", null, properties.toString());
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<FCLinkMO> restManager = new RestManager<FCLinkMO>(FCLinkMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    @Override
    public FCLinkMO get(String id) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_link", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(FCLink.TYPE, String.valueOf(MOType.FC_LINK.getValue()));
        headParamMap.put(FCLink.ID, id);

        RestManager<FCLinkMO> restManager = new RestManager<FCLinkMO>(FCLinkMO.class, getRestRequestHandler(),
            realitivePath, headParamMap, null);

        FCLinkMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo;
    }

    @Override
    public FCLinkIterator getBatch(FCLinkQuery condition) throws ApiException
    {
        if (null == fcLinkIterator)
        {
            fcLinkIterator = new FCLinkIterator(getRestRequestHandler(), getDeviceId(), condition, false);
        }
        return fcLinkIterator;
    }

    @Override
    public Long getCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_link",
            "count");
        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<FCLinkMO> restManager = new RestManager<FCLinkMO>(FCLinkMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        FCLinkMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }

    @Override
    public void addFCLinkToRemoteDevice(String fcLinkID) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_link",
            "add_fclink_to_remote_device");
        JSONObject requestBody = new JSONObject();

        try
        {
            requestBody.put(FCLink.TYPE, MOType.FC_LINK.getValue());
            requestBody.put(FCLink.ID, fcLinkID);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<FCLinkMO> restManager = new RestManager<FCLinkMO>(FCLinkMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    @Override
    public void removeFCLinkFromRemoteDevice(String fcLinkID) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_link",
            "remove_fclink_from_remote_device");
        JSONObject requestBody = new JSONObject();

        try
        {
            requestBody.put(FCLink.TYPE, MOType.FC_LINK.getValue());
            requestBody.put(FCLink.ID, fcLinkID);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<FCLinkMO> restManager = new RestManager<FCLinkMO>(FCLinkMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

}
