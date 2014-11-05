package com.huawei.ism.openapi.common.keydeifines;

/**
 * 对象公共属性
 * 
 * 详细： 1 命令字：CommonProperty 2 命令类型：对象公共属性 3 命令参数：COMMONPROPERTY
 * 
 * @author V1R10
 * @version [版本号V001R010C00, 2011-12-14]
 */
public class TLVMOMsg
{
    /** 对象类型 */
    public static final String TYPE = "TYPE";

    /** 对象ID */
    public static final String ID = "ID";

    /** 对象名称 */
    public static final String NAME = "NAME";

    /** 父对象类型 */
    public static final String PARENTTYPE = "PARENTTYPE";

    /** 父对象ID */
    public static final String PARENTID = "PARENTID";

    /** 父对象名称 */
    public static final String PARENTNAME = "PARENTNAME";

    /** 位置信息 */
    public static final String LOCATION = "LOCATION";

    /** 健康状态 */
    public static final String HEALTHSTATUS = "HEALTHSTATUS";

    /** 运行状态 */
    public static final String RUNNINGSTATUS = "RUNNINGSTATUS";

    /** 描述信息 */
    public static final String DESCRIPTION = "DESCRIPTION";

    /** 对象统计数量，对单个对象无效，仅用于查询对象的数量时返回 */
    public static final String COUNT = "COUNT";

    /** 关联对象类型，对单个对象无效，仅用于查询此与关联对象有关系的对象 */
    public static final String ASSOCIATEOBJTYPE = "ASSOCIATEOBJTYPE";

    /** 对单个对象无效，仅用于查询此与关联对象有关系的对象 */
    public static final String ASSOCIATEOBJID = "ASSOCIATEOBJID";

    /**
     * 对单个对象无效，仅用于表示两个对象之间存在关联关系后附加的数据，如LUN与Host建立关联后，附加了一个HostLunID，
     * 此时可以在这个字段里表示。此字段必须是一个JSON对象，对象的定义根据应用的场景不同而不同
     */
    public static final String ASSOCIATEMETADATA = "ASSOCIATEMETADATA";

    /** 为基于应用的管理提供的标识，由管理软件设置，设备存下来，后续管理软件可以据此确定存储资源与应用的绑定关系 */
    public static final String APPLICATION = "APPLICATION";

    /**
     * 用于批量查询对象时增加搜索及排序条件，命令下发时使用，格式为一个json对象： {"query":
     * [{"ARG_INDEX1":"LIKE STR_VALUE1", "ARG_INDEX2":"STR_VALUE2",
     * "ARG_INDEX3":"[INT_VALUE1,INT_VALUE2)"}
     * ,{这里放第二个查询条件，与上面第一个格式相同，可以有多个查询条件，查到的对象取合集再排序}，...],
     * "sortby":"ARG_INDEX DESC", "range"："i-j"}
     * 说明：由"query"指定查询条件，查询条件是一个数组，可以放多个条件，每个条件本身是一个json对象，ARG_INDEX 表示某个属性的索引值，
     * 只允许对字符串或数字两种值设置查询条件，字符串模糊查询时使用LIKE关键字，字符串精确匹配时去掉LIKE关键字。数字查询时,使用类似
     * [v1,v2)区间表达式表示数字的取值范围。由"sortby"指定排序条件，只允许按某一个属性排序，当需要降序排列时后面追加DESC这四个字符，
     * 默认为升序排列由
     * "range"指定返回在查询结果中顺序为i到j的对象，用于对数据分页查询。0<=i<=j，当i超出范围时，只返回一个END_OF_TABLE
     * 的错误码，当j超时范围时，在返回的数据末层追加END_OF_TABLE的错误码，当请求的range过大以至超过TLV消息体的限制时，
     * 只返回排前面的部分数据，
     * 保证消息体不超过TLV限制即可此属性可供扩展，具体业务可根据自身需要添加其它的查询条件。比如：假设要支持查询过去一小时内哪些LUN悬挂IO超过
     * 一分钟，可以使用此属性 举例：要查询实际占用容量大于50万扇区且名称以 vmwareApp 开头的LUN 或
     * 健康状态为故障的所有LUN，并按名称降序排列，
     * 查询条件应为：{"query":[{"2":"LIKE vmwareApp","67":"[500000,)"
     * },{"7":"[2,2]"}],"sortby":"2 DESC"}
     */
    public static final String QUERYCONDITION = "QUERYCONDITION";

    /** 对单个对象无效，仅用于批量创建关联关系，如将多个硬盘一次性关联到Pool */
    public static final String ASSOCIATEOBJIDLIST = "ASSOCIATEOBJIDLIST";

    /** service 返回的错误代码 **/
    public static final String ERRORCODE = "code";

    /** service 返回的错误描述 **/
    public static final String ERRORDESCRIPTION = "description";

    /** service 修正错误的建议 **/
    public static final String ERRORSUGGESTION = "suggestion";
}
