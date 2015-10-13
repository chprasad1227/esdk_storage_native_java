package com.huawei.ism.openapi.diskpool;

import java.util.List;
import java.util.Map;
import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.DISKPOOL;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * DiskPool迭代器
 * @author gWX183785
 * @version V100R001C10
 */
public class DiskPoolIterator extends ApiIterator<DiskPoolMO, DiskPoolQuery>
{
    /**
     * 批量查询的可选过滤条件 精确查询参数
     */
    private static final String[] DISKPOOLFILTER =
    {DISKPOOL.DESCRIPTION, DISKPOOL.RUNNINGSTATUS, DISKPOOL.HEALTHSTATUS};

    /**
     * 批量查询的可选过滤条件 模糊查询参数
     */
    private static final String[] diskPoolFuzzyFilter =
    {DISKPOOL.ID, DISKPOOL.NAME};

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     * @param queryCondition 查询条件
     */
    protected DiskPoolIterator(RestRequestHandler restRequestHandler, String deviceID, DiskPoolQuery queryCondition,
        boolean isAssociate)
    {
        super(restRequestHandler, deviceID, queryCondition, isAssociate);
    }

    /**
     * 当前数量
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    protected long getConcretCount() throws ApiException
    {

        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "diskpool",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);
        headParamMap.put(DISKPOOL.TYPE, String.valueOf(MOType.DISKPOOL.getValue()));
        RestManager<DiskPoolMO> restManager = new RestManager<DiskPoolMO>(DiskPoolMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        DiskPoolMO diskPoolMO = restManager.getGetRequestMO();
        return Long.valueOf((String) diskPoolMO.getMO().getProperty(DISKPOOL.COUNT));
    }

    /**
     * 批量查询
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    protected List<DiskPoolMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "diskpool");
        Map<String, String> headParamMap = composeRequestHeader(true);
        headParamMap.put(DISKPOOL.TYPE, String.valueOf(MOType.DISKPOOL.getValue()));
        RestManager<DiskPoolMO> restManager = new RestManager<DiskPoolMO>(DiskPoolMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        return restManager.getGetRequestMOList();
    }

    /**
     * 获取硬盘池属性Map
     * @param modelMo 硬盘池属性对象
     * @return 硬盘池属性Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(DiskPoolMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
    }

    /**
     * 获取批量查询的过滤头信息
     * @return 批量查询的过滤头
     */
    @Override
    protected String[] getConcretFilterHeaders()
    {
        return DISKPOOLFILTER;
    }

    @Override
    protected String[] getFuzzyFilterHeaders()
    {
        return diskPoolFuzzyFilter;
    }

}
