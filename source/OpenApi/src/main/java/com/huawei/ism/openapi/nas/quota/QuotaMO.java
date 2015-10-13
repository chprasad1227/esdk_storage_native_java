package com.huawei.ism.openapi.nas.quota;

import java.math.BigInteger;
import org.json.JSONObject;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.QuotaTypeE;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.QUOTA;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * Quota 数据对象
 * @author fWX183786
 * @version V100R001C10
 */
public class QuotaMO
{
    private final MO mo;

    /**
     * 构造函数
     */
    public QuotaMO()
    {
        mo = new MO();
        setType(MOType.QUOTA);
    }

    /**
     * 构造函数
     * @param jObject json数据
     */
    public QuotaMO(JSONObject jObject)
    {
        mo = new MO(jObject);
        setType(MOType.QUOTA);
    }

    /**
     * 设置Id
     * @param id id
     */
    public void setId(String id)
    {
        mo.setProperty(QUOTA.ID, id);
    }

    /**
     * 获取Id
     * @return Id
     */
    public String getId()
    {
        return mo.getStrProperty(QUOTA.ID);
    }

    /**
     * 设置父对象类型
     * @param parentType 父对象类型
     */
    public void setParentType(MOType parentType)
    {
        mo.setProperty(QUOTA.PARENTTYPE, parentType.getValue());
    }

    /**
     * 获取父对象类型
     * @return 父对象类型
     */
    public MOType getParentType()
    {
        return MOType.getType(mo.getIntProperty(QUOTA.PARENTTYPE));
    }

    /**
     * 设置父对象Id
     * @param parentId 父对象ID
     */
    public void setParentId(String parentId)
    {
        mo.setProperty(QUOTA.PARENTID, parentId);
    }

    /**
     * 获取父对象的Id
     * @return 父对象的Id
     */
    public String getParentId()
    {
        return mo.getStrProperty(QUOTA.PARENTID);
    }

    /**
     * 设置租户ID
     * @param tenancyId 租户ID
     */
    public void setTenancyId(Long tenancyId)
    {
        mo.setProperty(QUOTA.TENANCYID, tenancyId);
    }

    /**
     * 获取租户ID
     * @return 租户ID
     */
    public long getTenancyId()
    {
        return mo.getLongProperty(QUOTA.TENANCYID);
    }

    /**
     * 设置配额类型
     * @param qType 配额类型
     */
    public void setQuotaType(QuotaTypeE qType)
    {
        mo.setProperty(QUOTA.QUOTATYPE, qType.getValue());
    }

    /**
     * 获取配额类型
     * @return 配额类型
     */
    public QuotaTypeE getQuotaType()
    {
        return QuotaTypeE.valueOf(mo.getIntProperty(QUOTA.QUOTATYPE));
    }

    /**
     * 设置资源使用者名称
     * @param resUseName 资源使用者名称
     */
    public void setResUseName(String resUseName)
    {
        mo.setProperty(QUOTA.RESUSENAME, resUseName);
    }

    /**
     * 获取资源使用者名称
     * @return 资源使用者名称
     */
    public String getResUseName()
    {
        return mo.getStrProperty(QUOTA.RESUSENAME);
    }

    /**
     * 设置空间软配额
     * @param spaceSoftQuota 空间软配额
     */
    public void setSpaceSoftQuota(BigInteger spaceSoftQuota)
    {
        mo.setProperty(QUOTA.SPACESOFTQUOTA, spaceSoftQuota.toString());
    }

    /**
     * 获取空间软配额
     * @return 空间软配额
     */
    public BigInteger getSpaceSoftQuota()
    {
        return new BigInteger(mo.getStrProperty(QUOTA.SPACESOFTQUOTA));
    }

    /**
     * 设置空间硬配额
     * @param spaceHardQuota 空间硬配额
     */
    public void setSpaceHardQuota(BigInteger spaceHardQuota)
    {
        mo.setProperty(QUOTA.SPACEHARDQUOTA, spaceHardQuota.toString());
    }

    /**
     * 获取空间硬配额
     * @return 空间硬配额
     */
    public BigInteger getSpaceHardQuota()
    {
        return new BigInteger(mo.getStrProperty(QUOTA.SPACEHARDQUOTA));
    }

    /**
     * 设置空间阈值
     * @param spaceThreshold 空间阈值
     */
    public void setSpaceThreshold(BigInteger spaceThreshold)
    {
        mo.setProperty(QUOTA.SPACETHRESHOLD, spaceThreshold.toString());
    }

    /**
     * 获取空间阈值
     * @return 空间阈值
     */
    public BigInteger getSpaceThreshold()
    {
        return new BigInteger(mo.getStrProperty(QUOTA.SPACETHRESHOLD));
    }

    /**
     * 设置文件数软配额
     * @param fileSoftQuota 文件数软配额
     */
    public void setFileSoftQuota(BigInteger fileSoftQuota)
    {
        mo.setProperty(QUOTA.FILESOFTQUOTA, fileSoftQuota.toString());
    }

    /**
     * 获取文件数软配额
     * @return 文件数软配额
     */
    public BigInteger getFileSoftQuota()
    {
        return new BigInteger(mo.getStrProperty(QUOTA.FILESOFTQUOTA));
    }

    /**
     * 设置文件硬配额
     * @param fileHardQuota 文件硬配额
     */
    public void setFileHardQuota(BigInteger fileHardQuota)
    {
        mo.setProperty(QUOTA.FILEHARDQUOTA, fileHardQuota.toString());
    }

    /**
     * 获取文件硬配额
     * @return 文件硬配额
     */
    public BigInteger getFileHardQuota()
    {
        return new BigInteger(mo.getStrProperty(QUOTA.FILEHARDQUOTA));
    }

    /**
     * 设置是否report操作
     * @param isSearchReport true：report操作，false:查询配置信息
     */
//    public void setSearchReport(Boolean isSearchReport)
//    {
//        mo.setProperty(QUOTA.ISSEARCHREPORT, isSearchReport);
//    }

    /**
     * 获取是否report操作
     * @return 是否report操作
     */
//    public Boolean isSearchReport()
//    {
//        return mo.getBoolProperty(QUOTA.ISSEARCHREPORT);
//    }

    /**
     * 方法 ： getCount
     * 
     * @return long 返回结果
     */
    protected Long getCount()
    {
        return mo.getLongProperty(QUOTA.COUNT);
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
     * 设置类型
     * @param type 类型
     */
    private void setType(MOType type)
    {
        mo.setProperty(QUOTA.TYPE, type.getValue());
    }

	@Override
	public String toString() {
		return "QuotaMO [mo=" + mo + "]";
	}
}
