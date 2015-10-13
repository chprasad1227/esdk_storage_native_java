package com.huawei.ism.openapi.cachepartition;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.TLV.CACHEPARTITION;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * 存储分区MO
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class CachePartitionMO
{
    private final MO mo;

    /**
     * CachePartitionMO
     * @param jObject JSONObject
     */
    public CachePartitionMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
        setParentType(MOType.STORAGEENGINE);
        mo.setProperty(CACHEPARTITION.TYPE, MOType.CACHEPARTITION.getValue());
    }

    /**
     * CachePartitionMO
     */
    public CachePartitionMO()
    {
        this.mo = new MO();
        setParentType(MOType.STORAGEENGINE);
        mo.setProperty(CACHEPARTITION.TYPE, MOType.CACHEPARTITION.getValue());
    }

    /**
     * 设置关联对象类型
     * @param moType 关联对象类型
     */
    public void setAssociateOBJType(MOType moType)
    {
        mo.setProperty(CACHEPARTITION.ASSOCIATEOBJTYPE, String.valueOf(moType.getValue()));
    }

    /**
     * 获取关联对象类型
     * @return 返回结果
     */
    public MOType getAssociateOBJType()
    {
        return MOType.valueOf(mo.getStrProperty(CACHEPARTITION.ASSOCIATEOBJTYPE));
    }

    /**
     * 设置关联对象ID
     * @param id 关联对象ID
     */
    public void setAssociateOBJId(String id)
    {
        mo.setProperty(CACHEPARTITION.ASSOCIATEOBJID, id);
    }

    /**
     * 获取关联对象ID
     * @return 返回结果
     */
    public String getAssociateOBJId()
    {
        return mo.getStrProperty(CACHEPARTITION.ASSOCIATEOBJID);
    }

    /**
     * 方法 ： getID
     * @return String 返回结果
     */
    public String getId()
    {
        return mo.getStrProperty(CACHEPARTITION.ID);
    }

    /**
     * 对id进行赋值
     * @param id 方法参数：id
     */
    public void setId(String id)
    {
        mo.setProperty(CACHEPARTITION.ID, id);
    }

    /**
     * 方法 ： getName
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(CACHEPARTITION.NAME);
    }

    /**
     * 对name进行赋值
     * @param name 方法参数：name
     */
    public void setName(String name)
    {
        mo.setProperty(CACHEPARTITION.NAME, name);
    }

    /**
     * 方法 ： getParentType
     * @return MOType 返回结果
     */
    public MOType getParentType()
    {
        return MOType.getType(Integer.parseInt(mo.getProperty(CACHEPARTITION.PARENTTYPE).toString()));
    }

    /**
     * 对parentType进行赋值
     * @param parentType 方法参数：parentType
     */
    public void setParentType(MOType parentType)
    {
        mo.setProperty(CACHEPARTITION.PARENTTYPE, parentType.getValue());
    }

    /**
     * getParentID
     * @return String
     */
    public String getParentId()
    {
        return mo.getStrProperty(CACHEPARTITION.PARENTID);
    }

    /**
     * setParentID
     * @param id CACHEPARTITION.PARENTID
     */
    public void setParentId(String id)
    {
        mo.setProperty(CACHEPARTITION.PARENTID, id);
    }

    /**
     * getParentName
     * @return String
     */
    public String getParentName()
    {
        return mo.getStrProperty(CACHEPARTITION.PARENTNAME);
    }

    /**
     * getDescription
     * @return String
     */
    public String getDescription()
    {
        return mo.getStrProperty(CACHEPARTITION.DESCRIPTION);
    }

    /**
     * setDescription
     * @param description 分区的描述信息
     */
    public void setDescription(String description)
    {
        mo.setProperty(CACHEPARTITION.DESCRIPTION, description);
    }

    /**
     * isDefault
     * @return Boolean
     */
    public Boolean isDefault()
    {
        return mo.getBoolProperty(CACHEPARTITION.ISDEFAULT);
    }

    /**
     * getMinReadSize
     * @return Long
     */
    public Long getMinReadSize()
    {
        return mo.getLongProperty(CACHEPARTITION.MINREADSIZE);
    }

    /**
     * setMinReadSize
     * @param size MINREADSIZE
     */
    public void setMinReadSize(Long size)
    {
        mo.setProperty(CACHEPARTITION.MINREADSIZE, size);
    }

    /**
     * getExpectReadSize
     * @return Long
     */
    public Long getExpectReadSize()
    {
        return mo.getLongProperty(CACHEPARTITION.EXPECTREADSIZE);
    }

    /**
     * setExpectReadSize
     * @param size EXPECTREADSIZE
     */
    public void setExpectReadSize(Long size)
    {
        mo.setProperty(CACHEPARTITION.EXPECTREADSIZE, size);
    }

    /**
     * getMaxReadSize
     * @return Long
     */
    public Long getMaxReadSize()
    {
        return mo.getLongProperty(CACHEPARTITION.MAXREADSIZE);
    }

    /**
     * setMaxReadSize
     * @param size MAXREADSIZE
     */
    public void setMaxReadSize(Long size)
    {
        mo.setProperty(CACHEPARTITION.MAXREADSIZE, size);
    }

    /**
     * getMinWriteSize
     * @return Long
     */
    public Long getMinWriteSize()
    {
        return mo.getLongProperty(CACHEPARTITION.MINWRITESIZE);
    }

    /**
     * setMinWriteSize
     * @param size MINWRITESIZE
     */
    public void setMinWriteSize(Long size)
    {
        mo.setProperty(CACHEPARTITION.MINWRITESIZE, size);
    }

    /**
     * getExpectWriteSize
     * @return Long
     */
    public Long getExpectWriteSize()
    {
        return mo.getLongProperty(CACHEPARTITION.EXPECTWRITESIZE);
    }

    /**
     * setExpectWriteSize
     * @param size EXPECTWRITESIZE
     */
    public void setExpectWriteSize(Long size)
    {
        mo.setProperty(CACHEPARTITION.EXPECTWRITESIZE, size);
    }

    /**
     * getMaxWriteSize
     * @return Long
     */
    public Long getMaxWriteSize()
    {
        return mo.getLongProperty(CACHEPARTITION.MAXWRITESIZE);
    }

    /**
     * setMaxWriteSize
     * @param size MAXWRITESIZE
     */
    public void setMaxWriteSize(Long size)
    {
        mo.setProperty(CACHEPARTITION.MAXWRITESIZE, size);
    }

    /**
     * 方法 ： getMO
     * @return MO 返回结果
     */
    protected MO getMO()
    {
        return this.mo;
    }

    /**
     * 方法 ： getCount
     * @return Long 返回结果
     */
    protected Long getCount()
    {
        return mo.getLongProperty(CACHEPARTITION.COUNT);
    }

}
