/*
 * 文 件 名:  LunMethod.java
 * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <LUN MO类>
 * 修 改 人:  h90005710
 * 修改时间:  2011-10-10
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.huawei.ism.openapi.lun;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ArrayCfgConstant;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LUNAllocTypeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.TLV.LUN;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * LUN 的MO
 * @author : auto create
 * @version [版本号V001R010C00, 2011-12-14]
 */
public class LunMO
{
    private final MO mo;

    /**
     * Lun构造函数
     * @param jObject lun对应的json
     */
    protected LunMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
        setType(MOType.LUN);
    }

    /**
     * Lun构造函数
     */
    public LunMO()
    {
        this.mo = new MO();
        setType(MOType.LUN);
    }

    /**
     * 方法 ： getId
     * 
     * @return String 返回结果
     */
    public String getId()
    {
        return mo.getStrProperty(LUN.ID);
    }

    /**
     * 对id进行赋值
     * @param id 方法参数：id
     */
    public void setId(String id)
    {
        mo.setProperty(LUN.ID, id);
    }

    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(LUN.NAME);
    }

    /**
     * 对name进行赋值
     * @param name 方法参数：name
     */
    public void setName(String name)
    {
        mo.setProperty(LUN.NAME, name);
    }

    /**
     * 设置关联对象类型
     * @param moType 关联对象类型
     */
    public void setAssociateOBJType(MOType moType)
    {
        mo.setProperty(LUN.ASSOCIATEOBJTYPE, String.valueOf(moType.getValue()));
    }

    /**
     * 获取关联对象类型
     * @return 返回结果
     */
    public MOType getAssociateOBJType()
    {
        return MOType.valueOf(mo.getStrProperty(LUN.ASSOCIATEOBJTYPE));
    }

    /**
     * 设置关联对象ID
     * @param id 关联对象ID
     */
    public void setAssociateOBJId(String id)
    {
        mo.setProperty(LUN.ASSOCIATEOBJID, id);
    }

    /**
     * 获取关联对象ID
     * @return 返回结果
     */
    public String getAssociateOBJId()
    {
        return mo.getStrProperty(LUN.ASSOCIATEOBJID);
    }

    /**
     * 业务接口去除设置parent类型的功能 方法 ： getParentType
     * 
     * @return MOType 返回结果
     */
    public MOType getParentType()
    {
        return MOType.getType(mo.getIntProperty(LUN.PARENTTYPE));
    }

    /**
     * 方法 ： getParentID
     * 
     * @return ParentId
     */
    public String getParentId()
    {
        return mo.getStrProperty(LUN.PARENTID);
    }

    /**
     * 对parentID进行赋值
     * @param parentId 方法参数：parentID
     */
    public void setParentId(String parentId)
    {
        mo.setProperty(LUN.PARENTID, parentId);
    }

    /**
     * 获取ParentName(Lun的Parent固定为Pool)
     * @return ParentName
     */
    public String getParentName()
    {
        return mo.getStrProperty(LUN.PARENTNAME);
    }

    /**
     * 方法 ： getHealthStatus
     * 
     * @return HealthStatus
     */
    public HealthStatusE getHealthStatus()
    {
        return HealthStatusE.valueOf(mo.getIntProperty(LUN.HEALTHSTATUS));
    }

    /**
     * 对healthStatus进行赋值
     * @param HealthStatusE 方法参数：healthStatus
     */
    public void setHealthStatus(HealthStatusE healthStatus)
    {
        mo.setProperty(LUN.HEALTHSTATUS, healthStatus.getValue());
    }

    /**
     * 方法 ： getRunningStatus
     * 
     * @return RunningStatus
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE.valueOf(mo.getIntProperty(LUN.RUNNINGSTATUS));
    }

    /**
     * 对runningStatus进行赋值
     * @param runningStatus 方法参数：runningStatus
     */
    public void setRunningStatus(RunningStatusE runningStatus)
    {
        mo.setProperty(LUN.RUNNINGSTATUS, runningStatus.getValue());
    }

    /**
     * 方法 ： getDescription
     * 
     * @return Description
     */
    public String getDescription()
    {
        return mo.getStrProperty(LUN.DESCRIPTION);
    }

    /**
     * 对description进行赋值
     * @param description 方法参数：description
     */
    public void setDescription(String description)
    {
        mo.setProperty(LUN.DESCRIPTION, description);
    }

    /**
     * 方法 ： getAllocType
     * 
     * @return LUN_ALLOC_TYPE_E 返回结果
     */
    public LUNAllocTypeE getAllocType()
    {
        return LUNAllocTypeE.valueOf(mo.getIntProperty(LUN.ALLOCTYPE));
    }

    /**
     * 对allocType进行赋值
     * @param allocType 方法参数：allocType
     */
    public void setAllocType(LUNAllocTypeE allocType)
    {
        mo.setProperty(LUN.ALLOCTYPE,
            Integer.parseInt(String.valueOf(allocType.getValue())));
    }

    /**
     * 方法 ： getCapacity
     * 
     * @return Long 返回结果
     */
    public Long getCapacity()
    {
        return mo.getLongProperty(LUN.CAPACITY) * ArrayCfgConstant.SECTOR_SIZE;
    }

    /**
     * 对capacity进行赋值
     * @param capacity 方法参数：capacity
     */
    public void setCapacity(Long capacity)
    {
        mo.setProperty(LUN.CAPACITY, capacity / ArrayCfgConstant.SECTOR_SIZE);
    }

    /**
     * 方法 ： getInitialAllocCapacity
     * 
     * @return Long 返回结果
     */
    public Long getInitialAllocCapacity()
    {
        return mo.getLongProperty(LUN.INITIALALLOCCAPACITY)
            * ArrayCfgConstant.SECTOR_SIZE;
    }

    /**
     * 对initialAllocCapacity进行赋值
     * @param initialAllocCapacity 方法参数：initialAllocCapacity
     */
    public void setInitialAllocCapacity(Long initialAllocCapacity)
    {
        mo.setProperty(LUN.INITIALALLOCCAPACITY, initialAllocCapacity
            / ArrayCfgConstant.SECTOR_SIZE);
    }

    /**
     * 方法 ： getAllocCapacity
     * 
     * @return long 返回结果
     */
    public Long getAllocCapacity()
    {
        return mo.getLongProperty(LUN.ALLOCCAPACITY)
            * ArrayCfgConstant.SECTOR_SIZE;
    }

    /**
     * 方法 ： isExposedToInitiator
     * 
     * @return boolean 返回结果
     */
    public Boolean isExposedToInitiator()
    {
        return mo.getBoolProperty(LUN.EXPOSEDTOINITIATOR);
    }

    /**
     * 方法 ： getWwn
     * 
     * @return String 返回结果
     */
    public String getWWN()
    {
        return mo.getStrProperty(LUN.WWN);
    }

    /**
     * 对OwningController进行赋值
     * @param owningController 方法参数：owningController
     */
    public void setOwningController(String owningController)
    {
        mo.setProperty(LUN.OWNINGCONTROLLER, owningController);
    }

    /**
     * 方法 ： getOwningController
     * 
     * @return String 返回结果
     */
    public String getOwningController()
    {
        return mo.getStrProperty(LUN.OWNINGCONTROLLER);
    }

    /**
     * 方法 ： getWorkingController
     * 
     * @return String 返回结果
     */
    public String getWorkingController()
    {
        return mo.getStrProperty(LUN.WORKINGCONTROLLER);
    }

    /**
     * 方法 ： getReplicationCapacity
     * 
     * @return Long 返回结果
     */
    public Long getReplicationCapacity()
    {
        return mo.getLongProperty(LUN.REPLICATION_CAPACITY)
            * ArrayCfgConstant.SECTOR_SIZE;
    }

    /**
     * 获取TinLUN真实数据占整个系统中可供此ThinLUN使用的空间之比
     * @return ThinCapacityUsage
     */
    public Long getThinCapacityUsage()
    {
        return mo.getLongProperty(LUN.THINCAPACITYUSAGE);
    }

    /**
     * 是否已添加给LUN组
     * @return isAddToLunGroup
     */
    public Boolean isAddToLunGroup()
    {
        return mo.getBoolProperty(LUN.ISADD2LUNGROUP);
    }

    /**
     * 设置是否已添加给LUN组
     * @param isAddToLunGroup
     */
    public void setIsAddToLunGroup(boolean isAddToLunGroup)
    {
        mo.setProperty(LUN.ISADD2LUNGROUP, isAddToLunGroup);
    }

    /**
     * 方法 ： getCount
     * 
     * @return long 返回结果
     */
    protected Long getCount()
    {
        return mo.getLongProperty(LUN.COUNT);
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
     * 对type进行赋值
     * @param type 方法参数：type
     */
    private void setType(MOType type)
    {
        mo.setProperty(LUN.TYPE, type.getValue());
    }

}
