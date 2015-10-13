package com.huawei.ism.openapi.alarm;

import com.huawei.ism.openapi.common.batchquery.QueryBase;
/**
 * 告警查询条件类
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class AlarmQuery extends QueryBase<AlarmInfoMO>
{
    /**
     * 告警查询构造函数
     * @param mo 告警mo bean
     * @param index 告警查询开始下标
     * @param count 告警查询返回个数
     */
    public AlarmQuery(AlarmInfoMO mo, long index, long count)
    {
        super(mo, index, count);
    }
    /**
     * 设置告警查询信息
     * @param mo alarm请求bean
     */
    public void setQueryAlarmMO(AlarmInfoMO mo)
    {
        setConcretQueryMO(mo);
    }
    /**
     * 返回告警信息 
     * @return AlarmInfoMO
     */
    public AlarmInfoMO getAlarmMO()
    {
        return getConcretMO();
    }
}
