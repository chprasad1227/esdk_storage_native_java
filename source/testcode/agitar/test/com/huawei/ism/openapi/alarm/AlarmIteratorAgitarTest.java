/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:25:53
 * Time to generate: 00:55.718 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.alarm.AlarmIterator:3a5255096695515649c082e7e89a3df9
 * agitar.src.md5=com.huawei.ism.openapi.common.batchquery.ApiIterator:592fbb87e71ade6d26e6fe9200d66392
 *
 */

package com.huawei.ism.openapi.alarm;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class AlarmIteratorAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return AlarmIterator.class;
    }
    
    public void testConstructor() throws Throwable {
        AlarmQuery queryCondition = new AlarmQuery(new AlarmInfoMO(), 100L, 1000L);
        RestRequestHandler restRequestHandler = new RestRequestHandler("testAlarmIteratorIp", 100);
        AlarmIterator alarmIterator = new AlarmIterator(restRequestHandler, "testAlarmIteratorDeviceID", queryCondition, true);
        assertNull("alarmIterator.headerMap", getPrivateField(alarmIterator, "headerMap"));
        assertTrue("alarmIterator.isHistoryBatch", ((Boolean) getPrivateField(alarmIterator, "isHistoryBatch")).booleanValue());
        assertEquals("alarmIterator.totalCount", 0L, ((Number) getPrivateField(alarmIterator, "totalCount")).longValue());
        assertSame("alarmIterator.restRequestHandler", restRequestHandler, getPrivateField(alarmIterator, "restRequestHandler"));
        assertEquals("alarmIterator.curIndex", 100L, ((Number) getPrivateField(alarmIterator, "curIndex")).longValue());
        assertEquals("alarmIterator.deviceID", "testAlarmIteratorDeviceID", getPrivateField(alarmIterator, "deviceID"));
        assertSame("alarmIterator.getQuery()", queryCondition, alarmIterator.getQuery());
    }
    
    public void testGetConcretBatchNextWithAggressiveMocks() throws Throwable {
        AlarmIterator alarmIterator = (AlarmIterator) Mockingbird.getProxyObject(AlarmIterator.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        setPrivateField(alarmIterator, "isHistoryBatch", Boolean.TRUE);
        setPrivateField(alarmIterator, "deviceID", "");
        setPrivateField(alarmIterator, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        Map requestHeader = (Map) callPrivateMethod("com.huawei.ism.openapi.common.batchquery.ApiIterator", "composeRequestHeader", new Class[] {boolean.class}, alarmIterator, new Object[] {Boolean.TRUE});
        Mockingbird.setReturnValue(requestHeader, null);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getGetRequestMOList(), null);
        Mockingbird.enterTestMode(AlarmIterator.class);
        List result = alarmIterator.getConcretBatchNext();
        assertNull("result", result);
    }
    
    public void testGetConcretCountWithAggressiveMocks() throws Throwable {
        AlarmIterator alarmIterator = (AlarmIterator) Mockingbird.getProxyObject(AlarmIterator.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        AlarmInfoMO alarmInfoMO = (AlarmInfoMO) Mockingbird.getProxyObject(AlarmInfoMO.class);
        setPrivateField(alarmIterator, "isHistoryBatch", Boolean.TRUE);
        setPrivateField(alarmIterator, "deviceID", "");
        setPrivateField(alarmIterator, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        Map requestHeader = (Map) callPrivateMethod("com.huawei.ism.openapi.common.batchquery.ApiIterator", "composeRequestHeader", new Class[] {boolean.class}, alarmIterator, new Object[] {Boolean.FALSE});
        Mockingbird.setReturnValue(requestHeader, null);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getGetRequestMO(), alarmInfoMO);
        Mockingbird.setReturnValue(alarmInfoMO.getCount(), 0L);
        Mockingbird.enterTestMode(AlarmIterator.class);
        long result = alarmIterator.getConcretCount();
        assertEquals("result", 0L, result);
    }
    
    public void testGetConcretFilterHeaders() throws Throwable {
        AlarmIterator alarmIterator = new AlarmIterator(new RestRequestHandler("testAlarmIteratorIp", 100), "testAlarmIteratorDeviceID", new AlarmQuery(new AlarmInfoMO(), 100L, 1000L), true);
        String[] result = alarmIterator.getConcretFilterHeaders();
        assertEquals("result.length", 0, result.length);
    }
    
    public void testGetConcretMoMap() throws Throwable {
        AlarmIterator alarmIterator = new AlarmIterator(new RestRequestHandler("testAlarmIteratorIp", 100), "testAlarmIteratorDeviceID", null, true);
        Map result = alarmIterator.getConcretMoMap((AlarmInfoMO) null);
        assertNull("result", result);
    }
    
    public void testGetConcretMoMap1() throws Throwable {
        AlarmIterator alarmIterator = new AlarmIterator(new RestRequestHandler("testAlarmIteratorIp", 100), "testAlarmIteratorDeviceID", new AlarmQuery(new AlarmInfoMO(), 100L, 1000L), true);
        ConcurrentHashMap result = (ConcurrentHashMap) alarmIterator.getConcretMoMap(new AlarmInfoMO());
        assertEquals("result.size()", 0, result.size());
    }
    
    public void testGetConcretBatchNextThrowsApiException() throws Throwable {
        AlarmIterator alarmIterator = new AlarmIterator(null, "testAlarmIteratorDeviceID", new AlarmQuery(new AlarmInfoMO(), 100L, 1000L), true);
        try {
            alarmIterator.getConcretBatchNext();
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
            assertEquals("alarmIterator.headerMap.size()", 0, ((Map) getPrivateField(alarmIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretBatchNextThrowsIllegalArgumentException() throws Throwable {
        AlarmIterator alarmIterator = new AlarmIterator(new RestRequestHandler("testAlarmIterator\rIp", 100), "testAlarmIteratorDeviceID", new AlarmQuery(new AlarmInfoMO(), 100L, 1000L), false);
        try {
            alarmIterator.getConcretBatchNext();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertEquals("alarmIterator.headerMap.size()", 0, ((Map) getPrivateField(alarmIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretBatchNextThrowsIllegalArgumentException1() throws Throwable {
        AlarmIterator alarmIterator = new AlarmIterator(new RestRequestHandler("testAlarmIterator\rIp", 100), "testAlarmIteratorDeviceID", new AlarmQuery(new AlarmInfoMO(), 100L, 1000L), true);
        try {
            alarmIterator.getConcretBatchNext();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertEquals("alarmIterator.headerMap.size()", 0, ((Map) getPrivateField(alarmIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretBatchNextThrowsNullPointerException() throws Throwable {
        AlarmIterator alarmIterator = new AlarmIterator(new RestRequestHandler("testAlarmIteratorIp", 100), "testAlarmIteratorDeviceID", new AlarmQuery(new AlarmInfoMO(), 100L, 1000L), true);
        Mockingbird.enterRecordingMode();
        Object getRequestMOList = ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMOList();
        Mockingbird.setException(true, getRequestMOList, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(AlarmIterator.class);
        try {
            alarmIterator.getConcretBatchNext();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("alarmIterator.headerMap.size()", 0, ((Map) getPrivateField(alarmIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretBatchNextThrowsNullPointerException1() throws Throwable {
        AlarmQuery queryCondition = (AlarmQuery) Mockingbird.getProxyObject(AlarmQuery.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(queryCondition.getBeginIndex(), 0L);
        Mockingbird.enterTestMode(AlarmIterator.class);
        AlarmIterator alarmIterator = new AlarmIterator(null, "testAlarmIteratorDeviceID", queryCondition, false);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(queryCondition.getCount(), -1L);
        Object concretMO = callPrivateMethod("com.huawei.ism.openapi.common.batchquery.QueryBase", "getConcretMO", new Class[] {}, queryCondition, new Object[] {});
        Mockingbird.setReturnValue(concretMO, Mockingbird.getProxyObject(AlarmInfoMO.class));
        Mockingbird.enterTestMode(AlarmIterator.class);
        try {
            alarmIterator.getConcretBatchNext();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(AlarmIterator.class, ex);
            assertNull("alarmIterator.headerMap", getPrivateField(alarmIterator, "headerMap"));
        }
    }
    
    public void testGetConcretCountThrowsApiException() throws Throwable {
        AlarmIterator alarmIterator = new AlarmIterator(null, "testAlarmIteratorDeviceID", new AlarmQuery(new AlarmInfoMO(new JSONObject()), 100L, 1000L), true);
        try {
            alarmIterator.getConcretCount();
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
            assertEquals("alarmIterator.headerMap.size()", 0, ((Map) getPrivateField(alarmIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsClassCastException() throws Throwable {
        AlarmQuery queryCondition = new AlarmQuery(new AlarmInfoMO(), 100L, 1000L);
        callPrivateMethod("com.huawei.ism.openapi.common.batchquery.QueryBase", "setConcretQueryMO", new Class[] {Object.class}, queryCondition, new Object[] {new Object()});
        AlarmIterator alarmIterator = new AlarmIterator(new RestRequestHandler("testAlarmIteratorIp", 100), "testAlarmIteratorDeviceID", queryCondition, false);
        try {
            alarmIterator.getConcretCount();
            fail("Expected ClassCastException to be thrown");
        } catch (ClassCastException ex) {
            assertEquals("ex.getClass()", ClassCastException.class, ex.getClass());
            assertThrownBy(AlarmIterator.class, ex);
            assertNull("alarmIterator.headerMap", getPrivateField(alarmIterator, "headerMap"));
        }
    }
    
    public void testGetConcretCountThrowsIllegalArgumentException() throws Throwable {
        AlarmIterator alarmIterator = new AlarmIterator(new RestRequestHandler("testAlarmIteratorIp", 100), "testAlarmIterator\rDeviceID", new AlarmQuery(new AlarmInfoMO(), 100L, 1000L), false);
        try {
            alarmIterator.getConcretCount();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertEquals("alarmIterator.headerMap.size()", 0, ((Map) getPrivateField(alarmIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsNullPointerException() throws Throwable {
        AlarmIterator alarmIterator = new AlarmIterator(new RestRequestHandler("testAlarmIteratorIp", 100), "testAlarmIteratorDeviceID", new AlarmQuery(new AlarmInfoMO(), 100L, 1000L), false);
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(AlarmIterator.class);
        try {
            alarmIterator.getConcretCount();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("alarmIterator.headerMap.size()", 0, ((Map) getPrivateField(alarmIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsNullPointerException1() throws Throwable {
        AlarmQuery queryCondition = (AlarmQuery) Mockingbird.getProxyObject(AlarmQuery.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(queryCondition.getBeginIndex(), 0L);
        Mockingbird.enterTestMode(AlarmIterator.class);
        AlarmIterator alarmIterator = new AlarmIterator(null, "testAlarmIteratorDeviceID", queryCondition, false);
        Mockingbird.enterRecordingMode();
        Object concretMO = callPrivateMethod("com.huawei.ism.openapi.common.batchquery.QueryBase", "getConcretMO", new Class[] {}, queryCondition, new Object[] {});
        Mockingbird.setReturnValue(concretMO, Mockingbird.getProxyObject(AlarmInfoMO.class));
        Mockingbird.enterTestMode(AlarmIterator.class);
        try {
            alarmIterator.getConcretCount();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(AlarmIterator.class, ex);
            assertNull("alarmIterator.headerMap", getPrivateField(alarmIterator, "headerMap"));
        }
    }
    
    public void testGetConcretCountThrowsNullPointerException2() throws Throwable {
        RestRequestHandler restRequestHandler = (RestRequestHandler) Mockingbird.getProxyObject(RestRequestHandler.class);
        AlarmQuery queryCondition = (AlarmQuery) Mockingbird.getProxyObject(AlarmQuery.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(queryCondition.getBeginIndex(), -1L);
        Mockingbird.enterTestMode(AlarmIterator.class);
        AlarmIterator alarmIterator = new AlarmIterator(restRequestHandler, "testAlarmIteratorDeviceID", queryCondition, true);
        Mockingbird.enterRecordingMode();
        Object concretMO = callPrivateMethod("com.huawei.ism.openapi.common.batchquery.QueryBase", "getConcretMO", new Class[] {}, queryCondition, new Object[] {});
        Mockingbird.setReturnValue(concretMO, Mockingbird.getProxyObject(AlarmInfoMO.class));
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setException(restManager.getGetRequestMO(), (Throwable) Mockingbird.getProxyObject(IllegalArgumentException.class));
        Mockingbird.enterTestMode(AlarmIterator.class);
        try {
            alarmIterator.getConcretCount();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(AlarmIterator.class, ex);
            assertNull("alarmIterator.headerMap", getPrivateField(alarmIterator, "headerMap"));
        }
    }
}

