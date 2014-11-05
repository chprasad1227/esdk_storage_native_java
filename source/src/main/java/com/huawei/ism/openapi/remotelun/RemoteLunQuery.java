package com.huawei.ism.openapi.remotelun;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

public class RemoteLunQuery extends QueryBase<RemoteLunMO>
{
    /**
     * 批量查询条件
     * @param mo 批量查询条件
     * @param index 起始索引
     * @param count 查询数量
     */
    public RemoteLunQuery(RemoteLunMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置批量查询条件
     * @param mo 批量查询条件
     */
    public void setQueryRemoteLunMO(RemoteLunMO mo)
    {
        setConcretQueryMO(mo);
    }

    public RemoteLunMO getRemoteLunMO()
    {
        return getConcretMO();
    }
}
