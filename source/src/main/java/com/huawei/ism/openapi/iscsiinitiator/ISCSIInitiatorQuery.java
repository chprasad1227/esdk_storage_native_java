package com.huawei.ism.openapi.iscsiinitiator;

import com.huawei.ism.openapi.common.batchquery.QueryBase;
/**
 * 批量查询条件
 * @author gWX183785
 * @version V100R001C10
 */
public class ISCSIInitiatorQuery extends QueryBase<ISCSIInitiatorMO>
{
    /**
     * 初始化方法
     * @param mo ISCSI启动器对象
     * @param index 初始索引
     * @param count 数量
     */
    public ISCSIInitiatorQuery(ISCSIInitiatorMO mo,long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置ISCSI启动器对象
     * @param mo ISCSI启动器对象
     */
    public void setQueryISCSIInitiatorMO(ISCSIInitiatorMO mo)
    {
        setConcretQueryMO(mo);
    }
    
    /**
     * 获取ISCSI启动器对象
     * @return 返回结果
     */
    public ISCSIInitiatorMO getISCSIInitiatorMO()
    {
        return getConcretMO();
    }
}
