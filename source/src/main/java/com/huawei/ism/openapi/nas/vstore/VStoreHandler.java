package com.huawei.ism.openapi.nas.vstore;

import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * 租户的接口类
 * @author fWX183786
 * @version V100R001C10
 */
public interface VStoreHandler
{
    /**
     * 创建租户
     * @param mo 租户数据对象
     * @return 租户数据对象
     * @throws ApiException 异常
     */
    VStoreMO create(VStoreMO mo) throws ApiException;

    /**
     * 修改租户信息
     * @param mo 租户数据对象
     * @throws ApiException 异常
     */
    void modify(VStoreMO mo) throws ApiException;

    /**
     * 删除租户
     * @param vstoreId 租户id
     * @throws ApiException 异常
     */
    void delete(String vstoreId) throws ApiException;

    /**
     * 获取租户信息
     * @param vstoreId 租户id return 租户数据对象
     * @return 租户信息
     * @throws ApiException 异常
     */
    VStoreMO get(String vstoreId) throws ApiException;

    /**
     * 获取租户批量查询迭代器
     * @param condition 查询条件
     * @return 租户批量查询迭代器
     * @throws ApiException 异常
     */
    VstoreIterator getBatch(VStoreQuery condition) throws ApiException;

    /**
     * 获取对象关联的租户
     * @param associateObjType 关联对象类型
     * @param associateObjId 关联对象id
     * @return 关联的租户
     * @throws ApiException 异常
     */
    VStoreMO getAssociateVstore(MOType associateObjType, String associateObjId) throws ApiException;

    /**
     * 创建其他对象与指定租户的关联(将指定对象加入租户)
     * @param vstoreId 租户的ID
     * @param associateObjType 关联对象类型
     * @param associateObjId 关联对象id
     * @throws ApiException 异常
     */
    void createAssociate(String vstoreId, MOType associateObjType, String associateObjId) throws ApiException;

    /**
     * 删除其他对象与指定租户的关联(将指定对象移除租户)
     * @param vstoreId 租户的ID
     * @param associateObjType 关联对象类型
     * @param associateObjId 关联对象id
     * @throws ApiException 异常
     */
    void removeAssociate(String vstoreId, MOType associateObjType, String associateObjId) throws ApiException;

    /**
     * 查询下一个可用的ID号
     * @return 下一个可用的ID号
     * @throws ApiException 异常
     */
    String getNextAviableId() throws ApiException;

}
