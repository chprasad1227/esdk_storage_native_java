package com.huawei.ism.openapi.nas.homedir;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.HOMEDIR;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 接口实现
 * @author gWX183785
 * @version V100R001C10
 */
public class HomeDirHandlerImpl extends DefaultCommHandler implements
    HomeDirHandler
{
    /**
     * 主目录接口实现类
     * @param restRequestHandler rest请求
     * @param deviceID 设备id
     */
    protected HomeDirHandlerImpl(RestRequestHandler restRequestHandler,
        String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 主目录修改方法
     * @param mo 主目录对象
     * @throws ApiException API自定义异常
     */
    @Override
    public void modify(HomeDirMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance()
                    .composeRelativeUri(getDeviceId(), "homedir", "single");
                requestBody = new JSONObject();
                requestBody.put(HOMEDIR.TYPE,
                    String.valueOf(MOType.HOMEDIR.getValue()));
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

        RestManager<HomeDirMO> restManager = new RestManager<HomeDirMO>(
            HomeDirMO.class, getRestRequestHandler(), relativePath, null,
            requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 获取主目录信息
     * @param id id
     * @return 主目录信息
     * @throws ApiException ApiException API自定义异常
     */
    @Override
    public HomeDirMO get() throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "homedir");

        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<HomeDirMO> restManager = new RestManager<HomeDirMO>(
            HomeDirMO.class, getRestRequestHandler(), realitivePath,
            headParamMap, null);
        HomeDirMO resPonsemo = restManager.getGetRequestMO();

        return resPonsemo;
    }

}
