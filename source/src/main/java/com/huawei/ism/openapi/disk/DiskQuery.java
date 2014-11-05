package com.huawei.ism.openapi.disk;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

/**
 * 硬盘查询条件
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class DiskQuery extends QueryBase<DiskMO>
{
    /**
     * 硬盘查询条件
     * @param mo 过滤条件
     * @param index 起始索引
     * @param count 查询数量
     */
    public DiskQuery(DiskMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置查询条件
     * @param mo 过滤条件
     */
    public void setQueryDiskMO(DiskMO mo)
    {
        setConcretQueryMO(mo);
    }

    public DiskMO getDiskMO()
    {
        return getConcretMO();
    }
}
