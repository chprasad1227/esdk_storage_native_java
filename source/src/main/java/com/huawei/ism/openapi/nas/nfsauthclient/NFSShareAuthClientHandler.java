package com.huawei.ism.openapi.nas.nfsauthclient;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 接口定义
 * @author gWX183785
 * @version V100R001C10
 */
public interface NFSShareAuthClientHandler
{
    /**
     * 创建NFS共享权限控制
     * @param mo NFS共享权限控制对象
     * @return NFS共享权限控制对象
     * @throws ApiException 异常
     */
    NFSShareAuthClientMO create(NFSShareAuthClientMO mo) throws ApiException;

    /**
     * 查询NFS共享权限控制
     * @param id NFS共享权限控制id
     * @return NFS共享权限控制对象
     * @throws ApiException 异常
     */
    NFSShareAuthClientMO get(String id) throws ApiException;

    /**
     * 批量查询NFS共享权限控制迭代器
     * @param condition 查询条件
     * @return 主机对象
     */
    NFSShareAuthClientIterator getBatch(NFSShareAuthClientQuery condition);

    /**
     * 删除NFS共享权限控制
     * @param id 端口组id
     * @throws ApiException 异常
     */
    void delete(String id) throws ApiException;

    /**
     * 修改NFS共享权限控制属性--------该方法没有调用成功，ISM页面中好像没有
     * @param mo NFS共享权限控制对象
     * @throws ApiException 异常
     */
    void modify(NFSShareAuthClientMO mo) throws ApiException;

}
