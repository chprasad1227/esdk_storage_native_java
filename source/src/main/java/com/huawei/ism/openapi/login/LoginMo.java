package com.huawei.ism.openapi.login;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.TLV.LOGININFO;
import com.huawei.ism.openapi.common.model.MO;

/**
 * 登录的数据对象
 * @author fWX183786
 * @version V100R001C10
 */
public class LoginMo
{
    private final MO mo;

    /**
     * 构造函数
     * @param jObject json数据
     */
    public LoginMo(JSONObject jObject)
    {
        this.mo = new MO(jObject);
    }

    /**
     * 获取设备ID
     * @return 设备ID
     */
    public String getDeviceId()
    {
        return mo.getStrProperty(LOGININFO.DEVICEID);
    }

    /**
     * 获取登录的iBaseToken头
     * @return http iBaseToken
     */
    public String getBaseToken()
    {
        return mo.getStrProperty(LOGININFO.BASETOKEN);
    }
}
