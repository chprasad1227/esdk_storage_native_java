package com.huawei.ism.openapi.nas.adfield;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.NtlmLevelE;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.ADFIELD;
import com.huawei.ism.openapi.common.model.MO;

/**
 * AD域MO
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class ADFieldMO
{

    private final MO mo;

    /**
     * AD域的构造函数
     */
    public ADFieldMO()
    {
        this.mo = new MO();
    }

    /**
     * AD域对应的构造函数
     * @param mo AD域MO
     */
    public ADFieldMO(MO mo)
    {
        this.mo = mo;
    }

    /**
     * AD域的构造函数
     * @param jObject AD域对应的json数组
     */
    protected ADFieldMO(JSONObject jObject)
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
     * 获取租户ID(0表示全局）
     * @return 租户ID
     */
    public Long getTenancyId()
    {
        return mo.getLongProperty(ADFIELD.TENANCYID);
    }

    /**
     * 设置租户ID
     * @param tenancyId 租户ID
     */
    public void setTenancyId(Long tenancyId)
    {
        mo.setProperty(ADFIELD.TENANCYID, tenancyId);
    }

    /**
     * 获取登录域管理员用户名
     * @return 登录域管理员用户名
     */
    public String getAdminName()
    {
        return mo.getStrProperty(ADFIELD.ADMINNAME);
    }

    /**
     * 设置登录域管理员用户名
     * @param adminName 登录域管理员用户名
     */
    public void setAdminName(String adminName)
    {
        mo.setProperty(ADFIELD.ADMINNAME, adminName);
    }

    /**
     * 获取登录域管理员密码
     * @return 登录域管理员密码
     */
    public String getAdminPwd()
    {
        return mo.getStrProperty(ADFIELD.ADMINPWD);
    }

    /**
     * 设置登录域管理员密码
     * @param adminPwd 登录域管理员密码
     */
    public void setadminPwd(String adminPwd)
    {
        mo.setProperty(ADFIELD.ADMINPWD, adminPwd);
    }

    /**
     * 获取是否加入域
     * @return 是否加入域
     */
    public Boolean getJoined()
    {
        return mo.getBoolProperty(ADFIELD.JOINED);
    }

    /**
     * 设置是否加入域
     * @param joined 是否加入域
     */
    public void setJoined(Boolean joined)
    {
        mo.setProperty(ADFIELD.JOINED, joined);
    }

    /**
     * 获取域的全域名称
     * @return 域的全域名称
     */
    public String getFullDomainName()
    {
        return mo.getStrProperty(ADFIELD.FULLDOMAINNAME);
    }

    /**
     * 设置域的全域名称
     * @param fullDomainName 域的全域名称
     */
    public void setFullDomainName(String fullDomainName)
    {
        mo.setProperty(ADFIELD.FULLDOMAINNAME, fullDomainName);
    }

    /**
     * 0、1、2、3、4(放在命令行设置，默认级别是4)
     * @return NtlmLevelE
     */
    public NtlmLevelE getNTLMLevel()
    {
        return NtlmLevelE.valueOf(mo.getIntProperty(ADFIELD.NTLMLEVEL));
    }

    /**
     * 设置ntlm级别
     * @param ntlmLevelE ntlm级别
     */
    public void setNTLMLevel(NtlmLevelE ntlmLevelE)
    {
        mo.setProperty(ADFIELD.NTLMLEVEL, ntlmLevelE);
    }

    /**
     * 获取组织单元
     * @return 组织单元
     */
    public String getOU()
    {
        return mo.getStrProperty(ADFIELD.OU);
    }

    /**
     * 设置组织单元
     * @param ou 组织单元
     */
    public void setOU(String ou)
    {
        mo.setProperty(ADFIELD.OU, ou);
    }
}
