package com.huawei.ism.openapi.remotedevice;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.ArrayTypeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.ConsultStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.ServiceTypeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.TLV.RemoteDevice;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

public class RemoteDeviceMO
{
    private final MO mo;

    /**
     * RemoteDeviceMO
     * @param jObject JSONObject
     */
    public RemoteDeviceMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
        mo.setProperty(RemoteDevice.TYPE, MOType.REMOTE_DEVICE.getValue());
    }

    /**
     * RemoteDeviceMO
     */
    public RemoteDeviceMO()
    {
        this.mo = new MO();
        mo.setProperty(RemoteDevice.TYPE, MOType.REMOTE_DEVICE.getValue());
    }

    /**
     * 方法 ： getID
     * @return String 返回结果
     */
    public String getId()
    {
        return mo.getStrProperty(RemoteDevice.ID);
    }

    /**
     * 方法 ： setId
     * @param id 健康状态
     */
    public void setId(String id)
    {
        mo.setProperty(RemoteDevice.ID, id);
    }

    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(RemoteDevice.NAME);
    }

    /**
     * 对name进行赋值
     * @param name 方法参数：name
     */
    public void setName(String name)
    {
        mo.setProperty(RemoteDevice.NAME, name);
    }

    /**
     * 方法 ： getDescription
     * 
     * @return Description
     */
    public String getDescription()
    {
        return mo.getStrProperty(RemoteDevice.DESCRIPTION);
    }

    /**
     * 对description进行赋值
     * @param description 方法参数：description
     */
    public void setDescription(String description)
    {
        mo.setProperty(RemoteDevice.DESCRIPTION, description);
    }

    /**
     * 方法 ： getHealthStatus
     * @return HEALTH_STATUS_E 返回结果
     */
    public HealthStatusE getHealthStatus()
    {
        return HealthStatusE.valueOf(mo.getIntProperty(RemoteDevice.HEALTHSTATUS));
    }

    /**
     * 方法 ： setHealthStatus
     * @param healthStatusE 健康状态
     */
    public void setHealthStatus(HealthStatusE healthStatusE)
    {
        mo.setProperty(RemoteDevice.HEALTHSTATUS, Integer.parseInt(String.valueOf(healthStatusE.getValue())));
    }

    /**
     * 方法 ： getRunningStatus
     * @return RUNNING_STATUS_E 返回结果
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE.valueOf(mo.getIntProperty(RemoteDevice.RUNNINGSTATUS));
    }

    /**
     * 方法 ： setRunningStatus
     * @param runningStatusE 运行状态
     */
    public void setRunningStatus(RunningStatusE runningStatusE)
    {
        mo.setProperty(RemoteDevice.RUNNINGSTATUS, Integer.parseInt(String.valueOf(runningStatusE.getValue())));
    }

    /**
     * 方法 ： getWWN
     * @return String 返回结果
     */
    public String getWWN()
    {
        return mo.getStrProperty(RemoteDevice.WWN);
    }

    /**
     * 方法 ： getSN
     * @return String 返回结果
     */
    public String getSN()
    {
        return mo.getStrProperty(RemoteDevice.SN);
    }

    /**
     * 方法 ： getArrayType
     * @return ArrayTypeE 返回结果
     */
    public ArrayTypeE getArrayType()
    {
        return ArrayTypeE.valueOf(mo.getIntProperty(RemoteDevice.ARRAYTYPE));
    }

    /**
     * 方法 ： getServiceType
     * @return RemoteDeviceServiceTypeE 返回结果
     */
    public ServiceTypeE getServiceType()
    {
        return ServiceTypeE.valueOf(mo.getIntProperty(RemoteDevice.SERVICETYPE));
    }

    /**
     * 方法 ： getLinkNum
     * 
     * @return Integer
     */
    public Integer getLinkNum()
    {
        return mo.getIntProperty(RemoteDevice.LINKNUM);
    }

    /**
     * 方法 ： getDeviceModel
     * 
     * @return String
     */
    public String getDeviceModel()
    {
        return mo.getStrProperty(RemoteDevice.DEVICEMODEL);
    }

    /**
     * 方法 ： getEnableEncrypt
     * 
     * @return String
     */
    public String getEnableEncrypt()
    {
        return mo.getStrProperty(RemoteDevice.ENABLEENCRYPT);
    }

    /**
     * 方法 ： setEnableEncrypt
     * @param enableEncrypt 传输数据是否启动加密
     */
    public void setEnableEncrypt(Boolean enableEncrypt)
    {
        mo.setProperty(RemoteDevice.ENABLEENCRYPT, enableEncrypt);
    }

    /**
     * 方法 ： getEncryptPassword
     * 
     * @return String
     */
    public String getEncryptPassword()
    {
        return mo.getStrProperty(RemoteDevice.ENCRYPTPASSWORD);
    }

    /**
     * 方法 ： setEncryptPassword
     * @param encryptPassword 传输数据加密的密码
     */
    public void setEncryptPassword(String encryptPassword)
    {
        mo.setProperty(RemoteDevice.ENCRYPTPASSWORD, encryptPassword);
    }

    /**
     * 方法 ： getConsultStatus
     * 
     * @return ConsultStatusE
     */
    public ConsultStatusE getConsultStatus()
    {
        return ConsultStatusE.valueOf(mo.getIntProperty(RemoteDevice.CONSULTSTATUS));
    }

    /**
     * 方法 ： getCompressStatus
     * 
     * @return Boolean
     */
    public Boolean getCompressStatus()
    {
        return mo.getBoolProperty(RemoteDevice.COMPRESSSTATUS);
    }

    /**
     * 方法 ： getVendor
     * 
     * @return String
     */
    public String getVendor()
    {
        return mo.getStrProperty(RemoteDevice.VENDOR);
    }

    /**
     * 方法 ： getFCLinkNum
     * 
     * @return Integer
     */
    public Integer getFCLinkNum()
    {
        return mo.getIntProperty(RemoteDevice.FCLINKNUM);
    }

    /**
     * 方法 ： getISCSILinkNum
     * 
     * @return Integer
     */
    public Integer getISCSILinkNum()
    {
        return mo.getIntProperty(RemoteDevice.ISCSILINKNUM);
    }

    /**
     * 方法 ： getIpLinkNum
     * 
     * @return Integer
     */
    public Integer getIpLinkNum()
    {
        return mo.getIntProperty(RemoteDevice.IPLINKNUM);
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
     * @return long 返回结果
     */
    protected long getCount()
    {
        return mo.getLongProperty(RemoteDevice.COUNT);
    }
}
