package com.huawei.ism.openapi.nas.adfield;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.ADFIELD;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
import com.huawei.ism.openapi.snapshot.SnapshotMO;

/**
 * AD域接口的实现类
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class ADFieldHandlerImpl extends DefaultCommHandler implements ADFieldHandler
{

    /**
     * AD域接口实现类
     * @param restRequestHandler rest请求
     * @param deviceID 网元ID
     */
    protected ADFieldHandlerImpl(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * AD域修改方法
     * @param mo AD域mo
     * @throws ApiException API自定义异常
     */
    @Override
    public void modify(ADFieldMO mo) throws ApiException
    {
        String realitivePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
                    "AD_config");
                requestBody = new JSONObject();
                Map<Object, Object> properties = mo.getMO().getProperties();
                requestBody.put(ADFIELD.TYPE, MOType.NAS_AD_FIELD.getValue());
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }
        RestManager<SnapshotMO> restManager = new RestManager<SnapshotMO>(SnapshotMO.class, getRestRequestHandler(),
            realitivePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 获取AD域信息
     * @return AD域信息
     * @throws ApiException API自定义异常
     */
    @Override
    public ADFieldMO get() throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "ad_config");

        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<ADFieldMO> restManager = new RestManager<ADFieldMO>(ADFieldMO.class, getRestRequestHandler(),
            realitivePath, headParamMap, null);
        ADFieldMO resPonsemo = restManager.getGetRequestMO();

        return resPonsemo;
    }

}
