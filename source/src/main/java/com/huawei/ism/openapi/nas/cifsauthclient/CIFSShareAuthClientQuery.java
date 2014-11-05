package com.huawei.ism.openapi.nas.cifsauthclient;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

/**
 * 批量查询条件
 * @author gWX183785
 * @version V100R001C10
 */
public class CIFSShareAuthClientQuery extends QueryBase<CIFSShareAuthClientMO>
{

    /**
     * 初始化方法
     * @param mo CIFS共享权限控制对象
     * @param beginIndex 初始索引
     * @param count 数量
     */
    public CIFSShareAuthClientQuery(CIFSShareAuthClientMO mo, long beginIndex, long count)
    {
        super(mo, beginIndex, count);
    }

    /**
     * 设置CIFS共享权限控制对象
     * @param mo CIFS共享权限控制对象
     */
    public void setCIFSShareAuthClientMO(CIFSShareAuthClientMO mo)
    {
        setConcretQueryMO(mo);
    }

    /**
     * 获取CIFS共享权限控制对象
     * @return 返回结果
     */
    public CIFSShareAuthClientMO getCIFSShareAuthClientMO()
    {
        return getConcretMO();
    }
}
