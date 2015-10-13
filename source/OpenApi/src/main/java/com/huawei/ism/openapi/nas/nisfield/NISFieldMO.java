package com.huawei.ism.openapi.nas.nisfield;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.TLVNAS.NISFIELD;
import com.huawei.ism.openapi.common.model.MO;
/**
 * NIS域对象
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class NISFieldMO
{

    private final MO mo;

    /**
     * NIS域构造函数
     */
    public NISFieldMO()
    {
        this.mo = new MO();
    }

    /**
     * NIS域构造函数
     * @param mo NIS域对象
     */
    public NISFieldMO(MO mo)
    {
        this.mo = mo;
    }

    /**
     * NIS域构造函数
     * @param jObject rest请求消息体
     */
    public NISFieldMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
    }

    /**
     * 获取MO
     * @return mo
     */
    public MO getMO()
    {
        return this.mo;
    }

    /**
     * 获取租户ID(0表示全局）
     * @return 租户ID
     */
    public Long getTenancyId()
    {
        return mo.getLongProperty(NISFIELD.TENANCYID);
    }

    /**
     * 设置租户ID
     * @param tenancyId 租户ID
     */
    public void setTenancyId(Long tenancyId)
    {
        mo.setProperty(NISFIELD.TENANCYID, tenancyId);
    }

    /**
     * 获取域的全域名称
     * @return 域的全域名称
     */
    public String getNisDomain()
    {
        return mo.getStrProperty(NISFIELD.NISDOMAIN);
    }

    /**
     * 设置域的全域名称
     * @param nisDomain 域的全域名称
     */
    public void setNisDomain(String nisDomain)
    {
        mo.setProperty(NISFIELD.NISDOMAIN, nisDomain);
    }

    /**
     * 获取服务器IP地址，支持配3个IP
     * @return 服务器IP地址，支持配3个IP
     */
    public String[] getNisServerAddr()
    {
        return mo.getStrArrayProperty(NISFIELD.NISSERVERADDR);
    }

    /**
     * 设置服务器IP地址，支持配3个IP
     * @param nisServerAddr 服务器IP地址
     */
    public void setNisServerAddr(String[] nisServerAddr)
    {
        mo.setProperty(NISFIELD.NISSERVERADDR, nisServerAddr);
    }
}
