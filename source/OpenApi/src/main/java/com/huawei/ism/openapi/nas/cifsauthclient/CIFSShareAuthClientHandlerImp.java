package com.huawei.ism.openapi.nas.cifsauthclient;

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
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.CIFSSHAREAUTHCLIENT;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 实现接口
 * @author gWX183785
 * @version V100R001C10
 */
public class CIFSShareAuthClientHandlerImp extends DefaultCommHandler implements CIFSShareAuthClientHandler
{
    private CIFSShareAuthClientIterator authClientIterator;

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     */
    protected CIFSShareAuthClientHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建CIFS共享权限控制
     * @param mo CIFS共享权限控制对象
     * @return CIFS共享权限控制对象
     * @throws ApiException 异常
     */
    @Override
    public CIFSShareAuthClientMO create(CIFSShareAuthClientMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "CIFS_SHARE_AUTH_CLIENT");// zwx228053 2014-11-17 修改参数

        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(CIFSSHAREAUTHCLIENT.TYPE, MOType.SNAS_CIFS_SHARE_AUTH_CLIENT.getValue());

            if (mo != null)
            {
                // 遍历属性数组
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + requestBody.toString());
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                        "CIFSShareAuthClientHandlerImp.create()", null, requestBody.toString());
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<CIFSShareAuthClientMO> restManager = new RestManager<CIFSShareAuthClientMO>(
            CIFSShareAuthClientMO.class, getRestRequestHandler(), relativePath, null, requestBody);
        CIFSShareAuthClientMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * 查询CIFS共享权限控制
     * @param id CIFS共享权限控制id
     * @return CIFS共享权限控制对象
     * @throws ApiException 异常
     */
    @Override
    public CIFSShareAuthClientMO get(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "CIFS_SHARE_AUTH_CLIENT", id);// zwx228053 2014-11-17 修改参数
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(CIFSSHAREAUTHCLIENT.TYPE, String.valueOf(MOType.SNAS_CIFS_SHARE_AUTH_CLIENT.getValue()));

        RestManager<CIFSShareAuthClientMO> restManager = new RestManager<CIFSShareAuthClientMO>(
            CIFSShareAuthClientMO.class, getRestRequestHandler(), relativePath, headParamMap, null);
        return restManager.getGetRequestMO();
    }

    /**
     * 批量查询CIFS共享权限控制迭代器
     * @param cond 查询条件
     * @return 主机对象
     */
    @Override
    public CIFSShareAuthClientIterator getBatch(CIFSShareAuthClientQuery cond)
    {
        if (null == authClientIterator)
        {
            authClientIterator = new CIFSShareAuthClientIterator(getRestRequestHandler(), getDeviceId(), cond);
        }
        return authClientIterator;
    }

    /**
     * 删除CIFS共享权限控制
     * @param id 端口组id
     * @throws ApiException 异常
     */
    @Override
    public void delete(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "CIFS_SHARE_AUTH_CLIENT", id);// zwx228053 2014-11-17 修改参数
        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<CIFSShareAuthClientMO> restManager = new RestManager<CIFSShareAuthClientMO>(
            CIFSShareAuthClientMO.class, getRestRequestHandler(), relativePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 修改CIFS共享权限控制属性
     * @param mo CIFS共享权限控制对象
     * @throws ApiException 异常
     */
    @Override
    public void modify(CIFSShareAuthClientMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (mo != null)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
                    "CIFS_SHARE_AUTH_CLIENT", mo.getId());// zwx228053 2014-11-17 修改参数
                requestBody = new JSONObject();
                requestBody.put(CIFSSHAREAUTHCLIENT.TYPE, MOType.SNAS_CIFS_SHARE_AUTH_CLIENT.getValue());
                // 遍历属性数组
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + requestBody.toString());
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                        "CIFSShareAuthClientHandlerImp.modify()", null, requestBody.toString());
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<CIFSShareAuthClientMO> restManager = new RestManager<CIFSShareAuthClientMO>(
            CIFSShareAuthClientMO.class, getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

}
