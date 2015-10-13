package com.huawei.ism.openapi.replicationpair;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ArrayCfgConstant;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.DDP_COMP_LEVEL_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.EXC_AND_REC_MODE_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RESOURCE_ACCESS_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RM_LUN_MIRROR_STATE_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RM_MODEL_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RM_UPDATE_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.SpeedLevelE;
import com.huawei.ism.openapi.common.keydeifines.TLV.REPLICATIONPAIR;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * 主机组对象
 * @author gWX183785
 * @version V100R001C10
 */
public class ReplicationPairMO
{

    private final MO mo;

    /**
     * 初始化方法
     * @param jObject json对象
     */
    protected ReplicationPairMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
    }

    /**
     * 初始化方法
     */
    public ReplicationPairMO()
    {
        this.mo = new MO();
        mo.setProperty(REPLICATIONPAIR.TYPE, MOType.REPLICATIONPAIR.getValue());
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
     * 方法 ： getId
     * 
     * @return String 返回结果
     */
    public String getId()
    {
        return mo.getStrProperty(REPLICATIONPAIR.ID);
    }

    /**
     * 对id进行赋值
     * @param id 方法参数：id
     */
    public void setId(String id)
    {
        mo.setProperty(REPLICATIONPAIR.ID, id);
    }

    /**
     * 方法 ： getHealthStatus
     * 
     * @return HealthStatus
     */
    public HealthStatusE getHealthStatus()
    {
        return HealthStatusE.valueOf(mo
            .getIntProperty(REPLICATIONPAIR.HEALTHSTATUS));
    }

    /**
     * 对healthStatus进行赋值
     * @param HealthStatusE 方法参数：healthStatus
     */
    public void setHealthStatus(HealthStatusE healthStatus)
    {
        mo.setProperty(REPLICATIONPAIR.HEALTHSTATUS, healthStatus.getValue());
    }

    /**
     * 方法 ： getRunningStatus
     * 
     * @return RunningStatus
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE.valueOf(mo
            .getIntProperty(REPLICATIONPAIR.RUNNINGSTATUS));
    }

    /**
     * 对runningStatus进行赋值
     * @param runningStatus 方法参数：runningStatus
     */
    public void setRunningStatus(RunningStatusE runningStatus)
    {
        mo.setProperty(REPLICATIONPAIR.RUNNINGSTATUS, runningStatus.getValue());
    }

    /**
     * 是否是主端
     * @return isPrimary
     */
    public Boolean isPrimary()
    {
        return mo.getBoolProperty(REPLICATIONPAIR.ISPRIMARY);
    }

    /**
     * 设置是否是主端
     * @param isPrimary
     */
    public void setIsPrimary(boolean isPrimary)
    {
        mo.setProperty(REPLICATIONPAIR.ISPRIMARY, isPrimary);
    }

    /**
     * 方法 ： getLocalResID
     * 
     * @return String 返回结果
     */
    public String getLocalResID()
    {
        return mo.getStrProperty(REPLICATIONPAIR.LOCALRESID);
    }

    /**
     * 对localResID进行赋值
     * @param localResID 方法参数：localResID
     */
    public void setLocalResID(String localResID)
    {
        mo.setProperty(REPLICATIONPAIR.LOCALRESID, localResID);
    }

    /**
     * 方法 ： getLocalResName
     * 
     * @return String 返回结果
     */
    public String getLocalResName()
    {
        return mo.getStrProperty(REPLICATIONPAIR.LOCALRESNAME);
    }

    /**
     * 对localResName进行赋值
     * @param localResName 方法参数：localResName
     */
    public void setLocalResName(String localResName)
    {
        mo.setProperty(REPLICATIONPAIR.LOCALRESNAME, localResName);
    }

    /**
     * getLocalResType
     * 
     * @return SPEED_LEVEL_E 返回结果
     */
    public MOType getLocalResType()
    {
        return MOType.getType(mo.getIntProperty(REPLICATIONPAIR.LOCALRESTYPE));
    }

    /**
     * 设置getLocalResType
     * @param getLocalResType 方法参数：getLocalResType
     */
    public void setLocalResType(MOType localResType)
    {
        mo.setProperty(REPLICATIONPAIR.LOCALRESTYPE, localResType.getValue());
    }

    /**
     * 方法 ： getRemoteDeviceID
     * 
     * @return String 返回结果
     */
    public String getRemoteDeviceID()
    {
        return mo.getStrProperty(REPLICATIONPAIR.REMOTEDEVICEID);
    }

    /**
     * 对remoteDeviceID进行赋值
     * @param remoteDeviceID 方法参数：remoteDeviceID
     */
    public void setRemoteDeviceID(String remoteDeviceID)
    {
        mo.setProperty(REPLICATIONPAIR.REMOTEDEVICEID, remoteDeviceID);
    }

    /**
     * 方法 ： getRemoteDeviceSN
     * 
     * @return String 返回结果
     */
    public String getRemoteDeviceSN()
    {
        return mo.getStrProperty(REPLICATIONPAIR.REMOTEDEVICESN);
    }

    /**
     * 对remoteDeviceSN进行赋值
     * @param remoteDeviceSN 方法参数：remoteDeviceSN
     */
    public void setRemoteDeviceSN(String remoteDeviceSN)
    {
        mo.setProperty(REPLICATIONPAIR.REMOTEDEVICESN, remoteDeviceSN);
    }

    /**
     * 方法 ： getRemoteDeviceName
     * 
     * @return String 返回结果
     */
    public String getRemoteDeviceName()
    {
        return mo.getStrProperty(REPLICATIONPAIR.REMOTEDEVICENAME);
    }

    /**
     * 对remoteDeviceName进行赋值
     * @param remoteDeviceName 方法参数：remoteDeviceName
     */
    public void setRemoteDeviceName(String remoteDeviceName)
    {
        mo.setProperty(REPLICATIONPAIR.REMOTEDEVICENAME, remoteDeviceName);
    }

    /**
     * 方法 ： getRemoteResID
     * 
     * @return String 返回结果
     */
    public String getRemoteResID()
    {
        return mo.getStrProperty(REPLICATIONPAIR.REMOTERESID);
    }

    /**
     * 对remoteResID进行赋值
     * @param remoteResID 方法参数：remoteResID
     */
    public void setRemoteResID(String remoteResID)
    {
        mo.setProperty(REPLICATIONPAIR.REMOTERESID, remoteResID);
    }

    /**
     * 方法 ： getRemoteResName
     * 
     * @return String 返回结果
     */
    public String getRemoteResName()
    {
        return mo.getStrProperty(REPLICATIONPAIR.REMOTERESNAME);
    }

    /**
     * 对remoteResName进行赋值
     * @param remoteResName 方法参数：remoteResName
     */
    public void setRemoteResName(String remoteResName)
    {
        mo.setProperty(REPLICATIONPAIR.REMOTERESNAME, remoteResName);
    }

    /**
     * 是否初始同步
     * @return isFirstSync
     */
    public Boolean isFirstSync()
    {
        return mo.getBoolProperty(REPLICATIONPAIR.ISFIRSTSYNC);
    }

    /**
     * 设置是否初始同步
     * @param isFirstSync
     */
    public void setIsFirstSync(boolean isFirstSync)
    {
        mo.setProperty(REPLICATIONPAIR.ISFIRSTSYNC, isFirstSync);
    }

    /**
     * 方法 ： getCapacity
     * 
     * @return Long 返回结果
     */
    public Long getCapacity()
    {
        return mo.getLongProperty(REPLICATIONPAIR.CAPACITY)
            * ArrayCfgConstant.SECTOR_SIZE;
    }

    /**
     * 对capacity进行赋值
     * @param capacity 方法参数：capacity
     */
    public void setCapacity(Long capacity)
    {
        mo.setProperty(REPLICATIONPAIR.CAPACITY, capacity
            / ArrayCfgConstant.SECTOR_SIZE);
    }

    /**
     * 方法 ： getSynchronizeType
     * 
     * @return RM_UPDATE_TYPE_E 返回结果
     */
    public RM_UPDATE_TYPE_E getSynchronizeType()
    {
        return RM_UPDATE_TYPE_E.valueOf(mo
            .getIntProperty(REPLICATIONPAIR.SYNCHRONIZETYPE));
    }

    /**
     * 对rmUpdateType进行赋值
     * @param rmUpdateType 方法参数：rmUpdateType
     */
    public void setSynchronizeType(RM_UPDATE_TYPE_E rmUpdateType)
    {
        mo.setProperty(REPLICATIONPAIR.SYNCHRONIZETYPE, rmUpdateType.getValue());
    }

    /**
     * 获取恢复策略
     * 
     * @return RM_UPDATE_TYPE_E 返回结果
     */
    public EXC_AND_REC_MODE_E getRecoveryPolicy()
    {
        return EXC_AND_REC_MODE_E.valueOf(mo
            .getIntProperty(REPLICATIONPAIR.RECOVERYPOLICY));
    }

    /**
     * 设置恢复策略
     * @param recoveryPolicy 方法参数：recoveryPolicy
     */
    public void setRecoveryPolicy(EXC_AND_REC_MODE_E recoveryPolicy)
    {
        mo.setProperty(REPLICATIONPAIR.RECOVERYPOLICY,
            recoveryPolicy.getValue());
    }

    /**
     * 方法 ： getReplicationProgress
     * 
     * @return Long 返回结果
     */
    public Long getReplicationProgress()
    {
        return mo.getLongProperty(REPLICATIONPAIR.REPLICATIONPROGRESS);
    }

    // /**
    // * 对replicationProgress进行赋值
    // * @param replicationProgress 方法参数：replicationProgress
    // */
    // public void setReplicationProgress(Long replicationProgress)
    // {
    // mo.setProperty(REPLICATIONPAIR.REPLICATIONPROGRESS, replicationProgress);
    // }

    /**
     * 方法 ： getStartTime
     * 
     * @return String 返回结果
     */
    public String getStartTime()
    {
        return mo.getStrProperty(REPLICATIONPAIR.STARTTIME);
    }

    // /**
    // * 对startTime进行赋值
    // * @param startTime 方法参数：startTime
    // */
    // public void setStartTime(String startTime)
    // {
    // mo.setProperty(REPLICATIONPAIR.STARTTIME, startTime);
    // }

    /**
     * 方法 ： getEndTime
     * 
     * @return String 返回结果
     */
    public String getEndTime()
    {
        return mo.getStrProperty(REPLICATIONPAIR.ENDTIME);
    }

    // /**
    // * 对endTime进行赋值
    // * @param endTime 方法参数：endTime
    // */
    // public void setEndTime(String endTime)
    // {
    // mo.setProperty(REPLICATIONPAIR.ENDTIME, endTime);
    // }

    /**
     * 获取速率
     * 
     * @return SPEED_LEVEL_E 返回结果
     */
    public SpeedLevelE getSpeed()
    {
        return SpeedLevelE.valueOf(mo.getIntProperty(REPLICATIONPAIR.SPEED));
    }

    /**
     * 设置速率
     * @param speed 方法参数：speed
     */
    public void setSpeed(SpeedLevelE speed)
    {
        mo.setProperty(REPLICATIONPAIR.SPEED, speed.getValue());
    }

    /**
     * 方法 ： getTimingVal
     * 
     * @return Long 返回结果
     */
    public Long getTimingVal()
    {
        return mo.getLongProperty(REPLICATIONPAIR.TIMINGVAL);
    }

    /**
     * 对timingVal进行赋值
     * @param timingVal 方法参数：timingVal
     */
    public void setTimingVal(Long timingVal)
    {
        mo.setProperty(REPLICATIONPAIR.TIMINGVAL, timingVal);
    }

    /**
     * 资源是否回滚
     * @return isRollback
     */
    public Boolean isRollback()
    {
        return mo.getBoolProperty(REPLICATIONPAIR.ISROLLBACK);
    }

    // /**
    // * 设置设置资源是否回滚
    // * @param isRollback
    // */
    // public void setIsRollback(boolean isRollback)
    // {
    // mo.setProperty(REPLICATIONPAIR.ISROLLBACK, isRollback);
    // }

    /**
     * 方法 ： getSecResDataStatus
     * 
     * @return RM_LUN_MIRROR_STATE_E 返回结果
     */
    public RM_LUN_MIRROR_STATE_E getSecResDataStatus()
    {
        return RM_LUN_MIRROR_STATE_E.valueOf(mo
            .getIntProperty(REPLICATIONPAIR.SECRESDATASTATUS));
    }

    // /**
    // * 对secResDataStatus进行赋值
    // * @param secResDataStatus 方法参数：secResDataStatus
    // */
    // public void setSecResDataStatus(RM_LUN_MIRROR_STATE_E secResDataStatus)
    // {
    // mo.setProperty(REPLICATIONPAIR.SECRESDATASTATUS,
    // secResDataStatus.getValue());
    // }

    /**
     * 方法 ： getPoolName
     * 
     * @return String 返回结果
     */
    public String getPoolName()
    {
        return mo.getStrProperty(REPLICATIONPAIR.POOLNAME);
    }

    // /**
    // * 对poolName进行赋值
    // * @param poolName 方法参数：poolName
    // */
    // public void setPoolName(String poolName)
    // {
    // mo.setProperty(REPLICATIONPAIR.POOLNAME, poolName);
    // }

    /**
     * 复制模式
     * 
     * @return RM_MODEL_E 返回结果
     */
    public RM_MODEL_E getReplicationModel()
    {
        return RM_MODEL_E.valueOf(mo
            .getIntProperty(REPLICATIONPAIR.REPLICATIONMODEL));
    }

    /**
     * 设置复制模式
     * @param replicationModel 方法参数：replicationModel
     */
    public void setReplicationModel(RM_MODEL_E replicationModel)
    {
        mo.setProperty(REPLICATIONPAIR.REPLICATIONMODEL,
            replicationModel.getValue());
    }

    /**
     * 主端资源数据状态
     * 
     * @return RM_LUN_MIRROR_STATE_E 返回结果
     */
    public RM_LUN_MIRROR_STATE_E getPriResDataStatus()
    {
        return RM_LUN_MIRROR_STATE_E.valueOf(mo
            .getIntProperty(REPLICATIONPAIR.PRIRESDATASTATUS));
    }

    // /**
    // * 设置主端资源数据状态
    // * @param priResDataStatus 方法参数：priResDataStatus
    // */
    // public void setPriResDataStatus(RM_LUN_MIRROR_STATE_E priResDataStatus)
    // {
    // mo.setProperty(REPLICATIONPAIR.PRIRESDATASTATUS,
    // priResDataStatus.getValue());
    // }

    /**
     * LUN读写设置
     * 
     * @return RESOURCE_ACCESS_E 返回结果
     */
    public RESOURCE_ACCESS_E getSecResAccess()
    {
        return RESOURCE_ACCESS_E.valueOf(mo
            .getIntProperty(REPLICATIONPAIR.SECRESACCESS));
    }

    /**
     * 设置LUN读写设置
     * @param secResAccess 方法参数：secResAccess
     */
    public void setSecResAccess(RESOURCE_ACCESS_E secResAccess)
    {
        mo.setProperty(REPLICATIONPAIR.SECRESACCESS, secResAccess.getValue());
    }

    /**
     * 从LUN是否被主机写入过数据
     * @return isSecResBeWrite
     */
    public Boolean isSecResBeWrite()
    {
        return mo.getBoolProperty(REPLICATIONPAIR.ISSECRESBEWRITE);
    }

    /**
     * 设置从LUN是否被主机写入过数据
     * @param isSecResBeWrite
     */
    public void setIsSecResBeWrite(boolean isSecResBeWrite)
    {
        mo.setProperty(REPLICATIONPAIR.ISSECRESBEWRITE, isSecResBeWrite);
    }

    /**
     * 是否属于一致性组
     * @return isInCg
     */
    public Boolean isInCg()
    {
        return mo.getBoolProperty(REPLICATIONPAIR.ISINCG);
    }

    /**
     * 设置是否属于一致性组
     * @param isInCg
     */
    public void setIsInCg(boolean isInCg)
    {
        mo.setProperty(REPLICATIONPAIR.ISINCG, isInCg);
    }

    /**
     * 方法 ： getCgID
     * 
     * @return String 返回结果
     */
    public String getCgID()
    {
        return mo.getStrProperty(REPLICATIONPAIR.CGID);
    }

    /**
     * 对cgID进行赋值
     * @param cgID 方法参数：cgID
     */
    public void setCgID(String cgID)
    {
        mo.setProperty(REPLICATIONPAIR.CGID, cgID);
    }

    /**
     * 方法 ： getCgName
     * 
     * @return String 返回结果
     */
    public String getCgName()
    {
        return mo.getStrProperty(REPLICATIONPAIR.CGNAME);
    }

    /**
     * 对cgName进行赋值
     * @param cgName 方法参数：cgName
     */
    public void setCgName(String cgName)
    {
        mo.setProperty(REPLICATIONPAIR.CGNAME, cgName);
    }

    /**
     * 主从端数据是否一致
     * @return isDataSync
     */
    public Boolean isDataSync()
    {
        return mo.getBoolProperty(REPLICATIONPAIR.ISDATASYNC);
    }

    // /**
    // * 设置主从端数据是否一致
    // * @param isDataSync
    // */
    // public void setIsDataSync(boolean isDataSync)
    // {
    // if (isDataSync)
    // {
    // mo.setProperty(REPLICATIONPAIR.ISDATASYNC, String.valueOf(0));
    // }
    // else
    // {
    // mo.setProperty(REPLICATIONPAIR.ISDATASYNC, String.valueOf(1));
    // }
    // }

    /**
     * 在链路断开时是否允许本地删除
     * @return isLocalDelete
     */
    public Boolean isLocalDelete()
    {
        return mo.getBoolProperty(REPLICATIONPAIR.ISLOCALDELETE);
    }

    /**
     * 设置在链路断开时是否允许本地删除
     * @param isLocalDelete
     */
    public void setIsLocalDelete(boolean isLocalDelete)
    {
        mo.setProperty(REPLICATIONPAIR.ISLOCALDELETE, isLocalDelete);
    }

    /**
     * 删除时是否要维护从LUN的一致性
     * @return toSyncSRWhenDelete
     */
    public Boolean getToSyncSRWhenDelete()
    {
        return mo.getBoolProperty(REPLICATIONPAIR.TOSYNCSRWHENDELETE);
    }

    /**
     * 设置删除时是否要维护从LUN的一致性
     * @param toSyncSRWhenDelete
     */
    public void setToSyncSRWhenDelete(boolean toSyncSRWhenDelete)
    {
        mo.setProperty(REPLICATIONPAIR.TOSYNCSRWHENDELETE, toSyncSRWhenDelete);
    }

    /**
     * 传输数据是否加密
     * @return enableEncrypt
     */
    public Boolean getEnableEncrypt()
    {
        return mo.getBoolProperty(REPLICATIONPAIR.ENABLEENCRYPT);
    }

    /**
     * 设置传输数据是否加密
     * @param enableEncrypt
     */
    public void setEnableEncrypt(boolean enableEncrypt)
    {
        mo.setProperty(REPLICATIONPAIR.ENABLEENCRYPT, enableEncrypt);
    }

    /**
     * 传输数据是否压缩
     * @return enableCompress
     */
    public Boolean getEnableCompress()
    {
        return mo.getBoolProperty(REPLICATIONPAIR.ENABLECOMPRESS);
    }

    /**
     * 设置传输数据是否压缩
     * @param enableCompress
     */
    public void setEnableCompress(boolean enableCompress)
    {
        mo.setProperty(REPLICATIONPAIR.ENABLECOMPRESS, enableCompress);
    }

    /**
     * 传输数据的压缩级别
     * 
     * @return DDP_COMP_LEVEL_E 返回结果
     */
    public DDP_COMP_LEVEL_E getCompressLevel()
    {
        return DDP_COMP_LEVEL_E.valueOf(mo
            .getIntProperty(REPLICATIONPAIR.COMPRESSLEVEL));
    }

    /**
     * 设置传输数据的压缩级别
     * @param compressLevel 方法参数：compressLevel
     */
    public void setCompressLevel(DDP_COMP_LEVEL_E compressLevel)
    {
        mo.setProperty(REPLICATIONPAIR.COMPRESSLEVEL, compressLevel.getValue());
    }

    /**
     * 方法 ： getCapacityByte
     * 
     * @return Long 返回结果
     */
    public Long getCapacityByte()
    {
        return mo.getLongProperty(REPLICATIONPAIR.CAPACITYBYTE);
    }

    // /**
    // * 对capacityByte进行赋值
    // * @param capacityByte 方法参数：capacityByte
    // */
    // public void setCapacityByte(Long capacityByte)
    // {
    // mo.setProperty(REPLICATIONPAIR.CAPACITYBYTE, capacityByte);
    // }

    /**
     * 方法 ： getTransportDataSize
     * 
     * @return Long 返回结果
     */
    public Long getTransportDataSize()
    {
        return mo.getLongProperty(REPLICATIONPAIR.TRANSPORTDATASIZE);
    }

    // /**
    // * 对transportDataSize进行赋值
    // * @param transportDataSize 方法参数：transportDataSize
    // */
    // public void setTransportDataSize(Long transportDataSize)
    // {
    // mo.setProperty(REPLICATIONPAIR.TRANSPORTDATASIZE, transportDataSize);
    // }

    // /**
    // * 方法 ： getLocalSnapVers
    // *
    // * @return Long 返回结果
    // */
    // public Long getLocalSnapVers()
    // {
    // return mo.getLongProperty(REPLICATIONPAIR.LOCALSNAPVERS);
    // }
    //
    // /**
    // * 对localSnapVers进行赋值
    // * @param localSnapVers 方法参数：localSnapVers
    // */
    // public void setLocalSnapVers(Long localSnapVers)
    // {
    // mo.setProperty(REPLICATIONPAIR.LOCALSNAPVERS, localSnapVers);
    // }
    //
    // /**
    // * 方法 ： getRemoteSnapVers
    // *
    // * @return Long 返回结果
    // */
    // public Long getRemoteSnapVers()
    // {
    // return mo.getLongProperty(REPLICATIONPAIR.REMOTESNAPVERS);
    // }
    //
    // /**
    // * 对remoteSnapVers进行赋值
    // * @param remoteSnapVers 方法参数：remoteSnapVers
    // */
    // public void setRemoteSnapVers(Long remoteSnapVers)
    // {
    // mo.setProperty(REPLICATIONPAIR.REMOTESNAPVERS, remoteSnapVers);
    // }
    //
    // /**
    // * 方法 ： getRemoteSnapVers
    // *
    // * @return Long 返回结果
    // */
    // public Long getRemoteSnapExpirationTime()
    // {
    // return mo.getLongProperty(REPLICATIONPAIR.REMOTESNAPEXPIRATIONTIME);
    // }
    //
    // /**
    // * 对remoteSnapExpirationTime进行赋值
    // * @param remoteSnapExpirationTime 方法参数：remoteSnapExpirationTime
    // */
    // public void setRemoteSnapExpirationTime(Long remoteSnapExpirationTime)
    // {
    // mo.setProperty(REPLICATIONPAIR.REMOTESNAPEXPIRATIONTIME,
    // remoteSnapExpirationTime);
    // }
    //
    // /**
    // * 是否启用文件过滤
    // * @return isEnableFilterRule
    // */
    // public Boolean isEnableFilterRule()
    // {
    // return mo.getBoolProperty(REPLICATIONPAIR.ISENABLEFILTERRULE);
    // }
    //
    // /**
    // * 设置是否启用文件过滤
    // * @param isEnableFilterRule
    // */
    // public void setIsEnableFilterRule(boolean isEnableFilterRule)
    // {
    // mo.setProperty(REPLICATIONPAIR.ISENABLEFILTERRULE, isEnableFilterRule);
    // }
    //
    // /**
    // * 定时规则
    // * @return JSONObject
    // */
    // public JSONObject getSynchronizeSchedule()
    // {
    // return new JSONObject(
    // mo.getProperty(REPLICATIONPAIR.SYNCHRONIZESCHEDULE));
    // }
    //
    // /**
    // * 设置定时规则
    // * @param synchronizeSchedule
    // */
    // public void setSynchronizeSchedule(JSONObject synchronizeSchedule)
    // {
    // mo.setProperty(REPLICATIONPAIR.SYNCHRONIZESCHEDULE, synchronizeSchedule);
    // }
    //
    // /**
    // * 过滤规则
    // * @return JSONObject
    // */
    // public JSONObject getFilterRuleDetail()
    // {
    // return new JSONObject(mo.getProperty(REPLICATIONPAIR.FILTERRULEDETAIL));
    // }
    //
    // /**
    // * 设置过滤规则
    // * @param filterRuleDetail
    // */
    // public void setFilterRuleDetail(JSONObject filterRuleDetail)
    // {
    // mo.setProperty(REPLICATIONPAIR.FILTERRULEDETAIL, filterRuleDetail);
    // }
    //
    // /**
    // * 方法 ： getLocalIpAddrPool
    // *
    // * @return String 返回结果
    // */
    // public String getLocalIpAddrPool()
    // {
    // return mo.getStrProperty(REPLICATIONPAIR.LOCALIPADDRPOOL);
    // }
    //
    // /**
    // * 对localIpAddrPool进行赋值
    // * @param localIpAddrPool 方法参数：localIpAddrPool
    // */
    // public void setLocalIpAddrPool(String localIpAddrPool)
    // {
    // mo.setProperty(REPLICATIONPAIR.LOCALIPADDRPOOL, localIpAddrPool);
    // }
    //
    // /**
    // * 方法 ： getRemoteIpAddrPool
    // *
    // * @return String 返回结果
    // */
    // public String getRemoteIpAddrPool()
    // {
    // return mo.getStrProperty(REPLICATIONPAIR.REMOTEIPADDRPOOL);
    // }
    //
    // /**
    // * 对remoteIpAddrPool进行赋值
    // * @param remoteIpAddrPool 方法参数：remoteIpAddrPool
    // */
    // public void setRemoteIpAddrPool(String remoteIpAddrPool)
    // {
    // mo.setProperty(REPLICATIONPAIR.REMOTEIPADDRPOOL, remoteIpAddrPool);
    // }
    //
    // /**
    // * 方法 ： getWorkerPerNode
    // *
    // * @return Long 返回结果
    // */
    // public Long getWorkerPerNode()
    // {
    // return mo.getLongProperty(REPLICATIONPAIR.WORKERPERNODE);
    // }
    //
    // /**
    // * 对workerPerNode进行赋值
    // * @param workerPerNode 方法参数：workerPerNode
    // */
    // public void setWorkerPerNode(Long workerPerNode)
    // {
    // mo.setProperty(REPLICATIONPAIR.WORKERPERNODE, workerPerNode);
    // }
    //
    // /**
    // * 是否启用重删
    // * @return isEnableDedupe
    // */
    // public Boolean isEnableDedupe()
    // {
    // return mo.getBoolProperty(REPLICATIONPAIR.ISENABLEDEDUPE);
    // }
    //
    // /**
    // * 设置是否启用重删
    // * @param isEnableDedupe
    // */
    // public void setIsEnableDedupe(boolean isEnableDedupe)
    // {
    // mo.setProperty(REPLICATIONPAIR.ISENABLEDEDUPE, isEnableDedupe);
    // }
    //
    // /**
    // * 方法 ： getRemainTime
    // *
    // * @return Long 返回结果
    // */
    // public Long getRemainTime()
    // {
    // return mo.getLongProperty(REPLICATIONPAIR.REMAINTIME);
    // }
    //
    // /**
    // * 对remainTime进行赋值
    // * @param remainTime 方法参数：remainTime
    // */
    // public void setRemainTime(Long remainTime)
    // {
    // mo.setProperty(REPLICATIONPAIR.REMAINTIME, remainTime);
    // }
    //
}
