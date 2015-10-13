package com.huawei.ism.openapi.manager;

import org.json.JSONException;
import org.json.JSONObject;

import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
import com.huawei.ism.openapi.login.LoginMo;

/**
 * 登录管理类
 * @author fWX183786
 * @version V100R001C10
 */
public class LoginManager
{
    private RestRequestHandler restRequestHandler;

    /**
     * 构造函数
     * @param restRequestHandler rest 请求处理类
     */
    protected LoginManager(RestRequestHandler restRequestHandler)
    {
        this.restRequestHandler = restRequestHandler;
    }

    /**
     * 登录设备
     * @param path 登录设备URL相对路径
     * @param usrName 用户名
     * @param pwd 密码
     * @param scope 域权限
     * @return 登录数据对象
     * @throws ApiException 异常
     */
    protected LoginMo loginDevice(String path, String usrName, String pwd, String scope) throws ApiException
    {
        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put("username", usrName);
            requestBody.put("password", pwd);
            requestBody.put("scope", scope);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(path);

        RestManager<LoginMo> moUtil = new RestManager<LoginMo>(LoginMo.class, restRequestHandler, relativePath, null,
            requestBody);
        LoginMo resPonsemo = moUtil.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * 登出设备
     * @param urlPath 登录设备URL相对路径
     * @throws ApiException 异常
     */
    protected void logoutDevice(String urlPath) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(urlPath);
        restRequestHandler.restDelRequest(relativePath, null);

        restRequestHandler.releaseConnection();
        restRequestHandler = null;
    }

    /**
     * 保活接口，获取登录信息
     * @param deviceId 设备ID
     * @throws ApiException 异常
     */
    protected void keepAlive(String deviceId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(deviceId + "server/loginInfo");
        RestManager<LoginMo> moUtil = new RestManager<LoginMo>(LoginMo.class, restRequestHandler, relativePath, null,
            null);
        moUtil.getGetRequestMO();
    }
}
