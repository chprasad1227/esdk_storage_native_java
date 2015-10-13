package com.huawei.ism.openapi.hardware.controller;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.TLV.CONTROLLER;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * 控制器MO
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class ControllerMO
{

    private final MO mo;

    /**
     * 控制器构造函数
     */
    public ControllerMO()
    {
        this.mo = new MO();
    }

    /**
     * 控制器构造函数
     * 
     * @param mo 方法参数：mo
     */
    public ControllerMO(MO mo)
    {
        this.mo = mo;
    }

    /**
     * 控制器构造函数
     * @param jObject 控制器json
     */
    protected ControllerMO(JSONObject jObject)
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

    /**
     * 获取控制器类型
     * @return MOType
     */
    public MOType getType()
    {
        return MOType.getType(Integer.parseInt(mo.getProperty(CONTROLLER.TYPE)
            .toString()));
    }
    
    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(CONTROLLER.NAME);
    }

    /**
     * 设置控制器name
     * @param name 控制器name
     */
    public void setName(String name)
    {
        mo.setProperty(CONTROLLER.NAME, name);
    }

    /**
     * 方法 ： getId
     * 
     * @return String 返回结果
     */
    public String getId()
    {
        return mo.getStrProperty(CONTROLLER.ID);
    }

    /**
     * 设置控制器id
     * @param id 控制器id
     */
    public void setId(String id)
    {
        mo.setProperty(CONTROLLER.ID, id);
    }

    /**
     * 方法 ： getLocation
     * 
     * @return Location
     */
    public String getLocation()
    {
        return mo.getStrProperty(CONTROLLER.LOCATION);
    }

    /**
     * 方法 ： getHealthStatus
     * 
     * @return HealthStatus
     */
    public HealthStatusE getHealthStatus()
    {
        return HealthStatusE
            .valueOf(mo.getIntProperty(CONTROLLER.HEALTHSTATUS));
    }

    /**
     * 方法 ： getRunningStatus
     * 
     * @return RunningStatus
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE.valueOf(mo
            .getIntProperty(CONTROLLER.RUNNINGSTATUS));
    }

    /**
     * 方法 ： getDescription
     * 
     * @return Description
     */
    public String getDescription()
    {
        return mo.getStrProperty(CONTROLLER.DESCRIPTION);
    }

    /**
     * 方法 ： getSoftVer
     * 
     * @return SoftVer
     */
    public String getSoftVer()
    {
        return mo.getStrProperty(CONTROLLER.SOFTVER);
    }

    /**
     * 方法 ： getTemperature
     * 
     * @return Temperature
     */
    public Long getTemperature()
    {
        return mo.getLongProperty(CONTROLLER.TEMPERATURE);
    }

    /**
     * 方法 ： getMemorySize
     * 
     * @return MemorySize
     */
    public Long getMemorySize()
    {
        return mo.getLongProperty(CONTROLLER.MEMORYSIZE);
    }

    /**
     * 方法 ： getCpuInfo
     * 
     * @return CpuInfo
     */
    public String getCpuInfo()
    {
        return mo.getStrProperty(CONTROLLER.CPUINFO);
    }

    /**
     * 获取角色id
     * @return Role
     */
    public String getRole()
    {
        return mo.getStrProperty(CONTROLLER.ROLE);
    }

    /**
     * 获取cpu占用率
     * @return CpuUsage
     */
    public String getCpuUsage()
    {
        return mo.getStrProperty(CONTROLLER.CPUUSAGE);
    }

    /**
     * 获取内存占用率
     * @return MemoryUsage
     */
    public String getMemoryUsage()
    {
        return mo.getStrProperty(CONTROLLER.MEMORYUSAGE);
    }

    /**
     * 获取电压值
     * @return Voltage
     */
    public String getVoltage()
    {
        return mo.getStrProperty(CONTROLLER.VOLTAGE);
    }

}
