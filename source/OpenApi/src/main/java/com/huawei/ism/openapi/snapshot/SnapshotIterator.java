package com.huawei.ism.openapi.snapshot;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.SNAPSHOT;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 快照的迭代器
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class SnapshotIterator extends ApiIterator<SnapshotMO, SnapshotQuery>
{

    private static final String[] preciseFilter =
    {SNAPSHOT.PARENTID, SNAPSHOT.HEALTHSTATUS, SNAPSHOT.RUNNINGSTATUS};

    private static final String[] fuzzyFilter =
    {SNAPSHOT.NAME, SNAPSHOT.ID};

    /**
     * 快照迭代器的构造函数
     * @param restRequestHandler rest请求
     * @param deviceID 网元id
     * @param queryCondition 查询条件
     */
    public SnapshotIterator(RestRequestHandler restRequestHandler, String deviceID, SnapshotQuery queryCondition)
    {
        super(restRequestHandler, deviceID, queryCondition, false);
    }

    /**
     * 获取对应MO的数量
     * @return long
     * @throws ApiException API异常
     */
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "SNAPSHOT",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);

        RestManager<SnapshotMO> restManager = new RestManager<SnapshotMO>(SnapshotMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        SnapshotMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }

    /**
     * 获取具体MO批量查询的结果
     * @return List<SnapshotMO>
     * @throws ApiException API自定义异常
     */
    protected List<SnapshotMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "SNAPSHOT");
        Map<String, String> headParamMap = composeRequestHeader(true);

        RestManager<SnapshotMO> restManager = new RestManager<SnapshotMO>(SnapshotMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        List<SnapshotMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取Snapshot 属性Map
     * @param modelMo Snapshot 数据对象
     * @return Snapshot 属性Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(SnapshotMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
    }

    /**
     * 获取SNAPSHOT批量查询条件数组
     * @return SNAPSHOT批量查询条件数组
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
