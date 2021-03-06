/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:26:06
 * Time to generate: 00:20.031 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.nas.cifsauthclient.CIFSShareAuthClientMO:7aae4beb4b07f0cf21acdce6bda28ad3
 *
 */

package com.huawei.ism.openapi.nas.cifsauthclient;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.ism.openapi.common.model.MO;
import org.json.JSONObject;

public class CIFSShareAuthClientMOAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return CIFSShareAuthClientMO.class;
    }
    
    public void testConstructor() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testConstructor1() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO(new JSONObject());
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 0, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testGetAccessId() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        String result = cIFSShareAuthClientMO.getAccessId();
        assertNull("result", result);
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testGetAccessId1() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        cIFSShareAuthClientMO.setAccessId("testCIFSShareAuthClientMOAccessId");
        String result = cIFSShareAuthClientMO.getAccessId();
        assertEquals("result", "testCIFSShareAuthClientMOAccessId", result);
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 2, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testGetAccessName() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        cIFSShareAuthClientMO.setAccessName("testCIFSShareAuthClientMOAccessName");
        String result = cIFSShareAuthClientMO.getAccessName();
        assertEquals("result", "testCIFSShareAuthClientMOAccessName", result);
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 2, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testGetAccessName1() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        String result = cIFSShareAuthClientMO.getAccessName();
        assertNull("result", result);
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testGetAccessObj() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO(new JSONObject());
        cIFSShareAuthClientMO.setAccessObj("testCIFSShareAuthClientMOAccessObj");
        String result = cIFSShareAuthClientMO.getAccessObj();
        assertEquals("result", "testCIFSShareAuthClientMOAccessObj", result);
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testGetAccessObj1() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        String result = cIFSShareAuthClientMO.getAccessObj();
        assertNull("result", result);
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testGetId() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        cIFSShareAuthClientMO.setId("testCIFSShareAuthClientMOId");
        String result = cIFSShareAuthClientMO.getId();
        assertEquals("result", "testCIFSShareAuthClientMOId", result);
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 2, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testGetId1() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        String result = cIFSShareAuthClientMO.getId();
        assertNull("result", result);
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testGetMO() throws Throwable {
        JSONObject jObject = (JSONObject) Mockingbird.getProxyObject(JSONObject.class);
        Mockingbird.enterRecordingMode();
        MO mO = (MO) Mockingbird.getProxyObject(MO.class);
        Mockingbird.replaceObjectForRecording(MO.class, "<init>(org.json.JSONObject)", mO);
        Mockingbird.enterTestMode(CIFSShareAuthClientMO.class);
        MO result = new CIFSShareAuthClientMO(jObject).getMO();
        assertSame("result", mO, result);
    }
    
    public void testGetPermission() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        String result = cIFSShareAuthClientMO.getPermission();
        assertNull("result", result);
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testGetPermission1() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        cIFSShareAuthClientMO.setPermission("testCIFSShareAuthClientMOPermission");
        String result = cIFSShareAuthClientMO.getPermission();
        assertEquals("result", "testCIFSShareAuthClientMOPermission", result);
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 2, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testGetShareId() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        String result = cIFSShareAuthClientMO.getShareId();
        assertNull("result", result);
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testGetShareId1() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        cIFSShareAuthClientMO.setShareId("testCIFSShareAuthClientMOShareId");
        String result = cIFSShareAuthClientMO.getShareId();
        assertEquals("result", "testCIFSShareAuthClientMOShareId", result);
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 2, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testGetTenancyId() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        String result = cIFSShareAuthClientMO.getTenancyId();
        assertNull("result", result);
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testGetTenancyId1() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        cIFSShareAuthClientMO.setTenancyId("testCIFSShareAuthClientMOTenancyId");
        String result = cIFSShareAuthClientMO.getTenancyId();
        assertEquals("result", "testCIFSShareAuthClientMOTenancyId", result);
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 2, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testSetAccessId() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO(new JSONObject());
        cIFSShareAuthClientMO.setAccessId("testCIFSShareAuthClientMOAccessId");
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().get(\"ACCESSID\")", "testCIFSShareAuthClientMOAccessId", cIFSShareAuthClientMO.getMO().getProperties().get("ACCESSID"));
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testSetAccessName() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        cIFSShareAuthClientMO.setAccessName("testCIFSShareAuthClientMOAccessName");
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 2, cIFSShareAuthClientMO.getMO().getProperties().size());
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().get(\"ACCESSNAME\")", "testCIFSShareAuthClientMOAccessName", cIFSShareAuthClientMO.getMO().getProperties().get("ACCESSNAME"));
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 2, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testSetAccessObj() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        cIFSShareAuthClientMO.setAccessObj("testCIFSShareAuthClientMOAccessObj");
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 2, cIFSShareAuthClientMO.getMO().getProperties().size());
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().get(\"ACCESSOBJ\")", "testCIFSShareAuthClientMOAccessObj", cIFSShareAuthClientMO.getMO().getProperties().get("ACCESSOBJ"));
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 2, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testSetId() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO(new JSONObject());
        cIFSShareAuthClientMO.setId("testCIFSShareAuthClientMOId");
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().get(\"ID\")", "testCIFSShareAuthClientMOId", cIFSShareAuthClientMO.getMO().getProperties().get("ID"));
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testSetPermission() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO(new JSONObject());
        cIFSShareAuthClientMO.setPermission("testCIFSShareAuthClientMOPermission");
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().get(\"PERMISSION\")", "testCIFSShareAuthClientMOPermission", cIFSShareAuthClientMO.getMO().getProperties().get("PERMISSION"));
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testSetShareId() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO(new JSONObject());
        cIFSShareAuthClientMO.setShareId("testCIFSShareAuthClientMOShareId");
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().get(\"SHAREID\")", "testCIFSShareAuthClientMOShareId", cIFSShareAuthClientMO.getMO().getProperties().get("SHAREID"));
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testSetTenancyId() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        cIFSShareAuthClientMO.setTenancyId("testCIFSShareAuthClientMOTenancyId");
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 2, cIFSShareAuthClientMO.getMO().getProperties().size());
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().get(\"TENANCYID\")", "testCIFSShareAuthClientMOTenancyId", cIFSShareAuthClientMO.getMO().getProperties().get("TENANCYID"));
        assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 2, cIFSShareAuthClientMO.getMO().getProperties().size());
    }
    
    public void testConstructorThrowsJsonSyntaxException() throws Throwable {
        JSONObject jObject = new JSONObject();
        jObject.put("testString", true);
        jObject.accumulate("testString", null);
        try {
            new CIFSShareAuthClientMO(jObject);
            fail("Expected JsonSyntaxException to be thrown");
        } catch (JsonSyntaxException ex) {
            assertEquals("ex.getMessage()", "java.lang.IllegalStateException: Expected a string but was BEGIN_ARRAY at line 1 column 16", ex.getMessage());
            assertThrownBy(Gson.class, ex);
        }
    }
    
    public void testSetAccessIdThrowsNullPointerException() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        try {
            cIFSShareAuthClientMO.setAccessId(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
        }
    }
    
    public void testSetAccessNameThrowsNullPointerException() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        try {
            cIFSShareAuthClientMO.setAccessName(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
        }
    }
    
    public void testSetAccessObjThrowsNullPointerException() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        try {
            cIFSShareAuthClientMO.setAccessObj(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
        }
    }
    
    public void testSetIdThrowsNullPointerException() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        try {
            cIFSShareAuthClientMO.setId(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
        }
    }
    
    public void testSetPermissionThrowsNullPointerException() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        try {
            cIFSShareAuthClientMO.setPermission(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
        }
    }
    
    public void testSetShareIdThrowsNullPointerException() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        try {
            cIFSShareAuthClientMO.setShareId(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
        }
    }
    
    public void testSetTenancyIdThrowsNullPointerException() throws Throwable {
        CIFSShareAuthClientMO cIFSShareAuthClientMO = new CIFSShareAuthClientMO();
        try {
            cIFSShareAuthClientMO.setTenancyId(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertEquals("cIFSShareAuthClientMO.getMO().getProperties().size()", 1, cIFSShareAuthClientMO.getMO().getProperties().size());
        }
    }
}

