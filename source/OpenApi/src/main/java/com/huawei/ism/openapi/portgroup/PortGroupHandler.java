package com.huawei.ism.openapi.portgroup;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 接口定义
 * @author gWX183785
 * @version V100R001C10
 */
public interface PortGroupHandler
{
    /**
     * 创建PortGroup
     * @param mo 端口组对象
     * @return 端口组对象
     * @throws ApiException 异常
     */
    PortGroupMO create(PortGroupMO mo) throws ApiException;

    /**
     * 查询HostGroup
     * @param id 端口组id
     * @return 端口组对象
     * @throws ApiException 异常
     */
    PortGroupMO get(String id) throws ApiException;

    /**
     * 批量查询PortGroup迭代器
     * @param condition 查询条件
     * @return 主机对象
     */
    PortGroupIterator getBatch(PortGroupQuery condition);

    /**
     * 删除HostGroup
     * @param id 端口组id
     * @throws ApiException 异常
     */
    void delete(String id) throws ApiException;

    /**
     * 修改PortGroup属性
     * @param mo 端口组对象
     * @throws ApiException 异常
     */
    void modify(PortGroupMO mo) throws ApiException;

    /**
     * 查询PortGroup总数
     * @param mo 端口组对象
     * @return 端口组数量
     * @throws ApiException 异常
     */
    long count(PortGroupMO mo) throws ApiException;

    /**
     * 添加端口
     * @param portGroupId 端口组id
     * @param portId 端口id
     * @throws ApiException 异常
     */
    void createAssociateWithPort(String portGroupId, String portId) throws ApiException;

    /**
     * 移除端口
     * @param portGroupId 端口组id
     * @param portId 端口id
     * @throws ApiException 异常
     */
    void removeAssociateFromPort(String portGroupId, String portId) throws ApiException;

    /**
     * 关联查询
     * @param portId fcoe端口id
     * @return 端口组列表
     * @throws ApiException 异常
     */
    PortGroupIterator getPortGroupByPort(String portId, PortGroupQuery condition) throws ApiException;

    /**
     * 查询端口组的总数
     * @return Long
     * @throws ApiException
     */
    Long getCount() throws ApiException;
}
