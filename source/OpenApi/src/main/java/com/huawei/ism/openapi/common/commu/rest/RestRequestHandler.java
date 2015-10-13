package com.huawei.ism.openapi.common.commu.rest;

import java.io.IOException;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.json.JSONObject;
import com.huawei.ism.openapi.common.commu.http.HttpClientManager;
import com.huawei.ism.openapi.common.commu.http.HttpResponseDefaultHandlerImp;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.AcceptLanguage;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.HttpHeaderFields;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;
import com.huawei.ism.openapi.common.logmanager.LogUtil;

/**
 * Http 请求的封装类
 * @author fWX183786
 * @version V100R001C10
 */
public class RestRequestHandler
{
    private final String ip;

    private final int port;

    private String iBaseToken;

    private String acceptLan = AcceptLanguage.LAN_CH;

    public void setAcceptLan(String acceptLan)
    {
        this.acceptLan = acceptLan;
    }

    private HttpClientManager httpClientManager = new HttpClientManager();

    /**
     * 构造函数
     * @param ip ip
     * @param port port
     */
    public RestRequestHandler(String ip, int port)
    {
        this.ip = ip;
        this.port = port;
    }

    /**
     * Http Get请求封装
     * @param relativePath URL相对路径
     * @param headerParams Http URL 参数
     * @return Http 请求返回数据
     * @throws ApiException 异常
     */
    public JSONObject restGetRequest(String relativePath, Map<String, String> headerParams) throws ApiException
    {
        return restGetOrDelRequest(true, relativePath, headerParams);
    }

