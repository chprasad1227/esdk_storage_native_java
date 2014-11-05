package com.huawei.ism.openapi.nas.localresgroup;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.ResTypeE;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.LOCALRESUSER;
import com.huawei.ism.openapi.common.model.MO;

/**
 * LocalResGroup数据对象
 * @author gWX183785
 * @version V100R001C10
 */
public class LocalResGroupMO
{

    private final MO mo;

    /**
     * 初始化方法
     */
    public LocalResGroupMO()
    {
        this.mo = new MO();
    }

    /**
     * 初始化方法
     * @param mo LocalResGroup对象
     */
    public LocalResGroupMO(MO mo)
    {
        this.mo = mo;
    }

    /**
     * 初始化方法
     * @param jObject JSON数据对象
     */
    public LocalResGroupMO(JSONObject jObject)
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
     * 获取 Id
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
     * 获取 name
     * @return name
     */
    public String getName()
    {
        return mo.getStrProperty(LOCALRESUSER.NAME);
    }

    /**
     * 设置名称
     * @param name 名称
     */
    public void setName(String name)
    {
        mo.setProperty(LOCALRESUSER.NAME, name);
    }

    /**
     * 获取 描述
     * @return 描述
     */
    public String getDescription()
    {
        return mo.getStrProperty(LOCALRESUSER.DESCRIPTION);
    }

    /**
     * 设置 描述
     * @param description 描述
     */
    public void setDescription(String description)
    {
        mo.setProperty(LOCALRESUSER.DESCRIPTION, description);
    }

    /**
     * 获取本地资源用户ID(0表示全局）
     * @return 本地资源用户ID
     */
    public Long getTenancyId()
    {
        return mo.getLongProperty(LOCALRESUSER.TENANCYID);
    }

    /**
     * 设置本地资源用户ID(0表示全局）
     * @param tenancyId 本地资源用户ID
     */
    public void setTenancyId(Long tenancyId)
    {
        mo.setProperty(LOCALRESUSER.TENANCYID, tenancyId);
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
