package com.huawei.ism.openapi.fcinitiator;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * FC启动器接口
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public interface FcInitiatorHandler
{
    /**
     * 创建FC启动器
     * @param mo 启动器信息
     * @return FcInitiatorMO
     * @throws ApiException API异常
     */
    FcInitiatorMO create(FcInitiatorMO mo) throws ApiException;

    /**
     * 查询FC启动器
     * @param id 启动器ID
     * @return FcInitiatorMO
     * @throws ApiException API异常
     */
    FcInitiatorMO get(String id) throws ApiException;

    /**
     * 批量查询FC启动器
     * @param condition 查询条件
     * @return FcInitiatorIterator
     */
    FcInitiatorIterator getBatch(FcInitiatorQuery condition);

    /**
     * 将FC启动器添加到HOST
     * @param fcInitiatorId 启动器ID
     * @param hostId 主机ID
     * @throws ApiException API异常
     */
    void createFcToHost(String initiatorId, String hostId) throws ApiException;

    /**
     * 将FC启动器从HOST移除
     * @param id 启动器ID
     * @throws ApiException API异常
     */
    void removeFcFromHost(String id) throws ApiException;

    /**
     * 修改启动器
     * @param mo 修改信息
     * @throws ApiException API异常
     */
    void modify(FcInitiatorMO mo) throws ApiException;

    /**
     * 删除启动器
     * @param id 启动器ID
     * @throws ApiException API异常
     */
    void delete(String id) throws ApiException;

}