    private JSONObject restGetOrDelRequest(Boolean isGet, String relativePath, Map<String, String> headerParams)
        throws ApiException
    {
        String uri = composeUri(ip, port, relativePath, headerParams);
        HttpRequestBase method = null;
        if (isGet)
        {
            method = new HttpGet(uri);
        }
        else
        {
            method = new HttpDelete(uri);
        }
        setHttpRequstConfigure(method);
        JSONObject jsonObject = null;
        HttpResponse response = null;

        String requeInfoString = String.format("uri[%s]", uri);
         LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO, requeInfoString);
        LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                "RestRequestHandler.restGetOrDelRequest()", ip, requeInfoString);// zWX228053

        try
        {
            response = httpClientManager.getHttpClient().execute(method);
            jsonObject = new HttpResponseDefaultHandlerImp().handleResponse(response, null);
        }
        catch (ClientProtocolException e)
        {
            ExceptionConstant.CLIENTPROTOLEXPMSG.setErrDescription(e.getMessage());
            ApiException apiException = new ApiException(ExceptionConstant.CLIENTPROTOLEXPMSG, e);
            LogUtil.getLogUtilInstance().showStackTrace(apiException);
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_ERROR, 1,
                    "RestRequestHandler.restGetOrDelRequest()", null, "2130000010",
                    "ClientProtocolException: Failed to fetch the response message when send a get or del request. ");// zWX228053
            throw apiException;
        }
        catch (IOException e)
        {
            ExceptionConstant.IOEXPMSG.setErrDescription(e.getMessage());
            ApiException apiException = new ApiException(ExceptionConstant.IOEXPMSG, e);
            LogUtil.getLogUtilInstance().showStackTrace(apiException);
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_ERROR, 1,
                    "RestRequestHandler.restGetOrDelRequest()", null, "2130000010", 
                    "IOException: Failed to fetch the response message when send a get or del request.");// zWX228053
            throw apiException;
        }
        finally
        {
            method.releaseConnection();
        }
        return jsonObject;
    }

    /**
     * Http Post 请求封装
     * @param relativePath URL 相对路径
     * @param headerParams Http URL 参数
     * @param body Http请求正文
     * @return Http 请求返回数据
     * @throws ApiException 异常
     */
    public JSONObject restPostRequest(String relativePath, Map<String, String> headerParams, JSONObject body)
        throws ApiException
    {
        String uri = composeUri(ip, port, relativePath, headerParams);
        HttpPost method = new HttpPost(uri);
        setHttpRequstConfigure(method); // 设置request的参数
        JSONObject jsonObject = null;
        HttpResponse response = null;
        ApiException apiException = null;

        String requeInfo = String.format("uri[%s]", uri);
        LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 
                2, "RestRequestHandler.restPostRequest()", ip, requeInfo);// zWX228053
        try
        {
            if (null != body)
            {
                requeInfo = String.format("the request body is [%s]", body.toString());
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO, requeInfo);// zWX228053
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2, 
                        "RestRequestHandler.restPostRequest()", ip, body);
                StringEntity bodyEntity = new StringEntity(body.toString(), ConstantsDefine.HttpCfgConstant.UTF8);
                bodyEntity.setContentType(HttpHeaderFields.APP_JSON);
                method.setEntity(bodyEntity);
            }
            response = httpClientManager.getHttpClient().execute(method);
            jsonObject = new HttpResponseDefaultHandlerImp().handleResponse(response, null);
        }
        catch (ClientProtocolException exception)
        {
            ExceptionConstant.CLIENTPROTOLEXPMSG.setErrDescription(exception.getMessage());
            apiException = new ApiException(ExceptionConstant.CLIENTPROTOLEXPMSG, exception);
            LogUtil.getLogUtilInstance().showStackTrace(apiException);
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_ERROR, 1,
                    "RestRequestHandler.restPostRequest()", null, "2130000010",
                    "ClientProtocolException: Failed to fetch the response message when send a post request.");// zWX228053
            throw apiException;

        }
        catch (IOException exception)
        {
            ExceptionConstant.IOEXPMSG.setErrDescription(exception.getMessage());
            apiException = new ApiException(ExceptionConstant.IOEXPMSG, exception);
            LogUtil.getLogUtilInstance().showStackTrace(apiException);
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_ERROR, 1,
                    "RestRequestHandler.restPostRequest()", null, "2130000010",
                    "IOException: Failed to fetch the response message when send a post request.");// zWX228053
            throw apiException;
        }
        finally
        {
            method.releaseConnection();
        }
        return jsonObject;
    }

    /**
     * Http Put 请求封装
     * @param relativePath URL 相对路径
     * @param headerParams Http URL 参数
     * @param body Http请求正文
     * @return Http请求返回数据
     * @throws ApiException 异常
     */
    public JSONObject restPutRequest(String relativePath, Map<String, String> headerParams, JSONObject body)
        throws ApiException
    {
        String uri = composeUri(ip, port, relativePath, headerParams);

        HttpPut method = new HttpPut(uri);
        setHttpRequstConfigure(method);
        JSONObject jsonObject = null;
        HttpResponse response = null;
        ApiException apiException = null;

        String requeInfo = String.format("uri[%s]", uri);
        LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO,
                2, "RestRequestHandler.restPutRequest()", ip, requeInfo);// zwx228053

        StringEntity bodyStringEntity;
        try
        {
            if (body != null)
            {
                requeInfo = String.format("the request body is [%s]", body.toString());
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO, requeInfo);
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2, 
                        "RestRequestHandler.restPutRequest()", ip, body.toString());// zWX228053
                bodyStringEntity = new StringEntity(body.toString(), ConstantsDefine.HttpCfgConstant.UTF8);
                bodyStringEntity.setContentType(HttpHeaderFields.APP_JSON);
                method.setEntity(bodyStringEntity);
            }
            response = httpClientManager.getHttpClient().execute(method);
            jsonObject = new HttpResponseDefaultHandlerImp().handleResponse(response, null);
        }
        catch (IOException e)
        {
            ExceptionConstant.IOEXPMSG.setErrDescription(e.getMessage());
            apiException = new ApiException(ExceptionConstant.IOEXPMSG, e);
            LogUtil.getLogUtilInstance().showStackTrace(apiException);
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_ERROR, 2,
                    "RestRequestHandler.restPutRequest()", null, "2130000010",
                    "IOException: Failed to fetch the response message when send a put request.");// zWX228053
            throw apiException;

        }
        finally
        {
            method.releaseConnection();
        }
        return jsonObject;
    }

    /**
     * Http Del请求封装
     * @param relativePath URL相对路径
     * @param headerParams Http URL 参数
     * @return Http 请求请求返回数据
     * @throws ApiException 异常
     */
    public JSONObject restDelRequest(String relativePath, Map<String, String> headerParams) throws ApiException
    {
        return restGetOrDelRequest(false, relativePath, headerParams);
    }

    /**
     * 设置数据读取超时时间
     * @param socTimeout 数据读取超时时间
     */
    public void setSocTimeout(int socTimeout)
    {
        if (null != httpClientManager)
        {
            httpClientManager.setSocTimeout(socTimeout);
        }
    }

    /**
     * 设置连接超时时间
     * @param connectTimerOut 连接超时时间
     */
    public void setConnectionTimeout(int connectTimerOut)
    {
        if (null != httpClientManager)
        {
            httpClientManager.setConnectionTimeout(connectTimerOut);
        }
    }

    /**
     * 释放HttpClient连接
     */
    public void releaseConnection()
    {
        httpClientManager.releaseHttpClient();
        httpClientManager = null;
    }

    /**
     * 设置HTTP请求的头
     * @param httpBaseToken 登录服务端后返回的随机数
     */
    public void setBaseToken(String httpBaseToken)
    {
        this.iBaseToken = httpBaseToken;
    }

    /**
     * 设置具体的请求头参数
     * @param request Http请求
     */
    private void setHttpRequstConfigure(HttpRequestBase request)
    {
        request.setHeader(HttpHeaderFields.CONTENT_TYPE, HttpHeaderFields.APP_JSON);
        request.setHeader(HttpHeaderFields.ACCEPT_LAN, acceptLan);
        if (null != iBaseToken)
        {
            request.setHeader(HttpHeaderFields.IBASETOKEN, iBaseToken);
        }
    }

    /**
     * 组装HTTP 请求的URL
     * @param hostIp ip
     * @param hostPort port
     * @param relativePath URL相对路径
     * @param headParams Http URL 参数
     * @return http 请求完整路径
     */
    private String composeUri(String hostIp, int hostPort, String relativePath, Map<String, String> headParams)
    {
        String uri = ConstantsDefine.HttpCfgConstant.HTTPS_HEAD + hostIp + ":" + hostPort
            + ConstantsDefine.HttpCfgConstant.HTTP_REST_PATH + relativePath;
        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append(uri);

        if (null != headParams && !headParams.isEmpty())
        {
            strBuffer.append('?');
            int size = headParams.entrySet().size();
            int index = 0;

            for (Map.Entry<String, String> entry : headParams.entrySet())
            {
                String key = (String) entry.getKey();
                String value = (String) entry.getValue();
                strBuffer.append(key + "=" + value);
                index++;
                if (index != size)
                {
                    strBuffer.append('&');
                }
            }
        }
        return strBuffer.toString();
    }

}