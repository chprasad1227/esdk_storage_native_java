package com.huawei.ism.openapi.common.keydeifines;

/**
 * NAS业务属性
 * @author gWX183785
 * @version V100R001C10
 */
public final class TLVNAS
{

    /**
     * AD域业务属性
     * @author w00208247
     * @version [版本号V001R010C10]
     */
    public static class ADFIELD
    {
        /**
         * 私有属性Type
         */
        public static final String TYPE = "TYPE";

        /**
         * 私有属性TENANCYID
         */
        public static final String TENANCYID = "TENANCYID";

        /**
         * 私有属性DOMAINSTATUS
         */
        public static final String DOMAINSTATUS = "DOMAINSTATUS";

        /**
         * 私有属性ADMINNAME
         */
        public static final String ADMINNAME = "ADMINNAME";

        /**
         * 私有属性ADMINPWD
         */
        public static final String ADMINPWD = "ADMINPWD";

        /**
         * 私有属性JOINDOMAINERRORCODE
         */
        public static final String JOINDOMAINERRORCODE = "JOINDOMAINERRORCODE";

        /**
         * 私有属性FULLDOMAINNAME
         */
        public static final String FULLDOMAINNAME = "FULLDOMAINNAME";

        /**
         * 私有属性NTLMLEVEL
         */
        public static final String NTLMLEVEL = "NTLMLEVEL";

        /**
         * 私有属性OU
         */
        public static final String OU = "OU";

        /**
         * 私有属性USEKERBEROS
         */
        public static final String USEKERBEROS = "USEKERBEROS";

        /**
         * 私有属性CIFSDOMAINCONTROLLER
         */
        public static final String CIFSDOMAINCONTROLLER = "CIFSDOMAINCONTROLLER";

        /**
         * 私有属性SYSTEMNAME
         */
        public static final String SYSTEMNAME = "SYSTEMNAME";

        /**
         * 私有属性SITENAME
         */
        public static final String SITENAME = "SITENAME";
    }

    /**
     * LDAP域属性
     * @author w00208247
     * @version [版本号V001R010C10]
     */
    public static class LDAPFIELD
    {
        /**
         * 私有属性TYPE
         */
        public static final String TYPE = "TYPE";

        /**
         * 私有属性TENANCYID
         */
        public static final String TENANCYID = "TENANCYID";

        /**
         * 私有属性LDAPSERVER
         */
        public static final String LDAPSERVER = "LDAPSERVER";

        /**
         * 私有属性PORTNUM
         */
        public static final String PORTNUM = "PORTNUM";

        /**
         * 私有属性transferType
         */
        public static final String TRANSFERTYPE = "TRANSFERTYPE";

        /**
         * 私有属性username
         */
        public static final String USERNAME = "USERNAME";

        /**
         * 私有属性PWD
         */
        public static final String PWD = "PASSWORD";

        /**
         * 私有属性usersuffix
         */
        public static final String USERSUFFIX = "USERSUFFIX";

        /**
         * 私有属性groupsuffix
         */
        public static final String GROUPSUFFIX = "GROUPSUFFIX";

        /**
         * 私有属性basedn
         */
        public static final String BASEDN = "BASEDN";

        /**
         * 私有属性PWDHASH
         */
        public static final String PWDHASH = "PASSWORDHASH";

        /**
         * 私有属性shadowsuffix
         */
        public static final String SHADOWSUFFIX = "SHADOWSUFFIX";
    }

    /**
     * NIS域属性
     * @author w00208247
     * @version [版本号V001R010C10]
     */
    public static class NISFIELD
    {
        /**
         * 私有属性type
         */
        public static final String TYPE = "TYPE";

        /**
         * 私有属性tenancyID
         */
        public static final String TENANCYID = "TENANCYID";

        /**
         * 私有属性nisDomain
         */
        public static final String NISDOMAIN = "NISDOMAIN";

        /**
         * 私有属性nisServerAddr
         */
        public static final String NISSERVERADDR = "NISSERVERADDR";

    }

