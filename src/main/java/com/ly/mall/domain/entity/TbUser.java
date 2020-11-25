package com.ly.mall.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

@Data
@TableName(value = "tb_user")
public class TbUser implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 用户密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 用户类型，1表示商家，2普通用户，3管理员
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 用户状态；1可用，2禁用
     */
    @TableField(value = "state")
    private Integer state;

    /**
     * 联系方式
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 性别；1男2女
     */
    @TableField(value = "sex")
    private Integer sex;

    /**
     * 用户头像
     */
    @TableField(value = "head")
    private String head;

    /**
     * 用户是否有效；1有，2没有
     */
    @TableField(value = "is_delete")
    private Integer isDelete;

    /**
     * 用户昵称
     */
    @TableField(value = "nick_name")
    private String nickName;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_PASSWORD = "password";

    public static final String COL_TYPE = "type";

    public static final String COL_STATE = "state";

    public static final String COL_PHONE = "phone";

    public static final String COL_SEX = "sex";

    public static final String COL_HEAD = "head";

    public static final String COL_IS_DELETE = "is_delete";

    public static final String COL_NICK_NAME = "nick_name";
}