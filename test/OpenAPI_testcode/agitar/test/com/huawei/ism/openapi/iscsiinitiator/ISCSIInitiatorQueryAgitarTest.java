/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:33:25
 * Time to generate: 00:10.688 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.iscsiinitiator.ISCSIInitiatorQuery:f00794974f9022ebcdf09b95e2ace998
 * agitar.src.md5=com.huawei.ism.openapi.common.batchquery.QueryBase:f63d4febf06763dd4c3d64f304793100
 *
 */

package com.huawei.ism.openapi.iscsiinitiator;

import com.agitar.lib.junit.AgitarTestCase;

public class ISCSIInitiatorQueryAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return ISCSIInitiatorQuery.class;
    }
    
    public void testConstructor() throws Throwable {
        ISCSIInitiatorMO mo = new ISCSIInitiatorMO();
        ISCSIInitiatorQuery iSCSIInitiatorQuery = new ISCSIInitiatorQuery(mo, 100L, 1000L);
        assertEquals("iSCSIInitiatorQuery.getCount()", 1000L, iSCSIInitiatorQuery.getCount());
        assertEquals("iSCSIInitiatorQuery.getBeginIndex()", 100L, iSCSIInitiatorQuery.getBeginIndex());
        assertSame("iSCSIInitiatorQuery.mo", mo, getPrivateField(iSCSIInitiatorQuery, "mo"));
    }
    
    public void testGetISCSIInitiatorMO() throws Throwable {
        ISCSIInitiatorMO mo = new ISCSIInitiatorMO();
        ISCSIInitiatorMO result = new ISCSIInitiatorQuery(mo, 100L, 1000L).getISCSIInitiatorMO();
        assertSame("result", mo, result);
    }
    
    public void testGetISCSIInitiatorMO1() throws Throwable {
        ISCSIInitiatorQuery iSCSIInitiatorQuery = new ISCSIInitiatorQuery(new ISCSIInitiatorMO(null), 100L, 1000L);
        iSCSIInitiatorQuery.setQueryISCSIInitiatorMO(null);
        ISCSIInitiatorMO result = iSCSIInitiatorQuery.getISCSIInitiatorMO();
        assertNull("result", result);
    }
    
    public void testSetQueryISCSIInitiatorMO() throws Throwable {
        ISCSIInitiatorMO mo = new ISCSIInitiatorMO();
        ISCSIInitiatorQuery iSCSIInitiatorQuery = new ISCSIInitiatorQuery(mo, 100L, 1000L);
        iSCSIInitiatorQuery.setQueryISCSIInitiatorMO(mo);
        assertSame("iSCSIInitiatorQuery.mo", mo, getPrivateField(iSCSIInitiatorQuery, "mo"));
    }
}

