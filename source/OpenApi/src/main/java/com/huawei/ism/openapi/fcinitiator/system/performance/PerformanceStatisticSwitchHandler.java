package com.huawei.ism.openapi.fcinitiator.system.performance;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 性能统计开关的对外开放接口
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public interface PerformanceStatisticSwitchHandler
{

    /**
     * 获取性能统计开关信息
     * @return 性能统计开关bean
     * @throws ApiException API自定义异常
     */
    PerformanceStatisticSwitchMO getPerformanceSwitch() throws ApiException;

    /**
     * 设置性能统计开关
     * @param mo 性能统计开关bean
     * @throws ApiException API自定义异常
     */
    void setPerformanceSwitch(PerformanceStatisticSwitchMO mo) throws ApiException;

}
