package com.huawei.ism.openapi.cachepartition;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

/**
 * 查询条件
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class CachePartitionQuery extends QueryBase<CachePartitionMO>
{
    /**
     * 查询条件
     * @param mo 分区MO
     * @param index 起始索引
     * @param count 查询数量
     */
    public CachePartitionQuery(CachePartitionMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置查询过滤条件
     * @param mo 查询 条件
     */
    public void setCachePartitionMO(CachePartitionMO mo)
    {
        setConcretQueryMO(mo);
    }

    /**
     * 获取查询过滤条件
     * @return CachePartitionMO
     */
    public CachePartitionMO getCachePartitionMO()
    {
        return getConcretMO();
    }
}
