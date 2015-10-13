package com.huawei.ism.openapi.nas.adfield;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.DOMAIN_STATUS_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.JOINDOMAINERRORCODE_E;
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
     * 方法 ： getDomainStatus
     * 
     * @return DOMAIN_STATUS_E 返回结果
     */
    public DOMAIN_STATUS_E getDomainStatus()
    {
        return DOMAIN_STATUS_E.valueOf(mo.getIntProperty(ADFIELD.DOMAINSTATUS));
    }

    /**
     * 对domainStatus进行赋值
     * @param domainStatus 方法参数：domainStatus
     */
    public void setDomainStatus(DOMAIN_STATUS_E domainStatus)
    {
        mo.setProperty(ADFIELD.DOMAINSTATUS, domainStatus.getValue());
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

    /**
     * 获取CIFS域控制器名
     * @return CIFS域控制器名
     */
    public String getCIFSDomainController()
    {
        return mo.getStrProperty(ADFIELD.CIFSDOMAINCONTROLLER);
    }

    /**
     * 获取AD认证是否采用Kerberos方法
     * @return AD认证是否采用Kerberos方法
     */
    public Boolean getUseKerberos()
    {
        return mo.getBoolProperty(ADFIELD.USEKERBEROS);
    }

    /**
     * 获取加入域的阵列机器名
     * @return 加入域的阵列机器名
     */
    public String getSystemName()
    {
        return mo.getStrProperty(ADFIELD.SYSTEMNAME);
    }

    /**
     * 设置加入域的阵列机器名
     * @param systemName 加入域的阵列机器名
     */
    public void setSystemName(String systemName)
    {
        mo.setProperty(ADFIELD.SYSTEMNAME, systemName);
    }

    /**
     * 获取站点名称
     * @return 站点名称
     */
    public String getSiteName()
    {
        return mo.getStrProperty(ADFIELD.SITENAME);
    }

    /**
     * 设置站点名称
     * @param siteName 站点名称
     */
    public void setSiteName(String siteName)
    {
        mo.setProperty(ADFIELD.SITENAME, siteName);
    }

    /**
     * 加入域失败错误
     * @return JOINDOMAINERRORCODE_E
     */
    public JOINDOMAINERRORCODE_E getjoinDomainErrorCode()
    {
        return JOINDOMAINERRORCODE_E.valueOf(mo.getIntProperty(ADFIELD.JOINDOMAINERRORCODE));
    }

}
