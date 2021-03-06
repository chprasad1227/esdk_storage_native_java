/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:37:52
 * Time to generate: 00:30.375 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.perfstatistic.PerfStatisticHandlerImp:982bb42353578f6cbe47f75be490d655
 * agitar.src.md5=com.huawei.ism.openapi.common.DefaultCommHandler:b6802204ee7c3e439b341a5d028a1348
 *
 */

package com.huawei.ism.openapi.perfstatistic;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
import java.net.URI;
import java.util.HashMap;

public class PerfStatisticHandlerImpAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return PerfStatisticHandlerImp.class;
    }
    
    public void testConstructor() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testPerfStatisticHandlerImpIp", 100);
        PerfStatisticHandlerImp perfStatisticHandlerImp = new PerfStatisticHandlerImp(restRequestHandler, "testPerfStatisticHandlerImpDeviceID");
        assertEquals("perfStatisticHandlerImp.deviceID", "testPerfStatisticHandlerImpDeviceID", getPrivateField(perfStatisticHandlerImp, "deviceID"));
        assertSame("perfStatisticHandlerImp.restRequestHandler", restRequestHandler, getPrivateField(perfStatisticHandlerImp, "restRequestHandler"));
    }
    
    public void testGetCurStatisticDataMOWithAggressiveMocks() throws Throwable {
        PerfStatisticHandlerImp perfStatisticHandlerImp = (PerfStatisticHandlerImp) Mockingbird.getProxyObject(PerfStatisticHandlerImp.class, true);
        PerfStatisticMO perfStatisticMO = (PerfStatisticMO) Mockingbird.getProxyObject(PerfStatisticMO.class);
        MO mO = (MO) Mockingbird.getProxyObject(MO.class);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        OpenApiUtils openApiUtils2 = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        setPrivateField(perfStatisticHandlerImp, "deviceID", "");
        setPrivateField(perfStatisticHandlerImp, "restRequestHandler", null);
        setPrivateField(perfStatisticMO, "mo", mO);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(mO, "properties", null);
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        HashMap hashMap = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        Mockingbird.replaceObjectForRecording(HashMap.class, "<init>()", hashMap);
        Mockingbird.setReturnValue(perfStatisticMO.getUuId(), "");
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils2);
        Mockingbird.setReturnValue(false, openApiUtils2, "convertToStringMaps", "(java.util.Map)java.util.Map", null, 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getGetRequestMO(), null);
        Mockingbird.enterTestMode(PerfStatisticHandlerImp.class);
        PerfStatisticMO result = perfStatisticHandlerImp.getCurStatisticDataMO(perfStatisticMO);
        assertNull("result", result);
    }
    
    public void testGetCurStatisticDataMOThrowsApiException() throws Throwable {
        try {
            new PerfStatisticHandlerImp(null, "testPerfStatisticHandlerImpDeviceID").getCurStatisticDataMO(null);
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
        }
    }
    
    public void testGetCurStatisticDataMOThrowsIllegalArgumentException() throws Throwable {
        PerfStatisticHandlerImp perfStatisticHandlerImp = new PerfStatisticHandlerImp(new RestRequestHandler("testPerfStatisticHandlerImp\rIp", 100), "testPerfStatisticHandlerImpDeviceID");
        PerfStatisticMO mo = new PerfStatisticMO();
        try {
            perfStatisticHandlerImp.getCurStatisticDataMO(mo);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertEquals("mo.getMO().getProperties().size()", 0, mo.getMO().getProperties().size());
        }
    }
    
    public void testGetCurStatisticDataMOThrowsNullPointerException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testPerfStatisticHandlerImpIp", 100);
        PerfStatisticHandlerImp perfStatisticHandlerImp = new PerfStatisticHandlerImp(restRequestHandler, "testPerfStatisticHandlerImpDeviceID");
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(PerfStatisticHandlerImp.class);
        try {
            perfStatisticHandlerImp.getCurStatisticDataMO(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("perfStatisticHandlerImp.deviceID", "testPerfStatisticHandlerImpDeviceID", getPrivateField(perfStatisticHandlerImp, "deviceID"));
            assertSame("perfStatisticHandlerImp.restRequestHandler", restRequestHandler, getPrivateField(perfStatisticHandlerImp, "restRequestHandler"));
        }
    }
}

