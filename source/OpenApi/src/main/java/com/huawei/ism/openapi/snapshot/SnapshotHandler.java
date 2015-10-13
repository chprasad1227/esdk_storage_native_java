package com.huawei.ism.openapi.snapshot;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 快照MO
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public interface SnapshotHandler
{

    /**
     * 创建一个快照
     * @param mo 快照MO的bean
     * @return 快照mo
     * @throws ApiException API自定义异常
     */
    SnapshotMO create(SnapshotMO mo) throws ApiException;

    /**
     * 删除快照
     * @param snapshotId 快照对应的id
     * @throws ApiException API自定义异常
     */
    void delete(String snapshotId) throws ApiException;

    /**
     * 修改快照
     * @param mo 快照对应的mo
     * @throws ApiException API自定义异常
     */
    void modify(SnapshotMO mo) throws ApiException;

    /**
     * 查询快照
     * @param snapshotId 快照对应的id
     * @return SnapshotMO
     * @throws ApiException API自定义异常
     */
    SnapshotMO get(String snapshotId) throws ApiException;

    /**
     * 批量查询快照
     * @param condition 快照的查询条件类
     * @return 快照自定义迭代器
     */
    SnapshotIterator getBatch(SnapshotQuery condition);

    /**
     * 快照回滚
     * @param mo 快照mo
     * @throws ApiException API自定义异常
     */
    void rollbackHyperImage(SnapshotMO mo) throws ApiException;
}
