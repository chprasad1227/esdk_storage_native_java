package com.huawei.ism.openapi.nas.nfsauthclient;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.ACCESSVAL_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.ALLSQUASH_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.ROOTSQUASH_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.SYNC_MODE_E;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.NFSSHAREAUTHCLIENT;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * NFS共享权限控制对象
 * @author gWX183785
 * @version V100R001C10
 */
public class NFSShareAuthClientMO
{

    private final MO mo;

    /**
     * 初始化方法
     */
    public NFSShareAuthClientMO()
    {
        this.mo = new MO();
        mo.setProperty(NFSSHAREAUTHCLIENT.TYPE, MOType.SNAS_NFS_SHARE_AUTH_CLIENT.getValue());
    }

    /**
     * 初始化方法
     * @param jObject json对象
     */
    protected NFSShareAuthClientMO(JSONObject jObject)
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
        return mo.getStrProperty(NFSSHAREAUTHCLIENT.ID);
    }

    /**
     * 对id进行赋值
     * @param id 方法参数：id
     */
    public void setId(String id)
    {
        mo.setProperty(NFSSHAREAUTHCLIENT.ID, id);
    }

    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(NFSSHAREAUTHCLIENT.NAME);
    }

    /**
     * 对NAME进行赋值
     * @param name 方法参数：name
     */
    public void setName(String name)
    {
        mo.setProperty(NFSSHAREAUTHCLIENT.NAME, name);
    }

    /**
     * 获取共享id
     * @return 返回结果
     */
    public String getParentId()
    {
        return mo.getStrProperty(NFSSHAREAUTHCLIENT.PARENTID);
    }

    /**
     * 设置共享id
     * @param parentId 共享id
     */
    public void setParentId(String parentId)
    {
        mo.setProperty(NFSSHAREAUTHCLIENT.PARENTID, parentId);
    }

    /**
     * 获取租户ID(0表示全局）
     * @return 返回结果
     */
    public String getTenancyId()
    {
        return mo.getStrProperty(NFSSHAREAUTHCLIENT.TENANCYID);
    }

    /**
     * 设置租户ID(0表示全局）
     * @param tenancyId 租户ID
     */
    public void setTenancyId(String tenancyId)
    {
        mo.setProperty(NFSSHAREAUTHCLIENT.TENANCYID, tenancyId);
    }

    /**
     * 获取共享路径（海量存储使用）
     * @return 返回结果
     */
    public String getSharePath()
    {
        return mo.getStrProperty(NFSSHAREAUTHCLIENT.SHAREPATH);
    }

    /**
     * 设置共享路径（海量存储使用）
     * @param sharePath 共享路径（海量存储使用）
     */
    public void setSharePath(String sharePath)
    {
        mo.setProperty(NFSSHAREAUTHCLIENT.SHAREPATH, sharePath);
    }

    /**
     * 获取读写方式
     * @return 返回结果
     */
    public ACCESSVAL_TYPE_E getAccessVal()
    {
        return ACCESSVAL_TYPE_E.valueOf(mo.getIntProperty(NFSSHAREAUTHCLIENT.ACCESSVAL));
    }

    /**
     * 设置读写方式
     * @param accessVal 读写方式
     */
    public void setAccessVal(ACCESSVAL_TYPE_E accessVal)
    {
        mo.setProperty(NFSSHAREAUTHCLIENT.ACCESSVAL, accessVal.getValue());
    }

    /**
     * 获取是否同步
     * @return 返回结果
     */
    public SYNC_MODE_E getSync()
    {
        return SYNC_MODE_E.valueOf(mo.getIntProperty(NFSSHAREAUTHCLIENT.SYNC));
    }

    /**
     * 设置是否同步
     * @param sync 是否同步
     */
    public void setSync(SYNC_MODE_E sync)
    {
        mo.setProperty(NFSSHAREAUTHCLIENT.SYNC, sync.getValue());
    }

    /**
     * 获取allsquash
     * @return 返回结果
     */
    public ALLSQUASH_TYPE_E getAllSquash()
    {
        return ALLSQUASH_TYPE_E.valueOf(mo.getIntProperty(NFSSHAREAUTHCLIENT.ALLSQUASH));
    }

    /**
     * 设置allsquash
     * @param allSquash allSquash
     */
    public void setAllSquash(ALLSQUASH_TYPE_E allSquash)
    {
        mo.setProperty(NFSSHAREAUTHCLIENT.ALLSQUASH, allSquash.getValue());
    }

    /**
     * 获取root权限压制
     * @return 返回结果
     */
    public ROOTSQUASH_TYPE_E getRootSquash()
    {
        return ROOTSQUASH_TYPE_E.valueOf(mo.getIntProperty(NFSSHAREAUTHCLIENT.ROOTSQUASH));
    }

    /**
     * 设置root权限压制
     * @param rootSquash root权限压制
     */
    public void setRootSquash(ROOTSQUASH_TYPE_E rootSquash)
    {
        mo.setProperty(NFSSHAREAUTHCLIENT.ROOTSQUASH, rootSquash.getValue());
    }

}
