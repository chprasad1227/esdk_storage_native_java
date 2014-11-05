package com.huawei.ism.openapi.host;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.OSTypeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.TLV.HOST;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * 主机
 * @author : auto create
 * @version [版本号V001R010C00, 2011-12-14]
 */
public class HostMO
{
    private final MO mo;

    /**
     * <默认构造函数>
     * @param mo 方法参数：mo
     */
    public HostMO(MO mo)
    {
        this.mo = mo;
    }

    /**
     * 主机构造器
     */
    public HostMO()
    {
        this.mo = new MO();
    }

    /**
     * 主机构造器
     * @param jObject json数组
     */
    protected HostMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
    }

    /**
     * 方法 ： getMO
     * 
     * @return MO 返回结果
     */
    public MO getMO()
    {
        return this.mo;
    }
    
    public void setAssociateOBJType(MOType moType)
    {
        mo.setProperty(HOST.ASSOCIATEOBJTYPE, String.valueOf(moType.getValue()));
    }

    /**
     * 获取关联对象类型
     * @return 返回结果
     */
    public MOType getAssociateOBJType()
    {
        return MOType.valueOf(mo.getStrProperty(HOST.ASSOCIATEOBJTYPE));
    }

    /**
     * 设置关联对象ID
     * @param id 关联对象ID
     */
    public void setAssociateOBJId(String id)
    {
        mo.setProperty(HOST.ASSOCIATEOBJID, id);
    }

    /**
     * 获取关联对象ID
     * @return 返回结果
     */
    public String getAssociateOBJId()
    {
        return mo.getStrProperty(HOST.ASSOCIATEOBJID);
    }

    /**
     * 方法 ： getID
     * 
     * @return String 返回结果
     */
    public String getId()
    {
        return mo.getStrProperty(HOST.ID);
    }

    /**
     * 对id进行赋值
     * @param id 方法参数：id
     */
    public void setId(String id)
    {
        mo.setProperty(HOST.ID, id);
    }

    /**
     * 方法 ： getName
     * 
     * @return String 返回结果
     */
    public String getName()
    {
        return mo.getStrProperty(HOST.NAME);
    }

    /**
     * 对name进行赋值
     * @param name 方法参数：name
     */
    public void setName(String name)
    {
        mo.setProperty(HOST.NAME, name);
    }

    /**
     * 方法 ： getParentType
     * 
     * @return MOType 返回结果
     */
    public MOType getParentType()
    {
        return MOType.MAPPINGVIEW;
    }

    /**
     * 对parentType进行赋值
     * @param parentType 方法参数：parentType
     */
    public void setParentType(MOType parentType)
    {
        mo.setProperty(HOST.PARENTTYPE, parentType.getValue());
    }

    /**
     * 方法 ： getLocation
     * 
     * @return String 返回结果
     */
    public String getLocation()
    {
        return mo.getStrProperty(HOST.LOCATION);
    }

    /**
     * 对location进行赋值
     * @param location 方法参数：location
     */
    public void setLocation(String location)
    {
        mo.setProperty(HOST.LOCATION, location);
    }

    /**
     * 方法 ： getHealthStatus
     * 
     * @return HEALTH_STATUS_E 返回结果
     */
    public HealthStatusE getHealthStatus()
    {
        return HealthStatusE.valueOf(mo.getIntProperty(HOST.HEALTHSTATUS));
    }

    /**
     * 对healthStatus进行赋值
     * @param healthStatus 方法参数：healthStatus
     */
    public void setHealthStatus(HealthStatusE healthStatus)
    {
        mo.setProperty(HOST.HEALTHSTATUS,
            Integer.parseInt(String.valueOf(healthStatus.getValue())));
    }

    /**
     * 方法 ： getRunningStatus
     * 
     * @return RunningStatusE 返回结果
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE.valueOf(mo.getIntProperty(HOST.RUNNINGSTATUS));
    }

    /**
     * 对runningStatus进行赋值
     * @param runningStatus 方法参数：runningStatus
     */
    public void setRunningStatus(RunningStatusE runningStatus)
    {
        mo.setProperty(HOST.RUNNINGSTATUS,
            Integer.parseInt(String.valueOf(runningStatus.getValue())));
    }

    /**
     * 方法 ： getDescription
     * 
     * @return String 返回结果
     */
    public String getDescription()
    {
        return mo.getStrProperty(HOST.DESCRIPTION);
    }

    /**
     * 对description进行赋值
     * @param description 方法参数：description
     */
    public void setDescription(String description)
    {
        mo.setProperty(HOST.DESCRIPTION, description);
    }

    /**
     * 方法 ： getCount
     * 
     * @return long 返回结果
     */
    protected Long getCount()
    {
        return mo.getLongProperty(HOST.COUNT);
    }

    /**
     * 对count进行赋值
     * @param count 方法参数：count
     */
    protected void setCount(long count)
    {
        mo.setProperty(HOST.COUNT, count);
    }

    /**
     * 方法 ： getOperationSystem
     * 
     * @return OS_TYPE_E 返回结果
     */
    public OSTypeE getOperationSystem()
    {
        if (null == mo.getProperty(HOST.OPERATIONSYSTEM))
        {
            return null;
        }
        return OSTypeE.valueOf(mo.getIntProperty(HOST.OPERATIONSYSTEM));
    }

    /**
     * 对operationSystem进行赋值
     * @param operationSystem 方法参数：operationSystem
     */
    public void setOperationSystem(OSTypeE operationSystem)
    {
        mo.setProperty(HOST.OPERATIONSYSTEM,
            Integer.parseInt(String.valueOf(operationSystem.getValue())));
    }

    /**
     * 方法 ： getIP
     * 
     * @return String 返回结果
     */
    public String getIP()
    {
        return mo.getStrProperty(HOST.IP);
    }

    /**
     * 对ip进行赋值
     * @param ip 方法参数：ip
     */
    public void setIP(String ip)
    {
        mo.setProperty(HOST.IP, ip);
    }

    /**
     * 方法 ： 获取主机是否加入主机组信息
     * 
     * @return boolean 返回结果
     */
    public Boolean getIsAdd2HostGroup()
    {
        return mo.getBoolProperty(HOST.ISADD2HOSTGROUP);
    }

    /**
     * 设置：主机是否加入主机组
     * @param isAdd2HostGroup 主机是否加入主机组
     */
    public void setIsAdd2HostGroup(Boolean isAdd2HostGroup)
    {
        mo.setProperty(HOST.ISADD2HOSTGROUP, isAdd2HostGroup);
    }
}
