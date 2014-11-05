package com.huawei.ism.openapi.consistentgroup;

import com.huawei.ism.openapi.common.batchquery.QueryBase;
/**
 * 批量查询条件
 * @author gWX183785
 * @version V100R001C10
 */
public class ConsistentGroupQuery extends QueryBase<ConsistentGroupMO>
{
    /**
     * 初始化方法
     * @param mo 远程复制一致性组对象
     * @param index 初始索引
     * @param count 数量
     */
    public ConsistentGroupQuery(ConsistentGroupMO mo,long index, long count)
    {
        super(mo,index,count);
    }
    
    /**
     * 设置远程复制一致性组对象
     * @param mo 远程复制一致性组对象
     */
    public void setConsistentGroupMO(ConsistentGroupMO mo)
    {
        setConcretQueryMO(mo);
    }
    
    /**
     * 获取远程复制一致性组对象
     * @return 返回结果
     */
    public ConsistentGroupMO getConsistentGroupMO()
    {
        return getConcretMO();
    }
}
