package com.huawei.ism.openapi.nas.adfield;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * AD域接口
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public interface ADFieldHandler
{

    /**
     * AD域修改方法
     * @param mo AD域mo
     * @throws ApiException API自定义异常
     */
    void modify(ADFieldMO mo) throws ApiException;

    /**
     * 获取AD域信息
     * @return AD域信息
     * @throws ApiException API自定义异常
     */
    ADFieldMO get() throws ApiException;

}
