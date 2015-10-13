package com.huawei.ism.openapi.nas.cifsauthclient;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 接口定义
 * @author gWX183785
 * @version V100R001C10
 */
public interface CIFSShareAuthClientHandler
{
    /**
     * 创建CIFS共享权限控制
     * @param mo CIFS共享权限控制对象
     * @return CIFS共享权限控制对象
     * @throws ApiException 异常
     */
    CIFSShareAuthClientMO create(CIFSShareAuthClientMO mo) throws ApiException;

    /**
     * 查询CIFS共享权限控制
     * @param id CIFS共享权限控制id
     * @return CIFS共享权限控制对象
     * @throws ApiException 异常
     */
    CIFSShareAuthClientMO get(String id) throws ApiException;

    /**
     * 批量查询CIFS共享权限控制迭代器
     * @param condition 查询条件
     * @return 主机对象
     */
    CIFSShareAuthClientIterator getBatch(CIFSShareAuthClientQuery condition);

    /**
     * 删除CIFS共享权限控制
     * @param id 端口组id
     * @throws ApiException 异常
     */
    void delete(String id) throws ApiException;

    /**
     * 修改CIFS共享权限控制属性--------该方法没有调用成功，ISM页面中好像没有
     * @param mo CIFS共享权限控制对象
     * @throws ApiException 异常
     */
    void modify(CIFSShareAuthClientMO mo) throws ApiException;

}
