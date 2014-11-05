package com.huawei.ism.openapi.common.batchquery;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 模块迭代器模板
 * @author fWX183786
 * @version V100R001C10
 * @param <T1> 具体的Mo
 * @param <T2> 具体的查询条件
 */
public abstract class ApiIterator<T1, T2 extends QueryBase<T1>>
{
    private final String deviceID;

    private final RestRequestHandler restRequestHandler;

    private long totalCount = 0;

    private long curIndex = 0;

    private T2 queryCondition;

    private Map<Object, Object> headerMap = null;

    private boolean isAssociate;

    /**
     * 构造函数
     * @param restRequestHandler rest请求处理类
     * @param deviceID 设备ID
     * @param qCondition 具体模块查询条件
     */
    public ApiIterator(final RestRequestHandler restRequestHandler, final String deviceID, T2 qCondition,
        boolean isAssociate)
    {
        this.restRequestHandler = restRequestHandler;
        this.deviceID = deviceID;
        this.queryCondition = qCondition;
        this.isAssociate = isAssociate;
        if (null != qCondition)
        {
            this.curIndex = queryCondition.getBeginIndex();
        }
    }

    /**
     * 查询是否存在批量数据
     * @return true/false
     * @throws ApiException 异常
     */
    public Boolean hasNext() throws ApiException
    {
        return curIndex < getCount();
    }

    /**
     * 更新查询条件
     * @param qCondition 具体的查询条件
     */
    public void updateQuery(T2 qCondition)
    {
        this.queryCondition = qCondition;
        if (null != queryCondition)
        {
            this.curIndex = queryCondition.getBeginIndex();
        }
        headerMap = null;
        totalCount = 0;
    }

    /**
     * 获取下批批量查询的数据
     * @return 具体的批量数据
     * @throws ApiException 异常
     */
    public List<T1> getBatchNext() throws ApiException
    {
        List<T1> elements = null;
        if (null != queryCondition)
        {
            elements = getConcretBatchNext(isAssociate);
        }
        if (null != elements)
        {
            curIndex += elements.size();
        }
        return elements;
    }

    /**
     * 获取查询的条件
     * @return 具体模块的查询条件
     */
    public T2 getQuery()
    {
        return queryCondition;
    }

    /**
     * 获取对应MO的数量
     * @return 具体模块数据的数量
     * @throws ApiException 异常
     */
    protected abstract long getConcretCount() throws ApiException;

    /**
     * 获取具体MO批量查询的结果
     * @return 具体模块批量查询的数据
     * @throws ApiException 异常
     */
    protected abstract List<T1> getConcretBatchNext(boolean isAssociate) throws ApiException;

    /**
     * 获取存放具体属性的map
     * @param modelMo 模块数据对象
     * @return 存放具体属性的Map
     */
    protected abstract Map<Object, Object> getConcretMoMap(T1 modelMo);

    /**
     * 获取批量查询的过滤头信息
     * @return 批量查询的过滤头
     */
    protected abstract String[] getConcretFilterHeaders();

    /**
     * 获取批量模糊查询的过滤头信息
     * @return 批量查询的过滤头
     */
    protected abstract String[] getFuzzyFilterHeaders();

    /**
     * 获取rest请求处理类
     * @return rest请求处理类
     */
    protected RestRequestHandler getRestRequestHandler()
    {
        return restRequestHandler;
    }

    /**
     * 获取设备ID
     * @return 设备ID
     */
    protected String getDeviceId()
    {
        return deviceID;
    }

    /**
     * 组装批量查询的请求头,用于批量查询的情况
     * @param isBatch 数量查询的判读
     * @return 查询条件组成HTTP头
     */
    protected Map<String, String> composeRequestHeader(Boolean isBatch)
    {
        Map<String, String> headParamMap = new HashMap<String, String>();

        if (null != queryCondition)
        {
            if (isBatch)
            {
                headParamMap.put("range", "[" + curIndex + "-" + (curIndex + queryCondition.getCount()) + "]");
            }

            T1 mo = queryCondition.getConcretMO();
            if (null != mo)
            {
                Map<String, String> dstMap = OpenApiUtils.getOpenApiUtilsInstance().convertToStringMaps(getHeadMap(mo));
                headParamMap.putAll(dstMap);
            }
        }
        return headParamMap;
    }

