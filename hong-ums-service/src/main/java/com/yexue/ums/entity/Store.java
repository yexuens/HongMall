package com.yexue.ums.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
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
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String storeName;

    private String description;

    private Integer ownerId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
