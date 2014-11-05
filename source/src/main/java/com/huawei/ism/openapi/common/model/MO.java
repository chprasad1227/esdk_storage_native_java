package com.huawei.ism.openapi.common.model;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.ism.openapi.common.keydeifines.IsmConstant;

/**
 * 通用的数据模块
 * @author fWX183786
 * @version V100R001C10
 */
public class MO
{
    // 用于以key-value形式存放扩展属性的Map
    private transient Map<Object, Object> properties = new ConcurrentHashMap<Object, Object>();

    /**
     * 默认构造函数
     */
    public MO()
    {
    }

    /**
     * 构造函数
     * @param jsonBody Json 数据
     */
    public MO(JSONObject jsonBody)
    {
        if (null != jsonBody)
        {
            TypeToken<Map<String, String>> typeToken = new TypeToken<Map<String, String>>()
            {
            };
            Type type = typeToken.getType();
            Gson gson = new Gson();
            properties = gson.fromJson(jsonBody.toString(), type);
        }
    }

    /**
     * 获取属性Map
     * @return 属性Map
     */
    public Map<Object, Object> getProperties()
    {
        return properties;
    }

    /**
     * 设置属性
     * @param propertyMap 属性Map
     */
    public void setProperty(Map<Object, Object> propertyMap)
    {
        if (null == propertyMap)
        {
            return;
        }
        properties.putAll(propertyMap);
    }

    /**
     * 设置组件的属性
     * @param key 属性键值
     * @param value 属性值
     */
    public void setProperty(Object key, Object value)
    {
        if (null != key)
        {
            properties.put(key, value);
        }
    }

    /**
     * 获取组件的扩展属性
     * @param key 属性键值
     * @return Object 返回结果
     */
    public Object getProperty(Object key)
    {
        if (null == key || null == properties)
        {
            return null;
        }
        return properties.get(key);
    }

    /**
     * 获取组件的扩展String属性
     * @param key 属性键值
     * @return String 返回String值
     */
    public String getStrProperty(Object key)
    {
        if (null == key || null == properties)
        {
            return null;
        }

        Object object = properties.get(key);

        if (null != object)
        {
            return object.toString();
        }
        return null;
    }

    /**
     * 获取组件的扩展int属性
     * @param key 属性键值
     * @return int 返回int值
     */
    public int getIntProperty(Object key)
    {
        if (null == key || null == properties)
        {
            return IsmConstant.UNDEFINE_VALUE;
        }
        Object value = properties.get(key);
        if (null == value || !isInteger(value.toString()))
        {
            return IsmConstant.UNDEFINE_VALUE;
        }
        return Integer.valueOf(value.toString());
    }

    /**
     * 获取组件的扩展long属性
     * @param key 属性键值
     * @return long 返回long
     */
    public long getLongProperty(Object key)
    {
        if (null == key || null == properties)
        {
            return IsmConstant.UNDEFINE_LONG_VALUE;
        }

        Object value = properties.get(key);
        if (null == value || !isInteger(value.toString()))
        {
            return IsmConstant.UNDEFINE_LONG_VALUE;
        }
        return Long.valueOf(value.toString());
    }

    /**
     * 获取组件的扩展double属性,在确定是double型参数时使用,如果不是此类型的参数，会抛转型错误异常
     * @param key 属性键值
     * @return double 返回double
     */
    public double getDoubleProperty(Object key)
    {
        if (null == key || null == properties)
        {
            return IsmConstant.UNDEFINE_DOUBLE_VALUE;
        }

        Object value = properties.get(key);
        if (null == value || !isDouble(value.toString()))
        {
            return IsmConstant.UNDEFINE_DOUBLE_VALUE;
        }
        return Double.valueOf(value.toString());
    }

    /**
     * 获取组件的扩展Boolean属性
     * @param key 属性键值
     * @return Boolean 返回Boolean结果
     */
    public Boolean getBoolProperty(Object key)
    {
        if (null == key || null == properties)
        {
            return false;
        }
        Object value = properties.get(key);
        if (null == value)
        {
            return false;
        }
        return Boolean.valueOf(value.toString());
    }

    /**
     * 获取String数组属性
     * @param key 属性键值
     * @return String 数组
     */
    public String[] getStrArrayProperty(Object key)
    {
        Object value = properties.get(key);
        if (null == value)
        {
            return new String[0];
        }

        Gson gson = new Gson();
        String[] values = gson.fromJson(String.valueOf(value), String[].class);
        return (values != null) ? values : new String[0];
    }

    /*
     * 判断是否为整数
     * 
     * @param str 传入的字符串
     * 
     * @return 是整数返回true,否则返回false
     */
    private Boolean isInteger(String str)
    {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

    /*
     * 判断是否为浮点数，包括double和float
     * 
     * @param str 传入的字符串
     * 
     * @return 是浮点数返回true,否则返回false
     */
    private Boolean isDouble(String str)
    {
        Pattern pattern = Pattern.compile("^[-\\+]?[.\\d]*$");
        return pattern.matcher(str).matches();
    }

}
