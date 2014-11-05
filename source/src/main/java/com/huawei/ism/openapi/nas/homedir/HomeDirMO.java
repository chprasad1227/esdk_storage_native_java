package com.huawei.ism.openapi.nas.homedir;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.TLVNAS.HOMEDIR;
import com.huawei.ism.openapi.common.model.MO;

/**
 * HomeDir数据对象
 * @author gWX183785
 * @version V100R001C10
 */
public class HomeDirMO
{

    private final MO mo;

    /**
     * 初始化方法
     */
    public HomeDirMO()
    {
        this.mo = new MO();
    }

    /**
     * 初始化方法
     * @param mo HomeDir数据对象
     */
    public HomeDirMO(MO mo)
    {
        this.mo = mo;
    }

    /**
     * 初始化方法
     * @param jObject JSON对象
     */
    public HomeDirMO(JSONObject jObject)
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
     * 获取NFS ID
     * @return id
     */
    public String getId()
    {
        return mo.getStrProperty(HOMEDIR.ID);
    }

    /**
     * 设置Id
     * @param id id
     */
    public void setId(String id)
    {
        mo.setProperty(HOMEDIR.ID, id);
    }

    /**
     * 获取租户ID(0表示全局）
     * @return 租户ID
     */
    public String getTenancyId()
    {
        return mo.getStrProperty(HOMEDIR.TENANCYID);
    }

    /**
     * 设置租户ID(0表示全局）
     * @param tenancyId 租户ID
     */
    public void setTenancyId(String tenancyId)
    {
        mo.setProperty(HOMEDIR.TENANCYID, tenancyId);
    }

    /**
     * 获取本地路径目录
     * @return 本地路径目录
     */
    public String getSharePath()
    {
        return mo.getStrProperty(HOMEDIR.SHAREPATH);
    }

    /**
     * 设置本地路径目录
     * @param sharePath 本地路径目录
     */
    public void setSharePath(String sharePath)
    {
        mo.setProperty(HOMEDIR.SHAREPATH, sharePath);
    }

    /**
     * 获取文件系统ID
     * @return 文件系统ID
     */
    public String getFsId()
    {
        return mo.getStrProperty(HOMEDIR.FSID);
    }

    /**
     * 设置文件系统ID
     * @param fsId 文件系统ID
     */
    public void setFsId(String fsId)
    {
        mo.setProperty(HOMEDIR.FSID, fsId);
    }

    /**
     * 获取主目录开启状态
     * @return 返回结果
     */
    public boolean isOpen()
    {
        return mo.getBoolProperty(HOMEDIR.ISOPEN);
    }

    /**
     * 设置主目录开启状态
     * @param isOpen 主目录开启状态
     */
    public void setIsOpen(boolean isOpen)
    {
        mo.setProperty(HOMEDIR.ISOPEN, isOpen);
    }

    /**
     * 获取是否自动创建主目录
     * @return 返回结果
     */
    public boolean isIsAutoCreate()
    {
        return mo.getBoolProperty(HOMEDIR.ISAUTOCREATE);
    }

    /**
     * 设置是否自动创建主目录
     * @param isAutoCreate 是否自动创建主目录
     */
    public void setIsAutoCreate(boolean isAutoCreate)
    {
        mo.setProperty(HOMEDIR.ISAUTOCREATE, isAutoCreate);
    }

    /**
     * 获取主目录创建规则
     * @return 返回结果
     */
    public String getMode()
    {
        return mo.getStrProperty(HOMEDIR.MODE);
    }

    /**
     * 设置主目录创建规则
     * @param mode 主目录创建规则
     */
    public void setMode(String mode)
    {
        mo.setProperty(HOMEDIR.MODE, mode);
    }

    /**
     * 方法 ： getCount
     * 
     * @return long 返回结果
     */
    protected Long getCount()
    {
        return mo.getLongProperty(HOMEDIR.COUNT);
    }

}
