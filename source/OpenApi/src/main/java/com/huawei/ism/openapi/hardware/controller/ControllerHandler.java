package com.huawei.ism.openapi.hardware.controller;

import java.util.Iterator;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 控制器对外开放接口
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public interface ControllerHandler
{

    /**
     * 查询控制器
     * @param controllerId 控制器的id
     * @return 返回的控制器
     * @throws ApiException API自定义异常
     */
    ControllerMO get(String controllerId) throws ApiException;

    /**
     * 批量查询控制器
     * @return 返回控制器的迭代器
     * @throws ApiException API自定义异常
     */
    Iterator<ControllerMO> getBatch() throws ApiException;

}
