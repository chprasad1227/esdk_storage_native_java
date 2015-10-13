package com.huawei.ism.openapi.nas.localresuser;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * LocalResuser接口定义
 * @author gWX183785
 * @version V100R001C10
 */
public interface LocalResuserHandler
{
    /**
     * 创建本地资源用户
     * @param mo 本地资源用户mo
     * @return 本地资源用户数据对象
     * @throws ApiException API自定义异常
     */
    LocalResuserMO create(LocalResuserMO mo) throws ApiException;

    /**
     * 本地资源用户修改方法
     * @param mo 本地资源用户mo
     * @throws ApiException API自定义异常
     */
    void modify(LocalResuserMO mo) throws ApiException;

    /**
     * 创建本地资源用户
     * @param id id
     * @throws ApiException API自定义异常
     */
    void delete(String id) throws ApiException;

    /**
     * 获取本地资源用户信息
     * @param id id
     * @return 本地资源用户信息
     * @throws ApiException API自定义异常
     */
    LocalResuserMO get(String id) throws ApiException;

    /**
     * 批量查询本地资源用户信息
     * @param condition 批量查询条件
     * @return 返回结果
     */
    LocalResuserIterator getBatch(LocalResuserQuery condition);

    /**
     * 通过本地资源组查询本地资源用户
     * @param localResuserGroupId 本地资源组
     * @return 返回结果
     * @throws ApiException 异常
     */
    LocalResuserIterator getLocalResuserByLocalResGroup(String localResuserGroupNames, LocalResuserQuery condition)
        throws ApiException;
}
