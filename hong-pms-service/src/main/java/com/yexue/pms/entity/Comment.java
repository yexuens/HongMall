package com.yexue.pms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("comment")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品id
     */
    @TableField("product_id")
    private Long productId;

    /**
     * 会员昵称
     */
    @TableField("member_nick_name")
    private String memberNickName;

    /**
     * 商品名称
     */
    @TableField("product_name")
    private String productName;

    /**
     * 评价星数：0->5
     */
    @TableField("star")
    private Integer star;

    /**
     * 评价的ip
     */
    @TableField("member_ip")
    private String memberIp;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 是否显示
     */
    @TableField("show_status")
    private Integer showStatus;

    /**
     * 购买时的商品属性
     */
    @TableField("product_attribute")
    private String productAttribute;

    /**
     * 收藏数
     */
    @TableField("collect_couont")
    private Integer collectCouont;

    /**
     * 阅读数
     */
    @TableField("read_count")
    private Integer readCount;

    /**
     * 内容
     */
    @TableField("content")
    private String content;

    /**
     * 上传图片地址，以逗号隔开
     */
    @TableField("pics")
    private String pics;

    /**
     * 评论用户头像
     */
    @TableField("member_icon")
    private String memberIcon;

    /**
     * 回复数
     */
    @TableField("replay_count")
    private Integer replayCount;
}
