/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:27:37
 * Time to generate: 00:29.390 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.hardware.controller.ControllerHandlerImpl:b65b4db0f833b164a8fce0afb2be07e8
 * agitar.src.md5=com.huawei.ism.openapi.common.DefaultCommHandler:b6802204ee7c3e439b341a5d028a1348
 *
 */

package com.huawei.ism.openapi.hardware.controller;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ControllerHandlerImplAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return ControllerHandlerImpl.class;
    }
    
    public void testConstructor() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testControllerHandlerImplIp", 100);
        ControllerHandlerImpl controllerHandlerImpl = new ControllerHandlerImpl(restRequestHandler, "testControllerHandlerImplDeviceID");
        assertEquals("controllerHandlerImpl.deviceID", "testControllerHandlerImplDeviceID", getPrivateField(controllerHandlerImpl, "deviceID"));
        assertSame("controllerHandlerImpl.restRequestHandler", restRequestHandler, getPrivateField(controllerHandlerImpl, "restRequestHandler"));
    }
    
    public void testGetBatchWithAggressiveMocks() throws Throwable {
        ControllerHandlerImpl controllerHandlerImpl = (ControllerHandlerImpl) Mockingbird.getProxyObject(ControllerHandlerImpl.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        List list = (List) Mockingbird.getProxyObject(List.class);
        setPrivateField(controllerHandlerImpl, "deviceID", "");
        setPrivateField(controllerHandlerImpl, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getGetRequestMOList(), list);
        Mockingbird.setReturnValue(list.iterator(), null);
        Mockingbird.enterTestMode(ControllerHandlerImpl.class);
        Iterator result = controllerHandlerImpl.getBatch();
        assertNull("result", result);
    }
    
    public void testGetWithAggressiveMocks() throws Throwable {
        ControllerHandlerImpl controllerHandlerImpl = (ControllerHandlerImpl) Mockingbird.getProxyObject(ControllerHandlerImpl.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        setPrivateField(controllerHandlerImpl, "deviceID", "");
        setPrivateField(controllerHandlerImpl, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        HashMap hashMap = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        Mockingbird.replaceObjectForRecording(HashMap.class, "<init>()", hashMap);
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", new Object[] {"ID", ""}, null, 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getGetRequestMO(), null);
        Mockingbird.enterTestMode(ControllerHandlerImpl.class);
        ControllerMO result = controllerHandlerImpl.get("");
        assertNull("result", result);
    }
    
    public void testGetBatchThrowsApiException() throws Throwable {
        try {
            new ControllerHandlerImpl(null, "testControllerHandlerImplDeviceID").getBatch();
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
        }
    }
    
    public void testGetBatchThrowsIllegalArgumentException() throws Throwable {
        ControllerHandlerImpl controllerHandlerImpl = new ControllerHandlerImpl(new RestRequestHandler("testControllerHandlerImpl\rIp", 100), "testControllerHandlerImplDeviceID");
        try {
            controllerHandlerImpl.getBatch();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
        }
    }
    
    public void testGetBatchThrowsNullPointerException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testControllerHandlerImplIp", 100);
        ControllerHandlerImpl controllerHandlerImpl = new ControllerHandlerImpl(restRequestHandler, "testControllerHandlerImplDeviceID");
        Mockingbird.enterRecordingMode();
        Object getRequestMOList = ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMOList();
        Mockingbird.setException(true, getRequestMOList, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(ControllerHandlerImpl.class);
        try {
            controllerHandlerImpl.getBatch();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("controllerHandlerImpl.deviceID", "testControllerHandlerImplDeviceID", getPrivateField(controllerHandlerImpl, "deviceID"));
            assertSame("controllerHandlerImpl.restRequestHandler", restRequestHandler, getPrivateField(controllerHandlerImpl, "restRequestHandler"));
        }
    }
    
    public void testGetThrowsApiException() throws Throwable {
        try {
            new ControllerHandlerImpl(null, "testControllerHandlerImplDeviceID").get("testControllerHandlerImplControllerID");
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
        }
    }
    
    public void testGetThrowsIllegalArgumentException() throws Throwable {
        ControllerHandlerImpl controllerHandlerImpl = new ControllerHandlerImpl(new RestRequestHandler("testControllerHandlerImplIp", 100), "testControllerHandlerImplDeviceID");
        try {
            controllerHandlerImpl.get("testControllerHandlerImpl\rControllerID");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
        }
    }
    
    public void testGetThrowsNullPointerException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testControllerHandlerImplIp", 100);
        ControllerHandlerImpl controllerHandlerImpl = new ControllerHandlerImpl(restRequestHandler, "testControllerHandlerImplDeviceID");
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(ControllerHandlerImpl.class);
        try {
            controllerHandlerImpl.get("testControllerHandlerImplControllerID");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("controllerHandlerImpl.deviceID", "testControllerHandlerImplDeviceID", getPrivateField(controllerHandlerImpl, "deviceID"));
            assertSame("controllerHandlerImpl.restRequestHandler", restRequestHandler, getPrivateField(controllerHandlerImpl, "restRequestHandler"));
        }
    }
}
