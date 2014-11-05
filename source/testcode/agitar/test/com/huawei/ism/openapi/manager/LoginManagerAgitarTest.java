/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:34:25
 * Time to generate: 00:29.046 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.manager.LoginManager:c204375fc88027fa06e9c7aa1c1b1aec
 *
 */

package com.huawei.ism.openapi.manager;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.exception.ApiMessage;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
import com.huawei.ism.openapi.login.LoginMo;
import java.net.URI;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.json.JSONException;
import org.json.JSONObject;

public class LoginManagerAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return LoginManager.class;
    }
    
    public void testConstructor() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testLoginManagerIp", 100);
        LoginManager loginManager = new LoginManager(restRequestHandler);
        assertSame("loginManager.restRequestHandler", restRequestHandler, getPrivateField(loginManager, "restRequestHandler"));
    }
    
    public void testKeepAliveWithAggressiveMocks() throws Throwable {
        LoginManager loginManager = (LoginManager) Mockingbird.getProxyObject(LoginManager.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        setPrivateField(loginManager, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getGetRequestMO(), null);
        Mockingbird.enterTestMode(LoginManager.class);
        loginManager.keepAlive("");
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testLoginDeviceWithAggressiveMocks() throws Throwable {
        LoginManager loginManager = (LoginManager) Mockingbird.getProxyObject(LoginManager.class, true);
        Mockingbird.enterRecordingMode();
        JSONObject jSONObject = (JSONObject) Mockingbird.getProxyObject(JSONObject.class);
        Mockingbird.replaceObjectForRecording(JSONObject.class, "<init>()", jSONObject);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        setPrivateField(loginManager, "restRequestHandler", null);
        Mockingbird.setReturnValue(jSONObject.put("username", ""), null);
        Mockingbird.setReturnValue(jSONObject.put("password", ""), null);
        Mockingbird.setReturnValue(jSONObject.put("scope", ""), null);
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getPostRequestMO(), null);
        Mockingbird.enterTestMode(LoginManager.class);
        LoginMo result = loginManager.loginDevice("", "", "", "");
        assertNull("result", result);
    }
    
    public void testLogoutDeviceWithAggressiveMocks() throws Throwable {
        LoginManager loginManager = (LoginManager) Mockingbird.getProxyObject(LoginManager.class, true);
        RestRequestHandler restRequestHandler = (RestRequestHandler) Mockingbird.getProxyObject(RestRequestHandler.class);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        setPrivateField(loginManager, "restRequestHandler", restRequestHandler);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, restRequestHandler, "restDelRequest", "(java.lang.String,java.util.Map)org.json.JSONObject", null, 1);
        restRequestHandler.releaseConnection();
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(LoginManager.class);
        loginManager.logoutDevice("");
        assertNull("loginManager.restRequestHandler", getPrivateField(loginManager, "restRequestHandler"));
    }
    
    public void testKeepAliveThrowsApiException() throws Throwable {
        LoginManager loginManager = new LoginManager(null);
        try {
            loginManager.keepAlive("testLoginManagerDeviceId");
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
        }
    }
    
    public void testKeepAliveThrowsIllegalArgumentException() throws Throwable {
        LoginManager loginManager = new LoginManager(new RestRequestHandler("testLoginManagerIp", 100));
        try {
            loginManager.keepAlive("testLoginManager\rDeviceId");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
        }
    }
    
    public void testKeepAliveThrowsNullPointerException() throws Throwable {
        LoginManager loginManager = new LoginManager(new RestRequestHandler("testLoginManagerIp", 100));
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(LoginManager.class);
        try {
            loginManager.keepAlive("testLoginManagerDeviceId");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testLoginDeviceThrowsApiException() throws Throwable {
        LoginManager loginManager = new LoginManager(null);
        try {
            loginManager.loginDevice("testLoginManagerPath", "testLoginManagerUsrName", "testLoginManagerPwd", "testLoginManagerScope");
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
        }
    }
    
    public void testLoginDeviceThrowsApiExceptionWithAggressiveMocks() throws Throwable {
        storeStaticField(ConstantsDefine.ExceptionConstant.class, "JASONEXPMSG");
        LoginManager loginManager = (LoginManager) Mockingbird.getProxyObject(LoginManager.class, true);
        Mockingbird.enterRecordingMode();
        JSONObject jSONObject = (JSONObject) Mockingbird.getProxyObject(JSONObject.class);
        Mockingbird.replaceObjectForRecording(JSONObject.class, "<init>()", jSONObject);
        JSONException jSONException = (JSONException) Mockingbird.getProxyObject(JSONException.class);
        setPrivateField(ConstantsDefine.ExceptionConstant.class, "JASONEXPMSG", Mockingbird.getProxyObject(ApiMessage.class));
        Mockingbird.setReturnValue(jSONObject.put("username", ""), null);
        Mockingbird.setReturnValue(jSONObject.put("password", ""), null);
        Mockingbird.setException(jSONObject.put("scope", ""), jSONException);
        Mockingbird.setReturnValue(jSONException.getMessage(), "");
        Mockingbird.replaceObjectForRecording(ApiException.class, "<init>(com.huawei.ism.openapi.common.exception.ApiMessage,java.lang.Exception)", Mockingbird.getProxyObject(ApiException.class));
        Mockingbird.enterTestMode(LoginManager.class);
        try {
            loginManager.loginDevice("", "", "", "");
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testLoginDeviceThrowsIllegalArgumentException() throws Throwable {
        LoginManager loginManager = new LoginManager(new RestRequestHandler("testLoginManagerIp", 100));
        try {
            loginManager.loginDevice("testLoginManager\rPath", "testLoginManagerUsrName", "testLoginManagerPwd", "testLoginManagerScope");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
        }
    }
    
    public void testLoginDeviceThrowsNullPointerException() throws Throwable {
        LoginManager loginManager = new LoginManager(new RestRequestHandler("testLoginManagerIp", 100));
        Mockingbird.enterRecordingMode();
        Object postRequestMO = ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getPostRequestMO();
        Mockingbird.setException(true, postRequestMO, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(LoginManager.class);
        try {
            loginManager.loginDevice("testLoginManagerPath", "testLoginManagerUsrName", "testLoginManagerPwd", "testLoginManagerScope");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testLogoutDeviceThrowsApiException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("/deviceMnager/rest", 100);
        LoginManager loginManager = new LoginManager(restRequestHandler);
        try {
            loginManager.logoutDevice("testLoginManagerUrlPath");
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            Object privateField = getPrivateField(getPrivateField(loginManager, "restRequestHandler"), "httpClientManager");
            ClientConnectionManager connectionManager = ((HttpClient) getPrivateField(privateField, "httpClient")).getConnectionManager();
            assertNotNull("loginManager.restRequestHandler.httpClientManager.httpClient.getConnectionManager().getSchemeRegistry()", connectionManager.getSchemeRegistry());
            assertEquals("ex.getMessage()", "URI does not specify a valid host name: https:///deviceMnager/rest:100/deviceManager/rest/testLoginManagerUrlPath", ex.getMessage());
            assertThrownBy(RestRequestHandler.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "URI does not specify a valid host name: https:///deviceMnager/rest:100/deviceManager/rest/testLoginManagerUrlPath", ex.getErrMessage().getErrorDescription());
            assertEquals("ex.getException().getClass()", ClientProtocolException.class, ex.getException().getClass());
            assertSame("loginManager.restRequestHandler", restRequestHandler, getPrivateField(loginManager, "restRequestHandler"));
        }
    }
    
    public void testLogoutDeviceThrowsIllegalArgumentException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testLoginManagerIp", 100);
        LoginManager loginManager = new LoginManager(restRequestHandler);
        try {
            loginManager.logoutDevice("testLoginManager\rUrlPath");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertSame("loginManager.restRequestHandler", restRequestHandler, getPrivateField(loginManager, "restRequestHandler"));
        }
    }
    
    public void testLogoutDeviceThrowsNullPointerException() throws Throwable {
        LoginManager loginManager = new LoginManager(null);
        try {
            loginManager.logoutDevice("testLoginManagerUrlPath");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(LoginManager.class, ex);
            assertNull("loginManager.restRequestHandler", getPrivateField(loginManager, "restRequestHandler"));
        }
    }
}
