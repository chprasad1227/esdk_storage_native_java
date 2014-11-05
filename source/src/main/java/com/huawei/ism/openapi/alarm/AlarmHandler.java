package com.huawei.ism.openapi.alarm;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 告警对外开发的接口
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public interface AlarmHandler
{
    /**
     * 获取SVP历史告警迭代器
     * @param alarmQuery 告警的查询条件
     * @return AlarmIterator
     */
    AlarmIterator getSVPHistoryAlarmBatch(AlarmQuery alarmQuery);

    /**
     * 获取SVP当前告警迭代器
     * @param alarmQuery 告警的查询条件
     * @return AlarmIterator
     */
    AlarmIterator getSVPActiveAlarmBatch(AlarmQuery alarmQuery);

    /**
     * 获取当前告警迭代器
     * @param alarmQuery 告警的查询条件
     * @return AlarmIterator
     */
    AlarmIterator getActiveAlarmBatch(AlarmQuery alarmQuery);

    /**
     * 获取历史告警迭代器
     * @param alarmQuery 告警的查询条件
     * @return AlarmIterator
     */
    AlarmIterator getHistoryAlarmBatch(AlarmQuery alarmQuery);

    /**
     * 清除告警
     * @param alarmSeriesNo 告警的流水号
     * @throws ApiException API自定义异常
     */
    void clearAlarm(Long alarmSeriesNo) throws ApiException;

}
