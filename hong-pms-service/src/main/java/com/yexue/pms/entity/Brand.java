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
@TableName("brand")
public class Brand implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 名称
     */
    @TableField("name")
    private String name;

    /**
     * 首字母
     */
    @TableField("first_letter")
    private String firstLetter;

    /**
     * 排序
     */
    @TableField("sort")
    private Integer sort;

    /**
     * 是否为品牌制造商：0->不是；1->是
     */
    @TableField("factory_status")
    private Integer factoryStatus;

    /**
     * 是否显示
     */
    @TableField("show_status")
    private Integer showStatus;

    /**
     * 产品数量
     */
    @TableField("product_count")
    private Integer productCount;

    /**
     * 产品评论数量
     */
    @TableField("product_comment_count")
    private Integer productCommentCount;

    /**
     * 品牌logo
     */
    @TableField("logo")
    private String logo;

    /**
     * 专区大图
     */
    @TableField("big_pic")
    private String bigPic;

    /**
     * 品牌故事
     */
    @TableField("brand_story")
    private String brandStory;
}
