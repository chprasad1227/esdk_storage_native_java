package com.huawei.ism.openapi.nas.vstore;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

/**
 * 租户查询类
 * @author fWX183786
 * @version V100R001C10
 */
public class VStoreQuery extends QueryBase<VStoreMO>
{
    /**
     * 构造函数
     * @param mo 租户数据对象
     * @param index 起始索引
     * @param count 数量
     */
    public VStoreQuery(VStoreMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置查询条件
     * @param mo 查询条件VStoreMO
     */
    public void setQueryVstoreMO(VStoreMO mo)
    {
        setConcretQueryMO(mo);
    }

    /**
     * 获取过滤条件 VStoreMO
     * @return VStoreMO
     */
    public VStoreMO getVstoreMO()
    {
        return getConcretMO();
    }

}
