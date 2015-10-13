package com.huawei.ism.openapi.iscsiinitiator;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 定义接口
 * @author gWX183785
 * @version V100R001C10
 */
public interface ISCSIInitiatorHandler
{
    /**
     * 创建ISCSI控制器
     * @param mo ISCSI控制器对象
     * @return 返回结果
     * @throws ApiException 异常
     */
    ISCSIInitiatorMO create(ISCSIInitiatorMO mo) throws ApiException;

    /**
     * 查询ISCSI控制器
     * @param id ISCSI控制器id
     * @return 返回结果
     * @throws ApiException 异常
     */
    ISCSIInitiatorMO get(String id) throws ApiException;

    /**
     * 批量查询ISCSI控制器
     * @param condition 查询条件
     * @return 返回结果
     */
    ISCSIInitiatorIterator getBatch(ISCSIInitiatorQuery condition);

    /**
     * 将ISCSI启动器添加到HOST
     * @param initiatorId 启动器ID
     * @param hostId 主机ID
     * @throws ApiException API异常
     */
    void createIscsiToHost(String initiatorId, String hostId) throws ApiException;

    /**
     * 将ISCSI控制器从主机移除
     * @param initiatorId 启动器id
     * @throws ApiException 异常
     */
    void removeIscsiFromHost(String initiatorId) throws ApiException;

    /**
     * 修改ISCSI控制器
     * @param mo ISCSI控制器对象
     * @throws ApiException 异常
     */
    void modify(ISCSIInitiatorMO mo) throws ApiException;

    /**
     * 删除ISCSI控制器
     * @param id ISCSI控制器id
     * @throws ApiException 异常
     */
    void delete(String id) throws ApiException;

}
