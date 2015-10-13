package com.huawei.ism.openapi.common.commu.rest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.exception.ApiMessage;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.TLVMOMsg;
import com.huawei.ism.openapi.common.logmanager.LogUtil;

/**
 * rest 请求管理类
 * @author fWX183786
 * @version V100R001C10
 * @param <T> 具体模块实现类的Class对象
 */
public class RestManager<T>
{
    private final RestRequestHandler restRequestHandler;

    private final String relativePath;

    private final Map<String, String> headerParams;

    private final JSONObject body;

    private final Class<T> objClass;

    private Object jContents = null;

    /** 判断为JSON对象还是JSON数组 ,默认为JSON对象 **/
    private boolean isJsonArray = false;

    /** 服务端返回的错误码 **/
    private int errorCode = -1;

    /**
     * Http 请求类型
     * @author fWX183786
     * @version V100R001C10
     */
    enum HttpRequestType
    {
        GET_REQUEST, POST_REQUEST, PUT_REQUEST, DEL_REQUEST;
    }

    /**
     * 构造函数
     * @param objImpClass 具体模块实现类的Class对象
     * @param restRequestHandler rest请求处理类
     * @param relativePath Http Url相对路径
     * @param headerParams Http 请求的头参数
     * @param body Http请求正文
     */
    public RestManager(Class<T> objImpClass, RestRequestHandler restRequestHandler, String relativePath,
        Map<String, String> headerParams, JSONObject body)
    {
        this.objClass = objImpClass;
        this.restRequestHandler = restRequestHandler;
        this.relativePath = relativePath;
        this.headerParams = headerParams;
        this.body = body;
    }

    /**
     * 获取具体模块Http GET请求返回数据对象
     * @return 具体模块Http GET 请求返回数据对象
     * @throws ApiException 异常
     */
    public T getGetRequestMO() throws ApiException
    {
        getHttpRequestResult(HttpRequestType.GET_REQUEST);
        return (T) formModelMo(objClass);
    }

    /**
     * 获取具体模块Http POST请求返回数据对象
     * @return 具体模块Http POST 请求返回数据对象
     * @throws ApiException 异常
     */
    public T getPostRequestMO() throws ApiException
    {
        getHttpRequestResult(HttpRequestType.POST_REQUEST);
        return (T) formModelMo(objClass);
    }

    /**
     * 获取具体模块Http PUT请求返回数据对象
     * @return 具体模块Http PUT请求返回数据对象
     * @throws ApiException 异常
     */
    public T getPutRequestMO() throws ApiException
    {
        getHttpRequestResult(HttpRequestType.PUT_REQUEST);
        return (T) formModelMo(objClass);
    }

    /**
     * 获取具体模块Http Delete请求返回数据对象
     * @return 具体模块Http Delete请求返回数据对象
     * @throws ApiException 异常
     */
    public T getDelRequestMO() throws ApiException
    {
        getHttpRequestResult(HttpRequestType.DEL_REQUEST);
        return (T) formModelMo(objClass);
    }

    /**
     * 获取具体模块的 Http Get 请求返回的数据对象数组
     * @return 具体模块的 Http Get 请求返回的数据对象数组
     * @throws ApiException 异常
     */
    public List<T> getGetRequestMOList() throws ApiException
    {
        getHttpRequestResult(HttpRequestType.GET_REQUEST);
        return formModelMoList(objClass);
    }

    /**
     * 获取具体模块的 Http Post 请求返回的数据对象数组
     * @return 具体模块的 Http Post 请求返回的数据对象数组
     * @throws ApiException 异常
     */
    public List<T> getPostRequestMOList() throws ApiException
    {
        getHttpRequestResult(HttpRequestType.POST_REQUEST);
        return formModelMoList(objClass);
    }

    /**
     * 获取具体模块的 Http Put 请求返回的数据对象数组
     * @return 具体模块的 Http Put 请求返回的数据对象数组
     * @throws ApiException 异常
     */
    public List<T> getPutRequestMOList() throws ApiException
    {
        getHttpRequestResult(HttpRequestType.PUT_REQUEST);
        return formModelMoList(objClass);
    }

    /**
     * 获取具体模块的 Http Del 请求返回的数据对象数组
     * @return 具体模块的 Http Del 请求返回的数据对象数组
     * @throws ApiException 异常
     */
    public List<T> getDelRequestMOList() throws ApiException
    {
        getHttpRequestResult(HttpRequestType.DEL_REQUEST);
        return formModelMoList(objClass);
    }

    /**
     * 组装具体模块的数据对象
     * @param objImpClass 具体模块实现类Class对象
     * @return 具体模块的数据对象
     * @throws ApiException 异常
     */
    private T formModelMo(Class<T> objImpClass) throws ApiException
    {
        if (null == jContents)
        {
            return null;
        }

        JSONObject jObject = null;
        if (!isJsonArray)
        {
            jObject = (JSONObject) jContents;
        }
        if (isJsonArray && 1 == ((JSONArray) jContents).length()) // JSONArray
        {
            try
            {
                jObject = ((JSONArray) jContents).getJSONObject(0);
            }
            catch (JSONException e)
            {
                ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
                throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
            }
        }
        return formModelItem(objImpClass, jObject);
    }

