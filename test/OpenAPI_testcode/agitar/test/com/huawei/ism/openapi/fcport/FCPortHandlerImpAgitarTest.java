/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:30:04
 * Time to generate: 00:56.359 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.fcport.FCPortHandlerImp:82a2e8433f570dc3625fd5b2fa1aa744
 * agitar.src.md5=com.huawei.ism.openapi.common.DefaultCommHandler:b6802204ee7c3e439b341a5d028a1348
 *
 */

package com.huawei.ism.openapi.fcport;

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

public class FCPortHandlerImpAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return FCPortHandlerImp.class;
    }
    
    public void testConstructor() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testFCPortHandlerImpIp", 100);
        FCPortHandlerImp fCPortHandlerImp = new FCPortHandlerImp(restRequestHandler, "testFCPortHandlerImpDeviceID");
        assertNull("fCPortHandlerImp.fcPortIterator", getPrivateField(fCPortHandlerImp, "fcPortIterator"));
        assertEquals("fCPortHandlerImp.deviceID", "testFCPortHandlerImpDeviceID", getPrivateField(fCPortHandlerImp, "deviceID"));
        assertSame("fCPortHandlerImp.restRequestHandler", restRequestHandler, getPrivateField(fCPortHandlerImp, "restRequestHandler"));
    }
    
    public void testGetBatch() throws Throwable {
        FCPortHandlerImp fCPortHandlerImp = new FCPortHandlerImp(new RestRequestHandler("testFCPortHandlerImpIp", 100), "testFCPortHandlerImpDeviceID");
        FCPortQuery condition = new FCPortQuery(new FCPortMO(), 100L, 1000L);
        FCPortIterator batch = fCPortHandlerImp.getBatch(condition);
        FCPortIterator result = fCPortHandlerImp.getBatch(condition);
        assertSame("result", batch, result);
    }
    
    public void testGetBatch1() throws Throwable {
        FCPortHandlerImp fCPortHandlerImp = new FCPortHandlerImp(new RestRequestHandler("testFCPortHandlerImpIp", 100), "testFCPortHandlerImpDeviceID");
        FCPortIterator result = fCPortHandlerImp.getBatch(new FCPortQuery(new FCPortMO(), 100L, 1000L));
        assertSame("fCPortHandlerImp.fcPortIterator", result, getPrivateField(fCPortHandlerImp, "fcPortIterator"));
        assertEquals("result.getConcretFilterHeaders().length", 1, result.getConcretFilterHeaders().length);
    }
    
    public void testGetWithAggressiveMocks() throws Throwable {
        storeStaticField(MOType.class, "FC_PORT");
        FCPortHandlerImp fCPortHandlerImp = (FCPortHandlerImp) Mockingbird.getProxyObject(FCPortHandlerImp.class, true);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        setPrivateField(fCPortHandlerImp, "deviceID", "");
        setPrivateField(fCPortHandlerImp, "restRequestHandler", null);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(MOType.class, "FC_PORT", mOType);
        setPrivateField(mOType, "value", new Integer(0));
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        HashMap hashMap = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        Mockingbird.replaceObjectForRecording(HashMap.class, "<init>()", hashMap);
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", new Object[] {"ID", ""}, null, 1);
        RestManager restManager = (RestManager) Mockingbird.getProxyObject(RestManager.class);
        Mockingbird.replaceObjectForRecording(RestManager.class, "<init>(java.lang.Class,com.huawei.ism.openapi.common.commu.rest.RestRequestHandler,java.lang.String,java.util.Map,org.json.JSONObject)", restManager);
        Mockingbird.setReturnValue(restManager.getGetRequestMO(), null);
        Mockingbird.enterTestMode(FCPortHandlerImp.class);
        FCPortMO result = fCPortHandlerImp.get("");
        assertNull("result", result);
    }
    
    public void testModifyWithAggressiveMocks() throws Throwable {
        storeStaticField(EnumDefine.LOG_TYPE_E.class, "LOG_INFO");
        storeStaticField(MOType.class, "FC_PORT");
        FCPortHandlerImp fCPortHandlerImp = (FCPortHandlerImp) Mockingbird.getProxyObject(FCPortHandlerImp.class, true);
        FCPortMO fCPortMO = (FCPortMO) Mockingbird.getProxyObject(FCPortMO.class);
        MO mO = (MO) Mockingbird.getProxyObject(MO.class);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        LogUtil logUtil = (LogUtil) Mockingbird.getProxyObject(LogUtil.class);
        OpenApiUtils openApiUtils2 = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        setPrivateField(fCPortHandlerImp, "deviceID", "");
        setPrivateField(fCPortHandlerImp, "restRequestHandler", null);
        setPrivateField(fCPortMO, "mo", mO);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(MOType.class, "FC_PORT", mOType);
        setPrivateField(mOType, "value", new Integer(0));
        setPrivateField(mO, "properties", map);
        setPrivateField(EnumDefine.LOG_TYPE_E.class, "LOG_INFO", null);
        Mockingbird.setReturnValue(fCPortMO.getId(), "");
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
        Mockingbird.setReturnValue(restManager.getPutRequestMO(), null);
        Mockingbird.enterTestMode(FCPortHandlerImp.class);
        fCPortHandlerImp.modify(fCPortMO);
        assertEquals("fCPortHandlerImp.deviceID", "", getPrivateField(fCPortHandlerImp, "deviceID"));
        assertNull("fCPortHandlerImp.restRequestHandler", getPrivateField(fCPortHandlerImp, "restRequestHandler"));
    }
    
    public void testGetFCPortByPortGroupThrowsApiException() throws Throwable {
        try {
            new FCPortHandlerImp(null, "testFCPortHandlerImpDeviceID").getFCPortByPortGroup("testFCPortHandlerImpPortGroupId");
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
        }
    }
    
    public void testGetFCPortByPortGroupThrowsIllegalArgumentException() throws Throwable {
        FCPortHandlerImp fCPortHandlerImp = new FCPortHandlerImp(new RestRequestHandler("testFCPortHandlerImpIp", 100), "testFCPortHandlerImpDeviceID");
        try {
            fCPortHandlerImp.getFCPortByPortGroup("testFCPortHandlerImp\rPortGroupId");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
        }
    }
    
    public void testGetFCPortByPortGroupThrowsNullPointerException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testFCPortHandlerImpIp", 100);
        FCPortHandlerImp fCPortHandlerImp = new FCPortHandlerImp(restRequestHandler, "testFCPortHandlerImpDeviceID");
        Mockingbird.enterRecordingMode();
        Object getRequestMOList = ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMOList();
        Mockingbird.setException(true, getRequestMOList, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(FCPortHandlerImp.class);
        try {
            fCPortHandlerImp.getFCPortByPortGroup("testFCPortHandlerImpPortGroupId");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("fCPortHandlerImp.deviceID", "testFCPortHandlerImpDeviceID", getPrivateField(fCPortHandlerImp, "deviceID"));
            assertSame("fCPortHandlerImp.restRequestHandler", restRequestHandler, getPrivateField(fCPortHandlerImp, "restRequestHandler"));
        }
    }
    
    public void testGetThrowsApiException() throws Throwable {
        try {
            new FCPortHandlerImp(null, "testFCPortHandlerImpDeviceID").get("testFCPortHandlerImpId");
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
        }
    }
    
    public void testGetThrowsIllegalArgumentException() throws Throwable {
        FCPortHandlerImp fCPortHandlerImp = new FCPortHandlerImp(new RestRequestHandler("testFCPortHandlerImpIp", 100), "testFCPortHandlerImpDeviceID");
        try {
            fCPortHandlerImp.get("testFCPortHandlerImp\rId");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
        }
    }
    
    public void testGetThrowsNullPointerException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testFCPortHandlerImpIp", 100);
        FCPortHandlerImp fCPortHandlerImp = new FCPortHandlerImp(restRequestHandler, "testFCPortHandlerImpDeviceID");
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getGetRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(FCPortHandlerImp.class);
        try {
            fCPortHandlerImp.get("testFCPortHandlerImpId");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("fCPortHandlerImp.deviceID", "testFCPortHandlerImpDeviceID", getPrivateField(fCPortHandlerImp, "deviceID"));
            assertSame("fCPortHandlerImp.restRequestHandler", restRequestHandler, getPrivateField(fCPortHandlerImp, "restRequestHandler"));
        }
    }
    
    public void testModifyThrowsApiException() throws Throwable {
        try {
            new FCPortHandlerImp(null, "testFCPortHandlerImpDeviceID").modify(null);
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("ex.getMessage()", "the restRequestHandler is null", ex.getMessage());
            assertThrownBy(RestManager.class, ex);
            assertEquals("ex.getErrMessage().getErrorDescription()", "the restRequestHandler is null", ex.getErrMessage().getErrorDescription());
            assertNull("ex.getException()", ex.getException());
        }
    }
    
    public void testModifyThrowsApiExceptionWithAggressiveMocks() throws Throwable {
        storeStaticField(ConstantsDefine.ExceptionConstant.class, "JASONEXPMSG");
        storeStaticField(MOType.class, "FC_PORT");
        FCPortHandlerImp fCPortHandlerImp = (FCPortHandlerImp) Mockingbird.getProxyObject(FCPortHandlerImp.class, true);
        FCPortMO fCPortMO = (FCPortMO) Mockingbird.getProxyObject(FCPortMO.class);
        OpenApiUtils openApiUtils = (OpenApiUtils) Mockingbird.getProxyObject(OpenApiUtils.class);
        MOType mOType = (MOType) Mockingbird.getProxyObject(MOType.class);
        JSONException jSONException = (JSONException) Mockingbird.getProxyObject(JSONException.class);
        ApiMessage apiMessage = (ApiMessage) Mockingbird.getProxyObject(ApiMessage.class);
        setPrivateField(fCPortHandlerImp, "deviceID", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(OpenApiUtils.getOpenApiUtilsInstance(), openApiUtils);
        setPrivateField(MOType.class, "FC_PORT", mOType);
        setPrivateField(mOType, "value", new Integer(0));
        setPrivateField(ConstantsDefine.ExceptionConstant.class, "JASONEXPMSG", apiMessage);
        Mockingbird.setReturnValue(fCPortMO.getId(), "");
        Mockingbird.setReturnValue(false, openApiUtils, "composeRelativeUri", "(java.lang.String[])java.lang.String", "", 1);
        JSONObject jSONObject = (JSONObject) Mockingbird.getProxyObject(JSONObject.class);
        Mockingbird.replaceObjectForRecording(JSONObject.class, "<init>()", jSONObject);
        Mockingbird.setException(jSONObject.put("TYPE", 0), jSONException);
        Mockingbird.setReturnValue(jSONException.getMessage(), "");
        Mockingbird.replaceObjectForRecording(ApiException.class, "<init>(com.huawei.ism.openapi.common.exception.ApiMessage,java.lang.Exception)", Mockingbird.getProxyObject(ApiException.class));
        Mockingbird.enterTestMode(FCPortHandlerImp.class);
        try {
            fCPortHandlerImp.modify(fCPortMO);
            fail("Expected ApiException to be thrown");
        } catch (ApiException ex) {
            assertEquals("fCPortHandlerImp.deviceID", "", getPrivateField(fCPortHandlerImp, "deviceID"));
            assertNull("fCPortHandlerImp.restRequestHandler", getPrivateField(fCPortHandlerImp, "restRequestHandler"));
        }
    }
    
    public void testModifyThrowsIllegalArgumentException() throws Throwable {
        FCPortMO mo = new FCPortMO();
        FCPortHandlerImp fCPortHandlerImp = new FCPortHandlerImp(new RestRequestHandler("testFCPortHandlerImpIp", 100), "testFCPortHandlerImp\rDeviceID");
        try {
            fCPortHandlerImp.modify(mo);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(URI.class, ex);
            assertNull("mo.getId()", mo.getId());
        }
    }
    
    public void testModifyThrowsNullPointerException() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testFCPortHandlerImpIp", 100);
        FCPortHandlerImp fCPortHandlerImp = new FCPortHandlerImp(restRequestHandler, "testFCPortHandlerImpDeviceID");
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(true, ((RestManager) Mockingbird.getProxyObject(RestManager.class)).getPutRequestMO(), (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(FCPortHandlerImp.class);
        try {
            fCPortHandlerImp.modify(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("fCPortHandlerImp.deviceID", "testFCPortHandlerImpDeviceID", getPrivateField(fCPortHandlerImp, "deviceID"));
            assertSame("fCPortHandlerImp.restRequestHandler", restRequestHandler, getPrivateField(fCPortHandlerImp, "restRequestHandler"));
        }
    }
}
