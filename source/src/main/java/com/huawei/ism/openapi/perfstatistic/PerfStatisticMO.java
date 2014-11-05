package com.huawei.ism.openapi.perfstatistic;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.StatisticDataId;
import com.huawei.ism.openapi.common.keydeifines.TLV.PerformanceStatistic;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;
/**
 * 性能统计bean
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class PerfStatisticMO
{
    private final MO mo;
    
    private String uuId;
    
    /** 监控对象的类型**/
    private MOType moType;
    
    /**监控对象的ID**/
    private String id;
    
    /**
     * 性能统计构造函数
     */
    public PerfStatisticMO()
    {
        this.mo = new MO();
    }
    /**
     * 性能统计bean
     * @param jObject 性能统计的json
     */
    public PerfStatisticMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
    }
    
    /**
     * 设置监控对象的类型
     * 
     * @param type 监控对象类型
     */
    public void setListenObjectType(MOType type)
    {
        moType = type;
    }
    
    /**
     * 设置监控对象的id
     * 
     * @param objectId 监控对象的id
     */
    public void setListenObjectId(String objectId)
    {
        this.id = objectId;
    }
    
    /**
     * 设置统计数据ID
     * 
     * @param dataId 统计数据id
     */
    public void setDataId(StatisticDataId dataId)
    {
        mo.setProperty(PerformanceStatistic.CMO_STATISTIC_DATA_ID, dataId.getValue());
    }
    
    /**
     * 获取统计数据ID
     * 
     * @return 统计数据ID
     */
    public Long getDataId()
    {
        return mo.getLongProperty(PerformanceStatistic.CMO_STATISTIC_DATA_ID);
    }
    
    /**
     * 设置性能统计粒度
     * 
     * @param span 性能统计粒度
     */
    public void setPerfSpan(Long span)
    {
        mo.setProperty(PerformanceStatistic.CMO_STATISTIC_TIME_SPAN, span);
    }
    
    /**
     * 获取性能值
     * 
     * @return 性能值
     */
    public Long getPerfData()
    {
        return mo.getLongProperty(PerformanceStatistic.CMO_STATISTIC_DATA);
    }
    
    /**
     * 获取时间戳
     * 
     * @return 时间戳
     */
    public Long getTimeStamp()
    {
        return mo.getLongProperty(PerformanceStatistic.CMO_STATISTIC_TIMESTAMP);
    }
    
   /**
    * 设置启动开关直接查询性能数据
    * @param isSkipSwitch 启动开关
    */
    public void setSkipSwitch(Boolean isSkipSwitch)
    {
        mo.setProperty(PerformanceStatistic.CMO_STATISTIC_SKIP_SWITCH, isSkipSwitch);
    }
    /**
     * 获取UUID
     * @return uuid
     */
    protected String getUuId()
    {
        if (moType != null && id != null)
        {
            uuId = String.format("%d:%s", moType.getValue(), id);
        }
        return uuId;
    }
    
    protected MO getMO()
    {
        return this.mo;
    }
}
