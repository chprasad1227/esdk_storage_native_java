package com.huawei.ism.openapi.nas.cifsservice;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.CIFSSERVICE;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 接口实现
 * @author gWX183785
 * @version V100R001C10
 */
public class CIFSServiceHandlerImpl extends DefaultCommHandler implements
    CIFSServiceHandler
{
    /**
     * 接口实现类
     * @param restRequestHandler rest请求
     * @param deviceID 设备id
     */
    protected CIFSServiceHandlerImpl(RestRequestHandler restRequestHandler,
        String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * CIFSService修改方法
     * @param mo CIFSService mo
     * @throws ApiException API自定义异常
     */
    @Override
    public void modify(CIFSServiceMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance()
                    .composeRelativeUri(getDeviceId(), "cifsservice",
                        mo.getId());
                requestBody = new JSONObject();
                requestBody
                    .put(CIFSSERVICE.TYPE, MOType.CIFSSERVICE.getValue());
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

        RestManager<CIFSServiceMO> restManager = new RestManager<CIFSServiceMO>(
            CIFSServiceMO.class, getRestRequestHandler(), relativePath, null,
            requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 获取CIFSService信息
     * @param id id
     * @return CIFSService信息
     * @throws ApiException ApiException API自定义异常
     */
    @Override
    public CIFSServiceMO get(String id) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "CIFSSERVICE", id);

        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<CIFSServiceMO> restManager = new RestManager<CIFSServiceMO>(
            CIFSServiceMO.class, getRestRequestHandler(), realitivePath,
            headParamMap, null);
        CIFSServiceMO resPonsemo = restManager.getGetRequestMO();

        return resPonsemo;
    }

}
