package com.huawei.ism.openapi.iscsilink;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

public class ISCSILinkQuery extends QueryBase<ISCSILinkMO>
{
    /**
     * 批量查询条件
     * @param mo 批量查询条件
     * @param index 起始索引
     * @param count 查询数量
     */
    public ISCSILinkQuery(ISCSILinkMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置批量查询条件
     * @param mo 批量查询条件
     */
    public void setQueryISCSILinkMO(ISCSILinkMO mo)
    {
        setConcretQueryMO(mo);
    }

    public ISCSILinkMO getISCSILinkMO()
    {
        return getConcretMO();
    }
}
