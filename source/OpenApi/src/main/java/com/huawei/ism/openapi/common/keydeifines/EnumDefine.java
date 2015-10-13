package com.huawei.ism.openapi.common.keydeifines;

/**
 * 文 件 名 :EnumDefine.java 版 本 号 :初稿 生成日期 :2011-10-15 文件描述 :枚举定义
 * @author V1R10
 * @version [版本号V001R010C00, 2011-12-14]
 */
public class EnumDefine
{
    /** 
     * 
     */
    public static enum DOMAIN_TYPE_E
    {
        AD(0), LOCAL(2);
        private int value;

        private DOMAIN_TYPE_E(int value)
        {
            this.value = value;
        }

        public static DOMAIN_TYPE_E valueOf(int value)
        {
            for (DOMAIN_TYPE_E v : DOMAIN_TYPE_E.values())
            {
                if (v.value == value)
                {
                    return v;
                }
            }
            return null;
        }

        public int getValue()
        {
            return this.value;
        }
    }

    /**
     * ASSOCIATE_TYPE_E
     */
    public static enum ASSOCIATE_TYPE_E
    {
        /** 映射 */
        MAPPING(0);

        private int value;

        /**
         * 构造函数
         */
        private ASSOCIATE_TYPE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return ASSOCIATE_TYPE_E 返回结果
         */
        public static ASSOCIATE_TYPE_E valueOf(int iValue)
        {
            for (ASSOCIATE_TYPE_E value : ASSOCIATE_TYPE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * ACCESSVAL_TYPE_E
     */
    public static enum ACCESSVAL_TYPE_E
    {
        /** 只读 */
        READ_ONLY(0),
        /** 读写 */
        READ_WRITE(1);

        private long value;

        /**
         * 构造函数
         */
        private ACCESSVAL_TYPE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return ASSOCIATE_TYPE_E 返回结果
         */
        public static ACCESSVAL_TYPE_E valueOf(int iValue)
        {
            for (ACCESSVAL_TYPE_E value : ACCESSVAL_TYPE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public long getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * ACCESSVAL_TYPE_E
     */
    public static enum ALLSQUASH_TYPE_E
    {
        /** all_squash */
        ALL_SQUASH(0),
        /** no_all_squash */
        NO_ALL_SQUASH(1);

        private long value;

        /**
         * 构造函数
         */
        private ALLSQUASH_TYPE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return ASSOCIATE_TYPE_E 返回结果
         */
        public static ALLSQUASH_TYPE_E valueOf(int iValue)
        {
            for (ALLSQUASH_TYPE_E value : ALLSQUASH_TYPE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public long getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * ACCESSVAL_TYPE_E
     */
    public static enum ROOTSQUASH_TYPE_E
    {
        /** root_squash */
        ROOT_SQUASH(0),
        /** no_root_squash */
        NO_ROOT_SQUASH(1);

        private long value;

        /**
         * 构造函数
         */
        private ROOTSQUASH_TYPE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return ASSOCIATE_TYPE_E 返回结果
         */
        public static ROOTSQUASH_TYPE_E valueOf(int iValue)
        {
            for (ROOTSQUASH_TYPE_E value : ROOTSQUASH_TYPE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public long getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * 定义状态归类枚举: 主要应用于硬件组件的状态
     * @author f90002221
     */
    public static enum STATE_GROUP_E
    {
        /** 枚举变量 */
        NORMAL,
        /** 枚举变量 */
        FAULT,
        /** 枚举变量 */
        WARNING,
        /** 枚举变量 */
        OFFLINE;
    }

    /**
     * 组件的健康状态表示：默认将健康状态分组为WARING,应为大多数状态为警告状态，减少代码的繁冗 HEALTH_STATUS_E
     */
    public static enum HealthStatusE
    {
        /** 未知 */
        UNKNOWN(0),
        /** 正常 */
        NORMAL(1,
        /** 正常 */
        STATE_GROUP_E.NORMAL),
        /** 故障 */
        FAULT(2,
        /** 故障 */
        STATE_GROUP_E.FAULT),
        /** 即将故障 */
        PRE_FAIL(3),
        /** 部分损坏 */
        PART_BROKEN(4),
        /** 降级 */
        DEGRADE(5),
        /** 有坏块 */
        HAS_BAD_BLOCK(6),
        /** 有误码 */
        HAS_ERR_CODE(7),
        /** 一致 */
        CONSISTENT(8,
        /** 一致 */
        STATE_GROUP_E.NORMAL),
        /** 不一致 */
        INCONSISTENT(9),
        /** 繁忙 */
        BUSY(10,
        /** 繁忙 */
        STATE_GROUP_E.NORMAL),
        /** 无输入 */
        POWER_NO_INPUT(11),
        /** 电量不足 */
        POWER_NOT_ENOUGH(12),
        /** 单链路故障 */
        SINGLE_LINK_FAULT(13);

        private STATE_GROUP_E stateGroup = STATE_GROUP_E.WARNING;

        private int value;

        /**
         * 构造函数
         */
        private HealthStatusE(int value)
        {
            this.value = value;
        }

        private HealthStatusE(int value, STATE_GROUP_E stateGroup)
        {
            this.value = value;
            this.stateGroup = stateGroup;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return HEALTH_STATUS_E 返回结果
         */
        public static HealthStatusE valueOf(int iValue)
        {
            for (HealthStatusE value : HealthStatusE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 将当前状态分组进行归纳
         * @return STATE_GROUP_E 返回结果
         */
        public STATE_GROUP_E group()
        {
            return this.stateGroup;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * 认证模式
     */
    public static enum SecurityModelE
    {
        /**
         * 本地认证
         */
        LOCAL(1),
        /**
         * 域认证
         */
        DOMAIN(2),
        /**
         * 本地认证和域认证
         */
        DOMAINANDLOCAL(3);

        private int value;

        /**
         * 构造函数
         */
        private SecurityModelE(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return HEALTH_STATUS_E 返回结果
         */
        public static SecurityModelE valueOf(int iValue)
        {
            for (SecurityModelE value : SecurityModelE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * 组件的运行状态表示：默认将运行状态分组为正常,因为为大多数状态为正常状态，减少代码的繁冗
     */
    public static enum RunningStatusE
    {
        /** 未知 */
        UNKNOWN(0,
        /** 未知 */
        STATE_GROUP_E.OFFLINE),
        /** 正常 */
        NORMAL(1),
        /** 工作 */
        RUNNING(2),
        /** 未工作 */
        NOT_RUNNING(3,
        /** 未工作 */
        STATE_GROUP_E.OFFLINE),
        /** 不存在 */
        NOT_EXIST(4,
        /** 不存在 */
        STATE_GROUP_E.OFFLINE),
        /** 高温休眠 */
        HIGH_TEMPERATURE_SLEEP(5,
        /** 高温休眠 */
        STATE_GROUP_E.WARNING),

        /** 启动中 */
        STARTING(6),
        /** 掉电保护 */
        POWER_FAILURE_PROTECTING(7,
        /** 掉电保护 */
        STATE_GROUP_E.WARNING),
        /** 休眠 */
        SLEEPING(8),
        /** 启动 */
        SPINGUP(9),
        /** 连接 */
        LINK_UP(10),
        /** 未连接 */
        LINK_DOWN(11,
        /** 未连接 */
        STATE_GROUP_E.WARNING),
        /** 上电中 */
        POWER_ON(12),
        /** 已下电 */
        POWER_OFF(13,
        /** 已下电 */
        STATE_GROUP_E.WARNING),
        /** 预拷贝 */
        PRE_COPY(14),
        /** 回拷 */
        COPYBACK(15),
        /** 重构 */
        RECONSTRUCTION(16,
        /** 重构 */
        STATE_GROUP_E.WARNING),
        /** 扩容 */
        EXPANSION(17),
        /** 未格式化 */
        NOT_FORMAT(18),
        /** 格式化 */
        FORMATTING(19),
        /** 未映射 */
        UNMAPPING(20),
        /** 数据初始同步中 */
        INITIAL_SYNCHRONIZING(21),
        /** 数据一致(未作最新同步) */
        CONSISTENT(22),
        /** 同步中 */
        SYNCHRONIZING(23),
        /** 已同步 */
        SYNCHRONIZED(24),
        /** 未同步 */
        NOT_SYNCHRONIZED(25),
        /** 已分裂 */
        SPLIT(26),
        /** 在线 */
        ONLINE(27),
        /** 离线 */
        OFFLINE(28,
        /** 离线 */
        STATE_GROUP_E.OFFLINE),
        /** 锁定 */
        LOCKED(29),
        /** 已启用 */
        ENABLE(30),
        /** 已禁用 */
        DISABLED(31),
        /** 均衡 */
        LEVELING(32),
        /** 待恢复 */
        TO_BE_RECOVERD(33),
        /** 异常断开 */
        INTERRUPTED(34,
        /** 异常断开 */
        STATE_GROUP_E.WARNING),
        /** 镜像失效 */
        INVALID(35),
        /** 未开始 */
        NOSTART(36),
        /** 排队等待中 */
        QUEUING(37),
        /** 停止 */
        STOP(38),
        /** 拷贝中 */
        COPYING(39),
        /** 拷贝完成 */
        COMPLETED(40),
        /** 暂停 */
        PAUSE(41),
        /** 反向同步中 */
        REVSYNCHRONIZING(42),
        /** 激活 */
        ACTIVATED(43),
        /** 回滚中 */
        ROLLBACK(44),
        /** 未激活 */
        INACTIVATED(45),
        /** 空闲 */
        IDLE(46),
        /** 正在下电 */
        POWERING_OFF(47),
        /** 正在充电 */
        CHARGING(48),
        /** 充电完成 */
        CHARGED(49),
        /** 正在放电 */
        DISCHARGING(50),
        /** 正在升级 */
        UPGRADING(51),
        /** 正常运行 */
        ERASEMENT_RUNNING_NORMAL(63),
        /** 销毁失败 */
        ERASEMENT_RUNNING_FAIL(64),
        /** 销毁成功 */
        ERASEMENT_RUNNING_SUCCESS(65);

        private STATE_GROUP_E stateGroup = STATE_GROUP_E.NORMAL;

        private int value;

        /**
         * 构造函数
         */
        private RunningStatusE(int value)
        {
            this.value = value;
        }

        private RunningStatusE(int value, STATE_GROUP_E stateGroup)
        {
            this.value = value;
            this.stateGroup = stateGroup;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return RUNNING_STATUS_E 返回结果
         */
        public static RunningStatusE valueOf(int iValue)
        {
            for (RunningStatusE value : RunningStatusE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 将当前状态分组进行归纳
         * @return STATE_GROUP_E 返回结果
         */
        public STATE_GROUP_E group()
        {
            return this.stateGroup;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * LUN_ALLOC_TYPE_E
     */
    public static enum LUNAllocTypeE
    {
        /** 普通配置 */
        THICK(0),
        /** 精简配置 */
        THIN(1);

        private int value;

        /**
         * 构造函数
         */
        private LUNAllocTypeE(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数
         * 
         * @return LUN_ALLOC_TYPE_E 返回结果
         */
        public static LUNAllocTypeE valueOf(int iValue)
        {
            for (LUNAllocTypeE value : LUNAllocTypeE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }

            return null;
        }

        /**
         * 方法返回枚举对应的描述
         * 
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

        /**
         * 取得枚举的整型值
         * 
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

    }

    /**
     * SNAP_BELONG_E
     */
    public static enum SNAP_BELONG_E
    {
        /** 公有快照 */
        PUBLIC(1),
        /** 私有快照 */
        PRIVATE(2);

        private int value;

        /**
         * 构造函数
         */
        private SNAP_BELONG_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return SNAP_BELONG_E 返回结果
         */
        public static SNAP_BELONG_E valueOf(int iValue)
        {
            for (SNAP_BELONG_E value : SNAP_BELONG_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * SNAP_SPEED_E
     */
    public static enum SNAP_SPEED_E
    {
        /** 低 */
        SPEED_LEVEL_LOW(1),
        /** 中等 */
        SPEED_LEVEL_MIDDLE(2),
        /** 高 */
        SPEED_LEVEL_HIGH(3),
        /** 最高 */
        SPEED_LEVEL_ASAP(4);

        private int value;

        /**
         * 构造函数
         */
        private SNAP_SPEED_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return SNAP_SPEED_E 返回结果
         */
        public static SNAP_SPEED_E valueOf(int iValue)
        {
            for (SNAP_SPEED_E value : SNAP_SPEED_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * INI_OR_TGT_E
     */
    public static enum IniOrTgtE
    {
        /** 启动器 */
        INI(2),
        /** 目标器 */
        TGT(3),
        /** 启动器和目标器 */
        INI_AND_TGT(4);

        private int value;

        /**
         * 构造函数
         */
        private IniOrTgtE(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return INI_OR_TGT_E 返回结果
         */
        public static IniOrTgtE valueOf(int iValue)
        {
            for (IniOrTgtE value : IniOrTgtE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * DISK_TYPE_E
     */
    public static enum DiskTypeE
    {
        /** FC */
        FC(0),
        /** SAS */
        SAS(1),
        /** SATA */
        SATA(2),
        /** SSD */
        SSD(3),
        /** NL_SAS */
        NL_SAS(4),
        /** SLC SSD */
        SLC_SSD(5),
        /** MLC SSD */
        MLC_SSD(6);

        private int value;

        /**
         * 构造函数
         */
        private DiskTypeE(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return DISK_TYPE_E 返回结果
         */
        public static DiskTypeE valueOf(int iValue)
        {
            for (DiskTypeE value : DiskTypeE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * DISK_LOGIC_TYPE_E
     */
    public static enum DiskLogicTypeE
    {
        /** 空闲盘 */
        FREE(1),
        /** 成员盘 */
        MEMBER(2),
        /** 热备 */
        SPARE(3),
        /** 缓存盘 */
        CACHE(4);

        private int value;

        /**
         * 构造函数
         */
        private DiskLogicTypeE(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return DISK_LOGIC_TYPE_E 返回结果
         */
        public static DiskLogicTypeE valueOf(int iValue)
        {
            for (DiskLogicTypeE value : DiskLogicTypeE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }
    }

    /**
     * PORT_LOGIC_TYPE_E 网口逻辑类型
     */
    public static enum PortLogicTypeE
    {
        /**
         * 主机端口
         */
        HOST(0),

        /**
         * 级联端口
         */
        EXP(1),

        /**
         * 管理端口
         */
        MNGT(2),

        /**
         * 内部端口
         */
        INNER(3),

        /**
         * 维护端口
         */
        MAINTENANCE(4),

        /**
         * 管理业务口
         */
        MNGT_SRV(5),

        /**
         * 维护业务口
         */
        MAINTENANCE_SRV(6);

        private int value;

        /**
         * 构造函数
         */
        private PortLogicTypeE(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return PORT_LOGIC_TYPE_E 返回结果
         */
        public static PortLogicTypeE valueOf(int iValue)
        {
            for (PortLogicTypeE value : PortLogicTypeE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * PORT_SFP_STATUS_E
     */
    public static enum PORT_SFP_STATUS_E
    {
        /** 端口没有光模块 */
        NO_NEED(0),
        /** 离线 */
        OFFLINE(1),
        /** 在线 */
        ONLINE(2);

        private int value;

        /**
         * 构造函数
         */
        private PORT_SFP_STATUS_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return PORT_SFP_STATUS_E 返回结果
         */
        public static PORT_SFP_STATUS_E valueOf(int iValue)
        {
            for (PORT_SFP_STATUS_E value : PORT_SFP_STATUS_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * FC_PORT_MODE_E
     */
    public static enum FCPortModeE
    {
        /** 未知 */
        UNKNOWN(-1),
        /** Fabric */
        FABRIC(0),
        /** FC-AL */
        LOOP(1),
        /** P2P */
        POINT2POINT(2),
        /** AUTO */
        AUTO(3);

        private int value;

        /**
         * 构造函数
         */
        private FCPortModeE(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return FC_PORT_MODE_E 返回结果
         */
        public static FCPortModeE valueOf(int iValue)
        {
            for (FCPortModeE value : FCPortModeE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * ETH_PORT_DUPLEX_E
     */
    public static enum ETH_PORT_DUPLEX_E
    {
        /** 半双工 */
        HALF_DUPLEX(1),
        /** 全双工 */
        DUPLEX(2),
        /** 自协商 */
        AUTO(3);

        private int value;

        /**
         * 构造函数
         */
        private ETH_PORT_DUPLEX_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return ETH_PORT_DUPLEX_E 返回结果
         */
        public static ETH_PORT_DUPLEX_E valueOf(int iValue)
        {
            for (ETH_PORT_DUPLEX_E value : ETH_PORT_DUPLEX_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * FAN_LEVEL_E
     */
    public static enum FAN_LEVEL_E
    {
        /** 枚举变量 */
        /** 低 */
        UNKNOWN(-1),
        /** 枚举变量 */
        /** 低 */
        LOW(0),
        /** 正常 */
        NORMAL(1),
        /** 高 */
        HIGH(2);

        private int value;

        /**
         * 构造函数
         */
        private FAN_LEVEL_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return FAN_LEVEL_E 返回结果
         */
        public static FAN_LEVEL_E valueOf(int iValue)
        {
            for (FAN_LEVEL_E value : FAN_LEVEL_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }

            return UNKNOWN;
            // return null;("wrong FAN_LEVEL_E value:"
            // + iValue);
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * SPEED_LEVEL_3_E
     */
    public static enum SPEED_LEVEL_3_E
    {
        /** 低 */
        LOW(1),
        /** 中等 */
        MEDIUM(2),
        /** 高 */
        HIGH(3);

        private int value;

        /**
         * 构造函数
         */
        private SPEED_LEVEL_3_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return SPEED_LEVEL_3_E 返回结果
         */
        public static SPEED_LEVEL_3_E valueOf(int iValue)
        {
            for (SPEED_LEVEL_3_E value : SPEED_LEVEL_3_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * PREDICTION_SWITCH_E
     */
    public static enum PREDICTION_SWITCH_E
    {
        /** 开 */
        ON(1),
        /** 关 */
        OFF(2);

        private int value;

        /**
         * 构造函数
         */
        private PREDICTION_SWITCH_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return PREDICTION_SWITCH_E 返回结果
         */
        public static PREDICTION_SWITCH_E valueOf(int iValue)
        {
            for (PREDICTION_SWITCH_E value : PREDICTION_SWITCH_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * MIGRATION_MODE_E
     */
    public static enum MIGRATION_MODE_E
    {
        /** 自动 */
        AUTO(1),
        /** 手动 */
        MANUAL(2);

        private int value;

        /**
         * 构造函数
         */
        private MIGRATION_MODE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return MIGRATION_MODE_E 返回结果
         */
        public static MIGRATION_MODE_E valueOf(int iValue)
        {
            for (MIGRATION_MODE_E value : MIGRATION_MODE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * HOTSPARE_SPACE_STRATEGY_E
     */
    public static enum HOTSPARE_SPACE_STRATEGY_E
    {
        /** 低 */
        LOW(1),
        /** 高 */
        HIGH(2),
        /** 无 */
        NONE(3);

        private int value;

        /**
         * 构造函数
         */
        private HOTSPARE_SPACE_STRATEGY_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return HOTSPARE_SPACE_STRATEGY_E 返回结果
         */
        public static HOTSPARE_SPACE_STRATEGY_E valueOf(int iValue)
        {
            for (HOTSPARE_SPACE_STRATEGY_E value : HOTSPARE_SPACE_STRATEGY_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 枚举对象顺序的比较方法
         * @param oldValue 比较对象
         * @return int 返回结果
         */
        public int compareEnum(HOTSPARE_SPACE_STRATEGY_E oldValue)
        {
            return 0;
            /*
             * int newValueNum = 0; int oldValueNum = 0; switch (this.value) {
             * case 1: newValueNum = IsmConstant.CONST_TWO; break; case
             * MagicNumber.INT2: newValueNum = IsmConstant.CONST_THREE; break;
             * case MagicNumber.INT3: newValueNum = IsmConstant.CONST_ONE;
             * break; default: break; } switch (oldValue.value) { case 1:
             * oldValueNum = IsmConstant.CONST_TWO; break; case
             * MagicNumber.INT2: oldValueNum = IsmConstant.CONST_THREE; break;
             * case MagicNumber.INT3: oldValueNum = IsmConstant.CONST_ONE;
             * break; default: break; } if (newValueNum > oldValueNum) { return
             * 1; } else if (newValueNum < oldValueNum) { return -1; } else {
             * return 0; }
             */
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * DST_STATUS_E
     */
    public static enum DST_STATUS_E
    {
        /** 活跃 */
        ACTIVE(1),
        /** 不活跃 */
        INACTIVE(2);

        private int value;

        /**
         * 构造函数
         */
        private DST_STATUS_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return DST_STATUS_E 返回结果
         */
        public static DST_STATUS_E valueOf(int iValue)
        {
            for (DST_STATUS_E value : DST_STATUS_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * SWITCH_E
     */
    public static enum SWITCH_E
    {
        /** 开 */
        ON(1),
        /** 关 */
        OFF(2);

        private int value;

        /**
         * 构造函数
         */
        private SWITCH_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return SWITCH_E 返回结果
         */
        public static SWITCH_E valueOf(int iValue)
        {
            for (SWITCH_E value : SWITCH_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * CACHE_WRITE_BACK_E
     */
    public static enum CACHE_WRITE_BACK_E
    {
        /** 回写 */
        WRITE_BACK(1),
        /** 透写 */
        WRITE_THROUGH(2),
        /** 强制回写 */
        WRITE_BACK_MANDATORY(3);

        private int value;

        /**
         * 构造函数
         */
        private CACHE_WRITE_BACK_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return CACHE_WRITE_BACK_E 返回结果
         */
        public static CACHE_WRITE_BACK_E valueOf(int iValue)
        {
            for (CACHE_WRITE_BACK_E value : CACHE_WRITE_BACK_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * CACHE_MIRROR_STATUS_E
     */
    public static enum CACHE_MIRROR_STATUS_E
    {
        /** 非镜像 */
        CACHE_MIRROR_DISABLE(0),
        /** 镜像 */
        CACHE_MIRROR_ENABLE(1);

        private int value;

        /**
         * 构造函数
         */
        private CACHE_MIRROR_STATUS_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return CACHE_MIRROR_STATUS_E 返回结果
         */
        public static CACHE_MIRROR_STATUS_E valueOf(int iValue)
        {
            for (CACHE_MIRROR_STATUS_E value : CACHE_MIRROR_STATUS_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * CACHE_READ_AHEAD_STRATEGY_E
     */
    public static enum CACHE_READ_AHEAD_STRATEGY_E
    {
        /** 不预取 */
        CACHE_READ_AHEAD_STRATEGY_NOTHING(0),
        /** 固定预取 */
        CACHE_READ_AHEAD_STRATEGY_FASTNESS(1),
        /** 可变预取 */
        CACHE_READ_AHEAD_STRATEGY_MULTIPLIER(2),
        /** 只能预取 */
        CACHE_READ_AHEAD_STRATEGY_INTELLIGENT(3);

        private int value;

        /**
         * 构造函数
         */
        private CACHE_READ_AHEAD_STRATEGY_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return CACHE_READ_AHEAD_STRATEGY_E 返回结果
         */
        public static CACHE_READ_AHEAD_STRATEGY_E valueOf(int iValue)
        {
            for (CACHE_READ_AHEAD_STRATEGY_E value : CACHE_READ_AHEAD_STRATEGY_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * RAID_LEVEL_E
     */
    public static enum RaidLevelE
    {
        /** RAID10 */
        RAID_LEVEL_RAID10(1),
        /** RAID5 */
        RAID_LEVEL_RAID5(2),
        /** RAID0 */
        RAID_LEVEL_RAID0(3),
        /** RAID1 */
        RAID_LEVEL_RAID1(4),
        /** RAID6 */
        RAID_LEVEL_RAID6(5),
        /** RAID50 */
        RAID_LEVEL_RAID50(6),
        /** RAID3 */
        RAID_LEVEL_RAID3(7);

        private int value;

        /**
         * 构造函数
         */
        private RaidLevelE(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return RAID_LEVEL_E 返回结果
         */
        public static RaidLevelE valueOf(int iValue)
        {
            for (RaidLevelE value : RaidLevelE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * RM_UPDATE_TYPE_E
     */
    public static enum RM_UPDATE_TYPE_E
    {
        /** 未知 */
        UNKNOWN(-1),
        /** 手动同步 */
        RM_UPDATE_TYPE_MANUAL(1),
        /** 同步开始后定时等待 */
        RM_UPDATE_TYPE_AUTO_START_TIMING(2),
        /** 同步完成后定时等待 */
        RM_UPDATE_TYPE_AUTO_END_TIMING(3);

        private int value;

        /**
         * 构造函数
         */
        private RM_UPDATE_TYPE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return RM_UPDATE_TYPE_E 返回结果
         */
        public static RM_UPDATE_TYPE_E valueOf(int iValue)
        {
            for (RM_UPDATE_TYPE_E value : RM_UPDATE_TYPE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            // return null;("wrong RM_UPDATE_TYPE_E value:"
            // + iValue);
            return UNKNOWN;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * RM_LUN_MIRROR_STATE_E
     */
    public static enum RM_LUN_MIRROR_STATE_E
    {
        /** 已同步 */
        RM_LUN_MIRROR_STATE_SYNCED(1),
        /** 一致 */
        RM_LUN_MIRROR_STATE_CONSISTENT(2),
        /** 同步中 */
        RM_LUN_MIRROR_STATE_SYNCING(3),
        /** 初始同步 */
        RM_LUN_MIRROR_STATE_INIT_SYNCING(4),
        /** 不一致 */
        RM_LUN_MIRROR_STATE_INCONSISTENT(5);
        // RM_LUN_MIRROR_STATE_NOT_SYNC(6); //未同步

        private int value;

        /**
         * 构造函数
         */
        private RM_LUN_MIRROR_STATE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return RM_LUN_MIRROR_STATE_E 返回结果
         */
        public static RM_LUN_MIRROR_STATE_E valueOf(int iValue)
        {
            for (RM_LUN_MIRROR_STATE_E value : RM_LUN_MIRROR_STATE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * RESOURCE_ACCESS_E
     */
    public static enum RESOURCE_ACCESS_E
    {
        /** 禁止访问 */
        NOACCESS(1),
        /** 只读 */
        READ_ONLY(2),
        /** 读写 */
        READ_WRITE(3);

        private int value;

        /**
         * 构造函数
         */
        private RESOURCE_ACCESS_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return RESOURCE_ACCESS_E 返回结果
         */
        public static RESOURCE_ACCESS_E valueOf(int iValue)
        {
            for (RESOURCE_ACCESS_E value : RESOURCE_ACCESS_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * DDP_COMP_LEVEL_E
     */
    public static enum DDP_COMP_LEVEL_E
    {
        /** 速度快 */
        DDP_COMP_LEVEL_FAST(0),
        /** 速度相当 */
        DDP_COMP_LEVEL_MIDDLE(1),
        /** 速度最慢 */
        DDP_COMP_LEVEL_DEEP(2);

        private int value;

        /**
         * 构造函数
         */
        private DDP_COMP_LEVEL_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return RESOURCE_ACCESS_E 返回结果
         */
        public static DDP_COMP_LEVEL_E valueOf(int iValue)
        {
            for (DDP_COMP_LEVEL_E value : DDP_COMP_LEVEL_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * RM_MODEL_E
     */
    public static enum RM_MODEL_E
    {
        /** 同步 */
        RM_MODEL_SYNC(1),
        /** 异步 */
        RM_MODEL_ASYNC(2);

        private int value;

        /**
         * 构造函数
         */
        private RM_MODEL_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return RM_MODEL_E 返回结果
         */
        public static RM_MODEL_E valueOf(int iValue)
        {
            for (RM_MODEL_E value : RM_MODEL_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * SPEED_LEVEL_E
     */
    public static enum SpeedLevelE
    {
        UNKNOWN(-1),
        /** 低 */
        SPEED_LEVEL_LOW(1),
        /** 中等 */
        SPEED_LEVEL_MIDDLE(2),
        /** 高 */
        SPEED_LEVEL_HIGH(3),
        /** 最高 */
        SPEED_LEVEL_ASAP(4);

        private int value;

        /**
         * 构造函数
         */
        private SpeedLevelE(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return SPEED_LEVEL_E 返回结果
         */
        public static SpeedLevelE valueOf(int iValue)
        {
            for (SpeedLevelE value : SpeedLevelE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return UNKNOWN;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * LUN_RELATION_E
     */
    public static enum LUN_RELATION_E
    {
        /** 主LUN或源lUN */
        LUN_RELATION_MASTER(1),
        /** 从LUN或目标LUN */
        LUN_RELATION_SLAVE(2);

        private int value;

        /**
         * 构造函数
         */
        private LUN_RELATION_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return LUN_RELATION_E 返回结果
         */
        public static LUN_RELATION_E valueOf(int iValue)
        {
            for (LUN_RELATION_E value : LUN_RELATION_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * CPY_TYPE_E
     */
    public static enum CPY_TYPE_E
    {
        /** 全量LUN拷贝 */
        CPY_TYPE_FULL(1),
        /** 增量LUN拷贝 */
        CPY_TYPE_INCREMENT(2);

        private int value;

        /**
         * 构造函数
         */
        private CPY_TYPE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return CPY_TYPE_E 返回结果
         */
        public static CPY_TYPE_E valueOf(int iValue)
        {
            for (CPY_TYPE_E value : CPY_TYPE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * EXC_AND_REC_MODE_E
     */
    public static enum EXC_AND_REC_MODE_E
    {
        /** 自动恢复 */
        EXC_AND_REC_MODE_AUTO(1),
        /** 手动恢复 */
        EXC_AND_REC_MODE_MANUAL(2);

        private int value;

        /**
         * 构造函数
         */
        private EXC_AND_REC_MODE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return EXC_AND_REC_MODE_E 返回结果
         */
        public static EXC_AND_REC_MODE_E valueOf(int iValue)
        {
            for (EXC_AND_REC_MODE_E value : EXC_AND_REC_MODE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * HYPERCOPY_LUN_TYPE_E
     */
    public static enum HYPERCOPY_LUN_TYPE_E
    {
        /** 本阵列的LUN */
        HYPERCOPY_LUN_TYPE_LOCAL(0),
        /** 外部私有阵列的LUN */
        HYPERCOPY_LUN_TYPE_EXTS5000(1),
        /** 第三方阵列的LUN */
        HYPERCOPY_LUN_TYPE_THIRD(2);

        private int value;

        /**
         * 构造函数
         */
        private HYPERCOPY_LUN_TYPE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return HYPERCOPY_LUN_TYPE_E 返回结果
         */
        public static HYPERCOPY_LUN_TYPE_E valueOf(int iValue)
        {
            for (HYPERCOPY_LUN_TYPE_E value : HYPERCOPY_LUN_TYPE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * HYPERCLONE_LUN_STATUS_E
     */
    public static enum HYPERCLONE_LUN_STATUS_E
    {
        /** 数据不一致 */
        HYPERCLONE_LUN_STATUS_INCONSISTENT(1),
        /** 反向数据不一致 */
        HYPERCLONE_LUN_STATUS_REVINCONSISTENT(2),
        /** 同步中 */
        HYPERCLONE_LUN_STATUS_SYNCHRONIZING(3),
        /** 反向同步中 */
        HYPERCLONE_LUN_STATUS_REVSYNCHRONIZING(4),
        /** 数据一致 */
        HYPERCLONE_LUN_STATUS_CONSISTENT(5),
        /** 同步完成 */
        HYPERCLONE_LUN_STATUS_SYNCHRONIZED(6),
        /** 故障 */
        HYPERCLONE_LUN_STATUS_FAULT(7);

        private int value;

        /**
         * 构造函数
         */
        private HYPERCLONE_LUN_STATUS_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return HYPERCLONE_LUN_STATUS_E 返回结果
         */
        public static HYPERCLONE_LUN_STATUS_E valueOf(int iValue)
        {
            for (HYPERCLONE_LUN_STATUS_E value : HYPERCLONE_LUN_STATUS_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * HYPERCLONE_PAIR_STATUS_E
     */
    public static enum HYPERCLONE_PAIR_STATUS_E
    {
        /** 分裂 */
        HYPERCLONE_PAIR_STATUS_SPLIT(1),
        /** 同步中 */
        HYPERCLONE_PAIR_STATUS_SYNCHRONIZING(2),
        /** 反向同步中 */
        HYPERCLONE_PAIR_STATUS_REVSYNCHRONIZING(3),
        /** 正常 */
        HYPERCLONE_PAIR_STATUS_NORMAL(4),
        /** 排队 */
        HYPERCLONE_PAIR_STATUS_QUEUE(5),
        /** 异常断开 */
        HYPERCLONE_PAIR_STATUS_INTERRUPTED(6),
        /** 待恢复 */
        HYPERCLONE_PAIR_STATUS_TOBERECOVERED(7),
        /** 故障 */
        HYPERCLONE_PAIR_STATUS_FAULT(8);

        private int value;

        /**
         * 构造函数
         */
        private HYPERCLONE_PAIR_STATUS_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return HYPERCLONE_PAIR_STATUS_E 返回结果
         */
        public static HYPERCLONE_PAIR_STATUS_E valueOf(int iValue)
        {
            for (HYPERCLONE_PAIR_STATUS_E value : HYPERCLONE_PAIR_STATUS_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * RM_PAIR_STATE_E
     */
    public static enum RM_PAIR_STATE_E
    {
        /** 正常 */
        RM_PAIR_STATE_NORMAL(1),
        /** 同步中 */
        RM_PAIR_STATE_SYNCING(2),
        /** 待恢复 */
        RM_PAIR_STATE_TO_BE_RECOVERD(3),
        /** 异常断开 */
        RM_PAIR_STATE_INTERRUPTED(4),
        /** 已分裂 */
        RM_PAIR_STATE_SPLITED(5),
        /** 镜像失效 */
        RM_PAIR_STATE_INVALID(6);
        // RM_PAIR_STATE_CG_INTERRUPTED(7); //因一致性组异常断开，导致远程复制异常断开

        private int value;

        /**
         * 构造函数
         */
        private RM_PAIR_STATE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return RM_PAIR_STATE_E 返回结果
         */
        public static RM_PAIR_STATE_E valueOf(int iValue)
        {
            for (RM_PAIR_STATE_E value : RM_PAIR_STATE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * LINK_CONNECT_TYPE_E
     */
    public static enum LINK_CONNECT_TYPE_E
    {
        /** 平行 */
        LINK_CONNECT_TYPE_PARALLEL(1),
        /** 交叉 */
        LINK_CONNECT_TYPE_ACROSS(2);

        private int value;

        /**
         * 构造函数
         */
        private LINK_CONNECT_TYPE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return LINK_CONNECT_TYPE_E 返回结果
         */
        public static LINK_CONNECT_TYPE_E valueOf(int iValue)
        {
            for (LINK_CONNECT_TYPE_E value : LINK_CONNECT_TYPE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * LINK_CONNECT_STATUS_E
     */
    public static enum LINK_CONNECT_STATUS_E
    {
        /** 已连接 */
        LINK_CONNECT_STATUS_CONNECTED(1),
        /** 未连接 */
        LINK_CONNECT_STATUS_UNCONNECTED(2);

        private int value;

        /**
         * 构造函数
         */
        private LINK_CONNECT_STATUS_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return LINK_CONNECT_STATUS_E 返回结果
         */
        public static LINK_CONNECT_STATUS_E valueOf(int iValue)
        {
            for (LINK_CONNECT_STATUS_E value : LINK_CONNECT_STATUS_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * OS_TYPE_E
     */
    public static enum OSTypeE
    {
        /** Linux */
        Linux(0),
        /** Windows */
        Windows(1),
        /** Solaris */
        Solaris(2),
        /** HP-UX */
        HPUX(3),
        /** AIX */
        AIX(4),
        /** XenServer */
        XenServer(5),
        /** Mac OS */
        MacOS(6),
        /** 支持VASA后需要增加ESX */
        ESX(7),
        // VIS6000(8)为HVSV1R1C99新增的类型，只能在cli下创建，cli上显示类型为VIS6000,ISM上显示类型为linux
        /** HVSV1R1C99新增类型 */
        VIS6000(8);

        private int value;

        /**
         * 构造函数
         */
        private OSTypeE(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return OS_TYPE_E 返回结果
         */
        public static OSTypeE valueOf(int iValue)
        {
            for (OSTypeE value : OSTypeE.values())
            {
                if (value.value == iValue)
                {
                    // VIS6000(8)为HVSV1R1C99新增的类型，只能在cli下创建，cli上显示类型为VIS6000,ISM上显示类型为linux
                    if (VIS6000.getValue() == value.value)
                    {
                        return Linux;
                    }
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    // end w00221007 同步问题单P12N-3103
    // 在ISM上创建同步远程复制添加一个从LUN后ISM提示第三方设备不可用，没对第三方设备做过滤

    /**
     * INIT_TIER_POLICY_E
     */
    public static enum InitTierPolicyE
    {
        /** 自动 */
        INIT_TIER_POLICY_AUTO(0),
        /** 最高性能 */
        INIT_TIER_POLICY_EXTREME_PERFORMANCE(1),
        /** 性能 */
        INIT_TIER_POLICY_PERFORMANCE(2),
        /** 容量 */
        INIT_TIER_POLICY_CAPACITY(3);

        private int value;

        /**
         * 构造函数
         */
        private InitTierPolicyE(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return INIT_TIER_POLICY_E 返回结果
         */
        public static InitTierPolicyE valueOf(int iValue)
        {
            for (InitTierPolicyE value : InitTierPolicyE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * MIGRATE_LUN_POLICY_E
     */
    public static enum MigrateLUNPolicyE
    {
        /** 不迁移 */
        MIGRATE_LUN_POLICY_NONE(0),
        /** 自动迁移 */
        MIGRATE_LUN_POLICY_AUTO(1),
        /** 保证最高性能迁移 */
        MIGRATE_LUN_POLICY_HIGHEST(2),
        /** 保证最低性能迁移 */
        MIGRATE_LUN_POLICY_LOWEST(3);

        private int value;

        /**
         * 构造函数
         */
        private MigrateLUNPolicyE(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return MIGRATE_LUN_POLICY_E 返回结果
         */
        public static MigrateLUNPolicyE valueOf(int iValue)
        {
            for (MigrateLUNPolicyE value : MigrateLUNPolicyE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * DISKSCAN_IOTYPE_E
     */
    public static enum DISKSCAN_IOTYPE_E
    {
        /** 读 */
        READ(1),
        /** 验证 */
        VERIFY(2);

        private int value;

        /**
         * 构造函数
         */
        private DISKSCAN_IOTYPE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return DISKSCAN_IOTYPE_E 返回结果
         */
        public static DISKSCAN_IOTYPE_E valueOf(int iValue)
        {
            for (DISKSCAN_IOTYPE_E value : DISKSCAN_IOTYPE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * HOSTGROUP_WORKMODE_E
     */
    public static enum HOSTGROUP_WORKMODE_E
    {
        /** A/P-F */
        APF(0),
        /** A/A-A */
        AAA(1);

        private int value;

        /**
         * 构造函数
         */
        private HOSTGROUP_WORKMODE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return HOSTGROUP_WORKMODE_E 返回结果
         */
        public static HOSTGROUP_WORKMODE_E valueOf(int iValue)
        {
            for (HOSTGROUP_WORKMODE_E value : HOSTGROUP_WORKMODE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * ANALYSIS_RAID_LEVEL_E
     */
    public static enum ANALYSIS_RAID_LEVEL_E
    {
        /** RAID0 */
        RAID0(0),
        /** RAID10 */
        RAID10(1),
        /** 3盘RAID5(2D+1P) */
        RAID5_3(2),
        /** 5盘RAID5(4D+1P) */
        RAID5_5(3),
        /** 9盘RAID5(8D+1P) */
        RAID5_9(4),
        /** 3盘RAID3(2D+1P) */
        RAID3_3(5),
        /** 5盘RAID3(4D+1P) */
        RAID3_5(6),
        /** 9盘RAID3(8D+1P) */
        RAID3_9(7),
        /** 6盘RAID6(4D+2P) */
        RAID6_6(8),
        /** 10盘RAID6(8D+2P) */
        RAID6_10(9);

        private int value;

        /**
         * 构造函数
         */
        private ANALYSIS_RAID_LEVEL_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return ANALYSIS_RAID_LEVEL_E 返回结果
         */
        public static ANALYSIS_RAID_LEVEL_E valueOf(int iValue)
        {
            for (ANALYSIS_RAID_LEVEL_E value : ANALYSIS_RAID_LEVEL_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * TIER0_ANALYSIS_DISK_TYPE_E
     */
    public static enum TIER0_ANALYSIS_DISK_TYPE_E
    {
        /** 100G的STAT接口的SSD盘 */
        SATA_SSD_100G(0);

        private int value;

        /**
         * 构造函数
         */
        private TIER0_ANALYSIS_DISK_TYPE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return TIER0_ANALYSIS_DISK_TYPE_E 返回结果
         */
        public static TIER0_ANALYSIS_DISK_TYPE_E valueOf(int iValue)
        {
            for (TIER0_ANALYSIS_DISK_TYPE_E value : TIER0_ANALYSIS_DISK_TYPE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * TIER1_ANALYSIS_DISK_TYPE_E
     */
    public static enum TIER1_ANALYSIS_DISK_TYPE_E
    {
        /** 10K 300G SAS盘 */
        SAS_300G_10K(1),
        /** 10K 600G SAS盘 */
        SAS_600G_10K(2);

        private int value;

        /**
         * 构造函数
         */
        private TIER1_ANALYSIS_DISK_TYPE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return TIER1_ANALYSIS_DISK_TYPE_E 返回结果
         */
        public static TIER1_ANALYSIS_DISK_TYPE_E valueOf(int iValue)
        {
            for (TIER1_ANALYSIS_DISK_TYPE_E value : TIER1_ANALYSIS_DISK_TYPE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * TIER2_ANALYSIS_DISK_TYPE_E
     */
    public static enum TIER2_ANALYSIS_DISK_TYPE_E
    {
        /** 1T 近线SAS盘 */
        NLSAS_1T_7200(3),
        /** 2T 近线SAS盘 */
        NLSAS_2T_7200(4);

        private int value;

        /**
         * 构造函数
         */
        private TIER2_ANALYSIS_DISK_TYPE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return TIER2_ANALYSIS_DISK_TYPE_E 返回结果
         */
        public static TIER2_ANALYSIS_DISK_TYPE_E valueOf(int iValue)
        {
            for (TIER2_ANALYSIS_DISK_TYPE_E value : TIER2_ANALYSIS_DISK_TYPE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * SNAPSHOT_STATUS_E
     */
    public static enum SNAPSHOT_STATUS_E
    {
        /** 停用 */
        SNAPSHOT_STATUS_DISABLE(1),
        /** 激活 */
        SNAPSHOT_STATUS_ACTIVE(2),
        /** 回滚 */
        SNAPSHOT_STATUS_ROLLBACK(3),
        /** 错误 */
        SNAPSHOT_STATUS_ERROR(4);

        private int value;

        /**
         * 构造函数
         */
        private SNAPSHOT_STATUS_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return SNAPSHOT_STATUS_E 返回结果
         */
        public static SNAPSHOT_STATUS_E valueOf(int iValue)
        {
            for (SNAPSHOT_STATUS_E value : SNAPSHOT_STATUS_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * SNAPSHOT_HEALTH_STATUS_E
     */
    public static enum SNAPSHOT_HEALTH_STATUS_E
    {
        /** 正常 */
        SNAPSHOT_NORMAL(1),
        /** 故障 */
        SNAPSHOT_FAULT(2);

        private int value;

        /**
         * 构造函数
         */
        private SNAPSHOT_HEALTH_STATUS_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return SNAPSHOT_HEALTH_STATUS_E 返回结果
         */
        public static SNAPSHOT_HEALTH_STATUS_E valueOf(int iValue)
        {
            for (SNAPSHOT_HEALTH_STATUS_E value : SNAPSHOT_HEALTH_STATUS_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * 设备类型
     */
    public static enum LUNCOPY_DEVICE_TYPE_E
    {
        /** 华为设备 */
        HAWEI_DEVICE(1),
        /** 其他设备 */
        OTHER_DEVICE(2);

        private int value;

        /**
         * 构造函数
         */
        private LUNCOPY_DEVICE_TYPE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return LUNCOPY_DEVICE_TYPE_E 返回结果
         */
        public static LUNCOPY_DEVICE_TYPE_E valueOf(int iValue)
        {
            for (LUNCOPY_DEVICE_TYPE_E value : LUNCOPY_DEVICE_TYPE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * MULTIPATH_TYPE_E
     * @author gWX183785
     * @version V100R001C10
     */
    public static enum MULTIPATH_TYPE_E
    {
        /** 默认 */
        DEFAULT(0),
        /** ALUA */
        ALUA(1);

        private int value;

        /**
         * 构造函数
         */
        private MULTIPATH_TYPE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return MULTIPATH_TYPE_E 返回结果
         */
        public static MULTIPATH_TYPE_E valueOf(int iValue)
        {
            for (MULTIPATH_TYPE_E value : MULTIPATH_TYPE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    // begin h90005710 新增需求 LUN 增加LUN优先级设置
    /**
     * LUN 优先级枚举
     */
    public static enum LUN_PRIORITY_TYPE_E
    {
        /** 低 默认 */
        LOW(1),
        /** 中 */
        MIDDLE(2),
        /** 高 */
        HIGHT(3);

        private int value;

        /**
         * 构造函数
         */
        private LUN_PRIORITY_TYPE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return LUN_PRIORITY_TYPE_E 返回结果
         */
        public static LUN_PRIORITY_TYPE_E valueOf(int iValue)
        {
            for (LUN_PRIORITY_TYPE_E value : LUN_PRIORITY_TYPE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    // end h90005710 新增需求 LUN 增加LUN优先级设置

    /**
     * SYSTEM_ROLE_E
     */
    public static enum SYSTEM_ROLE_E
    {
        /** 正常 */
        SYSTEM_ROLE_NORMAL(0),
        /** 主端 */
        SYSTEM_ROLE_MASTER(1),
        /** 从端 */
        SYSTEM_ROLE_SLAVE(2);

        private long value;

        /**
         * 构造函数
         */
        private SYSTEM_ROLE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return SYSTEM_ROLE_E 返回结果
         */
        public static SYSTEM_ROLE_E valueOf(int iValue)
        {
            for (SYSTEM_ROLE_E value : SYSTEM_ROLE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public long getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * SYNC_MODE_E
     */
    public static enum SYNC_MODE_E
    {
        /** 同步 */
        SYNC_MODE(0),
        /** 不同步 */
        NOT_SYNC_MODE(1);

        private int value;

        /**
         * 构造函数
         */
        private SYNC_MODE_E(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return SYNC_MODE_E 返回结果
         */
        public static SYNC_MODE_E valueOf(int iValue)
        {
            for (SYNC_MODE_E value : SYNC_MODE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * PRIORITY_E
     */
    public static enum PriorityE
    {
        /** 低 */
        LOW(1),
        /** 中 */
        MIDDLE(2),
        /** 高 */
        HIGH(3);

        private int value;

        /**
         * 构造函数
         */
        private PriorityE(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return PRIORITY_E 返回结果
         */
        public static PriorityE valueOf(int iValue)
        {
            for (PriorityE value : PriorityE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * DISK_SSD_IF_TYPE_E
     */
    public static enum DiskSsdIfTypeE
    {
        /** Not Available */
        NA(0),
        /** FC SSD */
        FC_SSD(1),
        /** SAS SSD */
        SAS_SSD(2),
        /** NL SAS SSD */
        NL_SAS_SSD(3),
        /** SATA SSD */
        SATA_SSD(4),
        /** SATA2 SSD */
        SATA2_SSD(5),
        /** SATA3 SSD */
        SATA3_SSD(6);

        private int value;

        /**
         * 构造函数
         */
        private DiskSsdIfTypeE(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return DISK_SSD_IF_TYPE_E 返回结果
         */
        public static DiskSsdIfTypeE valueOf(int iValue)
        {
            for (DiskSsdIfTypeE value : DiskSsdIfTypeE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * DISK_FORM_E
     */
    public static enum DiskFormE
    {
        /** 未知 */
        Unknown(0),
        /** 5.25英寸 */
        DISK_5_25_INCH(1),
        /** 3.5英寸 */
        DISK_3_5_INCH(2),
        /** 2.5英寸 */
        DISK_2_5_INCH(3),
        /** 1.8英寸 */
        DISK_1_8_INCH(4);

        private int value;

        /**
         * 构造函数
         */
        private DiskFormE(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return DISK_FORM_E 返回结果
         */
        public static DiskFormE valueOf(int iValue)
        {
            for (DiskFormE value : DiskFormE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * SYS_STATUS_E
     */
    public static enum SysStatusE
    {
        /** 未知错误 **/
        Unknown(-1),
        /** 正常 */
        Normal(0),
        /** 异常 */
        Abnormal(1),
        /** 上电中 */
        POWERONING(2),
        /** 下电中 */
        POWEROFF(3),
        /** 安全保护状态 */
        SAFE_MODE(4),
        /** 升级中 */
        UPGRADING(5),
        /** 掉电 */
        POWER_LOST(6),
        /** 离线 */
        OFFLINE(7);

        private int value;

        /**
         * 构造函数
         */
        private SysStatusE(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return SYS_STATUS_E 返回结果
         */
        public static SysStatusE valueOf(int iValue)
        {
            for (SysStatusE value : SysStatusE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */
        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + '.' + this.name();
        }

    }

    /**
     * LOG_TYPE_E
     * @author gWX183785
     * @version V100R001C10
     */
    public static enum LOG_TYPE_E
    {
        /**
         * info 日志
         */
        LOG_INFO("info"),
        /**
         * 错误日志
         */
        LOG_ERROR("error"),
        /**
         * denug日志
         */
        LOG_DEBUG("debug"),
        /**
         * 警告日志
         */
        LOG_WARN("warning");

        private String value;

        /**
         * 构造函数
         */
        private LOG_TYPE_E(String value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return POWERON_STATUS_E 返回结果
         */
//        public static LOG_TYPE_E valueOf(int iValue)
//        {
//            for (LOG_TYPE_E value : LOG_TYPE_E.values())
//            {
//                if (value.value.equals(Value))
//                {
//                    return value;
//                }
//            }
//            return null;
//        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public String getValue()
        {
            return this.value;
        }

        /**
         * toString
         * @return 返回結果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * ProductModeE
     * @author gWX183785
     * @version V100R001C10
     */
    public static enum ProductModeE
    {
        /**
         * V1500
         */
        V1500(0),
        /**
         * V1800
         */
        V1800(1),
        /**
         * S2100
         */
        S2100(2),
        /**
         * S2300
         */
        S2300(3),
        /**
         * S5100
         */
        S5100(4),
        /**
         * S5300
         */
        S5300(5),
        /**
         * S5500
         */
        S5500(6),
        /**
         * S5600
         */
        S5600(7),
        /**
         * VIS
         */
        VIS(8),
        /**
         * S2600
         */
        S2600(9),
        /**
         * S6800E
         */
        S6800E(10),
        /**
         * V1500N
         */
        V1500N(11),
        /**
         * S2300E
         */
        S2300E(12),
        /**
         * COMMON
         */
        COMMON(13),
        /**
         * N8000
         */
        N8000(15),
        /**
         * S6900
         */
        S6900(16),
        /**
         * S3900
         */
        S3900(17),
        /**
         * S5500T
         */
        S5500T(18),
        /**
         * S5600T
         */
        S5600T(19),
        /**
         * S6800T
         */
        S6800T(20),
        /**
         * S6900_M100
         */
        S6900_M100(21),
        /**
         * S3900_M200
         */
        S3900_M200(22),
        /**
         * S3900_M300
         */
        S3900_M300(23),
        /**
         * S5900_M100
         */
        S5900_M100(24),
        /**
         * S8100
         */
        S8100(25),
        /**
         * S5800T
         */
        S5800T(26),
        /**
         * V1600N
         */
        V1600N(27),
        /**
         * S5900_M200
         */
        S5900_M200(28),
        /**
         * N8001
         */
        N8001(29),
        /**
         * S2600T
         */
        S2600T(30),
        /**
         * S8000_I
         */
        S8000_I(31),
        /**
         * Dorado5100
         */
        Dorado5100(32),
        /**
         * T3200
         */
        T3200(33),
        /**
         * T3500
         */
        T3500(34),
        /**
         * N8000_R710
         */
        N8000_R710(35),
        /**
         * N8000_C2
         */
        N8000_C2(36),
        /**
         * N8000_C2_SYMC
         */
        N8000_C2_SYMC(40),
        /**
         * VTL
         */
        VTL(41),
        /**
         * S2900
         */
        S2900(42),
        /**
         * S2200T
         */
        S2200T(43),
        /**
         * Dorado2100_G2
         */
        Dorado2100_G2(44),
        /**
         * VIS_6000
         */
        VIS_6000(45),
        /**
         * HVS85T
         */
        HVS85T(46),
        /**
         * HVS88T
         */
        HVS88T(47),
        /**
         * N9000
         */
        N9000(48),
        /**
         * T3200_G2
         */
        T3200_G2(49),
        /**
         * T3500_G2
         */
        T3500_G2(50),
        /**
         * T3200_G3
         */
        T3200_G3(51),
        /**
         * T3500_G3
         */
        T3500_G3(52),
        /**
         * S5700
         */
        S5700(53),
        /**
         * CE6800
         */
        CE6800(54),
        /**
         * CE12800
         */
        CE12800(55),
        /**
         * HVS_18800F
         */
        HVS_18800F(56),
        /**
         * SSS
         */
        SSS(60),
        /**
         * N5000
         */
        N5000(401),
        /**
         * VIS8200
         */
        VIS8200(800),
        /**
         * VIS8400
         */
        VIS8400(801),
        /**
         * VIS8600
         */
        VIS8600(802),
        /**
         * VIS8800
         */
        VIS8800(803);

        private int value;

        private ProductModeE(int value)
        {
            this.value = value;
        }

        /**
         * 根据整形值获得枚举类型
         * @param iValue 方法参数：iValue
         * @return POWERON_STATUS_E 返回结果
         */
        public static ProductModeE valueOf(int iValue)
        {
            for (ProductModeE value : ProductModeE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * 取得枚举的整型值
         * @return int 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * <该方法返回枚举对应的描述>
         * @return String 返回结果
         */

        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * WARNNING_TYPE
     * @author gWX183785
     * @version V100R001C10
     */
    public static enum WARNNING_TYPE
    {
        /**
         * EVENT
         */
        EVENT(0),
        /**
         * FAULT
         */
        FAULT(1),
        /**
         * REVOCER
         */
        REVOCER(2),
        /**
         * OPERATOR_LOG
         */
        OPERATOR_LOG(3),
        /**
         * RUNNING
         */
        RUNNING(4);

        private int value;

        private WARNNING_TYPE(int value)
        {
            this.value = value;
        }

        /**
         * WARNNING_TYPE
         * @param iValue 参数
         * @return 返回结果
         */
        public static WARNNING_TYPE valueOf(int iValue)
        {
            for (WARNNING_TYPE value : WARNNING_TYPE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        public int getValue()
        {
            return this.value;
        }

        /**
         * toString
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }

    }

    /**
     * StatisticDataId
     * @author gWX183785
     * @version V100R001C10
     */
    public static enum StatisticDataId
    {
        /**
         * TOTALIOCOUNT
         */
        TOTALIOCOUNT(1),
        /**
         * READIORATIO
         */
        READIORATIO(2),
        /**
         * WRITEIORATIO
         */
        WRITEIORATIO(3),
        /**
         * CURRENTBANDWIDTH
         */
        CURRENTBANDWIDTH(4),
        /**
         * MAXBANDWIDTH
         */
        MAXBANDWIDTH(5),
        /**
         * CURRENTIOPS
         */
        CURRENTIOPS(6),
        /**
         * MAXIOPS
         */
        MAXIOPS(7),
        /**
         * MAXLATENCY
         */
        MAXLATENCY(8),
        /**
         * AVERAGELATENCY
         */
        AVERAGELATENCY(9),
        /**
         * CACHEHIT
         */
        CACHEHIT(10),
        /**
         * LOCALWRITECACHERATIO
         */
        LOCALWRITECACHERATIO(11),
        /**
         * MIRRORWRITECACHERATIO
         */
        MIRRORWRITECACHERATIO(12),
        /**
         * READIOTRAFFIC
         */
        READIOTRAFFIC(13),
        /**
         * WRITEIOTRAFFIC
         */
        WRITEIOTRAFFIC(14),
        /**
         * MAXPOWERCONSUME
         */
        MAXPOWERCONSUME(15),
        /**
         * AVGPOWERCONSUME
         */
        AVGPOWERCONSUME(16),
        /**
         * MINPOWERCONSUME
         */
        MINPOWERCONSUME(17),
        /**
         * USAGE
         */
        USAGE(18),
        /**
         * QUEUESIZE
         */
        QUEUESIZE(19),
        /**
         * RESPONSETIME
         */
        RESPONSETIME(20),
        /**
         * BANDWIDTH
         */
        BANDWIDTH(21),
        /**
         * THROUGHPUT_IPOS
         */
        THROUGHPUT_IPOS(22),
        /**
         * READBANDWIDTH
         */
        READBANDWIDTH(23),
        /**
         * AVERAGEREADIO
         */
        AVERAGEREADIO(24),
        /**
         * READTHROUGHPUT_IOPS
         */
        READTHROUGHPUT_IOPS(25),
        /**
         * WRITEBANDWIDTH
         */
        WRITEBANDWIDTH(26),
        /**
         * RESPONSETIME
         */
        AVERAGEWRITEIO(27),
        /**
         * WIRTETHROUGHPUT_IOPS
         */
        WIRTETHROUGHPUT_IOPS(28),
        /**
         * SERVICETIME
         */
        SERVICETIME(29),
        /**
         * READIOSTATISTICS512B
         */
        READIOSTATISTICS512B(30),
        /**
         * READIOSTATISTICS1KB
         */
        READIOSTATISTICS1KB(31),
        /**
         * READIOSTATISTICS2KB
         */
        READIOSTATISTICS2KB(32),
        /**
         * READIOSTATISTICS4K
         */
        READIOSTATISTICS4K(33),
        /**
         * READIOSTATISTICS8KB
         */
        READIOSTATISTICS8KB(34),
        /**
         * READIOSTATISTICS16KB
         */
        READIOSTATISTICS16KB(35),
        /**
         * READIOSTATISTICS32KB
         */
        READIOSTATISTICS32KB(36),
        /**
         * READIOSTATISTICS64KB
         */
        READIOSTATISTICS64KB(37),
        /**
         * READIOSTATISTICS128KB
         */
        READIOSTATISTICS128KB(38),
        /**
         * READIOSTATISTICS256KB
         */
        READIOSTATISTICS256KB(39),
        /**
         * READIOSTATISTICS512KB
         */
        READIOSTATISTICS512KB(40),
        /**
         * WRITEIOSTATISTICS512B
         */
        WRITEIOSTATISTICS512B(41),
        /**
         * WRITEIOSTATISTICS1KB
         */
        WRITEIOSTATISTICS1KB(42),
        /**
         * WRITEIOSTATISTICS2KB
         */
        WRITEIOSTATISTICS2KB(43),
        /**
         * WRITEIOSTATISTICS4KB
         */
        WRITEIOSTATISTICS4KB(44),
        /**
         * WRITEIOSTATISTICS8KB
         */
        WRITEIOSTATISTICS8KB(45),
        /**
         * WRITEIOSTATISTICS16KB
         */
        WRITEIOSTATISTICS16KB(46),
        /**
         * WRITEIOSTATISTICS32KB
         */
        WRITEIOSTATISTICS32KB(47),
        /**
         * WRITEIOSTATISTICS64KB
         */
        WRITEIOSTATISTICS64KB(48),
        /**
         * WRITEIOSTATISTICS128KB
         */
        WRITEIOSTATISTICS128KB(49),
        /**
         * WRITEIOSTATISTICS256KB
         */
        WRITEIOSTATISTICS256KB(50),
        /**
         * WRITEIOSTATISTICS512KB
         */
        WRITEIOSTATISTICS512KB(51),
        /**
         * READWRITEIOSTATISTICS512B
         */
        READWRITEIOSTATISTICS512B(52),
        /**
         * READWRITEIOSTATISTICS1KB
         */
        READWRITEIOSTATISTICS1KB(53),
        /**
         * READWRITEIOSTATISTICS2KB
         */
        READWRITEIOSTATISTICS2KB(54),
        /**
         * READWRITEIOSTATISTICS4KB
         */
        READWRITEIOSTATISTICS4KB(55),
        /**
         * READWRITEIOSTATISTICS8KB
         */
        READWRITEIOSTATISTICS8KB(56),
        /**
         * READWRITEIOSTATISTICS16KB
         */
        READWRITEIOSTATISTICS16KB(57),
        /**
         * READWRITEIOSTATISTICS32KB
         */
        READWRITEIOSTATISTICS32KB(58),
        /**
         * READWRITEIOSTATISTICS64KB
         */
        READWRITEIOSTATISTICS64KB(59),
        /**
         * CYCLEWRITEIOCNT
         */
        CYCLEWRITEIOCNT(60),
        /**
         * CYCLEREADIOCNT
         */
        CYCLEREADIOCNT(61),
        /**
         * READWRITEIOSTATISTICS512KB
         */
        READWRITEIOSTATISTICS512KB(62),
        /**
         * WRITEIOINPERIOD
         */
        WRITEIOINPERIOD(63),
        /**
         * READIOINPERIOD
         */
        READIOINPERIOD(64),
        /**
         * RANDOMSEQUENCERATIO
         */
        RANDOMSEQUENCERATIO(65),
        /**
         * USAGE2
         */
        USAGE2(66),
        /**
         * READBANDWIDTHUSAGE
         */
        READBANDWIDTHUSAGE(67),
        /**
         * CPUUSAGE
         */
        CPUUSAGE(68),
        /**
         * MEMORYUSAGE
         */
        MEMORYUSAGE(69),
        /**
         * SWAPUSAGE
         */
        SWAPUSAGE(70),
        /**
         * NETREADTRAFFIC
         */
        NETREADTRAFFIC(71),
        /**
         * NETWRITETRAFFIC
         */
        NETWRITETRAFFIC(72),
        /**
         * NETINPACKAGE
         */
        NETINPACKAGE(73),
        /**
         * NETOUTPACKAGE
         */
        NETOUTPACKAGE(74),
        /**
         * WORKTEMPERTURE
         */
        WORKTEMPERTURE(75),
        /**
         * POWERCONSUME
         */
        POWERCONSUME(76),
        /**
         * VOLTAGE
         */
        VOLTAGE(77),
        /**
         * AVERAGEIORESPONSETIME
         */
        AVERAGEIORESPONSETIME(78),
        /**
         * MAXIORESPONSETIME
         */
        MAXIORESPONSETIME(79),
        /**
         * DIRTYPAGERATIO
         */
        DIRTYPAGERATIO(80),
        /**
         * REFRESHCACHEDIVIDEWRITEREQUEST
         */
        REFRESHCACHEDIVIDEWRITEREQUEST(81),
        /**
         * REFRESHCACHEBANDWIDTH
         */
        REFRESHCACHEBANDWIDTH(82),
        /**
         * REFRESHCACHEBECAUSEHIGHTWATER
         */
        REFRESHCACHEBECAUSEHIGHTWATER(83),
        /**
         * REFRESHCACHEBECAUSESCHEDULETIMER
         */
        REFRESHCACHEBECAUSESCHEDULETIMER(84),
        /**
         * CACHELOWWATER
         */
        CACHELOWWATER(85),
        /**
         * MAXBANDWIDTHWRITE
         */
        MAXBANDWIDTHWRITE(86),
        /**
         * FETCHFLUX
         */
        FETCHFLUX(87),
        /**
         * FETCHRATIO
         */
        FETCHRATIO(88),
        /**
         * READCACHEHIT
         */
        READCACHEHIT(89),
        /**
         * READCACHENOTHIT
         */
        READCACHENOTHIT(90),
        /**
         * READCACHEHITWHENWRITE
         */
        READCACHEHITWHENWRITE(91),
        /**
         * READCACHEHITWHENREAD
         */
        READCACHEHITWHENREAD(92),
        /**
         * READCACHERATIO
         */
        READCACHERATIO(93),
        /**
         * READCACHEREHITRATIO
         */
        READCACHEREHITRATIO(94),
        /**
         * WRITECACHEHITRATIO
         */
        WRITECACHEHITRATIO(95),
        /**
         * WRITECACHEREHITRATIO
         */
        WRITECACHEREHITRATIO(96),
        /**
         * WRITECACHEHIT
         */
        WRITECACHEHIT(97),
        /**
         * WRITECACHENOTHIT
         */
        WRITECACHENOTHIT(98),
        /**
         * ASYNCTIME
         */
        ASYNCTIME(99),
        /**
         * ASYNCDATA
         */
        ASYNCDATA(100),
        /**
         * READEREQUESTCNTFROMSNAPSHOT
         */
        READEREQUESTCNTFROMSNAPSHOT(101),
        /**
         * READEREQUESTCNTFROMSOURCELUN
         */
        READEREQUESTCNTFROMSOURCELUN(102),
        /**
         * WRITEREQUESTCNTFROMSOURCELUN
         */
        WRITEREQUESTCNTFROMSOURCELUN(103),
        /**
         * READREQUESTCNTSNAPSHOTPOOL
         */
        READREQUESTCNTSNAPSHOTPOOL(104),
        /**
         * WRITEREQUESTCNTSNAPSHOTPOOL
         */
        WRITEREQUESTCNTSNAPSHOTPOOL(105),
        /**
         * WRITEREQUESTCNTMORETHANCHUNK
         */
        WRITEREQUESTCNTMORETHANCHUNK(106),
        /**
         * CHUNKCNTUSEDBYSNAPSHOTCOPY
         */
        CHUNKCNTUSEDBYSNAPSHOTCOPY(107),
        /**
         * LOCALCACHEUSAGE
         */
        LOCALCACHEUSAGE(108),
        /**
         * MIRRORCACHEUSAGE
         */
        MIRRORCACHEUSAGE(109),
        /**
         * READCACHEUSAGE
         */
        READCACHEUSAGE(110),
        /**
         * TIME_FOR_HOST_TO_SEND_DATA
         */
        TIME_FOR_HOST_TO_SEND_DATA(111),
        /**
         * TIME_FOR_SAVING_WRITE_DATA
         */
        TIME_FOR_SAVING_WRITE_DATA(112),
        /**
         * TIME_FOR_RELEASING_WRITE_REQUEST_RESOURCES
         */
        TIME_FOR_RELEASING_WRITE_REQUEST_RESOURCES(113),
        /**
         * TIME_FOR_EXECUTING_A_WRITE_REQUEST
         */
        TIME_FOR_EXECUTING_A_WRITE_REQUEST(114),
        /**
         * TIME_FOR_RELEASING_READ_REQUEST_RESOURCES
         */
        TIME_FOR_RELEASING_READ_REQUEST_RESOURCES(115),
        /**
         * CACHE_READ_I_O_LATENCY
         */
        CACHE_READ_I_O_LATENCY(116),
        /**
         * CACHE_WRITE_I_O_LATENCY
         */
        CACHE_WRITE_I_O_LATENCY(117),
        /**
         * CACHE_MIRROR_I_O_LATENCY
         */
        CACHE_MIRROR_I_O_LATENCY(118),
        /**
         * TIME_FOR_ALLOCATING_MEMORY_TO_A_WRITE_REQUEST
         */
        TIME_FOR_ALLOCATING_MEMORY_TO_A_WRITE_REQUEST(119),
        /**
         * CACHE_WRITE_USAGE_PERCT
         */
        CACHE_WRITE_USAGE_PERCT(120), // (%)
        /**
         * NUMBER_OF_CACHE_DATA_FLUSH_I_OS
         */
        NUMBER_OF_CACHE_DATA_FLUSH_I_OS(121),
        /**
         * NUMBER_OF_CACHE_DATA_FLUSH_PAGES
         */
        NUMBER_OF_CACHE_DATA_FLUSH_PAGES(122),
        /**
         * READ_BANDWIDTH
         */
        READ_BANDWIDTH(123), // (KB/S)
        /**
         * WRITE_BANDWIDTH
         */
        WRITE_BANDWIDTH(124), // (KB/S)
        /**
         * AVERAGE_READ_I_O_CONTROLLERA
         */
        AVERAGE_READ_I_O_CONTROLLERA(125), // (CONTROLLER A)
        /**
         * AVERAGE_WRITE_I_O_CONTROLLERA
         */
        AVERAGE_WRITE_I_O_CONTROLLERA(126), // (CONTROLLER A)
        /**
         * MAX_I_O_LATENCY_CONTROLLERA
         */
        MAX_I_O_LATENCY_CONTROLLERA(127), // (CONTROLLER A)
        /**
         * AVERAGE_I_O_LATENCY_CONTROLLERA
         */
        AVERAGE_I_O_LATENCY_CONTROLLERA(128), // (CONTROLLER A)
        /**
         * USAGE_RATIO_CONTROLLERA
         */
        USAGE_RATIO_CONTROLLERA(129), // (CONTROLLER A)
        /**
         * QUEUE_LENGTH_CONTROLLERA
         */
        QUEUE_LENGTH_CONTROLLERA(130), // (CONTROLLER A)
        /**
         * SERVICE_TIME_CONTROLLERA
         */
        SERVICE_TIME_CONTROLLERA(131), // (EXCLUDING QUEUE TIME) (CONTROLLER A)
        /**
         * NUMBER_OF_COMBINED_READ_I_OS_PER_SECOND_CONTROLLERA
         */
        NUMBER_OF_COMBINED_READ_I_OS_PER_SECOND_CONTROLLERA(132), // (CONTROLLER
                                                                  // A)
        /**
         * NUMBER_OF_COMBINED_WRITE_I_OS_PER_SECOND_CONTROLLERA
         */
        NUMBER_OF_COMBINED_WRITE_I_OS_PER_SECOND_CONTROLLERA(133), // (CONTROLLER
                                                                   // A)
        /**
         * READ_WAITING_TIME_CONTROLLERA
         */
        READ_WAITING_TIME_CONTROLLERA(134), // (CONTROLLER A) (MS)
        /**
         * WRITE_WAITING_TIME_CONTROLLERA
         */
        WRITE_WAITING_TIME_CONTROLLERA(135), // (CONTROLLER A) (MS)
        /**
         * AVERAGE_I_O_SIZE_CONTROLLERA
         */
        AVERAGE_I_O_SIZE_CONTROLLERA(136), // (CONTROLLER A) (SECTOR)
        /**
         * AVERAGE_READ_I_O_CONTROLLERB
         */
        AVERAGE_READ_I_O_CONTROLLERB(137), // (CONTROLLER B)
        /**
         * AVERAGE_WRITE_I_O_CONTROLLERB
         */
        AVERAGE_WRITE_I_O_CONTROLLERB(138), // (CONTROLLER B)
        /**
         * MAX_I_O_LATENCY_CONTROLLERB
         */
        MAX_I_O_LATENCY_CONTROLLERB(139), // (CONTROLLER B)
        /**
         * AVERAGE_I_O_LATENCY_CONTROLLERB
         */
        AVERAGE_I_O_LATENCY_CONTROLLERB(140), // (CONTROLLER B)
        /**
         * USAGE_RATIO_CONTROLLERB
         */
        USAGE_RATIO_CONTROLLERB(141), // (CONTROLLER B)
        /**
         * QUEUE_LENGTH_CONTROLLERB
         */
        QUEUE_LENGTH_CONTROLLERB(142), // (CONTROLLER B)
        /**
         * SERVICE_TIME_CONTROLLERB
         */
        SERVICE_TIME_CONTROLLERB(143), // (EXCLUDING QUEUE TIME) (CONTROLLER B)

        /**
         * NUMBER_OF_COMBINED_READ_I_OS_PER_SECOND_CONTROLLERB
         */
        NUMBER_OF_COMBINED_READ_I_OS_PER_SECOND_CONTROLLERB(144), // (CONTROLLER
                                                                  // B)
        /**
         * NUMBER_OF_COMBINED_WRITE_I_OS_PER_SECOND_CONTROLLERB
         */
        NUMBER_OF_COMBINED_WRITE_I_OS_PER_SECOND_CONTROLLERB(145), // CONTROLLER
                                                                   // B)
        /**
         * READ_WAITING_TIME_CONTROLLERB
         */
        READ_WAITING_TIME_CONTROLLERB(146), // (CONTROLLER B) (MS)
        /**
         * WRITE_WAITING_TIME_CONTROLLERB
         */
        WRITE_WAITING_TIME_CONTROLLERB(147), // (CONTROLLER B) (MS)
        /**
         * AVERAGE_I_O_SIZE_CONTROLLERB
         */
        AVERAGE_I_O_SIZE_CONTROLLERB(148), // (CONTROLLER B) (SECTOR)
        /**
         * READ_I_O_GRANULARITY_DISTRIBUTION_0K_4K
         */
        READ_I_O_GRANULARITY_DISTRIBUTION_0K_4K(149), // [0K,4K) (%)
        /**
         * READ_I_O_GRANULARITY_DISTRIBUTION_4K_8K
         */
        READ_I_O_GRANULARITY_DISTRIBUTION_4K_8K(150), // [4K,8K) (%)
        /**
         * READ_I_O_GRANULARITY_DISTRIBUTION_8K_16K
         */
        READ_I_O_GRANULARITY_DISTRIBUTION_8K_16K(151), // [8K,16K) (%)
        /**
         * READ_I_O_GRANULARITY_DISTRIBUTION_16K_32K
         */
        READ_I_O_GRANULARITY_DISTRIBUTION_16K_32K(152), // [16K,32K) (%)
        /**
         * READ_I_O_GRANULARITY_DISTRIBUTION_32K_64K
         */
        READ_I_O_GRANULARITY_DISTRIBUTION_32K_64K(153), // [32K,64K) (%)
        /**
         * READ_I_O_GRANULARITY_DISTRIBUTION_64K_128K
         */
        READ_I_O_GRANULARITY_DISTRIBUTION_64K_128K(154), // [64K,128K) (%)
        /**
         * READ_I_O_GRANULARITY_DISTRIBUTION_128K_256K
         */
        READ_I_O_GRANULARITY_DISTRIBUTION_128K_256K(155), // [128K,256K) (%)
        /**
         * READ_I_O_GRANULARITY_DISTRIBUTION_256K_512K
         */
        READ_I_O_GRANULARITY_DISTRIBUTION_256K_512K(156), // [256K,512K) (%)
        /**
         * READ_I_O_GRANULARITY_DISTRIBUTION_512K_1M
         */
        READ_I_O_GRANULARITY_DISTRIBUTION_512K_1M(157), // [512K,1M) (%)
        /**
         * READ_I_O_GRANULARITY_DISTRIBUTION_1M_2M
         */
        READ_I_O_GRANULARITY_DISTRIBUTION_1M_2M(158), // [1M,2M) (%)
        /**
         * READ_I_O_GRANULARITY_DISTRIBUTION_2M_MAX
         */
        READ_I_O_GRANULARITY_DISTRIBUTION_2M_MAX(159), // [2M,+∞) (%)
        /**
         * WRITE_I_O_GRANULARITY_DISTRIBUTION_0K_4K
         */
        WRITE_I_O_GRANULARITY_DISTRIBUTION_0K_4K(160), // [0K,4K) (%)
        /**
         * WRITE_I_O_GRANULARITY_DISTRIBUTION_4K_8K
         */
        WRITE_I_O_GRANULARITY_DISTRIBUTION_4K_8K(161), // : [4K,8K) (%)
        /**
         * WRITE_I_O_GRANULARITY_DISTRIBUTION_8K_16K
         */
        WRITE_I_O_GRANULARITY_DISTRIBUTION_8K_16K(162), // [8K,16K) (%)
        /**
         * WRITE_I_O_GRANULARITY_DISTRIBUTION_16K_32K
         */
        WRITE_I_O_GRANULARITY_DISTRIBUTION_16K_32K(163), // [16K,32K) (%)
        /**
         * WRITE_I_O_GRANULARITY_DISTRIBUTION_32K_64K
         */
        WRITE_I_O_GRANULARITY_DISTRIBUTION_32K_64K(164), // : [32K,64K) (%)
        /**
         * WRITE_I_O_GRANULARITY_DISTRIBUTION_64K_128K
         */
        WRITE_I_O_GRANULARITY_DISTRIBUTION_64K_128K(165), // [64K,128K) (%)
        /**
         * WRITE_I_O_GRANULARITY_DISTRIBUTION_128K_256K
         */
        WRITE_I_O_GRANULARITY_DISTRIBUTION_128K_256K(166), // [128K,256K) (%)
        /**
         * WRITE_I_O_GRANULARITY_DISTRIBUTION_256K_512K
         */
        WRITE_I_O_GRANULARITY_DISTRIBUTION_256K_512K(167), // [256K,512K) (%)
        /**
         * WRITE_I_O_GRANULARITY_DISTRIBUTION_512K_1M
         */
        WRITE_I_O_GRANULARITY_DISTRIBUTION_512K_1M(168), // : [512K,1M) (%)
        /**
         * WRITE_I_O_GRANULARITY_DISTRIBUTION_1M_2M
         */
        WRITE_I_O_GRANULARITY_DISTRIBUTION_1M_2M(169), // : [1M,2M) (%)
        /**
         * WRITE_I_O_GRANULARITY_DISTRIBUTION_2M_MAX
         */
        WRITE_I_O_GRANULARITY_DISTRIBUTION_2M_MAX(170), // [2M,+∞) (%)
        /**
         * READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTION_0K_4K
         */
        READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTION_0K_4K(171), // : [0K,4K) (%)
        /**
         * READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTION_4K_8K
         */
        READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTION_4K_8K(172), // [4K,8K) (%)
        /**
         * READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTION_8K_16K
         */
        READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTION_8K_16K(173), // : [8K,16K)
                                                                 // (%)
        /**
         * READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTION_16K_32K
         */
        READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTION_16K_32K(174), // : [16K,32K)
                                                                  // (%)
        /**
         * READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTIONK_64K
         */
        READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTIONK_64K(175), // : [32K,64K)
                                                               // (%)
        /**
         * READ_AND_RITE_I_O_GRANULARITY_DISTRIBUTION_64K_128K
         */
        READ_AND_RITE_I_O_GRANULARITY_DISTRIBUTION_64K_128K(176), // :
                                                                  // [64K,128K)
                                                                  // (%)
        /**
         * READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTION_128K_256K
         */
        READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTION_128K_256K(177), // :
                                                                    // [128K,256K)
                                                                    // (%)
        /**
         * READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTION_256K_512K
         */
        READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTION_256K_512K(178), // :
                                                                    // [256K,512K)
                                                                    // (%)
        /**
         * READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTION_512K_1M
         */
        READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTION_512K_1M(179), // : ≤
                                                                  // [512K,1M)
                                                                  // (%)
        /**
         * READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTION_1M_2M
         */
        READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTION_1M_2M(180), // : [1M,2M) (%)
        /**
         * READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTION_2M_MAX
         */
        READ_AND_WRITE_I_O_GRANULARITY_DISTRIBUTION_2M_MAX(181), // : [2M,+∞)
                                                                 // (%)
        /**
         * OPS
         */
        OPS(182),
        /**
         * NUMBER_OF_ONLINE_USER
         */
        NUMBER_OF_ONLINE_USER(183),
        /**
         * FILE_SPACE_HARD_QUOTA
         */
        FILE_SPACE_HARD_QUOTA(184),
        /**
         * USED_CAPACITY
         */
        USED_CAPACITY(185),
        /**
         * TOTAL_CAPACITY
         */
        TOTAL_CAPACITY(186),
        /**
         * DEDUPE_RATE
         */
        DEDUPE_RATE(187),
        /**
         * PACKETS_TRANSMITTED_RATE
         */
        PACKETS_TRANSMITTED_RATE(188),
        /**
         * PACKETS_DROPPED_RATIO
         */
        PACKETS_DROPPED_RATIO(189),
        /**
         * PACKETS_ERRORS_RATIO
         */
        PACKETS_ERRORS_RATIO(190),
        /**
         * PACKETS_OVERRUNS_RATIO
         */
        PACKETS_OVERRUNS_RATIO(191),
        /**
         * DISK_BUSY_RATIO
         */
        DISK_BUSY_RATIO(192),
        /**
         * PACKAGES_RATE
         */
        PACKAGES_RATE(193),
        /**
         * ATTR_REMOTE_REP_BAND
         */
        ATTR_REMOTE_REP_BAND(194),
        /**
         * MAX_READ_I_O_LATENCY
         */
        MAX_READ_I_O_LATENCY(195),
        /**
         * MAX_WRITE_I_O_LATENCY
         */
        MAX_WRITE_I_O_LATENCY(196),
        /**
         * AVERAGE_READ_I_O_LATENCY
         */
        AVERAGE_READ_I_O_LATENCY(197),
        /**
         * AVERAGE_WRITE_I_O_LATENCY
         */
        AVERAGE_WRITE_I_O_LATENCY(198),
        /**
         * READ_I_O_LATENCY_DISTRIBUTION_0MS_10MS
         */
        READ_I_O_LATENCY_DISTRIBUTION_0MS_10MS(199), // : [0MS,10MS) (%)
        /**
         * READ_I_O_LATENCY_DISTRIBUTION_10MS_20MS
         */
        READ_I_O_LATENCY_DISTRIBUTION_10MS_20MS(200), // : [10MS,20MS) (%)
        /**
         * READ_I_O_LATENCY_DISTRIBUTION_20MS_50MS
         */
        READ_I_O_LATENCY_DISTRIBUTION_20MS_50MS(201), // [20MS,50MS) (%)
        /**
         * READ_I_O_LATENCY_DISTRIBUTION_50MS_100MS
         */
        READ_I_O_LATENCY_DISTRIBUTION_50MS_100MS(202), // [50MS,100MS) (%)
        /**
         * READ_I_O_LATENCY_DISTRIBUTION_100MS_200MS
         */
        READ_I_O_LATENCY_DISTRIBUTION_100MS_200MS(203), // : [100MS,200MS) (%)
        /**
         * READ_I_O_LATENCY_DISTRIBUTION_200MS_MAX
         */
        READ_I_O_LATENCY_DISTRIBUTION_200MS_MAX(204), // [200MS,+∞) (%)
        /**
         * WRITE_I_O_LATENCY_DISTRIBUTION_0MS_10MS
         */
        WRITE_I_O_LATENCY_DISTRIBUTION_0MS_10MS(205), // [0MS,10MS) (%)
        /**
         * WRITE_I_O_LATENCY_DISTRIBUTION_10MS_20MS
         */
        WRITE_I_O_LATENCY_DISTRIBUTION_10MS_20MS(206), // [10MS,20MS) (%)
        /**
         * WRITE_I_O_LATENCY_DISTRIBUTION_20MS_50MS
         */
        WRITE_I_O_LATENCY_DISTRIBUTION_20MS_50MS(207), // [20MS,50MS) (%)
        /**
         * WRITE_I_O_LATENCY_DISTRIBUTION_50MS_100MS
         */
        WRITE_I_O_LATENCY_DISTRIBUTION_50MS_100MS(208), // [50MS,100MS) (%)
        /**
         * WRITE_I_O_LATENCY_DISTRIBUTION_100MS_200MS
         */
        WRITE_I_O_LATENCY_DISTRIBUTION_100MS_200MS(209), // [100MS,200MS) (%)
        /**
         * WRITE_I_O_LATENCY_DISTRIBUTION_200MS_MAX
         */
        WRITE_I_O_LATENCY_DISTRIBUTION_200MS_MAX(210), // : [200MS,+∞) (%)
        /**
         * READ_AND_WRITE_I_O_LATENCY_DISTRIBUTION_0MS_10MS
         */
        READ_AND_WRITE_I_O_LATENCY_DISTRIBUTION_0MS_10MS(211), // : [0MS,10MS)
                                                               // (%)
        /**
         * READ_AND_WRITE_I_O_LATENCY_DISTRIBUTION_10MS_20MS
         */
        READ_AND_WRITE_I_O_LATENCY_DISTRIBUTION_10MS_20MS(212), // : [10MS,20MS)
                                                                // (%)
        /**
         * READ_AND_WRITE_I_O_LATENCY_DISTRIBUTION_20MS_50MS
         */
        READ_AND_WRITE_I_O_LATENCY_DISTRIBUTION_20MS_50MS(213), // : [20MS,50MS)
                                                                // (%)
        /**
         * READ_AND_WRITE_I_O_LATENCY_DISTRIBUTION_50MS_100MS
         */
        READ_AND_WRITE_I_O_LATENCY_DISTRIBUTION_50MS_100MS(214), // [50MS,100MS)
                                                                 // (%)
        /**
         * READ_AND_WRITE_I_O_LATENCY_DISTRIBUTION_100MS_200MS
         */
        READ_AND_WRITE_I_O_LATENCY_DISTRIBUTION_100MS_200MS(215), // :
                                                                  // [100MS,200MS)
                                                                  // (%)
        /**
         * READ_AND_WRITE_I_O_LATENCY_DISTRIBUTION_200MS_MAX
         */
        READ_AND_WRITE_I_O_LATENCY_DISTRIBUTION_200MS_MAX(216), // : [200MS,+∞)
        /**
         * MAX_CPU_USAGE
         */
        MAX_CPU_USAGE(217),
        /**
         * MAX_MEMORY_USAGE
         */
        MAX_MEMORY_USAGE(218),
        /**
         * NFS_BANDWIDTH
         */
        NFS_BANDWIDTH(219),
        /**
         * NFS_IN_BANDWIDTH
         */
        NFS_IN_BANDWIDTH(220),
        /**
         * NFS_OUT_BANDWIDTH
         */
        NFS_OUT_BANDWIDTH(221),
        /**
         * CIFS_BANDWIDTH
         */
        CIFS_BANDWIDTH(222),
        /**
         * CIFS_IN_BANDWIDTH
         */
        CIFS_IN_BANDWIDTH(223),
        /**
         * CIFS_OUT_BANDWIDTH
         */
        CIFS_OUT_BANDWIDTH(224),
        /**
         * CONNECTED_CLIENT_COUNT
         */
        CONNECTED_CLIENT_COUNT(225),
        /**
         * CONNECTED_NFS_CLIENT_COUNT
         */
        CONNECTED_NFS_CLIENT_COUNT(226),
        /**
         * CONNECTED_CIFS_CLIENT_COUNT
         */
        CONNECTED_CIFS_CLIENT_COUNT(227),
        /**
         * AVERAGE_IO_SIZE
         */
        AVERAGE_IO_SIZE(228),
        /**
         * NETWORK_PACKET_RATE
         */
        NETWORK_PACKET_RATE(229),
        /**
         * NETWORK_INBOUND_PACKET_RATE
         */
        NETWORK_INBOUND_PACKET_RATE(230),
        /**
         * NETWORK_OUTBOUND_PACKET_RATE
         */
        NETWORK_OUTBOUND_PACKET_RATE(231),
        /**
         * READ_OPS
         */
        READ_OPS(232),
        /**
         * WRITE_OPS
         */
        WRITE_OPS(233),
        /**
         * READ_AVERAGE_IO_SIZE
         */
        READ_AVERAGE_IO_SIZE(234),
        /**
         * WRITE_AVERAGE_IO_SIZE
         */
        WRITE_AVERAGE_IO_SIZE(235),
        /**
         * BAND_WIDTH
         */
        BAND_WIDTH(236),
        /**
         * READ_L2CACHE_HIT
         */
        READ_L2CACHE_HIT(237),
        /**
         * READ_L2CACHE_NOTHIT
         */
        READ_L2CACHE_NOTHIT(238),
        /**
         * READ_L2CACHE_HITRATIO
         * 
         */
        READ_L2CACHE_HITRATIO(239),
        /**
         * AVERAGE_QUEUESIZE
         */
        AVERAGE_QUEUESIZE(240),
        /**
         * COMPLETE_SCSI_COMMANDS_PER_SECOND
         */
        COMPLETE_SCSI_COMMANDS_PER_SECOND(241),
        /**
         * VERIFY_COMMANDS_PER_SECOND
         */
        VERIFY_COMMANDS_PER_SECOND(242),
        /**
         * DISK_TOTAL_CAPACITY
         */
        DISK_TOTAL_CAPACITY(243),
        /**
         * DISK_ALLOCED_CAPACITY
         */
        DISK_ALLOCED_CAPACITY(244),
        /**
         * DISK_ALLOCED_USAGE
         */
        DISK_ALLOCED_USAGE(245),
        /**
         * DISK_FREE_USAGE
         */
        DISK_FREE_USAGE(246),
        /**
         * WP_COUNT
         */
        WP_COUNT(247),
        /**
         * WP_LIMIT
         */
        WP_LIMIT(248),
        /**
         * WP_UTILIZATION_PERCT
         */
        WP_UTILIZATION_PERCT(249), // (%)
        /**
         * CACHE_USED_PERCT
         */
        CACHE_USED_PERCT(250), // (%)
        /**
         * HOST_HITS_SEC
         */
        HOST_HITS_SEC(251),
        /**
         * HOST_READ_HITS_SEC
         */
        HOST_READ_HITS_SEC(252),
        /**
         * HOST_WRITE_HITS_SEC
         */
        HOST_WRITE_HITS_SEC(253),
        /**
         * HOST_MISSES_SEC
         */
        HOST_MISSES_SEC(254),
        /**
         * HOST_READ_MISSES_SEC
         */
        HOST_READ_MISSES_SEC(255),
        /**
         * HOST_WRITE_MISSES_SEC
         */
        HOST_WRITE_MISSES_SEC(256),
        /**
         * BE_REQS_SEC
         */
        BE_REQS_SEC(257),
        /**
         * BE_READ_REQS_SEC
         */
        BE_READ_REQS_SEC(258),
        /**
         * BE_WRITE_REQS_SEC
         */
        BE_WRITE_REQS_SEC(259),
        /**
         * BE_MBS_TRANSFERRED_SEC
         */
        BE_MBS_TRANSFERRED_SEC(260),
        /**
         * BE_MBS_READ_SEC
         */
        BE_MBS_READ_SEC(261),
        /**
         * BE_MBS_WRITTEN_SEC
         */
        BE_MBS_WRITTEN_SEC(262),
        /**
         * READ_MISS_RESPONSE_TIME
         */
        READ_MISS_RESPONSE_TIME(263), // (MS)
        /**
         * WRITE_MISS_RESPONSE_TIME
         */
        WRITE_MISS_RESPONSE_TIME(264), // (MS)
        /**
         * READ_PERCT
         */
        READ_PERCT(265), // (%)
        /**
         * WRITE_PERCT
         */
        WRITE_PERCT(266), // (%)
        /**
         * READ_HIT_PERCT
         */
        READ_HIT_PERCT(267), // (%)
        /**
         * READ_MISS_PERCT
         */
        WRITE_HIT_PERCT(268), // (%)
        /**
         * READ_MISS_PERCT
         */
        READ_MISS_PERCT(269), // (%)
        /**
         * WRITE_MISS_PERCT
         */
        WRITE_MISS_PERCT(270), // (%)
        /**
         * BE_READ_REQUEST_TIME
         */
        BE_READ_REQUEST_TIME(271), // (MS)
        /**
         * BE_DISK_READ_RESPONSE_TIME
         */
        BE_DISK_READ_RESPONSE_TIME(272), // (MS)
        /**
         * BE_READ_TASK_TIME
         */
        BE_READ_TASK_TIME(273), // (MS)
        /**
         * BE_READ_RESPONSE_TIME
         */
        BE_READ_RESPONSE_TIME(274), // (MS)
        /**
         * BE_WRITE_RESPONSE_TIME
         */
        BE_WRITE_RESPONSE_TIME(275), // (MS)
        /**
         * BE_AVG_RESPONSE_TIME
         */
        BE_AVG_RESPONSE_TIME(276), // (MS)
        /**
         * BE_READS_PERCT
         */
        BE_READS_PERCT(277),
        /**
         * BE_WRITES__PERCT
         */
        BE_WRITES__PERCT(278),
        /**
         * REQS_SEC_FRONT
         */
        REQS_SEC_FRONT(279),
        /**
         * READ_REQS_SEC_FRONT
         */
        READ_REQS_SEC_FRONT(280),
        /**
         * WRITE_REQS_SEC_FRONT
         */
        WRITE_REQS_SEC_FRONT(281),
        /**
         * READ_HIT_REQS_SEC
         */
        READ_HIT_REQS_SEC(282),
        /**
         * WRITE_HIT_REQS_SEC
         */
        WRITE_HIT_REQS_SEC(283),
        /**
         * MISS_REQ_SEC
         */
        MISS_REQ_SEC(284),
        /**
         * READ_MISS_REQS_SEC
         */
        READ_MISS_REQS_SEC(285),
        /**
         * WRITE_MISS_REQS_SEC
         */
        WRITE_MISS_REQS_SEC(286),
        /**
         * READ_REQS_PERCT
         */
        READ_REQS_PERCT(287), // (%)
        /**
         * WRITE_REQS_PERCT
         */
        WRITE_REQS_PERCT(288), // (%)
        /**
         * HIT_REQS_PERCT
         */
        HIT_REQS_PERCT(289), // (%)
        /**
         * READ_REQ_HIT_PERCT
         */
        READ_REQ_HIT_PERCT(290), // (%)
        /**
         * IOS_SEC
         */
        IOS_SEC(291),
        /**
         * REQS_SEC_BACK
         */
        REQS_SEC_BACK(292),
        /**
         * READ_REQS_SEC_BACK
         */
        READ_REQS_SEC_BACK(293),
        /**
         * WRITE_REQS_SEC_BACK
         */
        WRITE_REQS_SEC_BACK(294),
        /**
         * MBS_SEC
         */
        MBS_SEC(295),
        /**
         * PORT_MBS_EC
         */
        PORT_MBS_EC(296),
        /**
         * PORT_IOS_SEC
         */
        PORT_IOS_SEC(297),
        /**
         * MBS_READ_SEC
         */
        MBS_READ_SEC(298),
        /**
         * MBS_WRITTEN_SEC
         */
        MBS_WRITTEN_SEC(299),
        /**
         * PORT_AVG_REQ_SIZE
         */
        PORT_AVG_REQ_SIZE(300),
        /**
         * MAX_WP_THRESHOLD
         */
        MAX_WP_THRESHOLD(301),
        /**
         * RANDOM_HITS_SEC
         */
        RANDOM_HITS_SEC(302), //
        /**
         * HIT_PERCT
         */
        HIT_PERCT(303), // (%)
        /**
         * MISS_PERCT
         */
        MISS_PERCT(304), // (%)
        /**
         * RANDOM_READS_PERCT
         */
        RANDOM_READS_PERCT(305), // (%)
        /**
         * RANDOM_WRITES_PERCT
         */
        RANDOM_WRITES_PERCT(306), // (%)
        /**
         * MAX_IOPS
         */
        MAX_IOPS(307), // (IO/S)
        /**
         * FAILED_IOS
         */
        FAILED_IOS(308),
        /**
         * FAILED_IOS_SEC
         */
        FAILED_IOS_SEC(309),
        /**
         * FAILED_IO_RATIO_PERCT
         */
        FAILED_IO_RATIO_PERCT(310), // (%)
        /**
         * THROUGHPUT_MBPS
         */
        THROUGHPUT_MBPS(311),
        /**
         * READTHROUGHPUT_MBPS
         */
        READTHROUGHPUT_MBPS(312),
        /**
         * WIRTETHROUGHPUT_MBPS
         */
        WIRTETHROUGHPUT_MBPS(313),
        /**
         * UTIL_PERCT
         */
        UTIL_PERCT(314), // (%)
        /**
         * EXTENT_FRAGMENTATION_SMALLER_THAN_8BLK
         */
        EXTENT_FRAGMENTATION_SMALLER_THAN_8BLK(315),
        /**
         * EXTENT_FRAGMENTATION_SMALLER_THAN_64BLK
         */
        EXTENT_FRAGMENTATION_SMALLER_THAN_64BLK(316),
        /**
         * EXTENT_FRAGMENTATION_LARGER_THAN_64BL
         */
        EXTENT_FRAGMENTATION_LARGER_THAN_64BL(317),
        /**
         * USR_PERCT
         */
        USR_PERCT(318), // (%)
        /**
         * SYS_PERCT
         */
        SYS_PERCT(319), // (%)
        /**
         * WAIT_PERCT
         */
        WAIT_PERCT(320), // (%)
        /**
         * IDLE_PERCT
         */
        IDLE_PERCT(321), // (%)
        /**
         * HIQ_PERCT
         */
        HIQ_PERCT(322), // (%)
        /**
         * SIQ_PERCT
         */
        SIQ_PERCT(323), // (%)
        /**
         * SWAP_USE
         */
        SWAP_USE(324),
        /**
         * SWAP_FREE
         */
        SWAP_FREE(325),
        /**
         * MEMORY_USE
         */
        MEMORY_USE(326),
        /**
         * MEMORY_BUFFER
         */
        MEMORY_BUFFER(327),
        /**
         * MEMORY_CACHE
         */
        MEMORY_CACHE(328),
        /**
         * MEMORY_FREE
         */
        MEMORY_FREE(329),
        /**
         * MEMORY_DIRTY_PAGE
         */
        MEMORY_DIRTY_PAGE(330),
        /**
         * NETWORK_ERROR_INBOUND_PACKETS
         */
        NETWORK_ERROR_INBOUND_PACKETS(331),
        /**
         * NETWORK_ERROR_OUTBOUND_PACKETS
         */
        NETWORK_ERROR_OUTBOUND_PACKETS(332),
        /**
         * CACHEWATER
         */
        CACHEWATER(333),
        /**
         * TOTAL_MBS_READ
         */
        TOTAL_MBS_READ(334),
        /**
         * TOTAL_MBS_WRITE
         */
        TOTAL_MBS_WRITE(335);

        private long value;

        private StatisticDataId(long value)
        {
            this.value = value;
        }

        /**
         * 转换值
         * @param iValue 参数
         * @return 返回结果
         */
        public static StatisticDataId valueOf(long iValue)
        {
            for (StatisticDataId value : StatisticDataId.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        public long getValue()
        {
            return this.value;
        }
    }

    /**
     * EventLevelE
     * @author gWX183785
     * @version V100R001C10
     */
    public static enum EventLevelE
    {
        /**
         * INFO
         */
        INFO(2),
        /**
         * WARNING
         */
        WARNING(3),
        /**
         * MAJOR
         */
        MAJOR(5),
        /**
         * CRITICAL
         */
        CRITICAL(6);

        private int value;

        private EventLevelE(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static EventLevelE valueOf(int iValue)
        {
            for (EventLevelE value : EventLevelE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * LDAP_TRANSFER_E底层通讯协议类型:LDAP,LDAPS
     * @author w00208247
     * @version V100R001C10
     */
    public static enum LdapTransferE
    {
        /**
         * LDAP
         */
        LDAP(1),
        /**
         * LDAPS
         */
        LDAPS(2);

        private int value;

        private LdapTransferE(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static LdapTransferE valueOf(int iValue)
        {
            for (LdapTransferE value : LdapTransferE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * PASSWORDHASH_E密码所选用的加密方式（可选为clear，md5，crypt）
     * @author w00208247
     * @version V100R001C10
     */
    public static enum PasswordHashE
    {
        /**
         * clear
         */
        CLEAR(1),
        /**
         * md5
         */
        MD5(2),
        /**
         * crypt
         */
        CRYPT(3);

        private int value;

        private PasswordHashE(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static PasswordHashE valueOf(int iValue)
        {
            for (PasswordHashE value : PasswordHashE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * 访问权限
     * @author w00208247
     * @version V100R001C10
     */
    public static enum AccessPermissionE
    {
        /**
         * 只读
         */
        // CIFS_READ(1),
        CIFS_READ(0),
        /**
         * 读写
         */
        // CIFS_READ_WRITE(2),
        CIFS_READ_WRITE(5),
        /**
         * 完全控制
         */
        // CIFS_ALLCONTROL(3),
        CIFS_ALLCONTROL(1),
        /**
         * 禁止访问
         */
        // CIFS_NOACCESS(4),
        CIFS_NOACCESS(2),
        /**
         * 只读
         */
        NFS_R(5),
        /**
         * 读写，不允许root权限
         */
        NFS_RW_NOROOT(6),
        /**
         * 读写，允许root权限
         */
        NFS_RW_ALLOWROOT(7),
        /**
         * 禁止访问
         */
        NFS_NOACCESS(8),
        /**
         * 执行
         */
        NFS_EXECUTE(9);

        private int value;

        private AccessPermissionE(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static AccessPermissionE valueOf(int iValue)
        {
            for (AccessPermissionE value : AccessPermissionE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * NtlmLevelE
     * @author w00208247
     * @version V100R001C10
     */
    public static enum NtlmLevelE
    {
        /**
         * LEVEL_0
         */
        LEVEL_0(0),
        /**
         * LEVEL_1
         */
        LEVEL_1(1),
        /**
         * LEVEL_2
         */
        LEVEL_2(2),
        /**
         * LEVEL_3
         */
        LEVEL_3(3),
        /**
         * LEVEL_4
         */
        LEVEL_4(4);

        private int value;

        private NtlmLevelE(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static NtlmLevelE valueOf(int iValue)
        {
            for (NtlmLevelE value : NtlmLevelE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * ResTypeE
     * @author w00208247
     * @version V100R001C10
     */
    public static enum ResTypeE
    {
        /**
         * 初始默认
         */
        DEFAULT(1),
        /**
         * 管理员创建
         */
        CREATE(2);

        private int value;

        private ResTypeE(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static ResTypeE valueOf(int iValue)
        {
            for (ResTypeE value : ResTypeE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * 配额树运行状态
     */
    public static enum QuotaSwitchStatusE
    {
        ON(1), OFF(0), INITIALIZING(2);

        private int value;

        private QuotaSwitchStatusE(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static QuotaSwitchStatusE valueOf(int iValue)
        {
            for (QuotaSwitchStatusE value : QuotaSwitchStatusE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }
    }

    /**
     * 配额类型
     * @author fWX183786
     * @version V100R001C10
     */
    public static enum QuotaTypeE
    {
        /** Normal目录配额 */
        QUOTA_FOLDER(1),
        /** 用户的配额 */
        QUOTA_USER(2),
        /** 用户组的配额 */
        QUOTA_USERGROUP(3),
        /** 用户默认配额 */
        DEFAULT_USER_QUOTA(4),
        /** 组默认配额 */
        DEFAULT_GROUP_QUOTA(5),
        /** 用户和组配额 */
        QUOTA_USER_USERGROUP(6);

        private int value;

        private QuotaTypeE(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static QuotaTypeE valueOf(int iValue)
        {
            for (QuotaTypeE value : QuotaTypeE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * 应用类型
     * @author z00231026
     * @version V100R003C30
     */
    public static enum AppTypeE
    {

        /** Normal目录配额 */
        OTHER(0),
        /** 用户的配额 */
        ORACEL(1),
        /** 用户组的配额 */
        EXCHANGE(2),
        /** 用户默认配额 */
        SQLSERVER(3),
        /** 组默认配额 */
        VMWARE(4),
        /** 用户和组配额 */
        HYPER_V(5);

        private int value;

        private AppTypeE(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static AppTypeE valueOf(int iValue)
        {
            for (AppTypeE value : AppTypeE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * 标识是那种业务类型：是远程复制还是LUN拷贝
     * @author z00231026
     * @version V100R003C30
     */
    public static enum ServiceTypeE
    {
        /** NONE */
        NONE(0),
        /** LUN拷贝 */
        LUN_COPY(1),
        /** 远程复制 */
        REMOTE_REPLICATION(2);

        private int value;

        private ServiceTypeE(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static ServiceTypeE valueOf(int iValue)
        {
            for (ServiceTypeE value : ServiceTypeE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * 传输数据的协商状态 0 密钥未协商通过 1 已通过 2 不支持加密传输
     * @author z00231026
     * @version V100R003C30
     */
    public static enum ConsultStatusE
    {

        /** 密钥未协商通过 */
        NOPASS(0),
        /** 已通过 */
        PASS(1),
        /** 不支持加密传输 */
        NOT_SUPPORT(2);

        private int value;

        private ConsultStatusE(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static ConsultStatusE valueOf(int iValue)
        {
            for (ConsultStatusE value : ConsultStatusE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * 标识远端设备种类，是第三方设备，还是华为设备
     * @author z00231026
     * @version V100R003C30
     */
    public static enum ArrayTypeE
    {

        /** 本厂商设备 */
        EPL_ARRAY_PRIVATE(1),
        /** 第三方设备 */
        EPL_ARRAY_3RD(2),
        /** 未知设备 */
        EPL_ARRAY_UNKNOWN(3);

        private int value;

        private ArrayTypeE(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static ArrayTypeE valueOf(int iValue)
        {
            for (ArrayTypeE value : ArrayTypeE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * 增值可用远端LUN类型
     * @author z00231026
     * @version V100R003C30
     */
    public static enum RSSTypeE
    {

        /** 可以做为克隆主LUN的LUN */
        CLONE_PRIMARYLUN(0),
        /** 可以做为克隆从LUN的LUN */
        CLONE_SECONDARYLUN_CREATE(1),
        /** 可以添加到克隆从LUN的LUN */
        CLONE_SECONDARYLUN_ADD(2),
        /** 可以做为LUN拷贝源LUN的本端LUN */
        LUNCOPY_SOURCELUN_LOCALLUN(3),
        /** 可以做为LUN拷贝源LUN的本端快照 */
        LUNCOPY_SOURCELUN_LOCALSNAP(4),
        /** 可以做为LUN拷贝源LUN的远端LUN */
        LUNCOPY_SOURCELUN_REMOTELUN(5),
        /** 可以做为LUN拷贝目标LUN的本端LUN */
        LUNCOPY_TARGET_LOCALLUN_CREATE(6),
        /** 可以添加到LUN拷贝中的本端LUN */
        LUNCOPY_TARGET_LOCALLUN_ADD(7),
        /** 可以做为LUN拷贝目标LUN的本端快照 */
        LUNCOPY_TARGET_LOCALSNAP_CREATE(8),
        /** 可以添加到LUN拷贝中的本端快照 */
        LUNCOPY_TARGET_LOCALSNAP_ADD(9),
        /** 可以做为LUN拷贝目标LUN的远端LUN */
        LUNCOPY_TARGET_REMOTELUN_CREATE(10),
        /** 可以添加到LUN拷贝中的远端LUN */
        LUNCOPY_TARGET_REMOTELUN_ADD(11),
        /** 可以做为远程复制Pair主LUN的LUN */
        REP_PRIMARYLUN(12),
        /** 可以做为远程复制从LUN的远端LUN */
        REP_SECONDARYLUN(13),
        /** 可以做为LUN拷贝源LUN的第三方LUN */
        LUNCOPY_SOURCELUN_3RDLUN(14),
        /** 可以做为LUN拷贝目标LUN的第三方LUN */
        LUNCOPY_TARGET_3RDLUN_CREATE(15),
        /** 可以添加到LUN拷贝中的第三方LUN */
        LUNCOPY_TARGET_3RDLUN_ADD(16);

        private int value;

        private RSSTypeE(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static RSSTypeE valueOf(int iValue)
        {
            for (RSSTypeE value : RSSTypeE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * 加入域失败错误
     */
    public static enum JOINDOMAINERRORCODE_E
    {

        /** 成功 */
        SUCCESS(0),
        /** 域FQDN无效 */
        ERRORCODE1(1),
        /** 域管理员帐户未配置 */
        ERRORCODE2(2),
        /** 域管理密码未配置 */
        ERRORCODE3(3),
        /** 系统名称无效 */
        ERRORCODE4(4),
        /** 节点和域控制器间的时钟漂移过大 */
        ERRORCODE5(5),
        /** 无法定位域控制器 */
        ERRORCODE6(6),
        /** 域管理员帐户或密码错误 */
        ERRORCODE7(7),
        /** 协议模块内部错误 */
        ERRORCODE8(8);

        private int value;

        private JOINDOMAINERRORCODE_E(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static JOINDOMAINERRORCODE_E valueOf(int iValue)
        {
            for (JOINDOMAINERRORCODE_E value : JOINDOMAINERRORCODE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * 用户级别
     */
    public static enum USER_LEVEL_E
    {
        /** 超级管理员 */
        SUPER_ADMIN(1),
        /** 管理员 */
        ADMIN(2),
        /** 只读用户 */
        READONLY(3),
        /** 资源管理员 */
        RESOURCE_ADMIN(4),
        /** 设备管理员 */
        DEVICE_ADMIN(5);

        private int value;

        private USER_LEVEL_E(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static USER_LEVEL_E valueOf(int iValue)
        {
            for (USER_LEVEL_E value : USER_LEVEL_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * 用户是否在线
     */
    public static enum USER_STATE_E
    {
        /** 离线 */
        OFF_LINE(0),
        /** 在线 */
        ON_LINE(1),
        /** 用户被锁定 */
        LOCKED(2),
        /** 密码过期 */
        PWD_EXPIRED(3),
        /** 用户密码处于初始化状态，需要修改 */
        PWD_INITIAL(4),
        /** 密码即将到期 */
        PWD_EXPIRING(5);

        private int value;

        private USER_STATE_E(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static USER_STATE_E valueOf(int iValue)
        {
            for (USER_STATE_E value : USER_STATE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * 本地用户或者域用户
     */
    public static enum USER_SCOPE_E
    {
        /** 本地用户 */
        LOCAL(0),
        /** LDAP用戶 */
        LDAP(1),
        /** LDAP用户组 */
        LDAP_GROUP(2),
        /** SFTP用户 */
        SFTP_USER(3),
        /** 机机交互用户 */
        M2M_USER(4);

        private int value;

        private USER_SCOPE_E(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static USER_SCOPE_E valueOf(int iValue)
        {
            for (USER_SCOPE_E value : USER_SCOPE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * 级别所归属的组的类型
     */
    public static enum USER_LEVELGROUP_TYPE
    {
        /** 所有组 */
        LEVELGROUP_ALL(0),
        /** 系统组 */
        LEVELGROUP_SYSTEM(1),
        /** 租户组 */
        LEVELGROUP_TENANT(2),
        /** WORM组 */
        LEVELGROUP_WORM(3);

        private int value;

        private USER_LEVELGROUP_TYPE(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static USER_LEVELGROUP_TYPE valueOf(int iValue)
        {
            for (USER_LEVELGROUP_TYPE value : USER_LEVELGROUP_TYPE.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }

    /**
     * 用户是否锁定
     */
    public static enum USER_LOCK_STATE_E
    {
        /** 未锁定 */
        UNLOCKED(0),
        /** 锁定 */
        LOCKED(1);

        private int value;

        private USER_LOCK_STATE_E(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static USER_LOCK_STATE_E valueOf(int iValue)
        {
            for (USER_LOCK_STATE_E value : USER_LOCK_STATE_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }
    
    /**
     * 用户是否锁定
     */
    public static enum DOMAIN_STATUS_E
    {
        /** 退出域 */
        EXIT_DOMAIN(0),
        /** 加入域 */
        JOIN_DOMAIN(1),
        /** 正在退出域 */
        EXITING_DOMAIN(2),
        /** 正在加入域 */
        JOINING_DOMAIN(3),
        /** 加入域失败 */
        JOIN_FAILED(4);

        private int value;

        private DOMAIN_STATUS_E(int value)
        {
            this.value = value;
        }

        /**
         * valueOf
         * @param iValue 参数
         * @return 返回结果
         */
        public static DOMAIN_STATUS_E valueOf(int iValue)
        {
            for (DOMAIN_STATUS_E value : DOMAIN_STATUS_E.values())
            {
                if (value.value == iValue)
                {
                    return value;
                }
            }
            return null;
        }

        /**
         * getValue
         * @return 返回结果
         */
        public int getValue()
        {
            return this.value;
        }

        /**
         * 转为String类型
         * @return 返回结果
         */
        public String toString()
        {
            return this.getClass().getSimpleName() + "." + this.name();
        }
    }
}
