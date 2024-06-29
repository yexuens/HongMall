package com.yexue.oms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yexue
 * @since 2024-05-28
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("order_item")
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 订单id
     */
    @TableField("order_id")
    private Long orderId;

    /**
     * 订单编号
     */
    @TableField("order_sn")
    private String orderSn;

    /**
     * 商品id
     */
    @TableField("product_id")
    private Long productId;

    /**
     * 商品图片
     */
    @TableField("product_pic")
    private String productPic;

    /**
     * 商品名称
     */
    @TableField("product_name")
    private String productName;

    /**
     * 商品品牌
     */
    @TableField("product_brand")
    private String productBrand;

    /**
     * 商品条码
     */
    @TableField("product_sn")
    private String productSn;

    /**
     * 销售价格
     */
    @TableField("product_price")
    private BigDecimal productPrice;

    /**
     * 购买数量
     */
    @TableField("product_quantity")
    private Integer productQuantity;

    /**
     * 商品sku编号
     */
    @TableField("product_sku_id")
    private Long productSkuId;

    /**
     * 商品sku条码
     */
    @TableField("product_sku_code")
    private String productSkuCode;

    /**
     * 商品分类id
     */
    @TableField("product_category_id")
    private Long productCategoryId;

    /**
     * 商品的销售属性1
     */
    @TableField("sp1")
    private String sp1;

    /**
     * 商品的销售属性2
     */
    @TableField("sp2")
    private String sp2;

    /**
     * 商品的销售属性3
     */
    @TableField("sp3")
    private String sp3;

    /**
     * 商品促销名称
     */
    @TableField("promotion_name")
    private String promotionName;

    /**
     * 商品促销分解金额
     */
    @TableField("promotion_amount")
    private BigDecimal promotionAmount;

    /**
     * 优惠券优惠分解金额
     */
    @TableField("coupon_amount")
    private BigDecimal couponAmount;

    /**
     * 积分优惠分解金额
     */
    @TableField("integration_amount")
    private BigDecimal integrationAmount;

    /**
     * 该商品经过优惠后的分解金额
     */
    @TableField("real_amount")
    private BigDecimal realAmount;

    /**
     * 商品赠送积分
     */
    @TableField("gift_integration")
    private Integer giftIntegration;

    /**
     * 商品赠送成长值
     */
    @TableField("gift_growth")
    private Integer giftGrowth;

    /**
     * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    @TableField("product_attr")
    private String productAttr;
}
