package com.huawei.ism.openapi.cachepartition;

import java.util.List;
import java.util.Map;
import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 存储分区批量查询迭代器
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class CachePartitionIterator extends ApiIterator<CachePartitionMO, CachePartitionQuery>
{
    private boolean isAssociate;

    /**
     * CachePartitionIterator
     * @param restRequestHandler REST请求
     * @param deviceID 设备ID
     * @param queryCondition 查询条件
     */
    protected CachePartitionIterator(RestRequestHandler restRequestHandler, String deviceID,
        CachePartitionQuery queryCondition, boolean isAssociate)
    {
        super(restRequestHandler, deviceID, queryCondition, isAssociate);
        this.isAssociate = isAssociate;
    }

    /**
     * 获取具体MO批量查询的结果
     * @return List<CachePartitionMO>
     * @throws ApiException API异常
     */
    protected List<CachePartitionMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath;
        if (!isAssociate)
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "cachepartition");
        }
        else
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lun", "associate",
                "cachepartition");
        }
        Map<String, String> headParamMap = composeRequestHeader(true);
        headParamMap.put("TYPE", String.valueOf(MOType.CACHEPARTITION.getValue()));

        RestManager<CachePartitionMO> restManager = new RestManager<CachePartitionMO>(CachePartitionMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        List<CachePartitionMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取对应MO的数量
     * @return long
     * @throws ApiException API异常
     */
    protected long getConcretCount() throws ApiException
    {
        String relativePath;
        if (!isAssociate)
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "cachepartition");
        }
        else
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lun", "associate",
                "cachepartition");
        }
        Map<String, String> headParamMap = composeRequestHeader(false);
        headParamMap.put("TYPE", String.valueOf(MOType.CACHEPARTITION.getValue()));

        RestManager<CachePartitionMO> restManager = new RestManager<CachePartitionMO>(CachePartitionMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);

        List<CachePartitionMO> cachePartitionMOs = restManager.getGetRequestMOList();
        return (null != cachePartitionMOs) ? cachePartitionMOs.size() : 0;
    }

    /**
     * 获取CachePart 对应的属性Map
     * @param modelMo CachePart数据类型
     * @return CachePart 对应的属性Map
     */
    protected Map<Object, Object> getConcretMoMap(CachePartitionMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
    }

    /**
     * 获取LUN批量查询条件数组
     * @return LUN批量查询条件数组
     */
    protected String[] getConcretFilterHeaders()
    {
        return new String[0];
    }

    @Override
    protected String[] getFuzzyFilterHeaders()
    {
        return new String[0];
    }
}
