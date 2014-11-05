/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:32:39
 * Time to generate: 01:01.672 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.hostgroup.HostGroupIterator:86ad9d0ad1c00ea434bedbd760e8feb4
 * agitar.src.md5=com.huawei.ism.openapi.common.batchquery.ApiIterator:592fbb87e71ade6d26e6fe9200d66392
 *
 */

package com.huawei.ism.openapi.hostgroup;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HostGroupIteratorAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return HostGroupIterator.class;
    }
    
    public void testConstructor() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testHostGroupIteratorIp", 100);
        HostGroupQuery queryCondition = new HostGroupQuery(new HostGroupMO(), 100L, 1000L);
        HostGroupIterator hostGroupIterator = new HostGroupIterator(restRequestHandler, "testHostGroupIteratorDeviceID", queryCondition);
        assertNull("hostGroupIterator.headerMap", getPrivateField(hostGroupIterator, "headerMap"));
        assertEquals("hostGroupIterator.totalCount", 0L, ((Number) getPrivateField(hostGroupIterator, "totalCount")).longValue());
        assertSame("hostGroupIterator.restRequestHandler", restRequestHandler, getPrivateField(hostGroupIterator, "restRequestHandler"));
        assertEquals("hostGroupIterator.curIndex", 100L, ((Number) getPrivateField(hostGroupIterator, "curIndex")).longValue());
        assertEquals("hostGroupIterator.deviceID", "testHostGroupIteratorDeviceID", getPrivateField(hostGroupIterator, "deviceID"));
        assertSame("hostGroupIterator.getQuery()", queryCondition, hostGroupIterator.getQuery());
    }
    
    public void testGetConcretCountWithAggressiveMocks() throws Throwable {
        storeStaticField(MOType.class, "HOSTGROUP");
        HostGroupIterator hostGroupIterator = (HostGroupIterator) Mockingbird.getProxyObject(HostGroupIterator.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        HostGroupMO hostGroupMO = (HostGroupMO) Mockingbird.getProxyObject(HostGroupMO.class);
        MO mO = (MO) Mockingbird.getProxyObject(MO.class);
        setPrivateField(hostGroupIterator, "deviceID", "");
        setPrivateField(hostGroupIterator, "queryCondition", null);
        setPrivateField(hostGroupIterator, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(MOType.class, "HOSTGROUP", mOType);
        setPrivateField(mOType, "value", new Integer(0));
        setPrivateField(hostGroupMO, "mo", mO);
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        HashMap hashMap = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        Mockingbird.replaceObjectForRecording(HashMap.class, "<init>()", hashMap);
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getGetRequestMO(), hostGroupMO);
        Mockingbird.setReturnValue(false, mO, "getProperty", "(java.lang.Object)java.lang.Object", "", 1);
        Mockingbird.setReturnValue(true, Long.class, "valueOf", "(java.lang.String)java.lang.Long", new Long(0L), 1);
        Mockingbird.enterTestMode(HostGroupIterator.class);
        long result = hostGroupIterator.getConcretCount();
        assertEquals("result", 0L, result);
        assertNull("hostGroupIterator.headerMap", getPrivateField(hostGroupIterator, "headerMap"));
    }
    
    public void testGetConcretFilterHeaders() throws Throwable {
        HostGroupIterator hostGroupIterator = new HostGroupIterator(new RestRequestHandler("testHostGroupIteratorIp", 100), "testHostGroupIteratorDeviceID", new HostGroupQuery(new HostGroupMO(), 100L, 1000L));
        String[] result = hostGroupIterator.getConcretFilterHeaders();
        assertEquals("result.length", 1, result.length);
        assertEquals("result[0]", "ID", result[0]);
    }
    
    public void testGetConcretMoMap() throws Throwable {
        HostGroupIterator hostGroupIterator = new HostGroupIterator(new RestRequestHandler("testHostGroupIteratorIp", 100), "testHostGroupIteratorDeviceID", new HostGroupQuery(new HostGroupMO(), 100L, 1000L));
        Map result = hostGroupIterator.getConcretMoMap((HostGroupMO) null);
        assertNull("result", result);
    }
    
    public void testGetConcretMoMap1() throws Throwable {
        HostGroupIterator hostGroupIterator = new HostGroupIterator(new RestRequestHandler("testHostGroupIteratorIp", 100), "testHostGroupIteratorDeviceID", new HostGroupQuery(new HostGroupMO(), 100L, 1000L));
        ConcurrentHashMap result = (ConcurrentHashMap) hostGroupIterator.getConcretMoMap(new HostGroupMO());
        assertEquals("result.size()", 1, result.size());
        assertEquals("(ConcurrentHashMap) result.get(\"TYPE\")", new Integer(14), result.get("TYPE"));
    }
    
    public void testGetConcretBatchNextThrowsApiException() throws Throwable {
        HostGroupIterator hostGroupIterator = new HostGroupIterator(null, "testHostGroupIteratorDeviceID", new HostGroupQuery(new HostGroupMO(), 100L, 1000L));
        try {
            hostGroupIterator.getConcretBatchNext();
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
            assertEquals("hostGroupIterator.headerMap.size()", 0, ((Map) getPrivateField(hostGroupIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretBatchNextThrowsIllegalArgumentException() throws Throwable {
        HostGroupMO mo = new HostGroupMO();
        mo.setId("testHostGroupIteratorId");
        HostGroupIterator hostGroupIterator = new HostGroupIterator(new RestRequestHandler("testHostGroupIterator\rIp", 100), "testHostGroupIteratorDeviceID", new HostGroupQuery(mo, 100L, 1000L));
        try {
            hostGroupIterator.getConcretBatchNext();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertEquals("hostGroupIterator.headerMap.size()", 1, ((Map) getPrivateField(hostGroupIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretBatchNextThrowsIllegalArgumentException1() throws Throwable {
        HostGroupIterator hostGroupIterator = new HostGroupIterator(new RestRequestHandler("testHostGroupIteratorIp", 100), "testHostGroupIterator\rDeviceID", new HostGroupQuery(new HostGroupMO(), 100L, 1000L));
        try {
            hostGroupIterator.getConcretBatchNext();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertEquals("hostGroupIterator.headerMap.size()", 0, ((Map) getPrivateField(hostGroupIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretBatchNextThrowsNullPointerException() throws Throwable {
        HostGroupIterator hostGroupIterator = new HostGroupIterator(new RestRequestHandler("testHostGroupIteratorIp", 100), "testHostGroupIteratorDeviceID", new HostGroupQuery(new HostGroupMO(), 100L, 1000L));
        Mockingbird.enterRecordingMode();
        Object getRequestMOList = ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMOList();
        Mockingbird.setException(true, getRequestMOList, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(HostGroupIterator.class);
        try {
            hostGroupIterator.getConcretBatchNext();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("hostGroupIterator.headerMap.size()", 0, ((Map) getPrivateField(hostGroupIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsApiException() throws Throwable {
        HostGroupIterator hostGroupIterator = new HostGroupIterator(null, "testHostGroupIteratorDeviceID", new HostGroupQuery(new HostGroupMO(), 100L, 1000L));
        try {
            hostGroupIterator.getConcretCount();
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
            assertEquals("hostGroupIterator.headerMap.size()", 0, ((Map) getPrivateField(hostGroupIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsIllegalArgumentException() throws Throwable {
        HostGroupMO mo = new HostGroupMO();
        mo.setId("testHostGroupIteratorId");
        HostGroupIterator hostGroupIterator = new HostGroupIterator(new RestRequestHandler("testHostGroupIteratorIp", 100), "testHostGroupIterator\rDeviceID", new HostGroupQuery(mo, 100L, 1000L));
        try {
            hostGroupIterator.getConcretCount();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertEquals("hostGroupIterator.headerMap.size()", 1, ((Map) getPrivateField(hostGroupIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsIllegalArgumentException1() throws Throwable {
        HostGroupIterator hostGroupIterator = new HostGroupIterator(new RestRequestHandler("testHostGroupIteratorIp", 100), "testHostGroupIterator\rDeviceID", new HostGroupQuery(new HostGroupMO(), 100L, 1000L));
        try {
            hostGroupIterator.getConcretCount();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertEquals("hostGroupIterator.headerMap.size()", 0, ((Map) getPrivateField(hostGroupIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsNullPointerException() throws Throwable {
        HostGroupMO mo = new HostGroupMO();
        mo.setId("testHostGroupIteratorId");
        HostGroupIterator hostGroupIterator = new HostGroupIterator(new RestRequestHandler("testHostGroupIteratorIp", 100), "testHostGroupIteratorDeviceID", new HostGroupQuery(mo, 100L, 1000L));
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(HostGroupIterator.class);
        try {
            hostGroupIterator.getConcretCount();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("hostGroupIterator.headerMap.size()", 1, ((Map) getPrivateField(hostGroupIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsNullPointerException1() throws Throwable {
        HostGroupQuery queryCondition = (HostGroupQuery) Mockingbird.getProxyObject(HostGroupQuery.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(queryCondition.getBeginIndex(), -100L);
        Mockingbird.enterTestMode(HostGroupIterator.class);
        HostGroupIterator hostGroupIterator = new HostGroupIterator(null, "testHostGroupIteratorDeviceID", queryCondition);
        Mockingbird.enterRecordingMode();
        Object concretMO = callPrivateMethod("com.huawei.ism.openapi.common.batchquery.QueryBase", "getConcretMO", new Class[] {}, queryCondition, new Object[] {});
        Mockingbird.setReturnValue(concretMO, Mockingbird.getProxyObject(HostGroupMO.class));
        Mockingbird.enterTestMode(HostGroupIterator.class);
        try {
            hostGroupIterator.getConcretCount();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(HostGroupIterator.class, ex);
            assertNull("hostGroupIterator.headerMap", getPrivateField(hostGroupIterator, "headerMap"));
        }
    }
}

