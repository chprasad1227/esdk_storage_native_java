package com.huawei.ism.openapi.lungroup;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.IsmConstant;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.AppTypeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.TLV.LUNGROUP;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * LUN组接口实现
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class LunGroupHandlerImp extends DefaultCommHandler implements LunGroupHandler
{
    private LunGroupIterator lunGroupIterator = null;

    /**
     * 构造函数
     * @param restRequestHandler rest请求处理类
     * @param deviceID 设备ID
     */
    protected LunGroupHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建LUN组
     * @param mo LUN组信息
     * @return LunGroupMO
     * @throws ApiException API异常
     */
    public LunGroupMO create(LunGroupMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lungroup");

        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(LUNGROUP.TYPE, MOType.LUNGROUP.getValue());

            if (mo != null)
            {
                if (null == mo.getAppType())
                {
                    mo.setAppType(AppTypeE.OTHER);
                }
                if (IsmConstant.UNDEFINE_VALUE == mo.getGroupType())
                {
                    mo.setGroupType(0);
                }
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

        RestManager<LunGroupMO> restManager = new RestManager<LunGroupMO>(LunGroupMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        LunGroupMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * 查询
     * @param id LUN组ID
     * @return LunGroupMO
     * @throws ApiException API异常
     */
    public LunGroupMO get(String id) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lungroup", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(LUNGROUP.TYPE, String.valueOf(MOType.LUNGROUP.getValue()));
        headParamMap.put(LUNGROUP.ID, id);

        RestManager<LunGroupMO> restManager = new RestManager<LunGroupMO>(LunGroupMO.class, getRestRequestHandler(),
            realitivePath, headParamMap, null);
        LunGroupMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo;
    }

    /**
     * 批量查询
     * @param condition 查询条件
     * @return LunGroupIterator
     * @throws ApiException API异常
     */
    public LunGroupIterator getBatch(LunGroupQuery condition) throws ApiException
    {
        if (null == lunGroupIterator)
        {
            lunGroupIterator = new LunGroupIterator(getRestRequestHandler(), getDeviceId(), condition, false);
        }
        return lunGroupIterator;
    }

    /**
     * 删除LUN组
     * @param id LUN组ID
     * @throws ApiException API异常
     */
    public void delete(String id) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lungroup", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(LUNGROUP.TYPE, String.valueOf(MOType.LUNGROUP.getValue()));
        headParamMap.put(LUNGROUP.ID, id);

        RestManager<LunGroupMO> restManager = new RestManager<LunGroupMO>(LunGroupMO.class, getRestRequestHandler(),
            realitivePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 修改属性
     * @param mo LUN组信息
     * @throws ApiException API异常
     */
    public void modify(LunGroupMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (mo != null)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lungroup",
                    mo.getId());
                requestBody = new JSONObject();
                requestBody.put(LUNGROUP.TYPE, MOType.LUNGROUP.getValue());
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

        RestManager<LunGroupMO> restManager = new RestManager<LunGroupMO>(LunGroupMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 对象加入
     * @param lunGroupID LUN组ID
     * @param lunID LUNID
     * @throws ApiException API异常
     */
    public void createAssociateWithLun(String lunGroupID, String lunID) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lungroup",
            "associate");
        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(LUNGROUP.TYPE, MOType.LUNGROUP.getValue());
            requestBody.put(LUNGROUP.ID, lunGroupID);
            requestBody.put(LUNGROUP.ASSOCIATEOBJTYPE, MOType.LUN.getValue());
            requestBody.put(LUNGROUP.ASSOCIATEOBJID, lunID);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<LunGroupMO> restManager = new RestManager<LunGroupMO>(LunGroupMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        restManager.getPostRequestMO();
    }

    /**
     * 对象退出
     * @param lunGroupID LUN组ID
     * @param lunID LUNID
     * @throws ApiException API异常
     */
    public void removeAssociateFromLun(String lunGroupID, String lunID) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lungroup",
            "associate");

        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(LUNGROUP.TYPE, String.valueOf(MOType.LUNGROUP.getValue()));
        headParamMap.put(LUNGROUP.ID, lunGroupID);
        headParamMap.put(LUNGROUP.ASSOCIATEOBJTYPE, String.valueOf(MOType.LUN.getValue()));
        headParamMap.put(LUNGROUP.ASSOCIATEOBJID, lunID);

        RestManager<LunGroupMO> restManager = new RestManager<LunGroupMO>(LunGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 查询关联对象（通过LUN查询LUN组）
     * @param lunID LUN的ID
     * @return List<LunGroupMO>
     * @throws ApiException API异常
     */
    public LunGroupIterator getLunGroupbyLun(String lunId, LunGroupQuery condition) throws ApiException
    {
        if (null == condition)
        {
            LunGroupMO mo = new LunGroupMO();
            mo.setAssociateOBJId(lunId);
            mo.setAssociateOBJType(MOType.LUN);
            condition = new LunGroupQuery(mo, 0, 100);
            return getAssociateBatch(condition);
        }
        LunGroupMO mo = condition.getLunGroupMO();
        if (null == mo)
        {
            mo = new LunGroupMO();
        }
        mo.setAssociateOBJId(lunId);
        mo.setAssociateOBJType(MOType.LUN);
        condition.setQueryLUNGroupMO(mo);
        return getAssociateBatch(condition);
    }

    private LunGroupIterator getAssociateBatch(LunGroupQuery condition)
    {
        if (null == lunGroupIterator)
        {
            lunGroupIterator = new LunGroupIterator(getRestRequestHandler(), getDeviceId(), condition, true);
        }
        return lunGroupIterator;
    }

    /**
     * 查询LUN组的总数
     * @return Long
     * @throws ApiException
     */
    public Long getCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lungroup",
            "count");
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put("TYPE", String.valueOf(MOType.LUNGROUP.getValue()));

        RestManager<LunGroupMO> restManager = new RestManager<LunGroupMO>(LunGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        LunGroupMO resPonsemo = restManager.getGetRequestMO();
        return Long.valueOf((String) resPonsemo.getMO().getProperty(LUNGROUP.COUNT));
    }

}
