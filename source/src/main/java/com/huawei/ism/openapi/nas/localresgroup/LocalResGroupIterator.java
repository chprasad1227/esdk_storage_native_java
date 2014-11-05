package com.huawei.ism.openapi.nas.localresgroup;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.LOCALRESGROUP;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 批量查询迭代器
 * @author gWX183785
 * @version V100R001C10
 */
public class LocalResGroupIterator extends ApiIterator<LocalResGroupMO, LocalResGroupQuery>
{
    private static final String[] LOCALRESUSERFILTER =
    {LOCALRESGROUP.ID, LOCALRESGROUP.TENANCYID};

    /**
     * 初始化方法
     * @param restRequestHandler rest请求接口
     * @param deviceID 设备号
     * @param qCondition 批量查询条件
     */
    public LocalResGroupIterator(RestRequestHandler restRequestHandler, String deviceID, LocalResGroupQuery qCondition)
    {
        super(restRequestHandler, deviceID, qCondition, false);
    }

    /**
     * 查询个数
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "local_resgroup", "count");
        Map<String, String> headParamMap = composeRequestHeader(false);

        RestManager<LocalResGroupMO> restManager = new RestManager<LocalResGroupMO>(LocalResGroupMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        LocalResGroupMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }

    /**
     * 批量查询
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    protected List<LocalResGroupMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "local_resgroup");
        Map<String, String> headParamMap = composeRequestHeader(true);

        RestManager<LocalResGroupMO> restManager = new RestManager<LocalResGroupMO>(LocalResGroupMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        List<LocalResGroupMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取批量查询过滤条件
     * @param resuserMO LocalResGroup数据对象
     * @return 返回结果
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(LocalResGroupMO resuserMO)
    {
        return (null != resuserMO) ? (resuserMO.getMO().getProperties()) : null;
    }

    /**
     * 获取批量查询的过滤头信息
     * @return 批量查询的过滤头
     */
    @Override
    protected String[] getConcretFilterHeaders()
    {
        return LOCALRESUSERFILTER;
    }

    @Override
    protected String[] getFuzzyFilterHeaders()
    {
        return new String[0];
    }

}
