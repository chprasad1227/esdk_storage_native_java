package com.huawei.ism.openapi.fcport;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.FCPortModeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.IniOrTgtE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.PortLogicTypeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.TLV.FCPort;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * FC端口的MO
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class FCPortMO
{
    private final MO mo;

    /**
     * FCPortMO
     * @param jObject JSONObject
     */
    public FCPortMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
        mo.setProperty(FCPort.TYPE, MOType.FC_PORT.getValue());
    }

    /**
     * FCPortMO
     */
    public FCPortMO()
    {
        this.mo = new MO();
        mo.setProperty(FCPort.TYPE, MOType.FC_PORT.getValue());
    }

    /**
     * 方法 ： getID
     * 
     * @return String 返回结果
     */
    public String getId()
    {
        return mo.getStrProperty(FCPort.ID);
    }

    /**
     * 方法 ： 对id进行赋值
     * 
     * @param id ID
     */
    public void setId(String id)
    {
        mo.setProperty(FCPort.ID, id);
    }

    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(FCPort.NAME);
    }

    /**
     * 方法 ： getLocation
     * 
     * @return String 返回结果
     */
    public String getLocation()
    {
        return mo.getStrProperty(FCPort.LOCATION);
    }

    /**
     * 方法 ： getHealthStatus
     * 
     * @return HEALTH_STATUS_E 返回结果
     */
    public HealthStatusE getHealthStatus()
    {
        return HealthStatusE.valueOf(mo.getIntProperty(FCPort.HEALTHSTATUS));
    }

    /**
     * 方法 ： getRunningStatus
     * 
     * @return RUNNING_STATUS_E 返回结果
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE.valueOf(mo.getIntProperty(FCPort.RUNNINGSTATUS));
    }

    /**
     * 方法 ： getLogicType
     * 
     * @return PORT_LOGIC_TYPE_E 返回结果
     */
    public PortLogicTypeE getLogicType()
    {
        return PortLogicTypeE.valueOf(Integer.parseInt(mo.getProperty(FCPort.LOGICTYPE).toString()));
    }

    /**
     * 当为混合端口时，设置端口类型
     * @param logicType 端口类型
     */
    public void setLogicType(PortLogicTypeE logicType)
    {
        mo.setProperty(FCPort.LOGICTYPE, logicType.getValue());
    }

    /**
     * 方法 ： getRunSpeed
     * 
     * @return Integer 返回结果
     */
    public Integer getRunSpeed()
    {
        return mo.getIntProperty(FCPort.RUNSPEED);
    }

    /**
     * 方法 ： getConfSpeed
     * 
     * @return Integer 返回结果
     */
    public Integer getConfSpeed()
    {
        return mo.getIntProperty(FCPort.CONFSPEED);
    }

    /**
     * 方法 ： getWWN
     * 
     * @return String 返回结果
     */
    public String getWWN()
    {
        return mo.getStrProperty(FCPort.WWN);
    }

    /**
     * 方法 ： getIniOrTgt 启动器/目标器
     * 
     * @return IniOrTgtE 返回结果
     */
    public IniOrTgtE getIniOrTgt()
    {
        return IniOrTgtE.valueOf(Integer.parseInt(mo.getProperty(FCPort.INIORTGT).toString()));
    }

    /**
     * 方法 ： getFCRunMode
     * 
     * @return FCPortModeE 返回结果
     */
    public FCPortModeE getFCRunMode()
    {
        return FCPortModeE.valueOf(mo.getIntProperty(FCPort.FCRUNMODE));
    }

    /**
     * 方法 ：getLostSignals 误码统计信息
     * 
     * @return Integer 返回结果
     */
    public Integer getLostSignals()
    {
        return mo.getIntProperty(FCPort.LOSTSIGNALS);
    }

    /**
     * 方法 ：getBadCharNumber
     * 
     * @return Integer 返回结果
     */
    public Integer getBadCharNumber()
    {
        return mo.getIntProperty(FCPort.BADCHARNUMBER);
    }

    /**
     * 方法 ：getLostSync
     * 
     * @return Integer 返回结果
     */
    public Integer getLostSync()
    {
        return mo.getIntProperty(FCPort.LOSTSYNC);
    }

    /**
     * 方法 ：getLinkFail
     * 
     * @return Integer 返回结果
     */
    public Integer getLinkFail()
    {
        return mo.getIntProperty(FCPort.LINKFAIL);
    }

    /**
     * 方法 ：getStartTime
     * 
     * @return Integer 返回结果
     */
    public Integer getStartTime()
    {
        return mo.getIntProperty(FCPort.STARTTIME);
    }

    /**
     * 方法 ：getFloginDelayTimes
     * 
     * @return Integer 返回结果
     */
    public Integer getFloginDelayTimes()
    {
        return mo.getIntProperty(FCPort.FLOGINDELAYTIMES);
    }

    /**
     * 方法 ：getMaxSupportSpeed
     * 
     * @return Integer 返回结果
     */
    public Integer getMaxSupportSpeed()
    {
        return mo.getIntProperty(FCPort.MAXSUPPORTSPEED);
    }

    /**
     * 方法 ：setConfSpeed
     * 
     * @param confSpeed CONFSPEED
     */
    public void setConfSpeed(Integer confSpeed)
    {
        mo.setProperty(FCPort.CONFSPEED, confSpeed);
    }

    /**
     * 方法 ：setIniOrTgt
     * 
     * @param iniOrTgt INIORTGT
     */
    public void setIniOrTgt(IniOrTgtE iniOrTgt)
    {
        mo.setProperty(FCPort.INIORTGT, Integer.parseInt(String.valueOf(iniOrTgt.getValue())));
    }

    /**
     * 方法 ：setFloginDelayTimes
     * 
     * @param floginDelayTimes FLOGINDELAYTIMES
     */
    public void setFloginDelayTimes(Integer floginDelayTimes)
    {
        mo.setProperty(FCPort.FLOGINDELAYTIMES, floginDelayTimes);
    }

    /**
     * 方法 ： getMO
     * 
     * @return MO 返回结果
     */
    protected MO getMO()
    {
        return this.mo;
    }

    /**
     * 方法 ： getCount
     * 
     * @return long 返回结果
     */
    protected long getCount()
    {
        return mo.getLongProperty(FCPort.COUNT);
    }
}
