package com.huawei.ism.openapi.ethport;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.IniOrTgtE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.PortLogicTypeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.TLV.ETHPort;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * ETH端口信息
 * @author gWX183785
 * @version V100R001C10
 */
public class ETHPortMO
{

    private final MO mo;

    /**
     * 初始化方法
     * @param jObject json对象
     */
    protected ETHPortMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
    }

    /**
     * 初始化方法
     */
    public ETHPortMO()
    {
        this.mo = new MO();
        mo.setProperty(ETHPort.TYPE, MOType.ETH_PORT.getValue());
    }

    /**
     * 获取对象
     * @return 返回结果
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
        return mo.getStrProperty(ETHPort.ID);
    }

    /**
     * 对id进行赋值
     * @param id 方法参数：id
     */
    public void setId(String id)
    {
        mo.setProperty(ETHPort.ID, id);
    }

    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(ETHPort.NAME);
    }

    /**
     * 对name进行赋值
     * @param name 方法参数：name
     */
    public void setName(String name)
    {
        mo.setProperty(ETHPort.NAME, name);
    }

    /**
     * 获取ETH端口健康状态
     * @return 返回结果
     */
    public HealthStatusE getHealthStatus()
    {
        return HealthStatusE.valueOf(mo.getIntProperty(ETHPort.HEALTHSTATUS));
    }

    /**
     * 设置ETH端口运行状态
     * @param linkDown 连接状态
     */
    public void setRunningStatus(RunningStatusE linkDown)
    {
        mo.setProperty(ETHPort.RUNNINGSTATUS, linkDown.getValue());
    }

    /**
     * 获取ETH端口运行状态
     * @return 返回结果
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE.valueOf(mo.getIntProperty(ETHPort.RUNNINGSTATUS));
    }

    /**
     * 当为混合端口时，设置端口类型
     * @param logicType 端口类型
     */
    public void setLogicType(PortLogicTypeE logicType)
    {
        mo.setProperty(ETHPort.LOGICTYPE, logicType.getValue());
    }

    /**
     * 当为混合端口时，获取端口类型
     * @return 返回结果
     */
    public PortLogicTypeE getLogicType()
    {
        return PortLogicTypeE.valueOf(mo.getIntProperty(ETHPort.LOGICTYPE));
    }

    /**
     * 设置MTU值
     * @param mtu mtu值
     */
    public void setMTU(long mtu)
    {
        mo.setProperty(ETHPort.MTU, mtu);
    }

    /**
     * 获取MTU值
     * @return 返回结果
     */
    public Long getMTU()
    {
        return mo.getLongProperty(ETHPort.MTU);
    }

    /**
     * 设置开启iscsi协议时占用的端口号
     * @param iscsiTcpPort 端口号
     */
    public void setIscsiTcpPort(String iscsiTcpPort)
    {
        mo.setProperty(ETHPort.ISCSITCPPORT, iscsiTcpPort);
    }

    /**
     * 获取开启iscsi协议时占用的端口号
     * @return 返回结果
     */
    public String getIscsiTcpPort()
    {
        return mo.getStrProperty(ETHPort.ISCSITCPPORT);
    }

    /**
     * 设置iscsi名称
     * @param name iscsi名称
     */
    public void setIscsiName(String name)
    {
        mo.setProperty(ETHPort.ISCSINAME, name);
    }

    /**
     * 获取iscsi名称
     * @return 返回结果
     */
    public String getIscsiName()
    {
        return mo.getStrProperty(ETHPort.ISCSINAME);
    }

    /**
     * 获取Location
     * @return 返回结果
     */
    public String getLocation()
    {
        return mo.getStrProperty(ETHPort.LOCATION);
    }

    /**
     * 获取mac地址
     * @return 返回结果
     */
    public String getMacAddress()
    {
        return mo.getStrProperty(ETHPort.MACADDRESS);
    }

    /**
     * 获取启动器类型
     * @return 返回结果
     */
    public IniOrTgtE getIniOrTgt()
    {
        return IniOrTgtE.valueOf(mo.getIntProperty(ETHPort.INIORTGT));
    }

    /**
     * 获取错误包数
     * @return 返回结果
     */
    public Integer getErrorPackets()
    {
        return mo.getIntProperty(ETHPort.ERRORPACKETS);
    }

    /**
     * 获取丢失包数
     * @return 返回结果
     */
    public Integer getLostPackets()
    {
        return mo.getIntProperty(ETHPort.LOSTPACKETS);
    }

    /**
     * 获取溢出包数
     * @return 返回结果
     */
    public Integer getOverflowedPackets()
    {
        return mo.getIntProperty(ETHPort.OVERFLOWEDPACKETS);
    }

    /**
     * 获取统计起始时间
     * @return 返回结果
     */
    public Integer getStartTime()
    {
        return mo.getIntProperty(ETHPort.STARTTIME);
    }

    /**
     * 获取速度
     * @return 返回结果
     */
    public Integer getSpeed()
    {
        return mo.getIntProperty(ETHPort.SPEED);
    }

    /**
     * 获取IPv4掩码
     * @return 返回结果
     */
    public String getIpv4Mask()
    {
        return mo.getStrProperty(ETHPort.IPV4MASK);
    }

    /**
     * 设置IPv4掩码
     * @param ipv4Mask IPv4掩码
     */
    public void setIpv4Mask(String ipv4Mask)
    {
        mo.setProperty(ETHPort.IPV4MASK, ipv4Mask);
    }

    /**
     * 获取IPv6掩码
     * @return 返回结果
     */
    public String getIpv6Mask()
    {
        return mo.getStrProperty(ETHPort.IPV6MASK);
    }

    /**
     * 设置IPv6掩码
     * @param ipv6Mask IPv4掩码
     */
    public void setIpv6Mask(String ipv6Mask)
    {
        mo.setProperty(ETHPort.IPV6MASK, ipv6Mask);
    }
    
    /**
     * 获取IPv4地址
     * @return 返回结果
     */
    public String getIpv4Addr()
    {
        return mo.getStrProperty(ETHPort.IPV4ADDR);
    }

    /**
     * 设置IPv4地址
     * @param ipv4Addr IPv4地址
     */
    public void setIpv4Addr(String ipv4Addr)
    {
        mo.setProperty(ETHPort.IPV4ADDR, ipv4Addr);
    }
    
    /**
     * 获取IPv6地址
     * @return 返回结果
     */
    public String getIpv6Addr()
    {
        return mo.getStrProperty(ETHPort.IPV6ADDR);
    }

    /**
     * 设置IPv6地址
     * @param ipv4Addr IPv6地址
     */
    public void setIpv6Addr(String ipv6Addr)
    {
        mo.setProperty(ETHPort.IPV6ADDR, ipv6Addr);
    }
}
