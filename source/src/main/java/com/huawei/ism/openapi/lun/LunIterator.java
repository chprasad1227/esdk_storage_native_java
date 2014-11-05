package com.huawei.ism.openapi.lun;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.LUN;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * Lun自定义迭代器
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class LunIterator extends ApiIterator<LunMO, LunQuery>
{
    private static final String[] LUNFILTER =
    {LUN.PARENTID, LUN.ALLOCTYPE, LUN.RUNNINGSTATUS, LUN.HEALTHSTATUS, LUN.ISADD2LUNGROUP};

    private static final String[] lunFuzzyFilter =
    {LUN.ID, LUN.NAME};

    /**
     * lun自定义迭代器
     * @param restRequestHandler rest请求
     * @param deviceID 网元id
     * @param queryCondition 请求条件
     */
    protected LunIterator(RestRequestHandler restRequestHandler, String deviceID, LunQuery queryCondition,
        boolean isAssociate)
    {
        super(restRequestHandler, deviceID, queryCondition, isAssociate);
    }

    /**
     * 获取具体MO批量查询的结果
     * @return List<LunMO>
     * @throws ApiException API自定义异常
     */
    protected List<LunMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = null;
        if (isAssociate)
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lun", "associate");
        }
        else
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lun");
        }
        Map<String, String> headParamMap = composeRequestHeader(true);
        headParamMap.put("TYPE", String.valueOf(MOType.LUN.getValue()));

        RestManager<LunMO> restManager = new RestManager<LunMO>(LunMO.class, getRestRequestHandler(), relativePath,
            headParamMap, null);
        List<LunMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取对应MO的数量
     * @return long
     * @throws ApiException API异常
     */
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lun", "count");
        Map<String, String> headParamMap = composeRequestHeader(false);
        headParamMap.put("TYPE", String.valueOf(MOType.LUN.getValue()));

        RestManager<LunMO> restManager = new RestManager<LunMO>(LunMO.class, getRestRequestHandler(), relativePath,
            headParamMap, null);
        LunMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }

    /**
     * 获取LunMo的属性Map
     * @param modelMo Lun数据模块
     * @return LunMo的属性 Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(LunMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
    }

    /**
     * 获取LUN批量查询条件数组
     * @return LUN批量查询条件数组
     */
    @Override
    protected String[] getConcretFilterHeaders()
    {
        return LUNFILTER;
    }

    @Override
    protected String[] getFuzzyFilterHeaders()
    {
        return lunFuzzyFilter;
    }

}
