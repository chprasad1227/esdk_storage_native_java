package com.huawei.ism.openapi.nas.quotatree;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * QuotaTree 对外开放的接口
 * @author fWX183786
 * @version V100R001C10
 */
public interface QuotaTreeHandler
{
    /**
     * 创建配额树
     * @param mo QuotaTree 数据对象
     * @return QuotaTree 数据对象
     * @throws ApiException 异常
     */
    QuotaTreeMO create(QuotaTreeMO mo) throws ApiException;

    /**
     * 修改配额树
     * @param mo QuotaTree 数据对象
     * @throws ApiException 异常
     */
    void modify(QuotaTreeMO mo) throws ApiException;

    /**
     * 查询配额树信息
     * @param quotaTreeId 配额树ID
     * @return 配额树信息
     * @throws ApiException 异常
     */
    QuotaTreeMO get(String quotaTreeId) throws ApiException;

    /**
     * 删除配额树
     * @param quotaTreeId 配额树id
     * @throws ApiException API自定义异常
     */
    void delete(String quotaTreeId) throws ApiException;

    /**
     * 批量查询
     * @param condition qTree 查询条件
     * @return qTree批量查询迭代器
     */
    QuotaTreeIterator getBatch(QuotaTreeQuery condition);

}
