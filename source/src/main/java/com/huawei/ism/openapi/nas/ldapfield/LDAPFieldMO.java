package com.huawei.ism.openapi.nas.ldapfield;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LdapTransferE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.PasswordHashE;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.LDAPFIELD;
import com.huawei.ism.openapi.common.model.MO;

/**
 * LDAP域对象
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class LDAPFieldMO
{

    private final MO mo;

    /**
     * LDAP域构造方法
     */
    public LDAPFieldMO()
    {
        this.mo = new MO();
    }

    /**
     * LDAP域构造方法
     * @param mo LDAP对象
     */
    public LDAPFieldMO(MO mo)
    {
        this.mo = mo;
    }

    /**
     * LDAP域构造方法
     * @param jObject json对象
     */
    public LDAPFieldMO(JSONObject jObject)
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
     * 获取租户ID(0表示全局）
     * @return 租户ID
     */
    public Long getTenancyId()
    {
        return mo.getLongProperty(LDAPFIELD.TENANCYID);
    }

    /**
     * 设置租户ID
     * @param tenancyId 租户ID
     */
    public void setTenancyId(Long tenancyId)
    {
        mo.setProperty(LDAPFIELD.TENANCYID, tenancyId);
    }

    /**
     * 逗号分隔的LDAP服务器ip，最多3个IP
     * @return LDAP服务ip
     */
    public String getLdapserver()
    {
        return mo.getStrProperty(LDAPFIELD.LDAPSERVER);
    }

    /**
     * 设置LDAP服务ip
     * @param ldapserver LDAP服务IP
     */
    public void setLdapserver(String ldapserver)
    {
        mo.setProperty(LDAPFIELD.LDAPSERVER, ldapserver);
    }

    /**
     * 获取ldap的监听端口号（如不配置，默认为389）
     * @return ldap监听端口号
     */
    public Long getPortnum()
    {
        return mo.getLongProperty(LDAPFIELD.PORTNUM);
    }

    /**
     * 设置ldap的监听端口号（如不配置，默认为389）
     * @param portnum ldap的监听端口号
     */
    public void setPortnum(Long portnum)
    {
        mo.setProperty(LDAPFIELD.PORTNUM, portnum);
    }

    /**
     * 获取底层通讯协议类型:LDAP,LDAPS
     * @return 底层通讯协议类型
     */
    public LdapTransferE getTransferType()
    {
        return LdapTransferE.valueOf(mo.getIntProperty(LDAPFIELD.TRANSFERTYPE));
    }

    /**
     * 设置底层通讯协议类型
     * @param ldapTransfer 底层通讯协议类型
     */
    public void setTransferType(LdapTransferE ldapTransfer)
    {
        mo.setProperty(LDAPFIELD.TRANSFERTYPE,
            Integer.parseInt(String.valueOf(ldapTransfer.getValue())));
    }

    /**
     * 获取绑定登陆的用户，如果不选，默认为匿名用户
     * @return 绑定登陆的用户
     */
    public String getUserName()
    {
        return mo.getStrProperty(LDAPFIELD.USERNAME);
    }

    /**
     * 设置绑定登陆的用户，如果不选，默认为匿名用户
     * @param userName 绑定登陆的用户
     */
    public void setUserName(String userName)
    {
        mo.setProperty(LDAPFIELD.USERNAME, userName);
    }

    /**
     * 绑定登陆用户的密码，需要与LDAP服务器端该用户密码一致
     * @return 登陆用户的密码
     */
    public String getPassword()
    {
        return mo.getStrProperty(LDAPFIELD.PWD);
    }

    /**
     * 设置登陆用户的密码，需要与LDAP服务器端该用户密码一致
     * @param password 密码
     */
    public void setPassword(String password)
    {
        mo.setProperty(LDAPFIELD.PWD, password);
    }

    /**
     * 查找user的过滤条件（如不配置，默认从根开始查找）
     * @return user的过滤条件
     */
    public String getUserSuffix()
    {
        return mo.getStrProperty(LDAPFIELD.USERSUFFIX);
    }

    /**
     * 设置查找user的过滤条件（如不配置，默认从根开始查找）
     * @param userSuffix user的过滤条件
     */
    public void setUserSuffix(String userSuffix)
    {
        mo.setProperty(LDAPFIELD.USERSUFFIX, userSuffix);
    }

    /**
     * 查找group的过滤条件（如不配置，默认从根开始查找）
     * @return group的过滤条件
     */
    public String getGroupsuffix()
    {
        return mo.getStrProperty(LDAPFIELD.GROUPSUFFIX);
    }

    /**
     * 设置查找group的过滤条件（如不配置，默认从根开始查找）
     * @param groupSuffix group的过滤条件
     */
    public void setGroupsuffix(String groupSuffix)
    {
        mo.setProperty(LDAPFIELD.GROUPSUFFIX, groupSuffix);
    }

    /**
     * 获取基准DN（Distinguished Name），LDAP服务器的根目录
     * @return 基准DN（Distinguished Name），LDAP服务器的根目录
     */
    public String getBasedn()
    {
        return mo.getStrProperty(LDAPFIELD.BASEDN);
    }

    /**
     * 设置基准DN（Distinguished Name），LDAP服务器的根目录
     * @param basedn 基准DN（Distinguished Name），LDAP服务器的根目录
     */
    public void setBasedn(String basedn)
    {
        mo.setProperty(LDAPFIELD.BASEDN, basedn);
    }

    /**
     * 获取密码所选用的加密方式（可选为clear，md5，crypt）
     * @return 密码所选用的加密方式（可选为clear，md5，crypt）
     */
    public PasswordHashE getPasswordHash()
    {
        return PasswordHashE.valueOf(mo.getIntProperty(LDAPFIELD.PWDHASH));
    }

    /**
     * 设置密码所选用的加密方式（可选为clear，md5，crypt）
     * @param passwordHash 密码所选用的加密方式（可选为clear，md5，crypt）
     */
    public void setPasswordHash(PasswordHashE passwordHash)
    {
        mo.setProperty(LDAPFIELD.PWDHASH,
            Integer.parseInt(String.valueOf(passwordHash.getValue())));
    }

    /**
     * 设置查找密码的过滤条件（如不配置，默认从根开始查找）
     * @return 查找密码的过滤条件（如不配置，默认从根开始查找）
     */
    public String getShadowSuffix()
    {
        return mo.getStrProperty(LDAPFIELD.SHADOWSUFFIX);
    }

    /**
     * 设置查找密码的过滤条件（如不配置，默认从根开始查找）
     * @param shadowSuffix 查找密码的过滤条件（如不配置，默认从根开始查找）
     */
    public void setShadowSuffix(String shadowSuffix)
    {
        mo.setProperty(LDAPFIELD.SHADOWSUFFIX, shadowSuffix);
    }
}
