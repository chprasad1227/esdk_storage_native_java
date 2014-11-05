package com.huawei.ism.openapi.consistentgroup;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 定义接口
 * @author gWX183785
 * @version V100R001C10
 */
public interface ConsistentGroupHandler
{
    /**
     * 创建远程复制一致性组
     * @param mo 远程复制一致性组对象
     * @return 返回结果
     * @throws ApiException 异常
     */
    ConsistentGroupMO create(ConsistentGroupMO mo) throws ApiException;

    /**
     * 分裂远程复制一致性组
     * @param id 远程复制一致性组id
     * @throws ApiException 异常
     */
    void split(String id) throws ApiException;

    /**
     * 同步复制
     * @param id 远程复制一致性组id
     * @throws ApiException 异常
     */
    void sync(String id) throws ApiException;

    /**
     * 主从切换
     * @param id 远程复制一致性组id
     * @throws ApiException 异常
     */
    void switchPair(String id) throws ApiException;

    /**
     * 启用从LUN写保护
     * @param id 远程复制一致性组id
     * @throws ApiException 异常
     */
    void enableWriteProtectionForSecLUN(String id) throws ApiException;

    /**
     * 关闭从LUN写保护
     * @param id 远程复制一致性组id
     * @throws ApiException 异常
     */
    void disableWriteProtectionForSecLUN(String id) throws ApiException;

    /**
     * 同步远程状态
     * @throws ApiException 异常
     */
    void refresh() throws ApiException;

    /**
     * 查询远程复制一致性组
     * @param id 远程复制一致性组id
     * @return ReplicationPairMO 远程复制一致性组对象
     * @throws ApiException 异常
     */
    ConsistentGroupMO get(String id) throws ApiException;

    /**
     * 批量查询远程复制一致性组p迭代器
     * @param condition 批量查询条件
     * @return 返回结果
     */
    ConsistentGroupIterator getBatch(ConsistentGroupQuery condition);

    /**
     * 删除远程复制一致性组
     * @param id 远程复制一致性组id
     * @throws ApiException 异常
     */
    void delete(String id) throws ApiException;

    /**
     * 删除远程复制一致性组
     * @param id 远程复制一致性组id
     * @param isLocalDelete 是否允许本地删除配置文件
     * @throws ApiException 异常
     */
    void delete(String id, Boolean isLocalDelete) throws ApiException;

    /**
     * 修改远程复制一致性组属性
     * @param mo 远程复制一致性组对象
     * @throws ApiException 异常
     */
    void modify(ConsistentGroupMO mo) throws ApiException;

    /**
     * 查询远程复制一致性组总数
     * @return 返回结果
     * @throws ApiException 异常
     */
    long getCount() throws ApiException;

    /**
     * 对象加入
     * @param consistentID 主机组id
     * @param rmList 远程复制ID列表
     * @throws ApiException 异常
     */
    void addReplicationpair(String consistentID, String[] rmList)
        throws ApiException;

    /**
     * 对象退出
     * @param consistentID 主机组id
     * @param rmList 远程复制ID列表
     * @throws ApiException 异常
     */
    void removeReplicationpair(String consistentID, String[] rmList)
        throws ApiException;

}
