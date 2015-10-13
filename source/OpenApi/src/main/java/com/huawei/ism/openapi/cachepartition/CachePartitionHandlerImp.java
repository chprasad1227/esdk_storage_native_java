package com.huawei.ism.openapi.cachepartition;

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
import com.huawei.ism.openapi.common.keydeifines.TLV.CACHEPARTITION;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 存储分区接口实现
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class CachePartitionHandlerImp extends DefaultCommHandler implements CachePartitionHandler
{
    private CachePartitionIterator cachePartitionIterator = null;

    /**
     * CachePartitionHandlerImp
     * @param restRequestHandler REST请求
     * @param deviceID 设备ID
     */
    protected CachePartitionHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建Cache分区
     * @param mo Cache分区信息
     * @return CachePartitionMO
     * @throws ApiException 抛出API异常
     */
    public CachePartitionMO create(CachePartitionMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "cachepartition");

        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(CACHEPARTITION.TYPE, MOType.CACHEPARTITION.getValue());
            requestBody.put(CACHEPARTITION.PARENTTYPE, MOType.STORAGEENGINE.getValue());

            if (null != mo)
            {
                // 遍历属性数组
                Map<Object, Object> properties = mo.getMO().getProperties();
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + properties.toString());
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2, 
                        "CachePartitionHandlerImp.create()", null, properties);// zwx228053
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<CachePartitionMO> restManager = new RestManager<CachePartitionMO>(CachePartitionMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        CachePartitionMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * 查询Cache分区
     * @param id Cache分区的ID
     * @return CachePartitionMO
     * @throws ApiException 抛出API异常
     */
    public CachePartitionMO get(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "cachepartition", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(CACHEPARTITION.TYPE, String.valueOf(MOType.CACHEPARTITION.getValue()));
        headParamMap.put(CACHEPARTITION.ID, id);

        RestManager<CachePartitionMO> restManager = new RestManager<CachePartitionMO>(CachePartitionMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        CachePartitionMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo;
    }

    /**
     * 批量查询Cache分区
     * @param condition 查询条件
     * @return CachePartitionIterator
     * @throws ApiException 抛出API异常
     */
    public CachePartitionIterator getBatch(CachePartitionQuery condition) throws ApiException
    {
        if (null == cachePartitionIterator)
        {
            cachePartitionIterator = new CachePartitionIterator(getRestRequestHandler(), getDeviceId(), condition,
                false);
        }
        return cachePartitionIterator;
    }

    /**
     * 删除Cache分区
     * @param id Cache分区的ID
     * @throws ApiException 抛出API异常
     */
    public void delete(String id) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
            "cachepartition", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(CACHEPARTITION.TYPE, String.valueOf(MOType.CACHEPARTITION.getValue()));
        headParamMap.put(CACHEPARTITION.ID, id);

        RestManager<CachePartitionMO> restManager = new RestManager<CachePartitionMO>(CachePartitionMO.class,
            getRestRequestHandler(), realitivePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 修改Cache分区属性
     * @param mo Cache分区的信息
     * @throws ApiException 抛出API异常
     */
    public void modify(CachePartitionMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(),
                    "cachepartition", mo.getId());
                requestBody = new JSONObject();
                requestBody.put(CACHEPARTITION.TYPE, MOType.CACHEPARTITION.getValue());
                // 遍历属性数组
                Map<Object, Object> properties = mo.getMO().getProperties();
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + properties.toString());
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                        "CachePartitionHandlerImp.modify()", null, properties);// zwx228053
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<CachePartitionMO> restManager = new RestManager<CachePartitionMO>(CachePartitionMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 对象加入 LUN
     * @param cachePartitionId 分区ID
     * @param lunId 加入分区的LUN的ID
     * @throws ApiException 抛出API异常
     */
    public void createAssociateWithLun(String cachePartitionId, String lunId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lun",
            "associate", "cachepartition");
        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(CACHEPARTITION.ASSOCIATEOBJTYPE, MOType.LUN.getValue());
            requestBody.put(CACHEPARTITION.ASSOCIATEOBJID, lunId);
            requestBody.put(CACHEPARTITION.ID, cachePartitionId);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<CachePartitionMO> restManager = new RestManager<CachePartitionMO>(CachePartitionMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        restManager.getPostRequestMO();
    }

    /**
     * 对象退出 LUN
     * @param cachePartitionId 分区ID
     * @param lunId 分区中的LUN的ID
     * @throws ApiException 抛出API异常
     */
    public void removeAssociateFromLun(String cachePartitionId, String lunId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "lun",
            "associate", "cachepartition");
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(CACHEPARTITION.TYPE, String.valueOf(MOType.CACHEPARTITION.getValue()));
        headParamMap.put(CACHEPARTITION.ID, cachePartitionId);
        headParamMap.put(CACHEPARTITION.ASSOCIATEOBJTYPE, String.valueOf(MOType.LUN.getValue()));
        headParamMap.put(CACHEPARTITION.ASSOCIATEOBJID, lunId);

        RestManager<CachePartitionMO> restManager = new RestManager<CachePartitionMO>(CachePartitionMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 查询关联的对象
     * @param id LUN的ID
     * @return List<CachePartitionMO>
     * @throws ApiException 抛出API异常
     */
    public CachePartitionIterator getCachePartitionByLUN(String id, CachePartitionQuery query) throws ApiException
    {
        if (null == query)
        {
            CachePartitionMO mo = new CachePartitionMO();
            mo.setAssociateOBJId(id);
            mo.setAssociateOBJType(MOType.LUN);
            query = new CachePartitionQuery(mo, 0, 100);
            return getAssociateBatch(query);
        }
        CachePartitionMO mo = query.getCachePartitionMO();
        if (null == mo)
        {
            mo = new CachePartitionMO();
        }
        mo.setAssociateOBJId(id);
        mo.setAssociateOBJType(MOType.LUN);
        query.setCachePartitionMO(mo);
        return getAssociateBatch(query);
    }

    /**
     * 批量查询Cache分区
     * @param condition 查询条件
     * @return CachePartitionIterator
     * @throws ApiException 抛出API异常
     */
    public CachePartitionIterator getAssociateBatch(CachePartitionQuery condition) throws ApiException
    {
        if (null == cachePartitionIterator)
        {
            cachePartitionIterator = new CachePartitionIterator(getRestRequestHandler(), getDeviceId(), condition, true);
        }
        return cachePartitionIterator;
    }

}
