/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:29:35
 * Time to generate: 00:10.797 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.fcport.FCPortQuery:95932afbe87ccca14a1ce349edd6ce79
 * agitar.src.md5=com.huawei.ism.openapi.common.batchquery.QueryBase:f63d4febf06763dd4c3d64f304793100
 *
 */

package com.huawei.ism.openapi.fcport;

import com.agitar.lib.junit.AgitarTestCase;

public class FCPortQueryAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return FCPortQuery.class;
    }
    
    public void testConstructor() throws Throwable {
        FCPortMO mo = new FCPortMO();
        FCPortQuery fCPortQuery = new FCPortQuery(mo, 100L, 1000L);
        assertEquals("fCPortQuery.getCount()", 1000L, fCPortQuery.getCount());
        assertEquals("fCPortQuery.getBeginIndex()", 100L, fCPortQuery.getBeginIndex());
        assertSame("fCPortQuery.mo", mo, getPrivateField(fCPortQuery, "mo"));
    }
    
    public void testGetFCPortMO() throws Throwable {
        FCPortMO result = new FCPortQuery(null, 100L, 1000L).getFCPortMO();
        assertNull("result", result);
    }
    
    public void testGetFCPortMO1() throws Throwable {
        FCPortMO mo = new FCPortMO();
        FCPortMO result = new FCPortQuery(mo, 100L, 1000L).getFCPortMO();
        assertSame("result", mo, result);
    }
    
    public void testSetFCPortMO() throws Throwable {
        FCPortQuery fCPortQuery = new FCPortQuery(null, 100L, 1000L);
        FCPortMO mo = new FCPortMO();
        fCPortQuery.setFCPortMO(mo);
        assertSame("fCPortQuery.mo", mo, getPrivateField(fCPortQuery, "mo"));
    }
}

