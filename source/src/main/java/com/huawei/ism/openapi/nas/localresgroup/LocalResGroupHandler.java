package com.huawei.ism.openapi.nas.localresgroup;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * LocalResGroup接口定义
 * @author gWX183785
 * @version V100R001C10
 */
public interface LocalResGroupHandler
{
    /**
     * 创建本地资源组
     * @param mo 本地资源组mo
     * @return 本地资源组数据对象
     * @throws ApiException API自定义异常
     */
    LocalResGroupMO create(LocalResGroupMO mo) throws ApiException;

    /**
     * 本地资源组修改方法
     * @param mo 本地资源组mo
     * @throws ApiException API自定义异常
     */
    void modify(LocalResGroupMO mo) throws ApiException;

    /**
     * 创建本地资源组
     * @param id id
     * @throws ApiException API自定义异常
     */
    void delete(String id) throws ApiException;

    /**
     * 获取本地资源组信息
     * @param id id
     * @return 本地资源组信息
     * @throws ApiException API自定义异常
     */
    LocalResGroupMO get(String id) throws ApiException;

    /**
     * 批量查询本地资源组信息
     * @param condition 批量查询条件
     * @return 返回结果
     */
    LocalResGroupIterator getBatch(LocalResGroupQuery condition);

}
