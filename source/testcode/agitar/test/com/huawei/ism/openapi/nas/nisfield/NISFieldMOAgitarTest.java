/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:37:28
 * Time to generate: 00:13.922 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.nas.nisfield.NISFieldMO:be824a3d6da2aacc7bb0b24bc03c99ef
 *
 */

package com.huawei.ism.openapi.nas.nisfield;

import com.agitar.lib.junit.AgitarTestCase;
import com.huawei.ism.openapi.common.model.MO;
import org.json.JSONObject;

public class NISFieldMOAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return NISFieldMO.class;
    }
    
    public void testConstructor() throws Throwable {
        NISFieldMO nISFieldMO = new NISFieldMO(new JSONObject());
        assertEquals("nISFieldMO.getMO().getProperties().size()", 0, nISFieldMO.getMO().getProperties().size());
    }
    
    public void testConstructor1() throws Throwable {
        MO mo = new MO();
        NISFieldMO nISFieldMO = new NISFieldMO(mo);
        assertSame("nISFieldMO.getMO()", mo, nISFieldMO.getMO());
    }
    
    public void testConstructor2() throws Throwable {
        NISFieldMO nISFieldMO = new NISFieldMO();
        assertEquals("nISFieldMO.getMO().getProperties().size()", 0, nISFieldMO.getMO().getProperties().size());
    }
    
    public void testGetMO() throws Throwable {
        MO mo = new MO();
        MO result = new NISFieldMO(mo).getMO();
        assertSame("result", mo, result);
    }
    
    public void testGetNisDomain() throws Throwable {
        MO mo = new MO();
        NISFieldMO nISFieldMO = new NISFieldMO(mo);
        String result = nISFieldMO.getNisDomain();
        assertNull("result", result);
        assertSame("nISFieldMO.getMO()", mo, nISFieldMO.getMO());
    }
    
    public void testGetNisDomain1() throws Throwable {
        MO mo = new MO();
        NISFieldMO nISFieldMO = new NISFieldMO(mo);
        nISFieldMO.setNisDomain("testNISFieldMONisDomain");
        String result = nISFieldMO.getNisDomain();
        assertEquals("result", "testNISFieldMONisDomain", result);
        assertSame("nISFieldMO.getMO()", mo, nISFieldMO.getMO());
    }
    
    public void testGetNisServerAddr() throws Throwable {
        MO mo = new MO();
        NISFieldMO nISFieldMO = new NISFieldMO(mo);
        nISFieldMO.setNisServerAddr("testNISFieldMONisServerAddr");
        String result = nISFieldMO.getNisServerAddr();
        assertEquals("result", "testNISFieldMONisServerAddr", result);
        assertSame("nISFieldMO.getMO()", mo, nISFieldMO.getMO());
    }
    
    public void testGetNisServerAddr1() throws Throwable {
        MO mo = new MO();
        NISFieldMO nISFieldMO = new NISFieldMO(mo);
        String result = nISFieldMO.getNisServerAddr();
        assertNull("result", result);
        assertSame("nISFieldMO.getMO()", mo, nISFieldMO.getMO());
    }
    
    public void testGetTenancyId() throws Throwable {
        MO mo = new MO();
        NISFieldMO nISFieldMO = new NISFieldMO(mo);
        Long result = nISFieldMO.getTenancyId();
        assertEquals("result", Long.MIN_VALUE, result.longValue());
        assertSame("nISFieldMO.getMO()", mo, nISFieldMO.getMO());
    }
    
    public void testGetTenancyId1() throws Throwable {
        MO mo = new MO();
        NISFieldMO nISFieldMO = new NISFieldMO(mo);
        nISFieldMO.setTenancyId(new Long(0L));
        Long result = nISFieldMO.getTenancyId();
        assertEquals("result", 0L, result.longValue());
        assertSame("nISFieldMO.getMO()", mo, nISFieldMO.getMO());
    }
    
    public void testSetNisDomain() throws Throwable {
        MO mo = new MO();
        NISFieldMO nISFieldMO = new NISFieldMO(mo);
        nISFieldMO.setNisDomain("testNISFieldMONisDomain");
        assertEquals("nISFieldMO.getMO().getProperties().size()", 1, nISFieldMO.getMO().getProperties().size());
        assertEquals("nISFieldMO.getMO().getProperties().get(\"NISDOMAIN\")", "testNISFieldMONisDomain", nISFieldMO.getMO().getProperties().get("NISDOMAIN"));
        assertSame("nISFieldMO.getMO()", mo, nISFieldMO.getMO());
    }
    
    public void testSetNisServerAddr() throws Throwable {
        NISFieldMO nISFieldMO = new NISFieldMO();
        nISFieldMO.setNisServerAddr("testNISFieldMONisServerAddr");
        assertEquals("nISFieldMO.getMO().getProperties().size()", 1, nISFieldMO.getMO().getProperties().size());
        assertEquals("nISFieldMO.getMO().getProperties().get(\"NISSERVERADDR\")", "testNISFieldMONisServerAddr", nISFieldMO.getMO().getProperties().get("NISSERVERADDR"));
        assertEquals("nISFieldMO.getMO().getProperties().size()", 1, nISFieldMO.getMO().getProperties().size());
    }
    
    public void testSetTenancyId() throws Throwable {
        MO mo = new MO();
        NISFieldMO nISFieldMO = new NISFieldMO(mo);
        nISFieldMO.setTenancyId(new Long(0L));
        assertEquals("nISFieldMO.getMO().getProperties().size()", 1, nISFieldMO.getMO().getProperties().size());
        assertEquals("nISFieldMO.getMO().getProperties().get(\"TENANCYID\")", new Long(0L), nISFieldMO.getMO().getProperties().get("TENANCYID"));
        assertSame("nISFieldMO.getMO()", mo, nISFieldMO.getMO());
    }
    
    public void testGetNisDomainThrowsNullPointerException() throws Throwable {
        NISFieldMO nISFieldMO = new NISFieldMO((MO) null);
        try {
            nISFieldMO.getNisDomain();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(NISFieldMO.class, ex);
            assertNull("nISFieldMO.getMO()", nISFieldMO.getMO());
        }
    }
    
    public void testGetNisServerAddrThrowsNullPointerException() throws Throwable {
        NISFieldMO nISFieldMO = new NISFieldMO((MO) null);
        try {
            nISFieldMO.getNisServerAddr();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(NISFieldMO.class, ex);
            assertNull("nISFieldMO.getMO()", nISFieldMO.getMO());
        }
    }
    
    public void testGetTenancyIdThrowsNullPointerException() throws Throwable {
        NISFieldMO nISFieldMO = new NISFieldMO((MO) null);
        try {
            nISFieldMO.getTenancyId();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(NISFieldMO.class, ex);
            assertNull("nISFieldMO.getMO()", nISFieldMO.getMO());
        }
    }
    
    public void testSetNisDomainThrowsNullPointerException() throws Throwable {
        NISFieldMO nISFieldMO = new NISFieldMO((MO) null);
        try {
            nISFieldMO.setNisDomain("testNISFieldMONisDomain");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(NISFieldMO.class, ex);
            assertNull("nISFieldMO.getMO()", nISFieldMO.getMO());
        }
    }
    
    public void testSetNisServerAddrThrowsNullPointerException() throws Throwable {
        NISFieldMO nISFieldMO = new NISFieldMO((MO) null);
        try {
            nISFieldMO.setNisServerAddr("testNISFieldMONisServerAddr");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(NISFieldMO.class, ex);
            assertNull("nISFieldMO.getMO()", nISFieldMO.getMO());
        }
    }
    
    public void testSetTenancyIdThrowsNullPointerException() throws Throwable {
        NISFieldMO nISFieldMO = new NISFieldMO((MO) null);
        try {
            nISFieldMO.setTenancyId(new Long(0L));
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(NISFieldMO.class, ex);
            assertNull("nISFieldMO.getMO()", nISFieldMO.getMO());
        }
    }
}

