package com.huawei.ism.openapi.fclink;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.ArrayTypeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.TLV.FCLink;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

public class FCLinkMO
{
    private final MO mo;

    /**
     * FCLinkMO
     * @param jObject JSONObject
     */
    public FCLinkMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
        mo.setProperty(FCLink.TYPE, MOType.FC_LINK.getValue());
    }

    /**
     * FCLinkMO
     */
    public FCLinkMO()
    {
        this.mo = new MO();
        mo.setProperty(FCLink.TYPE, MOType.FC_LINK.getValue());
    }

    /**
     * 方法 ： getID
     * @return String 返回结果
     */
    public String getId()
    {
        return mo.getStrProperty(FCLink.ID);
    }

    /**
     * 方法 ： setID
     * @return String 返回结果
     */
    public void setId(String id)
    {
        mo.setProperty(FCLink.ID, id);
    }

    /**
     * 方法 ： getHealthStatus
     * @return HEALTH_STATUS_E 返回结果
     */
    public HealthStatusE getHealthStatus()
    {
        return HealthStatusE.valueOf(mo.getIntProperty(FCLink.HEALTHSTATUS));
    }

    /**
     * 方法 ： setHealthStatus
     * @param healthStatusE 健康状态
     */
    public void setHealthStatus(HealthStatusE healthStatusE)
    {
        mo.setProperty(FCLink.HEALTHSTATUS, Integer.parseInt(String.valueOf(healthStatusE.getValue())));
    }

    /**
     * 方法 ： getRunningStatus
     * @return RUNNING_STATUS_E 返回结果
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE.valueOf(mo.getIntProperty(FCLink.RUNNINGSTATUS));
    }

    /**
     * 方法 ： setRunningStatus
     * @param runningStatusE 运行状态
     */
    public void setRunningStatus(RunningStatusE runningStatusE)
    {
        mo.setProperty(FCLink.RUNNINGSTATUS, Integer.parseInt(String.valueOf(runningStatusE.getValue())));
    }

    /**
     * 方法 ： getDeviceId
     * @return String 返回结果
     */
    public String getDeviceId()
    {
        return mo.getStrProperty(FCLink.DEVICEID);
    }

    /**
     * 方法 ： setDeviceID
     * @param deviceID 设备ID
     */
    public void setDeviceID(String deviceID)
    {
        mo.setProperty(FCLink.DEVICEID, deviceID);
    }

    /**
     * 方法 ： getLocalControlId
     * @return String 返回结果
     */
    public String getLocalControlId()
    {
        return mo.getStrProperty(FCLink.LOCALCONTROLID);
    }

    /**
     * 方法 ： getLocalPortId
     * @return String 返回结果
     */
    public String getLocalPortId()
    {
        return mo.getStrProperty(FCLink.LOCALPORTID);
    }

    /**
     * 方法 ： getRemoteControlId
     * @return String 返回结果
     */
    public String getRemoteControlId()
    {
        return mo.getStrProperty(FCLink.REMOTECONTROLID);
    }

    /**
     * 方法 ： getRemotePortId
     * @return String 返回结果
     */
    public String getRemotePortId()
    {
        return mo.getStrProperty(FCLink.REMOTEPORTID);
    }

    /**
     * 方法 ： getFCLinkLocalPortWWPN
     * @return String 返回结果
     */
    public String getFCLinkLocalPortWWPN()
    {
        return mo.getStrProperty(FCLink.FCLINKLOCALPORTWWPN);
    }

    /**
     * 方法 ： getFCLinkRemotePortWWPN
     * @return String 返回结果
     */
    public String getFCLinkRemotePortWWPN()
    {
        return mo.getStrProperty(FCLink.FCLINKREMOTEPORTWWPN);
    }

    /**
     * 方法 ： getLinkUsage
     * @return Boolean 返回结果
     */
    public Boolean getLinkUsage()
    {
        return mo.getBoolProperty(FCLink.LINKUSAGE);
    }

    /**
     * 方法 ： setLinkUsage
     * @param linkUsage 标识是否是已添加的链路
     */
    public void setLinkUsage(Boolean linkUsage)
    {
        mo.setProperty(FCLink.LINKUSAGE, linkUsage);
    }

    /**
     * 方法 ： getBandwidthLimitSwitch
     * @return Integer 返回结果
     */
    public Integer getBandwidthLimitSwitch()
    {
        return mo.getIntProperty(FCLink.BANDWIDTHLIMITSWITCH);
    }

    /**
     * 方法 ： setBandwidthLimitSwitch
     * @param bandwidthLimitSwitch 是否开带宽限制
     */
    public void setBandwidthLimitSwitch(Integer bandwidthLimitSwitch)
    {
        mo.setProperty(FCLink.BANDWIDTHLIMITSWITCH, bandwidthLimitSwitch);
    }

    /**
     * 方法 ： getBandwidthLimitSize
     * @return Long 返回结果
     */
    public Long getBandwidthLimitSize()
    {
        return mo.getLongProperty(FCLink.BANDWIDTHLIMITSIZE);
    }

    /**
     * 方法 ： setBandwidthLimitSize
     * @param bandwidthLimitSize 限制带宽大小
     */
    public void setBandwidthLimitSize(Long bandwidthLimitSize)
    {
        mo.setProperty(FCLink.BANDWIDTHLIMITSIZE, bandwidthLimitSize);
    }

    /**
     * 方法 ： getBandwidthLimitUnit
     * @return Integer 返回结果
     */
    public Integer getBandwidthLimitUnit()
    {
        return mo.getIntProperty(FCLink.BANDWIDTHLIMITUNIT);
    }

    /**
     * 方法 ： setBandwidthLimitUnit
     * @param bandwidthLimitUnit 限制带宽单位
     */
    public void setBandwidthLimitUnit(Integer bandwidthLimitUnit)
    {
        mo.setProperty(FCLink.BANDWIDTHLIMITUNIT, bandwidthLimitUnit);
    }

    /**
     * 方法 ： getBandwidthLimitUtilization
     * @return Integer 返回结果
     */
    public Integer getBandwidthLimitUtilization()
    {
        return mo.getIntProperty(FCLink.BANDWIDTHLIMITUTILIZATION);
    }

    /**
     * 方法 ： setBandwidthLimitUtilization
     * @param bandwidthLimitUtilization 带宽利用率
     */
    public void setBandwidthLimitUtilization(Integer bandwidthLimitUtilization)
    {
        mo.setProperty(FCLink.BANDWIDTHLIMITUTILIZATION, bandwidthLimitUtilization);
    }

    /**
     * 方法 ： getArrayType
     * @return ArrayTypeE 返回结果
     */
    public ArrayTypeE getArrayType()
    {
        return ArrayTypeE.valueOf(mo.getIntProperty(FCLink.ARRAYTYPE));
    }

    /**
     * 方法 ： setArrayType
     * @param arrayType 远端阵列类型
     */
    public void setArrayType(ArrayTypeE arrayType)
    {
        mo.setProperty(FCLink.ARRAYTYPE, Integer.parseInt(String.valueOf(arrayType.getValue())));
    }

    /**
     * 方法 ： getDeviceName
     * @return String 返回结果
     */
    public String getDeviceName()
    {
        return mo.getStrProperty(FCLink.DEVICENAME);
    }

    /**
     * 方法 ： getDeviceWWN
     * @return String 返回结果
     */
    public String getDeviceWWN()
    {
        return mo.getStrProperty(FCLink.DEVICEWWN);
    }

    // /**
    // * 方法 ： getRemoteUserName
    // * @return String 返回结果
    // */
    // public String getRemoteUserName()
    // {
    // return mo.getStrProperty(FCLink.REMOTEUSERNAME);
    // }
    //
    // /**
    // * 方法 ： getRemotePassword
    // * @return String 返回结果
    // */
    // public String getRemotePassword()
    // {
    // return mo.getStrProperty(FCLink.REMOTEPASSWORD);
    // }
    //
    // /**
    // * 方法 ： getRemoteLoginType
    // * @return String 返回结果
    // */
    // public String getRemoteLoginType()
    // {
    // return mo.getStrProperty(FCLink.REMOTELOGINTYPE);
    // }
    //
    // /**
    // * 方法 ： getRemoteSN
    // * @return String 返回结果
    // */
    // public String getRemoteSN()
    // {
    // return mo.getStrProperty(FCLink.REMOTESN);
    // }
    //
    // /**
    // * 方法 ： getDeviceModel
    // * @return String 返回结果
    // */
    // public String getDeviceModel()
    // {
    // return mo.getStrProperty(FCLink.DEVICEMODEL);
    // }
    //
    // /**
    // * 方法 ： getVendor
    // * @return String 返回结果
    // */
    // public String getVendor()
    // {
    // return mo.getStrProperty(FCLink.VENDOR);
    // }
    //
    // /**
    // * 方法 ： getLunNum
    // * @return String 返回结果
    // */
    // public String getLunNum()
    // {
    // return mo.getStrProperty(FCLink.LUNNUM);
    // }

    /**
     * 方法 ： getMO
     * @return MO 返回结果
     */
    protected MO getMO()
    {
        return this.mo;
    }

    /**
     * 方法 ： getCount
     * @return long 返回结果
     */
    protected long getCount()
    {
        return mo.getLongProperty(FCLink.COUNT);
    }
}
