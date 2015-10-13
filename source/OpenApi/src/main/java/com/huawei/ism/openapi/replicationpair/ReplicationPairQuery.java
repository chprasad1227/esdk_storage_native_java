package com.huawei.ism.openapi.replicationpair;

import com.huawei.ism.openapi.common.batchquery.QueryBase;
/**
 * 批量查询条件
 * @author gWX183785
 * @version V100R001C10
 */
public class ReplicationPairQuery extends QueryBase<ReplicationPairMO>
{
    /**
     * 初始化方法
     * @param mo 远程复制对象
     * @param index 初始索引
     * @param count 数量
     */
    public ReplicationPairQuery(ReplicationPairMO mo,long index, long count)
    {
        super(mo,index,count);
    }
    
    /**
     * 设置远程复制对象
     * @param mo 远程复制对象
     */
    public void setReplicationPairMO(ReplicationPairMO mo)
    {
        setConcretQueryMO(mo);
    }
    
    /**
     * 获取远程复制对象
     * @return 返回结果
     */
    public ReplicationPairMO getReplicationPairMO()
    {
        return getConcretMO();
    }
}
