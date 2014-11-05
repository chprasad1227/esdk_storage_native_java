package com.huawei.ism.openapi.hostgroup;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.TLV.FCoEPort;
import com.huawei.ism.openapi.common.keydeifines.TLV.HOSTGROUP;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * 主机组对象
 * @author gWX183785
 * @version V100R001C10
 */
public class HostGroupMO
{

    private final MO mo;

    /**
     * 初始化方法
     * @param jObject json对象
     */
    protected HostGroupMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
    }

    /**
     * 初始化方法
     */
    public HostGroupMO()
    {
        this.mo = new MO();
        mo.setProperty(HOSTGROUP.TYPE, MOType.HOSTGROUP.getValue());
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
        mo.setProperty(FCoEPort.ASSOCIATEOBJTYPE, String.valueOf(moType.getValue()));
    }

    /**
     * 获取关联对象类型
     * @return 返回结果
     */
    public MOType getAssociateOBJType()
    {
        return MOType.valueOf(mo.getStrProperty(FCoEPort.ASSOCIATEOBJTYPE));
    }

    /**
     * 设置关联对象ID
     * @param id 关联对象ID
     */
    public void setAssociateOBJId(String id)
    {
        mo.setProperty(FCoEPort.ASSOCIATEOBJID, id);
    }

    /**
     * 获取关联对象ID
     * @return 返回结果
     */
    public String getAssociateOBJId()
    {
        return mo.getStrProperty(FCoEPort.ASSOCIATEOBJID);
    }
    
    /**
     * 方法 ： getId
     * 
     * @return String 返回结果
     */
    public String getId()
    {
        return mo.getStrProperty(HOSTGROUP.ID);
    }

    /**
     * 对id进行赋值
     * @param id 方法参数：id
     */
    public void setId(String id)
    {
        mo.setProperty(HOSTGROUP.ID, id);
    }

    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(HOSTGROUP.NAME);
    }

    /**
     * 对name进行赋值
     * @param name 方法参数：name
     */
    public void setName(String name)
    {
        mo.setProperty(HOSTGROUP.NAME, name);
    }

    /**
     * 获取主机组描述
     * @return String 返回结果
     */
    public String getDescription()
    {
        return mo.getStrProperty(HOSTGROUP.DESCRIPTION);
    }

    /**
     * 对主机组描述设置描述
     * @param description 描述
     */
    public void setDescription(String description)
    {
        mo.setProperty(HOSTGROUP.DESCRIPTION, description);
    }

    /**
     * 方法 ： getIsAddToMapingView
     * 
     * @return Boolean 返回结果
     */
    public Boolean isAddToMapingView()
    {
        return mo.getBoolProperty(HOSTGROUP.ISADD2MAPPINGVIEW);
    }

    /**
     * 设置是否已经映射
     * @param isAddToMapingView 是否已经添加到映射
     */
    public void setIsAddToMapingView(boolean isAddToMapingView)
    {
        mo.setProperty(HOSTGROUP.ISADD2MAPPINGVIEW, isAddToMapingView);
    }

}
