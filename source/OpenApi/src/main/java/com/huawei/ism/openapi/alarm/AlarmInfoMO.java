package com.huawei.ism.openapi.alarm;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.EventLevelE;
import com.huawei.ism.openapi.common.keydeifines.TLV.CMOAlarmInfoE;
import com.huawei.ism.openapi.common.model.MO;

/**
 * 告警信息bean
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class AlarmInfoMO
{
    private final MO mo;

    /**
     * 告警信息构造函数
     */
    public AlarmInfoMO()
    {
        this.mo = new MO();
    }

    /**
     * 告警信息的构造函数
     * @param jObject 告警信息json
     */
    public AlarmInfoMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
    }

    /**
     * 获取告警类型
     * @return Type
     */
    public Integer getType()
    {
        return mo.getIntProperty(CMOAlarmInfoE.CMO_ALARM_TYPE);
    }

    /**
     * 获取告警id
     * @return id
     */
    public Long getId()
    {
        return mo.getLongProperty(CMOAlarmInfoE.CMO_ALARM_ID);
    }

    /**
     * 告警级别
     * @return EventLevelE
     */
    public EventLevelE getLevel()
    {
        return EventLevelE.valueOf(mo.getIntProperty(CMOAlarmInfoE.CMO_ALARM_LEVEL));
    }

    /**
     * 获取告警的流水号
     * @return Sequence
     */
    public Long getSequence()
    {
        return mo.getLongProperty(CMOAlarmInfoE.CMO_ALARM_SEQUENCE);
    }

    /**
     * 告警的开始时间
     * @return StartTime
     */
    public Long getStartTime()
    {
        return mo.getLongProperty(CMOAlarmInfoE.CMO_ALARM_STARTTIME);
    }

    /**
     * 告警清除的时间
     * @return ClearTime
     */
    public Long getClearTime()
    {
        return mo.getLongProperty(CMOAlarmInfoE.CMO_ALARM_CLEAR_TIME);
    }

    /**
     * 告警确认时间
     * @return ConfirmTime
     */
    public Long getConfirmTime()
    {
        return mo.getLongProperty(CMOAlarmInfoE.CMO_ALARM_CONFIRMTIME);
    }

    /**
     * 告警解决时间
     * @return RecoverTime
     */
    public Long getRecoverTime()
    {
        return mo.getLongProperty(CMOAlarmInfoE.CMO_ALARM_RECOVERY_TIME);
    }

    /**
     * 事件参数
     * @return EventParam
     */
    public String getEventParam()
    {
        return mo.getStrProperty(CMOAlarmInfoE.CMO_ALARM_PARMETER);
    }

    /**
     * 告警描述
     * @return Description
     */
    public String getDescription()
    {
        return mo.getStrProperty(CMOAlarmInfoE.CMO_ALARM_DESCRIPTION);
    }

    /**
     * 告警修复建议
     * @return Suggestion
     */
    public String getSuggestion()
    {
        return mo.getStrProperty(CMOAlarmInfoE.CMO_ALARM_SUGGESTION);
    }

    /**
     * 告警详细信息
     * @return Detail
     */
    public String getDetail()
    {
        return mo.getStrProperty(CMOAlarmInfoE.CMO_ALARM_DETAIL);
    }

    /**
     * 告警名称
     * @return Name
     */
    public String getName()
    {
        return mo.getStrProperty(CMOAlarmInfoE.CMO_ALARM_NAME);
    }

    protected long getCount()
    {
        return mo.getLongProperty(CMOAlarmInfoE.CMO_ALARM_COUNT);
    }

    protected MO getMO()
    {
        return this.mo;
    }

}
