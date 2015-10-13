package com.huawei.ism.openapi.lungroup;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * LUN组接口
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public interface LunGroupHandler
{
    /**
     * 创建LUN组
     * @param mo LUN组信息
     * @return LunGroupMO
     * @throws ApiException API异常
     */
    LunGroupMO create(LunGroupMO mo) throws ApiException;

    /**
     * 查询
     * @param id LUN组ID
     * @return LunGroupMO
     * @throws ApiException API异常
     */
    LunGroupMO get(String id) throws ApiException;

    /**
     * 批量查询
     * @param condition 查询条件
     * @return LunGroupIterator
     * @throws ApiException API异常
     */
    LunGroupIterator getBatch(LunGroupQuery condition) throws ApiException;

    /**
     * 删除LUN组
     * @param id LUN组ID
     * @throws ApiException API异常
     */
    void delete(String id) throws ApiException;

    /**
     * 修改属性
     * @param mo LUN组信息
     * @throws ApiException API异常
     */
    void modify(LunGroupMO mo) throws ApiException;

    /**
     * 对象加入
     * @param lunGroupId LUN组ID
     * @param lunId LUNID
     * @throws ApiException API异常
     */
    void createAssociateWithLun(String lunGroupId, String lunId) throws ApiException;

    /**
     * 对象退出
     * @param lunGroupId LUN组ID
     * @param lunId LUNID
     * @throws ApiException API异常
     */
    void removeAssociateFromLun(String lunGroupId, String lunId) throws ApiException;

    /**
     * 查询关联对象（通过LUN查询LUN组）
     * @param lunId LUN的ID
     * @return List<LunGroupMO>
     * @throws ApiException API异常
     */
    LunGroupIterator getLunGroupbyLun(String lunId, LunGroupQuery condition) throws ApiException;

    /**
     * 查询LUN组的总数
     * @return Long
     * @throws ApiException
     */
    Long getCount() throws ApiException;

}
