package com.huawei.ism.openapi.fcinitiator;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.TLV.FCInitiator;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * FC启动器MO
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class FcInitiatorMO
{
    private final MO mo;

    /**
     * FcInitiatorMO
     * @param jObject JSONObject
     */
    public FcInitiatorMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
        setParentType(MOType.HOST);
        setType(MOType.FC_INITIATOR);
    }

    /**
     * FcInitiatorMO
     */
    public FcInitiatorMO()
    {
        this.mo = new MO();
        setParentType(MOType.HOST);
        setType(MOType.FC_INITIATOR);
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
     * 方法 ： getParentType
     * 
     * @return MOType 返回结果
     */
    public MOType getParentType()
    {
        return MOType.getType(Integer.parseInt(mo.getProperty(
            FCInitiator.PARENTTYPE).toString()));
    }

    /**
     * 方法 ： getParentId
     * 
     * @return String 返回结果
     */
    public String getParentId()
    {
        return mo.getStrProperty(FCInitiator.PARENTID);
    }

    /**
     * 对id进行赋值
     * 
     * @param id 方法参数：id
     */
    public void setParentId(String id)
    {
        mo.setProperty(FCInitiator.PARENTID, id);
    }

    /**
     * 方法 ： getID
     * 
     * @return String 返回结果
     */
    public String getId()
    {
        return mo.getStrProperty(FCInitiator.ID);
    }

    /**
     * 对id进行赋值
     * 
     * @param id 方法参数：id
     */
    public void setId(String id)
    {
        mo.setProperty(FCInitiator.ID, id);
    }

    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(FCInitiator.NAME);
    }

    /**
     * 方法 ： getParentName
     * 
     * @return String 返回结果
     */
    public String getParentName()
    {
        return mo.getStrProperty(FCInitiator.PARENTNAME);
    }

    /**
     * 对name进行赋值
     * 
     * @param name 方法参数：name
     */
    public void setName(String name)
    {
        mo.setProperty(FCInitiator.NAME, name);
    }

    /**
     * 对parentType进行赋值
     * 
     * @param parentType 方法参数：parentType
     */
    public void setParentType(MOType parentType)
    {
        mo.setProperty(FCInitiator.PARENTTYPE, parentType.getValue());
    }

    /**
     * 方法 ： getHealthStatus
     * 
     * @return HealthStatusE 返回结果
     */
    public HealthStatusE getHealthStatus()
    {
        return HealthStatusE.valueOf(mo
            .getIntProperty(FCInitiator.HEALTHSTATUS));
    }

    /**
     * 方法 ： getRunningStatus
     * 
     * @return RunningStatusE 返回结果
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE.valueOf(mo
            .getIntProperty(FCInitiator.RUNNINGSTATUS));
    }

    /**
     * 方法 ： getIsFree
     * 
     * @return Boolean 返回结果
     */
    public Boolean getIsFree()
    {
        return mo.getBoolProperty(FCInitiator.ISFREE);
    }

    /**
     * 对isFree进行赋值
     * 
     * @param isFree 是否空闲
     */
    public void setIsFree(Boolean isFree)
    {
        mo.setProperty(FCInitiator.ISFREE, isFree);
    }

    /**
     * 对type进行赋值
     * 
     * @param type 类型
     */
    private void setType(MOType type)
    {
        mo.setProperty(FCInitiator.TYPE, type.getValue());
    }
}
