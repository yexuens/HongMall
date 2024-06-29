package com.yexue.pms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yexue
 * @since 2024-05-30
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("product_operate_log")
public class ProductOperateLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品id
     */
    @TableField("product_id")
    private Long productId;

    /**
     * 改变前价格
     */
    @TableField("price_old")
    private BigDecimal priceOld;

    /**
     * 改变后价格
     */
    @TableField("price_new")
    private BigDecimal priceNew;

    /**
     * 改变前优惠价
     */
    @TableField("sale_price_old")
    private BigDecimal salePriceOld;

    /**
     * 改变后优惠价
     */
    @TableField("sale_price_new")
    private BigDecimal salePriceNew;

    /**
     * 改变前积分
     */
    @TableField("gift_point_old")
    private Integer giftPointOld;

    /**
     * 改变后积分
     */
    @TableField("gift_point_new")
    private Integer giftPointNew;

    /**
     * 改变前积分使用限制
     */
    @TableField("use_point_limit_old")
    private Integer usePointLimitOld;

    /**
     * 改变后积分使用限制
     */
    @TableField("use_point_limit_new")
    private Integer usePointLimitNew;

    /**
     * 操作人
     */
    @TableField("operate_man")
    private String operateMan;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
}
