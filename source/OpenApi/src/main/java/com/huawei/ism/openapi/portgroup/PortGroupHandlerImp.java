package com.huawei.ism.openapi.portgroup;

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
import com.huawei.ism.openapi.common.keydeifines.TLV.PORTGROUP;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 实现接口
 * @author gWX183785
 * @version V100R001C10
 */
public class PortGroupHandlerImp extends DefaultCommHandler implements PortGroupHandler
{
    private PortGroupIterator portGroupIterator;

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     */
    protected PortGroupHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建PortGroup
     * @param mo 端口组对象
     * @return 端口组对象
     * @throws ApiException 异常
     */
    @Override
    public PortGroupMO create(PortGroupMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(PORTGROUP.TYPE, MOType.PORTGROUP.getValue());

            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "portgroup");

                // 遍历属性数组
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + requestBody.toString());
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                        "PortGroupHandlerImp.create()", null, properties.toString());
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<PortGroupMO> restManager = new RestManager<PortGroupMO>(PortGroupMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        PortGroupMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * 查询HostGroup
     * @param id 端口组id
     * @return 端口组对象
     * @throws ApiException 异常
     */
    @Override
    public PortGroupMO get(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "portgroup", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(PORTGROUP.TYPE, String.valueOf(MOType.PORTGROUP.getValue()));

        RestManager<PortGroupMO> restManager = new RestManager<PortGroupMO>(PortGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        return restManager.getGetRequestMO();
    }

    /**
     * 批量查询PortGroup迭代器
     * @param cond 查询条件
     * @return 主机对象
     */
    @Override
    public PortGroupIterator getBatch(PortGroupQuery cond)
    {
        if (null == portGroupIterator)
        {
            portGroupIterator = new PortGroupIterator(getRestRequestHandler(), getDeviceId(), cond, false);
        }
        return portGroupIterator;
    }

    /**
     * 删除HostGroup
     * @param id 端口组id
     * @throws ApiException 异常
     */
    @Override
    public void delete(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "portgroup", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(PORTGROUP.TYPE, String.valueOf(MOType.PORTGROUP.getValue()));

        RestManager<PortGroupMO> restManager = new RestManager<PortGroupMO>(PortGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 修改PortGroup属性
     * @param mo 端口组对象
     * @throws ApiException 异常
     */
    @Override
    public void modify(PortGroupMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "portgroup",
                    mo.getId());
                requestBody = new JSONObject();
                requestBody.put(PORTGROUP.TYPE, MOType.PORTGROUP.getValue());
                // 遍历属性数组
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + requestBody.toString());
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                        "PortGroupHandlerImp.modify()", null, properties.toString());
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<PortGroupMO> restManager = new RestManager<PortGroupMO>(PortGroupMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 查询PortGroup总数
     * @param mo 端口组对象
     * @return 端口组数量
     * @throws ApiException 异常
     */
    @Override
    public long count(PortGroupMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "portgroup",
            "count");
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(PORTGROUP.TYPE, String.valueOf(MOType.PORTGROUP.getValue()));

        RestManager<PortGroupMO> restManager = new RestManager<PortGroupMO>(PortGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        PortGroupMO portGroupMO = restManager.getGetRequestMO();
        return Long.valueOf((String) portGroupMO.getMO().getProperty(PORTGROUP.COUNT));
    }

    /**
     * 添加端口
     * @param portGroupId 端口组id
     * @param portId 端口id
     * @throws ApiException 异常
     */
    @Override
    public void createAssociateWithPort(String portGroupId, String portId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "port",
            "associate", "portgroup");
        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(PORTGROUP.TYPE, MOType.PORTGROUP.getValue());
            requestBody.put(PORTGROUP.ID, portGroupId);
            requestBody.put(PORTGROUP.ASSOCIATEOBJID, portId);
            requestBody.put(PORTGROUP.ASSOCIATEOBJTYPE, MOType.ETH_PORT.getValue());
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<PortGroupMO> restManager = new RestManager<PortGroupMO>(PortGroupMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        restManager.getPostRequestMO();
    }

    /**
     * 移除端口
     * @param portGroupId 端口组id
     * @param portId 端口id
     * @throws ApiException 异常
     */
    @Override
    public void removeAssociateFromPort(String portGroupId, String portId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "port",
            "associate", "portgroup");
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(PORTGROUP.TYPE, String.valueOf(MOType.PORTGROUP.getValue()));
        headParamMap.put(PORTGROUP.ID, portGroupId);
        headParamMap.put(PORTGROUP.ASSOCIATEOBJID, portId);
        headParamMap.put(PORTGROUP.ASSOCIATEOBJTYPE, String.valueOf(MOType.ETH_PORT.getValue()));

        RestManager<PortGroupMO> restManager = new RestManager<PortGroupMO>(PortGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 关联查询
     * @param portId 端口id
     * @return 端口组列表
     * @throws ApiException 异常
     */
    @Override
    public PortGroupIterator getPortGroupByPort(String portId, PortGroupQuery condition) throws ApiException
    {
        if (null == condition)
        {
            PortGroupMO mo = new PortGroupMO();
            mo.setAssociateOBJId(portId);
            mo.setAssociateOBJType(MOType.FC_PORT);
            condition = new PortGroupQuery(mo, 0, 100);
            return getAssociateBatch(condition);
        }
        PortGroupMO mo = condition.getPortGroupMO();
        if (null == mo)
        {
            mo = new PortGroupMO();
        }
        mo.setAssociateOBJId(portId);
        mo.setAssociateOBJType(MOType.FC_PORT);
        condition.setPortGroupMO(mo);
        return getAssociateBatch(condition);
    }

    private PortGroupIterator getAssociateBatch(PortGroupQuery condition)
    {
        if (null == portGroupIterator)
        {
            portGroupIterator = new PortGroupIterator(getRestRequestHandler(), getDeviceId(), condition, true);
        }
        return portGroupIterator;
    }

    /**
     * 查询端口组的总数
     * @return Long
     * @throws ApiException
     */
    public Long getCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "portgroup",
            "count");
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(PORTGROUP.TYPE, String.valueOf(MOType.PORTGROUP.getValue()));
        RestManager<PortGroupMO> restManager = new RestManager<PortGroupMO>(PortGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        PortGroupMO portGroupMO = restManager.getGetRequestMO();
        return Long.valueOf((String) portGroupMO.getMO().getProperty(PORTGROUP.COUNT));
    }
}
