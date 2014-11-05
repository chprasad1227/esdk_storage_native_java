/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:28:27
 * Time to generate: 00:10.703 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.diskpool.DiskPoolQuery:cde4304983190f8b387657373a732d95
 * agitar.src.md5=com.huawei.ism.openapi.common.batchquery.QueryBase:f63d4febf06763dd4c3d64f304793100
 *
 */

package com.huawei.ism.openapi.diskpool;

import com.agitar.lib.junit.AgitarTestCase;

public class DiskPoolQueryAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return DiskPoolQuery.class;
    }
    
    public void testConstructor() throws Throwable {
        DiskPoolMO mo = new DiskPoolMO();
        DiskPoolQuery diskPoolQuery = new DiskPoolQuery(mo, 100L, 1000L);
        assertEquals("diskPoolQuery.getCount()", 1000L, diskPoolQuery.getCount());
        assertEquals("diskPoolQuery.getBeginIndex()", 100L, diskPoolQuery.getBeginIndex());
        assertSame("diskPoolQuery.mo", mo, getPrivateField(diskPoolQuery, "mo"));
    }
    
    public void testGetDiskPoolMO() throws Throwable {
        DiskPoolMO mo = new DiskPoolMO();
        DiskPoolMO result = new DiskPoolQuery(mo, 100L, 1000L).getDiskPoolMO();
        assertSame("result", mo, result);
    }
    
    public void testGetDiskPoolMO1() throws Throwable {
        DiskPoolQuery diskPoolQuery = new DiskPoolQuery(new DiskPoolMO(), 100L, 1000L);
        diskPoolQuery.setDiskPoolMO(null);
        DiskPoolMO result = diskPoolQuery.getDiskPoolMO();
        assertNull("result", result);
    }
    
    public void testSetDiskPoolMO() throws Throwable {
        DiskPoolMO mo = new DiskPoolMO();
        DiskPoolQuery diskPoolQuery = new DiskPoolQuery(new DiskPoolMO(), 100L, 1000L);
        diskPoolQuery.setDiskPoolMO(mo);
        assertSame("diskPoolQuery.mo", mo, getPrivateField(diskPoolQuery, "mo"));
    }
}
