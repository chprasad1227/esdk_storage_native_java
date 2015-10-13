package com.huawei.ism.openapi.disk;

import java.util.HashMap;
import java.util.Map;

import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.TLV.DISK;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 硬盘接口实现
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class DiskHandlerImp extends DefaultCommHandler implements DiskHandler
{
    private DiskIterator diskIterator = null;

    /**
     * DiskHandlerImp
     * @param restRequestHandler REST请求
     * @param deviceID 设备ID
     */
    protected DiskHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 查询单个硬盘
     * @param id 硬盘ID
     * @return DiskMO
     * @throws ApiException API异常
     */
    public DiskMO get(String id) throws ApiException
    {
        String realitivePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "disk", id);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(DISK.TYPE, String.valueOf(MOType.DISK.getValue()));
        headParamMap.put(DISK.ID, id);

        RestManager<DiskMO> restManager = new RestManager<DiskMO>(DiskMO.class, getRestRequestHandler(), realitivePath,
            headParamMap, null);

        DiskMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo;
    }

    /**
     * 批量查询硬盘
     * @param condition 查询条件
     * @return DiskIterator
     * @throws ApiException API异常
     */
    public DiskIterator getBatch(DiskQuery condition) throws ApiException
    {
        if (null == diskIterator)
        {
            diskIterator = new DiskIterator(getRestRequestHandler(), getDeviceId(), condition, false);

        }
        return diskIterator;
    }

}
