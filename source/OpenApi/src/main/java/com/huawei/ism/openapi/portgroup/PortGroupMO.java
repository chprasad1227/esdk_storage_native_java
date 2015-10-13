package com.huawei.ism.openapi.portgroup;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.TLV.PORTGROUP;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * 端口组对象
 * @author gWX183785
 * @version V100R001C10
 */
public class PortGroupMO
{

    private final MO mo;

    /**
     * 初始化方法
     * @param jObject json对象
     */
    protected PortGroupMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
    }

    /**
     * 初始化方法
     */
    public PortGroupMO()
    {
        this.mo = new MO();
        mo.setProperty(PORTGROUP.TYPE, MOType.PORTGROUP.getValue());
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
        return mo.getStrProperty(PORTGROUP.ID);
    }

    public void setAssociateOBJType(MOType moType)
    {
        mo.setProperty(PORTGROUP.ASSOCIATEOBJTYPE, String.valueOf(moType.getValue()));
    }

    /**
     * 获取关联对象类型
     * @return 返回结果
     */
    public MOType getAssociateOBJType()
    {
        return MOType.valueOf(mo.getStrProperty(PORTGROUP.ASSOCIATEOBJTYPE));
    }

    /**
     * 设置关联对象ID
     * @param id 关联对象ID
     */
    public void setAssociateOBJId(String id)
    {
        mo.setProperty(PORTGROUP.ASSOCIATEOBJID, id);
    }

    /**
     * 获取关联对象ID
     * @return 返回结果
     */
    public String getAssociateOBJId()
    {
        return mo.getStrProperty(PORTGROUP.ASSOCIATEOBJID);
    }

    /**
     * 对id进行赋值
     * @param id 方法参数：id
     */
    public void setId(String id)
    {
        mo.setProperty(PORTGROUP.ID, id);
    }

    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(PORTGROUP.NAME);
    }

    /**
     * 对name进行赋值
     * @param name 方法参数：name
     */
    public void setName(String name)
    {
        mo.setProperty(PORTGROUP.NAME, name);
    }

    /**
     * 获取主机组描述
     * @return String 返回结果
     */
    public String getDescription()
    {
        return mo.getStrProperty(PORTGROUP.DESCRIPTION);
    }

    /**
     * 对主机组描述设置描述
     * @param description 描述
     */
    public void setDescription(String description)
    {
        mo.setProperty(PORTGROUP.DESCRIPTION, description);
    }

}
