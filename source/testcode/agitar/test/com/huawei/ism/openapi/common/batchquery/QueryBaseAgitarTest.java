/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:38:23
 * Time to generate: 00:11.578 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.common.batchquery.QueryBase:f63d4febf06763dd4c3d64f304793100
 *
 */

package com.huawei.ism.openapi.common.batchquery;

import com.agitar.lib.junit.AgitarTestCase;
import com.huawei.ism.openapi.cachepartition.CachePartitionMO;
import com.huawei.ism.openapi.cachepartition.CachePartitionQuery;
import com.huawei.ism.openapi.portgroup.PortGroupMO;
import com.huawei.ism.openapi.portgroup.PortGroupQuery;

public class QueryBaseAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return QueryBase.class;
    }
    
    public void testConstructor() throws Throwable {
        QueryBase queryBase = new QueryBase(new Long(0L), 100L, 1000L);
        assertEquals("queryBase.getCount()", 1000L, queryBase.getCount());
        assertEquals("queryBase.getBeginIndex()", 100L, queryBase.getBeginIndex());
        assertEquals("queryBase.mo", new Long(0L), getPrivateField(queryBase, "mo"));
    }
    
    public void testGetConcretMO() throws Throwable {
        QueryBase queryBase = new QueryBase(" > ", 100L, 1000L);
        String result = (String) queryBase.getConcretMO();
        assertEquals("result", " > ", result);
    }
    
    public void testSetBeginIndex() throws Throwable {
        QueryBase portGroupQuery = new PortGroupQuery(new PortGroupMO(), 100L, 1000L);
        portGroupQuery.setBeginIndex(100L);
        assertEquals("(PortGroupQuery) portGroupQuery.getBeginIndex()", 100L, portGroupQuery.getBeginIndex());
    }
    
    public void testSetConcretQueryMO() throws Throwable {
        QueryBase cachePartitionQuery = new CachePartitionQuery(new CachePartitionMO(), 100L, 1000L);
        cachePartitionQuery.setConcretQueryMO("");
        assertEquals("(CachePartitionQuery) cachePartitionQuery.mo", "", getPrivateField(cachePartitionQuery, "mo"));
    }
    
    public void testSetCount() throws Throwable {
        QueryBase portGroupQuery = new PortGroupQuery(new PortGroupMO(), 100L, 1000L);
        portGroupQuery.setCount(100L);
        assertEquals("(PortGroupQuery) portGroupQuery.getCount()", 100L, portGroupQuery.getCount());
    }
}

