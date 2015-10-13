package com.huawei.ism.openapi.common.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.ExceptionConstant;

/**
 * OpenApi 工具类
 * @author fWX183786
 * @version V100R001C10
 */
public final class OpenApiUtils
{
    private static OpenApiUtils openApiUtilsInstanceApiUtils = null;

    /**
     * 私有构造函数
     */
    private OpenApiUtils()
    {

    }

    /**
     * 获取openApi工具类单类
     * @return OpenApi单例
     */
    public static OpenApiUtils getOpenApiUtilsInstance()
    {
        if (null == openApiUtilsInstanceApiUtils)
        {
            openApiUtilsInstanceApiUtils = new OpenApiUtils();
        }
        return openApiUtilsInstanceApiUtils;
    }

    /**
     * 判断是否是空字符串
     * @return Boolean [返回类型说明]
     * @param content 内容
     */
    public Boolean isNullStr(String content)
    {
        return null == content || content.isEmpty();
    }

    /**
     * isJunitTest
     * @return true/false
     */
    public Boolean isJunitTest()
    {
        Object obj = System.getProperty("ISM_JUNIT");
        if (null == obj || !Boolean.parseBoolean((String) obj))
        {
            return false;
        }

        return true;
    }

    /**
     * 判断是否是空字符串
     * @param inStr 检查的字符串
     * @param needTrim 过滤空格
     * @return true/false
     */
    public Boolean isNullString(String inStr, Boolean needTrim)
    {
        if (null == inStr || inStr.length() < 1)
        {
            return true;
        }

        if (needTrim && inStr.trim().length() < 1)
        {
            return true;
        }

        return false;
    }

    /**
     * 是否是空列表
     * @param fList fList
     * @return Boolean true/false
     */
    public Boolean isNullList(List<?> fList)
    {
        return null == fList || fList.isEmpty();
    }

    /**
     * isNullArray
     * @param t 变参数
     * @param <T> 参数类型
     * @return true/false
     */
    public <T> Boolean isNullArray(T... t)
    {
        return null == t || t.length == 0;
    }

    /**
     * 在字符串数组中增加新的字符串，常用于增删表格头字符串的场景
     * 
     * @param srcArray 源数组
     * @param index 添加字符串的位置
     * @param value 要添加的字符串
     * @return String[] 添加后的字符串
     */
    public String[] addStringToArray(String[] srcArray, int index, String value)
    {
        if (null == srcArray)
        {
            return new String[0];
        }

        List<String> strList = new ArrayList<String>(Arrays.asList(srcArray));
        strList.add(index, value);
        return strList.toArray(new String[strList.size()]);
    }

    /**
     * 在字符串数组中删除指定位置的字符串，常用于增删表格头字符串的场景
     * @param srcArray 源数组
     * @param index 要删除的字符串的位置
     * @return String[] 删除后的字符串
     */
    public String[] removeStringFromArray(String[] srcArray, int index)
    {
        if (null == srcArray)
        {
            return new String[0];
        }

        List<String> strList = new ArrayList<String>(Arrays.asList(srcArray));
        strList.remove(index);
        return strList.toArray(new String[strList.size()]);
    }

    /**
     * 在字符串数组中删除指定的字符串，常用于增删表格头字符串的场景
     * @param srcArray 源数组
     * @param value 要删除的字符串
     * @return String[] 删除后的字符串
     */
    public String[] removeStringFromArray(String[] srcArray, String value)
    {
        if (null == srcArray)
        {
            return new String[0];
        }

        List<String> strList = new ArrayList<String>(Arrays.asList(srcArray));
        strList.remove(value);
        return strList.toArray(new String[strList.size()]);
    }

    /**
     * 组装List
     * @param args 参数数组
     * @return List<String>
     */
    public synchronized List<String> composeList(String... args)
    {
        List<String> pathList = new ArrayList<String>();
        for (String arg : args)
        {
            pathList.add(arg);
        }
        return pathList;
    }

    /**
     * 组装Http 请求的相对路径
     * @param args 相对路径数组
     * @return 相对路径
     */
    public synchronized String composeRelativeUri(String... args)
    {
        StringBuilder relativePath = new StringBuilder();

        for (String arg : args)
        {
            relativePath.append("/").append(arg);
        }
        return relativePath.toString();
    }

    /**
     * 转换Map到Json
     * @param requestBody 返回的Json 数据
     * @param properties 转换的Map
     * @throws ApiException 异常
     */
    public synchronized void composeFromMap(JSONObject requestBody, Map<Object, Object> properties) throws ApiException
    {
        if (requestBody != null && properties != null)
        {
            try
            {
                for (Map.Entry<Object, Object> entry : properties.entrySet())
                {
                    String key = entry.getKey().toString();
                    Object value = entry.getValue();
                    requestBody.put(key, value);
                }
            }
            catch (JSONException e)
            {
                ExceptionConstant.JASONEXPMSG.setErrDescription(e.getMessage());
                throw new ApiException(ExceptionConstant.JASONEXPMSG, e);
            }
        }
    }

    /**
     * 转换Map<Object, Object> to Map<String, String>
     * @param srcMaps Map<Object, Object>
     * @return Map<String, String>
     */
    public synchronized Map<String, String> convertToStringMaps(Map<Object, Object> srcMaps)
    {
        Map<String, String> dstMap = new HashMap<String, String>();
        if (null != srcMaps)
        {
            for (Map.Entry<Object, Object> entry : srcMaps.entrySet())
            {
                String key = entry.getKey().toString();
                String value = String.valueOf(entry.getValue());
                dstMap.put(key, value);
            }
        }

        return dstMap;
    }

    /**
     * 获取UTC 时间戳
     * @return 时间戳
     */
    public long getUTCTime()
    {
        Calendar cal = Calendar.getInstance();
        int zoneOffset = cal.get(java.util.Calendar.ZONE_OFFSET);
        int dstOffset = cal.get(java.util.Calendar.DST_OFFSET);
        cal.add(java.util.Calendar.MILLISECOND, -(zoneOffset + dstOffset));
        return cal.getTimeInMillis();
    }

    /**
     * 查询数组里面是否包含key
     * @param key 键
     * @param keyArray 值组
     * @return true or false
     */
    public Boolean isContainKey(String key, String[] keyArray)
    {
        if (null == key || null == keyArray || keyArray.length <= 0)
        {
            return false;
        }
        for (String value : keyArray)
        {
            if (value.equals(key))
            {
                return true;
            }
        }
        return false;

    }
}
