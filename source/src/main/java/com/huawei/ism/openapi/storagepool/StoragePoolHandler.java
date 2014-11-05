package com.huawei.ism.openapi.storagepool;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 存储池对外开发的接口
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public interface StoragePoolHandler
{
    /**
     * 创建存储池
     * 
     * @param mo 存储池bean
     * @return StoragePoolMO
     * @throws ApiException API自定义异常
     */
    StoragePoolMO create(StoragePoolMO mo) throws ApiException;

    /**
     * 查询存储池
     * 
     * @param poolId 存储池id
     * @return StoragePoolMO
     * @throws ApiException API自定义异常
     */
    StoragePoolMO get(String poolId) throws ApiException;

    /**
     * 获取批量查询迭代器
     * 
     * @param condition 存储池批量查询条件
     * @return StoragePoolIterator
     */
    StoragePoolIterator getBatch(StoragePoolQuery condition);

    /**
     * 删除存储池
     * 
     * @param poolId 存储池id
     * @throws ApiException API自定义异常
     */
    void delete(String poolId) throws ApiException;

    /**
     * 修改存储池
     * 
     * @param mo 存储池bean
     * @throws ApiException API自定义异常
     */
    void modify(StoragePoolMO mo) throws ApiException;

    /**
     * 查询硬盘关联的存储池
     * 
     * @param diskPoolId 硬盘id
     * @return List<StoragePoolMO>
     * @throws ApiException API自定义异常
     */
    StoragePoolIterator getStoragePoolByDiskPool(String diskPoolId, StoragePoolQuery condition) throws ApiException;

    /**
     * 查询存储池的总数
     * @return Long
     * @throws ApiException
     */
    Long getCount() throws ApiException;
}
