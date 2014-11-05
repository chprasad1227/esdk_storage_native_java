package com.huawei.ism.openapi.fclink;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

public class FCLinkQuery extends QueryBase<FCLinkMO>
{
    /**
     * 批量查询条件
     * @param mo 批量查询条件
     * @param index 起始索引
     * @param count 查询数量
     */
    public FCLinkQuery(FCLinkMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置批量查询条件
     * @param mo 批量查询条件
     */
    public void setQueryFCLinkMO(FCLinkMO mo)
    {
        setConcretQueryMO(mo);
    }

    public FCLinkMO getFCLinkMO()
    {
        return getConcretMO();
    }
}
