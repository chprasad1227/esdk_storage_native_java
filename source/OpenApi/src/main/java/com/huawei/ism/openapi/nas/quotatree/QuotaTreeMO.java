package com.huawei.ism.openapi.nas.quotatree;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.TLVNAS.QUOTATREE;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * qTree MO
 * @author fWX183786
 * @version V100R001C10
 */
public class QuotaTreeMO
{
    private final MO mo;

    /**
     * 构造函数
     */
    public QuotaTreeMO()
    {
        mo = new MO();
        setType(MOType.QUOTATREE);
        setParentType(MOType.FILESYSTEM);
    }

    /**
     * 构造函数
     * @param jObject qTree对应的jObject
     */
    public QuotaTreeMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
        setType(MOType.QUOTATREE);
        setParentType(MOType.FILESYSTEM);
    }

    /**
     * 设置ID
     * @param id id
     */
    public void setId(String id)
    {
        mo.setProperty(QUOTATREE.ID, id);
    }

    /**
     * 获取ID
     * @return id
     */
    public String getId()
    {
        return mo.getStrProperty(QUOTATREE.ID);
    }

    /**
     * 设置名称
     * @param name 名称
     */
    public void setName(String name)
    {
        mo.setProperty(QUOTATREE.NAME, name);
    }

    /**
     * 获取名称
     * @return 名称
     */
    public String getName()
    {
        return mo.getStrProperty(QUOTATREE.NAME);
    }

    /**
     * 业务接口去除设置parent类型的功能 方法 ： getParentType
     * 
     * @return MOType 返回结果
     */
    public MOType getParentType()
    {
        return MOType.getType(mo.getIntProperty(QUOTATREE.PARENTTYPE));
    }

    /**
     * 方法 ： getParentID
     * @return ParentId
     */
    public String getParentId()
    {
        return mo.getStrProperty(QUOTATREE.PARENTID);
    }

    /**
     * 对parentID进行赋值
     * @param parentId 方法参数：parentID
     */
    public void setParentId(String parentId)
    {
        mo.setProperty(QUOTATREE.PARENTID, parentId);
    }

    /**
     * 设置租户ID
     * @param tenancyId 租户ID
     */
    public void setTenancyId(Long tenancyId)
    {
        mo.setProperty(QUOTATREE.TENANCYID, tenancyId);
    }

    /**
     * 获取租户ID
     * @return 租户ID
     */
    public long getTenancyId()
    {
        return mo.getLongProperty(QUOTATREE.TENANCYID);
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
     * @return long 返回结果
     */
    protected Long getCount()
    {
        return mo.getLongProperty(QUOTATREE.COUNT);
    }

    /**
     * 设置类型
     * @param type 类型
     */
    private void setType(MOType type)
    {
        mo.setProperty(QUOTATREE.TYPE, type.getValue());
    }

    /**
     * 对parentType进行赋值
     * @param parentType 方法参数：parentType
     */
    private void setParentType(MOType parentType)
    {
        mo.setProperty(QUOTATREE.PARENTTYPE, parentType.getValue());
    }
    
    /**
     * 设置配额是否开启
     */
    public void setQuotaSwitch(Boolean bool)
    {
        mo.setProperty(QUOTATREE.QUOTASWITCH, bool);
    }
    
    /**
     * 获取配额开启状态
     */
    public Boolean getQuotaSwitch()
    {
        return mo.getBoolProperty(QUOTATREE.QUOTASWITCH);
    }
    
}
