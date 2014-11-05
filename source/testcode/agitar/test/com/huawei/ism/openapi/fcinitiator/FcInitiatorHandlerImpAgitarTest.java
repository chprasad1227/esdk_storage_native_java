/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:31:39
 * Time to generate: 01:22.531 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.fcinitiator.FcInitiatorHandlerImp:67a9355bb1c1c23bf22f1cf18cf230ee
 * agitar.src.md5=com.huawei.ism.openapi.common.DefaultCommHandler:b6802204ee7c3e439b341a5d028a1348
 *
 */

package com.huawei.ism.openapi.fcinitiator;

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

public class FcInitiatorHandlerImpAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return FcInitiatorHandlerImp.class;
    }
    
    public void testConstructor() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testFcInitiatorHandlerImpIp", 100);
        FcInitiatorHandlerImp fcInitiatorHandlerImp = new FcInitiatorHandlerImp(restRequestHandler, "testFcInitiatorHandlerImpDeviceID");
        assertNull("fcInitiatorHandlerImp.fcInitiatorIterator", getPrivateField(fcInitiatorHandlerImp, "fcInitiatorIterator"));
        assertEquals("fcInitiatorHandlerImp.deviceID", "testFcInitiatorHandlerImpDeviceID", getPrivateField(fcInitiatorHandlerImp, "deviceID"));
        assertSame("fcInitiatorHandlerImp.restRequestHandler", restRequestHandler, getPrivateField(fcInitiatorHandlerImp, "restRequestHandler"));
    }
    
    public void testCreateWithAggressiveMocks() throws Throwable {
        storeStaticField(MOType.class, "HOST");
        storeStaticField(EnumDefine.LOG_TYPE_E.class, "LOG_INFO");
        storeStaticField(MOType.class, "FC_INITIATOR");
        FcInitiatorHandlerImp fcInitiatorHandlerImp = (FcInitiatorHandlerImp) Mockingbird.getProxyObject(FcInitiatorHandlerImp.class, true);
        FcInitiatorMO fcInitiatorMO = (FcInitiatorMO) Mockingbird.getProxyObject(FcInitiatorMO.class);
        MO mO = (MO) Mockingbird.getProxyObject(MO.class);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        MOType mOType2 = (MOType) Mockingbird.getProxyObject(MOType.class);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        LogUtil logUtil = (LogUtil) Mockingbird.getProxyObject(LogUtil.class);
        OpenApiUtils openApiUtils2 = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        setPrivateField(fcInitiatorHandlerImp, "deviceID", "");
        setPrivateField(fcInitiatorHandlerImp, "restRequestHandler", null);
        setPrivateField(fcInitiatorMO, "mo", mO);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(MOType.class, "FC_INITIATOR", mOType);
        setPrivateField(MOType.class, "HOST", mOType2);
        setPrivateField(mOType, "value", new Integer(0));
        setPrivateField(mOType2, "value", new Integer(0));
        setPrivateField(mO, "properties", map);
        setPrivateField(EnumDefine.LOG_TYPE_E.class, "LOG_INFO", null);
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        JSONObject jSONObject = (JSONObject) Mockingbird.getProxyObject(JSONObject.class);
        Mockingbird.replaceObjectForRecording(JSONObject.class, "<init>()", jSONObject);
        Mockingbird.setReturnValue(jSONObject.put("TYPE", 0), null);
        Mockingbird.setReturnValue(jSONObject.put("PARENTTYPE", 0), null);
        Mockingbird.setReturnValue(LogUtil.getLogUtilInstance(), logUtil);
        Mockingbird.setReturnValue(false, map, "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, logUtil, "showLog", "(com.huawei.ism.openapi.common.keydeifines.EnumDefine$LOG_TYPE_E,java.lang.String)void", null, 1);
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils2);
        Mockingbird.setReturnValue(false, openApiUtils2, "composeFromMap", "(org.json.JSONObject,java.util.Map)void", null, 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getPostRequestMO(), null);
        Mockingbird.enterTestMode(FcInitiatorHandlerImp.class);
        FcInitiatorMO result = fcInitiatorHandlerImp.create(fcInitiatorMO);
        assertNull("result", result);
    }
    
    public void testDeleteWithAggressiveMocks() throws Throwable {
        storeStaticField(MOType.class, "FC_INITIATOR");
        FcInitiatorHandlerImp fcInitiatorHandlerImp = (FcInitiatorHandlerImp) Mockingbird.getProxyObject(FcInitiatorHandlerImp.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        setPrivateField(fcInitiatorHandlerImp, "deviceID", "");
        setPrivateField(fcInitiatorHandlerImp, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(MOType.class, "FC_INITIATOR", mOType);
        setPrivateField(mOType, "value", new Integer(0));
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        HashMap hashMap = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        Mockingbird.replaceObjectForRecording(HashMap.class, "<init>()", hashMap);
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", new Object[] {"ID", ""}, null, 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getDelRequestMO(), null);
        Mockingbird.enterTestMode(FcInitiatorHandlerImp.class);
        fcInitiatorHandlerImp.delete("");
        assertEquals("fcInitiatorHandlerImp.deviceID", "", getPrivateField(fcInitiatorHandlerImp, "deviceID"));
        assertNull("fcInitiatorHandlerImp.restRequestHandler", getPrivateField(fcInitiatorHandlerImp, "restRequestHandler"));
    }
    
    public void testGetBatch() throws Throwable {
        FcInitiatorHandlerImp fcInitiatorHandlerImp = new FcInitiatorHandlerImp(new RestRequestHandler("testFcInitiatorHandlerImpIp", 100), "testFcInitiatorHandlerImpDeviceID");
        FcInitiatorIterator result = fcInitiatorHandlerImp.getBatch(new FcInitiatorQuery(new FcInitiatorMO(), 100L, 1000L));
        assertSame("fcInitiatorHandlerImp.fcInitiatorIterator", result, getPrivateField(fcInitiatorHandlerImp, "fcInitiatorIterator"));
        assertEquals("result.getConcretFilterHeaders().length", 0, result.getConcretFilterHeaders().length);
    }
    
    public void testGetBatch1() throws Throwable {
        FcInitiatorHandlerImp fcInitiatorHandlerImp = new FcInitiatorHandlerImp(new RestRequestHandler("testFcInitiatorHandlerImpIp", 100), "testFcInitiatorHandlerImpDeviceID");
        FcInitiatorQuery condition = new FcInitiatorQuery(new FcInitiatorMO(), 100L, 1000L);
        FcInitiatorIterator batch = fcInitiatorHandlerImp.getBatch(condition);
        FcInitiatorIterator result = fcInitiatorHandlerImp.getBatch(condition);
        assertSame("result", batch, result);
    }
    
    public void testGetWithAggressiveMocks() throws Throwable {
        storeStaticField(MOType.class, "FC_INITIATOR");
        FcInitiatorHandlerImp fcInitiatorHandlerImp = (FcInitiatorHandlerImp) Mockingbird.getProxyObject(FcInitiatorHandlerImp.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        setPrivateField(fcInitiatorHandlerImp, "deviceID", "");
        setPrivateField(fcInitiatorHandlerImp, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(MOType.class, "FC_INITIATOR", mOType);
        setPrivateField(mOType, "value", new Integer(0));
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        HashMap hashMap = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        Mockingbird.replaceObjectForRecording(HashMap.class, "<init>()", hashMap);
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", new Object[] {"ID", ""}, null, 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getGetRequestMO(), null);
        Mockingbird.enterTestMode(FcInitiatorHandlerImp.class);
        FcInitiatorMO result = fcInitiatorHandlerImp.get("");
        assertNull("result", result);
    }
    
    public void testModifyWithAggressiveMocks() throws Throwable {
        storeStaticField(MOType.class, "HOST");
        storeStaticField(EnumDefine.LOG_TYPE_E.class, "LOG_INFO");
        storeStaticField(MOType.class, "FC_INITIATOR");
        FcInitiatorHandlerImp fcInitiatorHandlerImp = (FcInitiatorHandlerImp) Mockingbird.getProxyObject(FcInitiatorHandlerImp.class, true);
        FcInitiatorMO fcInitiatorMO = (FcInitiatorMO) Mockingbird.getProxyObject(FcInitiatorMO.class);
        MO mO = (MO) Mockingbird.getProxyObject(MO.class);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        MOType mOType2 = (MOType) Mockingbird.getProxyObject(MOType.class);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        LogUtil logUtil = (LogUtil) Mockingbird.getProxyObject(LogUtil.class);
        OpenApiUtils openApiUtils2 = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        setPrivateField(fcInitiatorHandlerImp, "deviceID", "");
        setPrivateField(fcInitiatorHandlerImp, "restRequestHandler", null);
        setPrivateField(fcInitiatorMO, "mo", mO);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(MOType.class, "FC_INITIATOR", mOType);
        setPrivateField(MOType.class, "HOST", mOType2);
        setPrivateField(mOType, "value", new Integer(0));
        setPrivateField(mOType2, "value", new Integer(0));
        setPrivateField(mO, "properties", map);
        setPrivateField(EnumDefine.LOG_TYPE_E.class, "LOG_INFO", null);
        Mockingbird.setReturnValue(fcInitiatorMO.getId(), "");
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        JSONObject jSONObject = (JSONObject) Mockingbird.getProxyObject(JSONObject.class);
        Mockingbird.replaceObjectForRecording(JSONObject.class, "<init>()", jSONObject);
        Mockingbird.setReturnValue(jSONObject.put("TYPE", 0), null);
        Mockingbird.setReturnValue(jSONObject.put("PARENTTYPE", 0), null);
        Mockingbird.setReturnValue(LogUtil.getLogUtilInstance(), logUtil);
        Mockingbird.setReturnValue(false, map, "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, logUtil, "showLog", "(com.huawei.ism.openapi.common.keydeifines.EnumDefine$LOG_TYPE_E,java.lang.String)void", null, 1);
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils2);
        Mockingbird.setReturnValue(false, openApiUtils2, "composeFromMap", "(org.json.JSONObject,java.util.Map)void", null, 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getPutRequestMO(), null);
        Mockingbird.enterTestMode(FcInitiatorHandlerImp.class);
        fcInitiatorHandlerImp.modify(fcInitiatorMO);
        assertEquals("fcInitiatorHandlerImp.deviceID", "", getPrivateField(fcInitiatorHandlerImp, "deviceID"));
        assertNull("fcInitiatorHandlerImp.restRequestHandler", getPrivateField(fcInitiatorHandlerImp, "restRequestHandler"));
    }
    
    public void testRemoveFcFromHostWithAggressiveMocks() throws Throwable {
        storeStaticField(MOType.class, "FC_INITIATOR");
        FcInitiatorHandlerImp fcInitiatorHandlerImp = (FcInitiatorHandlerImp) Mockingbird.getProxyObject(FcInitiatorHandlerImp.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        setPrivateField(fcInitiatorHandlerImp, "deviceID", "");
        setPrivateField(fcInitiatorHandlerImp, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(MOType.class, "FC_INITIATOR", mOType);
        setPrivateField(mOType, "value", new Integer(0));
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        JSONObject jSONObject = (JSONObject) Mockingbird.getProxyObject(JSONObject.class);
        Mockingbird.replaceObjectForRecording(JSONObject.class, "<init>()", jSONObject);
        Mockingbird.setReturnValue(jSONObject.put("TYPE", 0), null);
        Mockingbird.setReturnValue(jSONObject.put("ID", ""), null);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getPutRequestMO(), null);
        Mockingbird.enterTestMode(FcInitiatorHandlerImp.class);
        fcInitiatorHandlerImp.removeFcFromHost("");
        assertEquals("fcInitiatorHandlerImp.deviceID", "", getPrivateField(fcInitiatorHandlerImp, "deviceID"));
        assertNull("fcInitiatorHandlerImp.restRequestHandler", getPrivateField(fcInitiatorHandlerImp, "restRequestHandler"));
    }
    
    public void testCreateThrowsApiException() throws Throwable {
        try {
            new FcInitiatorHandlerImp(null, "testFcInitiatorHandlerImpDeviceID").create(null);
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
        }
    }
    
    public void testCreateThrowsApiExceptionWithAggressiveMocks() throws Throwable {
        storeStaticField(ConstantsDefine.ExceptionConstant.class, "JASONEXPMSG");
        storeStaticField(MOType.class, "HOST");
        storeStaticField(MOType.class, "FC_INITIATOR");
        FcInitiatorHandlerImp fcInitiatorHandlerImp = (FcInitiatorHandlerImp) Mockingbird.getProxyObject(FcInitiatorHandlerImp.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        MOType mOType2 = (MOType) Mockingbird.getProxyObject(MOType.class);
        JSONException jSONException = (JSONException) Mockingbird.getProxyObject(JSONException.class);
        ApiMessage apiMessage = (ApiMessage) Mockingbird.getProxyObject(ApiMessage.class);
        setPrivateField(fcInitiatorHandlerImp, "deviceID", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(MOType.class, "FC_INITIATOR", mOType);
        setPrivateField(MOType.class, "HOST", mOType2);
        setPrivateField(mOType, "value", new Integer(0));
        setPrivateField(mOType2, "value", new Integer(0));
        setPrivateField(ConstantsDefine.ExceptionConstant.class, "JASONEXPMSG", apiMessage);
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        JSONObject jSONObject = (JSONObject) Mockingbird.getProxyObject(JSONObject.class);
        Mockingbird.replaceObjectForRecording(JSONObject.class, "<init>()", jSONObject);
        Mockingbird.setReturnValue(jSONObject.put("TYPE", 0), null);
        Mockingbird.setException(jSONObject.put("PARENTTYPE", 0), jSONException);
        Mockingbird.setReturnValue(jSONException.getMessage(), "");
        Mockingbird.replaceObjectForRecording(ApiException.class, "<init>(com.huawei.ism.openapi.common.exception.ApiMessage,java.lang.Exception)", Mockingbird.getProxyObject(ApiException.class));
        Mockingbird.enterTestMode(FcInitiatorHandlerImp.class);
        try {
            fcInitiatorHandlerImp.create(null);
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("fcInitiatorHandlerImp.deviceID", "", getPrivateField(fcInitiatorHandlerImp, "deviceID"));
            assertNull("fcInitiatorHandlerImp.restRequestHandler", getPrivateField(fcInitiatorHandlerImp, "restRequestHandler"));
        }
    }
    
    public void testCreateThrowsIllegalArgumentException() throws Throwable {
        FcInitiatorHandlerImp fcInitiatorHandlerImp = new FcInitiatorHandlerImp(new RestRequestHandler("testFcInitiatorHandlerImpIp", 100), "testFcInitiatorHandlerImp\rDeviceID");
        try {
            fcInitiatorHandlerImp.create(new FcInitiatorMO());
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
        }
    }
    
    public void testCreateThrowsNullPointerException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testFcInitiatorHandlerImpIp", 100);
        FcInitiatorHandlerImp fcInitiatorHandlerImp = new FcInitiatorHandlerImp(restRequestHandler, "testFcInitiatorHandlerImpDeviceID");
        FcInitiatorMO mo = new FcInitiatorMO();
        Mockingbird.enterRecordingMode();
        Object postRequestMO = ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getPostRequestMO();
        Mockingbird.setException(true, postRequestMO, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(FcInitiatorHandlerImp.class);
        try {
            fcInitiatorHandlerImp.create(mo);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("fcInitiatorHandlerImp.deviceID", "testFcInitiatorHandlerImpDeviceID", getPrivateField(fcInitiatorHandlerImp, "deviceID"));
            assertSame("fcInitiatorHandlerImp.restRequestHandler", restRequestHandler, getPrivateField(fcInitiatorHandlerImp, "restRequestHandler"));
        }
    }
    
    public void testDeleteThrowsApiException() throws Throwable {
        try {
            new FcInitiatorHandlerImp(null, "testFcInitiatorHandlerImpDeviceID").delete("testFcInitiatorHandlerImpId");
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
        }
    }
    
    public void testDeleteThrowsIllegalArgumentException() throws Throwable {
        FcInitiatorHandlerImp fcInitiatorHandlerImp = new FcInitiatorHandlerImp(new RestRequestHandler("testFcInitiatorHandlerImpIp", 100), "testFcInitiatorHandlerImpDeviceID");
        try {
            fcInitiatorHandlerImp.delete("testFcInitiatorHandlerImp\rId");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
        }
    }
    
    public void testDeleteThrowsNullPointerException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testFcInitiatorHandlerImpIp", 100);
        FcInitiatorHandlerImp fcInitiatorHandlerImp = new FcInitiatorHandlerImp(restRequestHandler, "testFcInitiatorHandlerImpDeviceID");
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getDelRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(FcInitiatorHandlerImp.class);
        try {
            fcInitiatorHandlerImp.delete("testFcInitiatorHandlerImpId");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("fcInitiatorHandlerImp.deviceID", "testFcInitiatorHandlerImpDeviceID", getPrivateField(fcInitiatorHandlerImp, "deviceID"));
            assertSame("fcInitiatorHandlerImp.restRequestHandler", restRequestHandler, getPrivateField(fcInitiatorHandlerImp, "restRequestHandler"));
        }
    }
    
    public void testGetThrowsApiException() throws Throwable {
        try {
            new FcInitiatorHandlerImp(null, "testFcInitiatorHandlerImpDeviceID").get("testFcInitiatorHandlerImpId");
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
        }
    }
    
    public void testGetThrowsIllegalArgumentException() throws Throwable {
        FcInitiatorHandlerImp fcInitiatorHandlerImp = new FcInitiatorHandlerImp(new RestRequestHandler("testFcInitiatorHandlerImpIp", 100), "testFcInitiatorHandlerImpDeviceID");
        try {
            fcInitiatorHandlerImp.get("testFcInitiatorHandlerImp\rId");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
        }
    }
    
    public void testGetThrowsNullPointerException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testFcInitiatorHandlerImpIp", 100);
        FcInitiatorHandlerImp fcInitiatorHandlerImp = new FcInitiatorHandlerImp(restRequestHandler, "testFcInitiatorHandlerImpDeviceID");
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(FcInitiatorHandlerImp.class);
        try {
            fcInitiatorHandlerImp.get("testFcInitiatorHandlerImpId");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("fcInitiatorHandlerImp.deviceID", "testFcInitiatorHandlerImpDeviceID", getPrivateField(fcInitiatorHandlerImp, "deviceID"));
            assertSame("fcInitiatorHandlerImp.restRequestHandler", restRequestHandler, getPrivateField(fcInitiatorHandlerImp, "restRequestHandler"));
        }
    }
    
    public void testModifyThrowsApiException() throws Throwable {
        FcInitiatorHandlerImp fcInitiatorHandlerImp = new FcInitiatorHandlerImp(null, "testFcInitiatorHandlerImpDeviceID");
        FcInitiatorMO mo = new FcInitiatorMO(null);
        try {
            fcInitiatorHandlerImp.modify(mo);
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
            assertNull("mo.getId()", mo.getId());
        }
    }
    
    public void testModifyThrowsApiExceptionWithAggressiveMocks() throws Throwable {
        storeStaticField(ConstantsDefine.ExceptionConstant.class, "JASONEXPMSG");
        storeStaticField(MOType.class, "HOST");
        storeStaticField(MOType.class, "FC_INITIATOR");
        FcInitiatorHandlerImp fcInitiatorHandlerImp = (FcInitiatorHandlerImp) Mockingbird.getProxyObject(FcInitiatorHandlerImp.class, true);
        FcInitiatorMO fcInitiatorMO = (FcInitiatorMO) Mockingbird.getProxyObject(FcInitiatorMO.class);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        MOType mOType2 = (MOType) Mockingbird.getProxyObject(MOType.class);
        JSONException jSONException = (JSONException) Mockingbird.getProxyObject(JSONException.class);
        ApiMessage apiMessage = (ApiMessage) Mockingbird.getProxyObject(ApiMessage.class);
        setPrivateField(fcInitiatorHandlerImp, "deviceID", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(MOType.class, "FC_INITIATOR", mOType);
        setPrivateField(MOType.class, "HOST", mOType2);
        setPrivateField(mOType, "value", new Integer(0));
        setPrivateField(mOType2, "value", new Integer(0));
        setPrivateField(ConstantsDefine.ExceptionConstant.class, "JASONEXPMSG", apiMessage);
        Mockingbird.setReturnValue(fcInitiatorMO.getId(), "");
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        JSONObject jSONObject = (JSONObject) Mockingbird.getProxyObject(JSONObject.class);
        Mockingbird.replaceObjectForRecording(JSONObject.class, "<init>()", jSONObject);
        Mockingbird.setReturnValue(jSONObject.put("TYPE", 0), null);
        Mockingbird.setException(jSONObject.put("PARENTTYPE", 0), jSONException);
        Mockingbird.setReturnValue(jSONException.getMessage(), "");
        Mockingbird.replaceObjectForRecording(ApiException.class, "<init>(com.huawei.ism.openapi.common.exception.ApiMessage,java.lang.Exception)", Mockingbird.getProxyObject(ApiException.class));
        Mockingbird.enterTestMode(FcInitiatorHandlerImp.class);
        try {
            fcInitiatorHandlerImp.modify(fcInitiatorMO);
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("fcInitiatorHandlerImp.deviceID", "", getPrivateField(fcInitiatorHandlerImp, "deviceID"));
            assertNull("fcInitiatorHandlerImp.restRequestHandler", getPrivateField(fcInitiatorHandlerImp, "restRequestHandler"));
        }
    }
    
    public void testModifyThrowsIllegalArgumentException() throws Throwable {
        FcInitiatorHandlerImp fcInitiatorHandlerImp = new FcInitiatorHandlerImp(new RestRequestHandler("testFcInitiatorHandlerImpIp", 100), "testFcInitiatorHandlerImp\rDeviceID");
        FcInitiatorMO mo = new FcInitiatorMO();
        try {
            fcInitiatorHandlerImp.modify(mo);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertNull("mo.getId()", mo.getId());
        }
    }
    
    public void testModifyThrowsNullPointerException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testFcInitiatorHandlerImpIp", 100);
        FcInitiatorHandlerImp fcInitiatorHandlerImp = new FcInitiatorHandlerImp(restRequestHandler, "testFcInitiatorHandlerImpDeviceID");
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getPutRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(FcInitiatorHandlerImp.class);
        try {
            fcInitiatorHandlerImp.modify(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("fcInitiatorHandlerImp.deviceID", "testFcInitiatorHandlerImpDeviceID", getPrivateField(fcInitiatorHandlerImp, "deviceID"));
            assertSame("fcInitiatorHandlerImp.restRequestHandler", restRequestHandler, getPrivateField(fcInitiatorHandlerImp, "restRequestHandler"));
        }
    }
    
    public void testRemoveFcFromHostThrowsApiException() throws Throwable {
        try {
            new FcInitiatorHandlerImp(null, "testFcInitiatorHandlerImpDeviceID").removeFcFromHost("testFcInitiatorHandlerImpId");
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
        }
    }
    
    public void testRemoveFcFromHostThrowsApiExceptionWithAggressiveMocks() throws Throwable {
        storeStaticField(ConstantsDefine.ExceptionConstant.class, "JASONEXPMSG");
        storeStaticField(MOType.class, "FC_INITIATOR");
        FcInitiatorHandlerImp fcInitiatorHandlerImp = (FcInitiatorHandlerImp) Mockingbird.getProxyObject(FcInitiatorHandlerImp.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        JSONException jSONException = (JSONException) Mockingbird.getProxyObject(JSONException.class);
        ApiMessage apiMessage = (ApiMessage) Mockingbird.getProxyObject(ApiMessage.class);
        setPrivateField(fcInitiatorHandlerImp, "deviceID", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(MOType.class, "FC_INITIATOR", mOType);
        setPrivateField(mOType, "value", new Integer(0));
        setPrivateField(ConstantsDefine.ExceptionConstant.class, "JASONEXPMSG", apiMessage);
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        JSONObject jSONObject = (JSONObject) Mockingbird.getProxyObject(JSONObject.class);
        Mockingbird.replaceObjectForRecording(JSONObject.class, "<init>()", jSONObject);
        Mockingbird.setReturnValue(jSONObject.put("TYPE", 0), null);
        Mockingbird.setException(jSONObject.put("ID", ""), jSONException);
        Mockingbird.setReturnValue(jSONException.getMessage(), "");
        Mockingbird.replaceObjectForRecording(ApiException.class, "<init>(com.huawei.ism.openapi.common.exception.ApiMessage,java.lang.Exception)", Mockingbird.getProxyObject(ApiException.class));
        Mockingbird.enterTestMode(FcInitiatorHandlerImp.class);
        try {
            fcInitiatorHandlerImp.removeFcFromHost("");
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("fcInitiatorHandlerImp.deviceID", "", getPrivateField(fcInitiatorHandlerImp, "deviceID"));
            assertNull("fcInitiatorHandlerImp.restRequestHandler", getPrivateField(fcInitiatorHandlerImp, "restRequestHandler"));
        }
    }
    
    public void testRemoveFcFromHostThrowsIllegalArgumentException() throws Throwable {
        FcInitiatorHandlerImp fcInitiatorHandlerImp = new FcInitiatorHandlerImp(new RestRequestHandler("testFcInitiatorHandlerImpIp", 100), "testFcInitiatorHandlerImp\rDeviceID");
        try {
            fcInitiatorHandlerImp.removeFcFromHost("testFcInitiatorHandlerImpId");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
        }
    }
    
    public void testRemoveFcFromHostThrowsNullPointerException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testFcInitiatorHandlerImpIp", 100);
        FcInitiatorHandlerImp fcInitiatorHandlerImp = new FcInitiatorHandlerImp(restRequestHandler, "testFcInitiatorHandlerImpDeviceID");
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getPutRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(FcInitiatorHandlerImp.class);
        try {
            fcInitiatorHandlerImp.removeFcFromHost("testFcInitiatorHandlerImpId");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("fcInitiatorHandlerImp.deviceID", "testFcInitiatorHandlerImpDeviceID", getPrivateField(fcInitiatorHandlerImp, "deviceID"));
            assertSame("fcInitiatorHandlerImp.restRequestHandler", restRequestHandler, getPrivateField(fcInitiatorHandlerImp, "restRequestHandler"));
        }
    }
}

