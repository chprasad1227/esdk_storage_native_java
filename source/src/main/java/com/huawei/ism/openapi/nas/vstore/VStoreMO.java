package com.huawei.ism.openapi.nas.vstore;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.TLVNAS.VSTORE;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * 租户对象类型
 * @author fWX183786
 * @version V100R001C10
 */
public class VStoreMO
{
    private final MO mo;

    /**
     * 构造函数
     */
    public VStoreMO()
    {
        mo = new MO();
        setType(MOType.VSTORE);
    }

    /**
     * 构造函数
     * @param jObject json 数据
     */
    public VStoreMO(JSONObject jObject)
    {
        mo = new MO(jObject);
        setType(MOType.VSTORE);
    }

    /**
     * 获取租户类型
     * @return 租户类型
     */
    public MOType getType()
    {
        return MOType.VSTORE;
    }

    /**
     * 设置租户ID
     * @param id 租户ID
     */
    public void setId(String id)
    {
        mo.setProperty(VSTORE.ID, id);
    }

    /**
     * 获取租户id
     * @return 租户id
     */
    public String getId()
    {
        return mo.getStrProperty(VSTORE.ID);
    }

    /**
     * 设置租户名称
     * @param name 租户名称
     */
    public void setName(String name)
    {
        mo.setProperty(VSTORE.NAME, name);
    }

    /**
     * 获取租户的名称
     * @return 租户名称
     */
    public String getName()
    {
        return mo.getStrProperty(VSTORE.NAME);
    }

    /**
     * 设置描述
     * @param description 描述
     */
    public void setDescription(String description)
    {
        mo.setProperty(VSTORE.DESCRIPTION, description);
    }

    /**
     * 获取描述
     * @return 描述
     */
    public String getDescription()
    {
        return mo.getStrProperty(VSTORE.DESCRIPTION);
    }

    /**
     * 设置关联对象类型
     * @param type 对象类型
     */
    public void setAssociateOBJType(MOType type)
    {
        mo.setProperty(VSTORE.ASSOCIATEOBJTYPE, type.getValue());
    }

    /**
     * 设置关联对象Id
     * @param associatId 关联对象Id
     */
    public void setAssociateOBJId(String associatId)
    {
        mo.setProperty(VSTORE.ASSOCIATEOBJID, associatId);
    }

    /**
     * 获取租户管理员得id
     * @return 租户管理员得id
     */
    public String[] getUserIds()
    {
        return mo.getStrArrayProperty(VSTORE.USERIDS);
    }

    /**
     * 设置是否支持iSCSI协议
     * @param supportISCSI 支持iSCSI协议
     */
    public void setSupportISCSI(Boolean supportISCSI)
    {
        mo.setProperty(VSTORE.SUPPORTISCSI, supportISCSI);
    }

    /**
     * 获取是否支持iSCSI协议
     * @return 是否支持iSCSI协议
     */
    public Boolean isSupportISCSI()
    {
        return mo.getBoolProperty(VSTORE.SUPPORTISCSI);
    }

    /**
     * 设置是否支持FC/FCoE协议
     * @param supportFC 是否支持FC/FCoE协议
     */
    public void setSupportFC(Boolean supportFC)
    {
        mo.setProperty(VSTORE.SUPPORTFC, supportFC);
    }

    /**
     * 获取是否支持FC/FCoE协议
     * @return 是否支持FC/FCoE协议
     */
    public Boolean isSupportFC()
    {
        return mo.getBoolProperty(VSTORE.SUPPORTFC);
    }

    /**
     * 设置是否支持NFS协议
     * @param supportNFS 是否支持NFS协议
     */
    public void setSupportNFS(Boolean supportNFS)
    {
        mo.setProperty(VSTORE.SUPPORTNFS, supportNFS);
    }

    /**
     * 获取是否支持NFS协议
     * @return 是否支持NFS协议
     */
    public Boolean isSupportNFS()
    {
        return mo.getBoolProperty(VSTORE.SUPPORTNFS);
    }

    /**
     * 设置是否支持CIFS协议
     * @param supportCIFS 是否支持CIFS协议
     */
    public void setSupportCIFS(Boolean supportCIFS)
    {
        mo.setProperty(VSTORE.SUPPORTCIFS, supportCIFS);
    }

    /**
     * 获取是否支持CIFS协议
     * @return 是否支持CIFS协议
     */
    public Boolean isSupportCIFS()
    {
        return mo.getBoolProperty(VSTORE.SUPPORTCIFS);
    }

    /**
     * 方法 ： getCount
     * 
     * @return long 返回结果
     */
    protected Long getCount()
    {
        return mo.getLongProperty(VSTORE.COUNT);
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
     * 设置租户类型
     * @param type 租户类型
     */
    private void setType(MOType type)
    {
        mo.setProperty(VSTORE.TYPE, type.getValue());
    }
}
