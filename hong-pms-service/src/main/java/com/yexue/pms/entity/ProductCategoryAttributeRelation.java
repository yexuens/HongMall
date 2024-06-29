package com.yexue.pms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("product_category_attribute_relation")
public class ProductCategoryAttributeRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品分类id
     */
    @TableField("product_category_id")
    private Long productCategoryId;

    /**
     * 商品属性id
     */
    @TableField("product_attribute_id")
    private Long productAttributeId;
}
