package com.huawei.ism.openapi.nas.nfsservice;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.NFSSERVICE;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 接口实现
 * @author gWX183785
 * @version V100R001C10
 */
public class NFSServiceHandlerImpl extends DefaultCommHandler implements
    NFSServiceHandler
{
    /**
     * 接口实现类
     * @param restRequestHandler rest请求
     * @param deviceID 设备id
     */
    protected NFSServiceHandlerImpl(RestRequestHandler restRequestHandler,
        String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * NFSService修改方法
     * @param mo NFSService mo
     * @throws ApiException API自定义异常
     */
    @Override
    public void modify(NFSServiceMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance()
                    .composeRelativeUri(getDeviceId(), "nfsservice");
                requestBody = new JSONObject();
                requestBody
                    .put(NFSSERVICE.TYPE, MOType.NFSSERVICE.getValue());
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(
                    requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<NFSServiceMO> restManager = new RestManager<NFSServiceMO>(
            NFSServiceMO.class, getRestRequestHandler(), relativePath, null,
            requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 获取NFSService信息
     * @return NFSService信息
     * @throws ApiException ApiException API自定义异常
     */
    @Override
    public NFSServiceMO get() throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "NFSSERVICE");

        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<NFSServiceMO> restManager = new RestManager<NFSServiceMO>(
            NFSServiceMO.class, getRestRequestHandler(), realitivePath,
            headParamMap, null);
        NFSServiceMO resPonsemo = restManager.getGetRequestMO();

        return resPonsemo;
    }

}
