package com.huawei.ism.openapi.manager;

import java.util.HashMap;
import java.util.Map;

import com.huawei.ism.openapi.common.DefaultCommFactory;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.logmanager.LogListener;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.login.LoginMo;

/**
 * 设备管理类
 * @author fWX183786
 * @version V100R001C10
 */
public class DeviceManager
{
    private static final String LONGIN_RELATIVEPATH = "xxxxx/sessions";

    private RestRequestHandler restRequestHandler;

    private LoginManager loginManager = null;

    private DefaultCommFactory handlerFactory = null;

    private Map<String, Object> handlersMap = new HashMap<String, Object>();

    /**
     * 登录成功获取的设备ID
     **/
    private String deviceID = null;

    /**
     * 成功登录服务端后返回的随机数
     */
    private String iBaseTokenString = null;

    /**
     * 域权限
     **/
    private String scope = "0";

    private String userName;

    private String pwd;

    private String ip;

    private int port;

    /**
     * 构造函数
     * @param userName 用户名
     * @param pwd 密码
     * @param ip ip
     * @param port port
     */
    public DeviceManager(String userName, String pwd, String ip, int port)
    {
        this.userName = userName;
        this.pwd = pwd;
        this.ip = ip;
        this.port = port;
        restRequestHandler = new RestRequestHandler(ip, port);
    }

    public DeviceManager(String userName, String pwd, String ip, int port, String acceptLan)
    {
        this.userName = userName;
        this.pwd = pwd;
        this.ip = ip;
        this.port = port;
        restRequestHandler = new RestRequestHandler(ip, port);
        restRequestHandler.setAcceptLan(acceptLan);
    }

    /**
     * 构造函数
     * @param userName 用户名
     * @param pwd 密码
     * @param scope 域权限
     * @param ip ip
     * @param port port
     */
    public DeviceManager(String userName, String pwd, String scope, String ip, int port)
    {
        this.userName = userName;
        this.pwd = pwd;
        this.ip = ip;
        this.port = port;
        this.scope = scope;
        restRequestHandler = new RestRequestHandler(ip, port);
    }

    /**
     * 设置日记的监听器
     * @param listener 日记监听实现类
     */
    public static synchronized void setLogListener(LogListener listener)
    {
        LogUtil.setLogListener(listener);
    }

    /**
     * 获取IP
     * @return ip
     */
    public String getIP()
    {
        return ip;
    }

    /**
     * 获取端口号
     * @return 端口号
     */
    public int getPort()
    {
        return port;
    }

    /**
     * 获取域权限
     * @return 域权限
     */
    public String getScope()
    {
        return scope;
    }

    /**
     * 获取设备ID
     * @return 设备ID
     */
    public String getDeviceId()
    {
        return deviceID;
    }

    /**
     * 设置数据读取超时时间
     * @param socTimeout 数据读取超时时间
     */
    public void setSocTimeout(int socTimeout)
    {
        if (null != restRequestHandler)
        {
            restRequestHandler.setSocTimeout(socTimeout);
        }
    }

    /**
     * 设置连接超时时间
     * @param connectTimerOut 连接超时时间
     */
    public void setConnectionTimeout(int connectTimerOut)
    {
        if (null != restRequestHandler)
        {
            restRequestHandler.setConnectionTimeout(connectTimerOut);
        }
    }

    public void setAcceptLanguage(String acceptLan)
    {
        if (null != restRequestHandler)
        {
            restRequestHandler.setAcceptLan(acceptLan);
        }
    }
    
    /**
     * 登录设备
     * @throws ApiException 异常
     */
    public void loginDevice() throws ApiException
    {
        LoginMo loginMo = getLoginManager().loginDevice(LONGIN_RELATIVEPATH, userName, pwd, scope);
        if (null != loginMo)
        {
            deviceID = loginMo.getDeviceId();
            iBaseTokenString = loginMo.getBaseToken();
            restRequestHandler.setBaseToken(iBaseTokenString);
        }
    }

    /**
     * 登出设备
     * @throws ApiException 异常
     */
    public void logoutDevice() throws ApiException
    {
        getLoginManager().logoutDevice("xxxxx/sessions");
        loginManager = null;
        restRequestHandler = null;
        deviceID = null;
        handlerFactory = null;
    }

    /**
     * 保活接口
     * @throws ApiException 异常
     */
    public void keepAlive() throws ApiException
    {
        getLoginManager().keepAlive(deviceID + "/");
    }

    /**
     * 获取handle的实例
     * @param handlerName 模块名称
     * @return 模块实现类
     * @throws ApiException 异常
     */
    public Object getHandler(String handlerName) throws ApiException
    {
        if (handlersMap.containsKey(handlerName))
        {
            return handlersMap.get(handlerName);
        }
        else
        {
            Object object = getDefaultCommFactory().getHandler(handlerName);
            if (object != null)
            {
                handlersMap.put(handlerName, object);
                return object;
            }
            return null;
        }
    }

    /**
     * 获取登录管理类
     * @return 登录管理类
     */
    private LoginManager getLoginManager()
    {
        if (null == loginManager)
        {
            if (null == restRequestHandler)
            {
                restRequestHandler = new RestRequestHandler(ip, port);
            }
            loginManager = new LoginManager(restRequestHandler);
        }
        return loginManager;
    }

    /**
     * 获取公共工厂类
     * @return 公共工厂类
     */
    private DefaultCommFactory getDefaultCommFactory()
    {
        if (null == handlerFactory)
        {
            handlerFactory = new DefaultCommFactory(restRequestHandler, deviceID);
        }
        return handlerFactory;
    }

    /**
     * 获取rest请求处理类
     * @return rest请求处理类
     */
    protected RestRequestHandler getRestRequestHandler()
    {
        return (null != restRequestHandler) ? restRequestHandler : null;
    }
}
