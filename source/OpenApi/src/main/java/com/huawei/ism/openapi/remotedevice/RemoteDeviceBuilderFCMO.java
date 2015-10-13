package com.huawei.ism.openapi.remotedevice;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.ArrayTypeE;
import com.huawei.ism.openapi.common.keydeifines.TLV.RemoteDeviceBuilder;
import com.huawei.ism.openapi.common.model.MO;

public class RemoteDeviceBuilderFCMO
{
    private final MO mo;

    /**
     * RemoteDeviceBuilderFCMO
     * @param jObject JSONObject
     */
    public RemoteDeviceBuilderFCMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
        mo.setProperty(RemoteDeviceBuilder.ARRAYTYPE, ArrayTypeE.EPL_ARRAY_PRIVATE.getValue());
    }

    /**
     * RemoteDeviceBuilderFCMO
     */
    public RemoteDeviceBuilderFCMO()
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
     * 方法 ： setFCLinkID
     * @param fcLinkID 链路ID
     */
    public void setFCLinkID(String fcLinkID)
    {
        mo.setProperty(RemoteDeviceBuilder.FCLINKID, fcLinkID);
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
