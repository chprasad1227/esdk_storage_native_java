package com.huawei.ism.openapi.remotedevice;

import com.huawei.ism.openapi.common.exception.ApiException;

public interface RemoteDeviceHandler
{
    /**
     * 通过FC创建本厂商远程设备
     * @param mo 远端设备信息
     * @return RemoteDeviceMO
     * @throws ApiException API异常
     */
    RemoteDeviceMO createByFC(RemoteDeviceBuilderFCMO mo) throws ApiException;

    /**
     * 通过ISCSI创建本厂商远程设备
     * @param mo 远端设备信息
     * @return RemoteDeviceMO
     * @throws ApiException API异常
     */
    RemoteDeviceMO createByISCSI(RemoteDeviceBuilderISCSIMO mo) throws ApiException;

    /**
     * 通过Vendor创建本厂商远程设备
     * @param mo 远端设备信息
     * @return RemoteDeviceMO
     * @throws ApiException API异常
     */
    RemoteDeviceMO createByVendor(RemoteDeviceBuilderVendorMO mo) throws ApiException;

    /**
     * 修改登录远程设备的鉴权密码
     * @param mo 修改信息
     * @throws ApiException API异常
     */
    void modifyAuthenticationInfo(String id, String remoteUserName, String remotePassword) throws ApiException;

    /**
     * 删除远端设备
     * @param mo 修改信息
     * @throws ApiException API异常
     */
    void delete(String id) throws ApiException;

    /**
     * 查询单个远端设备
     * @param id 远端设备ID
     * @return RemoteDeviceMO
     * @throws ApiException API异常
     */
    RemoteDeviceMO get(String id) throws ApiException;

    /**
     * 批量查询远端设备
     * @param condition 查询条件
     * @return RemoteDeviceIterator
     * @throws ApiException API异常
     */
    RemoteDeviceIterator getBatch(RemoteDeviceQuery condition) throws ApiException;

    /**
     * 查询远端设备的总数
     * @return Long
     * @throws ApiException
     */
    Long getCount() throws ApiException;

}
