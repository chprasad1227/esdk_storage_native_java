package com.huawei.ism.openapi.lungroup;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

/**
 * LUN组查询条件
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class LunGroupQuery extends QueryBase<LunGroupMO>
{
    /**
     * LUN组查询条件
     * @param mo LUN组
     * @param index 起始索引
     * @param count 查询数量
     */
    public LunGroupQuery(LunGroupMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置LUN组查询条件
     * @param mo LUN组
     */
    public void setQueryLUNGroupMO(LunGroupMO mo)
    {
        setConcretQueryMO(mo);
    }

    public LunGroupMO getLunGroupMO()
    {
        return getConcretMO();
    }
}
