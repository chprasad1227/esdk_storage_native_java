package com.huawei.ism.openapi.mappingview;

import org.json.JSONObject;
import com.huawei.ism.openapi.common.keydeifines.TLV.MAPPINGVIEW;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * 视图 bean
 * @author w00208247
 * @version [版本号V001R010C10]
 */
class MappingViewMO
{
    private final MO mo;
    
    protected MappingViewMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
        setType(MOType.MAPPINGVIEW);
    }
    
    MappingViewMO()
    {
        this.mo = new MO();
        setType(MOType.MAPPINGVIEW);
    }
    
    private void setType(MOType type)
    {
        mo.setProperty(MAPPINGVIEW.TYPE, type.getValue());
    }
    
    /**
     * 方法 ： getID
     * 
     * @return String 返回结果
     */
    protected String getId()
    {
        return mo.getStrProperty(MAPPINGVIEW.ID);
    }
    
    /**
     * 是否专用于文件系统集群
     * @return
     */
    protected Boolean isForFileSystem()
    {
        return mo.getBoolProperty(MAPPINGVIEW.FORFILESYSTEM);
    }
    
    /**
     * 获取视图的描述
     * 
     * @return
     */
    protected String getDescription()
    {
        return mo.getStrProperty(MAPPINGVIEW.DESCRIPTION);
    }
    
    /**
     * 获取属性MO
     * @return
     */
    protected MO getMO()
    {
        return this.mo;
    }
}
