/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:41:04
 * Time to generate: 00:24.828 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.fcinitiator.system.systime.SystemTimeHandlerImpl:a3f29e1886ec6a9ad20619f0f2dcc6c0
 * agitar.src.md5=com.huawei.ism.openapi.common.DefaultCommHandler:b6802204ee7c3e439b341a5d028a1348
 *
 */

package com.huawei.ism.openapi.fcinitiator.system.systime;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
import java.net.URI;

public class SystemTimeHandlerImplAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return SystemTimeHandlerImpl.class;
    }
    
    public void testConstructor() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testSystemTimeHandlerImplIp", 100);
        SystemTimeHandlerImpl systemTimeHandlerImpl = new SystemTimeHandlerImpl(restRequestHandler, "testSystemTimeHandlerImplDeviceID");
        assertEquals("systemTimeHandlerImpl.deviceID", "testSystemTimeHandlerImplDeviceID", getPrivateField(systemTimeHandlerImpl, "deviceID"));
        assertSame("systemTimeHandlerImpl.restRequestHandler", restRequestHandler, getPrivateField(systemTimeHandlerImpl, "restRequestHandler"));
    }
    
    public void testGetSystemTimeWithAggressiveMocks() throws Throwable {
        SystemTimeHandlerImpl systemTimeHandlerImpl = (SystemTimeHandlerImpl) Mockingbird.getProxyObject(SystemTimeHandlerImpl.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        setPrivateField(systemTimeHandlerImpl, "deviceID", "");
        setPrivateField(systemTimeHandlerImpl, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getGetRequestMO(), null);
        Mockingbird.enterTestMode(SystemTimeHandlerImpl.class);
        SystemTimeMO result = systemTimeHandlerImpl.getSystemTime();
        assertNull("result", result);
    }
    
    public void testGetSystemTimeThrowsApiException() throws Throwable {
        try {
            new SystemTimeHandlerImpl(null, "testSystemTimeHandlerImplDeviceID").getSystemTime();
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
        }
    }
    
    public void testGetSystemTimeThrowsIllegalArgumentException() throws Throwable {
        SystemTimeHandlerImpl systemTimeHandlerImpl = new SystemTimeHandlerImpl(new RestRequestHandler("testSystemTimeHandlerImplIp", 100), "testSystemTimeHandlerImpl\rDeviceID");
        try {
            systemTimeHandlerImpl.getSystemTime();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
        }
    }
    
    public void testGetSystemTimeThrowsNullPointerException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testSystemTimeHandlerImplIp", 100);
        SystemTimeHandlerImpl systemTimeHandlerImpl = new SystemTimeHandlerImpl(restRequestHandler, "testSystemTimeHandlerImplDeviceID");
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(SystemTimeHandlerImpl.class);
        try {
            systemTimeHandlerImpl.getSystemTime();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("systemTimeHandlerImpl.deviceID", "testSystemTimeHandlerImplDeviceID", getPrivateField(systemTimeHandlerImpl, "deviceID"));
            assertSame("systemTimeHandlerImpl.restRequestHandler", restRequestHandler, getPrivateField(systemTimeHandlerImpl, "restRequestHandler"));
        }
    }
}
