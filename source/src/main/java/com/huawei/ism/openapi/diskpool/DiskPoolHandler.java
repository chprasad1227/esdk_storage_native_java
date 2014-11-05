package com.huawei.ism.openapi.diskpool;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 接口定义
 * @author gWX183785
 * @version V100R001C10
 */
public interface DiskPoolHandler
{
    /**
     * 创建DiskPool
     * @param mo 硬盘域对象
     * @return 返回结果
     * @throws ApiException 异常
     */
    DiskPoolMO create(DiskPoolMO mo) throws ApiException;

    /**
     * 查询DiskPool
     * @param id 硬盘域id
     * @return 返回结果
     * @throws ApiException 异常
     */
    DiskPoolMO get(String id) throws ApiException;

    /**
     * 批量查询DiskPool迭代器
     * @param condition 查询条件
     * @return 返回结果
     */
    DiskPoolIterator getBatch(DiskPoolQuery condition);

    /**
     * 删除DiskPool
     * @param id 硬盘域id
     * @throws ApiException 异常
     */
    void delete(String id) throws ApiException;

    /**
     * 修改DiskPool属性
     * @param mo 硬盘域对象
     * @throws ApiException 异常
     */
    void modify(DiskPoolMO mo) throws ApiException;

    /**
     * 在DiskPool中添加Disk
     * @param diskPoolId 硬盘域id
     * @param ids 硬盘id
     * @throws ApiException 异常
     */
    void createAssociateWithDisk(String diskPoolId, String[] ids) throws ApiException;

    /**
     * 在DiskPool中移除Disk
     * @param diskPoolId 硬盘域id
     * @param diskId 硬盘id
     * @throws ApiException 异常
     */
    void removeAssociateFromDisk(String diskPoolId, String diskId) throws ApiException;

    /**
     * 获取硬盘域的总数
     * @return Long
     * @throws ApiException
     */
    Long getCount() throws ApiException;

}
