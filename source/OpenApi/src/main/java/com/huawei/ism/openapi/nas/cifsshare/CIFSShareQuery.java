package com.huawei.ism.openapi.nas.cifsshare;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

/**
 * CIFSShare查询条件
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class CIFSShareQuery extends QueryBase<CIFSShareMO>
{

    /**
     * CIFS共享条件
     * @param mo cifs对象
     * @param index 数据返回开始下标
     * @param count 数据返回数量
     */
    public CIFSShareQuery(CIFSShareMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置CIFS共享查询条件
     * @param mo cifs对象
     */
    public void setQueryCIFSShareMO(CIFSShareMO mo)
    {
        setConcretQueryMO(mo);
    }

    /**
     * 获取CIFS共享返回数据
     * @return CIFS共享数据
     */
    public CIFSShareMO getCIFSShareMO()
    {
        return getConcretMO();
    }

}
