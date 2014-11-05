package com.huawei.ism.openapi.nas.quota;

import java.util.List;
import java.util.Map;
import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * Quota 迭代器
 * @author fWX183786
 * @version V100R001C10
 */
public class QuotaIterator extends ApiIterator<QuotaMO, QuotaQuery>
{
    /**
     * 构造函数
     * @param restRequestHandler rest请求处理类
     * @param deviceID 设备Id
     * @param qCondition 查询条件
     */
    public QuotaIterator(RestRequestHandler restRequestHandler, String deviceID, QuotaQuery qCondition)
    {
        super(restRequestHandler, deviceID, qCondition, false);
    }

    /**
     * 获取数量
     * @return 获取满足过滤条件的个数
     * @throws ApiException 异常
     */
    @Override
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "quota", "count");
        Map<String, String> headParamMap = composeRequestHeader(false);

        RestManager<QuotaMO> restManager = new RestManager<QuotaMO>(QuotaMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        QuotaMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }

    /**
     * 获取批量查询的数据
     * @return 批量查询的数据
     * @throws ApiException 异常
     */
    @Override
    protected List<QuotaMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "quota");
        Map<String, String> headParamMap = composeRequestHeader(true);

        RestManager<QuotaMO> restManager = new RestManager<QuotaMO>(QuotaMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        List<QuotaMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取批量查询的过滤条件
     * @param modelMo 过滤条件
     * @return 过滤条件组成的Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(QuotaMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
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
