package com.huawei.ism.openapi.nas.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 用户迭代器
 */
public class UserIterator
{
    private final String deviceID;

    private final RestRequestHandler restRequestHandler;

    private UserMO mo;

    private Map<Object, Object> headerMap = null;

    /**
     * 构造函数
     * @param restRequestHandler rest请求处理类
     * @param deviceID 设备ID
     * @param qCondition 批量查询条件
     */
    public UserIterator(RestRequestHandler restRequestHandler, String deviceID, UserMO mo)
    {
        this.restRequestHandler = restRequestHandler;
        this.deviceID = deviceID;
        this.mo = mo;
    }

    /**
     * 获取批量数据
     * @return 批量数据
     * @throws ApiException 异常
     */
    protected List<UserMO> getBatchNext() throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(deviceID, "user");
        Map<String, String> headParamMap = composeRequestHeader();

        RestManager<UserMO> restManager = new RestManager<UserMO>(UserMO.class, restRequestHandler, relativePath,
            headParamMap, null);
        List<UserMO> resPonsemoList = restManager.getGetRequestMOList();
        return resPonsemoList;
    }

    /**
     * 获取UserMO的属性Map
     * @param modelMo User数据对象
     * @return UserMO的属性Map
     */
    protected Map<Object, Object> getConcretMoMap(UserMO modelMo)
    {
        return (null != modelMo) ? modelMo.getMO().getProperties() : null;
    }

    /**
     * 组装批量查询的请求头,用于批量查询的情况
     * @param isBatch 数量查询的判读
     * @return 查询条件组成HTTP头
     */
    protected Map<String, String> composeRequestHeader()
    {
        Map<String, String> headParamMap = new HashMap<String, String>();

        if (null != mo)
        {
            Map<String, String> dstMap = OpenApiUtils.getOpenApiUtilsInstance().convertToStringMaps(getHeadMap(mo));
            headParamMap.putAll(dstMap);
        }
        return headParamMap;
    }

    /**
     * 组装批量查询的过滤头
     * @param modelMo 数据对象
     * @return 批量查询的Map头
     */
    private Map<Object, Object> getHeadMap(UserMO modelMo)
    {
        if (null == headerMap)
        {
            headerMap = composeFilterHeader(modelMo);
            return headerMap;
        }
        else
        {
            return headerMap;
        }
    }

    /**
     * 组装批量查询的过滤条件Map
     * @param userHeaderMap
     * @param filterHeader
     * @return
     */
    private Map<Object, Object> composeFilterHeader(UserMO mo)
    {
        Map<Object, Object> headerMapFormModel = getConcretMoMap(mo);
        Map<Object, Object> fileterHeaderMap = new HashMap<Object, Object>();

        if(null == headerMapFormModel)
        {
            return fileterHeaderMap;// zwx228053 增加校验
        }
        for (Map.Entry<Object, Object> entry : headerMapFormModel.entrySet())
        {
            String key = entry.getKey().toString();
            fileterHeaderMap.put(key, entry.getValue());
        }

        StringBuffer moFilter = new StringBuffer();
        if ("".equals(moFilter.toString()))
        {
            return fileterHeaderMap;
        }
        fileterHeaderMap.put("filter", moFilter.toString());

        return fileterHeaderMap;
    }

}
