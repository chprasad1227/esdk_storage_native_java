package com.huawei.ism.openapi.lungroup;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.AppTypeE;
import com.huawei.ism.openapi.common.keydeifines.TLV.LUNGROUP;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * LUN组MO
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class LunGroupMO
{
    private final MO mo;

    /**
     * LunGroupMO
     * @param jObject JSONObject
     */
    public LunGroupMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
    }

    /**
     * LunGroupMO
     */
    public LunGroupMO()
    {
        this.mo = new MO();
        mo.setProperty(LUNGROUP.TYPE, MOType.LUNGROUP.getValue());
    }
    
    public void setAssociateOBJType(MOType moType)
    {
        mo.setProperty(LUNGROUP.ASSOCIATEOBJTYPE, String.valueOf(moType.getValue()));
    }

    /**
     * 获取关联对象类型
     * @return 返回结果
     */
    public MOType getAssociateOBJType()
    {
        return MOType.valueOf(mo.getStrProperty(LUNGROUP.ASSOCIATEOBJTYPE));
    }

    /**
     * 设置关联对象ID
     * @param id 关联对象ID
     */
    public void setAssociateOBJId(String id)
    {
        mo.setProperty(LUNGROUP.ASSOCIATEOBJID, id);
    }

    /**
     * 获取关联对象ID
     * @return 返回结果
     */
    public String getAssociateOBJId()
    {
        return mo.getStrProperty(LUNGROUP.ASSOCIATEOBJID);
    }


    /**
     * 方法 ： getID
     * 
     * @return String 返回结果
     */
    public String getId()
    {
        return mo.getStrProperty(LUNGROUP.ID);
    }

    /**
     * 对id进行赋值
     * @param id 方法参数：id
     */
    public void setId(String id)
    {
        mo.setProperty(LUNGROUP.ID, id);
    }

    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(LUNGROUP.NAME);
    }

    /**
     * 对name进行赋值
     * @param name 方法参数：name
     */
    public void setName(String name)
    {
        mo.setProperty(LUNGROUP.NAME, name);
    }

    /**
     * 方法 ： getDescription
     * 
     * @return String 返回结果
     */
    public String getDescription()
    {
        return mo.getStrProperty(LUNGROUP.DESCRIPTION);
    }

    /**
     * 对description进行赋值
     * @param description 方法参数：description
     */
    public void setDescription(String description)
    {
        mo.setProperty(LUNGROUP.DESCRIPTION, description);
    }

    /**
     * 方法 ： getIsAddToMapingView
     * 
     * @return Boolean 返回结果
     */
    public Boolean getIsAddToMapingView()
    {
        return mo.getBoolProperty(LUNGROUP.ISADD2MAPPINGVIEW);
    }

    /**
     * 设置是否已经映射
     * @param isAddToMapingView 是否已经添加到映射
     */
    public void setIsAddToMapingView(boolean isAddToMapingView)
    {
        mo.setProperty(LUNGROUP.ISADD2MAPPINGVIEW, isAddToMapingView);
    }

    /**
     * 方法 ： getAppType
     * 
     * @return AppTypeE 返回结果
     */
    public AppTypeE getAppType()
    {
        return AppTypeE.valueOf(mo.getIntProperty(LUNGROUP.APPTYPE));
    }

    /**
     * 设置应用类型
     * @param appTypeE 应用类型
     */
    public void setAppType(AppTypeE appTypeE)
    {
        mo.setProperty(LUNGROUP.APPTYPE, Integer.parseInt(String.valueOf(appTypeE.getValue())));
    }

    /**
     * 方法 ： getGroupType
     * 
     * @return Integer 返回结果
     */
    public Integer getGroupType()
    {
        return mo.getIntProperty(LUNGROUP.GROUPTYPE);
    }

    /**
     * 设置组类型
     * @param groupType 组类型
     */
    public void setGroupType(Integer groupType)
    {
        mo.setProperty(LUNGROUP.GROUPTYPE, groupType);
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
}
