package com.huawei.ism.openapi.nas.nfsauthclient;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

/**
 * 批量查询条件
 * @author gWX183785
 * @version V100R001C10
 */
public class NFSShareAuthClientQuery extends QueryBase<NFSShareAuthClientMO>
{

    /**
     * 初始化方法
     * @param mo NFS共享权限控制对象
     * @param beginIndex 初始索引
     * @param count 数量
     */
    public NFSShareAuthClientQuery(NFSShareAuthClientMO mo, long beginIndex, long count)
    {
        super(mo, beginIndex, count);
    }

    /**
     * 设置NFS共享权限控制对象
     * @param mo NFS共享权限控制对象
     */
    public void setNFSShareAuthClientMO(NFSShareAuthClientMO mo)
    {
        setConcretQueryMO(mo);
    }

    /**
     * 获取NFS共享权限控制对象
     * @return 返回结果
     */
    public NFSShareAuthClientMO getNFSShareAuthClientMO()
    {
        return getConcretMO();
    }
}
