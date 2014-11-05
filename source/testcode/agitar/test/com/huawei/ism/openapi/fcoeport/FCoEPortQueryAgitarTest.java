/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:30:21
 * Time to generate: 00:11.546 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.fcoeport.FCoEPortQuery:44e8b1cf20b3b87c0d6fa9e757b3d356
 * agitar.src.md5=com.huawei.ism.openapi.common.batchquery.QueryBase:f63d4febf06763dd4c3d64f304793100
 *
 */

package com.huawei.ism.openapi.fcoeport;

import com.agitar.lib.junit.AgitarTestCase;

public class FCoEPortQueryAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return FCoEPortQuery.class;
    }
    
    public void testConstructor() throws Throwable {
        FCoEPortMO mo = new FCoEPortMO();
        FCoEPortQuery fCoEPortQuery = new FCoEPortQuery(mo, 100L, 1000L);
        assertEquals("fCoEPortQuery.getCount()", 1000L, fCoEPortQuery.getCount());
        assertEquals("fCoEPortQuery.getBeginIndex()", 100L, fCoEPortQuery.getBeginIndex());
        assertSame("fCoEPortQuery.mo", mo, getPrivateField(fCoEPortQuery, "mo"));
    }
    
    public void testGetFCoEPortMO() throws Throwable {
        FCoEPortMO mo = new FCoEPortMO();
        FCoEPortMO result = new FCoEPortQuery(mo, 100L, 1000L).getFCoEPortMO();
        assertSame("result", mo, result);
    }
    
    public void testGetFCoEPortMO1() throws Throwable {
        FCoEPortQuery fCoEPortQuery = new FCoEPortQuery(new FCoEPortMO(), 100L, 1000L);
        fCoEPortQuery.setQueryFCoEPortMO(null);
        FCoEPortMO result = fCoEPortQuery.getFCoEPortMO();
        assertNull("result", result);
    }
    
    public void testSetQueryFCoEPortMO() throws Throwable {
        FCoEPortMO mo = new FCoEPortMO();
        FCoEPortQuery fCoEPortQuery = new FCoEPortQuery(mo, 100L, 1000L);
        fCoEPortQuery.setQueryFCoEPortMO(mo);
        assertSame("fCoEPortQuery.mo", mo, getPrivateField(fCoEPortQuery, "mo"));
    }
}
