package com.huawei.ism.openapi.disk;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 硬盘接口
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public interface DiskHandler
{
    /**
     * 查询单个硬盘
     * @param id 硬盘ID
     * @return DiskMO
     * @throws ApiException API异常
     */
    DiskMO get(String id) throws ApiException;

    /**
     * 批量查询硬盘
     * @param condition 查询条件
     * @return DiskIterator
     * @throws ApiException API异常
     */
    DiskIterator getBatch(DiskQuery condition) throws ApiException;
}
