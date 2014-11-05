/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:35:27
 * Time to generate: 00:10.562 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.lun.LunQuery:eebee9e2546d4a5d6c84bb6b33d609a7
 * agitar.src.md5=com.huawei.ism.openapi.common.batchquery.QueryBase:f63d4febf06763dd4c3d64f304793100
 *
 */

package com.huawei.ism.openapi.lun;

import com.agitar.lib.junit.AgitarTestCase;

public class LunQueryAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return LunQuery.class;
    }
    
    public void testConstructor() throws Throwable {
        LunMO mo = new LunMO();
        LunQuery lunQuery = new LunQuery(mo, 100L, 1000L);
        assertEquals("lunQuery.getCount()", 1000L, lunQuery.getCount());
        assertEquals("lunQuery.getBeginIndex()", 100L, lunQuery.getBeginIndex());
        assertSame("lunQuery.mo", mo, getPrivateField(lunQuery, "mo"));
    }
    
    public void testGetLunMO() throws Throwable {
        LunQuery lunQuery = new LunQuery(new LunMO(), 100L, 1000L);
        lunQuery.setQueryLUNMO(null);
        LunMO result = lunQuery.getLunMO();
        assertNull("result", result);
    }
    
    public void testGetLunMO1() throws Throwable {
        LunMO mo = new LunMO();
        LunMO result = new LunQuery(mo, 100L, 1000L).getLunMO();
        assertSame("result", mo, result);
    }
    
    public void testSetQueryLUNMO() throws Throwable {
        LunMO mo = new LunMO();
        LunQuery lunQuery = new LunQuery(mo, 100L, 1000L);
        lunQuery.setQueryLUNMO(mo);
        assertSame("lunQuery.mo", mo, getPrivateField(lunQuery, "mo"));
    }
}
