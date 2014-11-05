package com.huawei.ism.openapi.perfstatistic;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 性能统计
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public interface PerfStatisticHandler
{
    /**
     * 获取当前性能值
     * @param mo 性能属性类
     * @return PerfStatisticMO
     * @throws ApiException API自定义异常
     */
    PerfStatisticMO getCurStatisticDataMO(PerfStatisticMO mo) throws ApiException;
}
