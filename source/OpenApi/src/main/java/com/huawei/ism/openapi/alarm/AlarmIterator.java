package com.huawei.ism.openapi.alarm;

import java.util.List;
import java.util.Map;
import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 告警批量返回迭代器
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class AlarmIterator extends ApiIterator<AlarmInfoMO, AlarmQuery>
{
    private final String alarmBatch;

    /**
     * 告警迭代器构造函数
     * @param restRequestHandler 请求handler
     * @param deviceID 网元id
     * @param queryCondition 请求条件
     * @param isHistoryBatch 是否为历史batch
     */
    public AlarmIterator(RestRequestHandler restRequestHandler, String deviceID, AlarmQuery queryCondition,
        String alarmBatch, boolean isAssociate)
    {
        super(restRequestHandler, deviceID, queryCondition, isAssociate);
        this.alarmBatch = alarmBatch;
    }

    /**
     * 获取对应MO的数量
     * @return long
     * @throws ApiException API异常
     */
    protected long getConcretCount() throws ApiException
    {
        String relativePath = null;
        if ("active".equals(alarmBatch))
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "alarm",
                "currentalarm", "count");
        }
        else if ("history".equals(alarmBatch))
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "alarm",
                "historyAlarm", "count");
        }
        else if ("SVPhistory".equals(alarmBatch))
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri("SVP", "alarm", "historyAlarm",
                "count");
        }
        else
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri("SVP", "alarm", "currentalarm",
                "count");
        }
        return getAlarmCount(relativePath);
    }

    /**
     * 获取具体MO批量查询的结果
     * @return List<AlarmInfoMO>
     * @throws ApiException API自定义异常
     */
    protected List<AlarmInfoMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = null;
        if ("active".equals(alarmBatch))
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "alarm",
                "currentalarm");
        }
        else if ("history".equals(alarmBatch))
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "alarm",
                "historyAlarm");
        }
        else if ("SVPhistory".equals(alarmBatch))
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri("SVP", "alarm", "historyAlarm");
        }
        else
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri("SVP", "alarm", "currentalarm");
        }
        return getAlarm(relativePath);
    }

    private long getAlarmCount(String relativePath) throws ApiException
    {
        Map<String, String> headParamMap = composeRequestHeader(false);
        RestManager<AlarmInfoMO> restManager = new RestManager<AlarmInfoMO>(AlarmInfoMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        AlarmInfoMO alarmInfoMO = restManager.getGetRequestMO();
        return alarmInfoMO.getCount();
    }

    private List<AlarmInfoMO> getAlarm(String relativePath) throws ApiException
    {
        Map<String, String> headParamMap = composeRequestHeader(true);
        RestManager<AlarmInfoMO> restManager = new RestManager<AlarmInfoMO>(AlarmInfoMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        List<AlarmInfoMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取告警属性Map
     * @param modelMo 告警数据对象
     * @return 告警属性Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(AlarmInfoMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
    }

    /**
     * 获取告警批量查询的条件数组
     * @return 告警批量查询的条件数组
     */
    @Override
    protected String[] getConcretFilterHeaders()
    {
        return new String[0];
    }

    @Override
    protected String[] getFuzzyFilterHeaders()
    {
        return new String[0];
    }

}