    /**
     * LOCALRESUSER 私有属性
     * @author gWX183785
     * @version V100R001C10
     */
    public static class LOCALRESUSER extends TLVMOMsg
    {
        /**
         * 私有属性tenancyID
         */
        public static final String TENANCYID = "TENANCYID";

        /**
         * 密码（传输的是明文）
         */
        public static final String PWD = "PASSWORD";

        /**
         * 用户所归属的主组ID
         */
        public static final String PRIMARYGROUPID = "PRIMARYGROUPID";

        /**
         * 用户所归属的主组
         */
        public static final String PRIMARYGROUPNAME = "PRIMARYGROUPNAME";

        /**
         * 临时组名称
         */
        public static final String GROUPNAMES = "GROUPNAMES";

        /**
         * USERTYPE
         */
        public static final String USERTYPE = "USERTYPE";

        /**
         * STATUSENABLE
         */
        public static final String STATUSENABLE = "STATUSENABLE";

        /**
         * GROUPTYPE
         */
        public static final String GROUPTYPE = "GROUPTYPE";
    }

    /**
     * LOCALRESGROUP 私有属性
     * @author gWX183785
     * @version V100R001C10
     */
    public static class LOCALRESGROUP extends TLVMOMsg
    {
        /**
         * 私有属性tenancyID
         */
        public static final String TENANCYID = "TENANCYID";

        /**
         * GROUPTYPE
         */
        public static final String GROUPTYPE = "GROUPTYPE";
    }

    /**
     * CIFSSERVICE 私有属性
     * @author gWX183785
     * @version V100R001C10
     */
    public static class CIFSSERVICE extends TLVMOMsg
    {
        /**
         * 私有属性tenancyID
         */
        public static final String TENANCYID = "TENANCYID";

        /**
         * 私有属性SECURITYMODEL
         */
        public static final String SECURITYMODEL = "SECURITYMODEL";

        /**
         * 是否允许来宾访问
         */
        public static final String GUESTENABLE = "GUESTENABLE";

        /**
         * CIFS协议是否必须要求客户端支持签名
         */
        public static final String SIGNINGREQUIRED = "SIGNINGREQUIRED";

        /**
         * 是否CIFS协议开启签名
         */
        public static final String SIGNINGENABLE = "SIGNINGENABLE";

        /**
         * 优化锁开关（协议锁之后文件系统不用锁）
         */
        public static final String ENABLEOPLOCK = "ENABLEOPLOCK";

        /**
         * 优化锁的超时时间
         */
        public static final String OPLOCKTIMEOUT = "OPLOCKTIMEOUT";

        /**
         * 启用匿名访问
         */
        public static final String ANONYMOUSENABLE = "ANONYMOUSENABLE";

        /**
         * 启用Notify
         */
        public static final String ENABLENOTIFY = "ENABLENOTIFY";
    }

    /**
     * NFSSERVICE 私有属性
     * @author gWX183785
     * @version V100R001C10
     */
    public static class NFSSERVICE extends TLVMOMsg
    {
        /**
         * 租户ID(0表示全局）
         */
        public static final String TENANCYID = "TENANCYID";

        /**
         * 支持NFSV3(默认开启 TRUE)
         */
        public static final String SUPPORTV3 = "SUPPORTV3";

        /**
         * 支持NFSV4(默认关闭 FALSE)
         */
        public static final String SUPPORTV4 = "SUPPORTV4";

        /**
         * nfsv4 域名（默认域名为localdomain）
         */
        public static final String NFSV4DOMAIN = "NFSV4DOMAIN";
    }

    /**
     * HOMEDIR 私有属性
     * @author gWX183785
     * @version V100R001C10
     */
    public static class HOMEDIR extends TLVMOMsg
    {

        /**
         * 私有属性TENANCYID
         */
        public static final String TENANCYID = "TENANCYID";

        /**
         * 私有属性SHAREPATH
         */
        public static final String SHAREPATH = "SHAREPATH";

        /**
         * 私有属性FSID
         */
        public static final String FSID = "FSID";

