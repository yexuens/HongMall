package com.yexue.pms.entity;

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
 * @since 2024-05-30
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("sku_stock")
public class SkuStock implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品id
     */
    @TableField("product_id")
    private Long productId;

    /**
     * sku编码
     */
    @TableField("sku_code")
    private String skuCode;

    /**
     * 价格
     */
    @TableField("price")
    private BigDecimal price;

    /**
     * 库存
     */
    @TableField("stock")
    private Integer stock;

    /**
     * 预警库存
     */
    @TableField("low_stock")
    private Integer lowStock;

    /**
     * 规格属性1
     */
    @TableField("sp1")
    private String sp1;

    /**
     * 规格属性2
     */
    @TableField("sp2")
    private String sp2;

    /**
     * 规格属性3
     */
    @TableField("sp3")
    private String sp3;

    /**
     * 展示图片
     */
    @TableField("pic")
    private String pic;

    /**
     * 销量
     */
    @TableField("sale")
    private Integer sale;

    /**
     * 单品促销价格
     */
    @TableField("promotion_price")
    private BigDecimal promotionPrice;

    /**
     * 锁定库存
     */
    @TableField("lock_stock")
    private Integer lockStock;
}
