package com.huawei.ism.openapi.common.model;

/**
 * MO类型枚举
 * 
 * @author fWX183786
 * @version V100R001C10
 */
public enum MOType
{

    /** 硬盘 */
    DISK(10),
    /** LUN */
    LUN(11),
    /** 主机组 */
    HOSTGROUP(14),
    /** 主机 */
    HOST(21),
    /** 快照 */
    SNAPSHOT(27),
    /** 系统 */
    SYSTEM(201),
    /** 用户 */
    USER(202),
    /** 域 */
    DOMAIN(203),
    /** 框 */
    ENCLOSURE(206),
    /** 控制器 */
    CONTROLLER(207),
    /** FC端口 */
    FC_PORT(212),
    /** 以太网口 */
    ETH_PORT(213),
    /** SAS端口 */
    SAS_PORT(214),
    /** 存储池 */
    STORAGEPOOL(216),
    /** 一致性组 */
    CONSISTENTGROUP(221),
    /** iSCSI启动器 */
    ISCSI_INITIATOR(222),
    /** FC启动器 */
    FC_INITIATOR(223),
    /** REMOTE_DEVICE */
    REMOTE_DEVICE(224),
    /** FC_LINK */
    FC_LINK(225),
    /** ISCSI_LINK */
    ISCSI_LINK(243),
    /** 映射视图 */
    MAPPINGVIEW(245),
    /** REMOTE_LUN */
    REMOTE_LUN(250),
    /** FCoE端口 */
    FCOE_PORT(252),
    /** LUN组 */
    LUNGROUP(256),
    /** Port组 */
    PORTGROUP(257),
    /** REPLICATIONPAIR */
    REPLICATIONPAIR(263),
    /** 硬盘池 */
    DISKPOOL(266),

    /** 存储引擎 */
    STORAGEENGINE(267),
    /** 存储分区 */
    CACHEPARTITION(268),
    /** NAS AD域 */
    NAS_AD_FIELD(16414),
    /** NAS LDAP域 */
    NAS_LDAP_FIELD(16413),
    /** SNAS_NIS_CONFIG */
    NAS_NIS_FIELD(16412),
    /** NFSShare */
    SNAS_NFS_SHARE(16401),
    /** NFSShareAuthClent */
    SNAS_NFS_SHARE_AUTH_CLIENT(16409),
    /** 配额树 */
    QUOTATREE(16445),
    /** 配额 */
    QUOTA(16458),
    /** 枚举变量 */
    // HOMEDIR(53251),
    HOMEDIR(16457),
    /** 文件系统 */
    FILESYSTEM(40),
    /** SNAS_CIFS_SHARE */
    SNAS_CIFS_SHARE(16402),
    /** SNAS_CIFS_SHARE_AUTH_CLIENT */
    SNAS_CIFS_SHARE_AUTH_CLIENT(16404),
    /** 租户 */
    VSTORE(16442),
    /** NFSSERVICE */
    NFSSERVICE(16452),
    /** CIFSSERVICE */
    CIFSSERVICE(16453),
    /** LOCAL_RESUSER */
    LOCAL_RESUSER(16446),
    /** LOCAL_RESGROUP */
    LOCAL_RESGROUP(16447);

    /** value变量 */
    private int value;

    /**
     * MO类型
     * 
     * @param value
     */
    private MOType(int value)
    {
        this.value = value;
    }

    /**
     * 方法 ： getTypeName
     * 
     * @param value 方法参数：value
     * @return String 返回结果
     */
    public static String getTypeName(int value)
    {
        for (MOType type : MOType.values())
        {
            if (type.getValue() == value)
            {
                return type.name();
            }
        }
        return null;
    }

    /**
     * 方法 ： getType
     * 
     * @param value 方法参数：value
     * @return MOType 返回结果
     */
    public static MOType getType(int value)
    {
        for (MOType type : MOType.values())
        {
            if (type.getValue() == value)
            {
                return type;
            }
        }
        return null;
    }

    /**
     * 方法 ： getValue
     * 
     * @return int 返回结果
     */
    public int getValue()
    {
        return value;
    }
}
