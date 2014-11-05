package com.huawei.ism.openapi.storagepool;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.TLV.LUN;
import com.huawei.ism.openapi.common.keydeifines.TLV.STORAGEPOOL;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
import com.huawei.ism.openapi.lun.LunMO;

/**
 * 存储池对外开放接口的实现类
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class StoragePoolHandlerImp extends DefaultCommHandler implements StoragePoolHandler
{
    private StoragePoolIterator storagePoolIterator;

    /**
     * 存储池接口实现类构造函数
     * @param restRequestHandler rest请求
     * @param deviceID 网元id
     */
    protected StoragePoolHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建存储池
     * 
     * @param mo 存储池bean
     * @return StoragePoolMO
     * @throws ApiException API自定义异常
     */
    public StoragePoolMO create(StoragePoolMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "storagepool");
        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(STORAGEPOOL.TYPE, MOType.STORAGEPOOL.getValue());
            Map<Object, Object> properties = mo.getMO().getProperties();
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<StoragePoolMO> moUtil = new RestManager<StoragePoolMO>(StoragePoolMO.class,
            getRestRequestHandler(), relativePath, null, requestBody);
        StoragePoolMO resPonsemo = moUtil.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * 查询存储池
     * 
     * @param poolID 存储池id
     * @return StoragePoolMO
     * @throws ApiException API自定义异常
     */
    public StoragePoolMO get(String poolID) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "storagepool",
            poolID);

        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(LUN.TYPE, String.valueOf(MOType.STORAGEPOOL.getValue()));
        headParamMap.put(LUN.ID, poolID);

        RestManager<StoragePoolMO> moUtil = new RestManager<StoragePoolMO>(StoragePoolMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        StoragePoolMO resPonsemo = moUtil.getGetRequestMO();
        return resPonsemo;
    }

    /**
     * 获取批量查询迭代器
     * 
     * @param queryCondition 存储池批量查询条件
     * @return StoragePoolIterator
     */
    public StoragePoolIterator getBatch(StoragePoolQuery queryCondition)
    {
        if (null == storagePoolIterator)
        {
            storagePoolIterator = new StoragePoolIterator(getRestRequestHandler(), getDeviceId(), queryCondition);
        }
        return storagePoolIterator;
    }

    /**
     * 删除存储池
     * 
     * @param poolID 存储池id
     * @throws ApiException API自定义异常
     */
    public void delete(String poolID) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "storagepool",
            poolID);

        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(STORAGEPOOL.TYPE, String.valueOf(MOType.STORAGEPOOL.getValue()));
        headParamMap.put(STORAGEPOOL.ID, poolID);

        RestManager<StoragePoolMO> moUtil = new RestManager<StoragePoolMO>(StoragePoolMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        moUtil.getDelRequestMO();
    }

    /**
     * 修改存储池
     * 
     * @param mo 存储池bean
     * @throws ApiException API自定义异常
     */
    public void modify(StoragePoolMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "storagepool",
                    mo.getId());
                requestBody = new JSONObject();
                requestBody.put(STORAGEPOOL.TYPE, MOType.STORAGEPOOL.getValue());
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
     * 查询硬盘关联的存储池
     * 
     * @param diskPoolID 硬盘id
     * @return List<StoragePoolMO>
     * @throws ApiException API自定义异常
     */
    public StoragePoolIterator getStoragePoolByDiskPool(String diskPoolId, StoragePoolQuery condition)
        throws ApiException
    {
        if (null == condition)
        {
            StoragePoolMO mo = new StoragePoolMO();
            mo.setParentId(diskPoolId);
            condition = new StoragePoolQuery(mo, 0, 100);
            return getBatch(condition);
        }
        StoragePoolMO mo = condition.getStoragePoolMO();
        if (null == mo)
        {
            mo = new StoragePoolMO();
        }
        mo.setParentId(diskPoolId);
        condition.setQueryStoragePoolMo(mo);
        return getBatch(condition);
    }

    /**
     * 查询存储池的总数
     * @return Long
     * @throws ApiException
     */
    public Long getCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "storagepool",
            "count");

        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(STORAGEPOOL.TYPE, String.valueOf(MOType.STORAGEPOOL.getValue()));

        RestManager<StoragePoolMO> moUtil = new RestManager<StoragePoolMO>(StoragePoolMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        StoragePoolMO resPonsemo = moUtil.getGetRequestMO();
        return resPonsemo.getCount();
    }
}
