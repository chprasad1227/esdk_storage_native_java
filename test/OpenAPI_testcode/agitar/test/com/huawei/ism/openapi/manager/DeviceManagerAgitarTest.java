/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:28:11
 * Time to generate: 00:34.969 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.manager.DeviceManager:36401e5da1853903815023aa87a18529
 *
 */

package com.huawei.ism.openapi.manager;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.ethport.ETHPortHandlerImp;
import com.huawei.ism.openapi.fcinitiator.system.systime.SystemTimeHandlerImpl;
import com.huawei.ism.openapi.login.LoginMo;
import java.net.URI;
import java.util.Map;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;

public class DeviceManagerAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return DeviceManager.class;
    }
    
    public void testConstructor() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManagerIp", 100);
        assertEquals("deviceManager.getScope()", "0", deviceManager.getScope());
        assertNull("deviceManager.loginManager", getPrivateField(deviceManager, "loginManager"));
        assertNull("deviceManager.iBaseTokenString", getPrivateField(deviceManager, "iBaseTokenString"));
        assertEquals("deviceManager.getIP()", "testDeviceManagerIp", deviceManager.getIP());
        assertNull("deviceManager.handlerFactory", getPrivateField(deviceManager, "handlerFactory"));
        assertEquals("deviceManager.handlersMap.size()", 0, ((Map) getPrivateField(deviceManager, "handlersMap")).size());
        assertEquals("deviceManager.getPort()", 100, deviceManager.getPort());
        assertNull("deviceManager.getDeviceId()", deviceManager.getDeviceId());
        assertNotNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
        assertEquals("deviceManager.pwd", "testDeviceManagerPwd", getPrivateField(deviceManager, "pwd"));
        assertEquals("deviceManager.userName", "testDeviceManagerUserName", getPrivateField(deviceManager, "userName"));
    }
    
    public void testConstructor1() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManagerScope", "testDeviceManagerIp", 100);
        assertEquals("deviceManager.getScope()", "testDeviceManagerScope", deviceManager.getScope());
        assertNull("deviceManager.loginManager", getPrivateField(deviceManager, "loginManager"));
        assertNull("deviceManager.iBaseTokenString", getPrivateField(deviceManager, "iBaseTokenString"));
        assertEquals("deviceManager.getIP()", "testDeviceManagerIp", deviceManager.getIP());
        assertNull("deviceManager.handlerFactory", getPrivateField(deviceManager, "handlerFactory"));
        assertEquals("deviceManager.handlersMap.size()", 0, ((Map) getPrivateField(deviceManager, "handlersMap")).size());
        assertEquals("deviceManager.getPort()", 100, deviceManager.getPort());
        assertNull("deviceManager.getDeviceId()", deviceManager.getDeviceId());
        assertNotNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
        assertEquals("deviceManager.pwd", "testDeviceManagerPwd", getPrivateField(deviceManager, "pwd"));
        assertEquals("deviceManager.userName", "testDeviceManagerUserName", getPrivateField(deviceManager, "userName"));
    }
    
    public void testGetDeviceId() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManagerScope", "testDeviceManagerIp", 100);
        String result = deviceManager.getDeviceId();
        assertNull("result", result);
    }
    
    public void testGetHandler() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManagerIp", 100);
        ETHPortHandlerImp result = (ETHPortHandlerImp) deviceManager.getHandler("ethport");
        assertNotNull("deviceManager.handlerFactory", getPrivateField(deviceManager, "handlerFactory"));
        assertEquals("deviceManager.handlersMap.size()", 1, ((Map) getPrivateField(deviceManager, "handlersMap")).size());
        assertNotNull("result", result);
    }
    
    public void testGetHandler1() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManagerIp", 100);
        Object result = deviceManager.getHandler("testDeviceManagerHandlerName");
        assertNotNull("deviceManager.handlerFactory", getPrivateField(deviceManager, "handlerFactory"));
        assertNull("result", result);
        assertEquals("deviceManager.handlersMap.size()", 0, ((Map) getPrivateField(deviceManager, "handlersMap")).size());
    }
    
    public void testGetHandler2() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManagerIp", 100);
        SystemTimeHandlerImpl handler = (SystemTimeHandlerImpl) deviceManager.getHandler("SystemTimezone");
        SystemTimeHandlerImpl result = (SystemTimeHandlerImpl) deviceManager.getHandler("SystemTimezone");
        assertSame("result", handler, result);
        assertEquals("deviceManager.handlersMap.size()", 1, ((Map) getPrivateField(deviceManager, "handlersMap")).size());
    }
    
    public void testGetHandler3() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManagerIp", 100);
        deviceManager.getHandler("testDeviceManagerHandlerName");
        Object result = deviceManager.getHandler("testDeviceManagerHandlerName");
        assertNull("result", result);
        assertEquals("deviceManager.handlersMap.size()", 0, ((Map) getPrivateField(deviceManager, "handlersMap")).size());
    }
    
    public void testGetIP() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManagerIp", 100);
        String result = deviceManager.getIP();
        assertEquals("result", "testDeviceManagerIp", result);
    }
    
    public void testGetPort() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManagerIp", 100);
        int result = deviceManager.getPort();
        assertEquals("result", 100, result);
    }
    
    public void testGetScope() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManagerScope", "testDeviceManagerIp", 100);
        String result = deviceManager.getScope();
        assertEquals("result", "testDeviceManagerScope", result);
    }
    
    public void testKeepAliveWithAggressiveMocks() throws Throwable {
        DeviceManager deviceManager = (DeviceManager) Mockingbird.getProxyObject(DeviceManager.class, true);
        Mockingbird.enterRecordingMode();
        Mockingbird.replaceObjectForRecording(RestRequestHandler.class, "<init>(java.lang.String,int)", Mockingbird.getProxyObject(RestRequestHandler.class));
        setPrivateField(deviceManager, "loginManager", null);
        setPrivateField(deviceManager, "restRequestHandler", null);
        setPrivateField(deviceManager, "ip", "");
        setPrivateField(deviceManager, "port", new Integer(0));
        setPrivateField(deviceManager, "deviceID", "");
        LoginManager loginManager = (LoginManager) Mockingbird.getProxyObject(LoginManager.class);
        Mockingbird.replaceObjectForRecording(LoginManager.class, "<init>(com.huawei.ism.openapi.common.commu.rest.RestRequestHandler)", loginManager);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        loginManager.keepAlive("");
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(DeviceManager.class);
        deviceManager.keepAlive();
        assertNotNull("deviceManager.loginManager", getPrivateField(deviceManager, "loginManager"));
        assertNotNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
    }
    
    public void testLoginDeviceWithAggressiveMocks() throws Throwable {
        DeviceManager deviceManager = (DeviceManager) Mockingbird.getProxyObject(DeviceManager.class, true);
        Mockingbird.enterRecordingMode();
        Mockingbird.replaceObjectForRecording(RestRequestHandler.class, "<init>(java.lang.String,int)", Mockingbird.getProxyObject(RestRequestHandler.class));
        LoginMo loginMo = (LoginMo) Mockingbird.getProxyObject(LoginMo.class);
        setPrivateField(deviceManager, "loginManager", null);
        setPrivateField(deviceManager, "restRequestHandler", null);
        setPrivateField(deviceManager, "ip", "");
        setPrivateField(deviceManager, "port", new Integer(0));
        setPrivateField(deviceManager, "userName", "");
        setPrivateField(deviceManager, "pwd", "");
        setPrivateField(deviceManager, "scope", "");
        LoginManager loginManager = (LoginManager) Mockingbird.getProxyObject(LoginManager.class);
        Mockingbird.replaceObjectForRecording(LoginManager.class, "<init>(com.huawei.ism.openapi.common.commu.rest.RestRequestHandler)", loginManager);
        Mockingbird.setReturnValue(false, loginManager, "loginDevice", "(java.lang.String,java.lang.String,java.lang.String,java.lang.String)com.huawei.ism.openapi.login.LoginMo", loginMo, 1);
        Mockingbird.setReturnValue(loginMo.getDeviceId(), "");
        Mockingbird.setReturnValue(loginMo.getBaseToken(), "");
        Mockingbird.enterTestMode(DeviceManager.class);
        deviceManager.loginDevice();
        assertNotNull("deviceManager.loginManager", getPrivateField(deviceManager, "loginManager"));
        assertEquals("deviceManager.iBaseTokenString", "", getPrivateField(deviceManager, "iBaseTokenString"));
        assertEquals("deviceManager.getDeviceId()", "", deviceManager.getDeviceId());
        assertNotNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
    }
    
    public void testLoginDeviceWithAggressiveMocks1() throws Throwable {
        DeviceManager deviceManager = (DeviceManager) Mockingbird.getProxyObject(DeviceManager.class, true);
        Mockingbird.enterRecordingMode();
        Mockingbird.replaceObjectForRecording(RestRequestHandler.class, "<init>(java.lang.String,int)", Mockingbird.getProxyObject(RestRequestHandler.class));
        setPrivateField(deviceManager, "loginManager", null);
        setPrivateField(deviceManager, "restRequestHandler", null);
        setPrivateField(deviceManager, "ip", "");
        setPrivateField(deviceManager, "port", new Integer(0));
        setPrivateField(deviceManager, "userName", "");
        setPrivateField(deviceManager, "pwd", "");
        setPrivateField(deviceManager, "scope", "");
        LoginManager loginManager = (LoginManager) Mockingbird.getProxyObject(LoginManager.class);
        Mockingbird.replaceObjectForRecording(LoginManager.class, "<init>(com.huawei.ism.openapi.common.commu.rest.RestRequestHandler)", loginManager);
        Mockingbird.setReturnValue(false, loginManager, "loginDevice", "(java.lang.String,java.lang.String,java.lang.String,java.lang.String)com.huawei.ism.openapi.login.LoginMo", null, 1);
        Mockingbird.enterTestMode(DeviceManager.class);
        deviceManager.loginDevice();
        assertNotNull("deviceManager.loginManager", getPrivateField(deviceManager, "loginManager"));
        assertNull("deviceManager.iBaseTokenString", getPrivateField(deviceManager, "iBaseTokenString"));
        assertNull("deviceManager.getDeviceId()", deviceManager.getDeviceId());
        assertNotNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
    }
    
    public void testLogoutDeviceWithAggressiveMocks() throws Throwable {
        DeviceManager deviceManager = (DeviceManager) Mockingbird.getProxyObject(DeviceManager.class, true);
        Mockingbird.enterRecordingMode();
        Mockingbird.replaceObjectForRecording(RestRequestHandler.class, "<init>(java.lang.String,int)", Mockingbird.getProxyObject(RestRequestHandler.class));
        setPrivateField(deviceManager, "loginManager", null);
        setPrivateField(deviceManager, "restRequestHandler", null);
        setPrivateField(deviceManager, "ip", "");
        setPrivateField(deviceManager, "port", new Integer(0));
        LoginManager loginManager = (LoginManager) Mockingbird.getProxyObject(LoginManager.class);
        Mockingbird.replaceObjectForRecording(LoginManager.class, "<init>(com.huawei.ism.openapi.common.commu.rest.RestRequestHandler)", loginManager);
        loginManager.logoutDevice("xxxxx/sessions");
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(DeviceManager.class);
        deviceManager.logoutDevice();
        assertNull("deviceManager.loginManager", getPrivateField(deviceManager, "loginManager"));
        assertNull("deviceManager.handlerFactory", getPrivateField(deviceManager, "handlerFactory"));
        assertNull("deviceManager.getDeviceId()", deviceManager.getDeviceId());
        assertNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
    }
    
    public void testSetConnectionTimeout() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManagerIp", 100);
        deviceManager.setConnectionTimeout(100);
        assertNotNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
    }
    
    public void testSetConnectionTimeoutWithAggressiveMocks() throws Throwable {
        DeviceManager deviceManager = (DeviceManager) Mockingbird.getProxyObject(DeviceManager.class, true);
        setPrivateField(deviceManager, "restRequestHandler", null);
        Mockingbird.enterTestMode(DeviceManager.class);
        deviceManager.setConnectionTimeout(0);
        assertNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
    }
    
    public void testSetLogListener() throws Throwable {
        DeviceManager.setLogListener(null);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testSetSocTimeout() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManagerIp", 100);
        deviceManager.setSocTimeout(100);
        assertNotNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
    }
    
    public void testSetSocTimeoutWithAggressiveMocks() throws Throwable {
        DeviceManager deviceManager = (DeviceManager) Mockingbird.getProxyObject(DeviceManager.class, true);
        setPrivateField(deviceManager, "restRequestHandler", null);
        Mockingbird.enterTestMode(DeviceManager.class);
        deviceManager.setSocTimeout(0);
        assertNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
    }
    
    public void testKeepAliveThrowsApiException() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "/", 100);
        try {
            deviceManager.keepAlive();
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            Object privateField = getPrivateField(getPrivateField(deviceManager, "restRequestHandler"), "httpClientManager");
            ClientConnectionManager connectionManager = ((HttpClient) getPrivateField(privateField, "httpClient")).getConnectionManager();
            assertNotNull("deviceManager.restRequestHandler.httpClientManager.httpClient.getConnectionManager().getSchemeRegistry()", connectionManager.getSchemeRegistry());
            assertNotNull("deviceManager.loginManager", getPrivateField(deviceManager, "loginManager"));
            assertEquals("ex.getMessage()", "URI does not specify a valid host name: https:///:100/deviceManager/rest/null/server/loginInfo", ex.getMessage());
            assertThrownBy(RestRequestHandler.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "URI does not specify a valid host name: https:///:100/deviceManager/rest/null/server/loginInfo", ex.getErrMessage().getErrorDescription());
            assertEquals("ex.getException().getClass()", ClientProtocolException.class, ex.getException().getClass());
            assertNotNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
        }
    }
    
    public void testKeepAliveThrowsApiException1() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "/", 100);
        try {
            deviceManager.keepAlive();
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            Object privateField = getPrivateField(getPrivateField(deviceManager, "restRequestHandler"), "httpClientManager");
            ClientConnectionManager connectionManager = ((HttpClient) getPrivateField(privateField, "httpClient")).getConnectionManager();
            assertNotNull("deviceManager.restRequestHandler.httpClientManager.httpClient.getConnectionManager().getSchemeRegistry()", connectionManager.getSchemeRegistry());
            assertNotNull("deviceManager.loginManager", getPrivateField(deviceManager, "loginManager"));
            assertEquals("ex.getMessage()", "URI does not specify a valid host name: https:///:100/deviceManager/rest/null/server/loginInfo", ex.getMessage());
            assertThrownBy(RestRequestHandler.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "URI does not specify a valid host name: https:///:100/deviceManager/rest/null/server/loginInfo", ex.getErrMessage().getErrorDescription());
            assertEquals("ex.getException().getClass()", ClientProtocolException.class, ex.getException().getClass());
            assertNotNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
        }
    }
    
    public void testKeepAliveThrowsIllegalArgumentException() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManager\rIp", 100);
        try {
            deviceManager.keepAlive();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNotNull("deviceManager.loginManager", getPrivateField(deviceManager, "loginManager"));
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertNotNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
        }
    }
    
    public void testLoginDeviceThrowsApiException() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManagerScope", "/d", 100);
        try {
            deviceManager.loginDevice();
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            Object privateField = getPrivateField(getPrivateField(deviceManager, "restRequestHandler"), "httpClientManager");
            ClientConnectionManager connectionManager = ((HttpClient) getPrivateField(privateField, "httpClient")).getConnectionManager();
            assertNotNull("deviceManager.restRequestHandler.httpClientManager.httpClient.getConnectionManager().getSchemeRegistry()", connectionManager.getSchemeRegistry());
            assertNotNull("deviceManager.loginManager", getPrivateField(deviceManager, "loginManager"));
            assertEquals("ex.getMessage()", "URI does not specify a valid host name: https:///d:100/deviceManager/rest/xxxxx/sessions", ex.getMessage());
            assertThrownBy(RestRequestHandler.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "URI does not specify a valid host name: https:///d:100/deviceManager/rest/xxxxx/sessions", ex.getErrMessage().getErrorDescription());
            assertEquals("ex.getException().getClass()", ClientProtocolException.class, ex.getException().getClass());
            assertNull("deviceManager.iBaseTokenString", getPrivateField(deviceManager, "iBaseTokenString"));
            assertNull("deviceManager.getDeviceId()", deviceManager.getDeviceId());
            assertNotNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
        }
    }
    
    public void testLoginDeviceThrowsIllegalArgumentException() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManager\rIp", 100);
        try {
            deviceManager.loginDevice();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNotNull("deviceManager.loginManager", getPrivateField(deviceManager, "loginManager"));
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertNull("deviceManager.iBaseTokenString", getPrivateField(deviceManager, "iBaseTokenString"));
            assertNull("deviceManager.getDeviceId()", deviceManager.getDeviceId());
            assertNotNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
        }
    }
    
    public void testLoginDeviceThrowsIllegalArgumentException1() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManager\rIp", 100);
        try {
            deviceManager.loginDevice();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNotNull("deviceManager.loginManager", getPrivateField(deviceManager, "loginManager"));
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertNull("deviceManager.iBaseTokenString", getPrivateField(deviceManager, "iBaseTokenString"));
            assertNull("deviceManager.getDeviceId()", deviceManager.getDeviceId());
            assertNotNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
        }
    }
    
    public void testLogoutDeviceThrowsApiException() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManagerScope", "/d", 100);
        try {
            deviceManager.logoutDevice();
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            Object privateField = getPrivateField(getPrivateField(deviceManager, "restRequestHandler"), "httpClientManager");
            ClientConnectionManager connectionManager = ((HttpClient) getPrivateField(privateField, "httpClient")).getConnectionManager();
            assertNotNull("deviceManager.restRequestHandler.httpClientManager.httpClient.getConnectionManager().getSchemeRegistry()", connectionManager.getSchemeRegistry());
            assertNotNull("deviceManager.loginManager", getPrivateField(deviceManager, "loginManager"));
            assertEquals("ex.getMessage()", "URI does not specify a valid host name: https:///d:100/deviceManager/rest/xxxxx/sessions", ex.getMessage());
            assertThrownBy(RestRequestHandler.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "URI does not specify a valid host name: https:///d:100/deviceManager/rest/xxxxx/sessions", ex.getErrMessage().getErrorDescription());
            assertEquals("ex.getException().getClass()", ClientProtocolException.class, ex.getException().getClass());
            assertNull("deviceManager.handlerFactory", getPrivateField(deviceManager, "handlerFactory"));
            assertNull("deviceManager.getDeviceId()", deviceManager.getDeviceId());
            assertNotNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
        }
    }
    
    public void testLogoutDeviceThrowsIllegalArgumentException() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManager\rIp", 100);
        try {
            deviceManager.logoutDevice();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNotNull("deviceManager.loginManager", getPrivateField(deviceManager, "loginManager"));
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertNull("deviceManager.handlerFactory", getPrivateField(deviceManager, "handlerFactory"));
            assertNull("deviceManager.getDeviceId()", deviceManager.getDeviceId());
            assertNotNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
        }
    }
    
    public void testLogoutDeviceThrowsIllegalArgumentException1() throws Throwable {
        DeviceManager deviceManager = new DeviceManager("testDeviceManagerUserName", "testDeviceManagerPwd", "testDeviceManager\rIp", 100);
        try {
            deviceManager.logoutDevice();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNotNull("deviceManager.loginManager", getPrivateField(deviceManager, "loginManager"));
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertNull("deviceManager.handlerFactory", getPrivateField(deviceManager, "handlerFactory"));
            assertNull("deviceManager.getDeviceId()", deviceManager.getDeviceId());
            assertNotNull("deviceManager.restRequestHandler", getPrivateField(deviceManager, "restRequestHandler"));
        }
    }
}

