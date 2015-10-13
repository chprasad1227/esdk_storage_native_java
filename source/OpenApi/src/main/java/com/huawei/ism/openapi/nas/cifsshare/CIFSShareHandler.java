package com.huawei.ism.openapi.nas.cifsshare;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * CIFS共享对外开放接口
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public interface CIFSShareHandler
{

    /**
     * 创建CIFS共享
     * @param mo CIFS域mo
     * @return CIFS域信息
     * @throws ApiException API自定义异常
     */
    CIFSShareMO create(CIFSShareMO mo) throws ApiException;

    /**
     * CIFS域修改方法
     * @param mo CIFS域mo
     * @throws ApiException API自定义异常
     */
    void modify(CIFSShareMO mo) throws ApiException;

    /**
     * 获取CIFS域信息
     * @param id id
     * @return CIFS域信息
     * @throws ApiException ApiException API自定义异常
     */
    CIFSShareMO get(String id) throws ApiException;

    /**
     * 删除CIFS域
     * @param id CIFS域ID
     * @throws ApiException API自定义异常
     */
    void delete(String id) throws ApiException;

    /**
     * 批量查询
     * @param condition 批量查询过滤条件
     * @return 批量查询返回值
     */
    CIFSShareIterator getBatch(CIFSShareQuery condition);
}
