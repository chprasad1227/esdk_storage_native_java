package com.huawei.ism.openapi.snapshot;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.SpeedLevelE;
import com.huawei.ism.openapi.common.keydeifines.TLV.SNAPSHOT;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 快照的实现函数
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class SnapshotHandlerImpl extends DefaultCommHandler implements
    SnapshotHandler
{

    private SnapshotIterator snapshotIterator = null;

    /**
     * 快照实现类
     * @param restRequestHandler rest请求
     * @param deviceID 网元id
     */
    protected SnapshotHandlerImpl(RestRequestHandler restRequestHandler,
        String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建一个快照
     * @param mo 快照MO的bean
     * @return 快照mo
     * @throws ApiException API自定义异常
     */
    public SnapshotMO create(SnapshotMO mo) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "SNAPSHOT");
        JSONObject requestBody = new JSONObject();
        // try
        // {
        // requestBody.put(SNAPSHOT.TYPE, MOType.HOST.getValue());

        // PARENTTYPE使用默认值：
        if (null != mo)
        {
            // 遍历属性数组
            Map<Object, Object> properties = mo.getMO().getProperties();
            LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                "the request params is " + properties.toString());
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                    "SnapshotHandlerImpl.create()", null, requestBody.toString());
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody,
                properties);
        }
        // }
        // catch (JSONException e)
        // {
        // ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
        // throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        // }
        RestManager<SnapshotMO> restManager = new RestManager<SnapshotMO>(
            SnapshotMO.class, getRestRequestHandler(), realitivePath, null,
            requestBody);
        SnapshotMO resPonsemo = restManager.getPostRequestMO();

        return resPonsemo;
    }

    /**
     * 删除快照
     * @param snapShotID 快照对应的id
     * @throws ApiException API自定义异常
     */
    public void delete(String snapShotID) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "SNAPSHOT", snapShotID);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(SNAPSHOT.TYPE,
            String.valueOf(MOType.SNAPSHOT.getValue()));
        headParamMap.put(SNAPSHOT.ID, snapShotID);

        RestManager<SnapshotMO> restManager = new RestManager<SnapshotMO>(
            SnapshotMO.class, getRestRequestHandler(), realitivePath,
            headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 修改快照
     * @param mo 快照对应的mo
     * @throws ApiException API自定义异常
     */
    public void modify(SnapshotMO mo) throws ApiException
    {
        String realitivePath = null;
        JSONObject requestBody = null;

        if (null != mo)
        {
            realitivePath = OpenApiUtils.getOpenApiUtilsInstance()
                .composeRelativeUri(getDeviceId(), "SNAPSHOT", mo.getId());
            requestBody = new JSONObject();
            Map<Object, Object> properties = mo.getMO().getProperties();
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody,
                properties);
        }

        RestManager<SnapshotMO> restManager = new RestManager<SnapshotMO>(
            SnapshotMO.class, getRestRequestHandler(), realitivePath, null,
            requestBody);
        restManager.getPutRequestMO();

    }

    /**
     * 查询快照
     * @param snapshotID 快照对应的id
     * @return SnapshotMO
     * @throws ApiException API自定义异常
     */
    public SnapshotMO get(String snapshotID) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "SNAPSHOT", snapshotID);

        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(SNAPSHOT.ID, snapshotID);
        // headParamMap.put(SNAPSHOT.TYPE,
        // String.valueOf(MOType.SNAPSHOT.getValue()));

        RestManager<SnapshotMO> restManager = new RestManager<SnapshotMO>(
            SnapshotMO.class, getRestRequestHandler(), realitivePath,
            headParamMap, null);
        SnapshotMO resPonsemo = restManager.getGetRequestMO();

        return resPonsemo;
    }

    /**
     * 批量查询快照
     * @param cond 快照的查询条件类
     * @return 快照自定义迭代器
     */
    public SnapshotIterator getBatch(SnapshotQuery cond)
    {
        if (null == snapshotIterator)
        {
            snapshotIterator = new SnapshotIterator(getRestRequestHandler(),
                getDeviceId(), cond);
        }
        return snapshotIterator;
    }

    /**
     * 快照回滚
     * @param mo 快照mo
     * @throws ApiException API自定义异常
     */
    public void rollbackHyperImage(SnapshotMO mo) throws ApiException
    {
        String realitivePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                realitivePath = OpenApiUtils.getOpenApiUtilsInstance()
                    .composeRelativeUri(getDeviceId(), "snapshot", "rollback");
                requestBody = new JSONObject();
                requestBody.put(SNAPSHOT.ID, mo.getId());

                SpeedLevelE rollBackSpeed = mo.getRollbackSpeed();
                if (null != rollBackSpeed)
                {
                    requestBody.put(SNAPSHOT.ROLLBACKSPEED,
                        rollBackSpeed.getValue());
                }
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<SnapshotMO> restManager = new RestManager<SnapshotMO>(
            SnapshotMO.class, getRestRequestHandler(), realitivePath, null,
            requestBody);
        restManager.getPutRequestMO();
    }

}
