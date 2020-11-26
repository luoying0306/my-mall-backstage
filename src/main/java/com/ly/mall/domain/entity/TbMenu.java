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

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_menu")
public class TbMenu implements Serializable {
    @TableField(value = "id")
    private Long id;

    /**
     * 菜单名
     */
    @TableField(value = "menu_name")
    private String menuName;

    /**
     * 父id
     */
    @TableField(value = "
parent_id")
    private Long 
parentId;

    /**
     * 显示顺序
     */
    @TableField(value = "order_num")
    private Integer orderNum;

    /**
     * 路由路径
     */
    @TableField(value = "path")
    private String path;

    @TableField(value = "menu_type")
    private String menuType;

    /**
     * 权限标识
     */
    @TableField(value = "perms")
    private String perms;

    /**
     * 图标
     */
    @TableField(value = "icon")
    private String icon;

    /**
     * 创建人
     */
    @TableField(value = "create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 0禁用1可用
     */
    @TableField(value = "state")
    private String state;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_MENU_NAME = "menu_name";

    public static final String COL_
PARENT_ID = "
parent_id";

    public static final String COL_ORDER_NUM = "order_num";

    public static final String COL_PATH = "path";

    public static final String COL_MENU_TYPE = "menu_type";

    public static final String COL_PERMS = "perms";

    public static final String COL_ICON = "icon";

    public static final String COL_CREATE_BY = "create_by";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_REMARK = "remark";

    public static final String COL_STATE = "state";
}