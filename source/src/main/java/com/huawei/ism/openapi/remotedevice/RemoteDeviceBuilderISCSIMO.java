package com.huawei.ism.openapi.remotedevice;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.ArrayTypeE;
import com.huawei.ism.openapi.common.keydeifines.TLV.RemoteDeviceBuilder;
import com.huawei.ism.openapi.common.model.MO;

public class RemoteDeviceBuilderISCSIMO
{
    private final MO mo;

    /**
     * RemoteDeviceBuilderFCMO
     * @param jObject JSONObject
     */
    public RemoteDeviceBuilderISCSIMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
        mo.setProperty(RemoteDeviceBuilder.ARRAYTYPE, ArrayTypeE.EPL_ARRAY_PRIVATE.getValue());
    }

    /**
     * RemoteDeviceBuilderFCMO
     */
    public RemoteDeviceBuilderISCSIMO()
    {
        this.mo = new MO();
        mo.setProperty(RemoteDeviceBuilder.ARRAYTYPE, ArrayTypeE.EPL_ARRAY_PRIVATE.getValue());
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
     * 对iSCSILinkLocalControlID进行赋值
     * @param iSCSILinkLocalControlID 方法参数：iSCSILinkLocalControlID
     */
    public void setISCSILinkLocalControlID(String iSCSILinkLocalControlID)
    {
        mo.setProperty(RemoteDeviceBuilder.ISCSILINKLOCALCONTROLID, iSCSILinkLocalControlID);
    }

    /**
     * 对iSCSILinkLocalPortID进行赋值
     * @param iSCSILinkLocalPortID 方法参数：iSCSILinkLocalPortID
     */
    public void setISCSILinkLocalPortID(String iSCSILinkLocalPortID)
    {
        mo.setProperty(RemoteDeviceBuilder.ISCSILINKLOCALPORTID, iSCSILinkLocalPortID);
    }

    /**
     * 对iSCSILinkRemoteIP进行赋值
     * @param iSCSILinkRemoteIP 方法参数：iSCSILinkRemoteIP
     */
    public void setISCSILinkRemoteIP(String iSCSILinkRemoteIP)
    {
        mo.setProperty(RemoteDeviceBuilder.ISCSILINKREMOTEIP, iSCSILinkRemoteIP);
    }

    /**
     * 方法 ： setRemoteUsername
     * @param remoteUsername 远端阵列用户名
     */
    public void setRemoteUsername(String remoteUsername)
    {
        mo.setProperty(RemoteDeviceBuilder.ISCSILINK_REMOTEUSERNAME, remoteUsername);
    }

    /**
     * 方法 ： setRemotePassword
     * @param remotePassword 远端阵列密码
     */
    public void setRemotePassword(String remotePassword)
    {
        mo.setProperty(RemoteDeviceBuilder.ISCSILINK_REMOTEPASSWORD, remotePassword);
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
