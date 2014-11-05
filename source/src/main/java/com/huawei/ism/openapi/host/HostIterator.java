package com.huawei.ism.openapi.host;

import java.util.List;
import java.util.Map;
import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.HOST;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * Host查询返回的迭代器
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class HostIterator extends ApiIterator<HostMO, HostQuery>
{
    private static final String[] preciseFilter =
    {HOST.OPERATIONSYSTEM};

    private static final String[] fuzzyFilter =
    {HOST.ID, HOST.NAME};

    /**
     * 主机自定义迭代器构造函数
     * @param restRequestHandler rest请求
     * @param deviceID 网元id
     * @param queryCondition 请求条件
     */
    public HostIterator(RestRequestHandler restRequestHandler, String deviceID, HostQuery queryCondition,
        boolean isAssociate)
    {
        super(restRequestHandler, deviceID, queryCondition, isAssociate);
    }

    /**
     * 获取对应MO的数量
     * @return long
     * @throws ApiException API异常
     */
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "host", "count");
        Map<String, String> headParamMap = composeRequestHeader(false);

        RestManager<HostMO> restManager = new RestManager<HostMO>(HostMO.class, getRestRequestHandler(), relativePath,
            headParamMap, null);
        HostMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }

    /**
     * 获取具体MO批量查询的结果
     * @return List<HostMO>
     * @throws ApiException API自定义异常
     */
    protected List<HostMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath;
        if (isAssociate)
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance()
                .composeRelativeUri(getDeviceId(), "Host", "associate");
        }
        else
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "host");
        }
        Map<String, String> headParamMap = composeRequestHeader(true);

        RestManager<HostMO> restManager = new RestManager<HostMO>(HostMO.class, getRestRequestHandler(), relativePath,
            headParamMap, null);
        List<HostMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取主机属性Map
     * @param modelMo 主机数据对象
     * @return 主机属性Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(HostMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
    }

    /**
     * 获取HOST批量查询条件数组
     * @return HOST批量查询条件数组
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
