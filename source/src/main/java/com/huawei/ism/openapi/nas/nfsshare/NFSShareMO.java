package com.huawei.ism.openapi.nas.nfsshare;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.TLVNAS.NFSSHARE;
import com.huawei.ism.openapi.common.model.MO;

/**
 * NFS共享对象
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class NFSShareMO
{

    private final MO mo;

    /**
     * NFS共享构造函数
     */
    public NFSShareMO()
    {
        this.mo = new MO();
    }

    /**
     * NFS共享构造函数
     * @param mo mo对象
     */
    public NFSShareMO(MO mo)
    {
        this.mo = mo;
    }

    /**
     * NFS共享构造函数
     * @param jObject rest对象
     */
    public NFSShareMO(JSONObject jObject)
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
     * 获取NFS ID
     * @return id
     */
    public String getId()
    {
        return mo.getStrProperty(NFSSHARE.ID);
    }

    /**
     * 设置Id
     * @param id id
     */
    public void setId(String id)
    {
        mo.setProperty(NFSSHARE.ID, id);
    }

    /**
     * 获取描述信息
     * @return 描述信息
     */
    public String getDescription()
    {
        return mo.getStrProperty(NFSSHARE.DESCRIPTION);
    }

    /**
     * 设置描述信息
     * @param description 描述信息
     */
    public void setDescription(String description)
    {
        mo.setProperty(NFSSHARE.DESCRIPTION, description);
    }

    /**
     * 获取租户ID(0表示全局）
     * @return 租户ID
     */
    public Long getTenancyId()
    {
        return mo.getLongProperty(NFSSHARE.TENANCYID);
    }

    /**
     * 设置租户ID(0表示全局）
     * @param tenancyId 租户ID
     */
    public void setTenancyId(Long tenancyId)
    {
        mo.setProperty(NFSSHARE.TENANCYID, tenancyId);
    }

    /**
     * 获取本地路径目录
     * @return 本地路径目录
     */
    public String getSharePath()
    {
        return mo.getStrProperty(NFSSHARE.SHAREPATH);
    }

    /**
     * 设置本地路径目录
     * @param sharePath 本地路径目录
     */
    public void setSharePath(String sharePath)
    {
        mo.setProperty(NFSSHARE.SHAREPATH, sharePath);
    }

    /**
     * 获取文件系统ID
     * @return 文件系统ID
     */
    public String getFsId()
    {
        return mo.getStrProperty(NFSSHARE.FSID);
    }

    /**
     * 设置文件系统ID
     * @param fsId 文件系统ID
     */
    public void setFsId(String fsId)
    {
        mo.setProperty(NFSSHARE.FSID, fsId);
    }

    /**
     * 方法 ： getCount
     * @return long 返回结果
     */
    protected Long getCount()
    {
        return mo.getLongProperty(NFSSHARE.COUNT);
    }
}
