package com.huawei.ism.openapi.lun;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * Lun 对外开放接口
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public interface LunHandler
{
    /**
     * 创建LUN
     * @param mo lun bean
     * @return LunMO
     * @throws ApiException API自定义异常
     */
    LunMO create(LunMO mo) throws ApiException;

    /**
     * 修改LUN属性
     * @param mo lun属性bean
     * @throws ApiException API自定义异常
     */
    void modify(LunMO mo) throws ApiException;

    /**
     * 查询
     * @param lunId lun id
     * @return LunMO
     * @throws ApiException API自定义异常
     */
    LunMO get(String lunId) throws ApiException;

    /**
     * 删除LUN
     * @param lunId lun id
     * @throws ApiException API自定义异常
     */
    void delete(String lunId) throws ApiException;

    /**
     * LUN扩容
     * @param lunId lun id
     * @param capacity 容量
     * @throws ApiException API自定义异常
     */
    void expandLunCapacity(String lunId, Long capacity) throws ApiException;

    /**
     * 批量查询
     * @param condition lun查询条件
     * @return LunIterator
     */
    LunIterator getBatch(LunQuery condition);

    /**
     * 获取Lun组关联的LUN
     * @param lunGroupId 存储池id
     * @return List<LunMO>
     * @throws ApiException API自定义异常
     */
    LunIterator getLunByLunGroup(String lunGroupId, LunQuery condition) throws ApiException;

    /**
     * 获取主机关联的LUN
     * @param hostId 主机id
     * @return List<LunMO>
     * @throws ApiException API自定义异常
     */
    LunIterator getLunByHost(String hostId, LunQuery condition) throws ApiException;

    /**
     * 获取存储池关联的LUN
     * @param storagePoolId 存储池id
     * @return List<LunMO>
     * @throws ApiException API自定义异常
     */
    LunIterator getLunByStoragePool(String storagePoolId, LunQuery condition) throws ApiException;

    /**
     * 查询LUN的总数
     * @return Long
     * @throws ApiException
     */
    Long getCount() throws ApiException;

}
