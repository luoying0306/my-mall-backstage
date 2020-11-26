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
    * 字典数据
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_dict_data")
public class SysDictData implements Serializable {
    @TableField(value = "id")
    private Integer id;

    /**
     * 字典标签
     */
    @TableField(value = "dict_label")
    private String dictLabel;

    /**
     * 字典数值
     */
    @TableField(value = "dict_value")
    private String dictValue;

    /**
     * 字典类型
     */
    @TableField(value = "type")
    private Integer type;

    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(value = "create_user")
    private Integer createUser;

    @TableField(value = "update_user")
    private Integer updateUser;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_DICT_LABEL = "dict_label";

    public static final String COL_DICT_VALUE = "dict_value";

    public static final String COL_TYPE = "type";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_CREATE_USER = "create_user";

    public static final String COL_UPDATE_USER = "update_user";
}