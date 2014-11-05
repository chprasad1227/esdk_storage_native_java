package com.huawei.ism.openapi.common.keydeifines;

/**
 * 文 件 名 :TLV.java 版 本 号 :初稿 生成日期 :2011-09-23 文件描述 :存储管理接口规范 V2.0.xls
 * 
 * @author V1R10
 * @version [版本号V001R010C00, 2011-12-14]
 */
public final class TLV
{
    /**
     * 上报告警
     * 
     * 详细： 1 命令字：CMO_ALARM_INFO_E 2 命令类型：上报告警 3 命令参数：CMO_ALARM_INFO_E
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class CMOAlarmInfoE
    {
        /** 公共属性CMO_ALARM_TYPE */
        public static final String CMO_ALARM_TYPE = "type"; // 此Tag同时有两种定义0:
                                                            // 故障1: 事件2:
                                                            // 恢复3：操作日志4：运行

        /** 公共属性CMO_ALARM_ID */
        public static final String CMO_ALARM_ID = "eventID"; // 此Tag同时有两种定义

        /** 公共属性CMO_ALARM_LEVEL */
        public static final String CMO_ALARM_LEVEL = "level"; // 此Tag同时有两种定义2:
                                                              // 提示3: 警告4: 次要5:
                                                              // 重要6: 紧急7: 致命8:
                                                              // 清除

        /** 公共属性CMO_ALARM_SEQUENCE */
        public static final String CMO_ALARM_SEQUENCE = "sequence"; // 此Tag同时有两种定义0~4294967295

        /** 公共属性CMO_ALARM_TIME */
        public static final String CMO_ALARM_STARTTIME = "startTime"; // 此Tag同时有两种定义0~4294967295

        /** 公共属性CMO_ALARM_CLEAR_TIME */
        public static final String CMO_ALARM_CLEAR_TIME = "clearTime"; // 0~4294967295

        /** 公共属性CMO_ALARM_RECOVERY_TIME */
        public static final String CMO_ALARM_RECOVERY_TIME = "recoverTime"; // 0~4294967295

        /** 公共属性CMO_ALARM_PARMETER */
        public static final String CMO_ALARM_PARMETER = "eventParam";

        /** 公共属性CMO_ALARM_CONFIRMTIME */
        public static final String CMO_ALARM_CONFIRMTIME = "confirmTime";

        /** 公共属性CMO_ALARM_DETAIL */
        public static final String CMO_ALARM_DETAIL = "detail";

        /** 公共属性CMO_ALARM_SUGGESTION */
        public static final String CMO_ALARM_SUGGESTION = "suggestion";

        /** 公共属性CMO_ALARM_DESCRIPTION */
        public static final String CMO_ALARM_DESCRIPTION = "description";

        /** 公共属性CMO_ALARM_NAME */
        public static final String CMO_ALARM_NAME = "name";

