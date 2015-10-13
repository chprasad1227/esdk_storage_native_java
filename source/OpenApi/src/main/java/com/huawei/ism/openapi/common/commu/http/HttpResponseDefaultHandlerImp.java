/**
 * 封装处理HTTP 请求的处理handler
 */

package com.huawei.ism.openapi.common.commu.http;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.cookie.Cookie;
import org.json.JSONException;
import org.json.JSONObject;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.exception.ApiMessage;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;
import com.huawei.ism.openapi.common.logmanager.LogUtil;

/**
 * 默认的Http请求处理类
 * @author fWX183786
 * @version V100R001C10
 */
public class HttpResponseDefaultHandlerImp implements
    HttpResponseHandler<JSONObject>
{
    /**
     * Http 请求的具体处理方法
     * @param response Http请求返回类
     * @param cookie Cookie
     * @return Http请求的数据（Json数据类型）
     * @throws ApiException 异常
     */
    @Override
    public JSONObject handleResponse(HttpResponse response, Cookie cookie)
        throws ApiException
    {
        StatusLine statusLine = response.getStatusLine();
        HttpEntity entity = response.getEntity();
        JSONObject mResponseJason = null;
        InputStream inputStream = null;
        ApiException apiException = null;

        if (null != statusLine)
        {
            String responseInfo = String.format("StatusCode[%d]",
                statusLine.getStatusCode());
            LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                responseInfo);
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 1,
                    "HttpResponseDefaultHandlerImp.handleResponse()", null, null, statusLine.getStatusCode()+"");// zWX228053

            if (statusLine.getStatusCode() >= HttpStatus.SC_MULTIPLE_CHOICES)
            {
                ApiMessage msgApiMessage = new ApiMessage(
                    statusLine.getStatusCode(), statusLine.getReasonPhrase(),
                    "please check the server");
                apiException = new ApiException(msgApiMessage);
                LogUtil.getLogUtilInstance().showStackTrace(apiException);
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_ERROR, 1, 
                        "HttpResponseDefaultHandlerImp.handleResponse()",
                        null, null,"HttpStatus:" + statusLine.getStatusCode() + ", please check the server");// zWX228053
                throw apiException;
            }
        }

        if (null == entity || !entity.isStreaming())
        {
            ExceptionConstant.CLIENTPROTOLEXPMSG
                .setErrDescription("Response contains no content");
            apiException = new ApiException(
                ExceptionConstant.HTTPRESPONSEEXPMSG);
            LogUtil.getLogUtilInstance().showStackTrace(apiException);
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_ERROR, 1, 
                    "HttpResponseDefaultHandlerImp.handleResponse()", null,
                    ExceptionConstant.CLIENTPROTOLEXPMSG + "", "Response contains no content");// zWX228053
            throw apiException;
        }

        String inputString = null;
        try
        {
            inputStream = entity.getContent();
            inputString = IOUtils.toString(inputStream, "UTF-8");
            if (inputString.length() > 0)
            {
                mResponseJason = new JSONObject(inputString);
            }
        }
        catch (IOException e1)
        {
            ExceptionConstant.IOEXPMSG.setErrDescription(e1.getMessage());
            apiException = new ApiException(ExceptionConstant.IOEXPMSG, e1);
            LogUtil.getLogUtilInstance().showStackTrace(apiException);
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_ERROR, 1, 
                    "HttpResponseDefaultHandlerImp.handleResponse()", null,
                    null, "IOException:Failed to get content stream.");// zWX228053
            throw apiException;
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            apiException = new ApiException(ExceptionConstant.JASONEXPMSG, e);
            LogUtil.getLogUtilInstance().showStackTrace(apiException);
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_ERROR, 1, 
                    "HttpResponseDefaultHandlerImp.handleResponse()", null,
                    null, "JSONException: Failed to create the JSONObject.[InputString:"
                    + inputString +"]");// zWX228053
            throw apiException;
        }
        finally
        {
//             closeReader(buferReader);
            closeStream(inputStream);
        }

        return mResponseJason;
    }

    private void closeStream(InputStream inputStream)
    {
        if (null != inputStream)
        {
            try
            {
                inputStream.close();
            }
            catch (IOException e)
            {
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_ERROR,
                    e.getMessage());
                LogUtil.getLogUtilInstance().showRunningtLog(LOG_TYPE_E.LOG_ERROR,
                        "HttpResponseDefaultHandlerImp.closeStream()", "IOException: Failed to close the input stream.");// zWX228053
            }
        }
    }
}