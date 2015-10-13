package com.huawei.ism.openapi.nas.vstore;

import java.util.List;
import java.util.Map;
import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 租户迭代器
 * @author fWX183786
 * @version V100R001C10
 */
public class VstoreIterator extends ApiIterator<VStoreMO, VStoreQuery>
{
    /**
     * 构造函数
     * @param restRequestHandler rest请求处理类
     * @param deviceID 设备ID
     * @param qCondition 批量查询条件
     */
    public VstoreIterator(RestRequestHandler restRequestHandler, String deviceID, VStoreQuery qCondition)
    {
        super(restRequestHandler, deviceID, qCondition, false);
    }

    /**
     * 获取数量
     * @return 数量
     * @throws ApiException 异常
     */
    @Override
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "vstore",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);

        RestManager<VStoreMO> restManager = new RestManager<VStoreMO>(VStoreMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        VStoreMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }

    /**
     * 获取批量数据
     * @return 批量数据
     * @throws ApiException 异常
     */
    @Override
    protected List<VStoreMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "vstore");
        Map<String, String> headParamMap = composeRequestHeader(true);

        RestManager<VStoreMO> restManager = new RestManager<VStoreMO>(VStoreMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        List<VStoreMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取VStoreMO的属性Map
     * @param modelMo VStore数据对象
     * @return VStoreMO的属性Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(VStoreMO modelMo)
    {
        return (null != modelMo) ? modelMo.getMO().getProperties() : null;
    }

    /**
     * 获取过滤条件数组
     * @return 过滤条件数组
     */
    @Override
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
