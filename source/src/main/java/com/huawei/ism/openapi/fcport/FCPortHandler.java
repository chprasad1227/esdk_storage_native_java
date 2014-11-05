package com.huawei.ism.openapi.fcport;

import java.util.List;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * FC端口接口
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public interface FCPortHandler
{
    /**
     * 查询单个FCPORT
     * @param id FC端口的ID
     * @return FCPortMO
     * @throws ApiException API异常
     */
    FCPortMO get(String id) throws ApiException;

    /**
     * 批量查询FCPORT
     * @param condition 查询条件
     * @return FCPortIterator
     */
    FCPortIterator getBatch(FCPortQuery condition);

    /**
     * 修改
     * @param mo FC端口信息
     * @throws ApiException API异常
     */
    void modify(FCPortMO mo) throws ApiException;

    /**
     * 根据portGroupId查询FC端口
     * @param portGroupId 端口组ID
     * @return List<FCPortMO>
     * @throws ApiException API异常
     */
    List<FCPortMO> getFCPortByPortGroup(String portGroupId) throws ApiException;

}
