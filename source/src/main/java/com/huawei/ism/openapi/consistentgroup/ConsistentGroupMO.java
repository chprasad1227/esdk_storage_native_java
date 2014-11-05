package com.huawei.ism.openapi.consistentgroup;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.EXC_AND_REC_MODE_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RESOURCE_ACCESS_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RM_MODEL_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RM_UPDATE_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.SpeedLevelE;
import com.huawei.ism.openapi.common.keydeifines.TLV.CONSISTENTGROUP;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * 主机组对象
 * @author gWX183785
 * @version V100R001C10
 */
public class ConsistentGroupMO
{

    private final MO mo;

    /**
     * 初始化方法
     * @param jObject json对象
     */
    protected ConsistentGroupMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
    }

    /**
     * 初始化方法
     */
    public ConsistentGroupMO()
    {
        this.mo = new MO();
        mo.setProperty(CONSISTENTGROUP.TYPE, MOType.CONSISTENTGROUP.getValue());
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
        return mo.getStrProperty(CONSISTENTGROUP.ID);
    }

    /**
     * 对id进行赋值
     * @param id 方法参数：id
     */
    public void setId(String id)
    {
        mo.setProperty(CONSISTENTGROUP.ID, id);
    }
    
    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(CONSISTENTGROUP.NAME);
    }

    /**
     * 对name进行赋值
     * @param name 方法参数：name
     */
    public void setName(String name)
    {
        mo.setProperty(CONSISTENTGROUP.NAME, name);
    }

    /**
     * 方法 ： getHealthStatus
     * 
     * @return HealthStatus
     */
    public HealthStatusE getHealthStatus()
    {
        return HealthStatusE.valueOf(mo
            .getIntProperty(CONSISTENTGROUP.HEALTHSTATUS));
    }

    /**
     * 对healthStatus进行赋值
     * @param HealthStatusE 方法参数：healthStatus
     */
    public void setHealthStatus(HealthStatusE healthStatus)
    {
        mo.setProperty(CONSISTENTGROUP.HEALTHSTATUS, healthStatus.getValue());
    }

    /**
     * 在链路断开时是否允许本地删除
     * @return isLocalDelete
     */
    public Boolean isLocalDelete()
    {
        return mo.getBoolProperty(CONSISTENTGROUP.ISLOCALDELETE);
    }

    /**
     * 设置在链路断开时是否允许本地删除
     * @param isLocalDelete
     */
    public void setIsLocalDelete(boolean isLocalDelete)
    {
        mo.setProperty(CONSISTENTGROUP.ISLOCALDELETE, isLocalDelete);
    }

    /**
     * 方法 ： getRunningStatus
     * 
     * @return RunningStatus
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE.valueOf(mo
            .getIntProperty(CONSISTENTGROUP.RUNNINGSTATUS));
    }

    /**
     * 对runningStatus进行赋值
     * @param runningStatus 方法参数：runningStatus
     */
    public void setRunningStatus(RunningStatusE runningStatus)
    {
        mo.setProperty(CONSISTENTGROUP.RUNNINGSTATUS, runningStatus.getValue());
    }

    /**
     * 获取主机组描述
     * @return String 返回结果
     */
    public String getDescription()
    {
        return mo.getStrProperty(CONSISTENTGROUP.DESCRIPTION);
    }

    /**
     * 对主机组描述设置描述
     * @param description 描述
     */
    public void setDescription(String description)
    {
        mo.setProperty(CONSISTENTGROUP.DESCRIPTION, description);
    }

    /**
     * 对象统计数量
     * 
     * @return Long 返回结果
     */
    public Long getCount()
    {
        return mo.getLongProperty(CONSISTENTGROUP.COUNT);
    }

    /**
     * 设置对象数量
     * @param count 方法参数：count
     */
    public void setCount(Long count)
    {
        mo.setProperty(CONSISTENTGROUP.COUNT, count);
    }

    /**
     * 获取恢复策略
     * 
     * @return RM_UPDATE_TYPE_E 返回结果
     */
    public EXC_AND_REC_MODE_E getRecoveryPolicy()
    {
        return EXC_AND_REC_MODE_E.valueOf(mo
            .getIntProperty(CONSISTENTGROUP.RECOVERYPOLICY));
    }

    /**
     * 设置恢复策略
     * @param recoveryPolicy 方法参数：recoveryPolicy
     */
    public void setRecoveryPolicy(EXC_AND_REC_MODE_E recoveryPolicy)
    {
        mo.setProperty(CONSISTENTGROUP.RECOVERYPOLICY,
            recoveryPolicy.getValue());
    }

    /**
     * 复制模式
     * 
     * @return RM_MODEL_E 返回结果
     */
    public RM_MODEL_E getReplicationModel()
    {
        return RM_MODEL_E.valueOf(mo
            .getIntProperty(CONSISTENTGROUP.REPLICATIONMODEL));
    }

    /**
     * 设置复制模式
     * @param replicationModel 方法参数：replicationModel
     */
    public void setReplicationModel(RM_MODEL_E replicationModel)
    {
        mo.setProperty(CONSISTENTGROUP.REPLICATIONMODEL,
            replicationModel.getValue());
    }

    /**
     * 获取速率
     * 
     * @return SPEED_LEVEL_E 返回结果
     */
    public SpeedLevelE getSpeed()
    {
        return SpeedLevelE.valueOf(mo.getIntProperty(CONSISTENTGROUP.SPEED));
    }

    /**
     * 设置速率
     * @param speed 方法参数：speed
     */
    public void setSpeed(SpeedLevelE speed)
    {
        mo.setProperty(CONSISTENTGROUP.SPEED, speed.getValue());
    }

    /**
     * 方法 ： getSynchronizeType
     * 
     * @return RM_UPDATE_TYPE_E 返回结果
     */
    public RM_UPDATE_TYPE_E getSynchronizeType()
    {
        return RM_UPDATE_TYPE_E.valueOf(mo
            .getIntProperty(CONSISTENTGROUP.SYNCHRONIZETYPE));
    }

    /**
     * 对rmUpdateType进行赋值
     * @param rmUpdateType 方法参数：rmUpdateType
     */
    public void setSynchronizeType(RM_UPDATE_TYPE_E rmUpdateType)
    {
        mo.setProperty(CONSISTENTGROUP.SYNCHRONIZETYPE, rmUpdateType.getValue());
    }

    /**
     * 是否是主端
     * @return isPrimary
     */
    public Boolean isPrimary()
    {
        return mo.getBoolProperty(CONSISTENTGROUP.ISPRIMARY);
    }

    /**
     * 设置是否是主端
     * @param isPrimary
     */
    public void setIsPrimary(boolean isPrimary)
    {
        mo.setProperty(CONSISTENTGROUP.ISPRIMARY, isPrimary);
    }

    /**
     * 方法 ： getTimingVal
     * 
     * @return Long 返回结果
     */
    public Long getTimingVal()
    {
        return mo.getLongProperty(CONSISTENTGROUP.TIMINGVAL);
    }

    /**
     * 对timingVal进行赋值
     * @param timingVal 方法参数：timingVal
     */
    public void setTimingVal(Long timingVal)
    {
        mo.setProperty(CONSISTENTGROUP.TIMINGVAL, timingVal);
    }

    /**
     * LUN读写设置
     * 
     * @return RESOURCE_ACCESS_E 返回结果
     */
    public RESOURCE_ACCESS_E getSecResAccess()
    {
        return RESOURCE_ACCESS_E.valueOf(mo
            .getIntProperty(CONSISTENTGROUP.SECRESACCESS));
    }

    /**
     * 设置LUN读写设置
     * @param secResAccess 方法参数：secResAccess
     */
    public void setSecResAccess(RESOURCE_ACCESS_E secResAccess)
    {
        mo.setProperty(CONSISTENTGROUP.SECRESACCESS, secResAccess.getValue());
    }

    /**
     * 方法 ： getTimingValInSec
     * 
     * @return Long 返回结果
     */
    public Long getTimingValInSec()
    {
        return mo.getLongProperty(CONSISTENTGROUP.TIMINGVALINSEC);
    }

    /**
     * 对timingValInSec进行赋值
     * @param timingValInSec 方法参数：timingValInSec
     */
    public void setTimingValInSec(Long timingValInSec)
    {
        mo.setProperty(CONSISTENTGROUP.TIMINGVALINSEC, timingValInSec);
    }

    /**
     * 方法 ： getRmList
     * 
     * @return String[] 返回结果
     */
    public String[] getRmList()
    {
        return mo.getStrArrayProperty(CONSISTENTGROUP.RMLIST);
    }

    /**
     * 对rmList进行赋值
     * @param rmList 方法参数：rmList
     */
    public void setRmList(String[] rmList)
    {
        mo.setProperty(CONSISTENTGROUP.RMLIST, rmList);
    }

}
