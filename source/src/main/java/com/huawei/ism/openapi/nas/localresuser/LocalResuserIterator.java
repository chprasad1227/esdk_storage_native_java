package com.huawei.ism.openapi.nas.localresuser;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.LOCALRESUSER;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 批量查询迭代器
 * @author gWX183785
 * @version V100R001C10
 */
public class LocalResuserIterator extends ApiIterator<LocalResuserMO, LocalResuserQuery>
{
    private static final String[] LOCALRESUSERFILTER =
    {LOCALRESUSER.ID, LOCALRESUSER.TENANCYID};

    /**
     * 初始化方法
     * @param restRequestHandler rest请求接口
     * @param deviceID 设备号
     * @param qCondition 批量查询条件
     */
    public LocalResuserIterator(RestRequestHandler restRequestHandler, String deviceID, LocalResuserQuery qCondition,
        boolean isAssociate)
    {
        super(restRequestHandler, deviceID, qCondition, isAssociate);
    }

    /**
     * 查询个数
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "local_resuser",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);

        RestManager<LocalResuserMO> restManager = new RestManager<LocalResuserMO>(LocalResuserMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        LocalResuserMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }

    /**
     * 批量查询
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    protected List<LocalResuserMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath;
        if (isAssociate)
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "local_resuser",
                "associate");
        }
        else
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "local_resuser");
        }
        Map<String, String> headParamMap = composeRequestHeader(true);

        RestManager<LocalResuserMO> restManager = new RestManager<LocalResuserMO>(LocalResuserMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        List<LocalResuserMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取LocalResuserMO属性Map
     * @param resuserMO LocalResuser数据对象
     * @return LocalResuserMO属性Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(LocalResuserMO resuserMO)
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
