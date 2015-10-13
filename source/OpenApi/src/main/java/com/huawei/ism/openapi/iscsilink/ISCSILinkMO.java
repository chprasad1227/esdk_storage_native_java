package com.huawei.ism.openapi.iscsilink;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.ArrayTypeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.TLV.ISCSILink;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

public class ISCSILinkMO
{

    private final MO mo;

    /**
     * 初始化方法
     * @param jObject json对象
     */
    protected ISCSILinkMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
        mo.setProperty(ISCSILink.TYPE, MOType.ISCSI_LINK.getValue());
    }

    /**
     * 初始化方法
     */
    public ISCSILinkMO()
    {
        this.mo = new MO();
        mo.setProperty(ISCSILink.TYPE, MOType.ISCSI_LINK.getValue());
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
     * @return long 返回结果
     */
    protected long getCount()
    {
        return mo.getLongProperty(ISCSILink.COUNT);
    }

    public void setAssociateOBJType(MOType moType)
    {
        mo.setProperty(ISCSILink.ASSOCIATEOBJTYPE, String.valueOf(moType.getValue()));
    }

    /**
     * 获取关联对象类型
     * @return 返回结果
     */
    public MOType getAssociateOBJType()
    {
        return MOType.valueOf(mo.getStrProperty(ISCSILink.ASSOCIATEOBJTYPE));
    }

    /**
     * 设置关联对象ID
     * @param id 关联对象ID
     */
    public void setAssociateOBJId(String id)
    {
        mo.setProperty(ISCSILink.ASSOCIATEOBJID, id);
    }

    /**
     * 获取关联对象ID
     * @return 返回结果
     */
    public String getAssociateOBJId()
    {
        return mo.getStrProperty(ISCSILink.ASSOCIATEOBJID);
    }

    /**
     * 方法 ： getId
     * 
     * @return String 返回结果
     */
    public String getId()
    {
        return mo.getStrProperty(ISCSILink.ID);
    }

    /**
     * 对id进行赋值
     * @param id 方法参数：id
     */
    public void setId(String id)
    {
        mo.setProperty(ISCSILink.ID, id);
    }

    /**
     * 获取控制器健康状态
     * @return 返回结果
     */
    public HealthStatusE getHealthStatus()
    {
        return HealthStatusE.valueOf(mo.getIntProperty(ISCSILink.HEALTHSTATUS));
    }

    /**
     * 方法 ： setHealthStatus
     * @param healthStatusE 健康状态
     */
    public void setHealthStatus(HealthStatusE healthStatusE)
    {
        mo.setProperty(ISCSILink.HEALTHSTATUS, Integer.parseInt(String.valueOf(healthStatusE.getValue())));
    }

    /**
     * 获取控制器运行状态
     * @return 返回结果
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE.valueOf(mo.getIntProperty(ISCSILink.RUNNINGSTATUS));
    }

    /**
     * 方法 ： setRunningStatus
     * @param runningStatusE 运行状态
     */
    public void setRunningStatus(RunningStatusE runningStatusE)
    {
        mo.setProperty(ISCSILink.RUNNINGSTATUS, Integer.parseInt(String.valueOf(runningStatusE.getValue())));
    }

    /**
     * 方法 ： setDeviceID
     * @param deviceID 设备ID
     */
    public void setDeviceID(String deviceID)
    {
        mo.setProperty(ISCSILink.DEVICEID, deviceID);
    }

    /**
     * 方法 ： getDeviceID
     * @return String 返回结果
     */
    public String getDeviceId()
    {
        return mo.getStrProperty(ISCSILink.DEVICEID);
    }

    /**
     * 方法 ： getLocalControlId
     * @return String 返回结果
     */
    public String getLocalControlId()
    {
        return mo.getStrProperty(ISCSILink.LOCALCONTROLID);
    }

    /**
     * 方法 ： getLocalPortId
     * @return String 返回结果
     */
    public String getLocalPortId()
    {
        return mo.getStrProperty(ISCSILink.LOCALPORTID);
    }

    /**
     * 方法 ： getRemoteControlId
     * @return String 返回结果
     */
    public String getRemoteControlId()
    {
        return mo.getStrProperty(ISCSILink.REMOTECONTROLID);
    }

    /**
     * 方法 ： getRemotePortId
     * @return String 返回结果
     */
    public String getRemotePortId()
    {
        return mo.getStrProperty(ISCSILink.REMOTEPORTID);
    }

    /**
     * 方法 ： getLinkUsage
     * @return Boolean 返回结果
     */
    public Boolean getLinkUsage()
    {
        return mo.getBoolProperty(ISCSILink.LINKUSAGE);
    }

    /**
     * 方法 ： setLinkUsage
     * @param linkUsage 标识是否是已添加的链路
     */
    public void setLinkUsage(Boolean linkUsage)
    {
        mo.setProperty(ISCSILink.LINKUSAGE, linkUsage);
    }

    /**
     * 方法 ： getTargetName
     * @return String 返回结果
     */
    public String getTargetName()
    {
        return mo.getStrProperty(ISCSILink.TARGETNAME);
    }

    /**
     * 方法 ： getInitiatorName
     * @return String 返回结果
     */
    public String getInitiatorName()
    {
        return mo.getStrProperty(ISCSILink.INITIATORNAME);
    }

    /**
     * 方法 ： getBandwidthLimitSwitch
     * @return Integer 返回结果
     */
    public Integer getBandwidthLimitSwitch()
    {
        return mo.getIntProperty(ISCSILink.BANDWIDTHLIMITSWITCH);
    }

    /**
     * 方法 ： setBandwidthLimitSwitch
     * @param bandwidthLimitSwitch 是否开带宽限制
     */
    public void setBandwidthLimitSwitch(Integer bandwidthLimitSwitch)
    {
        mo.setProperty(ISCSILink.BANDWIDTHLIMITSWITCH, bandwidthLimitSwitch);
    }

    /**
     * 方法 ： getBandwidthLimitSize
     * @return Long 返回结果
     */
    public Long getBandwidthLimitSize()
    {
        return mo.getLongProperty(ISCSILink.BANDWIDTHLIMITSIZE);
    }

    /**
     * 方法 ： setBandwidthLimitSize
     * @param bandwidthLimitSize 限制带宽大小
     */
    public void setBandwidthLimitSize(Long bandwidthLimitSize)
    {
        mo.setProperty(ISCSILink.BANDWIDTHLIMITSIZE, bandwidthLimitSize);
    }

    /**
     * 方法 ： getBandwidthLimitUnit
     * @return Integer 返回结果
     */
    public Integer getBandwidthLimitUnit()
    {
        return mo.getIntProperty(ISCSILink.BANDWIDTHLIMITUNIT);
    }

    /**
     * 方法 ： setBandwidthLimitUnit
     * @param bandwidthLimitUnit 限制带宽单位
     */
    public void setBandwidthLimitUnit(Integer bandwidthLimitUnit)
    {
        mo.setProperty(ISCSILink.BANDWIDTHLIMITUNIT, bandwidthLimitUnit);
    }

    /**
     * 方法 ： getBandwidthLimitUtilization
     * @return Integer 返回结果
     */
    public Integer getBandwidthLimitUtilization()
    {
        return mo.getIntProperty(ISCSILink.BANDWIDTHLIMITUTILIZATION);
    }

    /**
     * 方法 ： setBandwidthLimitUtilization
     * @param bandwidthLimitUtilization 带宽利用率
     */
    public void setBandwidthLimitUtilization(Integer bandwidthLimitUtilization)
    {
        mo.setProperty(ISCSILink.BANDWIDTHLIMITUTILIZATION, bandwidthLimitUtilization);
    }

    /**
     * 方法 ： getArrayType
     * @return ArrayTypeE 返回结果
     */
    public ArrayTypeE getArrayType()
    {
        return ArrayTypeE.valueOf(mo.getIntProperty(ISCSILink.ARRAYTYPE));
    }

    /**
     * 方法 ： setArrayType
     * @param arrayType 远端阵列类型
     */
    public void setArrayType(ArrayTypeE arrayType)
    {
        mo.setProperty(ISCSILink.ARRAYTYPE, Integer.parseInt(String.valueOf(arrayType.getValue())));
    }

    /**
     * 方法 ： getRecoveryPolicy
     * @return String 返回结果
     */
    public String getRecoveryPolicy()
    {
        return mo.getStrProperty(ISCSILink.RECOVERY_POLICY);
    }

    /**
     * 方法 ： getEnableCHAP
     * @return Boolean 返回结果
     */
    public Boolean getEnableCHAP()
    {
        return mo.getBoolProperty(ISCSILink.ENABLECHAP);
    }

    /**
     * 方法 ： getChapUser
     * @return String 返回结果
     */
    public String getChapUser()
    {
        return mo.getStrProperty(ISCSILink.CHAPUSER);
    }

    /**
     * 方法 ： getChapPaswd
     * @return String 返回结果
     */
    public String getChapPaswd()
    {
        return mo.getStrProperty(ISCSILink.CHAPPASSWD);
    }

    /**
     * 方法 ： getIp
     * @return String 返回结果
     */
    public String getIP()
    {
        return mo.getStrProperty(ISCSILink.IP);
    }

    /**
     * 方法 ： getPort
     * @return String 返回结果
     */
    public String getPort()
    {
        return mo.getStrProperty(ISCSILink.PORT);
    }

    /**
     * 对enableCHAP进行赋值
     * @param enableCHAP 方法参数：enableCHAP
     */
    public void setEnableChap(Boolean enableCHAP)
    {
        mo.setProperty(ISCSILink.ENABLECHAP, enableCHAP);
    }

    /**
     * 对ip进行赋值
     * @param ip 方法参数：ip
     */
    public void setIP(String ip)
    {
        mo.setProperty(ISCSILink.IP, ip);
    }

    /**
     * 对localControlID进行赋值
     * @param localControlID 方法参数：localControlID
     */
    public void setLocalControlID(String localControlID)
    {
        mo.setProperty(ISCSILink.LOCALCONTROLID, localControlID);
    }

    /**
     * 对localPortID进行赋值
     * @param localPortID 方法参数：localPortID
     */
    public void setLocalPortID(String localPortID)
    {
        mo.setProperty(ISCSILink.LOCALPORTID, localPortID);
    }

}