    /**
     * 组装批量查询的过滤头
     * @param modelMo 数据对象
     * @return 批量查询的Map头
     */
    private Map<Object, Object> getHeadMap(T1 modelMo)
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
     * 获取批量查询的数量
     * @return 批量查询的数量
     * @throws ApiException 异常
     */
    private long getCount() throws ApiException
    {
        if (0 == totalCount && null != queryCondition) // 查询的数量是否为0
        {
            totalCount = getConcretCount();
        }
        return totalCount;
    }

    /**
     * 组装批量查询的过滤条件Map
     * @param userHeaderMap
     * @param filterHeader
     * @return
     */
    private Map<Object, Object> composeFilterHeader(T1 mo)
    {
        Map<Object, Object> headerMapFormModel = getConcretMoMap(mo);
        String[] concretFilterHeader = getConcretFilterHeaders();
        String[] fuzzyFilterHeader = getFuzzyFilterHeaders();
        Map<Object, Object> concretFileterHeaderMap = new HashMap<Object, Object>();
        Map<Object, Object> fuzzyFilterHeaderMap = new HashMap<Object, Object>();
        Map<Object, Object> fileterHeaderMap = new HashMap<Object, Object>();

        for (Map.Entry<Object, Object> entry : headerMapFormModel.entrySet())
        {
            String key = entry.getKey().toString();
            OpenApiUtils openApiUtilsInstance = OpenApiUtils.getOpenApiUtilsInstance();
            if (!openApiUtilsInstance.isContainKey(key, concretFilterHeader)
                && !openApiUtilsInstance.isContainKey(key, fuzzyFilterHeader))
            {
                fileterHeaderMap.put(key, entry.getValue());
            }
            else if (openApiUtilsInstance.isContainKey(key, concretFilterHeader))
            {
                concretFileterHeaderMap.put(key, entry.getValue());
            }
            else if (openApiUtilsInstance.isContainKey(key, fuzzyFilterHeader))
            {
                fuzzyFilterHeaderMap.put(key, entry.getValue());
            }
        }

        StringBuffer moFilter = new StringBuffer();
        boolean isNotFirst = false;
        if (!concretFileterHeaderMap.isEmpty())
        {
            Set<Entry<Object, Object>> key = concretFileterHeaderMap.entrySet();
            Iterator<Entry<Object, Object>> iterator = key.iterator();
            while (iterator.hasNext())
            {
                Entry<Object, Object> entry = iterator.next();

                if (isNotFirst)
                {
                    moFilter.append("%20and%20");
                }
                isNotFirst = true;
                String moKey = (String) entry.getKey();
                if (entry.getValue() instanceof Boolean)
                {
                    Boolean bool = (Boolean) entry.getValue();
                    if (bool)
                    {
                        moFilter.append(moKey).append("::").append("1");
                    }
                    else
                    {
                        moFilter.append(moKey).append("::").append("0");
                    }

                }
                else
                {
                    moFilter.append(moKey).append("::").append(entry.getValue());
                }
            }
        }
        if (!fuzzyFilterHeaderMap.isEmpty())
        {
            Set<Entry<Object, Object>> key = fuzzyFilterHeaderMap.entrySet();
            Iterator<Entry<Object, Object>> iterator = key.iterator();
            while (iterator.hasNext())
            {
                Entry<Object, Object> entry = iterator.next();
                if (isNotFirst)
                {
                    moFilter.append("%20and%20");
                }
                isNotFirst = true;
                String moKey = (String) entry.getKey();
                if (entry.getValue() instanceof Boolean)
                {
                    Boolean bool = (Boolean) entry.getValue();
                    if (bool)
                    {
                        moFilter.append(moKey).append(":").append("1");
                    }
                    else
                    {
                        moFilter.append(moKey).append(":").append("0");
                    }

                }
                else
                {
                    moFilter.append(moKey).append(":").append(entry.getValue());
                }
            }
        }
        if ("".equals(moFilter.toString()))
        {
            return fileterHeaderMap;
        }
        fileterHeaderMap.put("filter", moFilter.toString());

        return fileterHeaderMap;
    }

    protected long getCurIndex()
    {
        return curIndex;
    }

}
