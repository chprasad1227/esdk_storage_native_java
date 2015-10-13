package com.huawei.ism.openapi.fclink;

import com.huawei.ism.openapi.common.exception.ApiException;

public interface FCLinkHandler
{
    /**
     * 修改FC链路
     * @param mo 修改信息
     * @throws ApiException API异常
     */
    void modify(FCLinkMO mo) throws ApiException;

    /**
     * 将FC链路添加给远端设备
     * @param mo 修改信息
     * @throws ApiException API异常
     */
    void addFCLinkToRemoteDevice(String fcLinkID) throws ApiException;

    /**
     * 从远端设备移除FC链路
     * @param mo 修改信息
     * @throws ApiException API异常
     */
    void removeFCLinkFromRemoteDevice(String fcLinkID) throws ApiException;

    /**
     * 查询单个FC链路
     * @param id FC链路ID
     * @return FCLinkMO
     * @throws ApiException API异常
     */
    FCLinkMO get(String id) throws ApiException;

    /**
     * 批量查询FC链路
     * @param condition 查询条件
     * @return FCLinkIterator
     * @throws ApiException API异常
     */
    FCLinkIterator getBatch(FCLinkQuery condition) throws ApiException;

    /**
     * 查询FC链路的总数
     * @return Long
     * @throws ApiException
     */
    Long getCount() throws ApiException;
}
