package com.huawei.ism.openapi.fcinitiator;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

/**
 * 批量查询条件
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class FcInitiatorQuery extends QueryBase<FcInitiatorMO>
{
    /**
     * 批量查询条件
     * @param mo 批量查询条件
     * @param index 起始索引
     * @param count 查询数量
     */
    public FcInitiatorQuery(FcInitiatorMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置批量查询条件
     * @param mo 批量查询条件
     */
    public void setQueryFcInitiatorMO(FcInitiatorMO mo)
    {
        setConcretQueryMO(mo);
    }

    public FcInitiatorMO getFcInitiatorMO()
    {
        return getConcretMO();
    }
}
