package com.huawei.ism.openapi.cachepartition;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 存储分区
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public interface CachePartitionHandler
{
    /**
     * 创建Cache分区
     * @param mo Cache分区信息
     * @return CachePartitionMO
     * @throws ApiException 抛出API异常
     */
    CachePartitionMO create(CachePartitionMO mo) throws ApiException;

    /**
     * 查询Cache分区
     * @param id Cache分区的ID
     * @return CachePartitionMO
     * @throws ApiException 抛出API异常
     */
    CachePartitionMO get(String id) throws ApiException;

    /**
     * 批量查询Cache分区
     * @param condition 查询条件
     * @return CachePartitionIterator
     * @throws ApiException 抛出API异常
     */
    CachePartitionIterator getBatch(CachePartitionQuery condition) throws ApiException;

    /**
     * 删除Cache分区
     * @param id Cache分区的ID
     * @throws ApiException 抛出API异常
     */
    void delete(String id) throws ApiException;

    /**
     * 修改Cache分区属性
     * @param mo Cache分区的信息
     * @throws ApiException 抛出API异常
     */
    void modify(CachePartitionMO mo) throws ApiException;

    /**
     * 对象加入 LUN
     * @param cachePartitionId 分区ID
     * @param lunId 加入分区的LUN的ID
     * @throws ApiException 抛出API异常
     */
    void createAssociateWithLun(String cachePartitionId, String lunId) throws ApiException;

    /**
     * 对象退出 LUN
     * @param cachePartitionId 分区ID
     * @param lunId 分区中的LUN的ID
     * @throws ApiException 抛出API异常
     */
    void removeAssociateFromLun(String cachePartitionId, String lunId) throws ApiException;

    /**
     * 查询关联的对象
     * @param id LUN的ID
     * @return List<CachePartitionMO>
     * @throws ApiException 抛出API异常
     */
    CachePartitionIterator getCachePartitionByLUN(String id, CachePartitionQuery query) throws ApiException;

}
