package com.huawei.ism.openapi.ethport;

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
import com.huawei.ism.openapi.common.keydeifines.TLV.ETHPort;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 接口实现
 * @author gWX183785
 * @version V100R001C10
 */
public class ETHPortHandlerImp extends DefaultCommHandler implements ETHPortHandler
{
    private ETHPortIterator initiatorIterator;

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     */
    protected ETHPortHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 查询ETH端口
     * @param id eth端口id
     * @return ETHPortMO eth端口对象
     * @throws ApiException 异常
     */
    @Override
    public ETHPortMO get(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "ETH_PORT", id);
        Map<String, String> headerParams = new HashMap<String, String>();
        headerParams.put(ETHPort.TYPE, String.valueOf(MOType.ETH_PORT.getValue()));

        RestManager<ETHPortMO> restManager = new RestManager<ETHPortMO>(ETHPortMO.class, getRestRequestHandler(),
            relativePath, headerParams, null);
        return restManager.getGetRequestMO();
    }

    /**
     * 批量查询ETH端口
     * @param cond 批量查询条件
     * @return ETHPortIterator eth端口迭代器
     */
    @Override
    public ETHPortIterator getBatch(ETHPortQuery cond)
    {
        if (null == initiatorIterator)
        {
            initiatorIterator = new ETHPortIterator(getRestRequestHandler(), getDeviceId(), cond);
        }
        return initiatorIterator;
    }

    /**
     * 修改ETH端口
     * @param mo eth端口对象
     * @throws ApiException 异常
     */
    @Override
    public void modify(ETHPortMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject body = null;
        try
        {
            if (mo != null)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "ETH_PORT",
                    mo.getId());
                body = new JSONObject();
                body.put(ETHPort.TYPE, MOType.ETH_PORT.getValue());
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(body, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ETHPortMO> restManager = new RestManager<ETHPortMO>(ETHPortMO.class, getRestRequestHandler(),
            relativePath, null, body);
        restManager.getPutRequestMO();
    }

    /**
     * 通过端口组查询ETH端口
     * @param portGroupId 端口组id
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    public List<ETHPortMO> getETHPortByPortGroup(String portGroupId) throws ApiException
    {
        return getETHPort(portGroupId, MOType.PORTGROUP.getValue());
    }

    private List<ETHPortMO> getETHPort(String id, int type) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "eth_port",
            "associate");
        Map<String, String> headParams = new HashMap<String, String>();
        headParams.put(ETHPort.TYPE, String.valueOf(MOType.ETH_PORT.getValue()));
        headParams.put(ETHPort.ASSOCIATEOBJID, id);
        headParams.put(ETHPort.ASSOCIATEOBJTYPE, String.valueOf(type));

        RestManager<ETHPortMO> restManager = new RestManager<ETHPortMO>(ETHPortMO.class, getRestRequestHandler(),
            relativePath, headParams, null);
        return restManager.getGetRequestMOList();
    }

}
