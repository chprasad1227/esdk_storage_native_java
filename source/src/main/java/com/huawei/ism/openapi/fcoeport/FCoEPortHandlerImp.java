package com.huawei.ism.openapi.fcoeport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.TLV.FCoEPort;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 实现接口
 * @author gWX183785
 * @version V100R001C10
 */
public class FCoEPortHandlerImp extends DefaultCommHandler implements FCoEPortHandler
{
    private FCoEPortIterator initiatorIterator;

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     */
    protected FCoEPortHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 查询FCoE端口
     * @param id 端口id
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    public FCoEPortMO get(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "FCoE_PORT", id);
        Map<String, String> headerParams = new HashMap<String, String>();
        headerParams.put(FCoEPort.TYPE, String.valueOf(MOType.FCOE_PORT.getValue()));

        RestManager<FCoEPortMO> restManager = new RestManager<FCoEPortMO>(FCoEPortMO.class, getRestRequestHandler(),
            relativePath, headerParams, null);
        return restManager.getGetRequestMO();
    }

    /**
     * 批量查询FCoE端口
     * @param cond 批量查询条件
     * @return 返回结果
     */
    @Override
    public FCoEPortIterator getBatch(FCoEPortQuery cond)
    {
        if (null == initiatorIterator)
        {
            initiatorIterator = new FCoEPortIterator(getRestRequestHandler(), getDeviceId(), cond);
        }
        return initiatorIterator;
    }

    /**
     * 修改FCoE端口
     * @param mo fcoe端口对象
     * @throws ApiException 异常
     */
    @Override
    public void modify(FCoEPortMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject body = null;
        try
        {
            if (mo != null)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "FCoE_PORT",
                    mo.getId());
                body = new JSONObject();
                body.put(FCoEPort.TYPE, MOType.FCOE_PORT.getValue());
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(body, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<FCoEPortMO> restManager = new RestManager<FCoEPortMO>(FCoEPortMO.class, getRestRequestHandler(),
            relativePath, null, body);
        restManager.getPutRequestMO();
    }

    /**
     * 通过端口组查询FCoE端口
     * @param portGroupId 端口组id
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    public List<FCoEPortMO> getFCoEPortByPortGroup(String portGroupId) throws ApiException
    {
        return getFCoEPort(portGroupId, MOType.PORTGROUP.getValue());
    }

    private List<FCoEPortMO> getFCoEPort(String id, int type) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fcoe_port",
            "associate");
        Map<String, String> headParams = new HashMap<String, String>();
        headParams.put(FCoEPort.TYPE, String.valueOf(MOType.FCOE_PORT.getValue()));
        headParams.put(FCoEPort.ASSOCIATEOBJID, id);
        headParams.put(FCoEPort.ASSOCIATEOBJTYPE, String.valueOf(type));

        RestManager<FCoEPortMO> restManager = new RestManager<FCoEPortMO>(FCoEPortMO.class, getRestRequestHandler(),
            relativePath, headParams, null);
        return restManager.getGetRequestMOList();
    }

}
