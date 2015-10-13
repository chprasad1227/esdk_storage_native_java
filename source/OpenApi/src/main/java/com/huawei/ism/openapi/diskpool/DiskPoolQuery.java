package com.huawei.ism.openapi.diskpool;

import com.huawei.ism.openapi.common.batchquery.QueryBase;
/**
 * 查询条件
 * @author gWX183785
 * @version V100R001C10
 */
public class DiskPoolQuery extends QueryBase<DiskPoolMO>
{
    /**
     * 初始化方法
     * @param mo 硬盘域对象
     * @param index 初始索引
     * @param count 数量
     */
    public DiskPoolQuery(DiskPoolMO mo,long index, long count)
    {
        super(mo,index,count);
    }
    
    /**
     * 设置硬盘域对象
     * @param mo 硬盘域对象
     */
    public void setDiskPoolMO(DiskPoolMO mo)
    {
        setConcretQueryMO(mo);
    }
    
    /**
     * 获取硬盘域对象
     * @return 返回结果
     */
    public DiskPoolMO getDiskPoolMO()
    {
        return getConcretMO();
    }
}
