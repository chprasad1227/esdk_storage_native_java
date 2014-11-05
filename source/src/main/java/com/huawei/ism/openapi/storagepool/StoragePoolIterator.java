package com.huawei.ism.openapi.storagepool;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.STORAGEPOOL;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 存储池的批量查询迭代器
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class StoragePoolIterator extends ApiIterator<StoragePoolMO, StoragePoolQuery>
{
    private static final String[] preciseFilter = new String[]
    {STORAGEPOOL.PARENTID, STORAGEPOOL.HEALTHSTATUS, STORAGEPOOL.RUNNINGSTATUS};

    private static final String[] fuzzyFilter = new String[]
    {STORAGEPOOL.ID, STORAGEPOOL.NAME};

    /**
     * 存储池迭代器的构造函数
     * @param restRequestHandler rest请求
     * @param deviceID 网元id
     * @param queryCondition 请求条件
     */
    protected StoragePoolIterator(RestRequestHandler restRequestHandler, String deviceID,
        StoragePoolQuery queryCondition)
    {
        super(restRequestHandler, deviceID, queryCondition, false);
    }

    /**
     * 获取对应MO的数量
     * @return long
     * @throws ApiException API异常
     */
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "storagepool",
            "count");

        Map<String, String> headParamMap = composeRequestHeader(false);
        headParamMap.put(STORAGEPOOL.TYPE, String.valueOf(MOType.STORAGEPOOL.getValue()));

        RestManager<StoragePoolMO> moUtil = new RestManager<StoragePoolMO>(StoragePoolMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        StoragePoolMO resPonsemo = moUtil.getGetRequestMO();
        return resPonsemo.getCount();
    }

    /**
     * 获取具体MO批量查询的结果
     * @return List<StoragePoolMO>
     * @throws ApiException API自定义异常
     */
    protected List<StoragePoolMO> getConcretBatchNext(boolean isAssoicate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "storagepool");
        Map<String, String> headParamMap = composeRequestHeader(true);
        headParamMap.put(STORAGEPOOL.TYPE, String.valueOf(MOType.STORAGEPOOL.getValue()));

        RestManager<StoragePoolMO> restManager = new RestManager<StoragePoolMO>(StoragePoolMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        List<StoragePoolMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取StoragePool 的属性Map
     * @param modelMo StoragePool数据对象
     * @return StoragePool 的属性Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(StoragePoolMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
    }

    /**
     * 获取存储池批量查询条件数组
     * @return 存储池批量查询条件数组
     */
    @Override
    protected String[] getConcretFilterHeaders()
    {
        return preciseFilter;
    }

    @Override
    protected String[] getFuzzyFilterHeaders()
    {
        return fuzzyFilter;
    }
}
