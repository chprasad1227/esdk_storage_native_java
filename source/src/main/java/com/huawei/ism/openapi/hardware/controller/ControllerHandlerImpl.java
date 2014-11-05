package com.huawei.ism.openapi.hardware.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.CONTROLLER;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 控制器的实现类
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class ControllerHandlerImpl extends DefaultCommHandler implements ControllerHandler
{
    /**
     * 控制器的构造函数
     * @param restRequestHandler rest请求
     * @param deviceID 网元id
     */
    protected ControllerHandlerImpl(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 查询控制器
     * @param controllerID 控制器的id
     * @return 返回的控制器
     * @throws ApiException API自定义异常
     */
    public ControllerMO get(String controllerID) throws ApiException
    {

        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "controller",
            controllerID);
        Map<String, String> headParamMap = new HashMap<String, String>();

        headParamMap.put(CONTROLLER.ID, controllerID);
        RestManager<ControllerMO> restManager = new RestManager<ControllerMO>(ControllerMO.class,
            getRestRequestHandler(), realitivePath, headParamMap, null);

        ControllerMO resPonsemo = restManager.getGetRequestMO();

        return resPonsemo;
    }

    /**
     * 批量查询控制器
     * @return 返回控制器的迭代器
     * @throws ApiException API自定义异常
     */
    public Iterator<ControllerMO> getBatch() throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "controller");

        RestManager<ControllerMO> restManager = new RestManager<ControllerMO>(ControllerMO.class,
            getRestRequestHandler(), realitivePath, null, null);

        List<ControllerMO> resPonsemo = restManager.getGetRequestMOList();

        return resPonsemo.iterator();
    }

}
