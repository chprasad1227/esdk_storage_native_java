package com.huawei.ism.openapi.remotedevice;

import com.huawei.ism.openapi.common.batchquery.QueryBase;

public class RemoteDeviceQuery extends QueryBase<RemoteDeviceMO>
{
    /**
     * 批量查询条件
     * @param mo 批量查询条件
     * @param index 起始索引
     * @param count 查询数量
     */
    public RemoteDeviceQuery(RemoteDeviceMO mo, long index, long count)
    {
        super(mo, index, count);
    }

    /**
     * 设置批量查询条件
     * @param mo 批量查询条件
     */
    public void setQueryRemoteDeviceMO(RemoteDeviceMO mo)
    {
        setConcretQueryMO(mo);
    }

    public RemoteDeviceMO getRemoteDeviceMO()
    {
        return getConcretMO();
    }
}
