package com.huawei.ism.openapi.ethport;

import com.huawei.ism.openapi.common.batchquery.QueryBase;
/**
 * 批量查询条件
 * @author gWX183785
 * @version V100R001C10
 */
public class ETHPortQuery extends QueryBase<ETHPortMO>
{
    /**
     * 初始化方法
     * @param mo eth端口对象
     * @param index 初始索引
     * @param count 数量
     */
    public ETHPortQuery(ETHPortMO mo,long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置ETH端口对象
     * @param mo ETH端口对象
     */
    public void setQueryETHPortMO(ETHPortMO mo)
    {
        setConcretQueryMO(mo);
    }
    
    /**
     * 设置ETH端口对象
     * @return 返回结果
     */
    public ETHPortMO getETHPortMO()
    {
        return getConcretMO();
    }
}
