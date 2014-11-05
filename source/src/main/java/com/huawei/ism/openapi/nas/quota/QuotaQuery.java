package com.huawei.ism.openapi.nas.quota;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

/**
 * Quota 查询方法
 * @author fWX183786
 * @version V100R001C10
 */
public class QuotaQuery extends QueryBase<QuotaMO>
{
    /**
     * 构造函数
     * @param mo 查询条件
     * @param index 查询索引
     * @param count 查询个数
     */
    public QuotaQuery(QuotaMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置查询条件
     * @param mo 查询条件QuotaMO
     */
    public void setQueryQuota(QuotaMO mo)
    {
        setConcretQueryMO(mo);
    }

    /**
     * 获取查询返回的QuotaMO
     * @return QuotaMO
     */
    public QuotaMO getQuotaMO()
    {
        return getConcretMO();
    }
}
