package com.huawei.ism.openapi.hostgroup;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 定义接口
 * @author gWX183785
 * @version V100R001C10
 */
public interface HostGroupHandler
{
    /**
     * 创建HostGroup
     * @param mo 主机组对象
     * @return 返回结果
     * @throws ApiException 异常
     */
    HostGroupMO create(HostGroupMO mo) throws ApiException;

    /**
     * 查询HostGroup
     * @param id 主机组id
     * @return HostGroupMO 主机组对象
     * @throws ApiException 异常
     */
    HostGroupMO get(String id) throws ApiException;

    /**
     * 批量查询HostGroup迭代器
     * @param condition 批量查询条件
     * @return 返回结果
     */
    HostGroupIterator getBatch(HostGroupQuery condition);

    /**
     * 删除HostGroup
     * @param id 主机组id
     * @throws ApiException 异常
     */
    void delete(String id) throws ApiException;

    /**
     * 修改HostGroup属性
     * @param mo 主机组对象
     * @throws ApiException 异常
     */
    void modify(HostGroupMO mo) throws ApiException;

    /**
     * 查询HostGroup总数
     * @param mo 主机组对象
     * @return 返回结果
     * @throws ApiException 异常
     */
    long count(HostGroupMO mo) throws ApiException;

    /**
     * 对象加入
     * @param hostGroupId 主机组id
     * @param hostId 主机id
     * @throws ApiException 异常
     */
    void createAssociateWithHost(String hostGroupId, String hostId) throws ApiException;

    /**
     * 对象退出
     * @param hostGroupId 主机组id
     * @param hostId 主机id
     * @throws ApiException 异常
     */
    void removeAssociateFromHost(String hostGroupId, String hostId) throws ApiException;

    /**
     * 通过主机查询主机组
     * @param hostId 主机id
     * @return 返回结果
     * @throws ApiException 异常
     */
    HostGroupIterator getHostGroupByHost(String hostId, HostGroupQuery condition) throws ApiException;

    /**
     * 查询主机组的总数
     * @return Long
     * @throws ApiException
     */
    Long getCount() throws ApiException;

}
