package com.huawei.ism.openapi.remotelun;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.ArrayTypeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RSSTypeE;
import com.huawei.ism.openapi.common.keydeifines.TLV.RemoteLun;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

public class RemoteLunMO
{
    private final MO mo;

    /**
     * RemoteLunMO构造函数
     * @param jObject RemoteLunMO对应的json
     */
    protected RemoteLunMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
        setType(MOType.REMOTE_LUN);
    }

    /**
     * RemoteLunMO构造函数
     */
    public RemoteLunMO()
    {
        this.mo = new MO();
        setType(MOType.REMOTE_LUN);
    }

    /**
     * 方法 ： getId
     * 
     * @return String 返回结果
     */
    public String getId()
    {
        return mo.getStrProperty(RemoteLun.ID);
    }

    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(RemoteLun.NAME);
    }

    public void setName(String name)
    {
        mo.setProperty(RemoteLun.NAME, name);
    }

    /**
     * 方法 ： getHealthStatus
     * 
     * @return HealthStatus
     */
    public HealthStatusE getHealthStatus()
    {
        return HealthStatusE.valueOf(mo.getIntProperty(RemoteLun.HEALTHSTATUS));
    }

    /**
     * 方法 ： setHealthStatus
     * @param healthStatusE 健康状态
     */
    public void setHealthStatus(HealthStatusE healthStatusE)
    {
        mo.setProperty(RemoteLun.HEALTHSTATUS, Integer.parseInt(String.valueOf(healthStatusE.getValue())));
    }

    /**
     * 方法 ： getLunID
     * @return String 返回结果
     */
    public String getLunID()
    {
        return mo.getStrProperty(RemoteLun.LUNID);
    }

    /**
     * 方法 ： getLunWWN
     * @return String 返回结果
     */
    public String getLunWWN()
    {
        return mo.getStrProperty(RemoteLun.LUNWWN);
    }

    /**
     * 方法 ： getDeviceID
     * @return String 返回结果
     */
    public String getDeviceId()
    {
        return mo.getStrProperty(RemoteLun.DEVICEID);
    }

    /**
     * 对deviceID进行赋值
     * @param deviceID 方法参数：deviceID
     */
    public void setDeviceID(String deviceID)
    {
        mo.setProperty(RemoteLun.DEVICEID, deviceID);
    }

    /**
     * 方法 ： getDeviceSN
     * @return String 返回结果
     */
    public String getDeviceSN()
    {
        return mo.getStrProperty(RemoteLun.DEVICESN);
    }

    /**
     * 方法 ： getCapacity
     * 
     * @return Long 返回结果
     */
    public Long getCapacity()
    {
        return mo.getLongProperty(RemoteLun.CAPACITY);
    }

    /**
     * 方法 ： getArrayType
     * @return ArrayTypeE 返回结果
     */
    public ArrayTypeE getArrayType()
    {
        return ArrayTypeE.valueOf(mo.getIntProperty(RemoteLun.ARRAYTYPE));
    }

    /**
     * 方法 ： getCapacityByte
     * 
     * @return Long 返回结果
     */
    public Long getCapacityByte()
    {
        return mo.getLongProperty(RemoteLun.CAPACITYBYTE);
    }

    /**
     * 对capacityByte进行赋值
     * @param capacityByte 方法参数：capacityByte
     */
    public void setCapacityByte(Long capacityByte)
    {
        mo.setProperty(RemoteLun.CAPACITYBYTE, capacityByte);
    }

    /**
     * 对rssAssociateObjID进行赋值
     * @param rssAssociateObjID 方法参数：rssAssociateObjID
     */
    public void setRssAssociateObjID(String rssAssociateObjID)
    {
        mo.setProperty(RemoteLun.RSSTYPE, RSSTypeE.REP_SECONDARYLUN.getValue());
        mo.setProperty(RemoteLun.RSSASSOCIATEOBJID, rssAssociateObjID);
    }

    /**
     * 方法 ： getCount
     * 
     * @return long 返回结果
     */
    protected Long getCount()
    {
        return mo.getLongProperty(RemoteLun.COUNT);
    }

    /**
     * 方法 ： getMO
     * 
     * @return MO 返回结果
     */
    protected MO getMO()
    {
        return this.mo;
    }

    /**
     * 方法 ： setArratType
     * @param arrayTypeE
     */
    protected void setArratType(ArrayTypeE arrayTypeE)
    {
        mo.setProperty(RemoteLun.ARRAYTYPE, Integer.parseInt(String.valueOf(arrayTypeE.getValue())));
    }

    /**
     * 对type进行赋值
     * @param type 方法参数：type
     */
    private void setType(MOType type)
    {
        mo.setProperty(RemoteLun.TYPE, type.getValue());
    }

    /**
     * 方法 ： getRSSType
     * 
     * @return RSSTypeE
     */
    protected RSSTypeE getRSSType()
    {
        return RSSTypeE.valueOf(mo.getIntProperty(RemoteLun.RSSTYPE));
    }

    /**
     * 方法 ： getRssAssociateObjID
     * 
     * @return String
     */
    protected String getRssAssociateObjID()
    {
        return mo.getStrProperty(RemoteLun.RSSASSOCIATEOBJID);
    }
}
