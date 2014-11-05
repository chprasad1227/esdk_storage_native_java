package com.huawei.ism.openapi.common.commu.http;

import org.apache.http.HttpResponse;
import org.apache.http.cookie.Cookie;
import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * Http请求处理类模板
 * @author fWX183786
 * @version V100R001C10
 * @param <T> 返回数据类型的格式
 */
public interface HttpResponseHandler<T>
{
    /**
     * 处理HTTP请求的返回数据
     * @param response http请求返回类
     * @param cookie Cookie
     * @return Http 请求返回数据
     * @throws ApiException 异常
     */
    T handleResponse(HttpResponse response, Cookie cookie) throws ApiException;
}
