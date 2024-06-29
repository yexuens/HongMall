package com.yexue.oms.service.impl;

import com.yexue.oms.entity.Order;
import com.yexue.oms.mapper.OrderMapper;
import com.yexue.oms.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Yexue
 * @since 2024-05-28
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
