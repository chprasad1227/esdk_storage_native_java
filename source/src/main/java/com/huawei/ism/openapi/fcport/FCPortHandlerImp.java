package com.huawei.ism.openapi.fcport;

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
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.TLV.FCPort;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * FC端口接口实现
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class FCPortHandlerImp extends DefaultCommHandler implements FCPortHandler
{
    private FCPortIterator fcPortIterator = null;

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     */
    protected FCPortHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 查询单个FCPORT
     * @param id FC端口的ID
     * @return FCPortMO
     * @throws ApiException API异常
     */
    public FCPortMO get(String id) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_port", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(FCPort.TYPE, String.valueOf(MOType.FC_PORT.getValue()));
        headParamMap.put(FCPort.ID, id);

        RestManager<FCPortMO> restManager = new RestManager<FCPortMO>(FCPortMO.class, getRestRequestHandler(),
            realitivePath, headParamMap, null);
        FCPortMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo;
    }

    /**
     * 批量查询FCPORT
     * @param condition 查询条件
     * @return FCPortIterator
     */
    public FCPortIterator getBatch(FCPortQuery condition)
    {
        if (null == fcPortIterator)
        {
            fcPortIterator = new FCPortIterator(getRestRequestHandler(), getDeviceId(), condition);
        }
        return fcPortIterator;
    }

    /**
     * 修改
     * @param mo FC端口信息
     * @throws ApiException API异常
     */
    public void modify(FCPortMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {

            if (mo != null)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_port",
                    mo.getId());
                requestBody = new JSONObject();
                requestBody.put(FCPort.TYPE, MOType.FC_PORT.getValue());
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

        RestManager<FCPortMO> restManager = new RestManager<FCPortMO>(FCPortMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 根据portGroupId查询FC端口
     * @param portGroupId 端口组ID
     * @return List<FCPortMO> fc端口对象列表
     * @throws ApiException API异常
     */
    public List<FCPortMO> getFCPortByPortGroup(String portGroupId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_port",
            "associate");
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(FCPort.TYPE, String.valueOf(MOType.FC_PORT.getValue()));
        headParamMap.put(FCPort.ASSOCIATEOBJTYPE, String.valueOf(MOType.PORTGROUP.getValue()));
        headParamMap.put(FCPort.ASSOCIATEOBJID, portGroupId);

        RestManager<FCPortMO> restManager = new RestManager<FCPortMO>(FCPortMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        return restManager.getGetRequestMOList();
    }

}
