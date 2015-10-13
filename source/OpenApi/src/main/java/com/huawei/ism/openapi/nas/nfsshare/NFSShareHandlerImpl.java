package com.huawei.ism.openapi.nas.nfsshare;

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
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.NFSSHARE;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * NFS共享信息
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class NFSShareHandlerImpl extends DefaultCommHandler implements NFSShareHandler
{
    private NFSShareIterator iterator = null;

    /**
     * NFS共享接口实现类
     * @param restRequestHandler rest请求
     * @param deviceID 网元ID
     */
    protected NFSShareHandlerImpl(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建NFS共享
     * @param mo NFS域mo
     * @return NFS域信息
     * @throws ApiException API自定义异常
     */
    @Override
    public NFSShareMO create(NFSShareMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "NFSHARE");

        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(NFSSHARE.TYPE, MOType.SNAS_NFS_SHARE.getValue());

            if (null != mo)
            {
                Map<Object, Object> properties = mo.getMO().getProperties();
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + properties.toString());
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                        "NFSShareHandlerImpl.create()", null, properties.toString());
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<NFSShareMO> restManager = new RestManager<NFSShareMO>(NFSShareMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        NFSShareMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * NFS域修改方法
     * @param mo NFS域mo
     * @throws ApiException API自定义异常
     */
    @Override
    public void modify(NFSShareMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
                    "NFSHARE", mo.getId());
                requestBody = new JSONObject();
                requestBody.put(NFSSHARE.TYPE, MOType.SNAS_NFS_SHARE.getValue());
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<NFSShareMO> restManager = new RestManager<NFSShareMO>(NFSShareMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 获取NFS域信息
     * @param id id
     * @return NFS域信息
     * @throws ApiException ApiException API自定义异常
     */
    @Override
    public NFSShareMO get(String id) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "NFSHARE", id);

        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<NFSShareMO> restManager = new RestManager<NFSShareMO>(NFSShareMO.class, getRestRequestHandler(),
            realitivePath, headParamMap, null);
        NFSShareMO resPonsemo = restManager.getGetRequestMO();

        return resPonsemo;
    }

    /**
     * 删除NFS域
     * @param id NFS域ID
     * @throws ApiException API自定义异常
     */
    @Override
    public void delete(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "NFSHARE", id);
        RestManager<NFSShareMO> restManager = new RestManager<NFSShareMO>(NFSShareMO.class, getRestRequestHandler(),
            relativePath, null, null);
        restManager.getDelRequestMO();
    }

    /**
     * 批量查询NFS共享信息
     * @param condition 批量查询过滤条件
     * @return NFS信息
     */
    @Override
    public NFSShareIterator getBatch(NFSShareQuery condition)
    {
        if (null == iterator)
        {
            iterator = new NFSShareIterator(getRestRequestHandler(), getDeviceId(), condition);
        }
        return iterator;
    }

}
