package com.yexue.pms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
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
@TableName("product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 品牌id
     */
    @TableField("brand_id")
    private Long brandId;

    /**
     * 品牌分类id
     */
    @TableField("product_category_id")
    private Long productCategoryId;

    /**
     * 运费模版id
     */
    @TableField("feight_template_id")
    private Long feightTemplateId;

    /**
     * 品牌属性分类id
     */
    @TableField("product_attribute_category_id")
    private Long productAttributeCategoryId;

    /**
     * 商品名称
     */
    @TableField("name")
    private String name;

    /**
     * 图片
     */
    @TableField("pic")
    private String pic;

    /**
     * 货号
     */
    @TableField("product_sn")
    private String productSn;

    /**
     * 删除状态：0->未删除；1->已删除
     */
    @TableField("delete_status")
    @TableLogic
    private Integer deleteStatus;

    /**
     * 上架状态：0->下架；1->上架
     */
    @TableField("publish_status")
    private Integer publishStatus;

    /**
     * 新品状态:0->不是新品；1->新品
     */
    @TableField("new_status")
    private Integer newStatus;

    /**
     * 推荐状态；0->不推荐；1->推荐
     */
    @TableField("recommand_status")
    private Integer recommandStatus;

    /**
     * 审核状态：0->未审核；1->审核通过
     */
    @TableField("verify_status")
    private Integer verifyStatus;

    /**
     * 排序
     */
    @TableField("sort")
    private Integer sort;

    /**
     * 销量
     */
    @TableField("sale")
    private Integer sale;

    /**
     * 价格
     */
    @TableField("price")
    private BigDecimal price;

    /**
     * 促销价格
     */
    @TableField("promotion_price")
    private BigDecimal promotionPrice;

    /**
     * 赠送的成长值
     */
    @TableField("gift_growth")
    private Integer giftGrowth;

    /**
     * 赠送的积分
     */
    @TableField("gift_point")
    private Integer giftPoint;

    /**
     * 限制使用的积分数
     */
    @TableField("use_point_limit")
    private Integer usePointLimit;

    /**
     * 副标题
     */
    @TableField("sub_title")
    private String subTitle;

    /**
     * 商品描述
     */
    @TableField("description")
    private String description;

    /**
     * 市场价
     */
    @TableField("original_price")
    private BigDecimal originalPrice;

    /**
     * 库存
     */
    @TableField("stock")
    private Integer stock;

    /**
     * 库存预警值
     */
    @TableField("low_stock")
    private Integer lowStock;

    /**
     * 单位
     */
    @TableField("unit")
    private String unit;

    /**
     * 商品重量，默认为克
     */
    @TableField("weight")
    private BigDecimal weight;

    /**
     * 是否为预告商品：0->不是；1->是
     */
    @TableField("preview_status")
    private Integer previewStatus;

    /**
     * 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     */
    @TableField("service_ids")
    private String serviceIds;

    /**
     * 关键字
     */
    @TableField("keywords")
    private String keywords;

    /**
     * 备注
     */
    @TableField("note")
    private String note;

    /**
     * 画册图片，连产品图片限制为5张，以逗号分割
     */
    @TableField("album_pics")
    private String albumPics;

    /**
     * 详情标题
     */
    @TableField("detail_title")
    private String detailTitle;

    /**
     * 详情描述
     */
    @TableField("detail_desc")
    private String detailDesc;

    /**
     * 产品详情网页内容
     */
    @TableField("detail_html")
    private String detailHtml;

    /**
     * 移动端网页详情
     */
    @TableField("detail_mobile_html")
    private String detailMobileHtml;

    /**
     * 促销开始时间
     */
    @TableField("promotion_start_time")
    private Date promotionStartTime;

    /**
     * 促销结束时间
     */
    @TableField("promotion_end_time")
    private Date promotionEndTime;

    /**
     * 活动限购数量
     */
    @TableField("promotion_per_limit")
    private Integer promotionPerLimit;

    /**
     * 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     */
    @TableField("promotion_type")
    private Integer promotionType;

    /**
     * 产品分类名称
     */
    @TableField("product_category_name")
    private String productCategoryName;

    /**
     * 品牌名称
     */
    @TableField("brand_name")
    private String brandName;
}
