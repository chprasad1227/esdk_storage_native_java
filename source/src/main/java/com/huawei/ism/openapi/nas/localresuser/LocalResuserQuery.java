package com.huawei.ism.openapi.nas.localresuser;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

/**
 * 批量查询条件
 * @author gWX183785
 * @version V100R001C10
 */
public class LocalResuserQuery extends QueryBase<LocalResuserMO>
{
    /**
     * 初始化方法
     * @param mo 本地资源用户数据对象
     * @param index 批量查询初始索引
     * @param count 批量查询的个数
     */
    public LocalResuserQuery(LocalResuserMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置批量查询条件
     * @param mo 本地资源用户数据对象
     */
    public void setQueryLocalResuserMO(LocalResuserMO mo)
    {
        setConcretQueryMO(mo);
    }

    /**
     * 获取批量查询条件
     * @return 返回结果
     */
    public LocalResuserMO getLocalResuserMO()
    {
        return getConcretMO();
    }

}
