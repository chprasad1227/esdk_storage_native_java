package com.huawei.ism.openapi.replicationpair;

import java.util.List;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 定义接口
 * @author gWX183785
 * @version V100R001C10
 */
public interface ReplicationPairHandler
{
    /**
     * 创建远程复制
     * @param mo 远程复制对象
     * @return 返回结果
     * @throws ApiException 异常
     */
    ReplicationPairMO create(ReplicationPairMO mo) throws ApiException;

    /**
     * 分裂远程复制
     * @param id 远程复制id
     * @throws ApiException 异常
     */
    void split(String id) throws ApiException;

    /**
     * 同步复制
     * @param id 远程复制id
     * @throws ApiException 异常
     */
    void sync(String id) throws ApiException;

    /**
     * 主从切换
     * @param id 远程复制id
     * @throws ApiException 异常
     */
    void switchPair(String id) throws ApiException;

    /**
     * 启用从LUN写保护
     * @param id 远程复制id
     * @throws ApiException 异常
     */
    void enableWriteProtectionForSecLUN(String id) throws ApiException;

    /**
     * 关闭从LUN写保护
     * @param id 远程复制id
     * @throws ApiException 异常
     */
    void disableWriteProtectionForSecLUN(String id) throws ApiException;

    /**
     * 同步远程状态
     * @throws ApiException 异常
     */
    void refresh() throws ApiException;

    /**
     * 查询远程复制
     * @param id 远程复制id
     * @return ReplicationPairMO 远程复制对象
     * @throws ApiException 异常
     */
    ReplicationPairMO get(String id) throws ApiException;

    /**
     * 批量查询远程复制p迭代器
     * @param condition 批量查询条件
     * @return 返回结果
     */
    ReplicationPairIterator getBatch(ReplicationPairQuery condition);

    /**
     * 删除远程复制
     * @param id 远程复制id
     * @throws ApiException 异常
     */
    void delete(String id, Boolean toSyncSRWhenDelete, Boolean isLocalDelete)
        throws ApiException;

    /**
     * 修改远程复制属性
     * @param mo 远程复制对象
     * @throws ApiException 异常
     */
    void modify(ReplicationPairMO mo) throws ApiException;

    /**
     * 查询远程复制总数
     * @return 返回结果
     * @throws ApiException 异常
     */
    Long getCount() throws ApiException;

    /**
     * 查询与LUN关联的远程复制信息
     * @param lunID LUNID
     * @return ReplicationPairMO 远程复制对象
     * @throws ApiException 异常
     */
    List<ReplicationPairMO> getReplicationpairByLUN(String lunID)
        throws ApiException;

    /**
     * 查询一致性组内的所有远程复制信息
     * @param consistentGroupID 一致性组ID
     * @return ReplicationPairMO 远程复制对象
     * @throws ApiException 异常
     */
    List<ReplicationPairMO> getReplicationpairsByConsistentGroupID(
        String consistentGroupID) throws ApiException;

}
