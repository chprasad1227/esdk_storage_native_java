package com.huawei.ism.openapi.nas.filesystem;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

/**
 * 文件系统查询条件
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class FileSystemQuery extends QueryBase<FileSystemMO>
{

    /**
     * 文件系统批量查询条件
     * @param mo 文件系统对象
     * @param index 数据返回开始下标
     * @param count 数据返回数量
     */
    public FileSystemQuery(FileSystemMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置文件系统查询条件
     * @param mo 文件系统对象
     */
    public void setQueryFileSystemMO(FileSystemMO mo)
    {
        setConcretQueryMO(mo);
    }

    /**
     * 获取文件系统返回数据
     * @return 文件系统返回数据
     */
    public FileSystemMO getFileSystemMO()
    {
        return getConcretMO();
    }

}
