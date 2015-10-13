package com.huawei.ism.openapi.nas.cifsservice;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * CifsService接口定义
 * @author gWX183785
 * @version V100R001C10
 */
public interface CIFSServiceHandler
{

    /**
     * CIFSService修改方法
     * @param mo CIFSService mo
     * @throws ApiException API自定义异常
     */
    void modify(CIFSServiceMO mo) throws ApiException;

    /**
     * 获取CIFSService信息
     * @return CIFSService信息
     * @throws ApiException ApiException API自定义异常
     */
    CIFSServiceMO get() throws ApiException;

}
