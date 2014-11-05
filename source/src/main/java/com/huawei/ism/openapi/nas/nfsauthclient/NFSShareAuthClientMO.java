package com.huawei.ism.openapi.nas.nfsauthclient;

import org.json.JSONObject;

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
        mo.setProperty(NFSSHAREAUTHCLIENT.TYPE,
            MOType.SNAS_NFS_SHARE_AUTH_CLIENT.getValue());
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
     * 获取共享id
     * @return 返回结果
     */
    public String getShareId()
    {
        return mo.getStrProperty(NFSSHAREAUTHCLIENT.SHAREID);
    }

    /**
     * 设置共享id
     * @param shareId 共享id
     */
    public void setShareId(String shareId)
    {
        mo.setProperty(NFSSHAREAUTHCLIENT.SHAREID, shareId);
    }

    /**
     * 获取访问名称
     * @return 返回结果
     */
    public String getAccessName()
    {
        return mo.getStrProperty(NFSSHAREAUTHCLIENT.ACCESSNAME);
    }

    /**
     * 设置访问名称
     * @param accessName 访问名称
     */
    public void setAccessName(String accessName)
    {
        mo.setProperty(NFSSHAREAUTHCLIENT.ACCESSNAME, accessName);
    }

    /**
     * 获取读写方式
     * @return 返回结果
     */
    public Long getAccessVal()
    {
        return mo.getLongProperty(NFSSHAREAUTHCLIENT.ACCESSVAL);
    }

    /**
     * 设置读写方式
     * @param accessVal 读写方式
     */
    public void setAccessVal(Long accessVal)
    {
        mo.setProperty(NFSSHAREAUTHCLIENT.ACCESSVAL, accessVal);
    }

    /**
     * 获取是否同步
     * @return 返回结果
     */
    public Long getSync()
    {
        return mo.getLongProperty(NFSSHAREAUTHCLIENT.SYNC);
    }

    /**
     * 设置是否同步
     * @param sync 是否同步
     */
    public void setSync(Long sync)
    {
        mo.setProperty(NFSSHAREAUTHCLIENT.SYNC, sync);
    }

    /**
     * 获取端口策略
     * @return 返回结果
     */
    public Long getSecurity()
    {
        return mo.getLongProperty(NFSSHAREAUTHCLIENT.SECURITY);
    }

    /**
     * 设置端口策略
     * @param security 端口策略
     */
    public void setSecurity(Long security)
    {
        mo.setProperty(NFSSHAREAUTHCLIENT.SECURITY, security);
    }

    /**
     * 获取allsquash
     * @return 返回结果
     */
    public Long getAllSquash()
    {
        return mo.getLongProperty(NFSSHAREAUTHCLIENT.ALLSQUASH);
    }

    /**
     * 设置allsquash
     * @param allSquash allSquash
     */
    public void setAllSquash(Long allSquash)
    {
        mo.setProperty(NFSSHAREAUTHCLIENT.ALLSQUASH, allSquash);
    }

    /**
     * 获取root权限压制
     * @return 返回结果
     */
    public Long getRootSquash()
    {
        return mo.getLongProperty(NFSSHAREAUTHCLIENT.ROOTSQUASH);
    }

    /**
     * 设置root权限压制
     * @param rootSquash root权限压制
     */
    public void setRootSquash(Long rootSquash)
    {
        mo.setProperty(NFSSHAREAUTHCLIENT.ROOTSQUASH, rootSquash);
    }

}
