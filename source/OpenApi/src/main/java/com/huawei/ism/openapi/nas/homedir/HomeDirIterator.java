package com.huawei.ism.openapi.nas.homedir;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.HOMEDIR;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 主目录迭代器
 * @author gWX183785
 * @version V100R001C10
 */
public class HomeDirIterator extends ApiIterator<HomeDirMO, HomeDirQuery>
{
    private static final String[] HOMEDIRFILTER =
    {HOMEDIR.ID, HOMEDIR.TENANCYID};

    /**
     * 初始化方法
     * @param restRequestHandler rest请求接口
     * @param deviceID 设备号
     * @param qCondition 批量查询条件
     */
    public HomeDirIterator(RestRequestHandler restRequestHandler, String deviceID, HomeDirQuery qCondition)
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
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "homedir",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);

        RestManager<HomeDirMO> restManager = new RestManager<HomeDirMO>(HomeDirMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        HomeDirMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }

    /**
     * 批量查询
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    protected List<HomeDirMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "homedir");
        Map<String, String> headParamMap = composeRequestHeader(true);

        RestManager<HomeDirMO> restManager = new RestManager<HomeDirMO>(HomeDirMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        List<HomeDirMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取批量查询过滤条件
     * @param modelMo HomeDir数据对象
     * @return 返回结果
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(HomeDirMO modelMo)
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
        return HOMEDIRFILTER;
    }

    @Override
    protected String[] getFuzzyFilterHeaders()
    {
        return new String[0];
    }

}
