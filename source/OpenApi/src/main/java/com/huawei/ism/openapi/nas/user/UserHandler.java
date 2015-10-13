package com.huawei.ism.openapi.nas.user;

import java.util.List;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 用户的接口类
 */
public interface UserHandler
{
    /**
     * 创建用户
     * @param mo 用户数据对象
     * @return 用户数据对象
     * @throws ApiException 异常
     */
    UserMO create(UserMO mo) throws ApiException;

    /**
     * 删除用户
     * @param userId 用户id
     * @throws ApiException 异常
     */
    void delete(String userId) throws ApiException;

    /**
     * 获取用户信息
     * @param userID 用户ID return 用户数据对象
     * @return 用户信息
     * @throws ApiException 异常
     */
    UserMO get(String userID) throws ApiException;

    /**
     * 获取用户批量查询迭代器
     * @param mo 查询条件
     * @return 用户列表
     * @throws ApiException 异常
     */
    List<UserMO> getBatch(UserMO mo) throws ApiException;

}
