package com.huawei.ism.openapi.nas.quota;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 配额接口类
 * @author fWX183786
 * @version V100R001C10
 */
public interface QuotaHandler
{
    /**
     * 创建配额
     * @param mo Quota对象信息
     * @return 创建后返回的Quota对象信息
     * @throws ApiException 异常
     */
    QuotaMO create(QuotaMO mo) throws ApiException;

    /**
     * 修改Quota
     * @param mo Quota对象数据
     * @throws ApiException 异常
     */
    void modify(QuotaMO mo) throws ApiException;

    /**
     * 删除Quota
     * @param quotaId Quota ID
     * @throws ApiException 异常
     */
    void delete(String quotaId) throws ApiException;

    /**
     * 查询quota
     * @param quotaId quota id
     * @param isSearchReport 查询报告
     * @return quota 数据对象
     * @throws ApiException 异常
     */
    QuotaMO get(String quotaId, Boolean isSearchReport) throws ApiException;

    /**
     * 获取批量查询迭代器
     * @param condition Quota查询条件
     * @return QuotaIterator
     */
    QuotaIterator getBatch(QuotaQuery condition);
}
