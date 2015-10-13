package com.huawei.ism.openapi.disk;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.DiskFormE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.DiskLogicTypeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.DiskSsdIfTypeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.DiskTypeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.HealthStatusE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RunningStatusE;
import com.huawei.ism.openapi.common.keydeifines.TLV.DISK;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * 硬盘MO
 * @author z00231026
 * @version [版本号V001R010C10]
 */
public class DiskMO
{
    private final MO mo;

    /**
     * DiskMO
     * @param jObject JSONObject
     */
    public DiskMO(JSONObject jObject)
    {
        this.mo = new MO(jObject);
        mo.setProperty(DISK.PARENTTYPE, MOType.ENCLOSURE.getValue());
        mo.setProperty(DISK.TYPE, MOType.DISK.getValue());
    }

    /**
     * DiskMO
     */
    public DiskMO()
    {
        this.mo = new MO();
        mo.setProperty(DISK.PARENTTYPE, MOType.ENCLOSURE.getValue());
        mo.setProperty(DISK.TYPE, MOType.DISK.getValue());
    }

    /**
     * 方法 ： getID
     * @return String 返回结果
     */
    public String getId()
    {
        return mo.getStrProperty(DISK.ID);
    }

    /**
     * 方法 ： getLocation
     * @return String 返回结果
     */
    public String getLocation()
    {
        return mo.getStrProperty(DISK.LOCATION);
    }

    /**
     * 方法 ： getHealthStatus
     * @return HEALTH_STATUS_E 返回结果
     */
    public HealthStatusE getHealthStatus()
    {
        return HealthStatusE.valueOf(mo.getIntProperty(DISK.HEALTHSTATUS));
    }

    /**
     * 方法 ： setHealthStatus
     * @param healthStatusE 健康状态
     */
    public void setHealthStatus(HealthStatusE healthStatusE)
    {
        mo.setProperty(DISK.HEALTHSTATUS, Integer.parseInt(String.valueOf(healthStatusE.getValue())));
    }

    /**
     * 方法 ： getRunningStatus
     * @return RUNNING_STATUS_E 返回结果
     */
    public RunningStatusE getRunningStatus()
    {
        return RunningStatusE.valueOf(mo.getIntProperty(DISK.RUNNINGSTATUS));
    }

    /**
     * 方法 ： setRunningStatus
     * @param runningStatusE 运行状态
     */
    public void setRunningStatus(RunningStatusE runningStatusE)
    {
        mo.setProperty(DISK.RUNNINGSTATUS, Integer.parseInt(String.valueOf(runningStatusE.getValue())));
    }

    /**
     * 方法 ： getDiskType
     * @return DiskTypeE 返回结果
     */
    public DiskTypeE getDiskType()
    {
        return DiskTypeE.valueOf(mo.getIntProperty(DISK.DISKTYPE));
    }

    /**
     * 方法 ： getSectors
     * @return Long 返回结果
     */
    public Long getSectors()
    {
        return mo.getLongProperty(DISK.SECTORS);
    }

    /**
     * 方法 ： getBandwidth
     * @return Integer 返回结果
     */
    public Integer getBandwidth()
    {
        return mo.getIntProperty(DISK.BANDWIDTH);
    }

    /**
     * 方法 ： getSectorSize
     * @return Integer 返回结果
     */
    public Integer getSectorSize()
    {
        return mo.getIntProperty(DISK.SECTORSIZE);
    }

    /**
     * 方法 ： getSpeedRPM
     * @return Integer 返回结果
     */
    public Integer getSpeedRPM()
    {
        return mo.getIntProperty(DISK.SPEEDRPM);
    }

    /**
     * 方法 ： getTemperature
     * @return Integer 返回结果
     */
    public Integer getTemperature()
    {
        return mo.getIntProperty(DISK.TEMPERATURE);
    }

    /**
     * 方法 ： getModel
     * @return String 返回结果
     */
    public String getModel()
    {
        return mo.getStrProperty(DISK.MODEL);
    }

    /**
     * 方法 ： getFirmwareVer
     * @return String 返回结果
     */
    public String getFirmwareVer()
    {
        return mo.getStrProperty(DISK.FIRMWAREVER);
    }

    /**
     * 方法 ： getManufacturer
     * @return String 返回结果
     */
    public String getManufacturer()
    {
        return mo.getStrProperty(DISK.MANUFACTURER);
    }

    /**
     * 方法 ： getSerialNumber
     * @return String 返回结果
     */
    public String getSerialNumber()
    {
        return mo.getStrProperty(DISK.SERIALNUMBER);
    }

    /**
     * 方法 ： getlogicType
     * @return DiskLogicTypeE 返回结果
     */
    public DiskLogicTypeE getlogicType()
    {
        return DiskLogicTypeE.valueOf(mo.getIntProperty(DISK.LOGICTYPE));
    }

    /**
     * 方法 ： setlogicType
     * @param diskLogicTypeE 逻辑类型
     */
    public void setlogicType(DiskLogicTypeE diskLogicTypeE)
    {
        mo.setProperty(DISK.LOGICTYPE, Integer.parseInt(String.valueOf(diskLogicTypeE.getValue())));
    }

    /**
     * 方法 ： getPoolID
     * @return String 返回结果
     */
    public String getPoolId()
    {
        return mo.getStrProperty(DISK.POOLID);
    }

    /**
     * 方法 ： getPoolName
     * @return String 返回结果
     */
    public String getPoolName()
    {
        return mo.getStrProperty(DISK.POOLNAME);
    }

    /**
     * 方法 ： isCofferDisk
     * @return Boolean 返回结果
     */
    public Boolean isCofferDisk()
    {
        return mo.getBoolProperty(DISK.ISCOFFERDISK);
    }

    /**
     * 方法 ： getRunTime
     * @return Integer 返回结果
     */
    public Integer getRunTime()
    {
        return mo.getIntProperty(DISK.RUNTIME);
    }

    /**
     * 方法 ： getProgress
     * @return Integer 返回结果
     */
    public Integer getProgress()
    {
        return mo.getIntProperty(DISK.PROGRESS);
    }

    /**
     * 方法 ： getCapacityUsage
     * @return Integer 返回结果
     */
    public Integer getCapacityUsage()
    {
        return mo.getIntProperty(DISK.CAPACITYUSAGE);
    }

    /**
     * 方法 ： getMultiPath
     * @return String[] 返回结果
     */
    public String[] getMultiPath()
    {
        return mo.getStrArrayProperty(DISK.MULTIPATH);
    }

    /**
     * 方法 ： getDiskIFType
     * @return DiskSsdIfTypeE 返回结果
     */
    public DiskSsdIfTypeE getDiskIFType()
    {
        return DiskSsdIfTypeE.valueOf(mo.getIntProperty(DISK.DISKIFTYPE));
    }

    /**
     * 方法 ： getDiskForm
     * @return DiskFormE 返回结果
     */
    public DiskFormE getDiskForm()
    {
        return DiskFormE.valueOf(mo.getIntProperty(DISK.DISKFORM));
    }

    /**
     * 方法 ： setPoolId
     * @param poolId DISK.POOLID
     */
    public void setPoolId(String poolId)
    {
        mo.setProperty(DISK.POOLID, poolId);
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
        return mo.getLongProperty(DISK.COUNT);
    }
}
