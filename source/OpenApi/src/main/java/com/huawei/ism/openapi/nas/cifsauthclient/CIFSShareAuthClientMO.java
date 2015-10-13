package com.huawei.ism.openapi.nas.cifsauthclient;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.AccessPermissionE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.DOMAIN_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.CIFSSHAREAUTHCLIENT;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * CIFS共享权限控制对象
 * @author gWX183785
 * @version V100R001C10
 */
public class CIFSShareAuthClientMO
{

    private final MO mo;

    /**
     * 初始化方法
     */
    public CIFSShareAuthClientMO()
    {
        this.mo = new MO();
        mo.setProperty(CIFSSHAREAUTHCLIENT.TYPE,
            MOType.SNAS_CIFS_SHARE_AUTH_CLIENT.getValue());
    }

    /**
     * 初始化方法
     * @param jObject json对象
     */
    protected CIFSShareAuthClientMO(JSONObject jObject)
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
     * 方法 ： getId
     * 
     * @return String 返回结果
     */
    public String getId()
    {
        return mo.getStrProperty(CIFSSHAREAUTHCLIENT.ID);
    }
    
    /**
     * 方法 : getName
     */
    public String getName()
    {
        return mo.getStrProperty(CIFSSHAREAUTHCLIENT.NAME);
    }
    
    /**
     * 方法: setName
     */
    public void setName(String name)
    {
        mo.setProperty(CIFSSHAREAUTHCLIENT.NAME, name);
    }
    
    /**
     * 方法:getDomainType
     */
    public DOMAIN_TYPE_E getDomainType()
    {
        int value = mo.getIntProperty(CIFSSHAREAUTHCLIENT.DOMAINTYPE);
        return DOMAIN_TYPE_E.valueOf(value);
    }
    
    /**
     * 方法:setDomainType
     */
    public void setDomainType(String domainType)
    {
        mo.setProperty(CIFSSHAREAUTHCLIENT.DOMAINTYPE, domainType);
    }
    
    /**
     * 获得父元素ID
     * @return
     */
    public String getParentId()
    {
        return mo.getStrProperty(CIFSSHAREAUTHCLIENT.PARENTID);
    }
    
    /**
     * 设置父元素ID
     */
    public void setParentId(String parentId)
    {
        mo.setProperty(CIFSSHAREAUTHCLIENT.PARENTID, parentId);
    }
    
    /**
     * 方法：getParentName
     */
    public String getParentName()
    {
        return mo.getStrProperty(CIFSSHAREAUTHCLIENT.PARENTNAME);
    }
    
    /**
     * 方法: setParentName
     */
    public void setParentName(String parentName)
    {
        mo.setProperty(CIFSSHAREAUTHCLIENT.PARENTNAME,parentName);
    }
    
    /**
     * 对id进行赋值
     * @param id 方法参数：id
     */
    public void setId(String id)
    {
        mo.setProperty(CIFSSHAREAUTHCLIENT.ID, id);
    }

    /**
     * 获取租户ID
     * @return 租户ID
     */
    public String getTenancyId()
    {
        return mo.getStrProperty(CIFSSHAREAUTHCLIENT.TENANCYID);
    }

    /**
     * 设置租户ID
     * @param tenancyId 租户ID
     */
    public void setTenancyId(String tenancyId)
    {
        mo.setProperty(CIFSSHAREAUTHCLIENT.TENANCYID, tenancyId);
    }

//    /**
//     * 获取共享id
//     * @return 返回结果共享ID
//     */
//    public String getShareId()
//    {
//        return mo.getStrProperty(CIFSSHAREAUTHCLIENT.SHAREID);
//    }
//
//    /**
//     * 设置共享id
//     * @param shareId 共享id
//     */
//    public void setShareId(String shareId)
//    {
//        mo.setProperty(CIFSSHAREAUTHCLIENT.SHAREID, shareId);
//    }
//
//    /**
//     * 获取访问对象
//     * @return 访问对象
//     */
//    public String getAccessObj()
//    {
//        return mo.getStrProperty(CIFSSHAREAUTHCLIENT.ACCESSOBJ);
//    }
//
//    /**
//     * 设置访问对象 枚举类型-----------?accessObj是什么？
//     * @param accessObj 访问对象
//     */
//    public void setAccessObj(String accessObj)
//    {
//        mo.setProperty(CIFSSHAREAUTHCLIENT.ACCESSOBJ, accessObj);
//    }
//
//    /**
//     * 获取访问对象的ID
//     * @return 访问对象的ID
//     */
//    public String getAccessId()
//    {
//        return mo.getStrProperty(CIFSSHAREAUTHCLIENT.ACCESSID);
//    }
//
//    /**
//     * 设置访问对象的ID
//     * @param accessId 访问对象ID
//     */
//    public void setAccessId(String accessId)
//    {
//        mo.setProperty(CIFSSHAREAUTHCLIENT.ACCESSID, accessId);
//    }
//
//    /**
//     * 获取访问名称
//     * @return 返回结果 访问对象名称
//     */
//    public String getAccessName()
//    {
//        return mo.getStrProperty(CIFSSHAREAUTHCLIENT.ACCESSNAME);
//    }
//
//    /**
//     * 设置访问名称
//     * @param accessName 访问名称
//     */
//    public void setAccessName(String accessName)
//    {
//        mo.setProperty(CIFSSHAREAUTHCLIENT.ACCESSNAME, accessName);
//    }zWX228053 注释掉多余属性

    /**
     * 获取权限（只读、读写、禁止、完全控制）
     * @return 权限
     */
    public AccessPermissionE getPermission()
    {
        return AccessPermissionE.valueOf(mo
            .getIntProperty(CIFSSHAREAUTHCLIENT.PERMISSION));
    }

    /**
     * 设置权限（只读、读写、禁止、完全控制）
     * @param permission 权限
     */
    public void setPermission(AccessPermissionE permission)
    {
        mo.setProperty(CIFSSHAREAUTHCLIENT.PERMISSION,
            Integer.parseInt(String.valueOf(permission.getValue())));
    }
}
