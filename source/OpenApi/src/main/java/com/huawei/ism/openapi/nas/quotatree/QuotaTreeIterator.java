package com.huawei.ism.openapi.nas.quotatree;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 配额树迭代器
 * @author fWX183786
 * @version V100R001C10
 */
public class QuotaTreeIterator extends ApiIterator<QuotaTreeMO, QuotaTreeQuery>
{
    /**
     * 构造函数
     * @param restRequestHandler rest请求处理类
     * @param deviceID 设备ID
     * @param qCondition 查询条件
     */
    public QuotaTreeIterator(RestRequestHandler restRequestHandler, String deviceID, QuotaTreeQuery qCondition)
    {
        super(restRequestHandler, deviceID, qCondition, false);
    }

    /**
     * 获取数量
     * @return 满足条件的qTree数量
     * @throws ApiException 异常
     */
    @Override
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "quotatree",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);

        RestManager<QuotaTreeMO> restManager = new RestManager<QuotaTreeMO>(QuotaTreeMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        QuotaTreeMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }

    /**
     * 获取qTree批量查询的数据
     * @return qTree批量查询的数据
     * @throws ApiException 异常
     */
    @Override
    protected List<QuotaTreeMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "quotatree");
        Map<String, String> headParamMap = composeRequestHeader(true);

        RestManager<QuotaTreeMO> restManager = new RestManager<QuotaTreeMO>(QuotaTreeMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        List<QuotaTreeMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取具体查询条件MO
     * @param modelMo 查询条件MO
     * @return 查询条件Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(QuotaTreeMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
    }

    /**
     * 获取qTree批量查询的过滤条件数组
     * @return qTree批量查询的过滤条件数组
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
