package com.yexue.pms.controller;

import com.yexue.common.vo.ResultVo;
import com.yexue.pms.entity.Product;
import com.yexue.pms.service.IProductService;
import com.yexue.pms.service.impl.ProductServiceImpl;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Yexue
 * @since 2024-05-30
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    ProductServiceImpl productService;
    @RequestMapping("/list")
    public ResultVo list() throws InterruptedException {
        Thread.sleep(200);
        return ResultVo.success(productService.list());
    }
}
