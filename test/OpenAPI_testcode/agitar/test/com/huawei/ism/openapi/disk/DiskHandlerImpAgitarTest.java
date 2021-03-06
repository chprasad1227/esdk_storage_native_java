/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:28:04
 * Time to generate: 00:22.407 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.disk.DiskHandlerImp:b1f53964ab9917c55d042fb79357ca82
 * agitar.src.md5=com.huawei.ism.openapi.common.DefaultCommHandler:b6802204ee7c3e439b341a5d028a1348
 *
 */

package com.huawei.ism.openapi.disk;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
import java.net.URI;
import java.util.HashMap;

public class DiskHandlerImpAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return DiskHandlerImp.class;
    }
    
    public void testConstructor() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testDiskHandlerImpIp", 100);
        DiskHandlerImp diskHandlerImp = new DiskHandlerImp(restRequestHandler, "testDiskHandlerImpDeviceID");
        assertNull("diskHandlerImp.diskIterator", getPrivateField(diskHandlerImp, "diskIterator"));
        assertEquals("diskHandlerImp.deviceID", "testDiskHandlerImpDeviceID", getPrivateField(diskHandlerImp, "deviceID"));
        assertSame("diskHandlerImp.restRequestHandler", restRequestHandler, getPrivateField(diskHandlerImp, "restRequestHandler"));
    }
    
    public void testGetBatch() throws Throwable {
        DiskHandlerImp diskHandlerImp = new DiskHandlerImp(new RestRequestHandler("testDiskHandlerImpIp", 100), "testDiskHandlerImpDeviceID");
        DiskIterator result = diskHandlerImp.getBatch(new DiskQuery(new DiskMO(), 100L, 1000L));
        assertSame("diskHandlerImp.diskIterator", result, getPrivateField(diskHandlerImp, "diskIterator"));
        assertEquals("result.getConcretFilterHeaders().length", 2, result.getConcretFilterHeaders().length);
    }
    
    public void testGetBatch1() throws Throwable {
        DiskHandlerImp diskHandlerImp = new DiskHandlerImp(new RestRequestHandler("testDiskHandlerImpIp", 100), "testDiskHandlerImpDeviceID");
        DiskQuery condition = new DiskQuery(new DiskMO(), 100L, 1000L);
        DiskIterator batch = diskHandlerImp.getBatch(condition);
        DiskIterator result = diskHandlerImp.getBatch(condition);
        assertSame("result", batch, result);
    }
    
    public void testGetWithAggressiveMocks() throws Throwable {
        storeStaticField(MOType.class, "DISK");
        DiskHandlerImp diskHandlerImp = (DiskHandlerImp) Mockingbird.getProxyObject(DiskHandlerImp.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        setPrivateField(diskHandlerImp, "deviceID", "");
        setPrivateField(diskHandlerImp, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(MOType.class, "DISK", mOType);
        setPrivateField(mOType, "value", new Integer(0));
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        HashMap hashMap = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        Mockingbird.replaceObjectForRecording(HashMap.class, "<init>()", hashMap);
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", new Object[] {"ID", ""}, null, 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getGetRequestMO(), null);
        Mockingbird.enterTestMode(DiskHandlerImp.class);
        DiskMO result = diskHandlerImp.get("");
        assertNull("result", result);
    }
    
    public void testGetThrowsApiException() throws Throwable {
        try {
            new DiskHandlerImp(null, "testDiskHandlerImpDeviceID").get("testDiskHandlerImpId");
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
        }
    }
    
    public void testGetThrowsIllegalArgumentException() throws Throwable {
        DiskHandlerImp diskHandlerImp = new DiskHandlerImp(new RestRequestHandler("testDiskHandlerImpIp", 100), "testDiskHandlerImpDeviceID");
        try {
            diskHandlerImp.get("testDiskHandlerImp\rId");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
        }
    }
    
    public void testGetThrowsNullPointerException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testDiskHandlerImpIp", 100);
        DiskHandlerImp diskHandlerImp = new DiskHandlerImp(restRequestHandler, "testDiskHandlerImpDeviceID");
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(DiskHandlerImp.class);
        try {
            diskHandlerImp.get("testDiskHandlerImpId");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("diskHandlerImp.deviceID", "testDiskHandlerImpDeviceID", getPrivateField(diskHandlerImp, "deviceID"));
            assertSame("diskHandlerImp.restRequestHandler", restRequestHandler, getPrivateField(diskHandlerImp, "restRequestHandler"));
        }
    }
}