        /** 公共属性CMO_ALARM_COUNT */
        public static final String CMO_ALARM_COUNT = "COUNT";

    }

    /**
     * 性能统计
     * 
     * 详细： 1 命令字：PERFORMANCE_STATISTIC 2 命令类型：性能统计 3 命令参数：PERFORMANCE_STATISTIC
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class PerformanceStatistic
    {
        // 唯一标识该对象。字串表示方法：组件类型ID:ID1ID1为组建的唯一标识，由32位的整数组成，格式如下图
        /** 公共属性CMO_STATISTIC_UUID */
        public static final String CMO_STATISTIC_UUID = "CMO_STATISTIC_UUID";

        /** 公共属性CMO_STATISTIC_DATA_ID */
        public static final String CMO_STATISTIC_DATA_ID = "CMO_STATISTIC_DATA_ID"; // 0~4294967295

        /** 公共属性CMO_STATISTIC_TIME_SPAN */
        public static final String CMO_STATISTIC_TIME_SPAN = "CMO_STATISTIC_TIME_SPAN"; // 0~4294967295

        /** 公共属性CMO_STATISTIC_DATA */
        public static final String CMO_STATISTIC_DATA = "CMO_STATISTIC_DATA"; // 0~4294967295

        /** 公共属性CMO_STATISTIC_TIMESTAMP */
        public static final String CMO_STATISTIC_TIMESTAMP = "CMO_STATISTIC_TIMESTAMP"; // 0~4294967295

        /** 是否无需启动开关直接查询性能数据，默认为false,如果下发true,则可以直接获取到数据 */
        public static final String CMO_STATISTIC_SKIP_SWITCH = "CMO_STATISTIC_SKIP_SWITCH"; // 0~4294967295
    }

    /**
     * 性能统计开关
     * 
     * 详细： 1 命令字：PERFORMANCE_STATISTIC_SWITCH 2 命令类型：性能统计开关 3 命令参数：PERFORMANCE_STATISTIC_SWITCH
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class PerformanceStatisticSwitch
    {
        /** 公共属性CMO_PERFORMANCE_SWITCH */
        public static final String CMO_PERFORMANCE_SWITCH = "CMO_PERFORMANCE_SWITCH"; // 0：关
                                                                                      // 1：开

        /** 公共属性CMO_PERFORMANCE_BEGIN_TIME */
        public static final String CMO_PERFORMANCE_BEGIN_TIME = "CMO_PERFORMANCE_BEGIN_TIME";

        /** 公共属性CMO_PERFORMANCE_END_TIME */
        public static final String CMO_PERFORMANCE_END_TIME = "CMO_PERFORMANCE_END_TIME";

    }

    /**
     * 性能统计策略
     * 
     * 详细： 1 命令字：PEFORMANCE_STATISTIC_STRATEGY 2 命令类型：性能统计策略 3 命令参数：PEFORMANCE_STATISTIC_STRATEGY
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class PeformanceStatisticStrategy
    {
        /** 公共属性CMO_STATISTIC_INTERVAL */
        public static final String CMO_STATISTIC_INTERVAL = "CMO_STATISTIC_INTERVAL"; // 单位秒，60~3600

        /** 公共属性CMO_STATISTIC_ARCHIVE_SWITCH */
        public static final String CMO_STATISTIC_ARCHIVE_SWITCH = "CMO_STATISTIC_ARCHIVE_SWITCH"; // 0：关
                                                                                                  // 1：开

        /** 公共属性CMO_STATISTIC_ARCHIVE_TIME */
        public static final String CMO_STATISTIC_ARCHIVE_TIME = "CMO_STATISTIC_ARCHIVE_TIME"; // 单位秒，60~3600

        /** 公共属性CMO_STATISTIC_AUTO_STOP */
        public static final String CMO_STATISTIC_AUTO_STOP = "CMO_STATISTIC_AUTO_STOP"; // 0：关
                                                                                        // 1：开

        /** 公共属性CMO_STATISTIC_MAX_TIME */
        public static final String CMO_STATISTIC_MAX_TIME = "CMO_STATISTIC_MAX_TIME"; // 单位天1~420

    }

    /**
     * 系统时区
     * 
     * 详细： 1 命令字：SYSTEM_TIMEZONE 2 命令类型：系统时区 3 命令参数：SYSTEM_TIMEZONE
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class SystemTimezone
    {
        /** 公共属性CMO_SYS_TIME_ZONE_NAME */
        public static final String CMO_SYS_TIME_ZONE_NAME = "CMO_SYS_TIME_ZONE_NAME";

        /** 公共属性CMO_SYS_TIME_ZONE */
        public static final String CMO_SYS_TIME_ZONE = "CMO_SYS_TIME_ZONE";

        /** 公共属性CMO_SYS_TIME_ZONE_NAME_STYLE */
        public static final String CMO_SYS_TIME_ZONE_NAME_STYLE = "CMO_SYS_TIME_ZONE_NAME_STYLE"; // 0-
                                                                                                  // 短名称（三字母形式）1-
                                                                                                  // 长名称

        /** 公共属性CMO_SYS_TIME_ZONE_USE_DST */
        public static final String CMO_SYS_TIME_ZONE_USE_DST = "CMO_SYS_TIME_ZONE_USE_DST"; // 0-未使用
                                                                                            // 1-使用

    }

    /**
     * 系统本地时间
     * 
     * 详细： 1 命令字：SYSTEM_UTC_TIME 2 命令类型：系统本地时间 3 命令参数：SYSTEM_UTC_TIME
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class SystemUTCTime
    {
        /** 公共属性CMO_SYS_UTC_TIME */
        public static final String CMO_SYS_UTC_TIME = "CMO_SYS_UTC_TIME";

    }

    /**
     * 夏令时配置
     * 
     * 详细： 1 命令字：SYSTEM_DST_CONFIG 2 命令类型：夏令时配置 3 命令参数：SYSTEM_DST_CONFIG
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class SystemDSTConfig
    {
        // 例如：America/Los_Angeles
        /** 公共属性CMO_SYS_DST_CONF_TIME_ZONE_NAME */
        public static final String CMO_SYS_DST_CONF_TIME_ZONE_NAME = "CMO_SYS_DST_CONF_TIME_ZONE_NAME";

        /** 公共属性CMO_SYS_DST_CONF_DATE_TIME_BEGIN */
        public static final String CMO_SYS_DST_CONF_DATE_TIME_BEGIN = "CMO_SYS_DST_CONF_DATE_TIME_BEGIN";

        /** 公共属性CMO_SYS_DST_CONF_DATE_TIME_END */
        public static final String CMO_SYS_DST_CONF_DATE_TIME_END = "CMO_SYS_DST_CONF_DATE_TIME_END";

        /** 公共属性CMO_SYS_DST_CONF_ADJUST_TIME */
        public static final String CMO_SYS_DST_CONF_ADJUST_TIME = "CMO_SYS_DST_CONF_ADJUST_TIME"; // 单位：分钟
                                                                                                  // 范围：0-120分

        /** 公共属性CMO_SYS_DST_CONF_MODE */
        public static final String CMO_SYS_DST_CONF_MODE = "CMO_SYS_DST_CONF_MODE"; // 0-日期方式
                                                                                    // 1-星期方式

    }

    /**
     * 系统信息
     * 
     * 详细： 1 命令字：SYSTEM 2 命令类型：系统信息 3 命令参数：SYSTEM
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class SYSTEM extends TLVMOMsg
    {
        /** 公共属性PRODUCTMODE */
        public static final String PRODUCTMODE = "PRODUCTMODE"; // 产品型号，按照目前产品型号的统一定义

        /** 公共属性PRODUCTVERSION */
        public static final String PRODUCTVERSION = "PRODUCTVERSION"; // 产品版本号

        /** 公共属性DOMAINNAME */
        public static final String DOMAINNAME = "DOMAINNAME";

        /** 公共属性HIGHWATERLEVEL */
        public static final String HIGHWATERLEVEL = "HIGHWATERLEVEL"; // 系统的高水位

        /** 公共属性LOWWATERLEVEL */
        public static final String LOWWATERLEVEL = "LOWWATERLEVEL"; // 系统的高水位

        /** 公共属性CACHEWRITEQUOTA */
        public static final String CACHEWRITEQUOTA = "CACHEWRITEQUOTA"; // Cache写配额仅体现于CLI的研发视图下，不对外显示

        /** 公共属性MEMBERDISKSCAPACITY */
        public static final String MEMBERDISKSCAPACITY = "MEMBERDISKSCAPACITY"; // 所有加入存储池的成员盘裸容量之和

        /** 公共属性HOTSPAREDISKSCAPACITY */
        public static final String HOTSPAREDISKSCAPACITY = "HOTSPAREDISKSCAPACITY"; // 所有热备盘裸容量之和，没有则为0

        /** 公共属性FREEDISKSCAPACITY */
        public static final String FREEDISKSCAPACITY = "FREEDISKSCAPACITY"; // 所有空闲盘裸容量之和，没有则为0

        /** 公共属性UNAVAILABLEDISKSCAPACITY */
        public static final String UNAVAILABLEDISKSCAPACITY = "UNAVAILABLEDISKSCAPACITY"; // 所有不可用盘裸容量之和，没有则为0

        /** 公共属性STORAGEPOOLRAWCAPACITY */
        public static final String STORAGEPOOLRAWCAPACITY = "STORAGEPOOLRAWCAPACITY"; // 所有存储池中盘总的裸容量

        /** 公共属性STORAGEPOOLCAPACITY */
        public static final String STORAGEPOOLCAPACITY = "STORAGEPOOLCAPACITY"; // 所有存储池做完RAID后用户可用容量

        /** 公共属性STORAGEPOOLUSEDCAPACITY */
        public static final String STORAGEPOOLUSEDCAPACITY = "STORAGEPOOLUSEDCAPACITY"; // 所有存储池中已经分配了用户数据的容量（RAID后）

        /** 公共属性STORAGEPOOLFREECAPACITY */
        public static final String STORAGEPOOLFREECAPACITY = "STORAGEPOOLFREECAPACITY"; // 所有存储池中已经还未分配的容量（RAID后）

        // 所有存储池中预留的热备空间容量（RAID后）
        /** 公共属性STORAGEPOOLHOSTSPARECAPACITY */
        public static final String STORAGEPOOLHOSTSPARECAPACITY = "STORAGEPOOLHOSTSPARECAPACITY";

        /** 公共属性THICKLUNSALLOCATECAPACITY */
        public static final String THICKLUNSALLOCATECAPACITY = "THICKLUNSALLOCATECAPACITY"; // 所有普通LUN已分配的总容量

        /** 公共属性THICKLUNSUSEDCAPACITY */
        public static final String THICKLUNSUSEDCAPACITY = "THICKLUNSUSEDCAPACITY"; // 所有普通LUN已写数据总量

        /** 公共属性THINLUNSMAXCAPACITY */
        public static final String THINLUNSMAXCAPACITY = "THINLUNSMAXCAPACITY"; // 所有THIN
                                                                                // LUN对于主机的可视总容量

        /** 公共属性THINLUNSALLOCATECAPACITY */
        public static final String THINLUNSALLOCATECAPACITY = "THINLUNSALLOCATECAPACITY"; // 所有THIN
                                                                                          // LUN已分配的总容量

        /** 公共属性THINLUNSUSEDCAPACITY */
        public static final String THINLUNSUSEDCAPACITY = "THINLUNSUSEDCAPACITY"; // 所有THIN
                                                                                  // LUN已写数据总量

        /** 公共属性SECTORSIZE */
        public static final String SECTORSIZE = "SECTORSIZE";

        /** 公共属性VASA_SUPPORT_BLOCK */
        public static final String VASA_SUPPORT_BLOCK = "VASA_SUPPORT_BLOCK"; // 逗号隔开的字符串，取值范围：FCFCOEISCSIOthers

        /** 公共属性VASA_SUPPORT_FILESYSTEM */
        public static final String VASA_SUPPORT_FILESYSTEM = "VASA_SUPPORT_FILESYSTEM"; // 逗号隔开的字符串

        /** 公共属性VASA_ALTERNATE_NAME */
        public static final String VASA_ALTERNATE_NAME = "VASA_ALTERNATE_NAME"; // 逗号隔开的字符串

        /** 公共属性VASA_SUPPORT_PROFILE */
        public static final String VASA_SUPPORT_PROFILE = "VASA_SUPPORT_PROFILE";

        // 逗号隔开的字符串,取值范围：BlockDeviceProfile，FileSystemProfile，CapabilityProfile

        /** 公共属性wwn */
        public static final String WWN = "wwn";
    }

    /**
     * 控制器
     * 
     * 详细： 1 命令字：CONTROLLER 2 命令类型：控制器 3 命令参数：CONTROLLER
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class CONTROLLER extends TLVMOMsg
    {
        /** 公共属性SOFTVER */
        public static final String SOFTVER = "SOFTVER"; // 控制器软件版本

        /** 公共属性TEMPERATURE */
        public static final String TEMPERATURE = "TEMPERATURE";

        /** 公共属性ISMASTER */
        public static final String ISMASTER = "ISMASTER"; // 高级属性,工程师以上级别显示

        /** 公共属性ELABEL */
        public static final String ELABEL = "ELABEL"; // 高级属性

        /** 公共属性PCBVER */
        public static final String PCBVER = "PCBVER"; // 高级属性

        /** 公共属性SESVER */
        public static final String SESVER = "SESVER"; // 高级属性

        /** 公共属性BMCVER */
        public static final String BMCVER = "BMCVER"; // 高级属性

        /** 公共属性LOGICVER */
        public static final String LOGICVER = "LOGICVER"; // 高级属性

        /** 公共属性BIOSVER */
        public static final String BIOSVER = "BIOSVER"; // 高级属性

        /** 公共属性ALLTEMPERATURE */
        public static final String ALLTEMPERATURE = "ALLTEMPERATURE"; // 高级属性,工程师以上级别显示；一个控制器上多个温度监控点上温度

        /** 单个控制器的内存大小，在界面上体现为Cache大小 */
        public static final String MEMORYSIZE = "MEMORYSIZE";

        /** CPU信息 */
        public static final String CPUINFO = "CPUINFO";

        /** 公共属性CPUINFO */
        public static final String ROLE = "ROLE"; // 主备控

        /** cpu使用率 */
        public static final String CPUUSAGE = "CPUUSAGE";

        /** 内存使用率 */
        public static final String MEMORYUSAGE = "MEMORYUSAGE";

        /** 电压值 */
        public static final String VOLTAGE = "VOLTAGE";

        /** 定位灯 */
        public static final String LIGHT_STATUS = "LIGHT_STATUS";

        /** 脏页面的占用率 */
        public static final String DIRTYDATARATE = "DIRTYDATARATE";
    }

    /**
     * 硬盘
     * 
     * 详细： 1 命令字：DISK 2 命令类型：硬盘 3 命令参数：DISK
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class DISK extends TLVMOMsg
    {
        /** 公共属性DISKTYPE */
        public static final String DISKTYPE = "DISKTYPE";

        /** 公共属性SECTORS */
        public static final String SECTORS = "SECTORS"; // 扇区数量，扇区大小固定使用512字节表示，增大容量表示空间

        /** 公共属性BANDWIDTH */
        public static final String BANDWIDTH = "BANDWIDTH"; // 以Mbps为单位，以1000为M->G的换算

        /** 公共属性SECTORSIZE */
        public static final String SECTORSIZE = "SECTORSIZE";

        /** 公共属性SPEEDRPM */
        public static final String SPEEDRPM = "SPEEDRPM";

        /** 公共属性TEMPERATURE */
        public static final String TEMPERATURE = "TEMPERATURE";

        /** 公共属性MODEL */
        public static final String MODEL = "MODEL";

        /** 公共属性FIRMWAREVER */
        public static final String FIRMWAREVER = "FIRMWAREVER";

        /** 公共属性MANUFACTURER */
        public static final String MANUFACTURER = "MANUFACTURER";

        /** 公共属性SERIALNUMBER */
        public static final String SERIALNUMBER = "SERIALNUMBER";

        /** 公共属性LIGHTSTATUS */
        public static final String LIGHTSTATUS = "LIGHTSTATUS"; // 灯状态(不在盘属性中显示)

        /** 公共属性LOGICTYPE */
        public static final String LOGICTYPE = "LOGICTYPE";

        /** 公共属性POOLID */
        public static final String POOLID = "POOLID";

        /** 公共属性POOLNAME */
        public static final String POOLNAME = "POOLNAME";

        /** 公共属性POOLTIERID */
        public static final String POOLTIERID = "POOLTIERID";

        /** 公共属性ISCOFFERDISK */
        public static final String ISCOFFERDISK = "ISCOFFERDISK";

        /** 公共属性RUNTIME */
        public static final String RUNTIME = "RUNTIME";

        /** 公共属性PROGRESS */
        public static final String PROGRESS = "PROGRESS";

        /** 公共属性NCQSWITCH */
        public static final String NCQSWITCH = "NCQSWITCH";

        /** 公共属性UNPLUG */
        public static final String UNPLUG = "UNPLUG";

        /** 公共属性WRITECACHESWITCH */
        public static final String WRITECACHESWITCH = "WRITECACHESWITCH";

        /** 公共属性PRECOPYSWITCH */
        public static final String PRECOPYSWITCH = "PRECOPYSWITCH";

        /** 公共属性STARTLBA */
        public static final String STARTLBA = "STARTLBA";

        /** 公共属性LEN */
        public static final String LEN = "LEN";

        /** 公共属性BSTTYPE */
        public static final String BSTTYPE = "BSTTYPE";

        // begin h90005710 同步问题单 T12R-4130 新增SmartMotion需求——无用例
        /** 公共属性CAPACITYUSAGE */
        public static final String CAPACITYUSAGE = "CAPACITYUSAGE"; // 盘已使用容量占整个硬盘的容量百分比

        /** 公共属性MULTIPATH */
        public static final String MULTIPATH = "MULTIPATH"; // 盘的路径信息：A0控制器id|B0控制器id，A1控制器id|B1控制器id，…

        // begin h90005710 同步问题单 T12R-4130 新增SmartMotion需求——无用例
        /** 公共属性HEALTHMARK */
        public static final String HEALTHMARK = "HEALTHMARK"; // 系统给硬盘打的分数

        /** 公共属性INVALIDTIME */
        public static final String INVALIDTIME = "INVALIDTIME";

        /** 公共属性DISKIFTYPE */
        public static final String DISKIFTYPE = "DISKIFTYPE";

        /** 公共属性DISKFORM */
        public static final String DISKFORM = "DISKFORM";

        /** 公共属性DISKPORTADDR */
        public static final String DISKPORTADDR = "DISKPORTADDR";

    }

    /**
     * FC 端口
     * 
     * 详细： 1 命令字：FC_PORT 2 命令类型：FC 端口 3 命令参数：FC_PORT
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class FCPort extends TLVMOMsg
    {
        /** 公共属性LOGICTYPE */
        public static final String LOGICTYPE = "LOGICTYPE";

        /** 公共属性RUNSPEED */
        public static final String RUNSPEED = "RUNSPEED"; // 单位为Mbps

        /** 公共属性CONFSPEED */
        public static final String CONFSPEED = "CONFSPEED"; // 单位为Mbps，0表示自协商

        /** WWN */
        public static final String WWN = "WWN";

        /** 公共属性INIORTGT */
        public static final String INIORTGT = "INIORTGT";

        /** 公共属性SFPSTATUS */
        public static final String SFPSTATUS = "SFPSTATUS";

        /** 公共属性FCCONFMODE */
        public static final String FCCONFMODE = "FCCONFMODE"; // FC端口

        /** 公共属性FCRUNMODE */
        public static final String FCRUNMODE = "FCRUNMODE"; // FC端口

        /** 公共属性LOSTSIGNALS */
        public static final String LOSTSIGNALS = "LOSTSIGNALS"; // 误码统计信息

        /** 公共属性BADCHARNUMBER */
        public static final String BADCHARNUMBER = "BADCHARNUMBER"; // 误码统计信息

        /** 公共属性LOSTSYNC */
        public static final String LOSTSYNC = "LOSTSYNC"; // 误码统计信息

        /** 公共属性LINKFAIL */
        public static final String LINKFAIL = "LINKFAIL"; // 误码统计信息

        /** 公共属性STARTTIME */
        public static final String STARTTIME = "STARTTIME"; // 统计开始时间

        /** 公共属性FLOGINDELAYTIMES */
        public static final String FLOGINDELAYTIMES = "FLOGINDELAYTIMES"; // flogin延迟时间

        /** 公共属性MAXSUPPORTSPEED */
        public static final String MAXSUPPORTSPEED = "MAXSUPPORTSPEED"; // FC端口的最大支持速率：1，2，4，8，16G，进制单位为1000

    }

    /**
     * ETH端口
     * 
     * 详细： 1 命令字：ETH_PORT 2 命令类型：ETH端口 3 命令参数：ETH_PORT
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class ETHPort extends TLVMOMsg
    {
        /** 公共属性LOGICTYPE */
        public static final String LOGICTYPE = "LOGICTYPE";

        /** 公共属性MACADDRESS */
        public static final String MACADDRESS = "MACADDRESS"; // MAC地址

        /** 公共属性INIORTGT */
        public static final String INIORTGT = "INIORTGT";

        /** 公共属性ETHDUPLEX */
        public static final String ETHDUPLEX = "ETHDUPLEX"; // ETH端口

        /** 公共属性ETHNEGOTIATE */
        public static final String ETHNEGOTIATE = "ETHNEGOTIATE"; // ETH端口

        /** 公共属性MTU */
        public static final String MTU = "MTU"; // ETH端口

        /** 公共属性BONDNAME */
        public static final String BONDNAME = "BONDNAME"; // ETH端口

        /** 公共属性IPV4ADDR */
        public static final String IPV4ADDR = "IPV4ADDR"; // ETH端口

        /** 公共属性IPV4MASK */
        public static final String IPV4MASK = "IPV4MASK"; // ETH端口

        /** 公共属性IPV4GATEWAY */
        public static final String IPV4GATEWAY = "IPV4GATEWAY"; // ETH端口

        /** 公共属性IPV6ADDR */
        public static final String IPV6ADDR = "IPV6ADDR"; // ETH端口

        /** 公共属性IPV6MASK */
        public static final String IPV6MASK = "IPV6MASK"; // ETH端口

        /** 公共属性IPV6GATEWAY */
        public static final String IPV6GATEWAY = "IPV6GATEWAY"; // ETH端口

        /** 公共属性ISCSITCPPORT */
        public static final String ISCSITCPPORT = "ISCSITCPPORT"; // ETH端口

        /** 公共属性ISCSINAME */
        public static final String ISCSINAME = "ISCSINAME"; // ETH端口

        /** 公共属性ERRORPACKETS */
        public static final String ERRORPACKETS = "ERRORPACKETS"; // 误码统计信息

        /** 公共属性LOSTPACKETS */
        public static final String LOSTPACKETS = "LOSTPACKETS"; // 误码统计信息

        /** 公共属性OVERFLOWEDPACKETS */
        public static final String OVERFLOWEDPACKETS = "OVERFLOWEDPACKETS"; // 误码统计信息

        /** 公共属性STARTTIME */
        public static final String STARTTIME = "STARTTIME"; // 统计开始时间

        /** 公共属性SPEED */
        public static final String SPEED = "SPEED";

    }

    /**
     * SAS端口
     * 
     * 详细： 1 命令字：SAS_PORT 2 命令类型：SAS端口 3 命令参数：SAS_PORT
     * 
     */
    public static class SASPort extends TLVMOMsg
    {
        /** 逻辑类型 */
        public static final String LOGICTYPE = "LOGICTYPE";

        /** 运行速率 */
        public static final String RUNSPEED = "RUNSPEED"; // 单位为Mbps

        /** WWN */
        public static final String WWN = "WWN"; // WWN或者MAC地址

        /** 启动器/目标器 */
        public static final String INIORTGT = "INIORTGT";

        /** 端口开关 */
        public static final String PORTSWITCH = "PORTSWITCH"; // 端口开关

        /** 无效DWORD数 */
        public static final String INVALIDDWORD = "INVALIDDWORD"; // 误码统计信息

        /** 一致性错误数 */
        public static final String DISPARITYERROR = "DISPARITYERROR"; // 误码统计信息

        /** 丢失DWORD同步数 */
        public static final String LOSSDWORD = "LOSSDWORD"; // 误码统计信息

        /** PHY reset 失败数 */
        public static final String PHYRESETERRORS = "PHYRESETERRORS"; // 误码统计信息

        /** 开始统计时间 */
        public static final String STARTTIME = "STARTTIME"; // 统计开始时间

        /** 当前连接的对端端口ID */
        public static final String CURRENT_PEER_PORT_ID = "CURRENT_PEER_PORT_ID";

        /** 应该连接的对端端口ID */
        public static final String SUGGEST_PEER_PORT_ID = "SUGGEST_PEER_PORT_ID";

        /** 定位灯 */
        public static final String LIGHTSTATUS = "LIGHTSTATUS"; // 用于对端口点定位灯

        /** 是否为mini SAS */
        public static final String ISMINISAS = "ISMINISAS"; // 是否为mini
                                                            // SAS，不提供此参数表明不是mini
                                                            // SAS

    }

    /**
     * 串口
     * 
     * 详细： 1 命令字：SERIAL_PORT 2 命令类型：串口 3 命令参数：SERIAL_PORT
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class SerialPort extends TLVMOMsg
    {
        /** 公共属性LOGICTYPE */
        public static final String LOGICTYPE = "LOGICTYPE";

    }

    /**
     * PCIE端口
     * 
     * 详细： 1 命令字：PCIE_PORT 2 命令类型：PCIE端口 3 命令参数：PCIE_PORT
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class PCIEPort extends TLVMOMsg
    {
        /** 公共属性PCIESPEED */
        public static final String PCIESPEED = "PCIESPEED";

        /** 公共属性LOSTSIGNALS */
        public static final String LOSTSIGNALS = "LOSTSIGNALS";

        /** 公共属性ECRCERROR */
        public static final String ECRCERROR = "ECRCERROR";

        /** 公共属性BADTLP */
        public static final String BADTLP = "BADTLP";

        /** 公共属性BADDLLP */
        public static final String BADDLLP = "BADDLLP";

        /** 公共属性RECVERROR */
        public static final String RECVERROR = "RECVERROR";

        /** 公共属性CHIPECCERROR */
        public static final String CHIPECCERROR = "CHIPECCERROR";

        /** 公共属性STARTTIME */
        public static final String STARTTIME = "STARTTIME";
    }

    /**
     * LUN
     * 
     * 详细： 1 命令字：LUN 2 命令类型：LUN 3 命令参数：LUN
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class LUN extends TLVMOMsg
    {
        /** 公共属性ALLOCTYPE */
        public static final String ALLOCTYPE = "ALLOCTYPE"; // 空间分配方式，FAT，THIN

        /** 公共属性CAPACITY */
        public static final String CAPACITY = "CAPACITY";

        /** 公共属性INITIALALLOCCAPACITY */
        public static final String INITIALALLOCCAPACITY = "INITIALALLOCCAPACITY"; // 创建时该容量可选

        /** 公共属性ALLOCCAPACITY */
        public static final String ALLOCCAPACITY = "ALLOCCAPACITY"; // 实际占用的容量

        /** 公共属性SECTORSIZE */
        public static final String SECTORSIZE = "SECTORSIZE"; // 块大小（体现给主机的扇区大小）

        /** 公共属性EXPOSEDTOINITIATOR */
        public static final String EXPOSEDTOINITIATOR = "EXPOSEDTOINITIATOR"; // 映射状态(EXPOSED_TO_INITIATOR)

        /** LUN WWN */
        public static final String WWN = "WWN";

        /** 公共属性DATADISTRIBUTING */
        public static final String DATADISTRIBUTING = "DATADISTRIBUTING"; // LUN数据在每一层上所占百分比

        /** 公共属性WRITEPOLICY */
        public static final String WRITEPOLICY = "WRITEPOLICY"; // cache写策略

        /** 公共属性RUNNINGWRITEPOLICY */
        public static final String RUNNINGWRITEPOLICY = "RUNNINGWRITEPOLICY"; // cache写策略运行状态

        /** 公共属性MIRRORPOLICY */
        public static final String MIRRORPOLICY = "MIRRORPOLICY"; // 镜像策略

        /** 公共属性PREFETCHPOLICY */
        public static final String PREFETCHPOLICY = "PREFETCHPOLICY"; // 预取策略

        /** 公共属性PREFETCHVALUE */
        public static final String PREFETCHVALUE = "PREFETCHVALUE"; // 预取策略值，根据预取策略有不同的值范围

        /** 公共属性OWNINGCONTROLLER */
        public static final String OWNINGCONTROLLER = "OWNINGCONTROLLER"; // 归属控制器ID

        /** 公共属性WORKINGCONTROLLER */
        public static final String WORKINGCONTROLLER = "WORKINGCONTROLLER"; // 工作控制器ID

        /** 公共属性SNAPSHOTIDS */
        public static final String SNAPSHOTIDS = "SNAPSHOTIDS"; // 快照

        /** 公共属性LUNCOPYIDS */
        public static final String LUNCOPYIDS = "LUNCOPYIDS"; // LUN拷贝

        /** 公共属性REMOTEREPLICATIONIDS */
        public static final String REMOTEREPLICATIONIDS = "REMOTEREPLICATIONIDS"; // 远程复制

        /** 公共属性SPLITMIRRORIDS */
        public static final String SPLITMIRRORIDS = "SPLITMIRRORIDS"; // 分裂镜像

        /** 公共属性DATATRANSFERPOLICY */
        public static final String DATATRANSFERPOLICY = "DATATRANSFERPOLICY"; // 数据迁移策略

        /** 公共属性INITIALDISTRIBUTEPOLICY */
        public static final String INITIALDISTRIBUTEPOLICY = "INITIALDISTRIBUTEPOLICY"; // 初始分配策略

        /** 公共属性IOCLASSID */
        public static final String IOCLASSID = "IOCLASSID"; // IO分类对象的ID

        /** 公共属性WORMRETENTIONABLE */
        public static final String WORMRETENTIONABLE = "WORMRETENTIONABLE"; // 全局WORM开关

        /** 公共属性RETENTIONSTATE */
        public static final String RETENTIONSTATE = "RETENTIONSTATE";

        /** 公共属性RETENTIONTERM */
        public static final String RETENTIONTERM = "RETENTIONTERM";

        /** 公共属性REMAINRETENTIONTERM */
        public static final String REMAINRETENTIONTERM = "REMAINRETENTIONTERM";

        /** 公共属性RETENTIONSETTIME */
        public static final String RETENTIONSETTIME = "RETENTIONSETTIME";

        /** 公共属性MOVETOTIER0DATA */
        public static final String MOVETOTIER0DATA = "MOVETOTIER0DATA"; // LUN待迁往tier0的数据量

        /** 公共属性MOVETOTIER1DATA */
        public static final String MOVETOTIER1DATA = "MOVETOTIER1DATA"; // LUN待迁往tier1的数据量

        /** 公共属性MOVETOTIER2DATA */
        public static final String MOVETOTIER2DATA = "MOVETOTIER2DATA"; // LUN待迁往tier2的数据量

        /** 公共属性METACAPACITY */
        public static final String METACAPACITY = "METACAPACITY"; // 元数据容量扇区数

        // begin h90005710 新增需求 LUN 增加LUN优先级设置

        /** 公共属性IOPRIORITY */
        public static final String IOPRIORITY = "IOPRIORITY";

        // end h90005710 新增需求 LUN 增加LUN优先级设置

        /** 公共属性DRS_ENABLE */
        public static final String DRS_ENABLE = "DRS_ENABLE";

        /** 公共属性CAPABILITY */
        public static final String CAPABILITY = "CAPABILITY";

        /** 公共属性EXISTSIO */
        public static final String EXISTSIO = "EXISTSIO";

        /** 公共属性ENABLESMARTCACHE */
        public static final String ENABLESMARTCACHE = "ENABLESMARTCACHE";

        /** 公共属性SC_CACHEDSIZE */
        public static final String SC_CACHEDSIZE = "SC_CACHEDSIZE";

        /** 公共属性SC_CACHEDRAGE */
        public static final String SC_CACHEDRAGE = "SC_CACHEDRAGE";

        /** 公共属性SC_HITRAGE */
        public static final String SC_HITRAGE = "SC_HITRAGE";

        // LUN容量告警级别，只用2（表示正常）、3（表示警告）、6（表示紧急）三个级别即可，
        /** 公共属性CAPACITYALARMLEVEL */
        public static final String CAPACITYALARMLEVEL = "CAPACITYALARMLEVEL"; // VASA:THIN

        /** 公共属性THINCAPACITYUSAGE */
        public static final String THINCAPACITYUSAGE = "THINCAPACITYUSAGE"; // TinLUN真实数据占整个系统中可供此ThinLUN使用的空间之比

        /** 公共属性REPLICATION_CAPACITY */
        public static final String REPLICATION_CAPACITY = "REPLICATION_CAPACITY"; // lun
                                                                                  // 数据保护容量

        /** 公共属性READCACHEPOLICY */
        public static final String READCACHEPOLICY = "READCACHEPOLICY"; // 读Cache策略

        /** 公共属性WRITECACHEPOLICY */
        public static final String WRITECACHEPOLICY = "WRITECACHEPOLICY"; // 写Cache策略

        /** Cache分区ID */
        public static final String CACHEPARTITIONID = "CACHEPARTITIONID"; // Cache分区ID

        /** 是否已经添加给LUN组 */
        public static final String ISADD2LUNGROUP = "ISADD2LUNGROUP";

        /** SmartCache Partition ID */
        public static final String SMARTCACHEPARTITIONID = "SMARTCACHEPARTITIONID";

        /** 数据销毁任务进度 */
        public static final String PROGRESS = "PROGRESS";

        /** 是否支持外部DIF特性 */
        public static final String EXTENDIFSWITCH = "EXTENDIFSWITCH";
    }

    /**
     * 快照
     * 
     * 详细： 1 命令字：Snapshot 2 命令类型：快照 3 命令参数：SNAPSHOT
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class SNAPSHOT extends TLVMOMsg
    {
        /** 公共属性SNAPSHOTUSER */
        public static final String SNAPSHOTUSER = "SNAPSHOTUSER"; // 快照的使用者

        /** 公共属性TIMESTAMP */
        public static final String TIMESTAMP = "TIMESTAMP"; // 创建快照的时间点(utc时间)

        /** 公共属性ROLLBACKSTARTTIME */
        public static final String ROLLBACKSTARTTIME = "ROLLBACKSTARTTIME"; // 快照回滚的开始时间(utc时间)

        /** 公共属性ROLLBACKENDTIME */
        public static final String ROLLBACKENDTIME = "ROLLBACKENDTIME"; // 快照回滚的结束时间(utc时间)

        /** 公共属性ROLLBACKSPEED */
        public static final String ROLLBACKSPEED = "ROLLBACKSPEED"; // 快照的回滚速率

        /** 公共属性ROLLBACKRATE */
        public static final String ROLLBACKRATE = "ROLLBACKRATE"; // 快照的回滚进度

        /** 公共属性EXPOSEDTOINITIATOR */
        public static final String EXPOSEDTOINITIATOR = "EXPOSEDTOINITIATOR";

        /** 公共属性WWN */
        public static final String WWN = "WWN";

        /** 公共属性USERCAPACITY */
        public static final String USERCAPACITY = "USERCAPACITY";

        /** 公共属性CONSUMEDCAPACITY */
        public static final String CONSUMEDCAPACITY = "CONSUMEDCAPACITY";
    }

    /**
     * 批量操作快照
     * 
     * 详细： 1 命令字：SnapshotBatchOperation 2 命令类型：批量操作快照 3 命令参数：SNAPSHOTBATCHOPERATION
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class SNAPSHOTBATCHOPERATION
    {
        /** 公共属性SNAPSHOTLIST */
        public static final String SNAPSHOTLIST = "SNAPSHOTLIST"; // 批量操作的虚拟快照数组列表，在TV2R1版本中最多包含64个虚拟快照ID

    }

    /**
     * 主机
     * 
     * 详细： 1 命令字：HOST 2 命令类型：主机 3 命令参数：HOST
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class HOST extends TLVMOMsg
    {
        /** 公共属性OPERATIONSYSTEM */
        public static final String OPERATIONSYSTEM = "OPERATIONSYSTEM"; // 主机操作系统

        /** 公共属性NETWORKNAME */
        public static final String NETWORKNAME = "NETWORKNAME"; // 主机的域名

        /** IP地址 */
        public static final String IP = "IP";

        /** 公共属性MODEL */
        public static final String MODEL = "MODEL"; // 主机型号

        /** 公共属性ISADD2HOSTGROUP */
        public static final String ISADD2HOSTGROUP = "ISADD2HOSTGROUP";

    }

    /**
     * iSCSI启动器（主机端口）
     * 
     * 详细： 1 命令字：ISCSI_INITIATOR 2 命令类型：iSCSI启动器（主机端口） 3 命令参数：ISCSI_INITIATOR
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class ISCSIInitiator extends TLVMOMsg
    {
        /** 公共属性ISFREE */
        public static final String ISFREE = "ISFREE"; // 是否空闲

        /** 公共属性USECHAP */
        public static final String USECHAP = "USECHAP"; // 是否启用CHAP

        /** 公共属性CHAPNAME */
        public static final String CHAPNAME = "CHAPNAME"; // CHAP名

        /** 公共属性CHAPPASSWORD */
        public static final String CHAPPWD = "CHAPPASSWORD"; // 密码

        /** 公共属性MULTIPATHTYPE */
        public static final String MULTIPATHTYPE = "MULTIPATHTYPE"; // MultiPathType，默认值为Default

        /** 公共属性OPERATIONSYSTEM */
        public static final String OPERATIONSYSTEM = "OPERATIONSYSTEM"; // 所属主机操作系统，默认为Windows。

    }

    /**
     * FC启动器（主机端口）
     * 
     * 详细： 1 命令字：FC_INITIATOR 2 命令类型：FC启动器（主机端口） 3 命令参数：FC_INITIATOR
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class FCInitiator extends TLVMOMsg
    {
        /** 公共属性ISFREE */
        public static final String ISFREE = "ISFREE"; // 是否空闲

        /** 公共属性MULTIPATHTYPE */
        public static final String MULTIPATHTYPE = "MULTIPATHTYPE"; // MultiPathType，默认值为Default

        /** 公共属性OPERATIONSYSTEM */
        public static final String OPERATIONSYSTEM = "OPERATIONSYSTEM"; // 所属主机操作系统，默认为Windows。

    }

    /**
     * 存储池
     * 
     * 详细： 1 命令字：STORAGEPOOL 2 命令类型：存储池 3 命令参数：STORAGEPOOL
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class STORAGEPOOL extends TLVMOMsg
    {
        /** 公共属性WORKNODEID */
        public static final String WORKNODEID = "WORKNODEID"; // pool的工作节点ID，表明pool的工作控制器

        /** 公共属性USERTOTALCAPACITY */
        public static final String USERTOTALCAPACITY = "USERTOTALCAPACITY"; // pool的用户总容量

        /** 公共属性USERFREECAPACITY */
        public static final String USERFREECAPACITY = "USERFREECAPACITY"; // pool的用户空闲容量

        /** 公共属性USERCONSUMEDCAPACITY */
        public static final String USERCONSUMEDCAPACITY = "USERCONSUMEDCAPACITY"; // pool的用户已用容量

        // pool的用户已用容量百分比(%)
        /** 公共属性USERCONSUMEDCAPACITYPERCENTAGE */
        public static final String USERCONSUMEDCAPACITYPERCENTAGE = "USERCONSUMEDCAPACITYPERCENTAGE";

        // pool的用户已用容量阈值(%)——默认阈值为80%，修改范围为【50%，85%】
        /** 公共属性USERCONSUMEDCAPACITYTHRESHOLD */
        public static final String USERCONSUMEDCAPACITYTHRESHOLD = "USERCONSUMEDCAPACITYTHRESHOLD";

        /** 公共属性HOTSPARESPACETOTALCAPACITY */
        public static final String HOTSPARESPACETOTALCAPACITY = "HOTSPARESPACETOTALCAPACITY"; // pool的用户热备空间总容量

        /** 公共属性HOTSPARESPACECONSUMEDCAPACITY */
        public static final String HOTSPARESPACECONSUMEDCAPACITY = "HOTSPARESPACECONSUMEDCAPACITY"; // pool的用户热备空间已用容量

        // pool的用户热备空间已用容量百分比(%)
        /** 公共属性HOTSPARESPACECONSUMEDCAPACITYPERCENTAGE */
        public static final String HOTSPARESPACECONSUMEDCAPACITYPERCENTAGE = "HOTSPARESPACECONSUMEDCAPACITYPERCENTAGE";

        /** 公共属性LEVELINGSPEED */
        public static final String LEVELINGSPEED = "LEVELINGSPEED"; // pool均衡速度

        /** 公共属性DSTSTATUS */
        public static final String DSTSTATUS = "DSTSTATUS"; // pool的DST特性状态

        /** 公共属性DSTRUNNINGSTATUS */
        public static final String DSTRUNNINGSTATUS = "DSTRUNNINGSTATUS"; // pool迁移的运行状态

        /** 公共属性EXTENTSIZE */
        public static final String EXTENTSIZE = "EXTENTSIZE";

        // pool的Extent大小，Extent为DST迁移的粒度。目前支持的迁移粒度为：
        // 256KB，512KB，1MB，2MB，4MB，8MB，16MB，32MB，64MB

        /** 公共属性MIGRATIONMODE */
        public static final String MIGRATIONMODE = "MIGRATIONMODE"; // pool的迁移模式，手动或自动

        /** 公共属性MIGRATIONDAYS */
        public static final String MIGRATIONDAYS = "MIGRATIONDAYS"; // 一周中进行DST迁移的日子，可选从周一到周日的任意日子,0..6对应周日到周六，默认为每天

        /** 公共属性MIGRATIONSTARTTIME */
        public static final String MIGRATIONSTARTTIME = "MIGRATIONSTARTTIME"; // 每天DST迁移的起始时间，默认为01:00

        /** 公共属性MIGRATIONDURATIONTIME */
        public static final String MIGRATIONDURATIONTIME = "MIGRATIONDURATIONTIME"; // DST迁移持续时间，默认为4个小时

        /** 公共属性MONITORDAYS */
        public static final String MONITORDAYS = "MONITORDAYS"; // 一周中进行IO监控的日子，可选从周一到周日的任意日子,0..6对应周一到周日；默认每天

        /** 公共属性MONITORSTARTTIME */
        public static final String MONITORSTARTTIME = "MONITORSTARTTIME"; // DST
                                                                          // IO监控的起始时间；默认当前00：00

        /** 公共属性MONITORDURATIONTIME */
        public static final String MONITORDURATIONTIME = "MONITORDURATIONTIME"; // DST
                                                                                // IO监控持续时间

        /** 公共属性SECTORSIZE */
        public static final String SECTORSIZE = "SECTORSIZE"; // 块大小（体现给主机的扇区大小）

        /** 公共属性ALLMIGRATIONSPEEDLEVEL */
        public static final String ALLMIGRATIONSPEEDLEVEL = "ALLMIGRATIONSPEEDLEVEL";

        /*
         * 所有存储池的全局迁移速度级别(Lin Yu:这里需要注意的是迁移速度级别并不是某个pool的属性，而是所有pool共享的一个全局速度级别，
         * 参考EMC的实现方式，设置此属性时，是在pool属性对话框上有一个按钮，点下按钮后会弹出一个对话框，在该对话框上设置这种全局的属性)
         */

        /** 公共属性IMMEDIATEMIGRATION */
        public static final String IMMEDIATEMIGRATION = "IMMEDIATEMIGRATION"; // pool立即迁移开关

        /** 公共属性IMMEDIATEMIGRATIONDURATIONTIME */
        public static final String IMMEDIATEMIGRATIONDURATIONTIME = "IMMEDIATEMIGRATIONDURATIONTIME"; // pool立即迁移持续时间

        /** 公共属性PAUSEMIGRATIONSWITCH */
        public static final String PAUSEMIGRATIONSWITCH = "PAUSEMIGRATIONSWITCH"; // pool暂停迁移开关

        /** 公共属性MOVEUPDATA */
        public static final String MOVEUPDATA = "MOVEUPDATA"; // Pool待上迁数据量（所有Tier待上迁数据量总和）

        /** 公共属性MOVEDOWNDATA */
        public static final String MOVEDOWNDATA = "MOVEDOWNDATA"; // Pool待下迁数据量（所有Tier待下迁数据量总和）

        /** 公共属性MIGRATIONESTIMATEDTIME */
        public static final String MIGRATIONESTIMATEDTIME = "MIGRATIONESTIMATEDTIME"; // Pool以秒为单位的估计迁移时间

        /** 公共属性TIER0RAIDLV */
        public static final String TIER0RAIDLV = "TIER0RAIDLV"; // Tier0的RAID级别,默认级别为RAID10

        /** 公共属性TIER0RAIDDISKNUM */
        public static final String TIER0RAIDDISKNUM = "TIER0RAIDDISKNUM"; // Tier0的RAID逻辑成员盘数量

        /** 公共属性TIER0DISKNUM */
        public static final String TIER0DISKNUM = "TIER0DISKNUM"; // Tier0上的硬盘数量

        /** 公共属性TIER0DISKTYPE */
        public static final String TIER0DISKTYPE = "TIER0DISKTYPE"; // Tier0对应的硬盘类型

        /** 公共属性TIER0DISKLIST */
        public static final String TIER0DISKLIST = "TIER0DISKLIST"; // Tier0磁盘列表

        /** 公共属性TIER0HOTSPARESPACESTRATEGY */
        public static final String TIER0HOTSPARESPACESTRATEGY = "TIER0HOTSPARESPACESTRATEGY"; // tier0的热备策略，
                                                                                              // 取值——高/低

        /** 公共属性TIER1RAIDLV */
        public static final String TIER1RAIDLV = "TIER1RAIDLV"; // Tier1的RAID级别，默认级别为RAID5

        /** 公共属性TIER1RAIDDISKNUM */
        public static final String TIER1RAIDDISKNUM = "TIER1RAIDDISKNUM"; // Tier1的RAID逻辑成员盘数量

        /** 公共属性TIER1DISKNUM */
        public static final String TIER1DISKNUM = "TIER1DISKNUM"; // Tier1上的硬盘数量

        /** 公共属性TIER1DISKTYPE */
        public static final String TIER1DISKTYPE = "TIER1DISKTYPE"; // Tier1对应的硬盘类型

        /** 公共属性TIER1DISKLIST */
        public static final String TIER1DISKLIST = "TIER1DISKLIST"; // Tier1磁盘列表

        /** 公共属性TIER1HOTSPARESPACESTRATEGY */
        public static final String TIER1HOTSPARESPACESTRATEGY = "TIER1HOTSPARESPACESTRATEGY"; // tier1的热备策略，
                                                                                              // 取值——高/低

        /** 公共属性TIER2RAIDLV */
        public static final String TIER2RAIDLV = "TIER2RAIDLV"; // Tier2的RAID级别，默认级别为RAID6

        /** 公共属性TIER2RAIDDISKNUM */
        public static final String TIER2RAIDDISKNUM = "TIER2RAIDDISKNUM"; // Tier2的RAID逻辑成员盘数量

        /** 公共属性TIER2DISKNUM */
        public static final String TIER2DISKNUM = "TIER2DISKNUM"; // Tier2上的硬盘数量

        /** 公共属性TIER2DISKTYPE */
        public static final String TIER2DISKTYPE = "TIER2DISKTYPE"; // Tier2对应的硬盘类型

        /** 公共属性TIER2DISKLIST */
        public static final String TIER2DISKLIST = "TIER2DISKLIST"; // Tier2磁盘列表

        /** 公共属性TIER2HOTSPARESPACESTRATEGY */
        public static final String TIER2HOTSPARESPACESTRATEGY = "TIER2HOTSPARESPACESTRATEGY"; // tier2的热备策略，
                                                                                              // 取值——高/低

        /** 公共属性TIER0STRIPEDEPTH */
        public static final String TIER0STRIPEDEPTH = "TIER0STRIPEDEPTH"; // tier0的分条深度，不再客户端体现，仅在CLI的研发模式下支持修改及展现

        /** 公共属性TIER1STRIPEDEPTH */
        public static final String TIER1STRIPEDEPTH = "TIER1STRIPEDEPTH"; // tier1的分条深度，不再客户端体现，仅在CLI的研发模式下支持修改及展现

        /** 公共属性TIER2STRIPEDEPTH */
        public static final String TIER2STRIPEDEPTH = "TIER2STRIPEDEPTH"; // tier2的分条深度，不再客户端体现，仅在CLI的研发模式下支持修改及展现

        /** 公共属性MOVEDUPDATA */
        public static final String MOVEDUPDATA = "MOVEDUPDATA"; // Pool已上迁数据量（所有Tier从开始迁移到当前已上迁数据量总和）

        /** 公共属性MOVEDDOWNDATA */
        public static final String MOVEDDOWNDATA = "MOVEDDOWNDATA"; // Pool已下迁数据量（所有Tier从开始迁移到当前下迁数据量总和）

        /** 公共属性MIGRATIONSCHEDULEID */
        public static final String MIGRATIONSCHEDULEID = "MIGRATIONSCHEDULEID"; // Pool上迁移所关联的时刻表ID,
                                                                                // 在TV2R1版本中仅支持一对一的关系，以后版本可能1对多个时刻表

        // Pool上IO监控所关联的时刻表ID；在TV2R1版本中仅支持一对一的关系，以后版本可能1对多个时刻表
        /** 公共属性MONITORSCHEDULEID */
        public static final String MONITORSCHEDULEID = "MONITORSCHEDULEID";

        /** 公共属性RAWCAPACITY */
        public static final String RAWCAPACITY = "RAWCAPACITY"; // Pool的原始容量，即所有成员盘的裸容量之和

        /** 公共属性INVALIDTIME */
        public static final String INVALIDTIME = "INVALIDTIME";

        /** 公共属性ENABLESPINDOWN */
        public static final String ENABLESPINDOWN = "ENABLESPINDOWN";

        // Pool上Spindown所关联的时刻表ID；在TV2R1版本中仅支持一对一的关系，以后版本可能1对多个时刻表
        /** 公共属性SPINDOWNSCHEDULEID */
        public static final String SPINDOWNSCHEDULEID = "SPINDOWNSCHEDULEID";

        /** 公共属性RESERVEDCAPACITY */
        public static final String RESERVEDCAPACITY = "RESERVEDCAPACITY"; // Pool的预留容量

        /** 公共属性TIER0CAPACITY */
        public static final String TIER0CAPACITY = "TIER0CAPACITY"; // Tier0裸容量

        /** 公共属性TIER1CAPACITY */
        public static final String TIER1CAPACITY = "TIER1CAPACITY"; // Tier1裸容量

        /** 公共属性TIER2CAPACITY */
        public static final String TIER2CAPACITY = "TIER2CAPACITY"; // Tier2裸容量

        /** 公共属性REPLICATIONCAPACITY */
        public static final String REPLICATIONCAPACITY = "REPLICATIONCAPACITY"; // Tier2裸容量

        /** 公共属性SPINDOWNTRIGGER */
        public static final String SPINDOWNTRIGGER = "SPINDOWNTRIGGER"; // 休眠触发模式
    }

    /**
     * 时刻表
     * 
     * 详细： 1 命令字：SCHEDULE 2 命令类型：时刻表 3 命令参数：SCHEDULE
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class SCHEDULE extends TLVMOMsg
    {
        /** 公共属性RELATEDOBJID */
        public static final String RELATEDOBJID = "RELATEDOBJID"; // 时刻表应用的对象

        /** 公共属性APP_TYPE */
        public static final String APP_TYPE = "APP_TYPE"; // 时刻表应用的类型

        /** 公共属性DAYS */
        public static final String DAYS = "DAYS"; // 一周中应用的日子，可选从周一到周日的任意日子,0..6对应周日到周六，默认为每天

        /** 公共属性STARTTIME */
        public static final String STARTTIME = "STARTTIME"; // 每天应用的起始时间，默认为01:00

        /** 公共属性DURATIONTIME */
        public static final String DURATIONTIME = "DURATIONTIME"; // 应用持续时间，默认为4个小时

    }

    /**
     * iSCSIDeviceName
     * 
     * 详细： 1 命令字：iSCSIDeviceName 2 命令类型：iSCSIDeviceName 3 命令参数：ISCSIDEVICENAME
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class ISCSIDEVICENAME
    {
        /** 公共属性CMO_ISCSI_DEVICE_NAME */
        public static final String CMO_ISCSI_DEVICE_NAME = "CMO_ISCSI_DEVICE_NAME";

    }

    /**
     * iSCSI链路
     * 
     * 详细： 1 命令字：iSCSI_LINK 2 命令类型：iSCSI链路 3 命令参数：ISCSI_LINK
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class ISCSILink extends TLVMOMsg
    {
        /** 公共属性DEVICEID */
        public static final String DEVICEID = "DEVICEID"; // 设备ID

        /** 公共属性LOCALCONTROLID */
        public static final String LOCALCONTROLID = "LOCALCONTROLID"; // 本端控制器ID

        /** 公共属性REMOTECONTROLID */
        public static final String REMOTECONTROLID = "REMOTECONTROLID"; // 远端控制器ID

        /** 公共属性LOCALPORTID */
        public static final String LOCALPORTID = "LOCALPORTID"; // 本端端口ID

        /** 公共属性REMOTEPORTID */
        public static final String REMOTEPORTID = "REMOTEPORTID"; // 远端端口ID

        /** 公共属性LINKUSAGE */
        public static final String LINKUSAGE = "LINKUSAGE"; // 是否用于复制业务,
                                                            // 这个用于标识是否是已添加的链路

        /** 公共属性TARGETNAME */
        public static final String TARGETNAME = "TARGETNAME"; // iSCSI目标器名称

        /** 公共属性INITIATORNAME */
        public static final String INITIATORNAME = "INITIATORNAME"; // iSCSI启动器名称

        /** 公共属性BANDWIDTHLIMITSWITCH */
        public static final String BANDWIDTHLIMITSWITCH = "BANDWIDTHLIMITSWITCH"; // 是否代开带宽限制功能，0：关闭1：打开

        /** 公共属性BANDWIDTHLIMITSIZE */
        public static final String BANDWIDTHLIMITSIZE = "BANDWIDTHLIMITSIZE"; // 限制带宽大小

        /** 公共属性BANDWIDTHLIMITUNIT */
        public static final String BANDWIDTHLIMITUNIT = "BANDWIDTHLIMITUNIT"; // 限制带宽单位，0：M字节1：K字节

        /** 公共属性BANDWIDTHLIMITUTILIZATION */
        public static final String BANDWIDTHLIMITUTILIZATION = "BANDWIDTHLIMITUTILIZATION"; // 带宽利用率

        /** 公共属性ARRAYTYPE */
        public static final String ARRAYTYPE = "ARRAYTYPE"; // 本厂商、第三方

        /** 公共属性RECOVERY_POLICY */
        public static final String RECOVERY_POLICY = "RECOVERY_POLICY"; // 自动/手动

        /** 公共属性ENABLECHAP */
        public static final String ENABLECHAP = "ENABLECHAP";

        /** 公共属性CHAPUSER */
        public static final String CHAPUSER = "CHAPUSER";

        /** 公共属性CHAPPASSWD */
        public static final String CHAPPASSWD = "CHAPPASSWD";

        /** 公共属性IP */
        public static final String IP = "IP";

        /** 公共属性PORT */
        public static final String PORT = "PORT";

        /** 公共属性REMOTEUSERNAME */
        public static final String REMOTEUSERNAME = "REMOTEUSERNAME"; // iSCSI链路：远端阵列用户名

        /** 公共属性REMOTEPASSWORD */
        public static final String REMOTEPWD = "REMOTEPASSWORD"; // iSCSI链路：远端阵列密码

        /** 公共属性REMOTELOGINTYPE */
        public static final String REMOTELOGINTYPE = "REMOTELOGINTYPE"; // iSCSI链路：远端阵列登录类型

    }

    /**
     * LDAP配置
     * 
     * 详细： 1 命令字：LDAPConfig 2 命令类型：LDAP配置 3 命令参数：LDAPCONFIG
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class LDAPCONFIG extends TLVMOMsg
    {
        /** 公共属性SERVERIP */
        public static final String SERVERIP = "SERVERIP";

        /** 公共属性PORT */
        public static final String PORT = "PORT";

        /** 公共属性DIRECTORYTYPE */
        public static final String DIRECTORYTYPE = "DIRECTORYTYPE"; // LDAP目录类型1：
                                                                    // LDAP2： AD

        /** 公共属性TRANSFERTYPE */
        public static final String TRANSFERTYPE = "TRANSFERTYPE"; // 1：LDAP2：LDAPS两者区别在于通讯时是否加密

        /** 公共属性BINDDN */
        public static final String BINDDN = "BINDDN";

        /** 公共属性BINDPASSWD */
        public static final String BINDPASSWD = "BINDPASSWD";

        /** 公共属性USERSEARCHPATH */
        public static final String USERSEARCHPATH = "USERSEARCHPATH";

        /** 公共属性GROUPSEARCHPATH */
        public static final String GROUPSEARCHPATH = "GROUPSEARCHPATH";

        /** 公共属性USERIDATTR */
        public static final String USERIDATTR = "USERIDATTR";

        /** 公共属性USERNAMEATTR */
        public static final String USERNAMEATTR = "USERNAMEATTR";

        /** 公共属性GROUPNAMEATTR */
        public static final String GROUPNAMEATTR = "GROUPNAMEATTR";

        /** 公共属性GROUPMEMBERATTR */
        public static final String GROUPMEMBERATTR = "GROUPMEMBERATTR";

        /** 公共属性USEROBJECTCLASS */
        public static final String USEROBJECTCLASS = "USEROBJECTCLASS";

        /** 公共属性GROUPOBJECTCLASS */
        public static final String GROUPOBJECTCLASS = "GROUPOBJECTCLASS";

        /** 公共属性BASEDN */
        public static final String BASEDN = "BASEDN";

        /** 公共属性PASSWORDHASH */
        public static final String PWDHASH = "PASSWORDHASH";

        /** 公共属性GROUPIDATTR */
        public static final String GROUPIDATTR = "GROUPIDATTR";

    }

    /**
     * LDAP用户与本地用户的角色映射
     * 
     * 详细： 1 命令字：LDAP_USER_MAP 2 命令类型：LDAP用户与本地用户的角色映射 3 命令参数：LDAP_USER_MAP
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class LDAPUserMap extends TLVMOMsg
    {
        /** 公共属性MAPNAME */
        public static final String MAPNAME = "MAPNAME";

        /** 公共属性MAPTYPE */
        public static final String MAPTYPE = "MAPTYPE";

        /** 公共属性USERLEVEL */
        public static final String USERLEVEL = "USERLEVEL";

    }

    /**
     * DHA策略
     * 
     * 详细： 1 命令字：DHA_EXPORT 2 命令类型：DHA策略 3 命令参数：DHA_EXPORT
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class DHAExport
    {
        /** 公共属性CMO_DHA_EXPORT_TYPE */
        public static final String CMO_DHA_EXPORT_TYPE = "CMO_DHA_EXPORT_TYPE"; // 1：开始导出0：结束导出

        /** 公共属性CMO_DHA_EXPORT_PATH */
        public static final String CMO_DHA_EXPORT_PATH = "CMO_DHA_EXPORT_PATH";

    }

    /**
     * 映射视图
     * 
     * 详细： 1 命令字：MAPPINGVIEW 2 命令类型：映射视图 3 命令参数：MAPPINGVIEW
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class MAPPINGVIEW extends TLVMOMsg
    {
        /** 公共属性LUNMAPPING */
        public static final String LUNMAPPING = "LUNMAPPING";

        // LUN映射表，长度为255的数组，数组元素填映射的LUN ID（字符串类形），数组下标是主机LUN ID，如果某个主机LUN
        // ID没有使用，则此数组元素填空字符串

        /** 公共属性SNAPSHOTMAPPING */
        public static final String SNAPSHOTMAPPING = "SNAPSHOTMAPPING";

        // 快照映射表，长度为255的数组，数组元素填映射的快照 ID（字符串类形），数组下标是主机LUN ID，如果某个主机LUN
        // ID没有使用，则此数组元素填空字符串

        /** 公共属性HOSTLUNID */
        public static final String HOSTLUNID = "HOSTLUNID"; // 不是映射视图本身的属性，仅用于添加映射命令

        /** 公共属性ENABLEINBANDCOMMAND */
        public static final String ENABLEINBANDCOMMAND = "ENABLEINBANDCOMMAND"; // 是否启用命令设备

        /** 公共属性INBANDLUNWWN */
        public static final String INBANDLUNWWN = "INBANDLUNWWN"; // 命令设备WWN

        /** 公共属性WORKMODE */
        public static final String WORKMODE = "WORKMODE"; // A/P-F,A/A-A

        /** 公共属性LUNWWN */
        public static final String LUNWWN = "LUNWWN"; // LUN或者虚拟快照的WWN

        /** 公共属性FORFILESYSTEM */
        public static final String FORFILESYSTEM = "FORFILESYSTEM"; // 是否专用于文件系统集群，默认为否

    }

    /**
     * FCoE 端口
     * 
     * 详细： 1 命令字：FCoE_PORT 2 命令类型：FCoE 端口 3 命令参数：FCOE_PORT
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class FCoEPort extends TLVMOMsg
    {
        /** 公共属性LOGICTYPE */
        public static final String LOGICTYPE = "LOGICTYPE";

        /** 公共属性RUNSPEED */
        public static final String RUNSPEED = "RUNSPEED"; // 单位为Mbps

        /** WWN */
        public static final String WWN = "WWN";

        /** 公共属性INIORTGT */
        public static final String INIORTGT = "INIORTGT";

        /** 公共属性SFPSTATUS */
        public static final String SFPSTATUS = "SFPSTATUS";

        /** 公共属性ERRORPACKETS */
        public static final String ERRORPACKETS = "ERRORPACKETS"; // 误码统计信息

        /** 公共属性LOSTPACKETS */
        public static final String LOSTPACKETS = "LOSTPACKETS"; // 误码统计信息

        /** 公共属性OVERFLOWEDPACKETS */
        public static final String OVERFLOWEDPACKETS = "OVERFLOWEDPACKETS"; // 误码统计信息

        /** 公共属性STARTTIME */
        public static final String STARTTIME = "STARTTIME"; // 统计开始时间

        /** 公共属性VLANID */
        public static final String VLANID = "VLANID"; // VLANID

        /** 公共属性MTU */
        public static final String MTU = "MTU"; // ETH端口
    }

    /**
     * License导路径
     * 
     * 详细： 1 命令字：LICENSE_PATH 2 命令类型：License导入路径 3 命令参数：LICENSE_PATH
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class LicensePath
    {
        /** 公共属性CMO_LICENSE_DIR_INFO_DIR */
        public static final String CMO_LICENSE_DIR_INFO_DIR = "CMO_LICENSE_DIR_INFO_DIR";// License路径
    }

    /**
     * 枚举详情
     * 
     * 详细： 1 命令字：ENUM_INFO 2 命令类型：枚举详情 3 命令参数：ENUM_INFO
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class EnumInfo
    {
        /** 公共属性ENUM_NAME */
        public static final String ENUM_NAME = "ENUM_NAME"; // 作为下发参数提供

        /** 公共属性ENUM_INDEX */
        public static final String ENUM_INDEX = "ENUM_INDEX";

        /** 公共属性ENUM_GLOSSARY_CN */
        public static final String ENUM_GLOSSARY_CN = "ENUM_GLOSSARY_CN";

        /** 公共属性ENUM_GLOSSARY_EN */
        public static final String ENUM_GLOSSARY_EN = "ENUM_GLOSSARY_EN";

        /** 公共属性ENUM_DESCRIPTION_CN */
        public static final String ENUM_DESCRIPTION_CN = "ENUM_DESCRIPTION_CN";

        /** 公共属性ENUM_DESCRIPTION_EN */
        public static final String ENUM_DESCRIPTION_EN = "ENUM_DESCRIPTION_EN";

    }

    /**
     * 主机链路
     * 
     * 详细： 1 命令字：HOST_LINK 2 命令类型：主机链路 3 命令参数：HOST_LINK
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class HostLink extends TLVMOMsg
    {
        /** 公共属性INITIATOR_TYPE */
        public static final String INITIATOR_TYPE = "INITIATOR_TYPE";

        /** 公共属性INITIATOR_ID */
        public static final String INITIATOR_ID = "INITIATOR_ID"; // 启动器ID

        /** 公共属性INITIATOR_PORT_WWN */
        public static final String INITIATOR_PORT_WWN = "INITIATOR_PORT_WWN"; // 启动器的portWWN或者iSCSI的IQN。

        /** 公共属性INITIATOR_NODE_WWN */
        public static final String INITIATOR_NODE_WWN = "INITIATOR_NODE_WWN"; // 启动器的nodeWWN，iSCSI为空。

        /** 公共属性TARGET_TYPE */
        public static final String TARGET_TYPE = "TARGET_TYPE";

        /** 公共属性TARGET_ID */
        public static final String TARGET_ID = "TARGET_ID"; // 目标器ID

        /** 公共属性TARGET_PORT_WWN */
        public static final String TARGET_PORT_WWN = "TARGET_PORT_WWN"; // 目标器的portWWN，iSCSI为空。

        /** 公共属性TARGET_NODE_WWN */
        public static final String TARGET_NODE_WWN = "TARGET_NODE_WWN"; // 目标器的nodeWWN，iSCSI为空。

        /** 公共属性TARGET_ALTERNATENAME */
        public static final String TARGET_ALTERNATENAME = "TARGET_ALTERNATENAME"; // 目标器别名

        /** 公共属性CTRL_ID */
        public static final String CTRL_ID = "CTRL_ID"; // 目标器所在控制器ID

    }

    /**
     * LUN Migration
     * 
     * 详细： 1 命令字：LUN_Migration 2 命令类型：LUN Migration 3 命令参数：LUN_MIGRATION
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class LUNMigration extends TLVMOMsg
    {
        /** 公共属性PROCESS */
        public static final String PROCESS = "PROCESS"; // 任务进度，取值范围0-100

        /** 公共属性REMAINTIME */
        public static final String REMAINTIME = "REMAINTIME"; // 任务完成预计剩余时间

        /** 公共属性STARTTIME */
        public static final String STARTTIME = "STARTTIME";

        /** 公共属性DURATION */
        public static final String DURATION = "DURATION"; // 任务整体要花费的时间

        /** 公共属性TARGETLUNTYPE */
        public static final String TARGETLUNTYPE = "TARGETLUNTYPE"; // 目标LUN类型

        /** 公共属性TARGETLUNID */
        public static final String TARGETLUNID = "TARGETLUNID"; // 目标LUN ID

        /** 公共属性TARGETLUNNAME */
        public static final String TARGETLUNNAME = "TARGETLUNNAME"; // 目标LUN名称

        /** 公共属性SPEED */
        public static final String SPEED = "SPEED"; // 迁移速率

        /** 公共属性ISDELETESOURCELUN */
        public static final String ISDELETESOURCELUN = "ISDELETESOURCELUN"; // 迁移结束后是否删除源LUN

    }

    /**
     * 主机组
     * 
     * 详细： 1 命令字：HostGroup 2 命令类型：主机组 3 命令参数：HOSTGROUP
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class HOSTGROUP extends TLVMOMsg
    {
        public static final String ISADD2MAPPINGVIEW = "ISADD2MAPPINGVIEW";
    }

    /**
     * LUN组
     * 
     * 详细： 1 命令字：LUNGroup 2 命令类型：LUN组 3 命令参数：LUNGROUP
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class LUNGROUP extends TLVMOMsg
    {
        /** 公共属性ISADD2MAPPINGVIEW */
        public static final String ISADD2MAPPINGVIEW = "ISADD2MAPPINGVIEW"; // 迁移结束后是否删除源LUN

        /** 公共属性APPTYPE */
        public static final String APPTYPE = "APPTYPE"; // 应用的类型

        /** 公共属性GROUPTYPE */
        public static final String GROUPTYPE = "GROUPTYPE"; // 组类型
    }

    /**
     * 端口组
     * 
     * 详细： 1 命令字：PortGroup 2 命令类型：端口组 3 命令参数：PORTGROUP
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class PORTGROUP extends TLVMOMsg
    {
    }

    /**
     * 远程复制一致性组
     * 
     * 详细： 1 命令字：ConsistentGroup 2 命令类型：端口组 3 命令参数：CONSISTENTGROUP
     * 
     * @author V1R10
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class CONSISTENTGROUP extends TLVMOMsg
    {

        public static final String RECOVERYPOLICY = "RECOVERYPOLICY";

        public static final String REPLICATIONMODEL = "REPLICATIONMODEL";

        public static final String SPEED = "SPEED";

        public static final String SYNCHRONIZETYPE = "SYNCHRONIZETYPE";

        public static final String ISSECRESBEWRITE = "ISSECRESBEWRITE";

        public static final String TIMINGVAL = "TIMINGVAL";

        public static final String SECRESACCESS = "SECRESACCESS";

        public static final String TIMINGVALINSEC = "TIMINGVALINSEC";

        public static final String ISPRIMARY = "ISPRIMARY";

        public static final String ISLOCALDELETE = "ISLOCALDELETE";

        public static final String RMLIST = "RMLIST";
    }

    /**
     * 远程复制
     * 
     * 详细： 1 命令字：ReplicationPair 2 命令类型：端口组 3 命令参数：REPLICATIONPAIR
     * 
     * @author V1R003
     * @version [版本号V100R003C30, 2014-07-22]
     */
    public static class REPLICATIONPAIR extends TLVMOMsg
    {

        public static final String ISPRIMARY = "ISPRIMARY";

        public static final String LOCALRESID = "LOCALRESID";

        public static final String LOCALRESNAME = "LOCALRESNAME";

        public static final String REMOTEDEVICEID = "REMOTEDEVICEID";

        public static final String REMOTEDEVICESN = "REMOTEDEVICESN";

        public static final String REMOTEDEVICENAME = "REMOTEDEVICENAME";

        public static final String REMOTERESID = "REMOTERESID";

        public static final String REMOTERESNAME = "REMOTERESNAME";

        public static final String ISFIRSTSYNC = "ISFIRSTSYNC";

        public static final String SYNCHRONIZETYPE = "SYNCHRONIZETYPE";

        public static final String CAPACITY = "CAPACITY";

        public static final String RECOVERYPOLICY = "RECOVERYPOLICY";

        public static final String STARTTIME = "STARTTIME";

        public static final String ENDTIME = "ENDTIME";

        public static final String SPEED = "SPEED";

        public static final String LOCALRESTYPE = "LOCALRESTYPE";

        public static final String REPLICATIONPROGRESS = "REPLICATIONPROGRESS";

        public static final String TIMINGVAL = "TIMINGVAL";

        public static final String ISROLLBACK = "ISROLLBACK";

        public static final String SECRESDATASTATUS = "SECRESDATASTATUS";

        public static final String POOLNAME = "POOLNAME";

        public static final String REPLICATIONMODEL = "REPLICATIONMODEL";

        public static final String PRIRESDATASTATUS = "PRIRESDATASTATUS";

        public static final String SECRESACCESS = "SECRESACCESS";

        public static final String ISSECRESBEWRITE = "ISSECRESBEWRITE";

        public static final String ISINCG = "ISINCG";

        public static final String CGID = "CGID";

        public static final String CGNAME = "CGNAME";

        public static final String ISDATASYNC = "ISDATASYNC";

        public static final String ISLOCALDELETE = "ISLOCALDELETE";

        public static final String TOSYNCSRWHENDELETE = "TOSYNCSRWHENDELETE";

        public static final String ENABLEENCRYPT = "ENABLEENCRYPT";

        public static final String ENABLECOMPRESS = "ENABLECOMPRESS";

        public static final String COMPRESSLEVEL = "COMPRESSLEVEL";

        public static final String CAPACITYBYTE = "CAPACITYBYTE";

        public static final String TRANSPORTDATASIZE = "TRANSPORTDATASIZE";

        public static final String LOCALSNAPVERS = "LOCALSNAPVERS";

        public static final String REMOTESNAPVERS = "REMOTESNAPVERS";

        public static final String REMOTESNAPEXPIRATIONTIME = "REMOTESNAPEXPIRATIONTIME";

        public static final String ISENABLEFILTERRULE = "ISENABLEFILTERRULE";

        public static final String SYNCHRONIZESCHEDULE = "SYNCHRONIZESCHEDULE";

        public static final String FILTERRULEDETAIL = "FILTERRULEDETAIL";

        public static final String LOCALIPADDRPOOL = "LOCALIPADDRPOOL";

        public static final String REMOTEIPADDRPOOL = "REMOTEIPADDRPOOL";

        public static final String WORKERPERNODE = "WORKERPERNODE";

        public static final String ISENABLEDEDUPE = "ISENABLEDEDUPE";

        public static final String REMAINTIME = "REMAINTIME";

        public static final String PRILUNCAPACITYBYTE = "PRILUNCAPACITYBYTE";

    }

    /**
     * 系统状态
     * 
     * 详细： 1 命令字：GET_CURRENT_NODE_STATUS、GET_SYSTEM_STATUS 2. 命令类型： 3. 命令参数：
     * 
     * <功能详细描述>
     * 
     * @author w90006898
     * @date 2012-10-22
     * @see [相关类/方法]
     * @version [版本号V001R010C00, 2011-12-14]
     */
    public static class SysStatus
    {
        /** 公共属性STATUS */
        public static final String STATUS = "status"; // 系统状态

    }

    /**
     * Cache分区
     * 
     * 详细： 1 命令字：CachePartition 2 命令类型：Cache分区 3 命令参数：CACHEPARTITION
     * 
     */
    public static class CACHEPARTITION extends TLVMOMsg
    {
        /** 是否是默认 */
        public static final String ISDEFAULT = "ISDEFAULT";

        /** 最小读大小 */
        public static final String MINREADSIZE = "MINREADSIZE";

        /** 期望读大小 */
        public static final String EXPECTREADSIZE = "EXPECTREADSIZE";

        /** 最大读Cache大小 */
        public static final String MAXREADSIZE = "MAXREADSIZE";

        /** 最小写大小 */
        public static final String MINWRITESIZE = "MINWRITESIZE";

        /** 期望写大小 */
        public static final String EXPECTWRITESIZE = "EXPECTWRITESIZE";

        /** 最大写Cache大小 */
        public static final String MAXWRITESIZE = "MAXWRITESIZE";

    }

    /**
     * 硬盘池
     * 
     * 详细： 1 命令字：DiskPool 2 命令类型：硬盘池 3 命令参数：DISKPOOL
     * 
     */
    public static class DISKPOOL extends TLVMOMsg
    {
        /** TOTALCAPACITY */
        public static final String TOTALCAPACITY = "TOTALCAPACITY";

        /** SPARECAPACITY */
        public static final String SPARECAPACITY = "SPARECAPACITY";

        /** USEDSPARECAPACITY */
        public static final String USEDSPARECAPACITY = "USEDSPARECAPACITY";

        /** FREECAPACITY */
        public static final String FREECAPACITY = "FREECAPACITY";

        /** SSDTOTALCAPACITY */
        public static final String SSDTOTALCAPACITY = "SSDTOTALCAPACITY";

        /** SSDSPARECAPACITY */
        public static final String SSDSPARECAPACITY = "SSDSPARECAPACITY";

        /** SSDUSEDSPARECAPACITY */
        public static final String SSDUSEDSPARECAPACITY = "SSDUSEDSPARECAPACITY";

        /** SSDFREECAPACITY */
        public static final String SSDFREECAPACITY = "SSDFREECAPACITY";

        /** SASTOTALCAPACITY */
        public static final String SASTOTALCAPACITY = "SASTOTALCAPACITY";

        /** SASSPARECAPACITY */
        public static final String SASSPARECAPACITY = "SASSPARECAPACITY";

        /** SASUSEDSPARECAPACITY */
        public static final String SASUSEDSPARECAPACITY = "SASUSEDSPARECAPACITY";

        /** SASFREECAPACITY */
        public static final String SASFREECAPACITY = "SASFREECAPACITY";

        /** NLSASTOTALCAPACITY */
        public static final String NLSASTOTALCAPACITY = "NLSASTOTALCAPACITY";

        /** NLSASSPARECAPACITY */
        public static final String NLSASSPARECAPACITY = "NLSASSPARECAPACITY";

        /** NLSASUSEDSPARECAPACITY */
        public static final String NLSASUSEDSPARECAPACITY = "NLSASUSEDSPARECAPACITY";

        /** NLSASFREECAPACITY */
        public static final String NLSASFREECAPACITY = "NLSASFREECAPACITY";

        /** SSDHOTSPARESTRATEGY */
        public static final String SSDHOTSPARESTRATEGY = "SSDHOTSPARESTRATEGY";

        /** SASHOTSPARESTRATEGY */
        public static final String SASHOTSPARESTRATEGY = "SASHOTSPARESTRATEGY";

        /** NLSASHOTSPARESTRATEGY */
        public static final String NLSASHOTSPARESTRATEGY = "NLSASHOTSPARESTRATEGY";

        /** //创建/扩容时用于自动选盘 */
        public static final String SSDDISKNUM = "SSDDISKNUM";

        /** //创建/扩容时用于自动选盘 */
        public static final String SASDISKNUM = "SASDISKNUM";

        /** //创建/扩容时用于自动选盘 */
        public static final String NLSASDISKNUM = "NLSASDISKNUM";

        /** usedCapacity **/
        public static final String USEDCAPACITY = "USEDCAPACITY";

        /** SSDusedCapacity **/
        public static final String SSDUSEDCAPACITY = "SSDUSEDCAPACITY";

        /** SASusedCapacity **/
        public static final String SASUSEDCAPACITY = "SASUSEDCAPACITY";

        /** NLSASusedCapacity **/
        public static final String NLSASUSEDCAPACITY = "NLSASUSEDCAPACITY";
    }

    /**
     * LUN数据销毁
     * 
     * 详细： 1 命令字：LUNDESTROYDATA 2 命令类型：LUN数据销毁 3 命令参数：LUNDESTROYDATA
     * 
     */
    public static class LUNDESTROYDATA extends TLVMOMsg
    {
        /** 销毁类型，默认值是DOD */
        public static final String DESTROYTYPE = "DESTROYTYPE";

        /** 用户输入的写次数 */
        public static final String WRITECOUNT = "WRITECOUNT";

        /** 销毁进度 */
        public static final String PROCESS = "PROCESS";
    }

    /**
     * 系统上电结果
     * 
     * 详细： 1 命令字：GET_POWERON_INFO 2 命令类型：系统上电结果 3 命令参数：GET_POWERON_INFO
     * 
     */
    public static class POWERONRESULT extends TLVMOMsg
    {
        /** 状态 */
        public static final String STATUS = "STATUS";

        /** 原因 */
        public static final String ERRCODE = "ERRCODE";

        /** 参数 */
        public static final String PARAM = "PARAM";
    }

    /**
     * LOGININFO
     * @author gWX183785
     * @version V100R001C10
     */
    public static class LOGININFO extends TLVMOMsg
    {
        /** USERGROUP */
        public static final String USERGROUP = "usergroup";

        /** ACCOUNTSTATE_STRING */
        public static final String ACCOUNTSTATE_STRING = "accountstate";

        /** USERNAME */
        public static final String USERNAME = "username";

        /** LEVEL */
        public static final String LEVEL = "level";

        /** USERSCOPE */
        public static final String USERSCOPE = "userscope";

        /** PWDCHANGETIME */
        public static final String PWDCHANGETIME = "pwdchangetime";

        /** DEVICEID */
        public static final String DEVICEID = "deviceid";

        /** BASETOKEN */
        public static final String BASETOKEN = "iBaseToken";
    }

    /**
     * FC链路
     * 
     * 详细： 1 命令字：FCLink 2 命令类型：FC链路 3 命令参数：FCLINK
     * 
     * @author z00231026
     * @version [版本号V001R003C30, 2014-07-22]
     */
    public static class FCLink extends TLVMOMsg
    {
        /** 公共属性ARRAYTYPE */
        public static final String ARRAYTYPE = "ARRAYTYPE"; // 本厂商、第三方

        /** 公共属性BANDWIDTHLIMITSIZE */
        public static final String BANDWIDTHLIMITSIZE = "BANDWIDTHLIMITSIZE"; // 带宽限制开关

        /** 公共属性BANDWIDTHLIMITSWITCH */
        public static final String BANDWIDTHLIMITSWITCH = "BANDWIDTHLIMITSWITCH"; // 带宽限制开关

        /** 公共属性BANDWIDTHLIMITUNIT */
        public static final String BANDWIDTHLIMITUNIT = "BANDWIDTHLIMITUNIT"; // 限制带宽单位

        /** 公共属性BANDWIDTHLIMITUTILIZATION */
        public static final String BANDWIDTHLIMITUTILIZATION = "BANDWIDTHLIMITUTILIZATION"; // 带宽利用率

        /** 公共属性DEVICEID */
        public static final String DEVICEID = "DEVICEID"; // 设备ID

        /** 公共属性DEVICEMODEL */
        public static final String DEVICEMODEL = "DEVICEMODEL"; // 远端设备型号

        /** 公共属性DEVICENAME */
        public static final String DEVICENAME = "DEVICENAME"; // 远端设备名称

        /** 公共属性DEVICEWWN */
        public static final String DEVICEWWN = "DEVICEWWN"; // 远端设备WWN

        /** 公共属性FCLINKLOCALPORTWWPN */
        public static final String FCLINKLOCALPORTWWPN = "FCLINKLOCALPORTWWPN"; // FC链路本地端口WWPN

        /** 公共属性FCLINKREMOTEPORTWWPN */
        public static final String FCLINKREMOTEPORTWWPN = "FCLINKREMOTEPORTWWPN"; // FC链路远端端口WWPN

        /** 公共属性LINKUSAGE */
        public static final String LINKUSAGE = "LINKUSAGE"; // 链路用途

        /** 公共属性LOCALCONTROLID */
        public static final String LOCALCONTROLID = "LOCALCONTROLID"; // 本端控制器ID

        /** 公共属性LOCALPORTID */
        public static final String LOCALPORTID = "LOCALPORTID"; // 本端端口ID

        /** 公共属性REMOTECONTROLID */
        public static final String REMOTECONTROLID = "REMOTECONTROLID"; // 远端控制器ID

        /** 公共属性REMOTEPORTID */
        public static final String REMOTEPORTID = "REMOTEPORTID"; // 远端端口ID

        /** 公共属性REMOTESN */
        public static final String REMOTESN = "REMOTESN"; // 远端设备SN

        /** 公共属性VENDOR */
        public static final String VENDOR = "VENDOR"; // 厂商

        /** 公共属性REMOTEUSERNAME */
        public static final String REMOTEUSERNAME = "REMOTEUSERNAME"; // iSCSI链路：远端阵列用户名

        /** 公共属性REMOTEPASSWORD */
        public static final String REMOTEPASSWORD = "REMOTEPASSWORD"; // iSCSI链路：远端阵列密码

        /** 公共属性REMOTELOGINTYPE */
        public static final String REMOTELOGINTYPE = "REMOTELOGINTYPE"; // iSCSI链路：远端阵列登录类型

        /** 公共属性LUNNUM */
        public static final String LUNNUM = "LUNNUM"; //

    }

    /**
     * RemoteDevice
     * 
     * 详细： 1 命令字：RemoteDevice 2 命令类型：远端设备 3 命令参数：REMOTEDEVICE
     * 
     * @author z00231026
     * @version [版本号V001R003C30, 2014-07-22]
     */
    public static class RemoteDevice extends TLVMOMsg
    {
        /** 公共属性ARRAYTYPE */
        public static final String ARRAYTYPE = "ARRAYTYPE";//

        /** 公共属性COMPRESSSTATUS */
        public static final String COMPRESSSTATUS = "COMPRESSSTATUS";//

        /** 公共属性CONSULTSTATUS */
        public static final String CONSULTSTATUS = "CONSULTSTATUS";//

        /** 公共属性DEVICEMODEL */
        public static final String DEVICEMODEL = "DEVICEMODEL";//

        /** 公共属性ENABLEENCRYPT */
        public static final String ENABLEENCRYPT = "ENABLEENCRYPT";//

        /** 公共属性ENCRYPTPASSWORD */
        public static final String ENCRYPTPASSWORD = "ENCRYPTPASSWORD";// 传输数据加密的密码

        /** 公共属性FCLINKNUM */
        public static final String FCLINKNUM = "FCLINKNUM";//

        /** 公共属性ISCSILINKNUM */
        public static final String ISCSILINKNUM = "ISCSILINKNUM";//

        /** 公共属性LINKNUM */
        public static final String LINKNUM = "LINKNUM";//

        /** 公共属性SERVICETYPE */
        public static final String SERVICETYPE = "SERVICETYPE";//

        /** 公共属性SN */
        public static final String SN = "SN";//

        /** 公共属性VENDOR */
        public static final String VENDOR = "VENDOR";//

        /** 公共属性WWN */
        public static final String WWN = "WWN";//

        /** 公共属性REMOTEUSERNAME */
        public static final String REMOTEUSERNAME = "REMOTEUSERNAME"; // iSCSI链路：远端阵列用户名

        /** 公共属性REMOTEPASSWORD */
        public static final String REMOTEPASSWORD = "REMOTEPASSWORD"; // iSCSI链路：远端阵列密码

        /** 公共属性REMOTELOGINTYPE */
        public static final String REMOTELOGINTYPE = "REMOTELOGINTYPE"; // iSCSI链路：远端阵列登录类型

        /** 公共属性IPLINKNUM */
        public static final String IPLINKNUM = "IPLINKNUM";//
    }

    /**
     * RemoteDeviceBuilder
     * 
     * 详细： 1 命令字：RemoteDeviceBuilder 2 命令类型：远端设备 3 命令参数：REMOTEDEVICE
     * 
     * @author z00231026
     * @version [版本号V001R003C30, 2014-07-22]
     */
    public static class RemoteDeviceBuilder extends TLVMOMsg
    {
        /** 公共属性ARRAYTYPE */
        public static final String ARRAYTYPE = "ARRAYTYPE";//

        /** 公共属性FCLINKID */
        public static final String FCLINKID = "FCLINKID";//

        /** 公共属性REMOTEUSERNAME */
        public static final String REMOTEUSERNAME = "REMOTEUSERNAME"; // 远端阵列用户名

        /** 公共属性REMOTEPASSWORD */
        public static final String REMOTEPASSWORD = "REMOTEPASSWORD"; // 远端阵列密码

        /** 公共属性ISCSILINKLOCALCONTROLID */
        public static final String ISCSILINKLOCALCONTROLID = "ISCSILINKLOCALCONTROLID";//

        /** 公共属性ISCSILINKLOCALPORTID */
        public static final String ISCSILINKLOCALPORTID = "ISCSILINKLOCALPORTID";//

        /** 公共属性ISCSILINKREMOTEIP */
        public static final String ISCSILINKREMOTEIP = "ISCSILINKREMOTEIP";//

        /** 公共属性ISCSILINKREMOTETCPPORT */
        public static final String ISCSILINKREMOTETCPPORT = "ISCSILINKREMOTETCPPORT";//

        /** 公共属性ISCSILINKENABLECHAP */
        public static final String ISCSILINKENABLECHAP = "ISCSILINKENABLECHAP";//

        /** 公共属性ISCSILINKCHAPUSER */
        public static final String ISCSILINKCHAPUSER = "ISCSILINKCHAPUSER";//

        /** 公共属性ISCSILINKCHAPPASSWD */
        public static final String ISCSILINKCHAPPASSWD = "ISCSILINKCHAPPASSWD";//

        /** 公共属性ISCSILINKRECOVERYPOLICY */
        public static final String ISCSILINKRECOVERYPOLICY = "ISCSILINKRECOVERYPOLICY";//

        /** 公共属性ISCSILINK_REMOTEUSERNAME */
        public static final String ISCSILINK_REMOTEUSERNAME = "ISCSILINK_REMOTEUSERNAME"; // iSCSI链路：远端阵列用户名

        /** 公共属性ISCSILINK_REMOTEPASSWORD */
        public static final String ISCSILINK_REMOTEPASSWORD = "ISCSILINK_REMOTEPASSWORD"; // iSCSI链路：远端阵列密码

        /** 公共属性REMOTELOGINTYPE */
        public static final String REMOTELOGINTYPE = "REMOTELOGINTYPE"; // iSCSI链路：远端阵列登录类型

        /** 公共属性IPLINKLOCALLIFID */
        public static final String IPLINKLOCALLIFID = "IPLINKLOCALLIFID";//

        /** 公共属性LOCALCONTROLID */
        public static final String LOCALCONTROLID = "LOCALCONTROLID";//

        /** 公共属性LOCALPORTID */
        public static final String LOCALPORTID = "LOCALPORTID";//

        /** 公共属性REMOTEIP */
        public static final String REMOTEIP = "REMOTEIP";//

        /** 公共属性PORT */
        public static final String PORT = "PORT";//

        /** 公共属性RECOVERY_POLICY */
        public static final String RECOVERY_POLICY = "RECOVERY_POLICY";//

        /** 公共属性ENABLECHAP */
        public static final String ENABLECHAP = "ENABLECHAP";//
    }

    /**
     * RemoteLun
     * 
     * 详细： 1 命令字：RemoteLun 2 命令类型：远端LUN 3 命令参数：REMOTELUN
     * 
     * @author z00231026
     * @version [版本号V001R003C30, 2014-07-22]
     */
    public static class RemoteLun extends TLVMOMsg
    {
        /** 公共属性LUNID */
        public static final String LUNID = "LUNID"; // 远端lunid，位于本厂商设备时返回

        /** 公共属性DEVICEID */
        public static final String DEVICEID = "DEVICEID"; // 远端设备ID

        /** 公共属性DEVICESN */
        public static final String DEVICESN = "DEVICESN"; // 设备序列号，位于本厂商设备时返回

        /** 公共属性USED */
        public static final String UESD = "UESD"; // 是否被复制业务使用

        /** 公共属性CAPACITY */
        public static final String CAPACITY = "CAPACITY"; //

        /** 公共属性LUNCOPYIDS */
        public static final String LUNCOPYIDS = "LUNCOPYIDS"; // LUN拷贝ID列表

        /** 公共属性REMOTEREPLICATIONIDS */
        public static final String REMOTEREPLICATIONIDS = "REMOTEREPLICATIONIDS"; // 远程复制ID列表

        /** 公共属性LUNWWN */
        public static final String LUNWWN = "LUNWWN"; //

        /** 公共属性ARRAYTYPE */
        public static final String ARRAYTYPE = "ARRAYTYPE"; //

        /** 公共属性VENDOR */
        public static final String VENDOR = "VENDOR"; // 厂商名称

        /** 公共属性MODEL */
        public static final String MODEL = "MODEL"; // LUN所属设备型号

        /** 公共属性SECTORDIZE */
        public static final String SECTORDIZE = "SECTORDIZE"; // 块大小

        /** 公共属性HOSTLUNID */
        public static final String HOSTLUNID = "HOSTLUNID"; // 主机LUN的ID

        /** 公共属性ISTHINLUN */
        public static final String ISTHINLUN = "ISTHINLUN"; // 是否是thin

        /** 公共属性DEVICEWWN */
        public static final String DEVICEWWN = "DEVICEWWN"; // 设备唯一标识

        /** 公共属性DEVICENAME */
        public static final String DEVICENAME = "DEVICENAME"; // 设备的名称

        /** 公共属性CAPACITYBYTE */
        public static final String CAPACITYBYTE = "CAPACITYBYTE"; //

        /** 公共属性RSSTYPE */
        public static final String RSSTYPE = "RSSTYPE"; // 增值可用远端LUN类型

        /** 公共属性RSSASSOCIATEOBJID */
        public static final String RSSASSOCIATEOBJID = "RSSASSOCIATEOBJID"; // 增值可用远端LUN关联对象ID

        /** 公共属性RESOURCETYPE */
        public static final String RESOURCETYPE = "RESOURCETYPE"; // 资源类型

    }
}
