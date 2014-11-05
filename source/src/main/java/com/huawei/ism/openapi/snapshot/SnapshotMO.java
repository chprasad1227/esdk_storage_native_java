package com.huawei.ism.openapi.snapshot;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.SpeedLevelE;
import com.huawei.ism.openapi.common.keydeifines.TLV.SNAPSHOT;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * 快照MO
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class SnapshotMO
{

    private final MO mo;

    /**
     * 快照构造函数
     * @param mo 快照mo
     */
    public SnapshotMO(MO mo)
    {
        this.mo = mo;
    }

    /**
     * 快照构造函数
     */
    public SnapshotMO()
    {
        this.mo = new MO();
    }

    /**
     * 快照构造函数
     * @param jObject 快照对应的json数组
     */
    protected SnapshotMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
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
     * 获取快照id
     * @return 返回快照id
     */
    public String getId()
    {
        return mo.getStrProperty(SNAPSHOT.ID);
    }

    /**
     * 设置快照id
     * @param id 快照id
     */
    public void setId(String id)
    {
        mo.setProperty(SNAPSHOT.ID, id);
    }

    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(SNAPSHOT.NAME);
    }

    /**
     * 对name进行赋值
     * 
     * @param name 方法参数：name
     */
    public void setName(String name)
    {
        mo.setProperty(SNAPSHOT.NAME, name);
    }

    /**
     * 方法 ： getParentType
     * 
     * @return MOType 返回结果
     */
    public MOType getParentType()
    {
        return MOType.LUN;
    }

    /**
     * 对parentType进行赋值
     * 
     * @param parentType 方法参数：parentType
     */
    public void setParentType(MOType parentType)
    {
        mo.setProperty(SNAPSHOT.PARENTTYPE, parentType.getValue());
    }

    /**
     * 方法 ： getParentId
     * 
     * @return String 返回结果
     */
    public String getParentId()
    {
        return mo.getStrProperty(SNAPSHOT.PARENTID);
    }

    /**
     * 对parentID进行赋值
     * 
     * @param parentID 方法参数：parentID
     */
    public void setParentId(String parentID)
    {
        mo.setProperty(SNAPSHOT.PARENTID, parentID);
    }

    /**
     * 方法 ： getParentName
     * 
     * @return String 返回结果
     */
    public String getParentName()
    {
        return mo.getStrProperty(SNAPSHOT.PARENTNAME);
    }

    /**
     * 方法 ： getHealthStatus
     * 
     * @return HEALTH_STATUS_E 返回结果
     */
    public HealthStatusE getHealthStatus()
    {
        return HealthStatusE.valueOf(mo.getIntProperty(SNAPSHOT.HEALTHSTATUS));
    }

    /**
     * 方法 ： setHealthStatus
     * @param healthStatusE 方法参数：healthStatusE
     */
    public void setHealthStatus(HealthStatusE healthStatusE)
    {
        mo.setProperty(SNAPSHOT.HEALTHSTATUS,
            Integer.parseInt(String.valueOf(healthStatusE.getValue())));
    }

    /**
     * 方法 ： getRunningStatus
     * 
     * @return RUNNING_STATUS_E 返回结果
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE
            .valueOf(mo.getIntProperty(SNAPSHOT.RUNNINGSTATUS));
    }

    /**
     * 方法 ： setRunningStatus
     * 
     * @param runningStatusE 方法参数：runningStatusE
     */
    public void setRunningStatus(RunningStatusE runningStatusE)
    {
        mo.setProperty(SNAPSHOT.RUNNINGSTATUS,
            Integer.parseInt(String.valueOf(runningStatusE.getValue())));
    }

    /**
     * 方法 ： getDescription
     * 
     * @return String 返回结果
     */
    public String getDescription()
    {
        return mo.getStrProperty(SNAPSHOT.DESCRIPTION);
    }

    /**
     * 对description进行赋值
     * @param description 方法参数：description
     */
    public void setDescription(String description)
    {
        mo.setProperty(SNAPSHOT.DESCRIPTION, description);
    }

    /**
     * 方法 ： getTimeStamp
     * 
     * @return Long 返回结果
     */
    public Long getTimeStamp()
    {
        return mo.getLongProperty(SNAPSHOT.TIMESTAMP);
    }

    /**
     * 对timeStamp进行赋值
     * 
     * @param timeStamp 方法参数：timeStamp
     */
    public void setTimeStamp(Long timeStamp)
    {
        mo.setProperty(SNAPSHOT.TIMESTAMP, timeStamp);
    }

    /**
     * 用户角色
     * @return 用户角色对应的long数据
     */
    public Long getUserCapacity()
    {
        return mo.getLongProperty(SNAPSHOT.USERCAPACITY);
    }

    /**
     * 设置用户角色
     * @param userCapacity 用户角色对应的long数据
     */
    public void setUserCapacity(Long userCapacity)
    {
        mo.setProperty(SNAPSHOT.USERCAPACITY, userCapacity);
    }

    /**
     * 快照完全独占空间
     * @return 快照完全独占空间对应的long数据
     */
    public Long getConsumedCapacity()
    {
        return mo.getLongProperty(SNAPSHOT.CONSUMEDCAPACITY);
    }

    /**
     * 设置快照完全独占空间
     * @param consumedCapacity 快照完全独占空间对应的long数据
     */
    public void setConsumedCapacity(Long consumedCapacity)
    {
        mo.setProperty(SNAPSHOT.CONSUMEDCAPACITY, consumedCapacity);
    }

    /**
     * 方法 ： getRollbackSpeed
     * 
     * @return SPEED_LEVEL_E 返回结果
     */
    public SpeedLevelE getRollbackSpeed()
    {
        if (null == mo.getProperty(SNAPSHOT.ROLLBACKSPEED))
        {
            return null;
        }

        int value = mo.getIntProperty(SNAPSHOT.ROLLBACKSPEED);

        return SpeedLevelE.valueOf(value);
    }

    /**
     * 对rollbackSpeed进行赋值
     * @param rollbackSpeed 方法参数：rollbackSpeed
     */
    public void setRollbackSpeed(SpeedLevelE rollbackSpeed)
    {
        mo.setProperty(SNAPSHOT.ROLLBACKSPEED,
            Integer.parseInt(String.valueOf(rollbackSpeed.getValue())));
    }

    /**
     * 方法 ： getCount
     * 
     * @return long 返回结果
     */
    public Long getCount()
    {
        return mo.getLongProperty(SNAPSHOT.COUNT);
    }
}
