package com.huawei.ism.openapi.iscsiinitiator;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.TLV.ISCSIInitiator;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * ISCSI启动器对象
 * @author gWX183785
 * @version V100R001C10
 */
public class ISCSIInitiatorMO
{

    private final MO mo;

    /**
     * 初始化方法
     * @param jObject json对象
     */
    protected ISCSIInitiatorMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
    }

    /**
     * 初始化方法
     */
    public ISCSIInitiatorMO()
    {
        this.mo = new MO();
        mo.setProperty(ISCSIInitiator.TYPE, MOType.ISCSI_INITIATOR.getValue());
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
        return mo.getStrProperty(ISCSIInitiator.ID);
    }

    /**
     * 对id进行赋值
     * @param id 方法参数：id
     */
    public void setId(String id)
    {
        mo.setProperty(ISCSIInitiator.ID, id);
    }

    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(ISCSIInitiator.NAME);
    }

    /**
     * 对name进行赋值
     * @param name 方法参数：name
     */
    public void setName(String name)
    {
        mo.setProperty(ISCSIInitiator.NAME, name);
    }

    /**
     * 获取父类对象类型
     * @return String 返回结果
     */
    public MOType getParentType()
    {
        return MOType.getType(mo.getIntProperty(ISCSIInitiator.PARENTTYPE));

    }

    /**
     * 设置父类对象类型
     * @param parentType 父类类型
     */
    public void setParentType(MOType parentType)
    {
        mo.setProperty(ISCSIInitiator.PARENTTYPE, parentType.getValue());
    }

    /**
     * 获取父类对象ID
     * @return 返回结果
     */
    public String getParentId()
    {
        return mo.getStrProperty(ISCSIInitiator.PARENTID);
    }

    /**
     * 设置父类对象ID
     * @param id 父对象id
     */
    public void setParentId(String id)
    {
        mo.setProperty(ISCSIInitiator.PARENTID, id);
    }

    /**
     * 获取父类对象name
     * @return 返回结果
     */
    public String getParentName()
    {
        return mo.getStrProperty(ISCSIInitiator.PARENTNAME);
    }

    /**
     * 获取控制器健康状态
     * @return 返回结果
     */
    public HealthStatusE getHealthStatus()
    {
        return HealthStatusE.valueOf(mo
            .getIntProperty(ISCSIInitiator.HEALTHSTATUS));
    }

    /**
     * 获取控制器运行状态
     * @return 返回结果
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE.valueOf(mo
            .getIntProperty(ISCSIInitiator.RUNNINGSTATUS));
    }

    /**
     * 获取空闲状态
     * @return 返回结果
     */
    public Boolean getIsFree()
    {
        return Boolean
            .valueOf(mo.getProperty(ISCSIInitiator.ISFREE).toString());
    }

    /**
     * 设置空闲状态
     * @param isFree 空闲状态
     */
    public void setIsFree(boolean isFree)
    {
        mo.setProperty(ISCSIInitiator.ISFREE, isFree);
    }

    /**
     * 是否启用CHAP
     * @return 返回结果
     */
    public Boolean getUseChap()
    {
        return Boolean.valueOf(mo.getProperty(ISCSIInitiator.USECHAP)
            .toString());
    }

    /**
     * 设置是否启用CHAP
     * @param isUseChap 是否启用
     */
    public void setUseChap(Boolean isUseChap)
    {
        mo.setProperty(ISCSIInitiator.USECHAP, isUseChap);
    }

    /**
     * 获取CHAP的名字
     * @return 返回结果
     */
    public String getChapName()
    {
        return String.valueOf(mo.getProperty(ISCSIInitiator.CHAPNAME));
    }

    /**
     * 设置chap的名字
     * @param name 名字
     */
    public void setChapName(String name)
    {
        mo.setProperty(ISCSIInitiator.CHAPNAME, name);
    }

    /**
     * 设置CHAP密码
     * @param password 密码
     */
    public void setChapPassword(String password)
    {
        mo.setProperty(ISCSIInitiator.CHAPPWD, password);
    }
}
