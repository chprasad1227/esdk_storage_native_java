/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:38:17
 * Time to generate: 00:10.625 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.portgroup.PortGroupQuery:be711c0309e4b5174474f2dd209909e2
 * agitar.src.md5=com.huawei.ism.openapi.common.batchquery.QueryBase:f63d4febf06763dd4c3d64f304793100
 *
 */

package com.huawei.ism.openapi.portgroup;

import com.agitar.lib.junit.AgitarTestCase;

public class PortGroupQueryAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return PortGroupQuery.class;
    }
    
    public void testConstructor() throws Throwable {
        PortGroupMO mo = new PortGroupMO();
        PortGroupQuery portGroupQuery = new PortGroupQuery(mo, 100L, 1000L);
        assertEquals("portGroupQuery.getCount()", 1000L, portGroupQuery.getCount());
        assertEquals("portGroupQuery.getBeginIndex()", 100L, portGroupQuery.getBeginIndex());
        assertSame("portGroupQuery.mo", mo, getPrivateField(portGroupQuery, "mo"));
    }
    
    public void testGetPortGroupMO() throws Throwable {
        PortGroupQuery portGroupQuery = new PortGroupQuery(new PortGroupMO(), 100L, 1000L);
        portGroupQuery.setPortGroupMO(null);
        PortGroupMO result = portGroupQuery.getPortGroupMO();
        assertNull("result", result);
    }
    
    public void testGetPortGroupMO1() throws Throwable {
        PortGroupMO mo = new PortGroupMO();
        PortGroupMO result = new PortGroupQuery(mo, 100L, 1000L).getPortGroupMO();
        assertSame("result", mo, result);
    }
    
    public void testSetPortGroupMO() throws Throwable {
        PortGroupMO mo = new PortGroupMO();
        PortGroupQuery portGroupQuery = new PortGroupQuery(mo, 100L, 1000L);
        portGroupQuery.setPortGroupMO(mo);
        assertSame("portGroupQuery.mo", mo, getPrivateField(portGroupQuery, "mo"));
    }
}

