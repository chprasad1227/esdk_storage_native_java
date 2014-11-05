package com.huawei.ism.openapi.portgroup;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

/**
 * 批量查询条件
 * @author gWX183785
 * @version V100R001C10
 */
public class PortGroupQuery extends QueryBase<PortGroupMO>
{

    /**
     * 初始化方法
     * @param mo 端口组对象
     * @param beginIndex 初始索引
     * @param count 数量
     */
    public PortGroupQuery(PortGroupMO mo, long beginIndex, long count)
    {
        super(mo, beginIndex, count);
    }

    /**
     * 设置端口组对象
     * @param mo 端口组对象
     */
    public void setPortGroupMO(PortGroupMO mo)
    {
        setConcretQueryMO(mo);
    }

    /**
     * 获取端口组对象
     * @return 返回结果
     */
    public PortGroupMO getPortGroupMO()
    {
        return getConcretMO();
    }
}
