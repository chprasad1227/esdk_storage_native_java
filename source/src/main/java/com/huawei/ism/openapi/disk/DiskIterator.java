package com.huawei.ism.openapi.disk;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.DISK;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 硬盘批量查询迭代器
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class DiskIterator extends ApiIterator<DiskMO, DiskQuery>
{
    /**
     * 硬盘迭代器
     * @param restRequestHandler REST请求
     * @param deviceID 设备ID
     * @param queryCondition 查询条件
     */
    protected DiskIterator(RestRequestHandler restRequestHandler, String deviceID, DiskQuery queryCondition,
        boolean isAssociate)
    {
        super(restRequestHandler, deviceID, queryCondition, isAssociate);
    }

    /**
     * 获取具体MO批量查询的结果
     * @return List<DiskMO>
     * @throws ApiException API异常
     */
    protected List<DiskMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "disk");
        Map<String, String> headParamMap = composeRequestHeader(true);

        RestManager<DiskMO> restManager = new RestManager<DiskMO>(DiskMO.class, getRestRequestHandler(), relativePath,
            headParamMap, null);
        List<DiskMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取对应MO的数量
     * @return long
     * @throws ApiException API异常
     */
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "disk", "count");
        Map<String, String> headParamMap = composeRequestHeader(false);

        RestManager<DiskMO> restManager = new RestManager<DiskMO>(DiskMO.class, getRestRequestHandler(), relativePath,
            headParamMap, null);
        DiskMO diskMO = restManager.getGetRequestMO();
        return Long.valueOf((String) diskMO.getMO().getProperty(DISK.COUNT));
    }

    /**
     * 获取硬盘模块对应的属性Map
     * @param modelMo 硬盘数据对象
     * @return 硬盘模块对应的属性Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(DiskMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
    }

    /**
     * 获取DISK批量查询条件数组
     * @return DISK批量查询条件数组
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
