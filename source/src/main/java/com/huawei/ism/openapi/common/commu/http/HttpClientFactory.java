package com.huawei.ism.openapi.common.commu.http;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParamBean;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;

/**
 * HttpClient 工厂类
 * @author fWX183786
 * @version V100R001C10
 */

public class HttpClientFactory
{
    private static final int MAX_HOST = 200; // 最大主机数

    private static final int NAX_PERROUTE = 10; // 最大路由数

    private static final int HTTP_PORT = 80;

    private static final int HTTPS_PORT = 443;

    private static final int SOCKET_TIMEOUT = 10 * 1000; // 默认的数据读取超时时间

    private static final int CONNECT_TIMEOUT = 10 * 1000; // 默认的连接超时时间

    private HttpClient httpClientInstance = null;

    private int socketTimeOut = SOCKET_TIMEOUT; // 读取数据超时

    private int connectTimeOut = CONNECT_TIMEOUT; // 设置连接超时的时间

    /**
     * TLS/SSL 主机认证的管理
     */
    private static X509TrustManager manager = new X509TrustManager()
    {
        @Override
        public X509Certificate[] getAcceptedIssuers()
        {
            return new java.security.cert.X509Certificate[0];
        }

        @Override
        public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException
        {
            return;
        }

        @Override
        public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException
        {
            return;
        }
    };

    /**
     * 设置数据读取超时时间
     * @param socTimeout 数据读取超时时间
     */
    public void setSocTimeout(int socTimeout)
    {
        this.socketTimeOut = socTimeout;
        if (null != httpClientInstance)
        {
            httpClientInstance.getParams().setIntParameter(CoreConnectionPNames.SO_TIMEOUT, socTimeout);
        }
    }

    /**
     * 设置连接超时时间
     * @param connTimeOut 连接超时时间
     */
    public void setConnectionTimeout(int connTimeOut)
    {
        this.connectTimeOut = connTimeOut;
        if (null != httpClientInstance)
        {
            httpClientInstance.getParams().setIntParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, connectTimeOut);
        }
    }

    /**
     * 创建HttpClient实例
     * @return HttpClient实例
     * @throws ApiException 异常
     */
    public HttpClient createHttpClient() throws ApiException
    {
        SSLContext sslcontext = null;
        try
        {
            sslcontext = SSLContext.getInstance("TLS");
            sslcontext.init(null, new TrustManager[]
            {manager}, null);
        }
        catch (NoSuchAlgorithmException e)
        {
            ExceptionConstant.NOALGORITHMEXP.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.NOALGORITHMEXP, e);
        }
        catch (KeyManagementException e)
        {
            ExceptionConstant.KEYMANAGEEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.KEYMANAGEEXPMSG, e);
        }

        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", HTTP_PORT, PlainSocketFactory.getSocketFactory()));
        schemeRegistry.register(new Scheme("https", HTTPS_PORT, new SSLSocketFactory(sslcontext,
            SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER)));

        PoolingClientConnectionManager connManager = new PoolingClientConnectionManager(schemeRegistry);
        connManager.setMaxTotal(MAX_HOST);
        connManager.setDefaultMaxPerRoute(NAX_PERROUTE);

        HttpParams params = new BasicHttpParams();
        HttpProtocolParamBean paramsBean = new HttpProtocolParamBean(params);
        paramsBean.setVersion(HttpVersion.HTTP_1_1);
        paramsBean.setContentCharset("UTF-8");
        paramsBean.setUseExpectContinue(true);

        params.setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, connectTimeOut);
        params.setParameter(CoreConnectionPNames.SO_TIMEOUT, socketTimeOut);

        DefaultHttpClient client = new DefaultHttpClient(connManager, params);
        httpClientInstance = client;
        return httpClientInstance;
    }

    /**
     * 销毁HttpClient实例
     */
    public void releaseHttpClient()
    {
        httpClientInstance.getConnectionManager().shutdown(); // 关闭连接
        httpClientInstance = null;
    }
}