        /**
         * 私有属性ISOPEN
         */
        public static final String ISOPEN = "ISOPEN";

        /**
         * 私有属性ISAUTOCREATE
         */
        public static final String ISAUTOCREATE = "ISAUTOCREATE";

        /**
         * 私有属性MODE
         */
        public static final String MODE = "MODE";

    }

    /**
     * NFS共享
     * @author w00208247
     * @version [版本号V001R010C10]
     */
    public static class NFSSHARE extends TLVMOMsg
    {

        /**
         * 私有属性tenancyId
         */
        public static final String TENANCYID = "TENANCYID";

        /**
         * 私有属性sharePath
         */
        public static final String SHAREPATH = "SHAREPATH";

        /**
         * 私有属性fsId
         */
        public static final String FSID = "FSID";

    }

    /**
     * NFS共享访问权限控制
     * @author w00208247
     * @version [版本号V001R010C10]
     */
    public static class NFSSHAREAUTHCLIENT extends TLVMOMsg
    {

        /**
         * 私有属性TENANCYID
         */
        public static final String TENANCYID = "TENANCYID";

        /**
         * 私有属性SHAREPATH
         */
        public static final String SHAREPATH = "SHAREPATH";

        /**
         * 私有属性ACCESSVAL
         */
        public static final String ACCESSVAL = "ACCESSVAL";

        /**
         * 私有属性SYNC
         */
        public static final String SYNC = "SYNC";

        /**
         * 私有属性ALLSQUASH
         */
        public static final String ALLSQUASH = "ALLSQUASH";

        /**
         * 私有属性ROOTSQUASH
         */
        public static final String ROOTSQUASH = "ROOTSQUASH";

    }

    /**
     * CIFS共享
     * @author w00208247
     * @version [版本号V001R010C10]
     */
    public static class CIFSSHARE extends TLVMOMsg
    {

        /**
         * 私有属性tenancyId
         */
        public static final String TENANCYID = "TENANCYID";

        /**
         * 私有属性sharePath
         */
        public static final String SHAREPATH = "SHAREPATH";

        /**
         * 私有属性abeEnable
         */
        public static final String ABEENABLE = "ABEENABLE";

        /**
         * 私有属性fsId
         */
        public static final String FSID = "FSID";

        /**
         * 私有属性enableOpLock
         */
        public static final String ENABLEOPLOCK = "ENABLEOPLOCK";

    }

    /**
     * CIFS共享访问权限控制
     * @author w00208247
     * @version [版本号V001R010C10]
     */
    public static class CIFSSHAREAUTHCLIENT extends TLVMOMsg
    {
        /**
         * 私有属性TENANCYID
         */
        public static final String TENANCYID = "TENANCYID";

        // /**
        // * 私有属性SHAREID
        // */
        // public static final String SHAREID = "SHAREID";
        //
        // /**
        // * 私有属性ACCESSOBJ
        // */
        // public static final String ACCESSOBJ = "ACCESSOBJ";
        //
        // /**
        // * 私有属性ACCESSID
        // */
        // public static final String ACCESSID = "ACCESSID";
        //
        // /**
        // * 私有属性ACCESSNAME
        // */
        // public static final String ACCESSNAME = "ACCESSNAME";zWX228053
        // 注释掉多余属性

        /**
         * 私有属性PERMISSION
         */
        public static final String PERMISSION = "PERMISSION";

        /**
         * 私有属性DOMAINTYPE
         */
        public static final String DOMAINTYPE = "DOMAINTYPE";

    }

    /**
     * 文件系统
     * @author w00208247
     * @version [版本号V001R010C10]
     */
    public static class FILESYSTEM extends TLVMOMsg
    {
        /**
         * 私有属性TENANCYID
         */
        public static final String TENANCYID = "TENANCYID";

        /**
         * 私有属性ALLOCTYPE
         */
        public static final String ALLOCTYPE = "ALLOCTYPE";

