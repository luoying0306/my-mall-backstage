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
    * 商品表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_commodity")
public class TbCommodity implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品名称
     */
    @TableField(value = "com_name")
    private String comName;

    /**
     * 商品封面图
     */
    @TableField(value = "image")
    private String image;

    /**
     * 商品销售数量
     */
    @TableField(value = "sale_number")
    private Integer saleNumber;

    /**
     * 商品库存
     */
    @TableField(value = "total")
    private Integer total;

    /**
     * 商品类型
     */
    @TableField(value = "`com_type`")
    private Integer comType;

    /**
     * 上架时间
     */
    @TableField(value = "date_time")
    private Date dateTime;

    /**
     * 商品状态；1上架，2下架
     */
    @TableField(value = "com_state")
    private Integer comState;

    /**
     * 商品价格
     */
    @TableField(value = "price")
    private Long price;

    /**
     * 商品简介
     */
    @TableField(value = "introduce")
    private String introduce;

    /**
     * 商品主题
     */
    @TableField(value = "com_title")
    private String comTitle;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private Integer userId;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_COM_NAME = "com_name";

    public static final String COL_IMAGE = "image";

    public static final String COL_SALE_NUMBER = "sale_number";

    public static final String COL_TOTAL = "total";

    public static final String COL_COM_TYPE = "com_type";

    public static final String COL_DATE_TIME = "date_time";

    public static final String COL_COM_STATE = "com_state";

    public static final String COL_PRICE = "price";

    public static final String COL_INTRODUCE = "introduce";

    public static final String COL_COM_TITLE = "com_title";

    public static final String COL_USER_ID = "user_id";
}