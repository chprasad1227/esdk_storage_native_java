package com.huawei.ism.openapi.fcinitiator;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.TLV.FCInitiator;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * FC启动器接口实现
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class FcInitiatorHandlerImp extends DefaultCommHandler implements FcInitiatorHandler
{
    private FcInitiatorIterator fcInitiatorIterator = null;

    /**
     * 初始化 方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     */
    protected FcInitiatorHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建FC启动器
     * @param mo 启动器信息
     * @return FcInitiatorMO
     * @throws ApiException API异常
     */
    public FcInitiatorMO create(FcInitiatorMO mo) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_initiator");

        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(FCInitiator.TYPE, MOType.FC_INITIATOR.getValue());
            requestBody.put(FCInitiator.PARENTTYPE, MOType.HOST.getValue());

            if (mo != null)
            {
                // 遍历属性数组
                Map<Object, Object> properties = mo.getMO().getProperties();
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + properties.toString());
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                        "FcInitiatorHandlerImp.create()", null, properties.toString());// zWX228053
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<FcInitiatorMO> restManager = new RestManager<FcInitiatorMO>(FcInitiatorMO.class,
            getRestRequestHandler(), realitivePath, null, requestBody);
        FcInitiatorMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * 查询FC启动器
     * @param id 启动器ID
     * @return FcInitiatorMO
     * @throws ApiException API异常
     */
    public FcInitiatorMO get(String id) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_initiator",
            id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(FCInitiator.TYPE, String.valueOf(MOType.FC_INITIATOR.getValue()));
        headParamMap.put(FCInitiator.ID, id);

        RestManager<FcInitiatorMO> restManager = new RestManager<FcInitiatorMO>(FcInitiatorMO.class,
            getRestRequestHandler(), realitivePath, headParamMap, null);
        FcInitiatorMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo;
    }

    /**
     * 批量查询FC启动器
     * @param condition 查询条件
     * @return FcInitiatorIterator
     */
    public FcInitiatorIterator getBatch(FcInitiatorQuery condition)
    {
        if (null == fcInitiatorIterator)
        {
            fcInitiatorIterator = new FcInitiatorIterator(getRestRequestHandler(), getDeviceId(), condition, false);
        }
        return fcInitiatorIterator;
    }

    /**
     * 将FC启动器添加到HOST
     * @param fcInitiatorId 启动器ID
     * @param hostId 主机ID
     * @throws ApiException API异常
     */
    public void createFcToHost(String initiatorId, String hostId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_initiator",
            initiatorId);
        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(FCInitiator.TYPE, MOType.FC_INITIATOR.getValue());
            requestBody.put(FCInitiator.ID, initiatorId);
            requestBody.put(FCInitiator.PARENTTYPE, MOType.HOST.getValue());
            requestBody.put(FCInitiator.PARENTID, hostId);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<FcInitiatorMO> restManager = new RestManager<FcInitiatorMO>(FcInitiatorMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 将FC启动器从HOST移除
     * @param id 启动器ID
     * @throws ApiException API异常
     */
    public void removeFcFromHost(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_initiator",
            "remove_fc_from_host");
        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(FCInitiator.TYPE, MOType.FC_INITIATOR.getValue());
            requestBody.put(FCInitiator.ID, id);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<FcInitiatorMO> restManager = new RestManager<FcInitiatorMO>(FcInitiatorMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 修改启动器
     * @param mo 修改信息
     * @throws ApiException API异常
     */
    public void modify(FcInitiatorMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {

            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_initiator",
                    mo.getId());
                requestBody = new JSONObject();
                requestBody.put(FCInitiator.TYPE, MOType.FC_INITIATOR.getValue());
                requestBody.put(FCInitiator.PARENTTYPE, MOType.HOST.getValue());
                // 遍历属性数组
                Map<Object, Object> properties = mo.getMO().getProperties();
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + properties.toString());
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                        "FcInitiatorHandlerImp.modify(FcInitiatorMO)", null, properties.toString());
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<FcInitiatorMO> restManager = new RestManager<FcInitiatorMO>(FcInitiatorMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 删除启动器
     * @param id 启动器ID
     * @throws ApiException API异常
     */
    public void delete(String id) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "fc_initiator",
            id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(FCInitiator.TYPE, String.valueOf(MOType.FC_INITIATOR.getValue()));
        headParamMap.put(FCInitiator.ID, id);

        RestManager<FcInitiatorMO> restManager = new RestManager<FcInitiatorMO>(FcInitiatorMO.class,
            getRestRequestHandler(), realitivePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

}
