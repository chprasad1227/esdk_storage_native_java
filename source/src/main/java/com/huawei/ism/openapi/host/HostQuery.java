package com.huawei.ism.openapi.host;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

/**
 * Host批量查询的条件类
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class HostQuery extends QueryBase<HostMO>
{

    /**
     * host批量查询条件类构造函数
     * @param mo host bean
     * @param index 批量查询的开始标签
     * @param count 批量查询返回的个数
     */
    public HostQuery(HostMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置批量查询条件
     * @param mo host bean实例
     */
    public void setQueryHostMO(HostMO mo)
    {
        setConcretQueryMO(mo);
    }

    /**
     * 获取主机MO
     * @return HostMO
     */
    public HostMO getHostMO()
    {
        return getConcretMO();
    }

}
