/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:27:10
 * Time to generate: 00:11.828 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.cachepartition.CachePartitionQuery:522a24acebc923c397aab9e32920d62b
 * agitar.src.md5=com.huawei.ism.openapi.common.batchquery.QueryBase:f63d4febf06763dd4c3d64f304793100
 *
 */

package com.huawei.ism.openapi.cachepartition;

import com.agitar.lib.junit.AgitarTestCase;
import org.json.JSONObject;

public class CachePartitionQueryAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return CachePartitionQuery.class;
    }
    
    public void testConstructor() throws Throwable {
        CachePartitionMO mo = new CachePartitionMO();
        CachePartitionQuery cachePartitionQuery = new CachePartitionQuery(mo, 100L, 1000L);
        assertEquals("cachePartitionQuery.getCount()", 1000L, cachePartitionQuery.getCount());
        assertEquals("cachePartitionQuery.getBeginIndex()", 100L, cachePartitionQuery.getBeginIndex());
        assertSame("cachePartitionQuery.mo", mo, getPrivateField(cachePartitionQuery, "mo"));
    }
    
    public void testGetCachePartitionMO() throws Throwable {
        CachePartitionQuery cachePartitionQuery = new CachePartitionQuery(null, 100L, 1000L);
        cachePartitionQuery.setCachePartitionMO(null);
        CachePartitionMO result = cachePartitionQuery.getCachePartitionMO();
        assertNull("result", result);
    }
    
    public void testGetCachePartitionMO1() throws Throwable {
        CachePartitionMO mo = new CachePartitionMO();
        CachePartitionMO result = new CachePartitionQuery(mo, 100L, 1000L).getCachePartitionMO();
        assertSame("result", mo, result);
    }
    
    public void testSetCachePartitionMO() throws Throwable {
        CachePartitionMO mo = new CachePartitionMO();
        CachePartitionQuery cachePartitionQuery = new CachePartitionQuery(new CachePartitionMO(new JSONObject()), 100L, 1000L);
        cachePartitionQuery.setCachePartitionMO(mo);
        assertSame("cachePartitionQuery.mo", mo, getPrivateField(cachePartitionQuery, "mo"));
    }
}

