package com.huawei.ism.openapi.nas.filesystem;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.InitTierPolicyE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LUNAllocTypeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.MigrateLUNPolicyE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.PriorityE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.TLV.HOST;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.FILESYSTEM;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * 文件系统信息MO
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class FileSystemMO
{
    private final MO mo;

    /**
     * 文件系统的构造函数
     */
    public FileSystemMO()
    {
        this.mo = new MO();
    }

    /**
     * 文件系统的构造函数
     * @param mo 文件系统mo
     */
    public FileSystemMO(MO mo)
    {
        this.mo = mo;
    }

    /**
     * 文件系统的构造函数
     * @param jObject 文件系统
     */
    public FileSystemMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
    }

    public MO getMO()
    {
        return this.mo;
    }
    
    public void setAssociateOBJType(MOType moType)
    {
        mo.setProperty(FILESYSTEM.ASSOCIATEOBJTYPE, String.valueOf(moType.getValue()));
    }

    /**
     * 获取关联对象类型
     * @return 返回结果
     */
    public MOType getAssociateOBJType()
    {
        return MOType.valueOf(mo.getStrProperty(FILESYSTEM.ASSOCIATEOBJTYPE));
    }

    /**
     * 设置关联对象ID
     * @param id 关联对象ID
     */
    public void setAssociateOBJId(String id)
    {
        mo.setProperty(FILESYSTEM.ASSOCIATEOBJID, id);
    }

    /**
     * 获取关联对象ID
     * @return 返回结果
     */
    public String getAssociateOBJId()
    {
        return mo.getStrProperty(FILESYSTEM.ASSOCIATEOBJID);
    }

    /**
     * 获取id
     * @return id
     */
    public String getId()
    {
        return mo.getStrProperty(FILESYSTEM.ID);
    }

    /**
     * 设置id
     * @param id id
     */
    public void setId(String id)
    {
        mo.setProperty(FILESYSTEM.ID, id);
    }

    /**
     * 获取文件系统名称
     * @return 文件系统名称
     */
    public String getName()
    {
        return mo.getStrProperty(FILESYSTEM.NAME);
    }

    /**
     * 设置文件系统名称
     * @param name 文件系统名称
     */
    public void setName(String name)
    {
        mo.setProperty(FILESYSTEM.NAME, name);
    }

    /**
     * 对象为POOL------按照文档中描述为POOL，待验证
     * @return pool
     */
    public MOType getParentType()
    {
        return MOType.getType(mo.getIntProperty(FILESYSTEM.PARENTTYPE));
    }

    /**
     * 设置父对象类型
     * @param parentType 父对象类型
     */
    public void setParentType(MOType parentType)
    {
        mo.setProperty(FILESYSTEM.PARENTTYPE,
            Integer.parseInt(String.valueOf(parentType.getValue())));
    }

    /**
     * 获取父对象ID
     * @return 父对象ID
     */
    public String getParentId()
    {
        return mo.getStrProperty(MOType.STORAGEPOOL.getValue());
    }

    /**
     * 设置父对象ID
     * @param parentId 父对象ID
     */
    public void setParentId(String parentId)
    {
        mo.setProperty(FILESYSTEM.PARENTID, parentId);
    }

    /**
     * 获取父对象名称
     * @return 父对象名称
     */
    public String getParentName()
    {
        return mo.getStrProperty(FILESYSTEM.PARENTNAME);
    }

    /**
     * 设置父对象名称
     * @param parentName 父对象名称
     */
    public void setParentName(String parentName)
    {
        mo.setProperty(FILESYSTEM.PARENTNAME, parentName);
    }

    /**
     * 获取文件系统健康状态
     * @return 健康状态
     */
    public HealthStatusE getHealthStatusE()
    {
        return HealthStatusE
            .valueOf(mo.getIntProperty(FILESYSTEM.HEALTHSTATUS));
    }

    /**
     * 设置文件系统健康状态
     * @param healthStatusE 文件系统健康状态
     */
    public void setHealthStatusE(HealthStatusE healthStatusE)
    {
        mo.setProperty(FILESYSTEM.HEALTHSTATUS,
            Integer.parseInt(String.valueOf(healthStatusE.getValue())));
    }

    /**
     * 获取文件系统运行状态
     * @return 运行状态
     */
    public RunningStatusE getRunningStatusE()
    {
        return RunningStatusE.valueOf(mo
            .getIntProperty(FILESYSTEM.RUNNINGSTATUS));
    }

    /**
     * 设置文件系统运行状态
     * @param runningStatusE 运行状态
     */
    public void setRunningStatusE(RunningStatusE runningStatusE)
    {
        mo.setProperty(FILESYSTEM.RUNNINGSTATUS,
            Integer.parseInt(String.valueOf(runningStatusE.getValue())));
    }

    /**
     * 获取文件系统描述
     * @return 文件系统描述
     */
    public String getDescription()
    {
        return mo.getStrProperty(FILESYSTEM.DESCRIPTION);
    }

    /**
     * 设置文件系统描述
     * @param description 文件系统描述
     */
    public void setDescription(String description)
    {
        mo.setProperty(FILESYSTEM.DESCRIPTION, description);
    }

    /**
     * 获取租户ID
     * @return 租户ID
     */
    public Long getTenancyId()
    {
        return mo.getLongProperty(FILESYSTEM.TENANCYID);
    }

    /**
     * 设置租户ID
     * @param tenancyId 租户ID
     */
    public void setTenancyId(Long tenancyId)
    {
        mo.setProperty(FILESYSTEM.TENANCYID, tenancyId);
    }

    /**
     * 获取空间分配类型
     * @return 空间分配类型
     */
    public LUNAllocTypeE getAllocType()
    {
        return LUNAllocTypeE.valueOf(mo
            .getIntProperty(FILESYSTEM.ALLOCCAPACITY));
    }

    /**
     * 设置空间分配方式
     * @param allocType 控件分配方式
     */
    public void setAllocType(LUNAllocTypeE allocType)
    {
        mo.setProperty(FILESYSTEM.ALLOCTYPE,
            Integer.parseInt(String.valueOf(allocType.getValue())));
    }

    /**
     * 获取配置容量
     * @return 配置容量
     */
    public Long getCapacity()
    {
        return mo.getLongProperty(FILESYSTEM.CAPACITY);
    }

    /**
     * 设置配置容量
     * @param capacity 配置容量
     */
    public void setCapacity(Long capacity)
    {
        mo.setProperty(FILESYSTEM.CAPACITY, capacity);
    }

    /**
     * 获取初始分配容量
     * @return 初始分配容量
     */
    public Long getInitialAllocCapacity()
    {
        return mo.getLongProperty(FILESYSTEM.INITIALALLOCCAPACITY);
    }

    /**
     * 设置初始分配容量
     * @param initialAllocCapacity 初始分配容量
     */
    public void setInitialAllocCapacity(Long initialAllocCapacity)
    {
        mo.setProperty(FILESYSTEM.INITIALALLOCCAPACITY, initialAllocCapacity);
    }

    /**
     * 获取快照预留空间
     * @return 快照预留空间
     */
    public Long getSnapshotReservePer()
    {
        return mo.getLongProperty(FILESYSTEM.SNAPSHOTRESERVEPER);
    }

    /**
     * 设置快照预留空间
     * @param snapshotReservePer 快照预留空间
     */
    public void setSnapshotReservePer(Long snapshotReservePer)
    {
        mo.setProperty(FILESYSTEM.SNAPSHOTRESERVEPER, snapshotReservePer);
    }

    /**
     * 设置是否允许自动删除创建的快照
     * @return 是否允许自动删除创建的快照
     */
    public Boolean getAutoDelSnapshotEnable()
    {
        return mo.getBoolProperty(FILESYSTEM.AUTODELSNAPSHOTENABLE);
    }

    /**
     * 设置是否允许自动删除创建的快照
     * @param autoDelSnapshotEnable 是否允许自动删除创建的快照
     */
    public void setAutoDelSnapshotEnable(Boolean autoDelSnapshotEnable)
    {
        mo.setProperty(FILESYSTEM.AUTODELSNAPSHOTENABLE, autoDelSnapshotEnable);
    }

    /**
     * 获取快照已使用空间
     * @return 快照已使用空间
     */
    public Long getSnapshotUseCapacity()
    {
        return mo.getLongProperty(FILESYSTEM.SNAPSHOTUSECAPACITY);
    }

    /**
     * 设置快照已使用空间
     * @param snapshotUseCapacity 快照已用空间
     */
    public void setsnapshotUseCapacity(Long snapshotUseCapacity)
    {
        mo.setProperty(FILESYSTEM.SNAPSHOTUSECAPACITY, snapshotUseCapacity);
    }

    /**
     * 获取总空间容量告警阈值
     * @return 总空间容量告警阈值
     */
    public Long getCapacityThresHold()
    {
        return mo.getLongProperty(FILESYSTEM.CAPACITYTHRESHOLD);
    }

    /**
     * 设置总空间容量告警阈值
     * @param capacityThresHold 总空间容量告警阈值
     */
    public void setCapacityThresHold(Long capacityThresHold)
    {
        mo.setProperty(FILESYSTEM.CAPACITYTHRESHOLD, capacityThresHold);
    }

    /**
     * 获取实际占用容量
     * @return 实际占用容量
     */
    public Long getAllocCapacity()
    {
        return mo.getLongProperty(FILESYSTEM.ALLOCCAPACITY);
    }

    /**
     * 设置实际占用容量
     * @param allocCapacity 实际占用容量
     */
    public void setAllocCapacity(String allocCapacity)
    {
        mo.setProperty(FILESYSTEM.ALLOCCAPACITY, allocCapacity);
    }

    /**
     * 获取块大小
     * @return 块大小
     */
    public Long getSectorSize()
    {
        return mo.getLongProperty(FILESYSTEM.SECTORSIZE);
    }

    /**
     * 设置块大小
     * @param sectorSize 块大小
     */
    public void setSectorSize(String sectorSize)
    {
        mo.setProperty(FILESYSTEM.SECTORSIZE, sectorSize);
    }

    /**
     * 获取归属控制器
     * @return 归属控制器
     */
    public String getOwningController()
    {
        return mo.getStrProperty(FILESYSTEM.OWNINGCONTROLLER);
    }

    /**
     * 设置归属控制器
     * @param owningController 归属控制器
     */
    public void setOwningController(String owningController)
    {
        mo.setProperty(FILESYSTEM.OWNINGCONTROLLER, owningController);
    }

    /**
     * 获取工作控制器
     * @return 工作控制器
     */
    public String getWorkingController()
    {
        return mo.getStrProperty(FILESYSTEM.WORKINGCONTROLLER);
    }

    /**
     * 设置工作控制器
     * @param workingController 工作控制器
     */
    public void setworkingController(String workingController)
    {
        mo.setProperty(FILESYSTEM.WORKINGCONTROLLER, workingController);
    }

    /**
     * 获取数据校验开关
     * @return 数据校验开关
     */
    public Boolean getChecksumEnable()
    {
        return mo.getBoolProperty(FILESYSTEM.CHECKSUMENABLE);
    }

    /**
     * 获取文件系统IO优先级
     * @return IO优先级
     */
    public PriorityE getIOPriority()
    {
        return PriorityE.valueOf(mo.getIntProperty(FILESYSTEM.IOPRIORITY));
    }

    /**
     * 设置文件系统IO优先级
     * @param iOPriority IO优先级
     */
    public void setIOPriority(String iOPriority)
    {
        mo.setProperty(FILESYSTEM.IOPRIORITY, iOPriority);
    }

    /**
     * 获取Cache Partition ID
     * @return Cache Partition ID
     */
    public String getCachePartitionId()
    {
        return mo.getStrProperty(FILESYSTEM.CACHEPARTITIONID);
    }

    /**
     * 设置Cache Partition ID
     * @param cachePartitionId Cache Partition ID
     */
    public void setCachePartitionId(String cachePartitionId)
    {
        mo.setProperty(FILESYSTEM.CACHEPARTITIONID, cachePartitionId);
    }

    /**
     * 获取是否启用压缩
     * @return 是否启用压缩
     */
    public Boolean getEnableCompression()
    {
        return mo.getBoolProperty(FILESYSTEM.ENABLECOMPRESSION);
    }

    /**
     * 设置是否启用压缩
     * @param enableCompression 是否启用压缩
     */
    public void setEnableCompression(Boolean enableCompression)
    {
        mo.setProperty(FILESYSTEM.ENABLECOMPRESSION, enableCompression);
    }

    /**
     * 压缩算法，枚举型，压缩算法的类型尚未获取----------？
     * @return 压缩算法
     */
    public String getCompression()
    {
        return mo.getStrProperty(FILESYSTEM.COMPRESSION);
    }

    /**
     * 设置压缩算法
     * @param compression 压缩算法
     */
    public void setCompression(String compression)
    {
        mo.setProperty(FILESYSTEM.COMPRESSION, compression);
    }

    /**
     * 获取启用或禁用重删
     * @return 启用或禁用重删
     */
    public Boolean getEnableDdup()
    {
        return mo.getBoolProperty(FILESYSTEM.ENABLEDEDUP);
    }

    /**
     * 设置启用或禁用重删
     * @param enableDdup 启用或禁用重删
     */
    public void setEnableDdup(Boolean enableDdup)
    {
        mo.setProperty(FILESYSTEM.ENABLEDEDUP, enableDdup);
    }

    /**
     * 获取 WORM_TYPE_E 枚举型，类型尚未获取--------？
     * @return worm类型
     */
    public String getWormType()
    {
        return mo.getStrProperty(FILESYSTEM.WORMTYPE);
    }

    /**
     * 设置worm类型
     * @param wormType worm类型
     */
    public void setWormType(String wormType)
    {
        mo.setProperty(FILESYSTEM.WORMTYPE, wormType);
    }

    /**
     * 获取文件最小保护期
     * @return 文件最小保护期
     */
    public Long getWormMinProtectPeriod()
    {
        return mo.getLongProperty(FILESYSTEM.WORMMINPROTECTPERIOD);
    }

    /**
     * 设置文件最小保护期
     * @param wormMinProtectPeriod 文件最小保护期
     */
    public void setWormMinProtectPeriod(Long wormMinProtectPeriod)
    {
        mo.setProperty(FILESYSTEM.WORMMINPROTECTPERIOD, wormMinProtectPeriod);
    }

    /**
     * 获取文件最大保护期
     * @return 文件最大保护期
     */
    public Long getWormMaxProtectPeriod()
    {
        return mo.getLongProperty(FILESYSTEM.WORMMAXPROTECTPERIOD);
    }

    /**
     * 设置文件最大保护期
     * @param wormMaxProtectPeriod 文件最大保护期
     */
    public void setWormMaxProtectPeriod(Long wormMaxProtectPeriod)
    {
        mo.setProperty(FILESYSTEM.WORMMAXPROTECTPERIOD, wormMaxProtectPeriod);
    }

    /**
     * 获取文件默认保护期
     * @return 文件默认保护期
     */
    public Long getWormDefProtectPeriod()
    {
        return mo.getLongProperty(FILESYSTEM.WORMDEFPROTECTPERIOD);
    }

    /**
     * 设置文件默认保护期
     * @param wormDefProtectPeriod 文件默认保护期
     */
    public void setWormDefProtectPeriod(Long wormDefProtectPeriod)
    {
        mo.setProperty(FILESYSTEM.WORMDEFPROTECTPERIOD, wormDefProtectPeriod);
    }

    /**
     * WORM自动锁定模式
     * @return WORM自动锁定模式
     */
    public Boolean getWormAutoLock()
    {
        return mo.getBoolProperty(FILESYSTEM.WORMAUTOLOCK);
    }

    /**
     * 设置WORM自动锁定模式
     * @param wormAutoLock WORM自动锁定模式
     */
    public void setWormAutoLock(Boolean wormAutoLock)
    {
        mo.setProperty(FILESYSTEM.WORMAUTOLOCK, wormAutoLock);
    }

    /**
     * 获取WORM自动锁定的时间
     * @return WORM自动锁定的时间
     */
    public Long getWormAutoLockTime()
    {
        return mo.getLongProperty(FILESYSTEM.WORMAUTOLOCKTIME);
    }

    /**
     * 设置WORM自动锁定的时间
     * @param wormAutoLockTime WORM自动锁定的时间
     */
    public void setWormAutoLockTime(Long wormAutoLockTime)
    {
        mo.setProperty(FILESYSTEM.WORMAUTOLOCKTIME, wormAutoLockTime);
    }

    /**
     * 获取worm自动删除模式
     * @return worm自动删除模式
     */
    public Boolean getWormAutoDel()
    {
        return mo.getBoolProperty(FILESYSTEM.WORMAUTODEL);
    }

    /**
     * 设置WORM自动删除模式
     * @param wormAutoDel WORM自动删除模式
     */
    public void setWormAutoDel(Boolean wormAutoDel)
    {
        mo.setProperty(FILESYSTEM.WORMAUTODEL, wormAutoDel);
    }

    /**
     * 快照目录是否可见
     * @return false
     */
    public Boolean getIsShowSnapDir()
    {
        return false;
    }

    /**
     * 获取数据迁移策略
     * @return 数据迁移策略
     */
    public MigrateLUNPolicyE getDataTransferPolicy()
    {
        return MigrateLUNPolicyE.valueOf(mo
            .getIntProperty(FILESYSTEM.DATATRANSFERPOLICY));
    }

    /**
     * 设置数据迁移策略
     * @param dataTransferPolicy 数据迁移策略
     */
    public void setDataTransferPolicy(MigrateLUNPolicyE dataTransferPolicy)
    {
        mo.setProperty(FILESYSTEM.DATATRANSFERPOLICY,
            Integer.parseInt(String.valueOf(dataTransferPolicy.getValue())));
    }

    /**
     * 获取初始分配策略
     * @return 初始分配策略
     */
    public InitTierPolicyE getInitialDistributePolicy()
    {
        return InitTierPolicyE.valueOf(mo
            .getIntProperty(FILESYSTEM.INITIALDISTRIBUTEPOLICY));
    }

    /**
     * 设置初始分配策略
     * @param initialDistributePolicy 初始分配策略
     */
    public void setInitialDistributePolicy(
        InitTierPolicyE initialDistributePolicy)
    {
        mo.setProperty(FILESYSTEM.INITIALDISTRIBUTEPOLICY, Integer
            .parseInt(String.valueOf(initialDistributePolicy.getValue())));
    }

    /**
     * 获取配额开关
     * @return 配额开关
     */
    public Long getQuotaStatus()
    {
        return mo.getLongProperty(FILESYSTEM.QUOTASTATUS);
    }

    /**
     * 设置配额开关
     * @param quotaStatus 配额开关
     */
    public void setQuotaStatus(Long quotaStatus)
    {
        mo.setProperty(FILESYSTEM.QUOTASTATUS, quotaStatus);
    }

    /**
     * 回收站开关
     * @return 回收站开关
     */
    public Long getRecycleSwitch()
    {
        return mo.getLongProperty(FILESYSTEM.RECYCLESWITCH);
    }

    /**
     * 设置回收站开关
     * @param recycleSwitch 回收站开关
     */
    public void setRecycleSwitch(Long recycleSwitch)
    {
        mo.setProperty(FILESYSTEM.RECYCLESWITCH, recycleSwitch);
    }

    /**
     * 获取回收站文件保留时间
     * @return 回收站文件保留时间
     */
    public Long getRecycleHoldTime()
    {
        return mo.getLongProperty(FILESYSTEM.RECYCLEHOLDTIME);
    }

    /**
     * 设置回收站文件保留时间
     * @param recycleHoldTime 回收站文件保留时间
     */
    public void setRecycleHoldTime(Long recycleHoldTime)
    {
        mo.setProperty(FILESYSTEM.RECYCLEHOLDTIME, recycleHoldTime);
    }

    /**
     * 获取回收站文件空间阀值
     * @return 回收站文件空间阀值
     */
    public Long getRecycleThresHold()
    {
        return mo.getLongProperty(FILESYSTEM.RECYCLETHRESHOLD);
    }

    /**
     * 设置回收站文件空间阀值
     * @param recycleThresHold 回收站文件空间阀值
     */
    public void setRecycleThresHold(Long recycleThresHold)
    {
        mo.setProperty(FILESYSTEM.RECYCLETHRESHOLD, recycleThresHold);
    }

    /**
     * 获取超过storage pool低告警水位状态信息（开启，关闭）
     * @return 状态信息
     */
    public Long getRecycleAutoCleanSwitch()
    {
        return mo.getLongProperty(FILESYSTEM.RECYCLEAUTOCLEANSWITCH);
    }

    /**
     * 设置超过storage pool低告警水位状态信息（开启，关闭）
     * @param recycleAutoCleanSwitch 状态信息
     */
    public void setRecycleAutoCleanSwitch(Long recycleAutoCleanSwitch)
    {
        mo.setProperty(FILESYSTEM.RECYCLEAUTOCLEANSWITCH,
            recycleAutoCleanSwitch);
    }

    /**
     * 方法 ： getCount
     * @return long 返回结果
     */
    protected Long getCount()
    {
        return mo.getLongProperty(HOST.COUNT);
    }

    /**
     * 对count进行赋值
     * @param count 方法参数：count
     */
    protected void setCount(long count)
    {
        mo.setProperty(HOST.COUNT, count);
    }

}
