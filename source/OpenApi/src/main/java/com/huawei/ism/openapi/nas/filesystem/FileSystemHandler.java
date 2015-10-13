package com.huawei.ism.openapi.nas.filesystem;

import java.util.List;

import com.huawei.ism.openapi.common.exception.ApiException;

/**
 * 文件系统对外接口
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public interface FileSystemHandler
{
    /**
     * 创建文件系统
     * @param mo 文件系统mo
     * @return 文件系统mo
     * @throws ApiException 自定义异常
     */
    FileSystemMO create(FileSystemMO mo) throws ApiException;

    /**
     * 修改文件系统
     * @param mo 文件系统mo
     * @throws ApiException 自定义异常
     */
    void modify(FileSystemMO mo) throws ApiException;

    /**
     * 查询文件系统
     * @param fileSystemId 系统信息ID
     * @return 文件系统信息
     * @throws ApiException 自定义异常
     */
    FileSystemMO get(String fileSystemId) throws ApiException;

    /**
     * 删除文件系统信息
     * @param fileSystemId 系统信息id
     * @throws ApiException 自定义异常
     */
    void delete(String fileSystemId) throws ApiException;

    /**
     * 批量查询文件系统信息
     * @param condition 文件系统过滤条件
     * @return 满足过滤条件的文件系统信息
     * @throws ApiException 自定义异常
     */
    FileSystemIterator getBatch(FileSystemQuery condition) throws ApiException;

    /**
     * 通过存储池查询文件系统
     * @param storagePoolId 存储池ID
     * @return 满足关联条件的文件系统信息
     * @throws ApiException 自定义异常
     */
    List<FileSystemMO> getFileSystemByStoragePool(String storagePoolId) throws ApiException;
}
