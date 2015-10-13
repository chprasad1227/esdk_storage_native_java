package com.huawei.ism.openapi.fcport;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

/**
 * 批量查询条件
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class FCPortQuery extends QueryBase<FCPortMO>
{
    /**
     * 批量查询条件
     * @param mo 查询条件
     * @param index 起始索引
     * @param count 查询数量
     */
    public FCPortQuery(FCPortMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置批量查询条件
     * @param mo 查询条件
     */
    public void setFCPortMO(FCPortMO mo)
    {
        setConcretQueryMO(mo);
    }

    public FCPortMO getFCPortMO()
    {
        return getConcretMO();
    }
}
