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
@TableName("product_category")
public class ProductCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 上级分类的编号：0表示一级分类
     */
    @TableField("parent_id")
    private Long parentId;

    /**
     * 名称
     */
    @TableField("name")
    private String name;

    /**
     * 分类级别：0->1级；1->2级
     */
    @TableField("level")
    private Integer level;

    /**
     * 商品数量
     */
    @TableField("product_count")
    private Integer productCount;

    /**
     * 商品单位
     */
    @TableField("product_unit")
    private String productUnit;

    /**
     * 是否显示在导航栏：0->不显示；1->显示
     */
    @TableField("nav_status")
    private Integer navStatus;

    /**
     * 显示状态：0->不显示；1->显示
     */
    @TableField("show_status")
    private Integer showStatus;

    /**
     * 排序
     */
    @TableField("sort")
    private Integer sort;

    /**
     * 图标
     */
    @TableField("icon")
    private String icon;

    /**
     * 关键字
     */
    @TableField("keywords")
    private String keywords;

    /**
     * 描述
     */
    @TableField("description")
    private String description;
}
