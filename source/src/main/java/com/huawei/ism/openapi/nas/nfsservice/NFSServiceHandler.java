package com.huawei.ism.openapi.nas.nfsservice;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * NfsService接口定义
 * @author gWX183785
 * @version V100R001C10
 */
public interface NFSServiceHandler
{

    /**
     * NFSService修改方法
     * @param mo NFSService mo
     * @throws ApiException API自定义异常
     */
    void modify(NFSServiceMO mo) throws ApiException;

    /**
     * 获取NFSService信息
     * @param id id
     * @return NFSService信息
     * @throws ApiException ApiException API自定义异常
     */
    NFSServiceMO get(String id) throws ApiException;

}
