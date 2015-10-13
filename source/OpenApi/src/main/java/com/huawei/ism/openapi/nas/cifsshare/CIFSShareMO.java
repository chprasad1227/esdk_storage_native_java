package com.huawei.ism.openapi.nas.cifsshare;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.TLVNAS.CIFSSHARE;
import com.huawei.ism.openapi.common.model.MO;

/**
 * CIFS共享对象
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class CIFSShareMO
{

    private final MO mo;

    /**
     * CIFS共享构造方法
     */
    public CIFSShareMO()
    {
        this.mo = new MO();
    }

    /**
     * CIFS共享构造方法
     * @param mo CIFS共享的对象
     */
    public CIFSShareMO(MO mo)
    {
        this.mo = mo;
    }

    /**
     * CIFS共享构造方法
     * @param jObject json对象
     */
    public CIFSShareMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
    }

    /**
     * 方法 ： getMO
     * @return MO 返回结果
     */
    public MO getMO()
    {
        return this.mo;
    }

    /**
     * 获取CIFS ID
     * @return cifs id
     */
    public String getId()
    {
        return mo.getStrProperty(CIFSSHARE.ID);
    }

    /**
     * 设置Id
     * @param id id
     */
    public void setId(String id)
    {
        mo.setProperty(CIFSSHARE.ID, id);
    }

    /**
     * 获取对象名称(共享名称)
     * @return 对象名称(共享名称)
     */
    public String getName()
    {
        return mo.getStrProperty(CIFSSHARE.NAME);
    }

    /**
     * 设置对象名称(共享名称)
     * @param name 对象名称
     */
    public void setName(String name)
    {
        mo.setProperty(CIFSSHARE.NAME, name);
    }

    /**
     * 获取描述信息
     * @return 描述信息
     */
    public String getDescription()
    {
        return mo.getStrProperty(CIFSSHARE.DESCRIPTION);
    }

    /**
     * 设置描述信息
     * @param description 描述信息
     */
    public void setDescription(String description)
    {
        mo.setProperty(CIFSSHARE.DESCRIPTION, description);
    }

    /**
     * 获取租户ID(0表示全局）
     * @return 租户ID
     */
    public Long getTenancyId()
    {
        return mo.getLongProperty(CIFSSHARE.TENANCYID);
    }

    /**
     * 设置租户ID(0表示全局）
     * @param tenancyId 租户ID
     */
    public void setTenancyId(Long tenancyId)
    {
        mo.setProperty(CIFSSHARE.TENANCYID, tenancyId);
    }

    /**
     * 获取本地路径目录
     * @return 本地路径目录
     */
    public String getSharePath()
    {
        return mo.getStrProperty(CIFSSHARE.SHAREPATH);
    }

    /**
     * 设置本地路径目录
     * @param sharePath 本地路径目录
     */
    public void setSharePath(String sharePath)
    {
        mo.setProperty(CIFSSHARE.SHAREPATH, sharePath);
    }

    /**
     * 获取abe功能状态，开启该功能，用户看不到无权限的文件夹
     * @return abe功能
     */
    public Boolean getAbeEnable()
    {
        return mo.getBoolProperty(CIFSSHARE.ABEENABLE);
    }

    /**
     * 设置abe功能状态
     * @param abeEnable abe功能状态
     */
    public void setAbeEnable(boolean abeEnable)
    {
        mo.setProperty(CIFSSHARE.ABEENABLE, abeEnable);
    }

    /**
     * 获取文件系统ID
     * @return 文件系统ID
     */
    public String getFsId()
    {
        return mo.getStrProperty(CIFSSHARE.FSID);
    }

    /**
     * 设置文件系统ID
     * @param fsId 文件系统ID
     */
    public void setFsId(String fsId)
    {
        mo.setProperty(CIFSSHARE.FSID, fsId);
    }

    /**
     * 获取：优化锁开关（协议锁之后文件系统不用锁）
     * @return 优化锁开关
     */
    public Boolean getEnableOpLock()
    {
        return mo.getBoolProperty(CIFSSHARE.ENABLEOPLOCK);
    }

    /**
     * 设置优化锁开关（协议锁之后文件系统不用锁）
     * @param enableOpLock 优化锁开关
     */
    public void setEnableOpLock(Boolean enableOpLock)
    {
        mo.setProperty(CIFSSHARE.ENABLEOPLOCK, enableOpLock);
    }

    /**
     * 方法 ： getCount
     * @return long 返回结果
     */
    protected Long getCount()
    {
        return mo.getLongProperty(CIFSSHARE.COUNT);
    }
}
