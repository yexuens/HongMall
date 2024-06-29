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
@TableName("member_price")
public class MemberPrice implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品id
     */
    @TableField("product_id")
    private Long productId;

    /**
     * 会员等级id
     */
    @TableField("member_level_id")
    private Long memberLevelId;

    /**
     * 会员价格
     */
    @TableField("member_price")
    private BigDecimal memberPrice;

    /**
     * 会员等级名称
     */
    @TableField("member_level_name")
    private String memberLevelName;
}
