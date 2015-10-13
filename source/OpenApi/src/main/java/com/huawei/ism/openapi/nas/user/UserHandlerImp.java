package com.huawei.ism.openapi.nas.user;

import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
import com.huawei.ism.openapi.nas.quota.QuotaMO;

/**
 * 用户的接口实现类
 */
public class UserHandlerImp extends DefaultCommHandler implements UserHandler
{
    private UserIterator userIterator;

    /**
     * 构造函数
     * @param restRequestHandler rest 请求处理类
     * @param deviceID 设备ID
     */
    protected UserHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建用户
     * @param mo 用户数据对象
     * @return 用户数据对象
     * @throws ApiException 异常
     */
    @Override
    public UserMO create(UserMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "user");
        JSONObject requestBody = null;
        if (null != mo)
        {
            requestBody = new JSONObject();
            Map<Object, Object> properties = mo.getMO().getProperties();
            LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO, "the request params is " + properties.toString());
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                    "UserHandlerImp.create()", null, properties);//zwx228053
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
        }

        RestManager<UserMO> restManager = new RestManager<UserMO>(UserMO.class, getRestRequestHandler(), relativePath,
            null, requestBody);
        UserMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * 删除用户
     * @param userId 用户id
     * @throws ApiException 异常
     */
    @Override
    public void delete(String userId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "user", userId);

        RestManager<QuotaMO> restManager = new RestManager<QuotaMO>(QuotaMO.class, getRestRequestHandler(),
            relativePath, null, null);
        restManager.getDelRequestMO();
    }

    /**
     * 获取用户信息
     * @param userID 用户ID return 用户数据对象
     * @return 用户信息
     * @throws ApiException 异常
     */
    @Override
    public UserMO get(String userID) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "user", userID);
        RestManager<UserMO> restManager = new RestManager<UserMO>(UserMO.class, getRestRequestHandler(), relativePath,
            null, null);
        UserMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo;
    }

    /**
     * 获取用户批量查询迭代器
     * @param mo 查询条件
     * @return 用户列表
     * @throws ApiException 异常
     */
    @Override
    public List<UserMO> getBatch(UserMO mo) throws ApiException
    {
        if (null == userIterator)
        {
            userIterator = new UserIterator(getRestRequestHandler(), getDeviceId(), mo);
        }
        return userIterator.getBatchNext();
    }

}
