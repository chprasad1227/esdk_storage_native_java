package com.huawei.ism.openapi.fcinitiator.system.performance;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.TLV.PerformanceStatisticSwitch;
import com.huawei.ism.openapi.common.model.MO;

/**
 * 性能统计开关 bean
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class PerformanceStatisticSwitchMO
{

    private final MO mo;

    /**
     * 性能统计开关构造函数
     */
    public PerformanceStatisticSwitchMO()
    {
        this.mo = new MO();
    }

    /**
     * <默认构造函数>j
     * 
     * @param mo 方法参数：mo
     */
    public PerformanceStatisticSwitchMO(MO mo)
    {
        this.mo = mo;
    }

    /**
     * 性能统计开关的构造函数
     * @param jObject 性能统计开关的json
     */
    protected PerformanceStatisticSwitchMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
    }

    /**
     * 方法 ： getMO
     * 
     * @return MO 返回结果
     */
    public MO getMO()
    {
        return this.mo;
    }

    public String getCmoPerformanceSwitch()
    {

        return (String) mo
                .getProperty(PerformanceStatisticSwitch.CMO_PERFORMANCE_SWITCH);
    }

    /**
     * 设置新能统计开关的状态
     * @param performanceSwitch 性能统计开关
     */
    public void setCmoPerformanceSwitch(String performanceSwitch)
    {
        mo.setProperty(PerformanceStatisticSwitch.CMO_PERFORMANCE_SWITCH,
                performanceSwitch);
    }

    /**
     * 获取性能统计的开始时间
     * @return String
     */
    public String getCmoPerformanceBeginTime()
    {
        return (String) mo
                .getProperty(PerformanceStatisticSwitch.CMO_PERFORMANCE_BEGIN_TIME);
    }

    /**
     * 设置性能统计的开始时间
     * @param performanceBeginTime 开始时间
     */
    public void setCmoPerformanceBeginTime(String performanceBeginTime)
    {
        mo.setProperty(PerformanceStatisticSwitch.CMO_PERFORMANCE_BEGIN_TIME,
                performanceBeginTime);
    }

    /**
     * 获取性能统计的结束时间
     * @return String
     */
    public String getCmoPerformanceEndTime()
    {
        return (String) mo
                .getProperty(PerformanceStatisticSwitch.CMO_PERFORMANCE_END_TIME);
    }

    /**
     * 设置性能统计的结束时间
     * @param performanceEndTime 结束时间
     */
    public void setCmoPerformanceEndTime(String performanceEndTime)
    {
        mo.setProperty(PerformanceStatisticSwitch.CMO_PERFORMANCE_END_TIME,
                performanceEndTime);
    }

}
