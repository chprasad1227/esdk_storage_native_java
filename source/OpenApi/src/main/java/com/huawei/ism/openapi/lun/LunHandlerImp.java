package com.huawei.ism.openapi.lun;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ArrayCfgConstant;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.TLV.LUN;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * LUN接口的实现类
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class LunHandlerImp extends DefaultCommHandler implements LunHandler
{
    private LunIterator lunIterator = null;

    /**
     * LUN接口实现类构造函数
     * @param restRequestHandler rest请求
     * @param deviceID 网元id
     */
    protected LunHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建LUN
     * @param mo lun bean
     * @return LunMO
     * @throws ApiException API自定义异常
     */
    public LunMO create(LunMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lun");

        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(LUN.TYPE, MOType.LUN.getValue());
            requestBody.put(LUN.PARENTTYPE, MOType.STORAGEPOOL.getValue());
            requestBody.put(LUN.ALLOCTYPE, EnumDefine.LUNAllocTypeE.THICK.getValue()); // 默认值
            requestBody.put(LUN.WRITEPOLICY, EnumDefine.CACHE_WRITE_BACK_E.WRITE_BACK.getValue());
            requestBody.put(LUN.MIRRORPOLICY, EnumDefine.CACHE_MIRROR_STATUS_E.CACHE_MIRROR_DISABLE.getValue());
            requestBody.put(LUN.DATATRANSFERPOLICY, EnumDefine.MigrateLUNPolicyE.MIGRATE_LUN_POLICY_NONE.getValue());
            requestBody.put(LUN.INITIALDISTRIBUTEPOLICY, EnumDefine.InitTierPolicyE.INIT_TIER_POLICY_AUTO.getValue());

            if (null != mo)
            {
                Map<Object, Object> properties = mo.getMO().getProperties();
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + properties.toString());
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                        "LunHandlerImp.create()", null, properties.toString());
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<LunMO> restManager = new RestManager<LunMO>(LunMO.class, getRestRequestHandler(), relativePath,
            null, requestBody);
        LunMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * 修改LUN属性
     * @param mo lun属性bean
     * @throws ApiException API自定义异常
     */
    public void modify(LunMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lun",
                    mo.getId());
                requestBody = new JSONObject();
                requestBody.put(LUN.TYPE, MOType.LUN.getValue());
                Map<Object, Object> properties = mo.getMO().getProperties();
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<LunMO> restManager = new RestManager<LunMO>(LunMO.class, getRestRequestHandler(), relativePath,
            null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 查询
     * @param lunID lun id
     * @return LunMO
     * @throws ApiException API自定义异常
     */
    public LunMO get(String lunID) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lun", lunID);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(LUN.TYPE, String.valueOf(MOType.LUN.getValue()));
        headParamMap.put(LUN.ID, lunID);

        RestManager<LunMO> restManager = new RestManager<LunMO>(LunMO.class, getRestRequestHandler(), relativePath,
            headParamMap, null);
        LunMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo;
    }

    /**
     * 删除LUN
     * @param lunID lun id
     * @throws ApiException API自定义异常
     */
    public void delete(String lunID) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lun", lunID);
        RestManager<LunMO> restManager = new RestManager<LunMO>(LunMO.class, getRestRequestHandler(), relativePath,
            null, null);
        restManager.getDelRequestMO();
    }

    /**
     * LUN扩容
     * @param lunID lun id
     * @param capacity 容量
     * @throws ApiException API自定义异常
     */
    public void expandLunCapacity(String lunID, Long capacity) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lun", "expand");

        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(LUN.TYPE, MOType.LUN.getValue());
            requestBody.put(LUN.ID, lunID);
            requestBody.put(LUN.CAPACITY, capacity / ArrayCfgConstant.SECTOR_SIZE);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<LunMO> restManager = new RestManager<LunMO>(LunMO.class, getRestRequestHandler(), relativePath,
            null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 批量查询
     * @param condition 查询条件
     * @return LunIterator Lun 批量查询迭代器
     */
    public LunIterator getBatch(LunQuery condition)
    {
        if (null == lunIterator)
        {
            lunIterator = new LunIterator(getRestRequestHandler(), getDeviceId(), condition, false);
        }
        return lunIterator;
    }

    public LunIterator getAssociateBatch(LunQuery condition)
    {
        if (null == lunIterator)
        {
            lunIterator = new LunIterator(getRestRequestHandler(), getDeviceId(), condition, true);
        }
        return lunIterator;
    }

    /**
     * 获取存储池关联的LUN
     * @param storagePoolID 存储池id
     * @return List<LunMO>
     * @throws ApiException API自定义异常
     */
    public LunIterator getLunByStoragePool(String storagePoolID, LunQuery condition) throws ApiException
    {
        if (null == condition)
        {
            LunMO mo = new LunMO();
            mo.setParentId(storagePoolID);
            condition = new LunQuery(mo, 0, 100);
            return getBatch(condition);
        }
        LunMO mo = condition.getLunMO();
        if (null == mo)
        {
            mo = new LunMO();
        }
        mo.setParentId(storagePoolID);
        condition.setQueryLUNMO(mo);
        return getBatch(condition);
    }

    /**
     * 获取Lun组关联的LUN
     * @param lunGroupID 存储池id
     * @return List<LunMO>
     * @throws ApiException API自定义异常
     */
    public LunIterator getLunByLunGroup(String lunGroupID, LunQuery condition) throws ApiException
    {
        if (null == condition)
        {
            LunMO lunMO = new LunMO();
            lunMO.setAssociateOBJId(lunGroupID);
            lunMO.setAssociateOBJType(MOType.LUNGROUP);
            condition = new LunQuery(lunMO, 0, 100);
            return getAssociateBatch(condition);
        }
        LunMO mo = condition.getLunMO();
        if (null == mo)
        {
            mo = new LunMO();
        }
        mo.setAssociateOBJId(lunGroupID);
        mo.setAssociateOBJType(MOType.LUNGROUP);
        condition.setQueryLUNMO(mo);
        return getAssociateBatch(condition);
    }

    /**
     * 获取主机关联的LUN
     * @param hostID 主机id
     * @return List<LunMO>
     * @throws ApiException API自定义异常
     */
    @Override
    public LunIterator getLunByHost(String hostId, LunQuery condition) throws ApiException
    {
        if (null == condition)
        {
            LunMO lunMO = new LunMO();
            lunMO.setAssociateOBJId(hostId);
            lunMO.setAssociateOBJType(MOType.HOST);
            condition = new LunQuery(lunMO, 0, 100);
            return getAssociateBatch(condition);
        }
        LunMO mo = condition.getLunMO();
        if (null == mo)
        {
            mo = new LunMO();
        }
        mo.setAssociateOBJId(hostId);
        mo.setAssociateOBJType(MOType.HOST);
        condition.setQueryLUNMO(mo);
        return getAssociateBatch(condition);
    }

    /**
     * 查询LUN的总数
     * @return Long
     * @throws ApiException
     */
    public Long getCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lun", "count");
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put("TYPE", String.valueOf(MOType.LUN.getValue()));

        RestManager<LunMO> restManager = new RestManager<LunMO>(LunMO.class, getRestRequestHandler(), relativePath,
            headParamMap, null);
        LunMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }

}
