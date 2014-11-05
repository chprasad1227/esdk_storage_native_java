package com.huawei.ism.openapi.nas.nfsservice;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.NFSSERVICE;
import com.huawei.ism.openapi.common.model.MO;

/**
 * NfsService数据对象
 * @author gWX183785
 * @version V100R001C10
 */
public class NFSServiceMO
{
    private final MO mo;

    /**
     * 初始化方法
     */
    public NFSServiceMO()
    {
        this.mo = new MO();
    }

    /**
     * 初始化方法
     * @param mo NfsService数据对象
     */
    public NFSServiceMO(MO mo)
    {
        this.mo = mo;
    }

    /**
     * 初始化方法
     * @param jObject JSON数据对象
     */
    public NFSServiceMO(JSONObject jObject)
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
     * 获取NFSService id
     * @return id
     */
    public String getId()
    {
        return mo.getStrProperty(NFSSERVICE.ID);
    }

    /**
     * 设置NFSService id
     * @param id id
     */
    public void setId(String id)
    {
        mo.setProperty(NFSSERVICE.ID, id);
    }

    /**
     * 获取运行状态
     * @return 返回结果
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE.valueOf(mo
            .getIntProperty(NFSSERVICE.RUNNINGSTATUS));
    }

    /**
     * 设置运行状态
     * @param runningStatus 运行状态
     */
    public void setRunningStatus(RunningStatusE runningStatus)
    {
        mo.setProperty(NFSSERVICE.RUNNINGSTATUS, runningStatus);
    }

    /**
     * 获取租户ID(0表示全局）
     * @return 租户ID
     */
    public Long getTenancyId()
    {
        return mo.getLongProperty(NFSSERVICE.TENANCYID);
    }

    /**
     * 设置租户ID(0表示全局）
     * @param tenancyId 租户ID
     */
    public void setTenancyId(Long tenancyId)
    {
        mo.setProperty(NFSSERVICE.TENANCYID, tenancyId);
    }

    /**
     * 获取是否支持NFSV3
     * @return 是否支持NFSV3
     */
    public boolean isSupportV3()
    {
        return mo.getBoolProperty(NFSSERVICE.SUPPORTV3);
    }

    /**
     * 设置是否支持NFSV3
     * @param supportV3 是否支持NFSV3
     */
    public void setSupportV3(boolean supportV3)
    {
        mo.setProperty(NFSSERVICE.SUPPORTV3, supportV3);
    }

    /**
     * 获取是否支持NFSV4
     * @return 是否支持NFSV4
     */
    public boolean isSupportV4()
    {
        return mo.getBoolProperty(NFSSERVICE.SUPPORTV4);
    }

    /**
     * 设置是否支持NFSV4
     * @param supportV4 是否支持NFSV4
     */
    public void setSupportV4(boolean supportV4)
    {
        mo.setProperty(NFSSERVICE.SUPPORTV4, supportV4);
    }

    /**
     * 获取nfsv4 域名（默认域名为localdomain）
     * @return nfsv4 域名（默认域名为localdomain）
     */
    public String getNfsv4domain()
    {
        return mo.getStrProperty(NFSSERVICE.NFSV4DOMAIN);
    }

    /**
     * 设置nfsv4 域名（默认域名为localdomain）
     * @param nfsv4domain nfsv4 域名（默认域名为localdomain）
     */
    public void setNfsv4domain(String nfsv4domain)
    {
        mo.setProperty(NFSSERVICE.NFSV4DOMAIN, nfsv4domain);
    }

    /**
     * 方法 ： getCount
     * 
     * @return long 返回结果
     */
    protected Long getCount()
    {
        return mo.getLongProperty(NFSSERVICE.COUNT);
    }

}
