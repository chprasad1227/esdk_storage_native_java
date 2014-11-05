/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:36:23
 * Time to generate: 00:10.656 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.nas.nfsauthclient.NFSShareAuthClientQuery:456c1310526372d7995f6adfaa0bfc37
 * agitar.src.md5=com.huawei.ism.openapi.common.batchquery.QueryBase:f63d4febf06763dd4c3d64f304793100
 *
 */

package com.huawei.ism.openapi.nas.nfsauthclient;

import com.agitar.lib.junit.AgitarTestCase;

public class NFSShareAuthClientQueryAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return NFSShareAuthClientQuery.class;
    }
    
    public void testConstructor() throws Throwable {
        NFSShareAuthClientMO mo = new NFSShareAuthClientMO();
        NFSShareAuthClientQuery nFSShareAuthClientQuery = new NFSShareAuthClientQuery(mo, 100L, 1000L);
        assertEquals("nFSShareAuthClientQuery.getCount()", 1000L, nFSShareAuthClientQuery.getCount());
        assertEquals("nFSShareAuthClientQuery.getBeginIndex()", 100L, nFSShareAuthClientQuery.getBeginIndex());
        assertSame("nFSShareAuthClientQuery.mo", mo, getPrivateField(nFSShareAuthClientQuery, "mo"));
    }
    
    public void testGetNFSShareAuthClientMO() throws Throwable {
        NFSShareAuthClientMO mo = new NFSShareAuthClientMO();
        NFSShareAuthClientMO result = new NFSShareAuthClientQuery(mo, 100L, 1000L).getNFSShareAuthClientMO();
        assertSame("result", mo, result);
    }
    
    public void testGetNFSShareAuthClientMO1() throws Throwable {
        NFSShareAuthClientMO result = new NFSShareAuthClientQuery(null, 100L, 1000L).getNFSShareAuthClientMO();
        assertNull("result", result);
    }
    
    public void testSetNFSShareAuthClientMO() throws Throwable {
        NFSShareAuthClientQuery nFSShareAuthClientQuery = new NFSShareAuthClientQuery(new NFSShareAuthClientMO(), 100L, 1000L);
        NFSShareAuthClientMO mo = new NFSShareAuthClientMO();
        nFSShareAuthClientQuery.setNFSShareAuthClientMO(mo);
        assertSame("nFSShareAuthClientQuery.mo", mo, getPrivateField(nFSShareAuthClientQuery, "mo"));
    }
}