        /**
         * 私有属性CAPACITY
         */
        public static final String CAPACITY = "CAPACITY";

        /**
         * 私有属性INITIALALLOCCAPACITY
         */
        public static final String INITIALALLOCCAPACITY = "INITIALALLOCCAPACITY";

        /**
         * 私有属性SNAPSHOTRESERVEPER
         */
        public static final String SNAPSHOTRESERVEPER = "SNAPSHOTRESERVEPER";

        /**
         * 私有属性AUTODELSNAPSHOTENABLE
         */
        public static final String AUTODELSNAPSHOTENABLE = "AUTODELSNAPSHOTENABLE";

        /**
         * 私有属性SNAPSHOTUSECAPACITY
         */
        public static final String SNAPSHOTUSECAPACITY = "SNAPSHOTUSECAPACITY";

        /**
         * 私有属性CAPACITYTHRESHOLD
         */
        public static final String CAPACITYTHRESHOLD = "CAPACITYTHRESHOLD";

        /**
         * 私有属性ALLOCCAPACITY
         */
        public static final String ALLOCCAPACITY = "ALLOCCAPACITY";

        /**
         * 私有属性SECTORSIZE
         */
        public static final String SECTORSIZE = "SECTORSIZE";

        /**
         * 私有属性OWNINGCONTROLLER
         */
        public static final String OWNINGCONTROLLER = "OWNINGCONTROLLER";

        /**
         * 私有属性WORKINGCONTROLLER
         */
        public static final String WORKINGCONTROLLER = "WORKINGCONTROLLER";

        /**
         * 私有属性CHECKSUMENABLE
         */
        public static final String CHECKSUMENABLE = "CHECKSUMENABLE";

        /**
         * 私有属性IOPRIORITY
         */
        public static final String IOPRIORITY = "IOPRIORITY";

        /**
         * 私有属性CACHEPARTITIONID
         */
        public static final String CACHEPARTITIONID = "CACHEPARTITIONID";

        /**
         * 私有属性ISCLONEFS
         */
        public static final String ISCLONEFS = "ISCLONEFS";

        /**
         * 私有属性ENABLECOMPRESSION
         */
        public static final String ENABLECOMPRESSION = "ENABLECOMPRESSION";

        /**
         * 私有属性COMPRESSION
         */
        public static final String COMPRESSION = "COMPRESSION";

        /**
         * 私有属性ENABLEDEDUP
         */
        public static final String ENABLEDEDUP = "ENABLEDEDUP";

        /**
         * 私有属性WORMTYPE
         */
        public static final String WORMTYPE = "WORMTYPE";

        /**
         * 私有属性WORMMINPROTECTPERIOD
         */
        public static final String WORMMINPROTECTPERIOD = "WORMMINPROTECTPERIOD";

        /**
         * 私有属性WORMMAXPROTECTPERIOD
         */
        public static final String WORMMAXPROTECTPERIOD = "WORMMAXPROTECTPERIOD";

        /**
         * 私有属性WORMDEFPROTECTPERIOD
         */
        public static final String WORMDEFPROTECTPERIOD = "WORMDEFPROTECTPERIOD";

        /**
         * 私有属性WORMAUTOLOCK
         */
        public static final String WORMAUTOLOCK = "WORMAUTOLOCK";

        /**
         * 私有属性WORMAUTOLOCKTIME
         */
        public static final String WORMAUTOLOCKTIME = "WORMAUTOLOCKTIME";

        /**
         * 私有属性WORMAUTODEL
         */
        public static final String WORMAUTODEL = "WORMAUTODEL";

        /**
         * 私有属性ISSHOWSNAPDIR
         */
        public static final String ISSHOWSNAPDIR = "ISSHOWSNAPDIR";

        /**
         * 私有属性DATATRANSFERPOLICY
         */
        public static final String DATATRANSFERPOLICY = "DATATRANSFERPOLICY";

        /**
         * 私有属性INITIALDISTRIBUTEPOLICY
         */
        public static final String INITIALDISTRIBUTEPOLICY = "INITIALDISTRIBUTEPOLICY";

