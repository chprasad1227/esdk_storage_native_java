package com.huawei.ism.openapi.nas.vstore;

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
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.VSTORE;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
import com.huawei.ism.openapi.nas.quota.QuotaMO;

/**
 * 租户的接口实现类
 * @author fWX183786
 * @version V100R001C10
 */
public class VStoreHandlerImp extends DefaultCommHandler implements VStoreHandler
{
    private VstoreIterator vstoreIterator;

    /**
     * 构造函数
     * @param restRequestHandler rest 请求处理类
     * @param deviceID 设备ID
     */
    protected VStoreHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建租户
     * @param mo 租户数据对象
     * @return 租户数据对象
     * @throws ApiException 异常
     */
    @Override
    public VStoreMO create(VStoreMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "vStore");
        JSONObject requestBody = null;
        if (null != mo)
        {
            requestBody = new JSONObject();
            Map<Object, Object> properties = mo.getMO().getProperties();
            LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO, "the request params is " + properties.toString());
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
        }

        RestManager<VStoreMO> restManager = new RestManager<VStoreMO>(VStoreMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        VStoreMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * 修改租户信息
     * @param mo 租户数据对象
     * @throws ApiException 异常
     */
    @Override
    public void modify(VStoreMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        if (null != mo)
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "vStore",
                mo.getId());
            requestBody = new JSONObject();
            Map<Object, Object> properties = mo.getMO().getProperties();
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
        }

        RestManager<VStoreMO> restManager = new RestManager<VStoreMO>(VStoreMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 删除租户
     * @param vstoreId 租户id
     * @throws ApiException 异常
     */
    @Override
    public void delete(String vstoreId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "vStore",
            vstoreId);

        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(VSTORE.TYPE, String.valueOf(MOType.VSTORE.getValue()));
        headParamMap.put(VSTORE.ID, vstoreId);
        RestManager<QuotaMO> restManager = new RestManager<QuotaMO>(QuotaMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 获取租户信息
     * @param vstoreId 租户id
     * @return 租户信息
     * @throws ApiException 异常
     */
    @Override
    public VStoreMO get(String vstoreId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "vStore",
            vstoreId);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(VSTORE.TYPE, String.valueOf(MOType.VSTORE.getValue()));
        headParamMap.put(VSTORE.ID, vstoreId);

        RestManager<VStoreMO> restManager = new RestManager<VStoreMO>(VStoreMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        VStoreMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo;
    }

    /**
     * 获取租户批量查询迭代器
     * @param condition 查询条件
     * @return 租户批量查询迭代器
     * @throws ApiException 异常
     */
    @Override
    public VstoreIterator getBatch(VStoreQuery condition) throws ApiException
    {
        if (null == vstoreIterator)
        {
            vstoreIterator = new VstoreIterator(getRestRequestHandler(), getDeviceId(), condition);
        }
        return vstoreIterator;
    }

    /**
     * 查询对象关联的租户
     * @param associateObjType 关联对象类型
     * @param associateObjId 关联对象id
     * @return 关联的租户
     * @throws ApiException 异常
     */
    @Override
    public VStoreMO getAssociateVstore(MOType associateObjType, String associateObjId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "vstore",
            "associate");
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(VSTORE.TYPE, String.valueOf(MOType.VSTORE.getValue()));
        headParamMap.put(VSTORE.ASSOCIATEOBJTYPE, String.valueOf(associateObjType.getValue()));
        headParamMap.put(VSTORE.ASSOCIATEOBJID, associateObjId);

        RestManager<VStoreMO> restManager = new RestManager<VStoreMO>(VStoreMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        VStoreMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo;
    }

    /**
     * 创建其他对象与指定租户的关联(将指定对象加入租户) sss * @param vstoreId 租户的ID
     * @param associateObjType 关联对象类型
     * @param associateObjId 关联对象id
     * @throws ApiException 异常
     */
    @Override
    public void createAssociate(String vstoreId, MOType associateObjType, String associateObjId) throws ApiException
    {
        addOrDelAssociate(vstoreId, associateObjType, associateObjId, true);
    }

    /**
     * 删除其他对象与指定租户的关联(将指定对象移除租户)
     * @param vstoreId 租户的ID
     * @param associateObjType 关联对象类型
     * @param associateObjId 关联对象id
     * @throws ApiException 异常
     */
    @Override
    public void removeAssociate(String vstoreId, MOType associateObjType, String associateObjId) throws ApiException
    {
        addOrDelAssociate(vstoreId, associateObjType, associateObjId, false);
    }

    /**
     * 查询下一个可用的ID号
     * @return 下一个可用的ID号
     * @throws ApiException 异常
     */
    @Override
    public String getNextAviableId() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "nextavailableid");

        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(VSTORE.TYPE, String.valueOf(MOType.VSTORE.getValue()));

        RestManager<VStoreMO> restManager = new RestManager<VStoreMO>(VStoreMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        VStoreMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getId();
    }

    /**
     * 添加/删除关联的公共方法
     * @param vstoreId 租户的ID
     * @param associateObjType 关联对象类型
     * @param associateObjId 关联对象id
     * @param isAdd 是否添加对象关联
     * @throws ApiException 异常
     */
    private void addOrDelAssociate(String vstoreId, MOType associateObjType, String associateObjId, Boolean isAdd)
        throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "vstore",
            "associate");
        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(VSTORE.TYPE, MOType.VSTORE.getValue());
            requestBody.put(VSTORE.ID, vstoreId);
            requestBody.put(VSTORE.ASSOCIATEOBJTYPE, associateObjType.getValue());
            requestBody.put(VSTORE.ASSOCIATEOBJID, associateObjId);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<VStoreMO> restManager = new RestManager<VStoreMO>(VStoreMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        if (isAdd)
        {
            restManager.getPostRequestMO();
        }
        else
        {
            restManager.getDelRequestMO();
        }
    }
}
