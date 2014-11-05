package com.huawei.ism.openapi.common.batchquery;

/**
 * 查询条件模板
 * @author fWX183786
 * @version V100R001C10
 * @param <T> 具体查询模块的数据MO
 */

public class QueryBase<T>
{
    private long count;

    private long index;

    private T mo;

    /**
     * 构造函数
     * @param mo 具体查询过滤条件
     * @param index 查询索引
     * @param count 查询的数量
     */
    public QueryBase(T mo, long index, long count)
    {
        this.mo = mo;
        this.index = index;
        this.count = count;
    }

    /**
     * 获取查询起始位置
     * @return 查询起始位置
     */
    public long getBeginIndex()
    {
        return index;
    }

    /**
     * 设置查询起始位置
     * @param beginIndex 查询起始位置索引
     */
    public void setBeginIndex(long beginIndex)
    {
        this.index = beginIndex;
    }

    /**
     * 获取批量查询的数量
     * @return 批量查询的数量
     */
    public long getCount()
    {
        return count;
    }

    /**
     * 设置批量查询的数量
     * @param count 批量查询的数量
     */
    public void setCount(long count)
    {
        this.count = count;
    }

    /**
     * 设置批量查询的条件
     * @param dataMo 批量查询的条件
     */
    protected void setConcretQueryMO(T dataMo)
    {
        this.mo = dataMo;
    }

    /**
     * 获取具体查询的条件
     * @return 具体查询的条件
     */
    protected T getConcretMO()
    {
        return mo;
    }
}
