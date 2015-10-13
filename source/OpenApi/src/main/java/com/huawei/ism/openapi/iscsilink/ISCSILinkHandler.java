package com.huawei.ism.openapi.iscsilink;

import com.huawei.ism.openapi.common.exception.ApiException;

public interface ISCSILinkHandler
{
    /**
     * 创建ISCSI链路
     * @param mo ISCSI链路信息
     * @return ISCSILinkMO
     * @throws ApiException API异常
     */
    ISCSILinkMO create(ISCSILinkMO mo) throws ApiException;

    /**
     * 删除单个ISCSI链路
     * @param id ISCSI链路ID
     * @throws ApiException API异常
     */
    void delete(String id) throws ApiException;

    /**
     * 修改ISCSI链路
     * @param mo 修改信息
     * @throws ApiException API异常
     */
    void modify(ISCSILinkMO mo) throws ApiException;

    /**
     * 查询单个ISCSI链路
     * @param id ISCSI链路ID
     * @return ISCSILinkMO
     * @throws ApiException API异常
     */
    ISCSILinkMO get(String id) throws ApiException;

    /**
     * 批量查询ISCSI链路
     * @param condition 查询条件
     * @return ISCSILinkIterator
     * @throws ApiException API异常
     */
    ISCSILinkIterator getBatch(ISCSILinkQuery condition) throws ApiException;

    /**
     * 查询ISCSI链路的总数
     * @return Long
     * @throws ApiException
     */
    Long getCount() throws ApiException;

    /**
     * 根据远端设备ID查询ISCSI链路
     * @param deviceID 远端设备ID
     * @return List<ISCSILinkMO>
     * @throws ApiException API异常
     */
    ISCSILinkIterator getISCSILinkByDeviceID(String deviceID, ISCSILinkQuery condition) throws ApiException;
}
