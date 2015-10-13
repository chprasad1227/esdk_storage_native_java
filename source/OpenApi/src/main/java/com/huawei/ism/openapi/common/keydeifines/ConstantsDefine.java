/**
 * HTTP 头部固定值区域
 */
package com.huawei.ism.openapi.common.keydeifines;

import com.huawei.ism.openapi.common.exception.ApiMessage;

/**
 * 公共定义文件
 * @author w00208247
 * @version [版本号V001R010C10]
 */
public class ConstantsDefine
{
    /**
     * HttpCfgConstant
     * @author gWX183785
     * @version V100R001C10
     */
    public static class HttpCfgConstant
    {
        /**
         * UTF8
         */
        public static final String UTF8 = "utf-8";

        /**
         * 重连的次数
         */
        public static final int RETRY_CNT = 5;

        /**
         * HTTPS_HEAD
         */
        public static final String HTTPS_HEAD = "https://";

        /**
         * HTTP_REST_PATH
         */
        public static final String HTTP_REST_PATH = "/deviceManager/rest";
    }

    /**
     * HttpErrorConstant
     * @author gWX183785
     * @version V100R001C10
     */
    public static class HttpErrorConstant
    {
        /**
         * rest 返回的错误码
         */
        public static final int OK = 0;

        /**
         * 鉴权失败
         */
        public static final int ERROR_401 = -401;
    }

    /**
     * LoginConstant
     * @author gWX183785
     * @version V100R001C10
     */
    public static class LoginConstant
    {
        /**
         * 保存用户的登录信息
         */
        public static final String USERNAME = "username";

        /**
         * PWD
         */
        public static final String PWD = "pwd";

        /**
         * SCOPE
         */
        public static final String SCOPE = "scope";
    }

    /**
     * IsmJsonFieldConstant
     * @author gWX183785
     * @version V100R001C10
     */
    public static class IsmJsonFieldConstant
    {
        /**
         * ERROR
         */
        public static final String ERROR = "error";

        /**
         * CODE
         */
        public static final String CODE = "code";

        /**
         * DATA
         */
        public static final String DATA = "data";

        /**
         * DEVICE_ID
         */
        public static final String DEVICE_ID = "deviceid";
    }

    /**
     * HttpHeaderFields
     * @author gWX183785
     * @version V100R001C10
     */
    public static class HttpHeaderFields
    {
        /**
         * ACCEPT_LAN
         */
        public static final String ACCEPT_LAN = "Accept-Language";

        /**
         * APP_JSON
         */
        public static final String APP_JSON = "application/json";

        /**
         * CONTENT_TYPE
         */
        public static final String CONTENT_TYPE = "Content-Type";

        /**
         * SET_COOKIE
         */
        public static final String SET_COOKIE = "Set-Cookie";// Set-Cookie

        /**
         * IBASETOKEN
         */
        public static final String IBASETOKEN = "iBaseToken";

    }

    public static class AcceptLanguage
    {
        /**
         * ACCEPT_LAN_EN
         */
        public static final String LAN_EN = "en";

        /**
         * ACCEPT_LAN_CH
         */
        public static final String LAN_CH = "zh_CN";

    }

    /**
     * HandlerConstant
     * @author gWX183785
     * @version V100R001C10
     */
    public static class HandlerConstant
    {
        /**
         * LUN_HANDLER
         */
        public static final String LUN_HANDLER = "LunHandler";

        /**
         * STORAGEPOOL_HANDLER
         */
        public static final String STORAGEPOOL_HANDLER = "StoragePoolHandler";

        /**
         * HOSTGROUP_HANDLER
         */
        public static final String HOSTGROUP_HANDLER = "HostGroupHandler";

        /**
         * PORTGROUP_HANDLER
         */
        public static final String PORTGROUP_HANDLER = "PortGroupHandler";

        /**
         * MAPPINGVIEW_HANDLER
         */
        public static final String MAPPINGVIEW_HANDLER = "MappingViewHandler";

        /**
         * ISCSIINITIATOR_HANDLER
         */
        public static final String ISCSIINITIATOR_HANDLER = "ISCSIInitiatorHandler";

