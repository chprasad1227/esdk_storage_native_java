package com.huawei.ism.openapi.nas.ldapfield;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.LDAPFIELD;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * LDAP域的实现类
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class LDAPFieldHandlerImpl extends DefaultCommHandler implements LDAPFieldHandler
{
    /**
     * LDAP域接口实现类
     * @param restRequestHandler rest请求
     * @param deviceID 网元ID
     */
    protected LDAPFieldHandlerImpl(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * LDAP域修改方法
     * @param mo LDAP域mo
     * @throws ApiException API自定义异常
     */
    @Override
    public void modify(LDAPFieldMO mo) throws ApiException
    {
        String realitivePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "LDAP_Config");
                requestBody = new JSONObject();
                Map<Object, Object> properties = mo.getMO().getProperties();
                requestBody.put(LDAPFIELD.TYPE, MOType.NAS_LDAP_FIELD.getValue());
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }
        RestManager<LDAPFieldMO> restManager = new RestManager<LDAPFieldMO>(LDAPFieldMO.class, getRestRequestHandler(),
            realitivePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 获取LDAP域信息
     * @return LDAP域信息
     * @throws ApiException API自定义异常
     */
    @Override
    public LDAPFieldMO get() throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "LDAP_Config");

        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<LDAPFieldMO> restManager = new RestManager<LDAPFieldMO>(LDAPFieldMO.class, getRestRequestHandler(),
            realitivePath, headParamMap, null);
        LDAPFieldMO resPonsemo = restManager.getGetRequestMO();

        return resPonsemo;
    }

    /**
     * LDAP域恢复初始化
     * @throws ApiException
     */
    @Override
    public void delete() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "LDAP_Config");
        RestManager<LDAPFieldMO> restManager = new RestManager<LDAPFieldMO>(LDAPFieldMO.class, getRestRequestHandler(),
            relativePath, null, null);
        restManager.getDelRequestMO();

    }

}
