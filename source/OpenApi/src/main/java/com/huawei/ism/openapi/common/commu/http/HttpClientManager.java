package com.huawei.ism.openapi.common.commu.http;

import org.apache.http.client.HttpClient;
import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * HttpClient 管理类
 * @author fWX183786
 * @version V100R001C10
 */
public class HttpClientManager
{
    private HttpClientFactory httpClientFactory = new HttpClientFactory();

    private HttpClient httpClient = null;

    /**
     * 获取HttpClient 实例
     * @return HttpClient 实例
     * @throws ApiException 异常
     */
    public HttpClient getHttpClient() throws ApiException
    {
        if (null == httpClient)
        {
            httpClient = httpClientFactory.createHttpClient();
        }
        return httpClient;
    }

    /**
     * 销毁HttpClient实例
     */
    public void releaseHttpClient()
    {
        httpClientFactory.releaseHttpClient();
        httpClient = null;
    }

    /**
     * 设置数据读取超时时间
     * @param socTimeout 数据读取超时时间
     */
    public void setSocTimeout(int socTimeout)
    {
        if (null != httpClientFactory)
        {
            httpClientFactory.setSocTimeout(socTimeout);
        }
    }

    /**
     * 设置连接超时时间
     * @param connectTimerOut 连接超时时间
     */
    public void setConnectionTimeout(int connectTimerOut)
    {
        if (null != httpClientFactory)
        {
            httpClientFactory.setConnectionTimeout(connectTimerOut);
        }
    }
}
