package com.yexue.ums.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
 * @author yexue
 * @since 2024-06-15
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("user_address")
public class UserAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 地址上的电话
     */
    private String phone;

    /**
     * 地址上的姓名
     */
    private String username;
}
