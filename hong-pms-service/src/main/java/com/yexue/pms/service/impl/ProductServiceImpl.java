package com.yexue.pms.service.impl;

import com.yexue.pms.entity.Product;
import com.yexue.pms.mapper.ProductMapper;
import com.yexue.pms.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Yexue
 * @since 2024-05-30
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
