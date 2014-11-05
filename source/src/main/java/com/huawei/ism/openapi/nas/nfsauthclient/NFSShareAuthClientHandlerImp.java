package com.huawei.ism.openapi.nas.nfsauthclient;

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
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.NFSSHAREAUTHCLIENT;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 实现接口
 * @author gWX183785
 * @version V100R001C10
 */
public class NFSShareAuthClientHandlerImp extends DefaultCommHandler implements NFSShareAuthClientHandler
{
    private NFSShareAuthClientIterator authClientIterator;

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     */
    protected NFSShareAuthClientHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建NFS共享权限控制
     * @param mo NFS共享权限控制对象
     * @return NFS共享权限控制对象
     * @throws ApiException 异常
     */
    @Override
    public NFSShareAuthClientMO create(NFSShareAuthClientMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "SNAS_NFS_SHARE_AUTH_CLIENT");

        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(NFSSHAREAUTHCLIENT.TYPE, MOType.SNAS_NFS_SHARE_AUTH_CLIENT.getValue());

            if (mo != null)
            {
                // 遍历属性数组
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + requestBody.toString());
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<NFSShareAuthClientMO> restManager = new RestManager<NFSShareAuthClientMO>(
            NFSShareAuthClientMO.class, getRestRequestHandler(), relativePath, null, requestBody);
        NFSShareAuthClientMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * 查询NFS共享权限控制
     * @param id NFS共享权限控制id
     * @return NFS共享权限控制对象
     * @throws ApiException 异常
     */
    @Override
    public NFSShareAuthClientMO get(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "SNAS_NFS_SHARE_AUTH_CLIENT", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(NFSSHAREAUTHCLIENT.TYPE, String.valueOf(MOType.SNAS_NFS_SHARE_AUTH_CLIENT.getValue()));

        RestManager<NFSShareAuthClientMO> restManager = new RestManager<NFSShareAuthClientMO>(
            NFSShareAuthClientMO.class, getRestRequestHandler(), relativePath, headParamMap, null);
        return restManager.getGetRequestMO();
    }

    /**
     * 批量查询NFS共享权限控制迭代器
     * @param cond 查询条件
     * @return 主机对象
     */
    @Override
    public NFSShareAuthClientIterator getBatch(NFSShareAuthClientQuery cond)
    {
        if (null == authClientIterator)
        {
            authClientIterator = new NFSShareAuthClientIterator(getRestRequestHandler(), getDeviceId(), cond);
        }
        return authClientIterator;
    }

    /**
     * 删除NFS共享权限控制
     * @param id 端口组id
     * @throws ApiException 异常
     */
    @Override
    public void delete(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "SNAS_NFS_SHARE_AUTH_CLIENT", id);
        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<NFSShareAuthClientMO> restManager = new RestManager<NFSShareAuthClientMO>(
            NFSShareAuthClientMO.class, getRestRequestHandler(), relativePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 修改NFS共享权限控制属性
     * @param mo NFS共享权限控制对象
     * @throws ApiException 异常
     */
    @Override
    public void modify(NFSShareAuthClientMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (mo != null)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
                    "SNAS_NFS_SHARE_AUTH_CLIENT", mo.getId());
                requestBody = new JSONObject();
                requestBody.put(NFSSHAREAUTHCLIENT.TYPE, MOType.SNAS_NFS_SHARE_AUTH_CLIENT.getValue());
                // 遍历属性数组
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + requestBody.toString());
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<NFSShareAuthClientMO> restManager = new RestManager<NFSShareAuthClientMO>(
            NFSShareAuthClientMO.class, getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

}
