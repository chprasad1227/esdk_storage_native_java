package com.huawei.ism.openapi.nas.cifsservice;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.SecurityModelE;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.CIFSSERVICE;
import com.huawei.ism.openapi.common.model.MO;

/**
 * CifsService数据对象
 * @author gWX183785
 * @version V100R001C10
 */
public class CIFSServiceMO
{
    private final MO mo;

    /**
     * 初始化方法
     */
    public CIFSServiceMO()
    {
        this.mo = new MO();
    }

    /**
     * 初始化方法
     * @param mo CifsService数据对象
     */
    public CIFSServiceMO(MO mo)
    {
        this.mo = mo;
    }

    /**
     * 初始化方法
     * @param jObject JSON对象
     */
    public CIFSServiceMO(JSONObject jObject)
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
     * 获取CIFSService id
     * @return id
     */
    public String getId()
    {
        return mo.getStrProperty(CIFSSERVICE.ID);
    }

    /**
     * 设置CIFSService id
     * @param id id
     */
    public void setId(String id)
    {
        mo.setProperty(CIFSSERVICE.ID, id);
    }

    /**
     * 获取运行状态
     * @return 返回结果
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE.valueOf(mo
            .getIntProperty(CIFSSERVICE.RUNNINGSTATUS));
    }

    /**
     * 设置运行状态
     * @param runningStatus 运行状态
     */
    public void setRunningStatus(RunningStatusE runningStatus)
    {
        mo.setProperty(CIFSSERVICE.RUNNINGSTATUS, runningStatus);
    }

    /**
     * 获取租户ID(0表示全局）
     * @return 租户ID
     */
    public Long getTenancyId()
    {
        return mo.getLongProperty(CIFSSERVICE.TENANCYID);
    }

    /**
     * 设置租户ID(0表示全局）
     * @param tenancyId 租户ID
     */
    public void setTenancyId(Long tenancyId)
    {
        mo.setProperty(CIFSSERVICE.TENANCYID, tenancyId);
    }

    /**
     * 获取本地路径目录
     * @return 本地路径目录
     */
    public SecurityModelE getSecurityModel()
    {
        return SecurityModelE.valueOf(mo
            .getIntProperty(CIFSSERVICE.SECURITYMODEL));
    }

    /**
     * 设置本地路径目录
     * @param securityModel 本地路径目录
     */
    public void setSecurityModel(SecurityModelE securityModel)
    {
        mo.setProperty(CIFSSERVICE.SECURITYMODEL, securityModel);
    }

    /**
     * 获取是否允许来宾访问
     * @return 是否允许来宾访问
     */
    public boolean isGuestEnable()
    {
        return mo.getBoolProperty(CIFSSERVICE.GUESTENABLE);
    }

    /**
     * 设置是否允许来宾访问
     * @param guestEnable 是否允许来宾访问
     */
    public void setGuestEnable(boolean guestEnable)
    {
        mo.setProperty(CIFSSERVICE.GUESTENABLE, guestEnable);
    }

    /**
     * 获取CIFS协议是否必须要求客户端支持签名
     * @return CIFS协议是否必须要求客户端支持签名
     */
    public boolean isSigningRequired()
    {
        return mo.getBoolProperty(CIFSSERVICE.SIGNINGREQUIRED);
    }

    /**
     * 设置CIFS协议是否必须要求客户端支持签名
     * @param signingRequired CIFS协议是否必须要求客户端支持签名
     */
    public void setSigningRequired(boolean signingRequired)
    {
        mo.setProperty(CIFSSERVICE.SIGNINGREQUIRED, signingRequired);
    }

    /**
     * 获取是否CIFS协议开启签名
     * @return 是否CIFS协议开启签名
     */
    public boolean isSigningEnable()
    {
        return mo.getBoolProperty(CIFSSERVICE.SIGNINGENABLE);
    }

    /**
     * 设置是否CIFS协议开启签名
     * @param signingEnable 是否CIFS协议开启签名
     */
    public void setSigningEnable(boolean signingEnable)
    {
        mo.setProperty(CIFSSERVICE.SIGNINGENABLE, signingEnable);
    }

    /**
     * 获取优化锁开关（协议锁之后文件系统不用锁）
     * @return 优化锁开关（协议锁之后文件系统不用锁）
     */
    public boolean isEnableOpLock()
    {
        return mo.getBoolProperty(CIFSSERVICE.ENABLEOPLOCK);
    }

    /**
     * 设置优化锁开关（协议锁之后文件系统不用锁）
     * @param enableOpLock 优化锁开关（协议锁之后文件系统不用锁）
     */
    public void setEnableOpLock(boolean enableOpLock)
    {
        mo.setProperty(CIFSSERVICE.ENABLEOPLOCK, enableOpLock);
    }

    /**
     * 获取优化锁的超时时间
     * @return 优化锁的超时时间
     */
    public Long getOpLockTimeout()
    {
        return mo.getLongProperty(CIFSSERVICE.OPLOCKTIMEOUT);
    }

    /**
     * 设置优化锁的超时时间
     * @param opLockTimeout 优化锁的超时时间
     */
    public void setOpLockTimeout(Long opLockTimeout)
    {
        mo.setProperty(CIFSSERVICE.OPLOCKTIMEOUT, opLockTimeout);
    }

    /**
     * 获取启用匿名访问
     * @return 启用匿名访问
     */
    public boolean isAnonymousEnable()
    {
        return mo.getBoolProperty(CIFSSERVICE.ANONYMOUSENABLE);
    }

    /**
     * 设置启用匿名访问
     * @param anonymousEnable 启用匿名访问
     */
    public void setAnonymousEnable(boolean anonymousEnable)
    {
        mo.setProperty(CIFSSERVICE.ANONYMOUSENABLE, anonymousEnable);
    }

    /**
     * 获取是否启用Notify
     * @return 是否启用Notify
     */
    public boolean isEnableNotify()
    {
        return mo.getBoolProperty(CIFSSERVICE.ENABLENOTIFY);
    }

    /**
     * 设置是否启用Notify
     * @param enableNotify 是否启用Notify
     */
    public void setEnableNotify(boolean enableNotify)
    {
        mo.setProperty(CIFSSERVICE.ENABLENOTIFY, enableNotify);
    }

    /**
     * 方法 ： getCount
     * 
     * @return long 返回结果
     */
    protected Long getCount()
    {
        return mo.getLongProperty(CIFSSERVICE.COUNT);
    }

}
