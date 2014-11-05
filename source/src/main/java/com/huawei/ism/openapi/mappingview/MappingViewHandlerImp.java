package com.huawei.ism.openapi.mappingview;

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
import com.huawei.ism.openapi.common.keydeifines.TLV.MAPPINGVIEW;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 视图接口的实现类
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class MappingViewHandlerImp extends DefaultCommHandler implements MappingViewHandler
{
    private static final String MAP_VIEW_BASE_NAME = "OpenAPI";

    /**
     * 视图构造函数
     * @param restRequestHandler 视图请求的rest
     * @param deviceID 网元ID
     */
    protected MappingViewHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建LUN组和主机组之间的视图映射
     * @param lunGroupID lunGroupID
     * @param hostGroupID hostGroupID
     * @throws ApiException API自定义异常
     */
    public void createMap(String lunGroupID, String hostGroupID) throws ApiException
    {
        MappingViewMO resPonsemo = privateCreateMap();

        // add the host gruop to the MappView
        JSONObject requestBody = composeMappItemRequestBody(resPonsemo.getId(), hostGroupID, MOType.HOSTGROUP);
        addElementToMappView(requestBody);

        // add the Lun Group to the MappView
        requestBody = composeMappItemRequestBody(resPonsemo.getId(), lunGroupID, MOType.LUNGROUP);
        addElementToMappView(requestBody);

    }

    /**
     * 创建LUN组、端口组和主机组之间的视图映射
     * @param lunGroupID lunGroup id
     * @param portGroup portGroup id
     * @param hostGroupID hostGroup id
     * @throws ApiException API自定义异常
     */
    public void createMap(String lunGroupID, String portGroup, String hostGroupID) throws ApiException
    {
        MappingViewMO resPonsemo = privateCreateMap();

        // add the host gruop to the MappView
        JSONObject requestBody = composeMappItemRequestBody(resPonsemo.getId(), hostGroupID, MOType.HOSTGROUP);
        addElementToMappView(requestBody);

        // add the Lun Group to the MappView
        requestBody = composeMappItemRequestBody(resPonsemo.getId(), lunGroupID, MOType.LUNGROUP);
        addElementToMappView(requestBody);

        // add the portGroup to the MappView
        requestBody = composeMappItemRequestBody(resPonsemo.getId(), portGroup, MOType.PORTGROUP);
        addElementToMappView(requestBody);

    }

    /**
     * 移除主机组和LUN组之间的视图
     * @param lunGroupID lunGroup id
     * @param hostGroupID hostGroup id
     * @throws ApiException API自定义异常
     */
    public void removeMap(String lunGroupID, String hostGroupID) throws ApiException
    {
        // get the associate MappView
        List<MappingViewMO> moList = getAssociateMappView(lunGroupID);
        MappingViewMO mo = null;
        if (moList.isEmpty())
        {
            return;
        }

        mo = moList.get(0);
        // removw the Lun Group from the MappView
        JSONObject requestBody = composeMappItemRequestBody(mo.getId(), lunGroupID, MOType.LUNGROUP);
        removeElementFromMappView(requestBody);

        // remove the host gruop from the MappView
        requestBody = composeMappItemRequestBody(mo.getId(), hostGroupID, MOType.HOSTGROUP);
        removeElementFromMappView(requestBody);

        // remove the mappView
        privateDelMappView(mo.getId());
    }

    /**
     * 移除LUN组、端口组和主机组之间的视图
     * @param lunGroupID lunGroup id
     * @param portGroupID portGroup id
     * @param hostGroupID hostGroup id
     * @throws ApiException API自定义异常
     */
    public void removeMap(String lunGroupID, String portGroupID, String hostGroupID) throws ApiException
    {
        List<MappingViewMO> moList = getAssociateMappView(lunGroupID);
        MappingViewMO mo = null;
        if (moList.isEmpty())
        {
            return;
        }
        mo = moList.get(0);

        // removw the Lun Group from the MappView
        JSONObject requestBody = composeMappItemRequestBody(mo.getId(), lunGroupID, MOType.LUNGROUP);
        removeElementFromMappView(requestBody);

        // remove the portGroup from the MappView bodyMap =
        requestBody = composeMappItemRequestBody(mo.getId(), portGroupID, MOType.PORTGROUP);
        removeElementFromMappView(requestBody);

        // remove the host gruop from the MappView
        requestBody = composeMappItemRequestBody(mo.getId(), hostGroupID, MOType.HOSTGROUP);
        removeElementFromMappView(requestBody);

        // remove the mappView
        privateDelMappView(mo.getId());
    }

    private void addElementToMappView(JSONObject requestBody) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "mappingview",
            "create_associate");

        RestManager<MappingViewMO> restManager = new RestManager<MappingViewMO>(MappingViewMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    private void removeElementFromMappView(JSONObject requestBody) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "mappingview",
            "remove_associate");

        RestManager<MappingViewMO> restManager = new RestManager<MappingViewMO>(MappingViewMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 视图json请求的body
     * @param mappViewID
     * @param itemID
     * @param type
     * @return
     */
    private JSONObject composeMappItemRequestBody(String mappViewID, String itemID, MOType type) throws ApiException
    {
        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(MAPPINGVIEW.TYPE, MOType.MAPPINGVIEW.getValue());
            requestBody.put(MAPPINGVIEW.ID, mappViewID);
            requestBody.put(MAPPINGVIEW.ASSOCIATEOBJID, itemID);
            requestBody.put(MAPPINGVIEW.ASSOCIATEOBJTYPE, type.getValue());
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }
        return requestBody;
    }

    /**
     * 获取关联的映射视图
     * 
     * @param lunGroup
     * @return
     */
    private List<MappingViewMO> getAssociateMappView(String lunGroup) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "mappingview",
            "associate");
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(MAPPINGVIEW.TYPE, String.valueOf(MOType.MAPPINGVIEW.getValue()));
        headParamMap.put(MAPPINGVIEW.ASSOCIATEOBJTYPE, String.valueOf(MOType.LUNGROUP.getValue()));
        headParamMap.put(MAPPINGVIEW.ASSOCIATEOBJID, lunGroup);

        RestManager<MappingViewMO> restManager = new RestManager<MappingViewMO>(MappingViewMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        List<MappingViewMO> resPonsemo = restManager.getGetRequestMOList();
        return resPonsemo;
    }

    /**
     * 删除映射视图
     * 
     * @param mappViewID
     */
    private void privateDelMappView(String mappViewID) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "mappingview",
            mappViewID);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(MAPPINGVIEW.TYPE, String.valueOf(MOType.MAPPINGVIEW.getValue()));
        headParamMap.put(MAPPINGVIEW.ID, mappViewID);

        RestManager<MappingViewMO> restManager = new RestManager<MappingViewMO>(MappingViewMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

    private MappingViewMO privateCreateMap() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "mappingview");
        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(MAPPINGVIEW.TYPE, MOType.MAPPINGVIEW.getValue());
            requestBody.put(MAPPINGVIEW.NAME, MAP_VIEW_BASE_NAME + OpenApiUtils.getOpenApiUtilsInstance().getUTCTime());
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<MappingViewMO> restManager = new RestManager<MappingViewMO>(MappingViewMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        MappingViewMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * 查询映射视图总数
     * @return Long
     * @throws ApiException
     */
    public Long getCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "mappingview",
            "count");

        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(MAPPINGVIEW.TYPE, String.valueOf(MOType.MAPPINGVIEW.getValue()));

        RestManager<MappingViewMO> moUtil = new RestManager<MappingViewMO>(MappingViewMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        MappingViewMO resPonsemo = moUtil.getGetRequestMO();
        return Long.valueOf((String) resPonsemo.getMO().getProperty(MAPPINGVIEW.COUNT));
    }
}
