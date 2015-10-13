package com.huawei.ism.openapi.nas.ldapfield;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * LDAP域
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public interface LDAPFieldHandler
{

    /**
     * LDAP域修改方法
     * @param mo LDAP域mo
     * @throws ApiException API自定义异常
     */
    void modify(LDAPFieldMO mo) throws ApiException;

    /**
     * 获取LDAP域信息
     * @return LDAP域信息
     * @throws ApiException API自定义异常
     */
    LDAPFieldMO get() throws ApiException;
    
    /**
     * LDAP域恢复初始化
     * @throws ApiException
     */
    void delete() throws ApiException;

}
