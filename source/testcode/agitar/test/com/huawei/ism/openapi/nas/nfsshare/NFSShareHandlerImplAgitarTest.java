/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:37:48
 * Time to generate: 01:20.937 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.nas.nfsshare.NFSShareHandlerImpl:d9287ec226eedbf34d810d9d901afc7c
 * agitar.src.md5=com.huawei.ism.openapi.common.DefaultCommHandler:b6802204ee7c3e439b341a5d028a1348
 *
 */

package com.huawei.ism.openapi.nas.nfsshare;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.exception.ApiMessage;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class NFSShareHandlerImplAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return NFSShareHandlerImpl.class;
    }
    
    public void testConstructor() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testNFSShareHandlerImplIp", 100);
        NFSShareHandlerImpl nFSShareHandlerImpl = new NFSShareHandlerImpl(restRequestHandler, "testNFSShareHandlerImplDeviceID");
        assertNull("nFSShareHandlerImpl.iterator", getPrivateField(nFSShareHandlerImpl, "iterator"));
        assertEquals("nFSShareHandlerImpl.deviceID", "testNFSShareHandlerImplDeviceID", getPrivateField(nFSShareHandlerImpl, "deviceID"));
        assertSame("nFSShareHandlerImpl.restRequestHandler", restRequestHandler, getPrivateField(nFSShareHandlerImpl, "restRequestHandler"));
    }
    
    public void testCreateWithAggressiveMocks() throws Throwable {
        storeStaticField(EnumDefine.LOG_TYPE_E.class, "LOG_INFO");
        storeStaticField(MOType.class, "SNAS_NFS_SHARE");
        NFSShareHandlerImpl nFSShareHandlerImpl = (NFSShareHandlerImpl) Mockingbird.getProxyObject(NFSShareHandlerImpl.class, true);
        NFSShareMO nFSShareMO = (NFSShareMO) Mockingbird.getProxyObject(NFSShareMO.class);
        MO mO = (MO) Mockingbird.getProxyObject(MO.class);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        LogUtil logUtil = (LogUtil) Mockingbird.getProxyObject(LogUtil.class);
        OpenApiUtils openApiUtils2 = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        setPrivateField(nFSShareHandlerImpl, "deviceID", "");
        setPrivateField(nFSShareHandlerImpl, "restRequestHandler", null);
        setPrivateField(nFSShareMO, "mo", mO);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(MOType.class, "SNAS_NFS_SHARE", mOType);
        setPrivateField(mOType, "value", new Integer(0));
        setPrivateField(mO, "properties", map);
        setPrivateField(EnumDefine.LOG_TYPE_E.class, "LOG_INFO", null);
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        JSONObject jSONObject = (JSONObject) Mockingbird.getProxyObject(JSONObject.class);
        Mockingbird.replaceObjectForRecording(JSONObject.class, "<init>()", jSONObject);
        Mockingbird.setReturnValue(jSONObject.put("TYPE", 0), null);
        Mockingbird.setReturnValue(LogUtil.getLogUtilInstance(), logUtil);
        Mockingbird.setReturnValue(false, map, "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, logUtil, "showLog", "(com.huawei.ism.openapi.common.keydeifines.EnumDefine$LOG_TYPE_E,java.lang.String)void", null, 1);
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils2);
        Mockingbird.setReturnValue(false, openApiUtils2, "composeFromMap", "(org.json.JSONObject,java.util.Map)void", null, 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getPostRequestMO(), null);
        Mockingbird.enterTestMode(NFSShareHandlerImpl.class);
        NFSShareMO result = nFSShareHandlerImpl.create(nFSShareMO);
        assertNull("result", result);
    }
    
    public void testDeleteWithAggressiveMocks() throws Throwable {
        NFSShareHandlerImpl nFSShareHandlerImpl = (NFSShareHandlerImpl) Mockingbird.getProxyObject(NFSShareHandlerImpl.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        setPrivateField(nFSShareHandlerImpl, "deviceID", "");
        setPrivateField(nFSShareHandlerImpl, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getDelRequestMO(), null);
        Mockingbird.enterTestMode(NFSShareHandlerImpl.class);
        nFSShareHandlerImpl.delete("");
        assertEquals("nFSShareHandlerImpl.deviceID", "", getPrivateField(nFSShareHandlerImpl, "deviceID"));
        assertNull("nFSShareHandlerImpl.restRequestHandler", getPrivateField(nFSShareHandlerImpl, "restRequestHandler"));
    }
    
    public void testGetBatch() throws Throwable {
        NFSShareHandlerImpl nFSShareHandlerImpl = new NFSShareHandlerImpl(new RestRequestHandler("testNFSShareHandlerImplIp", 100), "testNFSShareHandlerImplDeviceID");
        NFSShareIterator result = nFSShareHandlerImpl.getBatch(new NFSShareQuery(new NFSShareMO(), 100L, 1000L));
        assertSame("nFSShareHandlerImpl.iterator", result, getPrivateField(nFSShareHandlerImpl, "iterator"));
        assertEquals("result.getConcretFilterHeaders().length", 2, result.getConcretFilterHeaders().length);
    }
    
    public void testGetBatch1() throws Throwable {
        NFSShareHandlerImpl nFSShareHandlerImpl = new NFSShareHandlerImpl(new RestRequestHandler("testNFSShareHandlerImplIp", 100), "testNFSShareHandlerImplDeviceID");
        NFSShareQuery condition = new NFSShareQuery(new NFSShareMO(), 100L, 1000L);
        NFSShareIterator batch = nFSShareHandlerImpl.getBatch(condition);
        NFSShareIterator result = nFSShareHandlerImpl.getBatch(condition);
        assertSame("result", batch, result);
    }
    
    public void testGetWithAggressiveMocks() throws Throwable {
        NFSShareHandlerImpl nFSShareHandlerImpl = (NFSShareHandlerImpl) Mockingbird.getProxyObject(NFSShareHandlerImpl.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        setPrivateField(nFSShareHandlerImpl, "deviceID", "");
        setPrivateField(nFSShareHandlerImpl, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        Mockingbird.replaceObjectForRecording(HashMap.class, "<init>()", Mockingbird.getProxyObject(HashMap.class));
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getGetRequestMO(), null);
        Mockingbird.enterTestMode(NFSShareHandlerImpl.class);
        NFSShareMO result = nFSShareHandlerImpl.get("");
        assertNull("result", result);
    }
    
    public void testModifyWithAggressiveMocks() throws Throwable {
        storeStaticField(MOType.class, "SNAS_NFS_SHARE");
        NFSShareHandlerImpl nFSShareHandlerImpl = (NFSShareHandlerImpl) Mockingbird.getProxyObject(NFSShareHandlerImpl.class, true);
        NFSShareMO nFSShareMO = (NFSShareMO) Mockingbird.getProxyObject(NFSShareMO.class);
        MO mO = (MO) Mockingbird.getProxyObject(MO.class);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        OpenApiUtils openApiUtils2 = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        setPrivateField(nFSShareHandlerImpl, "deviceID", "");
        setPrivateField(nFSShareHandlerImpl, "restRequestHandler", null);
        setPrivateField(nFSShareMO, "mo", mO);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(MOType.class, "SNAS_NFS_SHARE", mOType);
        setPrivateField(mOType, "value", new Integer(0));
        setPrivateField(mO, "properties", null);
        Mockingbird.setReturnValue(nFSShareMO.getId(), "");
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        JSONObject jSONObject = (JSONObject) Mockingbird.getProxyObject(JSONObject.class);
        Mockingbird.replaceObjectForRecording(JSONObject.class, "<init>()", jSONObject);
        Mockingbird.setReturnValue(jSONObject.put("TYPE", 0), null);
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils2);
        Mockingbird.setReturnValue(false, openApiUtils2, "composeFromMap", "(org.json.JSONObject,java.util.Map)void", null, 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getPutRequestMO(), null);
        Mockingbird.enterTestMode(NFSShareHandlerImpl.class);
        nFSShareHandlerImpl.modify(nFSShareMO);
        assertEquals("nFSShareHandlerImpl.deviceID", "", getPrivateField(nFSShareHandlerImpl, "deviceID"));
        assertNull("nFSShareHandlerImpl.restRequestHandler", getPrivateField(nFSShareHandlerImpl, "restRequestHandler"));
    }
    
    public void testCreateThrowsApiException() throws Throwable {
        try {
            new NFSShareHandlerImpl(null, "testNFSShareHandlerImplDeviceID").create(new NFSShareMO(new MO()));
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
        }
    }
    
    public void testCreateThrowsApiException1() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testNFSShareHandlerImplIp", 100);
        NFSShareHandlerImpl nFSShareHandlerImpl = new NFSShareHandlerImpl(restRequestHandler, "testNFSShareHandlerImplDeviceID");
        NFSShareMO mo = new NFSShareMO(new MO());
        Mockingbird.enterRecordingMode();
        ((OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class)).composeFromMap(null, null);
        Mockingbird.setExceptionForVoid(true, (Throwable) Mockingbird.getProxyObject(ApiException.class));
        Mockingbird.enterTestMode(NFSShareHandlerImpl.class);
        try {
            nFSShareHandlerImpl.create(mo);
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("nFSShareHandlerImpl.deviceID", "testNFSShareHandlerImplDeviceID", getPrivateField(nFSShareHandlerImpl, "deviceID"));
            assertSame("nFSShareHandlerImpl.restRequestHandler", restRequestHandler, getPrivateField(nFSShareHandlerImpl, "restRequestHandler"));
        }
    }
    
    public void testCreateThrowsApiExceptionWithAggressiveMocks() throws Throwable {
        storeStaticField(ConstantsDefine.ExceptionConstant.class, "JASONEXPMSG");
        storeStaticField(MOType.class, "SNAS_NFS_SHARE");
        NFSShareHandlerImpl nFSShareHandlerImpl = (NFSShareHandlerImpl) Mockingbird.getProxyObject(NFSShareHandlerImpl.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        JSONException jSONException = (JSONException) Mockingbird.getProxyObject(JSONException.class);
        ApiMessage apiMessage = (ApiMessage) Mockingbird.getProxyObject(ApiMessage.class);
        setPrivateField(nFSShareHandlerImpl, "deviceID", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(MOType.class, "SNAS_NFS_SHARE", mOType);
        setPrivateField(mOType, "value", new Integer(0));
        setPrivateField(ConstantsDefine.ExceptionConstant.class, "JASONEXPMSG", apiMessage);
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        JSONObject jSONObject = (JSONObject) Mockingbird.getProxyObject(JSONObject.class);
        Mockingbird.replaceObjectForRecording(JSONObject.class, "<init>()", jSONObject);
        Mockingbird.setException(jSONObject.put("TYPE", 0), jSONException);
        Mockingbird.setReturnValue(jSONException.getMessage(), "");
        Mockingbird.replaceObjectForRecording(ApiException.class, "<init>(com.huawei.ism.openapi.common.exception.ApiMessage,java.lang.Exception)", Mockingbird.getProxyObject(ApiException.class));
        Mockingbird.enterTestMode(NFSShareHandlerImpl.class);
        try {
            nFSShareHandlerImpl.create(null);
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("nFSShareHandlerImpl.deviceID", "", getPrivateField(nFSShareHandlerImpl, "deviceID"));
            assertNull("nFSShareHandlerImpl.restRequestHandler", getPrivateField(nFSShareHandlerImpl, "restRequestHandler"));
        }
    }
    
    public void testCreateThrowsIllegalArgumentException() throws Throwable {
        NFSShareHandlerImpl nFSShareHandlerImpl = new NFSShareHandlerImpl(new RestRequestHandler("testNFSShareHandlerImplIp", 100), "testNFSShareHandlerImpl\rDeviceID");
        try {
            nFSShareHandlerImpl.create(null);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
        }
    }
    
    public void testCreateThrowsNullPointerException() throws Throwable {
        NFSShareHandlerImpl nFSShareHandlerImpl = new NFSShareHandlerImpl(new RestRequestHandler("testNFSShareHandlerImplIp", 100), "testNFSShareHandlerImplDeviceID");
        try {
            nFSShareHandlerImpl.create(new NFSShareMO((MO) null));
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(NFSShareHandlerImpl.class, ex);
        }
    }
    
    public void testDeleteThrowsApiException() throws Throwable {
        try {
            new NFSShareHandlerImpl(null, "testNFSShareHandlerImplDeviceID").delete("testNFSShareHandlerImplId");
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
        }
    }
    
    public void testDeleteThrowsIllegalArgumentException() throws Throwable {
        NFSShareHandlerImpl nFSShareHandlerImpl = new NFSShareHandlerImpl(new RestRequestHandler("testNFSShareHandlerImplIp", 100), "testNFSShareHandlerImplDeviceID");
        try {
            nFSShareHandlerImpl.delete("testNFSShareHandlerImpl\rId");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
        }
    }
    
    public void testDeleteThrowsNullPointerException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testNFSShareHandlerImplIp", 100);
        NFSShareHandlerImpl nFSShareHandlerImpl = new NFSShareHandlerImpl(restRequestHandler, "testNFSShareHandlerImplDeviceID");
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getDelRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(NFSShareHandlerImpl.class);
        try {
            nFSShareHandlerImpl.delete("testNFSShareHandlerImplId");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("nFSShareHandlerImpl.deviceID", "testNFSShareHandlerImplDeviceID", getPrivateField(nFSShareHandlerImpl, "deviceID"));
            assertSame("nFSShareHandlerImpl.restRequestHandler", restRequestHandler, getPrivateField(nFSShareHandlerImpl, "restRequestHandler"));
        }
    }
    
    public void testGetThrowsApiException() throws Throwable {
        try {
            new NFSShareHandlerImpl(null, "testNFSShareHandlerImplDeviceID").get("testNFSShareHandlerImplId");
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
        }
    }
    
    public void testGetThrowsIllegalArgumentException() throws Throwable {
        NFSShareHandlerImpl nFSShareHandlerImpl = new NFSShareHandlerImpl(new RestRequestHandler("testNFSShareHandlerImplIp", 100), "testNFSShareHandlerImpl\rDeviceID");
        try {
            nFSShareHandlerImpl.get("testNFSShareHandlerImplId");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
        }
    }
    
    public void testGetThrowsNullPointerException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testNFSShareHandlerImplIp", 100);
        NFSShareHandlerImpl nFSShareHandlerImpl = new NFSShareHandlerImpl(restRequestHandler, "testNFSShareHandlerImplDeviceID");
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(NFSShareHandlerImpl.class);
        try {
            nFSShareHandlerImpl.get("testNFSShareHandlerImplId");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("nFSShareHandlerImpl.deviceID", "testNFSShareHandlerImplDeviceID", getPrivateField(nFSShareHandlerImpl, "deviceID"));
            assertSame("nFSShareHandlerImpl.restRequestHandler", restRequestHandler, getPrivateField(nFSShareHandlerImpl, "restRequestHandler"));
        }
    }
    
    public void testModifyThrowsApiException() throws Throwable {
        try {
            new NFSShareHandlerImpl(null, "testNFSShareHandlerImplDeviceID").modify(null);
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
        }
    }
    
    public void testModifyThrowsApiException1() throws Throwable {
        NFSShareMO mo = new NFSShareMO(new MO());
        NFSShareHandlerImpl nFSShareHandlerImpl = new NFSShareHandlerImpl(new RestRequestHandler("testNFSShareHandlerImplIp", 100), "testNFSShareHandlerImplDeviceID");
        Mockingbird.enterRecordingMode();
        ((OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class)).composeFromMap(null, null);
        Mockingbird.setExceptionForVoid(true, (Throwable) Mockingbird.getProxyObject(ApiException.class));
        Mockingbird.enterTestMode(NFSShareHandlerImpl.class);
        try {
            nFSShareHandlerImpl.modify(mo);
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertNull("mo.getDescription()", mo.getDescription());
        }
    }
    
    public void testModifyThrowsApiExceptionWithAggressiveMocks() throws Throwable {
        storeStaticField(ConstantsDefine.ExceptionConstant.class, "JASONEXPMSG");
        storeStaticField(MOType.class, "SNAS_NFS_SHARE");
        NFSShareHandlerImpl nFSShareHandlerImpl = (NFSShareHandlerImpl) Mockingbird.getProxyObject(NFSShareHandlerImpl.class, true);
        NFSShareMO nFSShareMO = (NFSShareMO) Mockingbird.getProxyObject(NFSShareMO.class);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        JSONException jSONException = (JSONException) Mockingbird.getProxyObject(JSONException.class);
        ApiMessage apiMessage = (ApiMessage) Mockingbird.getProxyObject(ApiMessage.class);
        setPrivateField(nFSShareHandlerImpl, "deviceID", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(MOType.class, "SNAS_NFS_SHARE", mOType);
        setPrivateField(mOType, "value", new Integer(0));
        setPrivateField(ConstantsDefine.ExceptionConstant.class, "JASONEXPMSG", apiMessage);
        Mockingbird.setReturnValue(nFSShareMO.getId(), "");
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        JSONObject jSONObject = (JSONObject) Mockingbird.getProxyObject(JSONObject.class);
        Mockingbird.replaceObjectForRecording(JSONObject.class, "<init>()", jSONObject);
        Mockingbird.setException(jSONObject.put("TYPE", 0), jSONException);
        Mockingbird.setReturnValue(jSONException.getMessage(), "");
        Mockingbird.replaceObjectForRecording(ApiException.class, "<init>(com.huawei.ism.openapi.common.exception.ApiMessage,java.lang.Exception)", Mockingbird.getProxyObject(ApiException.class));
        Mockingbird.enterTestMode(NFSShareHandlerImpl.class);
        try {
            nFSShareHandlerImpl.modify(nFSShareMO);
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("nFSShareHandlerImpl.deviceID", "", getPrivateField(nFSShareHandlerImpl, "deviceID"));
            assertNull("nFSShareHandlerImpl.restRequestHandler", getPrivateField(nFSShareHandlerImpl, "restRequestHandler"));
        }
    }
    
    public void testModifyThrowsIllegalArgumentException() throws Throwable {
        NFSShareHandlerImpl nFSShareHandlerImpl = new NFSShareHandlerImpl(new RestRequestHandler("testNFSShareHandlerImpl\rIp", 100), "testNFSShareHandlerImplDeviceID");
        try {
            nFSShareHandlerImpl.modify(null);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
        }
    }
    
    public void testModifyThrowsIllegalArgumentException1() throws Throwable {
        NFSShareHandlerImpl nFSShareHandlerImpl = new NFSShareHandlerImpl(new RestRequestHandler("testNFSShareHandlerImplIp", 100), "testNFSShareHandlerImpl\rDeviceID");
        NFSShareMO mo = new NFSShareMO();
        try {
            nFSShareHandlerImpl.modify(mo);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertNull("mo.getDescription()", mo.getDescription());
        }
    }
    
    public void testModifyThrowsNullPointerException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testNFSShareHandlerImplIp", 100);
        NFSShareHandlerImpl nFSShareHandlerImpl = new NFSShareHandlerImpl(restRequestHandler, "testNFSShareHandlerImplDeviceID");
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getPutRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(NFSShareHandlerImpl.class);
        try {
            nFSShareHandlerImpl.modify(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("nFSShareHandlerImpl.deviceID", "testNFSShareHandlerImplDeviceID", getPrivateField(nFSShareHandlerImpl, "deviceID"));
            assertSame("nFSShareHandlerImpl.restRequestHandler", restRequestHandler, getPrivateField(nFSShareHandlerImpl, "restRequestHandler"));
        }
    }
    
    public void testModifyThrowsNullPointerException1() throws Throwable {
        NFSShareMO mo = new NFSShareMO((MO) null);
        NFSShareHandlerImpl nFSShareHandlerImpl = new NFSShareHandlerImpl(new RestRequestHandler("testNFSShareHandlerImplIp", 100), "testNFSShareHandlerImplDeviceID");
        try {
            nFSShareHandlerImpl.modify(mo);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(NFSShareMO.class, ex);
        }
    }
}

