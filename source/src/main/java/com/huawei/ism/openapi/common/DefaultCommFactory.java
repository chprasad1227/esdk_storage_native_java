package com.huawei.ism.openapi.common;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.handlercfg.HandlerMaps;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;

/**
 * 创建具体实现类的通用工厂类
 * @author fWX183786
 * @version V100R001C10
 */
public class DefaultCommFactory
{
    private final RestRequestHandler restRequestHandler;

    private final String deviceID;

    /**
     * 构造函数
     * @param restRequestHandler rest请求处理类
     * @param deviceID 设备ID
     */
    public DefaultCommFactory(final RestRequestHandler restRequestHandler, final String deviceID)
    {
        this.restRequestHandler = restRequestHandler;
        this.deviceID = deviceID;
    }

    /**
     * 获取具体实现类的实例
     * @param handlerName 具体处理模块实例名称
     * @return 具体处理模块实例
     * @throws ApiException 异常
     */
    public synchronized Object getHandler(String handlerName) throws ApiException
    {
        Class< ? extends DefaultCommHandler> handlerClass = HandlerMaps.getHandlerMapsInstance().getValue(handlerName);
        if (null == handlerClass)
        {
            return null;
        }

        Class< ? >[] par = new Class[]
        {
            RestRequestHandler.class, String.class 
        };
        Constructor< ? extends DefaultCommHandler> con = null;
        Object obj = null;
        try
        {
            con = handlerClass.getDeclaredConstructor(par);
            if (null != con)
            {
                con.setAccessible(true);
                obj = con.newInstance(restRequestHandler, deviceID);
            }
        }
        catch (SecurityException e)
        {
            ExceptionConstant.SECURITYEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.SECURITYEXPMSG, e);
        }
        catch (NoSuchMethodException e)
        {
            ExceptionConstant.NOMETHODEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.NOMETHODEXPMSG, e);
        }
        catch (IllegalArgumentException e)
        {
            ExceptionConstant.ILLEGALARGEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.ILLEGALARGEXPMSG, e);
        }
        catch (InstantiationException e)
        {
            ExceptionConstant.INSTANTEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.INSTANTEXPMSG, e);
        }
        catch (IllegalAccessException e)
        {
            ExceptionConstant.ILLEGAACCESSEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.ILLEGAACCESSEXPMSG, e);
        }
        catch (InvocationTargetException e)
        {
            ExceptionConstant.INVOCATIONTARGETEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.INVOCATIONTARGETEXPMSG, e);
        }
        return obj;
    }
}
