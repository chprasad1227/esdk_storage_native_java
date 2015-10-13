/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:33:39
 * Time to generate: 00:29.109 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.iscsiinitiator.ISCSIInitiatorMO:2c927139d60608c6cc699f33b0628b39
 *
 */

package com.huawei.ism.openapi.iscsiinitiator;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import org.json.JSONObject;

public class ISCSIInitiatorMOAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return ISCSIInitiatorMO.class;
    }
    
    public void testConstructor() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 1, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testConstructor1() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO(new JSONObject());
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 0, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testGetChapName() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        String result = iSCSIInitiatorMO.getChapName();
        assertEquals("result", "null", result);
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 1, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testGetId() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        iSCSIInitiatorMO.setId("testISCSIInitiatorMOId");
        String result = iSCSIInitiatorMO.getId();
        assertEquals("result", "testISCSIInitiatorMOId", result);
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 2, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testGetId1() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO(new JSONObject());
        String result = iSCSIInitiatorMO.getId();
        assertNull("result", result);
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 0, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testGetIsFreeWithAggressiveMocks() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = (ISCSIInitiatorMO) Mockingbird.getProxyObject(ISCSIInitiatorMO.class, true);
        MO mO = (MO) Mockingbird.getProxyObject(MO.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        setPrivateField(iSCSIInitiatorMO, "mo", mO);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(mO.getProperty("ISFREE"), obj);
        Mockingbird.setReturnValue(false, obj, "toString", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(true, Boolean.class, "valueOf", "(java.lang.String)java.lang.Boolean", null, 1);
        Mockingbird.enterTestMode(ISCSIInitiatorMO.class);
        Boolean result = iSCSIInitiatorMO.getIsFree();
        assertNull("result", result);
        assertNotNull("iSCSIInitiatorMO.getMO()", iSCSIInitiatorMO.getMO());
    }
    
    public void testGetMO() throws Throwable {
        MO result = new ISCSIInitiatorMO(new JSONObject()).getMO();
        assertEquals("result.getProperties().size()", 0, result.getProperties().size());
    }
    
    public void testGetName() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO(new JSONObject());
        String result = iSCSIInitiatorMO.getName();
        assertNull("result", result);
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 0, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testGetName1() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        iSCSIInitiatorMO.setName("testISCSIInitiatorMOName");
        String result = iSCSIInitiatorMO.getName();
        assertEquals("result", "testISCSIInitiatorMOName", result);
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 2, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testGetParentId() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        iSCSIInitiatorMO.setParentId("testISCSIInitiatorMOId");
        String result = iSCSIInitiatorMO.getParentId();
        assertEquals("result", "testISCSIInitiatorMOId", result);
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 2, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testGetParentId1() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        String result = iSCSIInitiatorMO.getParentId();
        assertNull("result", result);
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 1, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testGetParentName() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        String result = iSCSIInitiatorMO.getParentName();
        assertNull("result", result);
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 1, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testGetParentType() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        iSCSIInitiatorMO.setParentType(MOType.USER);
        MOType result = iSCSIInitiatorMO.getParentType();
        assertSame("result", MOType.USER, result);
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 2, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testGetParentType1() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO(new JSONObject());
        MOType result = iSCSIInitiatorMO.getParentType();
        assertNull("result", result);
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 0, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testGetUseChap() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        iSCSIInitiatorMO.setUseChap(true);
        Boolean result = iSCSIInitiatorMO.getUseChap();
        assertTrue("result", result.booleanValue());
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 2, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testGetUseChap1() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        iSCSIInitiatorMO.setUseChap(false);
        Boolean result = iSCSIInitiatorMO.getUseChap();
        assertFalse("result", result.booleanValue());
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 2, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testSetChapName() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO(new JSONObject());
        iSCSIInitiatorMO.setChapName("testISCSIInitiatorMOName");
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 1, iSCSIInitiatorMO.getMO().getProperties().size());
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().get(\"CHAPNAME\")", "testISCSIInitiatorMOName", iSCSIInitiatorMO.getMO().getProperties().get("CHAPNAME"));
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 1, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testSetChapPassword() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        iSCSIInitiatorMO.setChapPassword("testISCSIInitiatorMOPassword");
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 2, iSCSIInitiatorMO.getMO().getProperties().size());
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().get(\"CHAPPASSWORD\")", "testISCSIInitiatorMOPassword", iSCSIInitiatorMO.getMO().getProperties().get("CHAPPASSWORD"));
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 2, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testSetId() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        iSCSIInitiatorMO.setId("testISCSIInitiatorMOId");
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 2, iSCSIInitiatorMO.getMO().getProperties().size());
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().get(\"ID\")", "testISCSIInitiatorMOId", iSCSIInitiatorMO.getMO().getProperties().get("ID"));
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 2, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testSetName() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        iSCSIInitiatorMO.setName("testISCSIInitiatorMOName");
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 2, iSCSIInitiatorMO.getMO().getProperties().size());
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().get(\"NAME\")", "testISCSIInitiatorMOName", iSCSIInitiatorMO.getMO().getProperties().get("NAME"));
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 2, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testSetParentId() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO(new JSONObject());
        iSCSIInitiatorMO.setParentId("testISCSIInitiatorMOId");
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 1, iSCSIInitiatorMO.getMO().getProperties().size());
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().get(\"PARENTID\")", "testISCSIInitiatorMOId", iSCSIInitiatorMO.getMO().getProperties().get("PARENTID"));
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 1, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testSetParentType() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        iSCSIInitiatorMO.setParentType(MOType.NAS_AD_FIELD);
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 2, iSCSIInitiatorMO.getMO().getProperties().size());
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().get(\"PARENTTYPE\")", new Integer(16414), iSCSIInitiatorMO.getMO().getProperties().get("PARENTTYPE"));
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 2, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testSetUseChap() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        iSCSIInitiatorMO.setUseChap(true);
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 2, iSCSIInitiatorMO.getMO().getProperties().size());
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().get(\"USECHAP\")", Boolean.TRUE, iSCSIInitiatorMO.getMO().getProperties().get("USECHAP"));
        assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 2, iSCSIInitiatorMO.getMO().getProperties().size());
    }
    
    public void testConstructorThrowsJsonSyntaxException() throws Throwable {
        JSONObject jObject = new JSONObject(new IdentityHashMap());
        jObject.put("testString", "");
        jObject.accumulate("testString", null);
        try {
            new ISCSIInitiatorMO(jObject);
            fail("Expected JsonSyntaxException to be thrown");
        } catch (JsonSyntaxException ex) {
            assertEquals("ex.getMessage()", "java.lang.IllegalStateException: Expected a string but was BEGIN_ARRAY at line 1 column 16", ex.getMessage());
            assertThrownBy(Gson.class, ex);
        }
    }
    
    public void testGetHealthStatusThrowsNumberFormatException() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        try {
            iSCSIInitiatorMO.getHealthStatus();
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException ex) {
            assertEquals("ex.getMessage()", "null", ex.getMessage());
            assertThrownBy(Integer.class, ex);
            assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 1, iSCSIInitiatorMO.getMO().getProperties().size());
        }
    }
    
    public void testGetIsFreeThrowsNullPointerException() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        try {
            iSCSIInitiatorMO.getIsFree();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ISCSIInitiatorMO.class, ex);
            assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 1, iSCSIInitiatorMO.getMO().getProperties().size());
        }
    }
    
    public void testGetRunningStatusThrowsNumberFormatException() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        try {
            iSCSIInitiatorMO.getRunningStatus();
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException ex) {
            assertEquals("ex.getMessage()", "null", ex.getMessage());
            assertThrownBy(Integer.class, ex);
            assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 1, iSCSIInitiatorMO.getMO().getProperties().size());
        }
    }
    
    public void testGetUseChapThrowsNullPointerException() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        try {
            iSCSIInitiatorMO.getUseChap();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ISCSIInitiatorMO.class, ex);
            assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 1, iSCSIInitiatorMO.getMO().getProperties().size());
        }
    }
    
    public void testSetChapNameThrowsNullPointerException() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        try {
            iSCSIInitiatorMO.setChapName(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 1, iSCSIInitiatorMO.getMO().getProperties().size());
        }
    }
    
    public void testSetChapPasswordThrowsNullPointerException() throws Throwable {
        Map map = new HashMap(100, 100.0F);
        map.put((Object) null, new Object());
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO(new JSONObject(map));
        try {
            iSCSIInitiatorMO.setChapPassword("testISCSIInitiatorMOPassword");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MO.class, ex);
            assertNull("iSCSIInitiatorMO.getMO().getProperties()", iSCSIInitiatorMO.getMO().getProperties());
        }
    }
    
    public void testSetIdThrowsNullPointerException() throws Throwable {
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO();
        try {
            iSCSIInitiatorMO.setId(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertEquals("iSCSIInitiatorMO.getMO().getProperties().size()", 1, iSCSIInitiatorMO.getMO().getProperties().size());
        }
    }
    
    public void testSetNameThrowsNullPointerException() throws Throwable {
        Map map = new HashMap(100, 100.0F);
        map.put((Object) null, new Object());
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO(new JSONObject(map));
        try {
            iSCSIInitiatorMO.setName("testISCSIInitiatorMOName");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MO.class, ex);
            assertNull("iSCSIInitiatorMO.getMO().getProperties()", iSCSIInitiatorMO.getMO().getProperties());
        }
    }
    
    public void testSetParentIdThrowsNullPointerException() throws Throwable {
        Map map = new HashMap(100, 100.0F);
        map.put((Object) null, new Object());
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO(new JSONObject(map));
        try {
            iSCSIInitiatorMO.setParentId("testISCSIInitiatorMOId");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MO.class, ex);
            assertNull("iSCSIInitiatorMO.getMO().getProperties()", iSCSIInitiatorMO.getMO().getProperties());
        }
    }
    
    public void testSetParentTypeThrowsNullPointerException() throws Throwable {
        Map map = new HashMap(100, 100.0F);
        map.put((Object) null, new Object());
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO(new JSONObject(map));
        try {
            iSCSIInitiatorMO.setParentType(MOType.DISKPOOL);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MO.class, ex);
            assertNull("iSCSIInitiatorMO.getMO().getProperties()", iSCSIInitiatorMO.getMO().getProperties());
        }
    }
    
    public void testSetUseChapThrowsNullPointerException() throws Throwable {
        Map map = new HashMap(100, 100.0F);
        map.put((Object) null, new Object());
        ISCSIInitiatorMO iSCSIInitiatorMO = new ISCSIInitiatorMO(new JSONObject(map));
        try {
            iSCSIInitiatorMO.setUseChap(true);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MO.class, ex);
            assertNull("iSCSIInitiatorMO.getMO().getProperties()", iSCSIInitiatorMO.getMO().getProperties());
        }
    }
}
