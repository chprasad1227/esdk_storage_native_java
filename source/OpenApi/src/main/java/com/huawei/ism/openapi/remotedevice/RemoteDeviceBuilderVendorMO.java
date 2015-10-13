package com.huawei.ism.openapi.remotedevice;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.ArrayTypeE;
import com.huawei.ism.openapi.common.keydeifines.TLV.RemoteDeviceBuilder;
import com.huawei.ism.openapi.common.model.MO;

public class RemoteDeviceBuilderVendorMO
{
    private final MO mo;

    /**
     * RemoteDeviceBuilderFCMO
     * @param jObject JSONObject
     */
    public RemoteDeviceBuilderVendorMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
        mo.setProperty(RemoteDeviceBuilder.ARRAYTYPE, ArrayTypeE.EPL_ARRAY_3RD.getValue());
    }

    /**
     * RemoteDeviceBuilderFCMO
     */
    public RemoteDeviceBuilderVendorMO()
    {
        this.mo = new MO();
        mo.setProperty(RemoteDeviceBuilder.ARRAYTYPE, ArrayTypeE.EPL_ARRAY_3RD.getValue());
    }

    /**
     * 对description进行赋值
     * @param description 方法参数：description
     */
    public void setDescription(String description)
    {
        mo.setProperty(RemoteDeviceBuilder.DESCRIPTION, description);
    }

    /**
     * 对localControlID进行赋值
     * @param localControlID 方法参数：localControlID
     */
    public void setLocalControlID(String localControlID)
    {
        mo.setProperty(RemoteDeviceBuilder.LOCALCONTROLID, localControlID);
    }

    /**
     * 对enableChap进行赋值
     * @param enableChap 方法参数：enableChap
     */
    public void setEnableChap(Boolean enableChap)
    {
        mo.setProperty(RemoteDeviceBuilder.ENABLECHAP, enableChap);
    }

    /**
     * 对localPortID进行赋值
     * @param localPortID 方法参数：localPortID
     */
    public void setLocalPortID(String localPortID)
    {
        mo.setProperty(RemoteDeviceBuilder.LOCALPORTID, localPortID);
    }

    /**
     * 对remoteIP进行赋值
     * @param remoteIP 方法参数：remoteIP
     */
    public void setRemoteIP(String remoteIP)
    {
        mo.setProperty(RemoteDeviceBuilder.REMOTEIP, remoteIP);
    }

    /**
     * 方法 ： getMO
     * @return MO 返回结果
     */
    protected MO getMO()
    {
        return this.mo;
    }
}
