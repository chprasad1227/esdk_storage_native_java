/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:25:21
 * Time to generate: 00:12.406 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.alarm.AlarmQuery:ac1fdb04e827dc0a461ca405b6366557
 * agitar.src.md5=com.huawei.ism.openapi.common.batchquery.QueryBase:f63d4febf06763dd4c3d64f304793100
 *
 */

package com.huawei.ism.openapi.alarm;

import com.agitar.lib.junit.AgitarTestCase;

public class AlarmQueryAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return AlarmQuery.class;
    }
    
    public void testConstructor() throws Throwable {
        AlarmInfoMO mo = new AlarmInfoMO();
        AlarmQuery alarmQuery = new AlarmQuery(mo, 100L, 1000L);
        assertEquals("alarmQuery.getCount()", 1000L, alarmQuery.getCount());
        assertEquals("alarmQuery.getBeginIndex()", 100L, alarmQuery.getBeginIndex());
        assertSame("alarmQuery.mo", mo, getPrivateField(alarmQuery, "mo"));
    }
    
    public void testGetAlarmMO() throws Throwable {
        AlarmInfoMO mo = new AlarmInfoMO();
        AlarmInfoMO result = new AlarmQuery(mo, 100L, 1000L).getAlarmMO();
        assertSame("result", mo, result);
    }
    
    public void testGetAlarmMO1() throws Throwable {
        AlarmInfoMO result = new AlarmQuery(null, 100L, 1000L).getAlarmMO();
        assertNull("result", result);
    }
    
    public void testSetQueryAlarmMO() throws Throwable {
        AlarmInfoMO mo = new AlarmInfoMO();
        AlarmQuery alarmQuery = new AlarmQuery(mo, 100L, 1000L);
        alarmQuery.setQueryAlarmMO(mo);
        assertSame("alarmQuery.mo", mo, getPrivateField(alarmQuery, "mo"));
    }
}
