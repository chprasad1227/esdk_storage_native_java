package com.huawei.ism.openapi.diskpool;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.TLV.DISKPOOL;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
import com.huawei.ism.openapi.hostgroup.HostGroupMO;

/**
 * 接口实现
 * @author gWX183785
 * @version V100R001C10
 */
public class DiskPoolHandlerImp extends DefaultCommHandler implements DiskPoolHandler
{
    private DiskPoolIterator diskPoolIterator;

    /**
     * 初始化方法
     * @param restRequestHandler rest请求工具类
     * @param deviceID 设备号
     */
    protected DiskPoolHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建DiskPool
     * @param mo 硬盘域对象
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    public DiskPoolMO create(DiskPoolMO mo) throws ApiException
    {

        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "diskpool");

        JSONObject requestBody = new JSONObject();

        if (null != mo)
        {
            // 遍历属性数组
            Map<Object, Object> properties = mo.getMO().getProperties();
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
        }

        RestManager<DiskPoolMO> restManager = new RestManager<DiskPoolMO>(DiskPoolMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        DiskPoolMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * 查询DiskPool
     * @param id 硬盘域id
     * @return 返回结果
     * @throws ApiException 异常
     */
    @Override
    public DiskPoolMO get(String id) throws ApiException
    {

        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "diskpool", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(DISKPOOL.TYPE, String.valueOf(MOType.DISKPOOL.getValue()));
        RestManager<DiskPoolMO> restManager = new RestManager<DiskPoolMO>(DiskPoolMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        return restManager.getGetRequestMO();
    }

    /**
     * 批量查询DiskPool迭代器
     * @param cond 查询条件
     * @return 返回结果
     */
    @Override
    public DiskPoolIterator getBatch(DiskPoolQuery cond)
    {
        if (null == diskPoolIterator)
        {
            diskPoolIterator = new DiskPoolIterator(getRestRequestHandler(), getDeviceId(), cond, false);
        }
        return diskPoolIterator;
    }

    /**
     * 删除DiskPool
     * @param id 硬盘域id
     * @throws ApiException 异常
     */
    @Override
    public void delete(String id) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "diskpool", id);
        Map<String, String> headParamMap = new HashMap<String, String>();

        headParamMap.put(DISKPOOL.TYPE, String.valueOf(MOType.DISKPOOL.getValue()));
        RestManager<DiskPoolMO> restManager = new RestManager<DiskPoolMO>(DiskPoolMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 修改DiskPool属性
     * @param mo 硬盘域对象
     * @throws ApiException 异常
     */
    @Override
    public void modify(DiskPoolMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        try
        {
            if (null != mo)
            {
                relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "diskpool",
                    mo.getId());
                requestBody = new JSONObject();
                requestBody.put(DISKPOOL.TYPE, MOType.DISKPOOL.getValue());
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

        RestManager<DiskPoolMO> restManager = new RestManager<DiskPoolMO>(DiskPoolMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 在DiskPool中添加Disk
     * @param diskPoolID 硬盘域id
     * @param ids 硬盘id
     * @throws ApiException 异常
     */
    @Override
    public void createAssociateWithDisk(String diskPoolID, String[] ids) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "expand",
            "diskpool");

        JSONObject requestBody = new JSONObject();
        Gson gson = new Gson();
        try
        {
            JSONArray idsArray = new JSONArray(gson.toJson(ids));
            requestBody.put(DISKPOOL.TYPE, MOType.DISKPOOL.getValue());
            requestBody.put(DISKPOOL.ID, diskPoolID);
            requestBody.put(DISKPOOL.ASSOCIATEOBJIDLIST, idsArray);
            requestBody.put(DISKPOOL.ASSOCIATEOBJTYPE, MOType.DISK.getValue());
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<DiskPoolMO> restManager = new RestManager<DiskPoolMO>(DiskPoolMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 在DiskPool中移除Disk
     * @param diskPoolID 硬盘域id
     * @param diskID 硬盘id
     * @throws ApiException 异常
     */
    @Override
    public void removeAssociateFromDisk(String diskPoolID, String diskID) throws ApiException
    {

        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "diskpool",
            "associate");

        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(DISKPOOL.TYPE, String.valueOf(MOType.HOSTGROUP.getValue()));
        headParamMap.put(DISKPOOL.ID, diskPoolID);
        headParamMap.put(DISKPOOL.ASSOCIATEOBJID, diskID);
        headParamMap.put(DISKPOOL.ASSOCIATEOBJTYPE, String.valueOf(MOType.DISK.getValue()));

        RestManager<HostGroupMO> restManager = new RestManager<HostGroupMO>(HostGroupMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        restManager.getDelRequestMO();

    }

    /**
     * 获取硬盘域的总数
     * @return Long
     * @throws ApiException
     */
    public Long getCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "diskpool",
            "count");
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(DISKPOOL.TYPE, String.valueOf(MOType.DISKPOOL.getValue()));
        RestManager<DiskPoolMO> restManager = new RestManager<DiskPoolMO>(DiskPoolMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        DiskPoolMO diskPoolMO = restManager.getGetRequestMO();
        return Long.valueOf((String) diskPoolMO.getMO().getProperty(DISKPOOL.COUNT));
    }

}
