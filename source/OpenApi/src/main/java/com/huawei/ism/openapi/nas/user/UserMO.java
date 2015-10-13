package com.huawei.ism.openapi.nas.user;

import org.json.JSONObject;

import com.huawei.ism.openapi.common.keydeifines.EnumDefine.USER_LEVELGROUP_TYPE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.USER_LEVEL_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.USER_LOCK_STATE_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.USER_SCOPE_E;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.USER_STATE_E;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.USER;
import com.huawei.ism.openapi.common.model.MO;
import com.huawei.ism.openapi.common.model.MOType;

/**
 * 租户对象类型
 */
public class UserMO
{
    private final MO mo;

    /**
     * 构造函数
     */
    public UserMO()
    {
        mo = new MO();
        setType(MOType.USER);
    }

    /**
     * 构造函数
     * @param jObject json 数据
     */
    public UserMO(JSONObject jObject)
    {
        mo = new MO(jObject);
        setType(MOType.USER);
    }

    /**
     * 获取租户类型
     * @return 租户类型
     */
    public MOType getType()
    {
        return MOType.USER;
    }

    /**
     * 设置租户ID
     * @param id 租户ID
     */
    public void setId(String id)
    {
        mo.setProperty(USER.ID, id);
    }

    /**
     * 获取租户id
     * @return 租户id
     */
    public String getId()
    {
        return mo.getStrProperty(USER.ID);
    }

    /**
     * 设置租户名称
     * @param name 租户名称
     */
    public void setName(String name)
    {
        mo.setProperty(USER.NAME, name);
    }

    /**
     * 获取租户的名称
     * @return 租户名称
     */
    public String getName()
    {
        return mo.getStrProperty(USER.NAME);
    }

    /**
     * 设置描述
     * @param description 描述
     */
    public void setDescription(String description)
    {
        mo.setProperty(USER.DESCRIPTION, description);
    }

    /**
     * 获取描述
     * @return 描述
     */
    public String getDescription()
    {
        return mo.getStrProperty(USER.DESCRIPTION);
    }

    /**
     * 获取创建时间
     * @return 创建时间
     */
    public Long getCreateTime()
    {
        return mo.getLongProperty(USER.CREATETIME);
    }

    /**
     * 获取在线状态
     * @return 在线状态
     */
    public USER_STATE_E getIsOnLine()
    {
        return USER_STATE_E.valueOf(mo.getIntProperty(USER.ISONLINE));
    }

    /**
     * 获取用户级别
     * @return 用户级别
     */
    public USER_LEVEL_E getLevel()
    {
        return USER_LEVEL_E.valueOf(mo.getIntProperty(USER.LEVEL));
    }

    /**
     * 设置用户级别
     * @param level 用户级别
     */
    public void setLevel(USER_LEVEL_E level)
    {
        mo.setProperty(USER.LEVEL, level.getValue());
    }

    /**
     * 获取锁定状态
     * @return 锁定状态
     */
    public USER_LOCK_STATE_E getLockState()
    {
        return USER_LOCK_STATE_E.valueOf(mo.getIntProperty(USER.LOCKSTATUS));
    }

    /**
     * 获取用户类型
     * @return 用户类型
     */
    public USER_SCOPE_E getScope()
    {
        return USER_SCOPE_E.valueOf(mo.getIntProperty(USER.SCOPE));
    }

    /**
     * 设置用户类型
     * @param scope 用户类型
     */
    public void setScope(USER_SCOPE_E scope)
    {
        mo.setProperty(USER.SCOPE, scope.getValue());
    }

    /**
     * 获取级别所归属的组的类型
     * @return 级别所归属的组的类型
     */
    public USER_LEVELGROUP_TYPE getLevelgroupType()
    {
        return USER_LEVELGROUP_TYPE.valueOf(mo.getIntProperty(USER.LEVELGROUPTYPE));
    }

    /**
     * 设置级别所归属的组的类型
     * @param levelgroupType 级别所归属的组的类型
     */
    public void setLevelgroup(USER_LEVELGROUP_TYPE levelgroupType)
    {
        mo.setProperty(USER.LEVELGROUPTYPE, levelgroupType.getValue());
    }

    /**
     * 获取密码
     * @return 密码
     */
    public String getPassoWrd()
    {
        return mo.getStrProperty(USER.PWD);
    }

    /**
     * 设置密码
     * @param passWord 密码
     */
    public void setPassWord(String passWord)
    {
        mo.setProperty(USER.PWD, passWord);
    }

    /**
     * 方法 ： getCount
     * 
     * @return long 返回结果
     */
    protected Long getCount()
    {
        return mo.getLongProperty(USER.COUNT);
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
     * 设置租户类型
     * @param type 租户类型
     */
    private void setType(MOType type)
    {
        mo.setProperty(USER.TYPE, type.getValue());
    }

    @Override
    public String toString()
    {
        return "UserMO [mo=" + mo + "]";
    }

}
