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
    * 消息表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_message")
public class SysMessage implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    /**
     * 发布人id
     */
    @TableField(value = "rel_user")
    private Integer relUser;

    /**
     * 接收人id
     */
    @TableField(value = "acc_user")
    private Integer accUser;

    /**
     * 消息内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 消息类型 1：系统，2，商家，3：用户
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 读状态：true,false
     */
    @TableField(value = "read")
    private Boolean read;

    /**
     * 发送时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_REL_USER = "rel_user";

    public static final String COL_ACC_USER = "acc_user";

    public static final String COL_CONTENT = "content";

    public static final String COL_TYPE = "type";

    public static final String COL_READ = "read";

    public static final String COL_CREATE_TIME = "create_time";
}