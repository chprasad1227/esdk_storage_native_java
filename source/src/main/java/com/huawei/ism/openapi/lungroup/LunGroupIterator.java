package com.huawei.ism.openapi.lungroup;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.LUNGROUP;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * LUN组批量查询迭代器
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class LunGroupIterator extends ApiIterator<LunGroupMO, LunGroupQuery>
{
    private static final String[] LUNGROUPFILTER =
    {LUNGROUP.APPTYPE, LUNGROUP.GROUPTYPE, LUNGROUP.ISADD2MAPPINGVIEW};

    private static final String[] lunGroupFuzzyFilter =
    {LUNGROUP.ID, LUNGROUP.NAME};

    /**
     * Fc启动器迭代器
     * @param restRequestHandler REST请求
     * @param deviceID 设备ID
     * @param queryCondition 查询条件
     */
    protected LunGroupIterator(RestRequestHandler restRequestHandler, String deviceID, LunGroupQuery queryCondition,
        boolean isAssociate)
    {
        super(restRequestHandler, deviceID, queryCondition, isAssociate);
    }

    /**
     * 获取具体MO批量查询的结果
     * @return List<LunGroupMO>
     * @throws ApiException API异常
     */
    protected List<LunGroupMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath;
        if (isAssociate)
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lungroup",
                "associate");
        }
        else
        {

            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lungroup");
        }
        Map<String, String> headParamMap = composeRequestHeader(true);
        headParamMap.put("TYPE", String.valueOf(MOType.LUNGROUP.getValue()));

        RestManager<LunGroupMO> restManager = new RestManager<LunGroupMO>(LunGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        List<LunGroupMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取对应MO的数量
     * @return long
     * @throws ApiException API异常
     */
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lungroup",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);
        headParamMap.put("TYPE", String.valueOf(MOType.LUNGROUP.getValue()));

        RestManager<LunGroupMO> restManager = new RestManager<LunGroupMO>(LunGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        LunGroupMO resPonsemo = restManager.getGetRequestMO();
        return Long.valueOf((String) resPonsemo.getMO().getProperty(LUNGROUP.COUNT));
    }

    /**
     * 获取LunGroup 属性map
     * @param modelMo LunGroup数据对象
     * @return LunGroup 属性map
     */
    protected Map<Object, Object> getConcretMoMap(LunGroupMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
    }

    /**
     * 获取LUNGROUP批量查询条件数组
     * @return LUNGROUP批量查询条件数组
     */
    protected String[] getConcretFilterHeaders()
    {
        return LUNGROUPFILTER;
    }

    @Override
    protected String[] getFuzzyFilterHeaders()
    {
        return lunGroupFuzzyFilter;
    }
}
