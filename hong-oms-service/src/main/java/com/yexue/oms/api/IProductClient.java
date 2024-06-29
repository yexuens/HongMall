package com.yexue.oms.api;

import com.yexue.common.vo.ResultVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("pms-service/product")
public interface IProductClient {
    @RequestMapping("/list")

    ResultVo list();
}