        /**
         * FCINITIATOR_HANDLER
         */
        public static final String FCINITIATOR_HANDLER = "FcInitiatorHandler";

        /**
         * LUNGROUP_HANDLER
         */
        public static final String LUNGROUP_HANDLER = "LunGroupHandler";

        /**
         * HOST_HANDLER
         */
        public static final String HOST_HANDLER = "HostHandler";

        /**
         * SYSINFO_HANDLER
         */
        public static final String SYSINFO_HANDLER = "SysInfoHandler";

        /**
         * ALARM_HANDLER
         */
        public static final String ALARM_HANDLER = "AlarmHandler";

        /**
         * PERFSTATISTIC_HANDLER
         */
        public static final String PERFSTATISTIC_HANDLER = "PerfStatisticHandler";

        /**
         * DISKPOOL_HANDLER
         */
        public static final String DISKPOOL_HANDLER = "DiskPoolHandler";

        /**
         * CACHEPARTITION_HANDLER
         */
        public static final String CACHEPARTITION_HANDLER = "CachePartitionHandler";

        /**
         * PERFORMANCE_STATISTIC_SWITCH
         */
        public static final String PERFORMANCE_STATISTIC_SWITCH = "PerformanceStatisticSwitch";

        /**
         * SYSTEM_TIMEZONE
         */
        public static final String SYSTEM_TIMEZONE = "SystemTimezone";

        /**
         * FCOE_PORT
         */
        public static final String FCOE_PORT = "fcoePort";

        /**
         * ETH_PORT
         */
        public static final String ETH_PORT = "ethport";

        /**
         * CONTROLLER
         */
        public static final String CONTROLLER = "controller";

        /**
         * SNAPSHOT
         */
        public static final String SNAPSHOT = "snapshot";

        /**
         * DISK_HANDLER
         */
        public static final String DISK_HANDLER = "DiskHandler";

        /**
         * FCPORT_HANDLER
         */
        public static final String FCPORT_HANDLER = "FCPortHandler";

        /**
         * ADField_Handler
         */
        public static final String ADFIELD_HANDLER = "ADFieldHandler";

        /**
         * LDAPField_Handler
         */
        public static final String LDAPFIELD_HANDLER = "LDAPFieldHandler";

        /**
         * NISField_Handler
         */
        public static final String NISFIELD_HANDLER = "NISFieldHandler";

        /**
         * CIFSShare_handler
         */
        public static final String CIFSSHARE_HANDLER = "CIFSShareHandler";

        /**
         * CIFSShare_handler
         */
        public static final String CIFSSHARE_AUTH_CLIENT_HANDLER = "CIFSShareAuthClientHandler";

        /**
         * FileSystem_Handler
         */
        public static final String FILESYSTEM_HANDLER = "FileSystemHandler";

        /**
         * NFSSHARE_HANDLER
         */
        public static final String NFSSHARE_HANDLER = "NFSShareHandler";

        /**
         * NFSSHARE_AUTH_CLIENT_HANDLER
         */
        public static final String NFSSHARE_AUTH_CLIENT_HANDLER = "NFSShareAuthClientHandler";

        /**
         * HOMEDIR_HANDLER
         */
        public static final String HOMEDIR_HANDLER = "HomeDirHandler";

        /**
         * CIFSERVICE_HANDLER
         */
        public static final String CIFSSERVICE_HANDLER = "CIFSServiceHandler";

        /**
         * NFSSERVICE_HANDLER
         */
        public static final String NFSSERVICE_HANDLER = "NFSServiceHandler";

        /**
         * LOCAL_RESUSER_HANDLER
         */
        public static final String LOCAL_RESUSER_HANDLER = "LocalResuserHandler";

        /**
         * LOCAL_RESGROUP_HANDLER
         */
        public static final String LOCAL_RESGROUP_HANDLER = "LocalResgroupHandler";

        /**
         * QUOTA_HANDLER
         */
        public static final String QUOTA_HANDLER = "QuotaHandler";

        /**
         * QUOTATREE_HANDLER
         */
        public static final String QUOTATREE_HANDLER = "QuotaTreeHandler";

