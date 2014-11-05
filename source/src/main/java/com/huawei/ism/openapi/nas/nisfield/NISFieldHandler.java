package com.huawei.ism.openapi.nas.nisfield;

import com.huawei.ism.openapi.common.exception.ApiException;
/**
 * NIS域接口
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public interface NISFieldHandler
{

    /**
     * NIS域修改方法
     * @param mo NIS域mo
     * @throws ApiException API自定义异常
     */
    void modify(NISFieldMO mo) throws ApiException;

    /**
     * 获取LDAP域信息
     * @return LDAP域信息
     * @throws ApiException API自定义异常
     */
    NISFieldMO get() throws ApiException;

}
