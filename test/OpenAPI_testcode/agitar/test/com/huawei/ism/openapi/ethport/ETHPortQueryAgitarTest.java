/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:29:03
 * Time to generate: 00:10.750 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.ethport.ETHPortQuery:dd0c37b8b41cf3bbbc8ffe2a43229b85
 * agitar.src.md5=com.huawei.ism.openapi.common.batchquery.QueryBase:f63d4febf06763dd4c3d64f304793100
 *
 */

package com.huawei.ism.openapi.ethport;

import com.agitar.lib.junit.AgitarTestCase;

public class ETHPortQueryAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return ETHPortQuery.class;
    }
    
    public void testConstructor() throws Throwable {
        ETHPortMO mo = new ETHPortMO();
        ETHPortQuery eTHPortQuery = new ETHPortQuery(mo, 100L, 1000L);
        assertEquals("eTHPortQuery.getCount()", 1000L, eTHPortQuery.getCount());
        assertEquals("eTHPortQuery.getBeginIndex()", 100L, eTHPortQuery.getBeginIndex());
        assertSame("eTHPortQuery.mo", mo, getPrivateField(eTHPortQuery, "mo"));
    }
    
    public void testGetETHPortMO() throws Throwable {
        ETHPortMO mo = new ETHPortMO();
        ETHPortMO result = new ETHPortQuery(mo, 100L, 1000L).getETHPortMO();
        assertSame("result", mo, result);
    }
    
    public void testGetETHPortMO1() throws Throwable {
        ETHPortQuery eTHPortQuery = new ETHPortQuery(new ETHPortMO(), 100L, 1000L);
        eTHPortQuery.setQueryETHPortMO(null);
        ETHPortMO result = eTHPortQuery.getETHPortMO();
        assertNull("result", result);
    }
    
    public void testSetQueryETHPortMO() throws Throwable {
        ETHPortMO mo = new ETHPortMO();
        ETHPortQuery eTHPortQuery = new ETHPortQuery(mo, 100L, 1000L);
        eTHPortQuery.setQueryETHPortMO(mo);
        assertSame("eTHPortQuery.mo", mo, getPrivateField(eTHPortQuery, "mo"));
    }
}
