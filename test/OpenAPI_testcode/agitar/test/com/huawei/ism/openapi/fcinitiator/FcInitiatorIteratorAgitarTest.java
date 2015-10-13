/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:31:22
 * Time to generate: 00:56.047 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.fcinitiator.FcInitiatorIterator:b275e9694feb5dbca05e0a10fd48543e
 * agitar.src.md5=com.huawei.ism.openapi.common.batchquery.ApiIterator:592fbb87e71ade6d26e6fe9200d66392
 *
 */

package com.huawei.ism.openapi.fcinitiator;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.huawei.ism.openapi.common.batchquery.QueryBase;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class FcInitiatorIteratorAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return FcInitiatorIterator.class;
    }
    
    public void testConstructor() throws Throwable {
        FcInitiatorQuery queryCondition = new FcInitiatorQuery(new FcInitiatorMO(new JSONObject()), 100L, 1000L);
        RestRequestHandler restRequestHandler = new RestRequestHandler("testFcInitiatorIteratorIp", 100);
        FcInitiatorIterator fcInitiatorIterator = new FcInitiatorIterator(restRequestHandler, "testFcInitiatorIteratorDeviceID", queryCondition);
        assertNull("fcInitiatorIterator.headerMap", getPrivateField(fcInitiatorIterator, "headerMap"));
        assertEquals("fcInitiatorIterator.totalCount", 0L, ((Number) getPrivateField(fcInitiatorIterator, "totalCount")).longValue());
        assertSame("fcInitiatorIterator.restRequestHandler", restRequestHandler, getPrivateField(fcInitiatorIterator, "restRequestHandler"));
        assertEquals("fcInitiatorIterator.curIndex", 100L, ((Number) getPrivateField(fcInitiatorIterator, "curIndex")).longValue());
        assertEquals("fcInitiatorIterator.deviceID", "testFcInitiatorIteratorDeviceID", getPrivateField(fcInitiatorIterator, "deviceID"));
        assertSame("fcInitiatorIterator.getQuery()", queryCondition, fcInitiatorIterator.getQuery());
    }
    
    public void testGetConcretBatchNextWithAggressiveMocks() throws Throwable {
        storeStaticField(MOType.class, "FC_INITIATOR");
        FcInitiatorIterator fcInitiatorIterator = (FcInitiatorIterator) Mockingbird.getProxyObject(FcInitiatorIterator.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        setPrivateField(fcInitiatorIterator, "deviceID", "");
        setPrivateField(fcInitiatorIterator, "queryCondition", null);
        setPrivateField(fcInitiatorIterator, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(MOType.class, "FC_INITIATOR", mOType);
        setPrivateField(mOType, "value", new Integer(0));
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        HashMap hashMap = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        Mockingbird.replaceObjectForRecording(HashMap.class, "<init>()", hashMap);
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getGetRequestMOList(), null);
        Mockingbird.enterTestMode(FcInitiatorIterator.class);
        List result = fcInitiatorIterator.getConcretBatchNext();
        assertNull("result", result);
        assertNull("fcInitiatorIterator.headerMap", getPrivateField(fcInitiatorIterator, "headerMap"));
    }
    
    public void testGetConcretCountWithAggressiveMocks() throws Throwable {
        storeStaticField(MOType.class, "FC_INITIATOR");
        FcInitiatorIterator fcInitiatorIterator = (FcInitiatorIterator) Mockingbird.getProxyObject(FcInitiatorIterator.class, true);
        QueryBase queryBase = (QueryBase) Mockingbird.getProxyObject(QueryBase.class);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        OpenApiUtils openApiUtils2 = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        FcInitiatorMO fcInitiatorMO = (FcInitiatorMO) Mockingbird.getProxyObject(FcInitiatorMO.class);
        MO mO = (MO) Mockingbird.getProxyObject(MO.class);
        setPrivateField(fcInitiatorIterator, "deviceID", "");
        setPrivateField(fcInitiatorIterator, "queryCondition", queryBase);
        setPrivateField(fcInitiatorIterator, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        Mockingbird.enterNormalMode();
        callPrivateMethod("com.huawei.ism.openapi.common.batchquery.QueryBase", "setConcretQueryMO", new Class[] {Object.class}, queryBase, new Object[] {obj});
        setPrivateField(MOType.class, "FC_INITIATOR", mOType);
        setPrivateField(mOType, "value", new Integer(0));
        setPrivateField(fcInitiatorMO, "mo", mO);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        HashMap hashMap = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        Mockingbird.replaceObjectForRecording(HashMap.class, "<init>()", hashMap);
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils2);
        Mockingbird.setReturnValue(false, fcInitiatorIterator, "getHeadMap", "(java.lang.Object)java.util.Map", null, 1);
        Mockingbird.setReturnValue(openApiUtils2.convertToStringMaps(null), null);
        hashMap.putAll((Map) null);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getGetRequestMO(), fcInitiatorMO);
        Mockingbird.setReturnValue(false, mO, "getProperty", "(java.lang.Object)java.lang.Object", "", 1);
        Mockingbird.setReturnValue(true, Long.class, "valueOf", "(java.lang.String)java.lang.Long", new Object[] {""}, new Long(0L), 1);
        Mockingbird.enterTestMode(FcInitiatorIterator.class);
        long result = fcInitiatorIterator.getConcretCount();
        assertEquals("result", 0L, result);
        assertNull("fcInitiatorIterator.headerMap", getPrivateField(fcInitiatorIterator, "headerMap"));
    }
    
    public void testGetConcretFilterHeaders() throws Throwable {
        JSONObject jObject = new JSONObject();
        jObject.put("testFcInitiatorIteratorKey", true);
        FcInitiatorIterator fcInitiatorIterator = new FcInitiatorIterator(new RestRequestHandler("testFcInitiatorIteratorIp", 100), "testFcInitiatorIteratorDeviceID", new FcInitiatorQuery(new FcInitiatorMO(jObject), 100L, 1000L));
        String[] result = fcInitiatorIterator.getConcretFilterHeaders();
        assertEquals("result.length", 0, result.length);
    }
    
    public void testGetConcretMoMap() throws Throwable {
        FcInitiatorIterator fcInitiatorIterator = new FcInitiatorIterator(null, "testFcInitiatorIteratorDeviceID", new FcInitiatorQuery(new FcInitiatorMO(new JSONObject()), 100L, 1000L));
        ConcurrentHashMap result = (ConcurrentHashMap) fcInitiatorIterator.getConcretMoMap(new FcInitiatorMO());
        assertEquals("result.size()", 2, result.size());
        assertEquals("(ConcurrentHashMap) result.get(\"TYPE\")", new Integer(223), result.get("TYPE"));
    }
    
    public void testGetConcretMoMap1() throws Throwable {
        FcInitiatorIterator fcInitiatorIterator = new FcInitiatorIterator(new RestRequestHandler("testFcInitiatorIteratorIp", 100), "testFcInitiatorIteratorDeviceID", new FcInitiatorQuery(null, 100L, 1000L));
        Map result = fcInitiatorIterator.getConcretMoMap((FcInitiatorMO) null);
        assertNull("result", result);
    }
    
    public void testGetConcretBatchNextThrowsApiException() throws Throwable {
        FcInitiatorIterator fcInitiatorIterator = new FcInitiatorIterator(null, "testFcInitiatorIteratorDeviceID", new FcInitiatorQuery(new FcInitiatorMO(), 100L, 1000L));
        try {
            fcInitiatorIterator.getConcretBatchNext();
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
            assertEquals("fcInitiatorIterator.headerMap.size()", 2, ((Map) getPrivateField(fcInitiatorIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretBatchNextThrowsIllegalArgumentException() throws Throwable {
        FcInitiatorIterator fcInitiatorIterator = new FcInitiatorIterator(new RestRequestHandler("testFcInitiatorIterator\rIp", 100), "testFcInitiatorIteratorDeviceID", new FcInitiatorQuery(new FcInitiatorMO(), 100L, 1000L));
        try {
            fcInitiatorIterator.getConcretBatchNext();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertEquals("fcInitiatorIterator.headerMap.size()", 2, ((Map) getPrivateField(fcInitiatorIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretBatchNextThrowsNullPointerException() throws Throwable {
        FcInitiatorIterator fcInitiatorIterator = new FcInitiatorIterator(new RestRequestHandler("testFcInitiatorIteratorIp", 100), "testFcInitiatorIteratorDeviceID", new FcInitiatorQuery(new FcInitiatorMO(), 100L, 1000L));
        Mockingbird.enterRecordingMode();
        Object getRequestMOList = ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMOList();
        Mockingbird.setException(true, getRequestMOList, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(FcInitiatorIterator.class);
        try {
            fcInitiatorIterator.getConcretBatchNext();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("fcInitiatorIterator.headerMap.size()", 2, ((Map) getPrivateField(fcInitiatorIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsApiException() throws Throwable {
        FcInitiatorIterator fcInitiatorIterator = new FcInitiatorIterator(null, "testFcInitiatorIteratorDeviceID", new FcInitiatorQuery(new FcInitiatorMO(), 100L, 1000L));
        try {
            fcInitiatorIterator.getConcretCount();
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
            assertEquals("fcInitiatorIterator.headerMap.size()", 2, ((Map) getPrivateField(fcInitiatorIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsIllegalArgumentException() throws Throwable {
        FcInitiatorIterator fcInitiatorIterator = new FcInitiatorIterator(new RestRequestHandler("testFcInitiatorIteratorIp", 100), "testFcInitiatorIterator\rDeviceID", new FcInitiatorQuery(new FcInitiatorMO(), 100L, 1000L));
        try {
            fcInitiatorIterator.getConcretCount();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertEquals("fcInitiatorIterator.headerMap.size()", 2, ((Map) getPrivateField(fcInitiatorIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsNullPointerException() throws Throwable {
        FcInitiatorIterator fcInitiatorIterator = new FcInitiatorIterator(new RestRequestHandler("testFcInitiatorIteratorIp", 100), "testFcInitiatorIteratorDeviceID", new FcInitiatorQuery(new FcInitiatorMO(), 100L, 1000L));
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(FcInitiatorIterator.class);
        try {
            fcInitiatorIterator.getConcretCount();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("fcInitiatorIterator.headerMap.size()", 2, ((Map) getPrivateField(fcInitiatorIterator, "headerMap")).size());
        }
    }
}
