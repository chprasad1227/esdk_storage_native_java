package com.huawei.ism.openapi.remotelun;

import com.huawei.ism.openapi.common.exception.ApiException;

public interface RemoteLunHandler
{
    /**
     * 批量查询remote lun
     * @param condition 查询条件
     * @return RemoteLunIterator
     * @throws ApiException API异常
     */
    RemoteLunIterator getBatch(RemoteLunQuery condition) throws ApiException;

    /**
     * 查询remote lun的总数
     * @return Long
     * @throws ApiException
     */
    Long getCount(RemoteLunMO mo) throws ApiException;

}
