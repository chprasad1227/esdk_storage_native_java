package com.huawei.ism.openapi.nas.homedir;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * HomeDir接口定义
 * @author gWX183785
 * @version V100R001C10
 */
public interface HomeDirHandler
{

    /**
     * 主目录修改方法
     * @param mo 主目录mo
     * @throws ApiException API自定义异常
     */
    void modify(HomeDirMO mo) throws ApiException;

    /**
     * 获取主目录信息
     * @param id id
     * @return 主目录信息
     * @throws ApiException ApiException API自定义异常
     */
    HomeDirMO get(String id) throws ApiException;

    /**
     * 批量查询主目录信息
     * @param condition 批量查询条件
     * @return 返回结果
     */
    HomeDirIterator getBatch(HomeDirQuery condition);
}
