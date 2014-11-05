package com.huawei.ism.openapi.consistentgroup;

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
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RESOURCE_ACCESS_E;
import com.huawei.ism.openapi.common.keydeifines.TLV.CONSISTENTGROUP;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 接口实现
 * @author gWX183785
 * @version V100R001C10
 */
public class ConsistentGroupHandlerImp extends DefaultCommHandler implements ConsistentGroupHandler
{
    private ConsistentGroupIterator consistentGroupIterator;

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     */
    protected ConsistentGroupHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
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
    public ConsistentGroupMO create(ConsistentGroupMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "CONSISTENTGROUP");

        JSONObject requestBody = new JSONObject();
        if (null != mo)
        {
            // 遍历属性数组
            Map<Object, Object> properties = mo.getMO().getProperties();
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            LogUtil.getLogUtilInstance()
                .showLog(LOG_TYPE_E.LOG_INFO, "the request params is " + requestBody.toString());
        }
        RestManager<ConsistentGroupMO> restManager = new RestManager<ConsistentGroupMO>(ConsistentGroupMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        ConsistentGroupMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    @Override
    public void split(String id) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
                "SPLIT_CONSISTENCY_GROUP");
            requestBody = new JSONObject();
            requestBody.put(CONSISTENTGROUP.TYPE, MOType.CONSISTENTGROUP.getValue());
            requestBody.put(CONSISTENTGROUP.ID, id);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ConsistentGroupMO> restManager = new RestManager<ConsistentGroupMO>(ConsistentGroupMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    @Override
    public void sync(String id) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {

            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
                "SYNCHRONIZE_CONSISTENCY_GROUP");
            requestBody = new JSONObject();
            requestBody.put(CONSISTENTGROUP.TYPE, MOType.CONSISTENTGROUP.getValue());
            requestBody.put(CONSISTENTGROUP.ID, id);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ConsistentGroupMO> restManager = new RestManager<ConsistentGroupMO>(ConsistentGroupMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 查询远程复制
     * @param id 远程复制id
     * @return ConsistentGroupMO 远程复制对象
     * @throws ApiException 异常
     */
    @Override
    public ConsistentGroupMO get(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "ConsistentGroup", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(CONSISTENTGROUP.TYPE, String.valueOf(MOType.CONSISTENTGROUP.getValue()));

        RestManager<ConsistentGroupMO> restManager = new RestManager<ConsistentGroupMO>(ConsistentGroupMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        return restManager.getGetRequestMO();
    }

    /**
     * 批量查询远程复制迭代器
     * @param cond 批量查询条件
     * @return 返回结果
     */
    @Override
    public ConsistentGroupIterator getBatch(ConsistentGroupQuery cond)
    {
        if (null == consistentGroupIterator)
        {
            consistentGroupIterator = new ConsistentGroupIterator(getRestRequestHandler(), getDeviceId(), cond, false);
        }
        return consistentGroupIterator;
    }

    /**
     * 删除远程复制
     * @param id 远程复制id
     * @throws ApiException 异常
     */
    @Override
    public void delete(String id) throws ApiException
    {
        delete(id, false);
    }

    /**
     * 删除远程复制
     * @param id 远程复制id
     * @param isLocalDelete 是否允许本地删除配置文件
     * @throws ApiException 异常
     */
    @Override
    public void delete(String id, Boolean isLocalDelete) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "CONSISTENTGROUP", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        if (isLocalDelete)
        {
            headParamMap.put(CONSISTENTGROUP.ISLOCALDELETE, String.valueOf(1));
        }
        else
        {
            headParamMap.put(CONSISTENTGROUP.ISLOCALDELETE, String.valueOf(0));
        }

        RestManager<ConsistentGroupMO> restManager = new RestManager<ConsistentGroupMO>(ConsistentGroupMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 修改远程复制属性
     * @param mo 远程复制对象
     * @throws ApiException 异常
     */
    @Override
    public void modify(ConsistentGroupMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
                    "CONSISTENTGROUP", mo.getId());
                requestBody = new JSONObject();
                requestBody.put(CONSISTENTGROUP.TYPE, MOType.CONSISTENTGROUP.getValue());
                // 遍历属性数组
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + requestBody.toString());
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ConsistentGroupMO> restManager = new RestManager<ConsistentGroupMO>(ConsistentGroupMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 查询远程复制总数
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    public long getCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "ConsistentGroup", "count");
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(CONSISTENTGROUP.TYPE, String.valueOf(MOType.CONSISTENTGROUP.getValue()));

        RestManager<ConsistentGroupMO> restManager = new RestManager<ConsistentGroupMO>(ConsistentGroupMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        ConsistentGroupMO ConsistentGroupMO = restManager.getGetRequestMO();
        return Long.valueOf((String) ConsistentGroupMO.getMO().getProperty(CONSISTENTGROUP.COUNT));
    }

    @Override
    public void switchPair(String id) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance()
                .composeRelativeUri(getDeviceId(), "SWITCH_GROUP_ROLE");
            requestBody = new JSONObject();
            requestBody.put(CONSISTENTGROUP.TYPE, MOType.CONSISTENTGROUP.getValue());
            requestBody.put(CONSISTENTGROUP.ID, id);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ConsistentGroupMO> restManager = new RestManager<ConsistentGroupMO>(ConsistentGroupMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    @Override
    public void refresh() throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "CONSISTENTGROUP",
                "refresh_rm_remote_info");
            requestBody = new JSONObject();
            requestBody.put(CONSISTENTGROUP.TYPE, MOType.CONSISTENTGROUP.getValue());
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ConsistentGroupMO> restManager = new RestManager<ConsistentGroupMO>(ConsistentGroupMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();

    }

    @Override
    public void enableWriteProtectionForSecLUN(String id) throws ApiException
    {
        ConsistentGroupMO mo = new ConsistentGroupMO();
        mo.setId(id);
        mo.setSecResAccess(RESOURCE_ACCESS_E.READ_ONLY);
        modify(mo);
    }

    @Override
    public void disableWriteProtectionForSecLUN(String id) throws ApiException
    {
        ConsistentGroupMO mo = new ConsistentGroupMO();
        mo.setId(id);
        mo.setSecResAccess(RESOURCE_ACCESS_E.READ_WRITE);
        modify(mo);
    }

    @Override
    public void addReplicationpair(String consistentID, String[] rmList) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {

            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "ADD_MIRROR");
            requestBody = new JSONObject();
            requestBody.put(CONSISTENTGROUP.TYPE, MOType.CONSISTENTGROUP.getValue());
            requestBody.put(CONSISTENTGROUP.ID, consistentID);
            requestBody.put(CONSISTENTGROUP.RMLIST, rmList);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ConsistentGroupMO> restManager = new RestManager<ConsistentGroupMO>(ConsistentGroupMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    @Override
    public void removeReplicationpair(String consistentID, String[] rmList) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {

            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "DEL_MIRROR");
            requestBody = new JSONObject();
            requestBody.put(CONSISTENTGROUP.TYPE, MOType.CONSISTENTGROUP.getValue());
            requestBody.put(CONSISTENTGROUP.ID, consistentID);
            requestBody.put(CONSISTENTGROUP.RMLIST, rmList);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<ConsistentGroupMO> restManager = new RestManager<ConsistentGroupMO>(ConsistentGroupMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

}
