package com.huawei.ism.openapi.nas.filesystem;

import java.util.List;
import java.util.Map;

import com.huawei.ism.openapi.common.batchquery.ApiIterator;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.FILESYSTEM;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 文件系统迭代器
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class FileSystemIterator extends ApiIterator<FileSystemMO, FileSystemQuery>
{

    private static final String[] FILESYSTEMFILER =
    {FILESYSTEM.NAME, FILESYSTEM.HEALTHSTATUS, FILESYSTEM.RUNNINGSTATUS, FILESYSTEM.PARENTNAME};

    /**
     * 文件系统自定义迭代器构造函数
     * @param restRequestHandler rest请求
     * @param deviceID 网元ID
     * @param qCondition 请求条件
     */
    public FileSystemIterator(RestRequestHandler restRequestHandler, String deviceID, FileSystemQuery qCondition)
    {
        super(restRequestHandler, deviceID, qCondition, false);
    }

    /**
     * 获取对应MO的数量
     * @return 具体模块数据的数量
     * @throws ApiException 异常
     */
    @Override
    protected long getConcretCount() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "filesystem",
            "count");
        Map<String, String> headParamMap = composeRequestHeader(false);

        RestManager<FileSystemMO> restManager = new RestManager<FileSystemMO>(FileSystemMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        FileSystemMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo.getCount();
    }

    /**
     * 获取具体MO批量查询的结果
     * @return 具体模块批量查询的数据
     * @throws ApiException 异常
     */
    @Override
    protected List<FileSystemMO> getConcretBatchNext(boolean isAssociate) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "filesystem");
        Map<String, String> headParamMap = composeRequestHeader(true);

        RestManager<FileSystemMO> restManager = new RestManager<FileSystemMO>(FileSystemMO.class,
            getRestRequestHandler(), relativePath, headParamMap, null);
        List<FileSystemMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取存放具体属性的map
     * @param modelMo 模块数据对象
     * @return 存放具体属性的Map
     */
    @Override
    protected Map<Object, Object> getConcretMoMap(FileSystemMO modelMo)
    {
        return (null != modelMo) ? (modelMo.getMO().getProperties()) : null;
    }

    /**
     * 获取批量查询的过滤头信息
     * @return 批量查询的过滤头
     */
    @Override
    protected String[] getConcretFilterHeaders()
    {
        return FILESYSTEMFILER;
    }

    @Override
    protected String[] getFuzzyFilterHeaders()
    {
        return new String[0];
    }

}
