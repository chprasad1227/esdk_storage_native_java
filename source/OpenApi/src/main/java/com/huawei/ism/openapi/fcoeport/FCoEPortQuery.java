package com.huawei.ism.openapi.fcoeport;

import com.huawei.ism.openapi.common.batchquery.QueryBase;
/**
 * 查询条件
 * @author gWX183785
 * @version V100R001C10
 */
public class FCoEPortQuery extends QueryBase<FCoEPortMO>
{
    /**
     * 初始化方法
     * @param mo fcoe端口对象
     * @param index 初始索引
     * @param count 数量
     */
    public FCoEPortQuery(FCoEPortMO mo,long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置fcoe端口对象
     * @param mo fcoe端口对象
     */
    public void setQueryFCoEPortMO(FCoEPortMO mo)
    {
        setConcretQueryMO(mo);
    }
    
    /**
     * 获取fcoe端口对象
     * @return 返回结果
     */
    public FCoEPortMO getFCoEPortMO()
    {
        return getConcretMO();
    }
}
