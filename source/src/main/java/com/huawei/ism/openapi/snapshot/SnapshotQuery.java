package com.huawei.ism.openapi.snapshot;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

/**
 * 快照查询条件
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class SnapshotQuery extends QueryBase<SnapshotMO>
{

    /**
     * 快照查询条件
     * @param mo 快照mo
     * @param index 快照查询的开始下标
     * @param count 快照查询返回的bean
     */
    public SnapshotQuery(SnapshotMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置快照查询的条件bean
     * @param mo 快照查询的bean
     */
    public void setSnapshotMO(SnapshotMO mo)
    {
        setConcretQueryMO(mo);
    }

    /**
     * 获取快照bean
     * @return SnapshotMO
     */
    public SnapshotMO getSnapshotMO()
    {
        return getConcretMO();
    }
}
