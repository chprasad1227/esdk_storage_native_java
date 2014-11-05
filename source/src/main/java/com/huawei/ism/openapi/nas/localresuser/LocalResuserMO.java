package com.huawei.ism.openapi.nas.localresuser;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.ResTypeE;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.LOCALRESUSER;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * LocalResuser数据对象
 * @author gWX183785
 * @version V100R001C10
 */
public class LocalResuserMO
{

    private final MO mo;

    /**
     * 初始化方法
     */
    public LocalResuserMO()
    {
        this.mo = new MO();
    }

    /**
     * 初始化方法
     * @param mo LocalResuser数据对象
     */
    public LocalResuserMO(MO mo)
    {
        this.mo = mo;
    }

    /**
     * 初始化方法
     * @param jObject JSON对象
     */
    public LocalResuserMO(JSONObject jObject)
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

    public void setAssociateOBJType(MOType moType)
    {
        mo.setProperty(LOCALRESUSER.ASSOCIATEOBJTYPE, String.valueOf(moType.getValue()));
    }

    /**
     * 获取关联对象类型
     * @return 返回结果
     */
    public MOType getAssociateOBJType()
    {
        return MOType.valueOf(mo.getStrProperty(LOCALRESUSER.ASSOCIATEOBJTYPE));
    }

    /**
     * 设置关联对象ID
     * @param id 关联对象ID
     */
    public void setAssociateOBJId(String id)
    {
        mo.setProperty(LOCALRESUSER.ASSOCIATEOBJID, id);
    }

    /**
     * 获取关联对象ID
     * @return 返回结果
     */
    public String getAssociateOBJId()
    {
        return mo.getStrProperty(LOCALRESUSER.ASSOCIATEOBJID);
    }

    /**
     * 获取Id
     * @return id
     */
    public String getId()
    {
        return mo.getStrProperty(LOCALRESUSER.ID);
    }

    /**
     * 设置Id
     * @param id id
     */
    public void setId(String id)
    {
        mo.setProperty(LOCALRESUSER.ID, id);
    }

    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(LOCALRESUSER.NAME);
    }

    /**
     * 对name进行赋值
     * @param name 方法参数：name
     */
    public void setName(String name)
    {
        mo.setProperty(LOCALRESUSER.NAME, name);
    }

    /**
     * 获取描述
     * @return String 返回结果
     */
    public String getDescription()
    {
        return mo.getStrProperty(LOCALRESUSER.DESCRIPTION);
    }

    /**
     * 设置描述
     * @param description 描述
     */
    public void setDescription(String description)
    {
        mo.setProperty(LOCALRESUSER.DESCRIPTION, description);
    }

    /**
     * 获取租户ID(0表示全局）
     * @return 租户ID
     */
    public Long getTenancyId()
    {
        return mo.getLongProperty(LOCALRESUSER.TENANCYID);
    }

    /**
     * 设置租户ID(0表示全局）
     * @param tenancyId 租户ID
     */
    public void setTenancyId(Long tenancyId)
    {
        mo.setProperty(LOCALRESUSER.TENANCYID, tenancyId);
    }

    /**
     * 获取密码
     * @return 密码
     */
    public String getPassword()
    {
        return mo.getStrProperty(LOCALRESUSER.PWD);
    }

    /**
     * 设置密码
     * @param password 密码
     */
    public void setPassword(String password)
    {
        mo.setProperty(LOCALRESUSER.PWD, password);
    }

    /**
     * 获取旧密码
     * @return 旧密码
     */
    public String getOldPassword()
    {
        return mo.getStrProperty(LOCALRESUSER.OLDPWD);
    }

    /**
     * 设置旧密码
     * @param oldPassword 旧密码
     */
    public void setOldPassword(String oldPassword)
    {
        mo.setProperty(LOCALRESUSER.OLDPWD, oldPassword);
    }

    /**
     * 获取用户所归属的主组ID
     * @return 用户所归属的主组ID
     */
    public String getPrimaryGroupId()
    {
        return mo.getStrProperty(LOCALRESUSER.PRIMARYGROUPID);
    }

    /**
     * 设置用户所归属的主组ID
     * @param primaryGroupId 用户所归属的主组ID
     */
    public void setPrimaryGroupId(String primaryGroupId)
    {
        mo.setProperty(LOCALRESUSER.PRIMARYGROUPID, primaryGroupId);
    }

    /**
     * 获取用户所归属的主组
     * @return 用户所归属的主组
     */
    public String getPrimaryGroupName()
    {
        return mo.getStrProperty(LOCALRESUSER.PRIMARYGROUPNAME);
    }

    /**
     * 设置用户所归属的主组
     * @param primaryGroupName 用户所归属的主组
     */
    public void setPrimaryGroupName(String primaryGroupName)
    {
        mo.setProperty(LOCALRESUSER.PRIMARYGROUPNAME, primaryGroupName);
    }

    /**
     * 获取临时租名称
     * @return 临时组名称
     */
    public String[] getGroupNames()
    {
        return mo.getStrArrayProperty(LOCALRESUSER.GROUPNAMES);
    }

    /**
     * 设置临时组名称
     * @param groupNames 临时组名称
     */
    public void setGroupNames(String[] groupNames)
    {
        mo.setProperty(LOCALRESUSER.GROUPNAMES, groupNames);
    }

    /**
     * 获取用户类型
     * @return 用户类型
     */
    public ResTypeE getUserType()
    {
        return ResTypeE.valueOf(mo.getIntProperty(LOCALRESUSER.USERTYPE));
    }

    /**
     * 设置用户类型
     * @param userType 用户类型
     */
    public void setUserType(ResTypeE userType)
    {
        mo.setProperty(LOCALRESUSER.USERTYPE, userType);
    }

    /**
     * 获取是否启用
     * @return 是否启用
     */
    public boolean isStatusEnable()
    {
        return mo.getBoolProperty(LOCALRESUSER.STATUSENABLE);
    }

    /**
     * 设置是否启用
     * @param statusEnable 是否启用
     */
    public void setStatusEnable(boolean statusEnable)
    {
        mo.setProperty(LOCALRESUSER.STATUSENABLE, statusEnable);
    }

    /**
     * 获取临时租类型
     * @return 临时租类型
     */
    public ResTypeE getGroupType()
    {
        return ResTypeE.valueOf(mo.getIntProperty(LOCALRESUSER.GROUPTYPE));
    }

    /**
     * 设置临时租类型
     * @param groupType 临时租类型
     */
    public void setGroupType(ResTypeE groupType)
    {
        mo.setProperty(LOCALRESUSER.GROUPTYPE, groupType);
    }

    /**
     * 方法 ： getCount
     * @return long 返回结果
     */
    protected Long getCount()
    {
        return mo.getLongProperty(LOCALRESUSER.COUNT);
    }

}
