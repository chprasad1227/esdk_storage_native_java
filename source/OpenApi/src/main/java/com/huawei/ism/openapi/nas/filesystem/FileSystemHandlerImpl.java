package com.huawei.ism.openapi.nas.filesystem;

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
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.TLV.FCoEPort;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.FILESYSTEM;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 文件系统接口实现类
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class FileSystemHandlerImpl extends DefaultCommHandler implements FileSystemHandler
{
    private FileSystemIterator iterator = null;

    /**
     * 文件系统接口实现类
     * @param restRequestHandler rest请求
     * @param deviceID 网元ID
     */
    protected FileSystemHandlerImpl(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建文件系统
     * @param mo 文件系统mo
     * @return 文件系统mo
     * @throws ApiException 自定义异常
     */
    @Override
    public FileSystemMO create(FileSystemMO mo) throws ApiException
    {

        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "filesystem");
        JSONObject requestBody = new JSONObject();
        try
        {
            requestBody.put(FILESYSTEM.TYPE, MOType.FILESYSTEM.getValue());
            // 是否是克隆文件系统
            requestBody.put(FILESYSTEM.ISCLONEFS, false);
            // PARENTTYPE使用默认值：
            if (null != mo)
            {
                requestBody.put(FILESYSTEM.ISSHOWSNAPDIR, mo.getIsShowSnapDir());
                // 遍历属性数组
                Map<Object, Object> properties = mo.getMO().getProperties();
                LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO,
                    "the request params is " + properties.toString());
                LogUtil.getLogUtilInstance().showInterfaceLog(LOG_TYPE_E.LOG_INFO, 2,
                        "FileSystemHandlerImpl.create()", null, properties.toString());
                OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
            }
        }
        catch (JSONException e)
        {
            ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
            throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
        }

        RestManager<FileSystemMO> restManager = new RestManager<FileSystemMO>(FileSystemMO.class,
            getRestRequestHandler(), realitivePath, null, requestBody);
        FileSystemMO resPonsemo = restManager.getPostRequestMO();

        return resPonsemo;
    }

    /**
     * 修改文件系统
     * @param mo 文件系统mo
     * @throws ApiException 自定义异常
     */
    @Override
    public void modify(FileSystemMO mo) throws ApiException
    {
        String realitivePath = null;
        JSONObject requestBody = null;

        if (null != mo)
        {
            realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "filesystem",
                mo.getId());
            requestBody = new JSONObject();

            Map<Object, Object> properties = mo.getMO().getProperties();
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
        }

        RestManager<FileSystemMO> restManager = new RestManager<FileSystemMO>(FileSystemMO.class,
            getRestRequestHandler(), realitivePath, null, requestBody);
        restManager.getPutRequestMO();

    }

    /**
     * 查询文件系统
     * @param fileSystemId 系统信息ID
     * @return 文件系统信息
     * @throws ApiException 自定义异常
     */
    @Override
    public FileSystemMO get(String fileSystemId) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "filesystem",
            fileSystemId);

         Map<String, String> headParamMap = new HashMap<String, String>();
         headParamMap.put(FILESYSTEM.ID, fileSystemId);

        RestManager<FileSystemMO> restManager = new RestManager<FileSystemMO>(FileSystemMO.class,
            getRestRequestHandler(), realitivePath, null, null);
        FileSystemMO resPonsemo = restManager.getGetRequestMO();

        return resPonsemo;
    }

    /**
     * 删除文件系统信息
     * @param fileSystemId 系统信息id
     * @throws ApiException 自定义异常
     */
    @Override
    public void delete(String fileSystemId) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "filesystem",
            fileSystemId);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(FILESYSTEM.TYPE, String.valueOf(MOType.FILESYSTEM.getValue()));
        headParamMap.put(FILESYSTEM.ID, fileSystemId);

        RestManager<FileSystemMO> restManager = new RestManager<FileSystemMO>(FileSystemMO.class,
            getRestRequestHandler(), realitivePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 批量查询文件系统信息
     * @param condition 文件系统过滤条件
     * @return 满足过滤条件的文件系统信息
     * @throws ApiException 自定义异常
     */
    @Override
    public FileSystemIterator getBatch(FileSystemQuery condition) throws ApiException
    {
        if (null == iterator)
        {
            iterator = new FileSystemIterator(getRestRequestHandler(), getDeviceId(), condition);
        }
        return iterator;
    }

    /**
     * 通过存储池查询文件系统
     * @param storagePoolID 存储池ID
     * @return 满足关联条件的文件系统信息
     * @throws ApiException 自定义异常
     */
    @Override
    public List<FileSystemMO> getFileSystemByStoragePool(String storagePoolId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "filesystem");
        Map<String, String> headParams = new HashMap<String, String>();
        headParams.put(FCoEPort.ASSOCIATEOBJID, storagePoolId);
        headParams.put(FCoEPort.ASSOCIATEOBJTYPE, String.valueOf(MOType.STORAGEPOOL.getValue()));

        RestManager<FileSystemMO> restManager = new RestManager<FileSystemMO>(FileSystemMO.class,
            getRestRequestHandler(), relativePath, headParams, null);
        return restManager.getGetRequestMOList();
    }
}
