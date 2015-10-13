package com.huawei.ism.openapi.hostgroup;

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
import com.huawei.ism.openapi.common.keydeifines.TLV.HOSTGROUP;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 接口实现
 * @author gWX183785
 * @version V100R001C10
 */
public class HostGroupHandlerImp extends DefaultCommHandler implements HostGroupHandler
{
    private HostGroupIterator hostGroupIterator;

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     */
    protected HostGroupHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建HostGroup
     * @param mo 主机组对象
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    public HostGroupMO create(HostGroupMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "hostgroup");

        JSONObject requestBody = new JSONObject();
        if (null != mo)
        {
            // 遍历属性数组
            Map<Object, Object> properties = mo.getMO().getProperties();
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            LogUtil.getLogUtilInstance()
                .showLog(LOG_TYPE_E.LOG_INFO, "the request params is " + requestBody.toString());
            LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                    "HostGroupHandlerImp.create()", null, requestBody.toString());
        }

        RestManager<HostGroupMO> restManager = new RestManager<HostGroupMO>(HostGroupMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        HostGroupMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * 查询HostGroup
     * @param id 主机组id
     * @return HostGroupMO 主机组对象
     * @throws ApiException 异常
     */
    @Override
    public HostGroupMO get(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "hostgroup", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(HOSTGROUP.TYPE, String.valueOf(MOType.HOSTGROUP.getValue()));

        RestManager<HostGroupMO> restManager = new RestManager<HostGroupMO>(HostGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        return restManager.getGetRequestMO();
    }

    /**
     * 批量查询HostGroup迭代器
     * @param cond 批量查询条件
     * @return 返回结果
     */
    @Override
    public HostGroupIterator getBatch(HostGroupQuery cond)
    {
        if (null == hostGroupIterator)
        {
            hostGroupIterator = new HostGroupIterator(getRestRequestHandler(), getDeviceId(), cond, false);
        }
        return hostGroupIterator;
    }

    /**
     * 删除HostGroup
     * @param id 主机组id
     * @throws ApiException 异常
     */
    @Override
    public void delete(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "hostgroup", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(HOSTGROUP.TYPE, String.valueOf(MOType.HOSTGROUP.getValue()));

        RestManager<HostGroupMO> restManager = new RestManager<HostGroupMO>(HostGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 修改HostGroup属性
     * @param mo 主机组对象
     * @throws ApiException 异常
     */
    @Override
    public void modify(HostGroupMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "hostgroup",
                    mo.getId());
                requestBody = new JSONObject();
                requestBody.put(HOSTGROUP.TYPE, MOType.HOSTGROUP.getValue());
                // 遍历属性数组
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + requestBody.toString());
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2, 
                        "HostGroupHandlerImp.modify()", null, requestBody.toString());
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<HostGroupMO> restManager = new RestManager<HostGroupMO>(HostGroupMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 查询HostGroup总数
     * @param mo 主机组对象
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    public long count(HostGroupMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "hostgroup",
            "count");
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(HOSTGROUP.TYPE, String.valueOf(MOType.HOSTGROUP.getValue()));

        RestManager<HostGroupMO> restManager = new RestManager<HostGroupMO>(HostGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        HostGroupMO hostGroupMO = restManager.getGetRequestMO();
        return Long.valueOf((String) hostGroupMO.getMO().getProperty(HOSTGROUP.COUNT));
    }

    /**
     * 对象加入
     * @param hostGroupId 主机组id
     * @param hostId 主机id
     * @throws ApiException 异常
     */
    @Override
    public void createAssociateWithHost(String hostGroupId, String hostId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "hostgroup",
            "associate");
        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(HOSTGROUP.TYPE, MOType.HOSTGROUP.getValue());
            requestBody.put(HOSTGROUP.ID, hostGroupId);
            requestBody.put(HOSTGROUP.ASSOCIATEOBJID, hostId);
            requestBody.put(HOSTGROUP.ASSOCIATEOBJTYPE, MOType.HOST.getValue());
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<HostGroupMO> restManager = new RestManager<HostGroupMO>(HostGroupMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        restManager.getPostRequestMO();
    }

    /**
     * 对象退出
     * @param hostGroupId 主机组id
     * @param hostId 主机id
     * @throws ApiException 异常
     */
    @Override
    public void removeAssociateFromHost(String hostGroupId, String hostId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "host",
            "associate");
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(HOSTGROUP.TYPE, String.valueOf(MOType.HOSTGROUP.getValue()));
        headParamMap.put(HOSTGROUP.ID, hostGroupId);
        headParamMap.put(HOSTGROUP.ASSOCIATEOBJID, hostId);
        headParamMap.put(HOSTGROUP.ASSOCIATEOBJTYPE, String.valueOf(MOType.HOST.getValue()));

        RestManager<HostGroupMO> restManager = new RestManager<HostGroupMO>(HostGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 通过主机查询主机组
     * @param hostId 主机id
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    public HostGroupIterator getHostGroupByHost(String hostId, HostGroupQuery condition) throws ApiException
    {
        if (null == condition)
        {
            HostGroupMO mo = new HostGroupMO();
            mo.setAssociateOBJId(hostId);
            mo.setAssociateOBJType(MOType.HOST);
            condition = new HostGroupQuery(mo, 0, 100);
            return getAssociateBatch(condition);
        }
        HostGroupMO mo = condition.getHostGroupMO();
        if (null == mo)
        {
            mo = new HostGroupMO();
        }
        mo.setAssociateOBJId(hostId);
        mo.setAssociateOBJType(MOType.HOST);
        condition.setHostGroupMO(mo);
        return getAssociateBatch(condition);
    }

    private HostGroupIterator getAssociateBatch(HostGroupQuery condition)
    {
        if (null == hostGroupIterator)
        {
            hostGroupIterator = new HostGroupIterator(getRestRequestHandler(), getDeviceId(), condition, true);
        }
        return hostGroupIterator;
    }

    /**
     * 查询主机组的总数
     * @return Long
     * @throws ApiException
     */
    public Long getCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "hostgroup",
            "count");
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(HOSTGROUP.TYPE, String.valueOf(MOType.HOSTGROUP.getValue()));
        RestManager<HostGroupMO> restManager = new RestManager<HostGroupMO>(HostGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        HostGroupMO hostGroupMO = restManager.getGetRequestMO();
        return Long.valueOf((String) hostGroupMO.getMO().getProperty(HOSTGROUP.COUNT));
    }
}
