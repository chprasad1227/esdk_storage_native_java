package com.huawei.ism.openapi.replicationpair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RESOURCE_ACCESS_E;
import com.huawei.ism.openapi.common.keydeifines.TLV.REPLICATIONPAIR;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 接口实现
 * @author gWX183785
 * @version V100R001C10
 */
public class ReplicationPairHandlerImp extends DefaultCommHandler implements
    ReplicationPairHandler
{
    private ReplicationPairIterator replicationPairIterator;

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     */
    protected ReplicationPairHandlerImp(RestRequestHandler restRequestHandler,
        String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建远程复制
     * @param mo 远程复制对象
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    public ReplicationPairMO create(ReplicationPairMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "replicationpair");

        JSONObject requestBody = new JSONObject();
        if (null != mo)
        {
            // 遍历属性数组
            Map<Object, Object> properties = mo.getMO().getProperties();
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody,
                properties);
            LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                "the request params is " + requestBody.toString());
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                    "ReplicationPairHandlerImp.create()", null, requestBody.toString());
        }
        RestManager<ReplicationPairMO> restManager = new RestManager<ReplicationPairMO>(
            ReplicationPairMO.class, getRestRequestHandler(), relativePath,
            null, requestBody);
        ReplicationPairMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    @Override
    public void split(String id) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance()
                .composeRelativeUri(getDeviceId(), "replicationpair", "split");
            requestBody = new JSONObject();
            requestBody.put(REPLICATIONPAIR.TYPE,
                MOType.REPLICATIONPAIR.getValue());
            requestBody.put(REPLICATIONPAIR.ID, id);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ReplicationPairMO> restManager = new RestManager<ReplicationPairMO>(
            ReplicationPairMO.class, getRestRequestHandler(), relativePath,
            null, requestBody);
        restManager.getPutRequestMO();
    }

    @Override
    public void sync(String id) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance()
                .composeRelativeUri(getDeviceId(), "replicationpair", "sync");
            requestBody = new JSONObject();
            requestBody.put(REPLICATIONPAIR.TYPE,
                MOType.REPLICATIONPAIR.getValue());
            requestBody.put(REPLICATIONPAIR.ID, id);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ReplicationPairMO> restManager = new RestManager<ReplicationPairMO>(
            ReplicationPairMO.class, getRestRequestHandler(), relativePath,
            null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 查询远程复制
     * @param id 远程复制id
     * @return ReplicationPairMO 远程复制对象
     * @throws ApiException 异常
     */
    @Override
    public ReplicationPairMO get(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "replicationpair", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(REPLICATIONPAIR.TYPE,
            String.valueOf(MOType.REPLICATIONPAIR.getValue()));

        RestManager<ReplicationPairMO> restManager = new RestManager<ReplicationPairMO>(
            ReplicationPairMO.class, getRestRequestHandler(), relativePath,
            headParamMap, null);
        return restManager.getGetRequestMO();
    }

    /**
     * 批量查询远程复制迭代器
     * @param cond 批量查询条件
     * @return 返回结果
     */
    @Override
    public ReplicationPairIterator getBatch(ReplicationPairQuery cond)
    {
        if (null == replicationPairIterator)
        {
            replicationPairIterator = new ReplicationPairIterator(
                getRestRequestHandler(), getDeviceId(), cond);
        }
        return replicationPairIterator;
    }

    /**
     * 删除远程复制
     * @param id 远程复制id
     * @throws ApiException 异常
     */
    @Override
    public void delete(String id, Boolean toSyncSRWhenDelete,
        Boolean isLocalDelete) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "replicationpair", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        if (isLocalDelete)
        {
            headParamMap.put(REPLICATIONPAIR.ISLOCALDELETE, String.valueOf(1));
        }
        else
        {
            headParamMap.put(REPLICATIONPAIR.ISLOCALDELETE, String.valueOf(0));
        }
        if (toSyncSRWhenDelete)
        {
            headParamMap.put(REPLICATIONPAIR.TOSYNCSRWHENDELETE,
                String.valueOf(1));
        }
        else
        {
            headParamMap.put(REPLICATIONPAIR.TOSYNCSRWHENDELETE,
                String.valueOf(0));
        }

        RestManager<ReplicationPairMO> restManager = new RestManager<ReplicationPairMO>(
            ReplicationPairMO.class, getRestRequestHandler(), relativePath,
            headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 修改远程复制属性
     * @param mo 远程复制对象
     * @throws ApiException 异常
     */
    @Override
    public void modify(ReplicationPairMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance()
                    .composeRelativeUri(getDeviceId(), "replicationpair",
                        mo.getId());
                requestBody = new JSONObject();
                requestBody.put(REPLICATIONPAIR.TYPE,
                    MOType.REPLICATIONPAIR.getValue());
                // 遍历属性数组
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(
                    requestBody, properties);
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + requestBody.toString());
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                        "ReplicationPairHandlerImp.modify()", null, requestBody.toString());
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ReplicationPairMO> restManager = new RestManager<ReplicationPairMO>(
            ReplicationPairMO.class, getRestRequestHandler(), relativePath,
            null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 查询远程复制总数
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    public Long getCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "replicationpair", "count");
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(REPLICATIONPAIR.TYPE,
            String.valueOf(MOType.REPLICATIONPAIR.getValue()));

        RestManager<ReplicationPairMO> restManager = new RestManager<ReplicationPairMO>(
            ReplicationPairMO.class, getRestRequestHandler(), relativePath,
            headParamMap, null);
        ReplicationPairMO replicationPairMO = restManager.getGetRequestMO();
        return Long.valueOf((String) replicationPairMO.getMO().getProperty(
            REPLICATIONPAIR.COUNT));
    }

    @Override
    public List<ReplicationPairMO> getReplicationpairByLUN(String lunID)
        throws ApiException
    {
        return getReplicationpairs(lunID, MOType.LUN.getValue());
    }

    @Override
    public List<ReplicationPairMO> getReplicationpairsByConsistentGroupID(
        String consistentGroupID) throws ApiException
    {
        return getReplicationpairs(consistentGroupID,
            MOType.CONSISTENTGROUP.getValue());
    }

    private List<ReplicationPairMO> getReplicationpairs(String id, int type)
        throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "replicationpair", "associate");
        Map<String, String> headParams = new HashMap<String, String>();
        headParams.put(REPLICATIONPAIR.TYPE,
            String.valueOf(MOType.REPLICATIONPAIR.getValue()));
        headParams.put(REPLICATIONPAIR.ASSOCIATEOBJID, id);
        headParams.put(REPLICATIONPAIR.ASSOCIATEOBJTYPE, String.valueOf(type));

        RestManager<ReplicationPairMO> restManager = new RestManager<ReplicationPairMO>(
            ReplicationPairMO.class, getRestRequestHandler(), relativePath,
            headParams, null);
        return restManager.getGetRequestMOList();
    }

    @Override
    public void switchPair(String id) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance()
                .composeRelativeUri(getDeviceId(), "replicationpair", "switch");
            requestBody = new JSONObject();
            requestBody.put(REPLICATIONPAIR.TYPE,
                MOType.REPLICATIONPAIR.getValue());
            requestBody.put(REPLICATIONPAIR.ID, id);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ReplicationPairMO> restManager = new RestManager<ReplicationPairMO>(
            ReplicationPairMO.class, getRestRequestHandler(), relativePath,
            null, requestBody);
        restManager.getPutRequestMO();
    }

    @Override
    public void refresh() throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance()
                .composeRelativeUri(getDeviceId(), "replicationpair",
                    "refresh_rm_remote_info");
            requestBody = new JSONObject();
            requestBody.put(REPLICATIONPAIR.TYPE,
                MOType.REPLICATIONPAIR.getValue());
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ReplicationPairMO> restManager = new RestManager<ReplicationPairMO>(
            ReplicationPairMO.class, getRestRequestHandler(), relativePath,
            null, requestBody);
        restManager.getPutRequestMO();

    }

    @Override
    public void enableWriteProtectionForSecLUN(String id) throws ApiException
    {
        ReplicationPairMO mo = new ReplicationPairMO();
        mo.setId(id);
        mo.setSecResAccess(RESOURCE_ACCESS_E.READ_ONLY);
        modify(mo);
    }

    @Override
    public void disableWriteProtectionForSecLUN(String id) throws ApiException
    {
        ReplicationPairMO mo = new ReplicationPairMO();
        mo.setId(id);
        mo.setSecResAccess(RESOURCE_ACCESS_E.READ_WRITE);
        modify(mo);
    }
}
