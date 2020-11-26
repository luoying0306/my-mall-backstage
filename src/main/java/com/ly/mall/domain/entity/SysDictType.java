package com.ly.mall.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 字典类型表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_dict_type")
public class SysDictType implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 字典名
     */
    @TableField(value = "dict_name")
    private String dictName;

    /**
     * 字典排序
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private Integer createUser;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private Integer updateUser;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 状态： 1，正常，0，禁用
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_DICT_NAME = "dict_name";

    public static final String COL_SORT = "sort";

    public static final String COL_CREATE_USER = "create_user";

    public static final String COL_UPDATE_USER = "update_user";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_STATUS = "status";

    public static final String COL_REMARK = "remark";
}