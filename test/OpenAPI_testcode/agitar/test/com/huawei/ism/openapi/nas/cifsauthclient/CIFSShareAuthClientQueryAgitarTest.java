/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:26:03
 * Time to generate: 00:10.891 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.nas.cifsauthclient.CIFSShareAuthClientQuery:e33a5ca51f2b04f5a4d464e056c56340
 * agitar.src.md5=com.huawei.ism.openapi.common.batchquery.QueryBase:f63d4febf06763dd4c3d64f304793100
 *
 */

package com.huawei.ism.openapi.nas.cifsauthclient;

import com.agitar.lib.junit.AgitarTestCase;

public class CIFSShareAuthClientQueryAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return CIFSShareAuthClientQuery.class;
    }
    
    public void testConstructor() throws Throwable {
        CIFSShareAuthClientMO mo = new CIFSShareAuthClientMO();
        CIFSShareAuthClientQuery cIFSShareAuthClientQuery = new CIFSShareAuthClientQuery(mo, 100L, 1000L);
        assertEquals("cIFSShareAuthClientQuery.getCount()", 1000L, cIFSShareAuthClientQuery.getCount());
        assertEquals("cIFSShareAuthClientQuery.getBeginIndex()", 100L, cIFSShareAuthClientQuery.getBeginIndex());
        assertSame("cIFSShareAuthClientQuery.mo", mo, getPrivateField(cIFSShareAuthClientQuery, "mo"));
    }
    
    public void testGetCIFSShareAuthClientMO() throws Throwable {
        CIFSShareAuthClientMO mo = new CIFSShareAuthClientMO();
        CIFSShareAuthClientMO result = new CIFSShareAuthClientQuery(mo, 100L, 1000L).getCIFSShareAuthClientMO();
        assertSame("result", mo, result);
    }
    
    public void testGetCIFSShareAuthClientMO1() throws Throwable {
        CIFSShareAuthClientQuery cIFSShareAuthClientQuery = new CIFSShareAuthClientQuery(new CIFSShareAuthClientMO(), 100L, 1000L);
        cIFSShareAuthClientQuery.setCIFSShareAuthClientMO(null);
        CIFSShareAuthClientMO result = cIFSShareAuthClientQuery.getCIFSShareAuthClientMO();
        assertNull("result", result);
    }
    
    public void testSetCIFSShareAuthClientMO() throws Throwable {
        CIFSShareAuthClientMO mo = new CIFSShareAuthClientMO();
        CIFSShareAuthClientQuery cIFSShareAuthClientQuery = new CIFSShareAuthClientQuery(new CIFSShareAuthClientMO(), 100L, 1000L);
        cIFSShareAuthClientQuery.setCIFSShareAuthClientMO(mo);
        assertSame("cIFSShareAuthClientQuery.mo", mo, getPrivateField(cIFSShareAuthClientQuery, "mo"));
    }
}

