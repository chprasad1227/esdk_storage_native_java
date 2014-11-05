package com.huawei.ism.openapi.nas.localresuser;

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
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.LOCALRESUSER;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 接口实现
 * @author gWX183785
 * @version V100R001C10
 */
public class LocalResuserHandlerImpl extends DefaultCommHandler implements LocalResuserHandler
{
    private LocalResuserIterator iterator = null;

    /**
     * 本地资源用户接口实现类
     * @param restRequestHandler rest请求
     * @param deviceID 设备id
     */
    protected LocalResuserHandlerImpl(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 本地资源用户修改方法
     * @param mo 本地资源用户对象
     * @throws ApiException API自定义异常
     */
    @Override
    public void modify(LocalResuserMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
                    "local_resuser", mo.getId());
                requestBody = new JSONObject();
                requestBody.put(LOCALRESUSER.TYPE, MOType.LOCAL_RESUSER.getValue());
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<LocalResuserMO> restManager = new RestManager<LocalResuserMO>(LocalResuserMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 获取本地资源用户信息
     * @param id id
     * @return 本地资源用户信息
     * @throws ApiException ApiException API自定义异常
     */
    @Override
    public LocalResuserMO get(String id) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "local_resuser", id);

        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<LocalResuserMO> restManager = new RestManager<LocalResuserMO>(LocalResuserMO.class,
            getRestRequestHandler(), realitivePath, headParamMap, null);
        LocalResuserMO resPonsemo = restManager.getGetRequestMO();

        return resPonsemo;
    }

    /**
     * 批量查询本地资源用户信息
     * @param condition 批量查询条件
     * @return 返回结果
     */
    @Override
    public LocalResuserIterator getBatch(LocalResuserQuery condition)
    {
        if (null == iterator)
        {
            iterator = new LocalResuserIterator(getRestRequestHandler(), getDeviceId(), condition, false);
        }
        return iterator;
    }

    /**
     * 创建本地资源用户
     * @param mo 本地资源用户mo
     * @return 本地资源用户数据对象
     * @throws ApiException API自定义异常
     */
    @Override
    public LocalResuserMO create(LocalResuserMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "local_resuser");

        JSONObject requestBody = new JSONObject();
        if (null != mo)
        {
            // 遍历属性数组
            Map<Object, Object> properties = mo.getMO().getProperties();
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            LogUtil.getLogUtilInstance()
                .showLog(LOG_TYPE_E.LOG_INFO, "the request params is " + requestBody.toString());
        }

        RestManager<LocalResuserMO> restManager = new RestManager<LocalResuserMO>(LocalResuserMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        LocalResuserMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * 创建本地资源用户
     * @param id id
     * @throws ApiException API自定义异常
     */
    @Override
    public void delete(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "local_resuser",
            id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(LOCALRESUSER.TYPE, String.valueOf(MOType.LOCAL_RESUSER.getValue()));

        RestManager<LocalResuserMO> restManager = new RestManager<LocalResuserMO>(LocalResuserMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 通过本地资源组查询本地资源用户
     * @param localResuserGroupId 本地资源组
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    public LocalResuserIterator getLocalResuserByLocalResGroup(String localResuserGroupId, LocalResuserQuery condition)
        throws ApiException
    {
        if (null == condition)
        {
            LocalResuserMO mo = new LocalResuserMO();
            mo.setAssociateOBJId(localResuserGroupId);
            mo.setAssociateOBJType(MOType.LOCAL_RESGROUP);
            condition = new LocalResuserQuery(mo, 0, 100);
            return getAssociateBatch(condition);
        }
        LocalResuserMO mo = condition.getLocalResuserMO();
        if (null == mo)
        {
            mo = new LocalResuserMO();
        }
        mo.setAssociateOBJId(localResuserGroupId);
        mo.setAssociateOBJType(MOType.LOCAL_RESGROUP);
        condition.setQueryLocalResuserMO(mo);
        return getAssociateBatch(condition);
    }

    private LocalResuserIterator getAssociateBatch(LocalResuserQuery condition)
    {
        if (null == iterator)
        {
            iterator = new LocalResuserIterator(getRestRequestHandler(), getDeviceId(), condition, true);
        }
        return iterator;
    }

}