        /**
         * VSTORE_HANDLER
         */
        public static final String VSTORE_HANDLER = "VStoreHandler";
        
        /**
         * USER_HANDLER
         */
        public static final String USER_HANDLER = "UserHandler";

        /**
         * FCLINK_HANDLER
         */
        public static final String FCLINK_HANDLER = "FCLinkHandler";

        /**
         * ISCSILINK_HANDLER
         */
        public static final String ISCSILINK_HANDLER = "ISCSILinkHandler";

        /**
         * REMOTEDEVICE_HANDLER
         */
        public static final String REMOTEDEVICE_HANDLER = "RemoteDeviceHandler";

        /**
         * REMOTELUN_HANDLER
         */
        public static final String REMOTELUN_HANDLER = "RemoteLunHandler";

        /**
         * REPLICATIONPAIR_HANDLER
         */
        public static final String REPLICATIONPAIR_HANDLER = "ReplicationPairHandler";

        /**
         * REPLICATIONPAIR_HANDLER
         */
        public static final String CONSISTENTGROUP_HANDLER = "ConsistentGroupHandler";

    }

    /**
     * ArrayCfgConstant
     * @author gWX183785
     * @version V100R001C10
     */
    public static class ArrayCfgConstant
    {
        /**
         * 扇区固定的大小为512B
         */
        public static final int SECTOR_SIZE = 512;
    }

    /**
     * ExceptionConstant
     * @author gWX183785
     * @version V100R001C10
     */
    public static class ExceptionConstant
    {
        /**
         * JASONEXPMSG
         */
        public static final ApiMessage JASONEXPMSG = new ApiMessage(2000000000, "", "please check the input data");

        /**
         * SECURITYEXPMSG
         */
        public static final ApiMessage SECURITYEXPMSG = new ApiMessage(2000000001, "", "please check the constructor");

        /**
         * NOMETHODEXPMSG
         */
        public static final ApiMessage NOMETHODEXPMSG = new ApiMessage(2000000002, "",
            "please check whether the method is exist");

        /**
         * ILLEGALARGEXPMSG
         */
        public static final ApiMessage ILLEGALARGEXPMSG = new ApiMessage(2000000003, "", "please check the Argument");

        /**
         * INSTANTEXPMSG
         */
        public static final ApiMessage INSTANTEXPMSG = new ApiMessage(2000000004, "", "please check the instant type");

        /**
         * ILLEGAACCESSEXPMSG
         */
        public static final ApiMessage ILLEGAACCESSEXPMSG = new ApiMessage(2000000005, "",
            "please check the access authority");

        /**
         * INVOCATIONTARGETEXPMSG
         */
        public static final ApiMessage INVOCATIONTARGETEXPMSG = new ApiMessage(2000000006, "",
            "please check the Invocation Target");

        /**
         * NOALGORITHMEXP
         */
        public static final ApiMessage NOALGORITHMEXP = new ApiMessage(2000000007, "",
            "please check whether the Algorithm is existed");

        /**
         * KEYMANAGEEXPMSG
         */
        public static final ApiMessage KEYMANAGEEXPMSG = new ApiMessage(2000000008, "", "please check the key manage");

        /**
         * IOEXPMSG
         */
        public static final ApiMessage IOEXPMSG = new ApiMessage(2000000009, "", "please check the IO operation");

        /**
         * CLIENTPROTOLEXPMSG
         */
        public static final ApiMessage CLIENTPROTOLEXPMSG = new ApiMessage(2000000010, "",
            "please check the client protol");

        /**
         * ARGOUTOFBOUNDRYMSG
         */
        public static final ApiMessage ARGOUTOFBOUNDRYMSG = new ApiMessage(2000000011,
            "the argument's length is our of max length", "please check the arg's length");

        /**
         * NULLPOINTEREXPMSG
         */
        public static final ApiMessage NULLPOINTEREXPMSG = new ApiMessage(2000000012, "",
            "please check the object's value");

        /**
         * HTTPRESPONSEEXPMSG
         */
        public static final ApiMessage HTTPRESPONSEEXPMSG = new ApiMessage(2000000013, "", "please check the server");
    }

}
