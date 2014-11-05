package com.huawei.ism.openapi.mappingview;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 视图的接口
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public interface MappingViewHandler
{
    /**
     * 创建LUN组和主机组之间的视图映射
     * @param lunGroupId lunGroupID
     * @param hostGroupId hostGroupID
     * @throws ApiException API自定义异常
     */
    void createMap(String lunGroupId, String hostGroupId) throws ApiException;

    /**
     * 创建LUN组、端口组和主机组之间的视图映射
     * @param lunGroupId lunGroup id
     * @param portGroupId portGroup id
     * @param hostGroupId hostGroup id
     * @throws ApiException API自定义异常
     */

    void createMap(String lunGroupId, String portGroupId, String hostGroupId) throws ApiException;

    /**
     * 移除主机组和LUN组之间的视图
     * @param lunGroupId lunGroup id
     * @param hostGroupId hostGroup id
     * @throws ApiException API自定义异常
     */
    void removeMap(String lunGroupId, String hostGroupId) throws ApiException;

    /**
     * 移除LUN组、端口组和主机组之间的视图
     * @param lunGroupId lunGroup id
     * @param portGroupId portGroup id
     * @param hostGroupId hostGroup id
     * @throws ApiException API自定义异常
     */
    void removeMap(String lunGroupId, String portGroupId, String hostGroupId) throws ApiException;

    /**
     * 查询映射视图总数
     * @return Long
     * @throws ApiException
     */
    Long getCount() throws ApiException;
}
