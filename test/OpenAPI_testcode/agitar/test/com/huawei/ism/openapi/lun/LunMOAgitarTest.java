/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:35:45
 * Time to generate: 00:50.000 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.lun.LunMO:ae266d46433f7f07d21e594a86b05c96
 *
 */

package com.huawei.ism.openapi.lun;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;
import java.util.HashMap;
import java.util.Map;
import org.json.HTTPTokener;
import org.json.JSONObject;

public class LunMOAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return LunMO.class;
    }
    
    public void testConstructor() throws Throwable {
        LunMO lunMO = new LunMO();
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testConstructor1() throws Throwable {
        LunMO lunMO = new LunMO(new JSONObject());
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetAllocCapacity() throws Throwable {
        LunMO lunMO = new LunMO();
        Long result = lunMO.getAllocCapacity();
        assertEquals("result", 0L, result.longValue());
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetAllocType() throws Throwable {
        LunMO lunMO = new LunMO();
        lunMO.setAllocType(EnumDefine.LUNAllocTypeE.THIN);
        EnumDefine.LUNAllocTypeE result = lunMO.getAllocType();
        assertSame("result", EnumDefine.LUNAllocTypeE.THIN, result);
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetCapacity() throws Throwable {
        JSONObject jObject = (JSONObject) Mockingbird.getProxyObject(JSONObject.class);
        Mockingbird.enterRecordingMode();
        MO mO = (MO) Mockingbird.getProxyObject(MO.class);
        Mockingbird.replaceObjectForRecording(MO.class, "<init>(org.json.JSONObject)", mO);
        mO.setProperty("PARENTTYPE", new Integer(216));
        Mockingbird.setNormalReturnForVoid();
        mO.setProperty("TYPE", new Integer(11));
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(LunMO.class);
        LunMO lunMO = new LunMO(jObject);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(mO.getLongProperty("CAPACITY"), 1L);
        Mockingbird.enterTestMode(LunMO.class);
        Long result = lunMO.getCapacity();
        assertEquals("result", 512L, result.longValue());
        assertSame("lunMO.mo", mO, getPrivateField(lunMO, "mo"));
    }
    
    public void testGetCapacity1() throws Throwable {
        LunMO lunMO = new LunMO();
        Long result = lunMO.getCapacity();
        assertEquals("result", 0L, result.longValue());
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetCount() throws Throwable {
        LunMO lunMO = new LunMO();
        Long result = lunMO.getCount();
        assertEquals("result", Long.MIN_VALUE, result.longValue());
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetDescription() throws Throwable {
        String[] sa = new String[2];
        LunMO lunMO = new LunMO(new JSONObject(new JSONObject(), sa));
        lunMO.setDescription("testLunMODescription");
        String result = lunMO.getDescription();
        assertEquals("result", "testLunMODescription", result);
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetDescription1() throws Throwable {
        LunMO lunMO = new LunMO();
        String result = lunMO.getDescription();
        assertNull("result", result);
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetId() throws Throwable {
        LunMO lunMO = new LunMO();
        String result = lunMO.getId();
        assertNull("result", result);
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetId1() throws Throwable {
        LunMO lunMO = new LunMO(new JSONObject());
        lunMO.setId("testLunMOId");
        String result = lunMO.getId();
        assertEquals("result", "testLunMOId", result);
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetInitialAllocCapacity() throws Throwable {
        LunMO lunMO = new LunMO();
        Long result = lunMO.getInitialAllocCapacity();
        assertEquals("result", 0L, result.longValue());
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetInitialAllocCapacity1() throws Throwable {
        LunMO lunMO = new LunMO();
        lunMO.setInitialAllocCapacity(new Long(513L));
        Long result = lunMO.getInitialAllocCapacity();
        assertEquals("result", 512L, result.longValue());
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetMO() throws Throwable {
        LunMO lunMO = new LunMO();
        MO result = lunMO.getMO();
        assertEquals("result.getProperties().size()", 2, result.getProperties().size());
    }
    
    public void testGetName() throws Throwable {
        LunMO lunMO = new LunMO();
        String result = lunMO.getName();
        assertNull("result", result);
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetName1() throws Throwable {
        LunMO lunMO = new LunMO(new JSONObject());
        lunMO.setName("testLunMOName");
        String result = lunMO.getName();
        assertEquals("result", "testLunMOName", result);
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetOwningController() throws Throwable {
        LunMO lunMO = new LunMO(new JSONObject());
        String result = lunMO.getOwningController();
        assertNull("result", result);
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetParentId() throws Throwable {
        LunMO lunMO = new LunMO();
        String result = lunMO.getParentId();
        assertNull("result", result);
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetParentId1() throws Throwable {
        LunMO lunMO = new LunMO();
        lunMO.setParentId("testLunMOParentId");
        String result = lunMO.getParentId();
        assertEquals("result", "testLunMOParentId", result);
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetParentName() throws Throwable {
        LunMO lunMO = new LunMO();
        String result = lunMO.getParentName();
        assertNull("result", result);
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetParentType() throws Throwable {
        LunMO lunMO = new LunMO();
        MOType result = lunMO.getParentType();
        assertEquals("result", MOType.STORAGEPOOL, result);
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetReplicationCapacity() throws Throwable {
        LunMO lunMO = new LunMO();
        Long result = lunMO.getReplicationCapacity();
        assertEquals("result", 0L, result.longValue());
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetThinCapacityUsage() throws Throwable {
        LunMO lunMO = new LunMO();
        lunMO.setThinCapacityUsage(new Long(0L));
        Long result = lunMO.getThinCapacityUsage();
        assertEquals("result", 0L, result.longValue());
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetThinCapacityUsage1() throws Throwable {
        LunMO lunMO = new LunMO();
        Long result = lunMO.getThinCapacityUsage();
        assertEquals("result", Long.MIN_VALUE, result.longValue());
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetWWN() throws Throwable {
        LunMO lunMO = new LunMO();
        String result = lunMO.getWWN();
        assertNull("result", result);
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testGetWorkingController() throws Throwable {
        LunMO lunMO = new LunMO();
        String result = lunMO.getWorkingController();
        assertNull("result", result);
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testIsAddToLunGroup() throws Throwable {
        LunMO lunMO = new LunMO(new JSONObject());
        Boolean result = lunMO.isAddToLunGroup();
        assertFalse("result", result.booleanValue());
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testIsExposedToInitiator() throws Throwable {
        LunMO lunMO = new LunMO();
        Boolean result = lunMO.isExposedToInitiator();
        assertFalse("result", result.booleanValue());
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testSetAllocType() throws Throwable {
        LunMO lunMO = new LunMO();
        lunMO.setAllocType(EnumDefine.LUNAllocTypeE.THICK);
        assertEquals("lunMO.mo.getProperties().size()", 3, ((MO) getPrivateField(lunMO, "mo")).getProperties().size());
        assertEquals("lunMO.mo.getProperties().get(\"ALLOCTYPE\")", new Integer(0), ((MO) getPrivateField(lunMO, "mo")).getProperties().get("ALLOCTYPE"));
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testSetCapacity() throws Throwable {
        LunMO lunMO = new LunMO(new JSONObject());
        lunMO.setCapacity(new Long(0L));
        assertEquals("lunMO.mo.getProperties().size()", 3, ((MO) getPrivateField(lunMO, "mo")).getProperties().size());
        assertEquals("lunMO.mo.getProperties().get(\"CAPACITY\")", new Long(0L), ((MO) getPrivateField(lunMO, "mo")).getProperties().get("CAPACITY"));
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testSetDescription() throws Throwable {
        LunMO lunMO = new LunMO();
        lunMO.setDescription("testLunMODescription");
        assertEquals("lunMO.mo.getProperties().size()", 3, ((MO) getPrivateField(lunMO, "mo")).getProperties().size());
        assertEquals("lunMO.mo.getProperties().get(\"DESCRIPTION\")", "testLunMODescription", ((MO) getPrivateField(lunMO, "mo")).getProperties().get("DESCRIPTION"));
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testSetId() throws Throwable {
        LunMO lunMO = new LunMO();
        lunMO.setId("testLunMOId");
        assertEquals("lunMO.mo.getProperties().size()", 3, ((MO) getPrivateField(lunMO, "mo")).getProperties().size());
        assertEquals("lunMO.mo.getProperties().get(\"ID\")", "testLunMOId", ((MO) getPrivateField(lunMO, "mo")).getProperties().get("ID"));
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testSetInitialAllocCapacity() throws Throwable {
        LunMO lunMO = new LunMO();
        lunMO.setInitialAllocCapacity(new Long(100L));
        assertEquals("lunMO.mo.getProperties().size()", 3, ((MO) getPrivateField(lunMO, "mo")).getProperties().size());
        assertEquals("lunMO.mo.getProperties().get(\"INITIALALLOCCAPACITY\")", new Long(0L), ((MO) getPrivateField(lunMO, "mo")).getProperties().get("INITIALALLOCCAPACITY"));
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testSetName() throws Throwable {
        LunMO lunMO = new LunMO();
        lunMO.setName("testLunMOName");
        assertEquals("lunMO.mo.getProperties().size()", 3, ((MO) getPrivateField(lunMO, "mo")).getProperties().size());
        assertEquals("lunMO.mo.getProperties().get(\"NAME\")", "testLunMOName", ((MO) getPrivateField(lunMO, "mo")).getProperties().get("NAME"));
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testSetParentId() throws Throwable {
        LunMO lunMO = new LunMO();
        lunMO.setParentId("testLunMOParentId");
        assertEquals("lunMO.mo.getProperties().size()", 3, ((MO) getPrivateField(lunMO, "mo")).getProperties().size());
        assertEquals("lunMO.mo.getProperties().get(\"PARENTID\")", "testLunMOParentId", ((MO) getPrivateField(lunMO, "mo")).getProperties().get("PARENTID"));
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testSetThinCapacityUsage() throws Throwable {
        LunMO lunMO = new LunMO();
        lunMO.setThinCapacityUsage(new Long(0L));
        assertEquals("lunMO.mo.getProperties().size()", 3, ((MO) getPrivateField(lunMO, "mo")).getProperties().size());
        assertEquals("lunMO.mo.getProperties().get(\"THINCAPACITYUSAGE\")", new Long(0L), ((MO) getPrivateField(lunMO, "mo")).getProperties().get("THINCAPACITYUSAGE"));
        assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
    }
    
    public void testConstructorThrowsJsonSyntaxException() throws Throwable {
        JSONObject jObject = new JSONObject();
        jObject.put("testString", new Double(0.3187624216079712));
        jObject.accumulate("testString", null);
        try {
            new LunMO(jObject);
            fail("Expected JsonSyntaxException to be thrown");
        } catch (JsonSyntaxException ex) {
            assertEquals("ex.getMessage()", "java.lang.IllegalStateException: Expected a string but was BEGIN_ARRAY at line 1 column 16", ex.getMessage());
            assertThrownBy(Gson.class, ex);
        }
    }
    
    public void testConstructorThrowsNullPointerException() throws Throwable {
        Map map = new HashMap(100, 100.0F);
        map.put((Object) null, new HTTPTokener("testLunMOs"));
        try {
            new LunMO(new JSONObject(map));
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MO.class, ex);
        }
    }
    
    public void testGetAllocTypeThrowsNullPointerException() throws Throwable {
        LunMO lunMO = new LunMO();
        try {
            lunMO.getAllocType();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(LunMO.class, ex);
            assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
        }
    }
    
    public void testGetHealthStatusThrowsNullPointerException() throws Throwable {
        LunMO lunMO = new LunMO();
        try {
            lunMO.getHealthStatus();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(LunMO.class, ex);
            assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
        }
    }
    
    public void testGetRunningStatusThrowsNullPointerException() throws Throwable {
        LunMO lunMO = new LunMO();
        try {
            lunMO.getRunningStatus();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(LunMO.class, ex);
            assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
        }
    }
    
    public void testSetAllocTypeThrowsNullPointerException() throws Throwable {
        LunMO lunMO = new LunMO(new JSONObject());
        try {
            lunMO.setAllocType(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(LunMO.class, ex);
            assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
        }
    }
    
    public void testSetCapacityThrowsNullPointerException() throws Throwable {
        LunMO lunMO = new LunMO();
        try {
            lunMO.setCapacity(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(LunMO.class, ex);
            assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
        }
    }
    
    public void testSetDescriptionThrowsNullPointerException() throws Throwable {
        LunMO lunMO = new LunMO();
        try {
            lunMO.setDescription(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
        }
    }
    
    public void testSetIdThrowsNullPointerException() throws Throwable {
        LunMO lunMO = new LunMO();
        try {
            lunMO.setId(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
        }
    }
    
    public void testSetInitialAllocCapacityThrowsNullPointerException() throws Throwable {
        LunMO lunMO = new LunMO();
        try {
            lunMO.setInitialAllocCapacity(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(LunMO.class, ex);
            assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
        }
    }
    
    public void testSetNameThrowsNullPointerException() throws Throwable {
        LunMO lunMO = new LunMO();
        try {
            lunMO.setName(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
        }
    }
    
    public void testSetParentIdThrowsNullPointerException() throws Throwable {
        LunMO lunMO = new LunMO();
        try {
            lunMO.setParentId(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
        }
    }
    
    public void testSetThinCapacityUsageThrowsNullPointerException() throws Throwable {
        LunMO lunMO = new LunMO();
        try {
            lunMO.setThinCapacityUsage(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertNotNull("lunMO.mo", getPrivateField(lunMO, "mo"));
        }
    }
}
