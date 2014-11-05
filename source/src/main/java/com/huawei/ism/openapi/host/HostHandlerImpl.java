package com.huawei.ism.openapi.host;

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
import com.huawei.ism.openapi.common.keydeifines.TLV.HOST;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * host接口实现类
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class HostHandlerImpl extends DefaultCommHandler implements HostHandler
{

    private HostIterator hostIterator = null;

    /**
     * 主机接口实现类
     * @param restRequestHandler rest请求
     * @param deviceID 网元id
     */
    protected HostHandlerImpl(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建一个host
     * @param mo host的bean
     * @return 返回host的实例
     * @throws ApiException API自定义异常
     */
    public HostMO create(HostMO mo) throws ApiException
    {

        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "host");
        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(HOST.TYPE, MOType.HOST.getValue());

            // PARENTTYPE使用默认值：
            if (null != mo)
            {
                // 遍历属性数组
                Map<Object, Object> properties = mo.getMO().getProperties();
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + properties.toString());
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<HostMO> restManager = new RestManager<HostMO>(HostMO.class, getRestRequestHandler(), realitivePath,
            null, requestBody);
        HostMO resPonsemo = restManager.getPostRequestMO();

        return resPonsemo;
    }

    /**
     * 修改host
     * @param mo host的实例
     * @throws ApiException API自定义异常
     */
    public void modify(HostMO mo) throws ApiException
    {
        String realitivePath = null;
        JSONObject requestBody = null;

        try
        {
            if (null != mo)
            {
                realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "host",
                    mo.getId());
                requestBody = new JSONObject();
                requestBody.put(HOST.TYPE, MOType.HOST.getValue());

                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<HostMO> restManager = new RestManager<HostMO>(HostMO.class, getRestRequestHandler(), realitivePath,
            null, requestBody);
        restManager.getPutRequestMO();

    }

    /**
     * 查询host
     * @param hostID 输入hostId
     * @return 返回host
     * @throws ApiException API自定义异常
     */
    public HostMO get(String hostID) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "host", hostID);

        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(HOST.ID, hostID);
        headParamMap.put(HOST.TYPE, String.valueOf(MOType.HOST.getValue()));

        RestManager<HostMO> restManager = new RestManager<HostMO>(HostMO.class, getRestRequestHandler(), realitivePath,
            headParamMap, null);
        HostMO resPonsemo = restManager.getGetRequestMO();

        return resPonsemo;
    }

    /**
     * 删除host
     * @param hostID 待删除的hostId
     * @throws ApiException API自定义异常
     */
    public void delete(String hostID) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "host", hostID);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(HOST.TYPE, String.valueOf(MOType.HOST.getValue()));
        headParamMap.put(HOST.ID, hostID);

        RestManager<HostMO> restManager = new RestManager<HostMO>(HostMO.class, getRestRequestHandler(), realitivePath,
            headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 批量查询host
     * @param cond 查询host的条件
     * @return 返回host自定义的迭代器
     */
    public HostIterator getBatch(HostQuery cond)
    {
        if (null == hostIterator)
        {
            hostIterator = new HostIterator(getRestRequestHandler(), getDeviceId(), cond, false);
        }
        return hostIterator;
    }

    /**
     * 通过hostGroup查询host
     * @param hostGroupID 关联的hostGroupId
     * @return 返回host的List
     * @throws ApiException API自定义异常
     */
    public HostIterator getHostbyHostGroup(String hostGroupId, HostQuery condition) throws ApiException
    {
        if (null == condition)
        {
            HostMO mo = new HostMO();
            mo.setAssociateOBJId(hostGroupId);
            mo.setAssociateOBJType(MOType.HOSTGROUP);
            condition = new HostQuery(mo, 0, 100);
            return getAssociateBatch(condition);
        }
        HostMO mo = condition.getHostMO();
        if (null == mo)
        {
            mo = new HostMO();
        }
        mo.setAssociateOBJId(hostGroupId);
        mo.setAssociateOBJType(MOType.HOSTGROUP);
        condition.setQueryHostMO(mo);
        return getAssociateBatch(condition);
    }

    private HostIterator getAssociateBatch(HostQuery condition)
    {
        if (null == hostIterator)
        {
            hostIterator = new HostIterator(getRestRequestHandler(), getDeviceId(), condition, true);
        }
        return hostIterator;
    }

    /**
     * 查询主机总数
     * @return Long
     * @throws ApiException
     */
    public Long getCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "host", "count");
        Map<String, String> headParamMap = new HashMap<String, String>();

        RestManager<HostMO> restManager = new RestManager<HostMO>(HostMO.class, getRestRequestHandler(), relativePath,
            headParamMap, null);
        HostMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }
}
