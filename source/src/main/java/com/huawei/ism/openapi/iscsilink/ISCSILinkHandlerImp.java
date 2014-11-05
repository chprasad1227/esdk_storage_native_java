package com.huawei.ism.openapi.iscsilink;

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
import com.huawei.ism.openapi.common.keydeifines.TLV.ISCSILink;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

public class ISCSILinkHandlerImp extends DefaultCommHandler implements ISCSILinkHandler
{
    ISCSILinkIterator iscsiLinkIterator = null;

    protected ISCSILinkHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    @Override
    public void modify(ISCSILinkMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "iscsi_link",
                    mo.getId());
                requestBody = new JSONObject();
                requestBody.put(ISCSILink.TYPE, MOType.ISCSI_LINK.getValue());
                // 遍历属性数组
                Map<Object, Object> properties = mo.getMO().getProperties();
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + properties.toString());
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ISCSILinkMO> restManager = new RestManager<ISCSILinkMO>(ISCSILinkMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    @Override
    public ISCSILinkMO get(String id) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "iscsi_link",
            id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(ISCSILink.TYPE, String.valueOf(MOType.ISCSI_LINK.getValue()));
        headParamMap.put(ISCSILink.ID, id);

        RestManager<ISCSILinkMO> restManager = new RestManager<ISCSILinkMO>(ISCSILinkMO.class, getRestRequestHandler(),
            realitivePath, headParamMap, null);

        ISCSILinkMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo;
    }

    @Override
    public ISCSILinkIterator getBatch(ISCSILinkQuery condition) throws ApiException
    {
        if (null == iscsiLinkIterator)
        {
            iscsiLinkIterator = new ISCSILinkIterator(getRestRequestHandler(), getDeviceId(), condition, false);
        }
        return iscsiLinkIterator;
    }

    @Override
    public Long getCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "iscsi_link",
            "count");
        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<ISCSILinkMO> restManager = new RestManager<ISCSILinkMO>(ISCSILinkMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        ISCSILinkMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }

    @Override
    public ISCSILinkMO create(ISCSILinkMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "iscsi_link");

        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(ISCSILink.TYPE, MOType.ISCSI_LINK.getValue());
            requestBody.put(ISCSILink.ENABLECHAP, false);
            requestBody.put(ISCSILink.PORT, 3260);
            requestBody.put(ISCSILink.TYPE, 1);

            if (null != mo)
            {
                Map<Object, Object> properties = mo.getMO().getProperties();
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + properties.toString());
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ISCSILinkMO> restManager = new RestManager<ISCSILinkMO>(ISCSILinkMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        ISCSILinkMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    @Override
    public void delete(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "iscsi_link", id);
        RestManager<ISCSILinkMO> restManager = new RestManager<ISCSILinkMO>(ISCSILinkMO.class, getRestRequestHandler(),
            relativePath, null, null);
        restManager.getDelRequestMO();
    }

    @Override
    public ISCSILinkIterator getISCSILinkByDeviceID(String deviceID, ISCSILinkQuery condition) throws ApiException
    {
        if (null == condition)
        {
            ISCSILinkMO mo = new ISCSILinkMO();
            mo.setAssociateOBJId(deviceID);
            mo.setAssociateOBJType(MOType.REMOTE_DEVICE);
            condition = new ISCSILinkQuery(mo, 0, 100);
            return getAssociateBatch(condition);
        }
        ISCSILinkMO mo = condition.getISCSILinkMO();
        if (null == mo)
        {
            mo = new ISCSILinkMO();
        }
        mo.setAssociateOBJId(deviceID);
        mo.setAssociateOBJType(MOType.REMOTE_DEVICE);
        condition.setQueryISCSILinkMO(mo);
        return getAssociateBatch(condition);
    }

    private ISCSILinkIterator getAssociateBatch(ISCSILinkQuery condition)
    {
        if (null == iscsiLinkIterator)
        {
            iscsiLinkIterator = new ISCSILinkIterator(getRestRequestHandler(), getDeviceId(), condition, true);
        }
        return iscsiLinkIterator;
    }

}
