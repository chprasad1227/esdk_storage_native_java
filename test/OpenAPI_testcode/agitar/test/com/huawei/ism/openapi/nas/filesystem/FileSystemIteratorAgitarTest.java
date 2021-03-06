/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:31:45
 * Time to generate: 00:56.906 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.nas.filesystem.FileSystemIterator:c238345b109268feb05c2b7b9c448bd2
 * agitar.src.md5=com.huawei.ism.openapi.common.batchquery.ApiIterator:592fbb87e71ade6d26e6fe9200d66392
 *
 */

package com.huawei.ism.openapi.nas.filesystem;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.huawei.ism.openapi.common.batchquery.QueryBase;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
import java.net.URI;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.client.ClientProtocolException;
import org.json.JSONObject;

public class FileSystemIteratorAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return FileSystemIterator.class;
    }
    
    public void testConstructor() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testFileSystemIteratorIp", 100);
        FileSystemQuery qCondition = new FileSystemQuery(new FileSystemMO(), 100L, 1000L);
        FileSystemIterator fileSystemIterator = new FileSystemIterator(restRequestHandler, "testFileSystemIteratorDeviceID", qCondition);
        assertNull("fileSystemIterator.headerMap", getPrivateField(fileSystemIterator, "headerMap"));
        assertEquals("fileSystemIterator.totalCount", 0L, ((Number) getPrivateField(fileSystemIterator, "totalCount")).longValue());
        assertSame("fileSystemIterator.restRequestHandler", restRequestHandler, getPrivateField(fileSystemIterator, "restRequestHandler"));
        assertEquals("fileSystemIterator.curIndex", 100L, ((Number) getPrivateField(fileSystemIterator, "curIndex")).longValue());
        assertEquals("fileSystemIterator.deviceID", "testFileSystemIteratorDeviceID", getPrivateField(fileSystemIterator, "deviceID"));
        assertSame("fileSystemIterator.getQuery()", qCondition, fileSystemIterator.getQuery());
    }
    
    public void testGetConcretBatchNextWithAggressiveMocks() throws Throwable {
        FileSystemIterator fileSystemIterator = (FileSystemIterator) Mockingbird.getProxyObject(FileSystemIterator.class, true);
        QueryBase queryBase = (QueryBase) Mockingbird.getProxyObject(QueryBase.class);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        OpenApiUtils openApiUtils2 = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        setPrivateField(fileSystemIterator, "deviceID", "");
        setPrivateField(fileSystemIterator, "curIndex", new Long(0L));
        setPrivateField(fileSystemIterator, "queryCondition", queryBase);
        setPrivateField(fileSystemIterator, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        Mockingbird.enterNormalMode();
        queryBase.setCount(0L);
        callPrivateMethod("com.huawei.ism.openapi.common.batchquery.QueryBase", "setConcretQueryMO", new Class[] {Object.class}, queryBase, new Object[] {obj});
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        HashMap hashMap = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        Mockingbird.replaceObjectForRecording(HashMap.class, "<init>()", hashMap);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils2);
        Mockingbird.setReturnValue(false, fileSystemIterator, "getHeadMap", "(java.lang.Object)java.util.Map", null, 1);
        Mockingbird.setReturnValue(openApiUtils2.convertToStringMaps(null), null);
        hashMap.putAll((Map) null);
        Mockingbird.setNormalReturnForVoid();
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getGetRequestMOList(), null);
        Mockingbird.enterTestMode(FileSystemIterator.class);
        List result = fileSystemIterator.getConcretBatchNext();
        assertNull("result", result);
        assertNull("fileSystemIterator.headerMap", getPrivateField(fileSystemIterator, "headerMap"));
    }
    
    public void testGetConcretCountWithAggressiveMocks() throws Throwable {
        FileSystemIterator fileSystemIterator = (FileSystemIterator) Mockingbird.getProxyObject(FileSystemIterator.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        FileSystemMO fileSystemMO = (FileSystemMO) Mockingbird.getProxyObject(FileSystemMO.class);
        setPrivateField(fileSystemIterator, "deviceID", "");
        setPrivateField(fileSystemIterator, "queryCondition", null);
        setPrivateField(fileSystemIterator, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        Mockingbird.replaceObjectForRecording(HashMap.class, "<init>()", Mockingbird.getProxyObject(HashMap.class));
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getGetRequestMO(), fileSystemMO);
        Mockingbird.setReturnValue(fileSystemMO.getCount(), new Long(0L));
        Mockingbird.enterTestMode(FileSystemIterator.class);
        long result = fileSystemIterator.getConcretCount();
        assertEquals("result", 0L, result);
        assertNull("fileSystemIterator.headerMap", getPrivateField(fileSystemIterator, "headerMap"));
    }
    
    public void testGetConcretFilterHeaders() throws Throwable {
        FileSystemIterator fileSystemIterator = new FileSystemIterator(new RestRequestHandler("testFileSystemIteratorIp", 100), "testFileSystemIteratorDeviceID", new FileSystemQuery(new FileSystemMO(), 100L, 1000L));
        String[] result = fileSystemIterator.getConcretFilterHeaders();
        assertEquals("result.length", 4, result.length);
        assertEquals("result[0]", "NAME", result[0]);
    }
    
    public void testGetConcretMoMap() throws Throwable {
        FileSystemIterator fileSystemIterator = new FileSystemIterator(new RestRequestHandler("testFileSystemIteratorIp", 100), "testFileSystemIteratorDeviceID", new FileSystemQuery(new FileSystemMO(), 100L, 1000L));
        ConcurrentHashMap result = (ConcurrentHashMap) fileSystemIterator.getConcretMoMap(new FileSystemMO());
        assertEquals("result.size()", 0, result.size());
    }
    
    public void testGetConcretMoMap1() throws Throwable {
        FileSystemIterator fileSystemIterator = new FileSystemIterator(new RestRequestHandler("testFileSystemIteratorIp", 100), "testFileSystemIteratorDeviceID", new FileSystemQuery(new FileSystemMO(), 100L, 1000L));
        Map result = fileSystemIterator.getConcretMoMap((FileSystemMO) null);
        assertNull("result", result);
    }
    
    public void testGetConcretBatchNextThrowsApiException() throws Throwable {
        JSONObject jObject = new JSONObject();
        jObject.put("testFileSystemIteratorKey", 100.0);
        FileSystemIterator fileSystemIterator = new FileSystemIterator(new RestRequestHandler("/deviceManager/2rest", 100), "testFileSystemIteratorDeviceID", new FileSystemQuery(new FileSystemMO(jObject), 100L, 1000L));
        try {
            fileSystemIterator.getConcretBatchNext();
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "URI does not specify a valid host name: https:///deviceManager/2rest:100/deviceManager/rest/testFileSystemIteratorDeviceID/filesystem?range=[100-1100]", ex.getMessage());
            assertThrownBy(RestRequestHandler.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "URI does not specify a valid host name: https:///deviceManager/2rest:100/deviceManager/rest/testFileSystemIteratorDeviceID/filesystem?range=[100-1100]", ex.getErrMessage().getErrorDescription());
            assertEquals("ex.getException().getClass()", ClientProtocolException.class, ex.getException().getClass());
            assertEquals("fileSystemIterator.headerMap.size()", 0, ((Map) getPrivateField(fileSystemIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretBatchNextThrowsIllegalArgumentException() throws Throwable {
        JSONObject jObject = new JSONObject(new IdentityHashMap(100));
        jObject.putOpt("testFileSystemIteratorKey", new Integer(0));
        FileSystemIterator fileSystemIterator = new FileSystemIterator(new RestRequestHandler("testFileSystemIteratorIp", 100), "testFileSystemIterator\rDeviceID", new FileSystemQuery(new FileSystemMO(jObject), 100L, 1000L));
        try {
            fileSystemIterator.getConcretBatchNext();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertEquals("fileSystemIterator.headerMap.size()", 0, ((Map) getPrivateField(fileSystemIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretBatchNextThrowsNullPointerException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testFileSystemIteratorIp", 100);
        JSONObject jObject = new JSONObject(new IdentityHashMap(100));
        jObject.putOpt("testFileSystemIteratorKey", new Integer(0));
        FileSystemIterator fileSystemIterator = new FileSystemIterator(restRequestHandler, "testFileSystemIteratorDeviceID", new FileSystemQuery(new FileSystemMO(jObject), 100L, 1000L));
        Mockingbird.enterRecordingMode();
        Object getRequestMOList = ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMOList();
        Mockingbird.setException(true, getRequestMOList, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(FileSystemIterator.class);
        try {
            fileSystemIterator.getConcretBatchNext();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("fileSystemIterator.headerMap.size()", 0, ((Map) getPrivateField(fileSystemIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsApiException() throws Throwable {
        FileSystemIterator fileSystemIterator = new FileSystemIterator(null, "testFileSystemIteratorDeviceID", new FileSystemQuery(new FileSystemMO(), 100L, 1000L));
        try {
            fileSystemIterator.getConcretCount();
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
            assertEquals("fileSystemIterator.headerMap.size()", 0, ((Map) getPrivateField(fileSystemIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsIllegalArgumentException() throws Throwable {
        FileSystemIterator fileSystemIterator = new FileSystemIterator(new RestRequestHandler("testFileSystemIterator\rIp", 100), "testFileSystemIteratorDeviceID", new FileSystemQuery(new FileSystemMO(), 100L, 1000L));
        try {
            fileSystemIterator.getConcretCount();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertEquals("fileSystemIterator.headerMap.size()", 0, ((Map) getPrivateField(fileSystemIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsNullPointerException() throws Throwable {
        FileSystemIterator fileSystemIterator = new FileSystemIterator(new RestRequestHandler("testFileSystemIteratorIp", 100), "testFileSystemIteratorDeviceID", new FileSystemQuery(new FileSystemMO(), 100L, 1000L));
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(FileSystemIterator.class);
        try {
            fileSystemIterator.getConcretCount();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("fileSystemIterator.headerMap.size()", 0, ((Map) getPrivateField(fileSystemIterator, "headerMap")).size());
        }
    }
    
    public void testGetConcretCountThrowsNullPointerException1() throws Throwable {
        FileSystemIterator fileSystemIterator = new FileSystemIterator(new RestRequestHandler("testFileSystemIteratorIp", 100), "testFileSystemIteratorDeviceID", new FileSystemQuery(new FileSystemMO((MO) null), 100L, 1000L));
        try {
            fileSystemIterator.getConcretCount();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(FileSystemIterator.class, ex);
            assertNull("fileSystemIterator.headerMap", getPrivateField(fileSystemIterator, "headerMap"));
        }
    }
    
    public void testGetConcretMoMapThrowsNullPointerException() throws Throwable {
        FileSystemIterator fileSystemIterator = new FileSystemIterator(new RestRequestHandler("testFileSystemIteratorIp", 100), "testFileSystemIteratorDeviceID", new FileSystemQuery(new FileSystemMO(new MO()), 100L, 1000L));
        try {
            fileSystemIterator.getConcretMoMap(new FileSystemMO((MO) null));
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(FileSystemIterator.class, ex);
        }
    }
}