    /**
     * 组装具体模块的单个数据对象
     * @param objImpClass 具体模块的实现类Class
     * @param jObject Http 请求返回的JSON 数据
     * @return 具体模块的单个数据对象
     * @throws ApiException 异常
     */
    private T formModelItem(Class<T> objImpClass, JSONObject jObject) throws ApiException
    {
        if (null == jObject)
        {
            return null;
        }

        Class< ? >[] par = new Class[] {JSONObject.class};
        Constructor<T> con;
        T obj = null;
        try
        {
            con = objImpClass.getDeclaredConstructor(par);
            if (con != null)
            {
                con.setAccessible(true);
                obj = (T) con.newInstance(jObject);
            }
            return obj;
        }
        catch (NoSuchMethodException e)
        {
            ExceptionConstant.NOMETHODEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.NOMETHODEXPMSG, e);
        }
        catch (SecurityException e)
        {
            ExceptionConstant.SECURITYEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.SECURITYEXPMSG, e);
        }
        catch (InstantiationException e)
        {
            ExceptionConstant.INSTANTEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.INSTANTEXPMSG, e);
        }
        catch (IllegalArgumentException e)
        {
            ExceptionConstant.ILLEGALARGEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.ILLEGALARGEXPMSG, e);
        }
        catch (InvocationTargetException e)
        {
            ExceptionConstant.INVOCATIONTARGETEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.INVOCATIONTARGETEXPMSG, e);
        }
        catch (IllegalAccessException e)
        {
            ExceptionConstant.ILLEGAACCESSEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.ILLEGAACCESSEXPMSG, e);
        }
    }

    /**
     * 组装具体模块的数据对象数组
     * @param objImpClass 具体模块实现的类Class
     * @return 具体模块的数据对象数组
     * @throws ApiException 异常
     */
    private List<T> formModelMoList(Class<T> objImpClass) throws ApiException
    {
        if (!isJsonArray)
        {
            return null;
        }
        List<T> moList = new ArrayList<T>();
        JSONArray array = (JSONArray) jContents;
        if (array != null)
        {
            try
            {
                for (int i = 0; i < array.length(); i++)
                {
                    moList.add((T) formModelItem(objImpClass, array.getJSONObject(i)));
                }
            }
            catch (JSONException e)
            {
                ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
                throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
            }
        }
        return (!moList.isEmpty()) ? moList : null;
    }

    /**
     * 解析Http 请求的返回数据
     * @param jObject Http请求返回的数据
     * @throws ApiException 异常
     */
    private void resolveResponse(JSONObject jObject) throws ApiException
    {
        if (null == jObject)
        {
            return;
        }
        try
        {
            JSONObject errJsonObject = jObject.getJSONObject(ConstantsDefine.IsmJsonFieldConstant.ERROR);

            errorCode = (Integer) errJsonObject.getInt(ConstantsDefine.IsmJsonFieldConstant.CODE);
            if (errorCode == ConstantsDefine.HttpErrorConstant.OK)
            {
                if (jObject.has(ConstantsDefine.IsmJsonFieldConstant.DATA)
                    && null != jObject.get(ConstantsDefine.IsmJsonFieldConstant.DATA))
                {
                    jContents = jObject.get(ConstantsDefine.IsmJsonFieldConstant.DATA);
                    if (jContents instanceof JSONObject)
                    {
                        isJsonArray = false;
                    }
                    else if (jContents instanceof JSONArray)
                    {
                        isJsonArray = true;
                    }
                    else
                    {
                        isJsonArray = false;
                    }
                }
            }
            else
            {
                jContents = errJsonObject;
                String description = null;
                String suggest = null;
                ApiException apiException = null;
                if (errJsonObject.has(TLVMOMsg.ERRORDESCRIPTION))
                {
                    description = (String) errJsonObject.get(TLVMOMsg.ERRORDESCRIPTION);
                }
                if (errJsonObject.has(TLVMOMsg.ERRORSUGGESTION))
                {
                    suggest = (String) errJsonObject.get(TLVMOMsg.ERRORSUGGESTION);
                }
                apiException = new ApiException(new ApiMessage(errorCode, description, suggest));
                LogUtil.getLogUtilInstance().showStackTrace(apiException);
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_ERROR, 2,
                        "RestManager.resolveResponse()", null, errorCode+"", "the restRequestHandler is null");// zWX228053
                throw apiException;
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }
    }

    /**
     * Http请求
     * @param requestType Http 请求类型
     * @throws ApiException 异常
     */
    private void getHttpRequestResult(HttpRequestType requestType) throws ApiException
    {
        ApiException apiException = null;
        if (null == restRequestHandler)
        {
            ExceptionConstant.NULLPOINTEREXPMSG.setErrDescription("the restRequestHandler is null");
            apiException = new ApiException(ExceptionConstant.NULLPOINTEREXPMSG);
            LogUtil.getLogUtilInstance().showStackTrace(apiException);
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_ERROR, 2,
                    "RestManager.getHttpRequestResult()", null, null, "the restRequestHandler is null");// zWX228053
            throw apiException;
        }

        JSONObject responseJsonObject = null;
        String responseInfo = null;

        switch (requestType)
        {
            case GET_REQUEST:
                responseJsonObject = restRequestHandler.restGetRequest(relativePath, headerParams);
                break;
            case POST_REQUEST:
                responseJsonObject = restRequestHandler.restPostRequest(relativePath, headerParams, body);
                break;
            case PUT_REQUEST:
                responseJsonObject = restRequestHandler.restPutRequest(relativePath, headerParams, body);
                break;
            case DEL_REQUEST:
                responseJsonObject = restRequestHandler.restDelRequest(relativePath, headerParams);
                break;
            default:
                break;
        }
        if (null != responseJsonObject)
        {
            responseInfo = String.format("responseEntity[%s]", responseJsonObject.toString());
            LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO, responseInfo);
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 1,
                    "RestManager.getHttpRequestResult()", null, null, responseInfo);// zWX228053
        }
        else
        {
            responseInfo = String.format("responseEntity is null");
            LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO, responseInfo);
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 1,
                    "RestManager.getHttpRequestResult()", null, null, "the responseEntity is null");// zWX228053
        }
        resolveResponse(responseJsonObject);
    }
}
