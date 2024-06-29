package com.yexue.oms.entity;

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
 * @since 2024-05-28
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("order_operate_history")
public class OrderOperateHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 订单id
     */
    @TableField("order_id")
    private Long orderId;

    /**
     * 操作人：用户；系统；后台管理员
     */
    @TableField("operate_man")
    private String operateMan;

    /**
     * 操作时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    @TableField("order_status")
    private Integer orderStatus;

    /**
     * 备注
     */
    @TableField("note")
    private String note;
}
