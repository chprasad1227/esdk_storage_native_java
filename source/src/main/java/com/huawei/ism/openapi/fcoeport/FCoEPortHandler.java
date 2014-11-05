package com.huawei.ism.openapi.fcoeport;

import java.util.List;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 定义接口
 * @author gWX183785
 * @version V100R001C10
 */
public interface FCoEPortHandler
{
    /**
     * 查询FCoE端口
     * @param id 端口id
     * @return 返回结果
     * @throws ApiException 异常
     */
    FCoEPortMO get(String id) throws ApiException;

    /**
     * 批量查询FCoE端口
     * @param condition 批量查询条件
     * @return 返回结果
     */
    FCoEPortIterator getBatch(FCoEPortQuery condition);

    /**
     * 通过端口组查询FCoE端口
     * @param portGroupId 端口组id
     * @return 返回结果
     * @throws ApiException 异常
     */
    List<FCoEPortMO> getFCoEPortByPortGroup(String portGroupId) throws ApiException;

    /**
     * 修改FCoE端口
     * @param mo fcoe端口对象
     * @throws ApiException 异常
     */
    void modify(FCoEPortMO mo) throws ApiException;

}
