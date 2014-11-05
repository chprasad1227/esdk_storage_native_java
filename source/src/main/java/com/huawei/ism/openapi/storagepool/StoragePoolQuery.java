package com.huawei.ism.openapi.storagepool;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

/**
 * 存储池查询类
 * 
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class StoragePoolQuery extends QueryBase<StoragePoolMO>
{
    /**
     * 查询存储池
     * 
     * @param mo 存储池对象
     * @param index 查询开始标签
     * @param count 查询结束标签
     */
    public StoragePoolQuery(StoragePoolMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 获取存储池对象
     * 
     * @return StoragePoolMO
     */
    public StoragePoolMO getStoragePoolMO()
    {
        return getConcretMO();
    }

    /**
     * 设置存储池的查询条件
     * @param mo 存储池的过滤查询条件
     */
    public void setQueryStoragePoolMo(StoragePoolMO mo)
    {
        setConcretQueryMO(mo);
    }
}
