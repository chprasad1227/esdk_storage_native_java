package com.huawei.ism.openapi.nas.cifsshare;

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
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.CIFSSHARE;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * CIFS共享对外开放接口的实现类
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class CIFSShareHandlerImpl extends DefaultCommHandler implements CIFSShareHandler
{
    private CIFSShareIterator iterator = null;

    /**
     * CIFS共享实现类的构造函数
     * @param restRequestHandler rest请求
     * @param deviceID 网元ID
     */
    protected CIFSShareHandlerImpl(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建CIFS共享
     * @param mo CIFS域mo
     * @return CIFS域信息
     * @throws ApiException API自定义异常
     */
    @Override
    public CIFSShareMO create(CIFSShareMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "CIFSHARE");

        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(CIFSSHARE.TYPE, MOType.SNAS_CIFS_SHARE.getValue());

            if (null != mo)
            {
                Map<Object, Object> properties = mo.getMO().getProperties();
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + properties.toString());
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                        "CIFSShareHandlerImpl.create()", null, properties.toString());
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<CIFSShareMO> restManager = new RestManager<CIFSShareMO>(CIFSShareMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        CIFSShareMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * CIFS域修改方法
     * @param mo CIFS域mo
     * @throws ApiException API自定义异常
     */
    @Override
    public void modify(CIFSShareMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
                    "CIFSHARE", mo.getId());
                requestBody = new JSONObject();
                requestBody.put(CIFSSHARE.TYPE, MOType.SNAS_CIFS_SHARE.getValue());
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<CIFSShareMO> restManager = new RestManager<CIFSShareMO>(CIFSShareMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 获取CIFS域信息
     * @param id id
     * @return CIFS域信息
     * @throws ApiException ApiException API自定义异常
     */
    @Override
    public CIFSShareMO get(String id) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "CIFSHARE", id);

        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<CIFSShareMO> restManager = new RestManager<CIFSShareMO>(CIFSShareMO.class, getRestRequestHandler(),
            realitivePath, headParamMap, null);
        CIFSShareMO resPonsemo = restManager.getGetRequestMO();

        return resPonsemo;
    }

    /**
     * 删除CIFS域
     * @param id CIFS域ID
     * @throws ApiException API自定义异常
     */
    @Override
    public void delete(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "CIFSHARE", id);
        RestManager<CIFSShareMO> restManager = new RestManager<CIFSShareMO>(CIFSShareMO.class, getRestRequestHandler(),
            relativePath, null, null);
        restManager.getDelRequestMO();
    }

    /**
     * 批量查询
     * @param condition 批量查询过滤条件
     * @return 批量查询返回值
     */
    @Override
    public CIFSShareIterator getBatch(CIFSShareQuery condition)
    {
        if (null == iterator)
        {
            iterator = new CIFSShareIterator(getRestRequestHandler(), getDeviceId(), condition);
        }
        return iterator;
    }

}
