/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:30:11
 * Time to generate: 00:58.907 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.fcport.FCPortIterator:89a1fd5a23c4c8458ff5054aa61e4ee1
 * agitar.src.md5=com.huawei.ism.openapi.common.batchquery.ApiIterator:592fbb87e71ade6d26e6fe9200d66392
 *
 */

package com.huawei.ism.openapi.fcport;

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
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FCPortIteratorAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return FCPortIterator.class;
    }
    
    public void testConstructor() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testFCPortIteratorIp", 100);
        FCPortQuery queryCondition = new FCPortQuery(new FCPortMO(), 100L, 1000L);
        FCPortIterator fCPortIterator = new FCPortIterator(restRequestHandler, "testFCPortIteratorDeviceID", queryCondition);
        assertNull("fCPortIterator.headerMap", getPrivateField(fCPortIterator, "headerMap"));
        assertEquals("fCPortIterator.totalCount", 0L, ((Number) getPrivateField(fCPortIterator, "totalCount")).longValue());
        assertSame("fCPortIterator.restRequestHandler", restRequestHandler, getPrivateField(fCPortIterator, "restRequestHandler"));
        assertEquals("fCPortIterator.curIndex", 100L, ((Number) getPrivateField(fCPortIterator, "curIndex")).longValue());
        assertEquals("fCPortIterator.deviceID", "testFCPortIteratorDeviceID", getPrivateField(fCPortIterator, "deviceID"));
        assertSame("fCPortIterator.getQuery()", queryCondition, fCPortIterator.getQuery());
    }
    
    public void testGetConcretCountWithAggressiveMocks() throws Throwable {
        storeStaticField(MOType.class, "FC_PORT");
        FCPortIterator fCPortIterator = (FCPortIterator) Mockingbird.getProxyObject(FCPortIterator.class, true);
        QueryBase queryBase = (QueryBase) Mockingbird.getProxyObject(QueryBase.class);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        OpenApiUtils openApiUtils2 = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        FCPortMO fCPortMO = (FCPortMO) Mockingbird.getProxyObject(FCPortMO.class);
        MO mO = (MO) Mockingbird.getProxyObject(MO.class);
        setPrivateField(fCPortIterator, "deviceID", "");
        setPrivateField(fCPortIterator, "queryCondition", queryBase);
        setPrivateField(fCPortIterator, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        Mockingbird.enterNormalMode();
        callPrivateMethod("com.huawei.ism.openapi.common.batchquery.QueryBase", "setConcretQueryMO", new Class[] {Object.class}, queryBase, new Object[] {obj});
        setPrivateField(MOType.class, "FC_PORT", mOType);
        setPrivateField(mOType, "value", new Integer(0));
        setPrivateField(fCPortMO, "mo", mO);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        HashMap hashMap = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        Mockingbird.replaceObjectForRecording(HashMap.class, "<init>()", hashMap);
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils2);
        Mockingbird.setReturnValue(false, fCPortIterator, "getHeadMap", "(java.lang.Object)java.util.Map", null, 1);
        Mockingbird.setReturnValue(openApiUtils2.convertToStringMaps(null), null);
        hashMap.putAll((Map) null);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getGetRequestMO(), fCPortMO);
        Mockingbird.setReturnValue(false, mO, "getProperty", "(java.lang.Object)java.lang.Object", "", 1);
        Mockingbird.setReturnValue(true, Long.class, "valueOf", "(java.lang.String)java.lang.Long", new Long(0L), 1);
        Mockingbird.enterTestMode(FCPortIterator.class);
        long result = fCPortIterator.getConcretCount();
        assertEquals("result", 0L, result);
        assertNull("fCPortIterator.headerMap", getPrivateField(fCPortIterator, "headerMap"));
    }
    
    public void testGetConcretFilterHeaders() throws Throwable {
        FCPortIterator fCPortIterator = new FCPortIterator(new RestRequestHandler("testFCPortIteratorIp", 100), "testFCPortIteratorDeviceID", new FCPortQuery(new FCPortMO(), 100L, 1000L));
        String[] result = fCPortIterator.getConcretFilterHeaders();
        assertEquals("result.length", 1, result.length);
        assertEquals("result[0]", "ID", result[0]);
    }
    
    public void testGetConcretMoMap() throws Throwable {
        FCPortIterator fCPortIterator = new FCPortIterator(new RestRequestHandler("testFCPortIteratorIp", 100), "testFCPortIteratorDeviceID", new FCPortQuery(new FCPortMO(), 100L, 1000L));
        Map result = fCPortIterator.getConcretMoMap((FCPortMO) null);
        assertNull("result", result);
    }
    
    public void testGetConcretMoMap1() throws Throwable {
        FCPortIterator fCPortIterator = new FCPortIterator(new RestRequestHandler("testFCPortIteratorIp", 100), "testFCPortIteratorDeviceID", new FCPortQuery(new FCPortMO(), 100L, 1000L));
        ConcurrentHashMap result = (ConcurrentHashMap) fCPortIterator.getConcretMoMap(new FCPortMO());
        assertEquals("result.size()", 1, result.size());
        assertEquals("(ConcurrentHashMap) result.get(\"TYPE\")", new Integer(212), result.get("TYPE"));
    }
    
    public void testGetConcretBatchNextThrowsApiException() throws Throwable {
        FCPortMO mo = new FCPortMO();
        mo.setId("testFCPortIteratorId");
        FCPortIterator fCPortIterator = new FCPortIterator(null, "testFCPortIteratorDeviceID", new FCPortQuery(mo, 100L, 1000L));
        try {
            fCPortIterator.getConcretBatchNext();
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
            assertEquals("fCPortIterator.headerMap.size()", 1, ((Map) getPrivateField(fCPortIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretBatchNextThrowsIllegalArgumentException() throws Throwable {
        FCPortMO mo = new FCPortMO();
        mo.setId("testFCPortIteratorId");
        FCPortQuery queryCondition = new FCPortQuery(new FCPortMO(), 100L, 1000L);
        queryCondition.setFCPortMO(mo);
        FCPortIterator fCPortIterator = new FCPortIterator(new RestRequestHandler("testFCPortIterator\rIp", 100), "testFCPortIteratorDeviceID", queryCondition);
        try {
            fCPortIterator.getConcretBatchNext();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertEquals("fCPortIterator.headerMap.size()", 1, ((Map) getPrivateField(fCPortIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretBatchNextThrowsNullPointerException() throws Throwable {
        FCPortMO mo = new FCPortMO();
        mo.setId("testFCPortIteratorId");
        FCPortIterator fCPortIterator = new FCPortIterator(new RestRequestHandler("testFCPortIteratorIp", 100), "testFCPortIteratorDeviceID", new FCPortQuery(mo, 100L, 1000L));
        Mockingbird.enterRecordingMode();
        Object getRequestMOList = ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMOList();
        Mockingbird.setException(true, getRequestMOList, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(FCPortIterator.class);
        try {
            fCPortIterator.getConcretBatchNext();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("fCPortIterator.headerMap.size()", 1, ((Map) getPrivateField(fCPortIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretBatchNextThrowsNullPointerException1() throws Throwable {
        FCPortIterator fCPortIterator = new FCPortIterator(new RestRequestHandler("testFCPortIteratorIp", 100), "testFCPortIteratorDeviceID", new FCPortQuery(new FCPortMO(), 100L, 1000L));
        Mockingbird.enterRecordingMode();
        Object getRequestMOList = ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMOList();
        Mockingbird.setException(true, getRequestMOList, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(FCPortIterator.class);
        try {
            fCPortIterator.getConcretBatchNext();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("fCPortIterator.headerMap.size()", 0, ((Map) getPrivateField(fCPortIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsApiException() throws Throwable {
        FCPortMO mo = new FCPortMO();
        mo.setId("testFCPortIteratorId");
        FCPortIterator fCPortIterator = new FCPortIterator(null, "testFCPortIteratorDeviceID", new FCPortQuery(mo, 100L, 1000L));
        try {
            fCPortIterator.getConcretCount();
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
            assertEquals("fCPortIterator.headerMap.size()", 1, ((Map) getPrivateField(fCPortIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsIllegalArgumentException() throws Throwable {
        FCPortMO mo = new FCPortMO();
        mo.setId("testFCPortIteratorId");
        FCPortIterator fCPortIterator = new FCPortIterator(new RestRequestHandler("testFCPortIterator\rIp", 100), "testFCPortIteratorDeviceID", new FCPortQuery(mo, 100L, 1000L));
        try {
            fCPortIterator.getConcretCount();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertEquals("fCPortIterator.headerMap.size()", 1, ((Map) getPrivateField(fCPortIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsIllegalArgumentException1() throws Throwable {
        FCPortIterator fCPortIterator = new FCPortIterator(new RestRequestHandler("testFCPortIteratorIp", 100), "testFCPortIterator\rDeviceID", new FCPortQuery(new FCPortMO(), 100L, 1000L));
        try {
            fCPortIterator.getConcretCount();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertEquals("fCPortIterator.headerMap.size()", 0, ((Map) getPrivateField(fCPortIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsNullPointerException() throws Throwable {
        FCPortMO mo = new FCPortMO();
        mo.setId("testFCPortIteratorId");
        FCPortIterator fCPortIterator = new FCPortIterator(new RestRequestHandler("testFCPortIteratorIp", 100), "testFCPortIteratorDeviceID", new FCPortQuery(mo, 100L, 1000L));
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(FCPortIterator.class);
        try {
            fCPortIterator.getConcretCount();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("fCPortIterator.headerMap.size()", 1, ((Map) getPrivateField(fCPortIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsNullPointerException1() throws Throwable {
        FCPortIterator fCPortIterator = new FCPortIterator(null, "testFCPortIteratorDeviceID", null);
        FCPortQuery qCondition = (FCPortQuery) Mockingbird.getProxyObject(FCPortQuery.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(qCondition.getBeginIndex(), -2L);
        Mockingbird.enterTestMode(FCPortIterator.class);
        fCPortIterator.updateQuery(qCondition);
        Mockingbird.enterRecordingMode();
        Object concretMO = callPrivateMethod("com.huawei.ism.openapi.common.batchquery.QueryBase", "getConcretMO", new Class[] {}, qCondition, new Object[] {});
        Mockingbird.setReturnValue(concretMO, Mockingbird.getProxyObject(FCPortMO.class));
        Mockingbird.enterTestMode(FCPortIterator.class);
        try {
            fCPortIterator.getConcretCount();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(FCPortIterator.class, ex);
            assertNull("fCPortIterator.headerMap", getPrivateField(fCPortIterator, "headerMap"));
        }
    }
}

