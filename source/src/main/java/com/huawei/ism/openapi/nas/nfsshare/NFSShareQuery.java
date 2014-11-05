package com.huawei.ism.openapi.nas.nfsshare;

import com.huawei.ism.openapi.common.batchquery.QueryBase;
/**
 * NFS共享过滤条件
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class NFSShareQuery extends QueryBase<NFSShareMO>
{

    /**
     * NFS共享过滤条件
     * @param mo NFS共享对象
     * @param index 开始索引
     * @param count 数量
     */
    public NFSShareQuery(NFSShareMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置NFS共享查询条件
     * @param mo NFS对象
     */
    public void setQueryNFSShareMO(NFSShareMO mo)
    {
        setConcretQueryMO(mo);
    }

    /**
     * 获取NFS共享对象
     * @return nfs共享对象
     */
    public NFSShareMO getNFSShareMO()
    {
        return getConcretMO();
    }

}
