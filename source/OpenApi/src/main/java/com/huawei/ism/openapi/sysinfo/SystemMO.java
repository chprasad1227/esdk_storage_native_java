package com.huawei.ism.openapi.sysinfo;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.ProductModeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.SysStatusE;
import com.huawei.ism.openapi.common.keydeifines.TLV.SYSTEM;
import com.huawei.ism.openapi.common.keydeifines.TLV.SysStatus;
import com.huawei.ism.openapi.common.keydeifines.TLV.SystemUTCTime;
import com.huawei.ism.openapi.common.model.MO;

/**
 * 系统信息MO
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class SystemMO
{
    private final MO mo;

    private SysStatusE systemStatus = SysStatusE.Unknown;

    private long sysUtcTime = -1;

    /**
     * 系统信息构造函数
     * @param jObject 系统json
     */
    protected SystemMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
    }

    /**
     * 系统信息构造函数
     */
    public SystemMO()
    {
        this.mo = new MO();
    }

    /**
     * 获取Device SN
     * 
     * @return id
     */
    public String getId()
    {
        return mo.getStrProperty(SYSTEM.ID);
    }

    /**
     * 获取系统的位置信息
     * 
     * @return Location
     */
    public String getLocation()
    {
        return mo.getStrProperty(SYSTEM.LOCATION);
    }

    /**
     * 获取设备的名称
     * 
     * @return Name
     */
    public String getName()
    {
        return mo.getStrProperty(SYSTEM.NAME);
    }

    public HealthStatusE getHealthStatus()
    {
        return HealthStatusE.valueOf(mo.getIntProperty(SYSTEM.HEALTHSTATUS));
    }

    /**
     * 获取设备的运行状态
     * 
     * @return RUNNING_STATUS_E 返回结果
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE.valueOf(mo.getIntProperty(SYSTEM.RUNNINGSTATUS));
    }

    /**
     * 获取设备的描述
     * 
     * @return Description
     */
    public String getDescription()
    {
        return mo.getStrProperty(SYSTEM.DESCRIPTION);
    }

    /**
     * 设置设备的描述
     * 
     * @param description 描述
     */
    public void setDescription(String description)
    {
        mo.setProperty(SYSTEM.DESCRIPTION, description);
    }

    /**
     * 获取产品的型号
     * 
     * @return ProductModeE
     */
    public ProductModeE getProductMode()
    {
        return ProductModeE.valueOf(mo.getIntProperty(SYSTEM.PRODUCTMODE));
    }

    /**
     * 获取产品的版本
     * 
     * @return ProductVersion
     */
    public String getProductVersion()
    {
        return mo.getStrProperty(SYSTEM.PRODUCTVERSION);
    }

    /**
     * 获取WWN
     * 
     * @return WWN
     */
    public String getWWN()
    {
        return mo.getStrProperty(SYSTEM.WWN);
    }

    /**
     * 获取系统的状态
     * 
     * @return SysStatusE
     */
    public SysStatusE getSystemStatus()
    {
        return systemStatus;
    }

    /**
     * 获取UTC时间
     * 
     * @return UTC时间
     */
    public Long getCmoSysUtcTime()
    {
        return sysUtcTime;
    }

    /**
     * 获取系统状态
     * @return SysStatusE
     */
    protected SysStatusE ptotectedGetSystemStatus()
    {
        return SysStatusE.valueOf(mo.getIntProperty(SysStatus.STATUS));
    }

    protected void setSystemStatus(SysStatusE sysStatus)
    {
        systemStatus = sysStatus;
    }

    /**
     * 设置系统Utc时间
     * @param systemUtcTime 系统UTC时间
     */
    protected void setCmoSysUtcTime(Long systemUtcTime)
    {
        this.sysUtcTime = systemUtcTime;
    }

    /**
     * 获取系统UTC时间
     * @return UTC时间
     */
    protected Long protectedGetCmoSysUtcTime()
    {
        return mo.getLongProperty(SystemUTCTime.CMO_SYS_UTC_TIME);
    }
}
