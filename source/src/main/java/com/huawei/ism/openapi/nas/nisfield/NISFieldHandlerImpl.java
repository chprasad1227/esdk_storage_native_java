package com.huawei.ism.openapi.nas.nisfield;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.NISFIELD;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
/**
 * NIS域接口的实现类
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class NISFieldHandlerImpl extends DefaultCommHandler implements NISFieldHandler
{
    /**
     * NIS域接口实现类
     * @param restRequestHandler rest请求
     * @param deviceID 网元ID
     */
    protected NISFieldHandlerImpl(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * NIS域修改方法
     * @param mo NIS域mo
     * @throws ApiException API自定义异常
     */
    @Override
    public void modify(NISFieldMO mo) throws ApiException
    {
        String realitivePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
                    "SNAS_NIS_CONFIG/single");
                requestBody = new JSONObject();
                Map<Object, Object> properties = mo.getMO().getProperties();
                requestBody.put(NISFIELD.TYPE, MOType.NAS_NIS_FIELD.getValue());
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }
        RestManager<NISFieldMO> restManager = new RestManager<NISFieldMO>(NISFieldMO.class, getRestRequestHandler(),
            realitivePath, null, requestBody);
        restManager.getPutRequestMO();
    }
    /**
     * 获取LDAP域信息
     * @return LDAP域信息
     * @throws ApiException API自定义异常
     */
    @Override
    public NISFieldMO get() throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "SNAS_NIS_CONFIG/single");

        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<NISFieldMO> restManager = new RestManager<NISFieldMO>(NISFieldMO.class, getRestRequestHandler(),
            realitivePath, headParamMap, null);
        NISFieldMO resPonsemo = restManager.getGetRequestMO();

        return resPonsemo;
    }

}
