package com.yexue.oms.entity;

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
 * @since 2024-05-28
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("company_address")
public class CompanyAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 地址名称
     */
    @TableField("address_name")
    private String addressName;

    /**
     * 默认发货地址：0->否；1->是
     */
    @TableField("send_status")
    private Integer sendStatus;

    /**
     * 是否默认收货地址：0->否；1->是
     */
    @TableField("receive_status")
    private Integer receiveStatus;

    /**
     * 收发货人姓名
     */
    @TableField("name")
    private String name;

    /**
     * 收货人电话
     */
    @TableField("phone")
    private String phone;

    /**
     * 省/直辖市
     */
    @TableField("province")
    private String province;

    /**
     * 市
     */
    @TableField("city")
    private String city;

    /**
     * 区
     */
    @TableField("region")
    private String region;

    /**
     * 详细地址
     */
    @TableField("detail_address")
    private String detailAddress;
}
