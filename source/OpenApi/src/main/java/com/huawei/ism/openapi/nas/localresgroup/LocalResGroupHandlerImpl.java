package com.huawei.ism.openapi.nas.localresgroup;

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
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.LOCALRESGROUP;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 接口实现
 * @author gWX183785
 * @version V100R001C10
 */
public class LocalResGroupHandlerImpl extends DefaultCommHandler implements
    LocalResGroupHandler
{
    private LocalResGroupIterator iterator = null;

    /**
     * 本地资源组接口实现类
     * @param restRequestHandler rest请求
     * @param deviceID 设备id
     */
    protected LocalResGroupHandlerImpl(RestRequestHandler restRequestHandler,
        String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 本地资源组修改方法
     * @param mo 本地资源组对象
     * @throws ApiException API自定义异常
     */
    @Override
    public void modify(LocalResGroupMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance()
                    .composeRelativeUri(getDeviceId(), "local_resgroup", mo.getId());
                requestBody = new JSONObject();
                requestBody.put(LOCALRESGROUP.TYPE,
                    MOType.LOCAL_RESGROUP.getValue());
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(
                    requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<LocalResGroupMO> restManager = new RestManager<LocalResGroupMO>(
            LocalResGroupMO.class, getRestRequestHandler(), relativePath, null,
            requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 获取本地资源组信息
     * @param id id
     * @return 本地资源组信息
     * @throws ApiException ApiException API自定义异常
     */
    @Override
    public LocalResGroupMO get(String id) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "local_resgroup", id);

        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<LocalResGroupMO> restManager = new RestManager<LocalResGroupMO>(
            LocalResGroupMO.class, getRestRequestHandler(), realitivePath,
            headParamMap, null);
        LocalResGroupMO resPonsemo = restManager.getGetRequestMO();

        return resPonsemo;
    }

    /**
     * 批量查询本地资源组信息
     * @param condition 批量查询条件
     * @return 返回结果
     */
    @Override
    public LocalResGroupIterator getBatch(LocalResGroupQuery condition)
    {
        if (null == iterator)
        {
            iterator = new LocalResGroupIterator(getRestRequestHandler(),
                getDeviceId(), condition);
        }
        return iterator;
    }

    /**
     * 创建本地资源组
     * @param mo 本地资源组mo
     * @return 本地资源组数据对象
     * @throws ApiException API自定义异常
     */
    @Override
    public LocalResGroupMO create(LocalResGroupMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "local_resgroup");

        JSONObject requestBody = new JSONObject();
        if (null != mo)
        {
            // 遍历属性数组
            Map<Object, Object> properties = mo.getMO().getProperties();
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody,
                properties);
            LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                "the request params is " + requestBody.toString());
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                    "LocalResGroupHandlerImpl.create()", null, properties.toString());
        }

        RestManager<LocalResGroupMO> restManager = new RestManager<LocalResGroupMO>(
            LocalResGroupMO.class, getRestRequestHandler(), relativePath, null,
            requestBody);
        LocalResGroupMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * 创建本地资源组
     * @param id id
     * @throws ApiException API自定义异常
     */
    @Override
    public void delete(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "local_resgroup", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(LOCALRESGROUP.TYPE,
            String.valueOf(MOType.LOCAL_RESGROUP.getValue()));

        RestManager<LocalResGroupMO> restManager = new RestManager<LocalResGroupMO>(
            LocalResGroupMO.class, getRestRequestHandler(), relativePath,
            headParamMap, null);
        restManager.getDelRequestMO();
    }

}
