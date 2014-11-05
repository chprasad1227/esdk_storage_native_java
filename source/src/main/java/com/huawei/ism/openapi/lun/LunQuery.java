package com.huawei.ism.openapi.lun;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

/**
 * Lun的查询方法
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class LunQuery extends QueryBase<LunMO>
{
    /**
     * Lun 查询构造函数
     * @param mo LUN bean类
     * @param index 查询返回值的开始标签
     * @param count 查询返回个数
     */
    public LunQuery(LunMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置查询条件
     * @param mo 查询条件lun
     */
    public void setQueryLUNMO(LunMO mo)
    {
        setConcretQueryMO(mo);
    }

    /**
     * 获取查询返回的Lun bean
     * @return LunMO
     */
    public LunMO getLunMO()
    {
        return getConcretMO();
    }
}
