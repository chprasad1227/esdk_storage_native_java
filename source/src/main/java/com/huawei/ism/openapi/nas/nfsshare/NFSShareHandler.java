package com.huawei.ism.openapi.nas.nfsshare;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * NFS共享接口
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public interface NFSShareHandler
{

    /**
     * 创建NFS共享
     * @param mo NFS域mo
     * @return NFS域信息
     * @throws ApiException API自定义异常
     */
    NFSShareMO create(NFSShareMO mo) throws ApiException;

    /**
     * NFS域修改方法
     * @param mo NFS域mo
     * @throws ApiException API自定义异常
     */
    void modify(NFSShareMO mo) throws ApiException;

    /**
     * 获取NFS域信息
     * @param id id
     * @return NFS域信息
     * @throws ApiException ApiException API自定义异常
     */
    NFSShareMO get(String id) throws ApiException;

    /**
     * 删除NFS域
     * @param id NFS域ID
     * @throws ApiException API自定义异常
     */
    void delete(String id) throws ApiException;

    /**
     * 批量查询NFS共享信息
     * @param condition 批量查询过滤条件
     * @return NFS信息
     */
    NFSShareIterator getBatch(NFSShareQuery condition);
}
