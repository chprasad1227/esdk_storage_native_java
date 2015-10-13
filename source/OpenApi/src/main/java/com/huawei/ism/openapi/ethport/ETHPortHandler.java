package com.huawei.ism.openapi.ethport;

import java.util.List;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 定义接口
 * @author gWX183785
 * @version V100R001C10
 */
public interface ETHPortHandler
{
    /**
     * 查询ETH端口
     * @param id eth端口id
     * @return ETHPortMO eth端口对象
     * @throws ApiException 异常
     */
    ETHPortMO get(String id) throws ApiException;

    /**
     * 批量查询ETH端口
     * @param condition 批量查询条件
     * @return ETHPortIterator eth端口迭代器
     */
    ETHPortIterator getBatch(ETHPortQuery condition);

    /**
     * 通过端口组查询ETH端口
     * @param portGroupId 端口组id
     * @return 返回结果
     * @throws ApiException 异常
     */
    List<ETHPortMO> getETHPortByPortGroup(String portGroupId) throws ApiException;

    /**
     * 修改ETH端口
     * @param mo eth端口对象
     * @throws ApiException 异常
     */
    void modify(ETHPortMO mo) throws ApiException;

}
