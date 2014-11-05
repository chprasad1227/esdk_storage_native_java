package com.huawei.ism.openapi.diskpool;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.TLV.DISKPOOL;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * 硬盘域对象
 * @author gWX183785
 * @version V100R001C10
 */
public class DiskPoolMO
{

    private final MO mo;

    /**
     * 初始化方法
     * @param jObject json对象
     */
    protected DiskPoolMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
    }

    /**
     * 初始化方法
     */
    public DiskPoolMO()
    {
        this.mo = new MO();
        mo.setProperty(DISKPOOL.TYPE, MOType.DISKPOOL.getValue());
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
        return mo.getStrProperty(DISKPOOL.ID);
    }

    /**
     * 对id进行赋值
     * @param id 方法参数：id
     */
    public void setId(String id)
    {
        mo.setProperty(DISKPOOL.ID, id);
    }

    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(DISKPOOL.NAME);
    }

    /**
     * 对name进行赋值
     * @param name 方法参数：name
     */
    public void setName(String name)
    {
        mo.setProperty(DISKPOOL.NAME, name);
    }

    /**
     * 获取健康状态
     * @return 返回结果
     */
    public HealthStatusE getHealthStatus()
    {
        return HealthStatusE.valueOf(Integer.parseInt(mo
            .getStrProperty(DISKPOOL.HEALTHSTATUS)));
    }

    /**
     * 方法 ： setHealthStatus
     * @param healthStatusE 健康状态
     */
    public void setHealthStatus(HealthStatusE healthStatusE)
    {
        mo.setProperty(DISKPOOL.HEALTHSTATUS,
            Integer.parseInt(String.valueOf(healthStatusE.getValue())));
    }

    /**
     * 获取运行状态
     * @return 返回结果
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE.valueOf(Integer.parseInt(mo
            .getStrProperty(DISKPOOL.RUNNINGSTATUS)));
    }
    
    /**
     * 方法 ： setRunningStatus
     * @param runningStatusE 运行状态
     */
    public void setRunningStatus(RunningStatusE runningStatusE)
    {
        mo.setProperty(DISKPOOL.RUNNINGSTATUS, Integer.parseInt(String.valueOf(runningStatusE.getValue())));
    }

    /**
     * 获取描述
     * @return String 返回结果
     */
    public String getDescription()
    {
        return mo.getStrProperty(DISKPOOL.DESCRIPTION);
    }

    /**
     * 设置描述
     * @param description 描述
     */
    public void setDescription(String description)
    {
        mo.setProperty(DISKPOOL.DESCRIPTION, description);
    }

    /**
     * 获取总可用裸容量
     * @return 返回结果
     */
    public Long getTotalCapacity()
    {
        return mo.getLongProperty(DISKPOOL.TOTALCAPACITY);
    }

    /**
     * 获取总热备裸容量
     * @return 返回结果
     */
    public Long getSpareCapacity()
    {
        return mo.getLongProperty(DISKPOOL.SPARECAPACITY);
    }

    /**
     * 获取已用热备容量
     * @return 返回结果
     */
    public Long getUsedSpareCapacity()
    {
        return mo.getLongProperty(DISKPOOL.USEDSPARECAPACITY);
    }

    /**
     * 获取空闲容量
     * @return 返回结果
     */
    public Long getFreeCapacity()
    {
        return mo.getLongProperty(DISKPOOL.FREECAPACITY);
    }

    /**
     * SSD总可用裸容量
     * @return 返回结果
     */
    public Long getSSDtotalCapacity()
    {
        return mo.getLongProperty(DISKPOOL.SSDTOTALCAPACITY);
    }

    /**
     * SSD总热备裸容量
     * @return 返回结果
     */
    public Long getSSDspareCapacity()
    {
        return mo.getLongProperty(DISKPOOL.SSDSPARECAPACITY);
    }

    /**
     * SSD已使用热备容量
     * @return 返回结果
     */
    public Long getSSDusedSpareCapacity()
    {
        return mo.getLongProperty(DISKPOOL.SSDUSEDSPARECAPACITY);
    }

    /**
     * SSD空闲热备容量
     * @return 返回结果
     */
    public Long getSSDfreeCapacity()
    {
        return mo.getLongProperty(DISKPOOL.SSDFREECAPACITY);
    }

    /**
     * SAS总可用裸容量
     * @return 返回结果
     */
    public Long getSAStotalCapacity()
    {
        return mo.getLongProperty(DISKPOOL.SASTOTALCAPACITY);
    }

    /**
     * SAS总热备裸容量
     * @return 返回结果
     */
    public Long getSASspareCapacity()
    {
        return mo.getLongProperty(DISKPOOL.SASSPARECAPACITY);
    }

    /**
     * SAS已用热备裸容量
     * @return 返回结果
     */
    public Long getSASusedSpareCapaci()
    {
        return mo.getLongProperty(DISKPOOL.SASUSEDSPARECAPACITY);
    }

    /**
     * SAS空闲裸容量
     * @return 返回结果
     */
    public Long getSASfreeCapacity()
    {
        return mo.getLongProperty(DISKPOOL.SASFREECAPACITY);
    }

    /**
     * NLSAS总可用裸容量
     * @return 返回结果
     */
    public Long getNLSAStotalCapacity()
    {
        return mo.getLongProperty(DISKPOOL.NLSASTOTALCAPACITY);
    }

    /**
     * NLSAS总热备裸容量
     * @return 返回结果
     */
    public Long getNLSASspareCapacity()
    {
        return mo.getLongProperty(DISKPOOL.NLSASSPARECAPACITY);
    }

    /**
     * NLSAS已用热备裸容量
     * @return 返回结果
     */
    public Long getNLSASusedSpareCapacity()
    {
        return mo.getLongProperty(DISKPOOL.NLSASUSEDSPARECAPACITY);
    }

    /**
     * NLSAS空闲裸容量
     * @return 返回结果
     */
    public Long getNLSASfreeCapacity()
    {
        return mo.getLongProperty(DISKPOOL.NLSASFREECAPACITY);
    }

    /**
     * SSD成员盘个数
     * @return 返回结果
     */
    public Integer getSSDdiskNum()
    {
        return mo.getIntProperty(DISKPOOL.SSDDISKNUM);
    }

    /**
     * 设置SSD成员盘个数
     * @param num 成员盘个数
     */
    public void setSSDdiskNum(int num)
    {
        mo.setProperty(DISKPOOL.SSDDISKNUM, num);
    }

    /**
     * SAS成员盘个数
     * @return 返回结果
     */
    public Integer getSASdiskNum()
    {
        return mo.getIntProperty(DISKPOOL.SASDISKNUM);
    }

    /**
     * 设置SAS成员盘个数
     * @param num 成员盘个数
     */
    public void setSASdiskNum(int num)
    {
        mo.setProperty(DISKPOOL.SASDISKNUM, num);
    }

    /**
     * NLSAS成员盘个数
     * @return 返回结果
     */
    public Integer getNLSASdiskNum()
    {
        return mo.getIntProperty(DISKPOOL.NLSASDISKNUM);
    }

    /**
     * NLSAS成员盘个数
     * @param num 成员盘个数
     */
    public void setNLSASdiskNum(int num)
    {
        mo.setProperty(DISKPOOL.NLSASDISKNUM, num);
    }

    /**
     * 已分配裸容量
     * @return 返回结果
     */
    public Long getUsedCapacity()
    {
        return mo.getLongProperty(DISKPOOL.USEDCAPACITY);
    }

    /**
     * SSD已分配裸容量
     * @return 返回结果
     */
    public Long getSSDusedCapacity()
    {
        return mo.getLongProperty(DISKPOOL.SSDUSEDCAPACITY);
    }

    /**
     * SAS已分配裸容量
     * @return 返回结果
     */
    public Long getSASusedCapacity()
    {
        return mo.getLongProperty(DISKPOOL.SASUSEDCAPACITY);
    }

    /**
     * NLSAS已分配裸容量
     * @return 返回结果
     */
    public Long getNLSASusedCapacity()
    {
        return mo.getLongProperty(DISKPOOL.NLSASUSEDCAPACITY);
    }
}
