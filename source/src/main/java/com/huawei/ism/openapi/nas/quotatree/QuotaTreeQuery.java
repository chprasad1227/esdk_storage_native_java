package com.huawei.ism.openapi.nas.quotatree;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

/**
 * QuotaTree 查询类
 * @author fWX183786
 * @version V100R001C10
 */
public class QuotaTreeQuery extends QueryBase<QuotaTreeMO>
{
    /**
     * 构造函数
     * @param mo 查询过滤条件
     * @param index 查询索引
     * @param count 查询数量
     */
    public QuotaTreeQuery(QuotaTreeMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置查询条件MO
     * @param mo 查询条件数据对象
     */
    public void setQueryqTreeMO(QuotaTreeMO mo)
    {
        setConcretQueryMO(mo);
    }

    /**
     * 获取查询条件MO
     * @return 查询条件数据对象
     */
    public QuotaTreeMO getQuotaTreeMO()
    {
        return getConcretMO();
    }
}
