package com.huawei.ism.openapi.fcoeport;

import org.json.JSONObject;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.IniOrTgtE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.PortLogicTypeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.TLV.FCoEPort;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * fcoe端口对象
 * @author gWX183785
 * @version V100R001C10
 */
public class FCoEPortMO
{

    private final MO mo;

    /**
     * 初始化方法
     * @param jObject json对象
     */
    protected FCoEPortMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
    }

    /**
     * 初始化方法
     */
    public FCoEPortMO()
    {
        this.mo = new MO();
        mo.setProperty(FCoEPort.TYPE, MOType.FCOE_PORT.getValue());
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
     * 方法 ： getID
     * 
     * @return String 返回结果
     */
    public String getId()
    {
        return mo.getStrProperty(FCoEPort.ID);
    }

    /**
     * 对id进行赋值
     * @param id 方法参数：id
     */
    public void setId(String id)
    {
        mo.setProperty(FCoEPort.ID, id);
    }

    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(FCoEPort.NAME);
    }

    /**
     * 对name进行赋值
     * @param name 方法参数：name
     */
    public void setName(String name)
    {
        mo.setProperty(FCoEPort.NAME, name);
    }

    /**
     * 设置VlanID的值
     * @param id vlan id
     */
    public void setVlanId(String id)
    {
        mo.setProperty(FCoEPort.VLANID, id);
    }

    /**
     * 获取VlanID的值
     * @return 返回结果
     */
    public String getVlanId()
    {
        return mo.getStrProperty(FCoEPort.VLANID);
    }

    /**
     * 获取FCoE端口健康状态
     * @return 返回结果
     */
    public HealthStatusE getHealthStatus()
    {
        return HealthStatusE.valueOf(mo.getIntProperty(FCoEPort.HEALTHSTATUS));
    }

    /**
     * 获取FCoE端口运行状态
     * @return 返回结果
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE.valueOf(mo.getIntProperty(FCoEPort.RUNNINGSTATUS));
    }

    /**
     * 获取位置信息
     * @return 返回结果
     */
    public String getLocation()
    {
        return mo.getStrProperty(FCoEPort.LOCATION);
    }

    /**
     * 获取登陆类型
     * @return 返回结果
     */
    public PortLogicTypeE getLogicType()
    {
        return PortLogicTypeE.valueOf(mo.getIntProperty(FCoEPort.LOGICTYPE));
    }

    /**
     * 当为混合端口时，设置端口类型
     * @param logicType 端口类型
     */
    public void setLogicType(PortLogicTypeE logicType)
    {
        mo.setProperty(FCoEPort.LOGICTYPE, logicType.getValue());
    }

    /**
     * 获取运行速率
     * @return 返回结果
     */
    public Integer getRunSpeed()
    {
        return mo.getIntProperty(FCoEPort.RUNSPEED);
    }

    /**
     * 获取WWM
     * @return 返回结果
     */
    public String getWWN()
    {
        return mo.getStrProperty(FCoEPort.WWN);
    }

    /**
     * 获取启动器
     * @return 返回结果
     */
    public IniOrTgtE getIniOrTgt()
    {
        return IniOrTgtE.valueOf(mo.getIntProperty(FCoEPort.INIORTGT));
    }

    /**
     * 获取错误包数
     * @return 返回结果
     */
    public Integer getErrorPackets()
    {
        return mo.getIntProperty(FCoEPort.ERRORPACKETS);
    }

    /**
     * 获取丢失包数
     * @return 返回结果
     */
    public Integer getLostPackets()
    {
        return mo.getIntProperty(FCoEPort.LOSTPACKETS);
    }

    /**
     * 获取统计起始时间
     * @return 返回结果
     */
    public Integer getStartTime()
    {
        return mo.getIntProperty(FCoEPort.STARTTIME);
    }

}
