package com.yexue.oms.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.yexue.common.vo.ResultVo;
import com.yexue.oms.api.IProductClient;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Yexue
 * @since 2024-05-28
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    IProductClient productFeign;
    @RequestMapping("/products")
    @SentinelResource(value = "productList",fallback = "getProductListFail")

    ResultVo productList(){
        return productFeign.list();
    }
    ResultVo getProductListFail(){
        return ResultVo.error("Get Product List Fail");
    }
}
