/*
 * 文 件 名:  StoragePoolMO.java
 * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  l90005879
 * 修改时间:  2011-12-14
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.huawei.ism.openapi.storagepool;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ArrayCfgConstant;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.DiskTypeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RaidLevelE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.TLV.STORAGEPOOL;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * 存储池
 * @author : auto create
 * @version [版本号V001R010C00, 2011-12-14]
 */
public class StoragePoolMO
{
    private final MO mo;

    /**
     * 存储池构造函数
     */
    public StoragePoolMO()
    {
        mo = new MO();
        setParentType(MOType.DISKPOOL);
        setType(MOType.STORAGEPOOL);
    }

    /**
     * 存储池构造函数
     * @param jObject 存储池json
     */
    protected StoragePoolMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
        setParentType(MOType.DISKPOOL);
        setType(MOType.STORAGEPOOL);
    }

    /**
     * 方法 ： getId
     * 
     * @return String 返回结果
     */
    public String getId()
    {
        return mo.getStrProperty(STORAGEPOOL.ID);
    }

    /**
     * 对id进行赋值
     * @param id 方法参数：id
     */
    public void setId(String id)
    {
        mo.setProperty(STORAGEPOOL.ID, id);
    }

    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(STORAGEPOOL.NAME);
    }

    /**
     * 对name进行赋值
     * @param name 方法参数：name
     */
    public void setName(String name)
    {
        mo.setProperty(STORAGEPOOL.NAME, name);
    }

    /**
     * 获取parent的类型
     * @return MOType
     */
    public MOType getParentType()
    {
        return MOType.getType(mo.getIntProperty(STORAGEPOOL.PARENTTYPE));
    }

    /**
     * 设置parentId
     * @param parentId parentId
     */
    public void setParentId(String parentId)
    {
        mo.setProperty(STORAGEPOOL.PARENTID, parentId);
    }

    /**
     * 获取parent
     * @return ParentId
     */
    public String getParentId()
    {
        return mo.getStrProperty(STORAGEPOOL.PARENTID);
    }

    /**
     * 获取parent的名称
     * @return ParentName
     */
    public String getParentName()
    {
        return mo.getStrProperty(STORAGEPOOL.PARENTNAME);
    }

    /**
     * 方法 ： getHealthStatus
     * 
     * @return HEALTH_STATUS_E 返回结果
     */
    public HealthStatusE getHealthStatus()
    {
        Integer value = mo.getIntProperty(STORAGEPOOL.HEALTHSTATUS);
        if (null == value)
        {
            return null;
        }
        return HealthStatusE.valueOf(value);
    }

    /**
     * 方法 ： setHealthStatus
     * @param healthStatusE 健康状态
     */
    public void setHealthStatus(HealthStatusE healthStatusE)
    {
        mo.setProperty(STORAGEPOOL.HEALTHSTATUS, Integer.parseInt(String.valueOf(healthStatusE.getValue())));
    }

    /**
     * 方法 ： getRunningStatus
     * 
     * @return RUNNING_STATUS_E 返回结果
     */
    public RunningStatusE getRunningStatus()
    {
        Integer value = mo.getIntProperty(STORAGEPOOL.RUNNINGSTATUS);
        if (null == value)
        {
            return null;
        }
        return RunningStatusE.valueOf(value);
    }

    /**
     * 方法 ： setRunningStatus
     * @param runningStatusE 运行状态
     */
    public void setRunningStatus(RunningStatusE runningStatusE)
    {
        mo.setProperty(STORAGEPOOL.RUNNINGSTATUS, Integer.parseInt(String.valueOf(runningStatusE.getValue())));
    }

    /**
     * 方法 ： getDescription
     * 
     * @return Description
     */
    public String getDescription()
    {
        return mo.getStrProperty(STORAGEPOOL.DESCRIPTION);
    }

    /**
     * 对description进行赋值
     * @param description 方法参数：description
     */
    public void setDescription(String description)
    {
        mo.setProperty(STORAGEPOOL.DESCRIPTION, description);
    }

    /**
     * 方法 ： getWorkNodeId
     * 
     * @return String 返回结果
     */
    public String getWorkNodeId()
    {
        return mo.getStrProperty(STORAGEPOOL.WORKNODEID);
    }

    /**
     * 方法 ： getUserTotalCapacity
     * 
     * @return UserTotalCapacity
     */
    public Long getUserTotalCapacity()
    {
        return mo.getLongProperty(STORAGEPOOL.USERTOTALCAPACITY) * ArrayCfgConstant.SECTOR_SIZE;
    }

    /**
     * 方法 ： getUserFreeCapacity
     * 
     * @return UserFreeCapacity
     */
    public Long getUserFreeCapacity()
    {
        return mo.getLongProperty(STORAGEPOOL.USERFREECAPACITY) * ArrayCfgConstant.SECTOR_SIZE;
    }

    /**
     * 方法 ： getUserConsumedCapacity
     * 
     * @return UserConsumedCapacity
     */
    public Long getUserConsumedCapacity()
    {
        return mo.getLongProperty(STORAGEPOOL.USERCONSUMEDCAPACITY) * ArrayCfgConstant.SECTOR_SIZE;
    }

    /**
     * 方法 ： getUserConsumedCapacityPercentage
     * 
     * @return UserConsumedCapacityPercentage
     */
    public Long getUserConsumedCapacityPercentage()
    {
        return mo.getLongProperty(STORAGEPOOL.USERCONSUMEDCAPACITYPERCENTAGE);
    }

    /**
     * 方法 ： getUserConsumedCapacityThreshold
     * 
     * @return UserConsumedCapacityThreshold
     */
    public Long getUserConsumedCapacityThreshold()
    {
        return mo.getLongProperty(STORAGEPOOL.USERCONSUMEDCAPACITYTHRESHOLD);
    }

    /**
     * 设置用户使用容量
     * @param capacityThreshold 容量
     */
    public void setUserConsumedCapacityThreshold(Long capacityThreshold)
    {
        mo.setProperty(STORAGEPOOL.USERCONSUMEDCAPACITYTHRESHOLD, capacityThreshold);
    }

    /**
     * 方法 ： getHotspareSpaceTotalCapacity
     * 
     * @return HotspareSpaceTotalCapacity
     */
    public Long getHotspareSpaceTotalCapacity()
    {
        return mo.getLongProperty(STORAGEPOOL.HOTSPARESPACETOTALCAPACITY) * ArrayCfgConstant.SECTOR_SIZE;
    }

    /**
     * 方法 ： getHotspareSpaceConsumedCapacity
     * 
     * @return HotspareSpaceConsumedCapacity
     */
    public Long getHotspareSpaceConsumedCapacity()
    {
        return mo.getLongProperty(STORAGEPOOL.HOTSPARESPACECONSUMEDCAPACITY) * ArrayCfgConstant.SECTOR_SIZE;
    }

    /**
     * 方法 ： getHotspareSpaceConsumedCapacityPercentage
     * 
     * @return HotspareSpaceConsumedCapacityPercentage
     */
    public Long getHotspareSpaceConsumedCapacityPercentage()
    {
        return mo.getLongProperty(STORAGEPOOL.HOTSPARESPACECONSUMEDCAPACITYPERCENTAGE);
    }

    /**
     * 对tier0RaidLv进行赋值
     * @param tier0RaidLv 方法参数：tier0RaidLv
     */
    public void setTier0RaidLv(RaidLevelE tier0RaidLv)
    {
        mo.setProperty(STORAGEPOOL.TIER0RAIDLV, tier0RaidLv.getValue());
    }

    /**
     * 方法 ： getTier0RaidLv
     * 
     * @return RAID_LEVEL_E 返回结果
     */
    public RaidLevelE getTier0RaidLv()
    {
        Integer value = mo.getIntProperty(STORAGEPOOL.TIER0RAIDLV);
        if (null == value)
        {
            return null;
        }
        return RaidLevelE.valueOf(value);
    }

    /**
     * 方法 ： getTier1RaidLv
     * 
     * @return RAID_LEVEL_E 返回结果
     */
    public RaidLevelE getTier1RaidLv()
    {
        Integer value = mo.getIntProperty(STORAGEPOOL.TIER1RAIDLV);
        if (null == value)
        {
            return null;
        }
        return RaidLevelE.valueOf(value);
    }

    /**
     * 对tier1RaidLv进行赋值
     * @param tier1RaidLv 方法参数：tier1RaidLv
     */
    public void setTier1RaidLv(RaidLevelE tier1RaidLv)
    {
        mo.setProperty(STORAGEPOOL.TIER1RAIDLV, tier1RaidLv.getValue());
    }

    /**
     * 方法 ： getTier2RaidLv
     * 
     * @return RAID_LEVEL_E 返回结果
     */
    public RaidLevelE getTier2RaidLv()
    {
        Integer value = mo.getIntProperty(STORAGEPOOL.TIER2RAIDLV);
        if (null == value)
        {
            return null;
        }
        return RaidLevelE.valueOf(value);
    }

    /**
     * 对tier2RaidLv进行赋值
     * @param tier2RaidLv 方法参数：tier2RaidLv
     */
    public void setTier2RaidLv(RaidLevelE tier2RaidLv)
    {
        mo.setProperty(STORAGEPOOL.TIER2RAIDLV, tier2RaidLv.getValue());
    }

    /**
     * 获取原始容量
     * @return RawCapacity
     */
    public Long getRawCapacity()
    {
        return mo.getLongProperty(STORAGEPOOL.RAWCAPACITY) * ArrayCfgConstant.SECTOR_SIZE;
    }

    /**
     * 获取块设备的大小
     * @return SectorSize
     */
    public Long getSectorSize()
    {
        return mo.getLongProperty(STORAGEPOOL.SECTORSIZE);
    }

    /**
     * 设置Tier 0 裸容量
     * @param capacity 容量
     */
    public void setTier0Capacity(Long capacity)
    {
        setTireDiskType(DiskTypeE.SSD);
        mo.setProperty(STORAGEPOOL.TIER0CAPACITY, capacity / ArrayCfgConstant.SECTOR_SIZE);
    }

    /**
     * 获取Tier 0 裸容量
     * @return Tier0Capacity Tier0Capacity
     */
    public Long getTier0Capacity()
    {
        return mo.getLongProperty(STORAGEPOOL.TIER0CAPACITY) * ArrayCfgConstant.SECTOR_SIZE;
    }

    /**
     * 设置Tier 1 裸容量
     * @param capacity Tier1Capacity
     */
    public void setTier1Capacity(Long capacity)
    {
        setTireDiskType(DiskTypeE.SAS);
        mo.setProperty(STORAGEPOOL.TIER1CAPACITY, capacity / ArrayCfgConstant.SECTOR_SIZE);
    }

    /**
     * 获取Tier 1 裸容量
     * @return Tier1Capacity
     */
    public Long getTier1Capacity()
    {
        return mo.getLongProperty(STORAGEPOOL.TIER1CAPACITY) * ArrayCfgConstant.SECTOR_SIZE;
    }

    /**
     * 设置Tier 2 裸容量
     * @param capacity Tier2Capacity
     */
    public void setTier2Capacity(Long capacity)
    {
        setTireDiskType(DiskTypeE.NL_SAS);
        mo.setProperty(STORAGEPOOL.TIER2CAPACITY, capacity / ArrayCfgConstant.SECTOR_SIZE);
    }

    /**
     * 获取Tier 2 裸容量
     * @return Tier2Capacity
     */
    public Long getTier2Capacity()
    {
        return mo.getLongProperty(STORAGEPOOL.TIER2CAPACITY) * ArrayCfgConstant.SECTOR_SIZE;
    }

    /**
     * 获取数据保护容量
     * @return ReplicationCapacity
     */
    public Long getReplicationCapacity()
    {
        return mo.getLongProperty(STORAGEPOOL.REPLICATIONCAPACITY) * ArrayCfgConstant.SECTOR_SIZE;
    }

    /**
     * 方法 ： getReservedCapacity
     * 
     * @return ReservedCapacity
     */
    public Long getReservedCapacity()
    {
        return mo.getLongProperty(STORAGEPOOL.RESERVEDCAPACITY) * ArrayCfgConstant.SECTOR_SIZE;
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
     * @return Count
     */
    protected Long getCount()
    {
        return mo.getLongProperty(STORAGEPOOL.COUNT);
    }

    private void setType(MOType type)
    {
        mo.setProperty(STORAGEPOOL.TYPE, type.getValue());
    }

    private void setTireDiskType(DiskTypeE diskType)
    {
        if (diskType == DiskTypeE.SSD)
        {
            mo.setProperty(STORAGEPOOL.TIER0DISKTYPE, diskType.getValue());
        }
        else if (diskType == DiskTypeE.SAS)
        {
            mo.setProperty(STORAGEPOOL.TIER1DISKTYPE, diskType.getValue());

        }
        else if (diskType == DiskTypeE.NL_SAS)
        {
            mo.setProperty(STORAGEPOOL.TIER2DISKTYPE, diskType.getValue());
        }
        else
        {
            LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_ERROR, "the storagepool type is error");
            LogUtil.getLogUtilInstance().showRunningtLog(LOG_TYPE_E.LOG_ERROR,
                    "StoragePoolMO.setTireDiskType()", "the storagepool type is error");
        }
    }

    /**
     * 对parentType进行赋值
     * @param parentType 方法参数：parentType
     */
    private void setParentType(MOType parentType)
    {
        mo.setProperty(STORAGEPOOL.PARENTTYPE, parentType.getValue());
    }
}
