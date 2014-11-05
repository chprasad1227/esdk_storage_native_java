package com.huawei.ism.openapi.alarm;

import java.util.HashMap;
import java.util.Map;
import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.CMOAlarmInfoE;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 告警对外开放接口类的实现类
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class AlarmHandlerImp extends DefaultCommHandler implements AlarmHandler
{
    private AlarmIterator alarmIterator = null;

    /**
     * 告警实现类
     * @param restRequestHandler rest请求
     * @param deviceID 网元id
     */
    protected AlarmHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 清除告警
     * @param alarmSeriesNo 告警的流水号
     * @throws ApiException API自定义异常
     */
    public void clearAlarm(Long alarmSeriesNo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "alarm",
            "currentalarm");
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(CMOAlarmInfoE.CMO_ALARM_SEQUENCE, String.valueOf(alarmSeriesNo));

        RestManager<AlarmInfoMO> restManager = new RestManager<AlarmInfoMO>(AlarmInfoMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 获取SVP历史告警迭代器
     * @param alarmQuery 告警的查询条件
     * @return AlarmIterator
     */
    public AlarmIterator getSVPHistoryAlarmBatch(AlarmQuery alarmQuery)
    {
        alarmIterator = new AlarmIterator(getRestRequestHandler(), getDeviceId(), alarmQuery, "SVPhistory", false);
        return alarmIterator;
    }

    /**
     * 获取SVP当前告警迭代器
     * @param alarmQuery 告警的查询条件
     * @return AlarmIterator
     */
    public AlarmIterator getSVPActiveAlarmBatch(AlarmQuery alarmQuery)
    {
        alarmIterator = new AlarmIterator(getRestRequestHandler(), getDeviceId(), alarmQuery, "SVPactive", false);
        return alarmIterator;
    }

    /**
     * 获取当前告警迭代器
     * @param alarmQuery 告警的查询条件
     * @return AlarmIterator
     */
    public AlarmIterator getActiveAlarmBatch(AlarmQuery alarmQuery)
    {
        alarmIterator = new AlarmIterator(getRestRequestHandler(), getDeviceId(), alarmQuery, "active", false);
        return alarmIterator;
    }

    /**
     * 获取历史告警迭代器
     * @param alarmQuery 告警的查询条件
     * @return AlarmIterator
     */
    public AlarmIterator getHistoryAlarmBatch(AlarmQuery alarmQuery)
    {
        alarmIterator = new AlarmIterator(getRestRequestHandler(), getDeviceId(), alarmQuery, "history", false);
        return alarmIterator;
    }
}
