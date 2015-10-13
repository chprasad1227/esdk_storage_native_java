package com.huawei.ism.openapi.fcinitiator.system.systime;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.TLV.SystemTimezone;
import com.huawei.ism.openapi.common.model.MO;
/**
 * 系统时间
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class SystemTimeMO
{

    private final MO mo;

    /**
     * <默认构造函数>j
     * 
     * @param mo 方法参数：mo
     */
    public SystemTimeMO(MO mo)
    {
        this.mo = mo;
    }

    /**
     * 系统时间构造函数
     */
    public SystemTimeMO()
    {
        this.mo = new MO();
    }

    /**
     * 系统时间的构造函数
     * @param jObject 系统时间json
     */
    protected SystemTimeMO(JSONObject jObject)
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
     * 获取系统时间时区名称显示风格
     * @return CmoSysTimeZonNameStyle
     */
    public String getCmoSysTimeZonNameStyle()
    {
        return mo.getStrProperty(SystemTimezone.CMO_SYS_TIME_ZONE_NAME_STYLE);
    }

    /**
     * 获取系统时间时区名称
     * @return CmoSysTimeZoneName
     */
    public String getCmoSysTimeZoneName()
    {
        return mo.getStrProperty(SystemTimezone.CMO_SYS_TIME_ZONE_NAME);
    }

    /**
     * 获取系统时间时区
     * @return CmoSysTimeZone
     */
    public String getCmoSysTimeZone()
    {
        return mo.getStrProperty(SystemTimezone.CMO_SYS_TIME_ZONE);
    }

    /**
     * 此时区是否使用了夏令时
     * @return CmoSysTimeZoneUseDst
     */
    public String getCmoSysTimeZoneUseDst()
    {
        return mo.getStrProperty(SystemTimezone.CMO_SYS_TIME_ZONE_USE_DST);
    }

}
