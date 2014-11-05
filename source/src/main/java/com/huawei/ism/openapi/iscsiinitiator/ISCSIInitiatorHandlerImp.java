package com.huawei.ism.openapi.iscsiinitiator;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.TLV.ISCSIInitiator;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 接口实现
 * @author gWX183785
 * @version V100R001C10
 */
public class ISCSIInitiatorHandlerImp extends DefaultCommHandler implements ISCSIInitiatorHandler
{
    private ISCSIInitiatorIterator initiatorIterator;

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceId 设备号
     */
    protected ISCSIInitiatorHandlerImp(RestRequestHandler restRequestHandler, String deviceId)
    {
        super(restRequestHandler, deviceId);
    }

    /**
     * 创建ISCSI控制器
     * @param mo ISCSI控制器对象
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    public ISCSIInitiatorMO create(ISCSIInitiatorMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "iscsi_initiator");
        JSONObject body = new JSONObject();
        try
        {
            body.put(ISCSIInitiator.TYPE, MOType.ISCSI_INITIATOR);
            if (null != mo)
            {
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(body, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ISCSIInitiatorMO> restManager = new RestManager<ISCSIInitiatorMO>(ISCSIInitiatorMO.class,
            getRestRequestHandler(), relativePath, null, body);
        return restManager.getPostRequestMO();
    }

    /**
     * 查询ISCSI控制器
     * @param id ISCSI控制器id
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    public ISCSIInitiatorMO get(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "iscsi_initiator", id);
        Map<String, String> headerParams = new HashMap<String, String>();
        headerParams.put(ISCSIInitiator.TYPE, String.valueOf(MOType.ISCSI_INITIATOR.getValue()));

        RestManager<ISCSIInitiatorMO> restManager = new RestManager<ISCSIInitiatorMO>(ISCSIInitiatorMO.class,
            getRestRequestHandler(), relativePath, headerParams, null);
        return restManager.getGetRequestMO();
    }

    /**
     * 批量查询ISCSI控制器
     * @param cond 查询条件
     * @return 返回结果
     */
    @Override
    public ISCSIInitiatorIterator getBatch(ISCSIInitiatorQuery cond)
    {
        if (null == initiatorIterator)
        {
            initiatorIterator = new ISCSIInitiatorIterator(getRestRequestHandler(), getDeviceId(), cond);
        }
        return initiatorIterator;
    }

    /**
     * 将ISCSI启动器添加到HOST
     * @param initiatorId 启动器ID
     * @param hostId 主机ID
     * @throws ApiException API异常
     */
    public void createIscsiToHost(String initiatorId, String hostId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "iscsi_initiator", initiatorId);
        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(ISCSIInitiator.TYPE, MOType.ISCSI_INITIATOR.getValue());
            requestBody.put(ISCSIInitiator.ID, initiatorId);
            requestBody.put(ISCSIInitiator.PARENTTYPE, MOType.HOST.getValue());
            requestBody.put(ISCSIInitiator.PARENTID, hostId);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ISCSIInitiatorMO> restManager = new RestManager<ISCSIInitiatorMO>(ISCSIInitiatorMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 将ISCSI控制器从主机移除
     * @param initiatorId 启动器id
     * @throws ApiException 异常
     */
    @Override
    public void removeIscsiFromHost(String initiatorId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "iscsi_initiator", "remove_iscsi_from_host");
        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(ISCSIInitiator.TYPE, MOType.ISCSI_INITIATOR.getValue());
            requestBody.put(ISCSIInitiator.ID, initiatorId);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ISCSIInitiatorMO> restManager = new RestManager<ISCSIInitiatorMO>(ISCSIInitiatorMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 修改ISCSI控制器
     * @param mo ISCSI控制器对象
     * @throws ApiException 异常
     */
    @Override
    public void modify(ISCSIInitiatorMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject body = null;
        try
        {
            if (mo != null)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
                    "iscsi_initiator", mo.getId());
                body = new JSONObject();
                body.put(ISCSIInitiator.TYPE, MOType.ISCSI_INITIATOR.getValue());
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(body, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ISCSIInitiatorMO> restManager = new RestManager<ISCSIInitiatorMO>(ISCSIInitiatorMO.class,
            getRestRequestHandler(), relativePath, null, body);
        restManager.getPutRequestMO();
    }

    /**
     * 删除ISCSI控制器
     * @param id ISCSI控制器id
     * @throws ApiException 异常
     */
    @Override
    public void delete(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "iscsi_initiator", id);
        Map<String, String> headerParams = new HashMap<String, String>();
        headerParams.put(ISCSIInitiator.TYPE, String.valueOf(MOType.ISCSI_INITIATOR.getValue()));

        RestManager<ISCSIInitiatorMO> restManager = new RestManager<ISCSIInitiatorMO>(ISCSIInitiatorMO.class,
            getRestRequestHandler(), relativePath, headerParams, null);
        restManager.getDelRequestMO();
    }

}
