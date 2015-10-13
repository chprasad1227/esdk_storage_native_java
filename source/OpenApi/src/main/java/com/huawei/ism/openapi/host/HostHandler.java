package com.huawei.ism.openapi.host;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * Host 对外开放的接口
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public interface HostHandler
{

    /**
     * 创建一个host
     * @param mo host的bean
     * @return 返回host的实例
     * @throws ApiException API自定义异常
     */
    HostMO create(HostMO mo) throws ApiException;

    /**
     * 修改host
     * @param mo host的实例
     * @throws ApiException API自定义异常
     */
    void modify(HostMO mo) throws ApiException;

    /**
     * 查询host
     * @param hostId 输入hostId
     * @return 返回host
     * @throws ApiException API自定义异常
     */
    HostMO get(String hostId) throws ApiException;

    /**
     * 批量查询host
     * @param condition 查询host的条件
     * @return 返回host自定义的迭代器
     */
    HostIterator getBatch(HostQuery condition);

    /**
     * 删除host
     * @param hostId 待删除的hostId
     * @throws ApiException API自定义异常
     */
    void delete(String hostId) throws ApiException;

    /**
     * 通过hostGroup查询host
     * @param hostGroupId 关联的hostGroupId
     * @return 返回host的List
     * @throws ApiException API自定义异常
     */
    HostIterator getHostbyHostGroup(String hostGroupId, HostQuery condition) throws ApiException;

    /**
     * 查询主机总数
     * @return Long
     * @throws ApiException
     */
    Long getCount() throws ApiException;

}
