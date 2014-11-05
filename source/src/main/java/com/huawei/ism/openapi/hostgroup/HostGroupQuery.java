package com.huawei.ism.openapi.hostgroup;

import com.huawei.ism.openapi.common.batchquery.QueryBase;
/**
 * 批量查询条件
 * @author gWX183785
 * @version V100R001C10
 */
public class HostGroupQuery extends QueryBase<HostGroupMO>
{
    /**
     * 初始化方法
     * @param mo 主机组对象
     * @param index 初始索引
     * @param count 数量
     */
    public HostGroupQuery(HostGroupMO mo,long index, long count)
    {
        super(mo,index,count);
    }
    
    /**
     * 设置主机组对象
     * @param mo 主机组对象
     */
    public void setHostGroupMO(HostGroupMO mo)
    {
        setConcretQueryMO(mo);
    }
    
    /**
     * 获取主机组对象
     * @return 返回结果
     */
    public HostGroupMO getHostGroupMO()
    {
        return getConcretMO();
    }
}