        /**
         * 私有属性QUOTASTATUS
         */
        public static final String QUOTASTATUS = "QUOTASTATUS";

        /**
         * 私有属性RECYCLESWITCH
         */
        public static final String RECYCLESWITCH = "RECYCLESWITCH";

        /**
         * 私有属性RECYCLEHOLDTIME
         */
        public static final String RECYCLEHOLDTIME = "RECYCLEHOLDTIME";

        /**
         * 私有属性RECYCLETHRESHOLD
         */
        public static final String RECYCLETHRESHOLD = "RECYCLETHRESHOLD";

        /**
         * 私有属性RECYCLEAUTOCLEANSWITCH
         */
        public static final String RECYCLEAUTOCLEANSWITCH = "RECYCLEAUTOCLEANSWITCH";

        /**
         * 私有属性COUNT
         */
        public static final String COUNT = "COUNT";

    }

    /**
     * 配额树属性
     * @author fWX183786
     * @version V100R001C10
     */
    public static class QUOTATREE extends TLVMOMsg
    {
        /**
         * 私有属性TENANCYID
         */
        public static final String TENANCYID = "TENANCYID";

        public static final String QUOTASWITCH = "QUOTASWITCH";

        public static final String QUOTASWITCHSTATUS = "QUOTASWITCHSTATUS";

        public static final String NEEDINIT = "NEEDINIT";
    }

    /**
     * 配额属性
     * @author fWX183786
     * @version V100R001C10
     */
    public static class QUOTA extends TLVMOMsg
    {
        /**
         * 私有属性TENANCYID
         */
        public static final String TENANCYID = "TENANCYID";

        /**
         * 配额类型
         */
        public static final String QUOTATYPE = "QUOTATYPE";

        /**
         * 资源使用者名称
         */
        public static final String RESUSENAME = "RESUSENAME";

        /**
         * 空间软配额
         */
        public static final String SPACESOFTQUOTA = "SPACESOFTQUOTA";

        /**
         * 控件硬配额
         */
        public static final String SPACEHARDQUOTA = "SPACEHARDQUOTA";

        /**
         * 空间阈值
         */
        public static final String SPACETHRESHOLD = "SPACETHRESHOLD";

        /**
         * 文件数软配额
         */
        public static final String FILESOFTQUOTA = "FILESOFTQUOTA";

        /**
         * 文件数硬配额
         */
        public static final String FILEHARDQUOTA = "FILEHARDQUOTA";

        /**
         * report操作/查询配置信息
         */
        public static final String ISSEARCHREPORT = "ISSEARCHREPORT";

    }

    /**
     * 租户
     * @author fWX183786
     * @version V100R001C10
     */
    public static final class VSTORE extends TLVMOMsg
    {
        /** 租户管理员的ID */
        public static final String USERIDS = "USERIDS";

        /** 支持iSCSI协议 */
        public static final String SUPPORTISCSI = "SUPPORTISCSI";

        /** 支持FC/FCoE协议 */
        public static final String SUPPORTFC = "SUPPORTFC";

        /** 支持NFS协议 */
        public static final String SUPPORTNFS = "SUPPORTNFS";

        /** 支持CIFS协议 */
        public static final String SUPPORTCIFS = "SUPPORTCIFS";

    }

    /**
     * 用户
     */
    public static final class USER extends TLVMOMsg
    {
        /** 级别 */
        public static final String LEVEL = "LEVEL";

        /** 本地用户或者域用户 */
        public static final String SCOPE = "SCOPE";

        /** 级别所归属的组的类型 */
        public static final String LEVELGROUPTYPE = "LEVELGROUPTYPE";

        /** 创建时间 */
        public static final String CREATETIME = "CREATETIME";

        /** 用户是否在线 */
        public static final String ISONLINE = "ISONLINE";

        /** 是否锁定 */
        public static final String LOCKSTATUS = "LOCKSTATUS";

        /** 密码 */
        public static final String PWD = "PASSWORD";

    }
}
