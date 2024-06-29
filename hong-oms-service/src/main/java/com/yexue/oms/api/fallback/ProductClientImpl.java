package com.yexue.oms.api.fallback;

import com.yexue.common.vo.ResultVo;
import com.yexue.oms.api.IProductClient;
import org.springframework.stereotype.Component;

@Component
public class ProductClientImpl implements IProductClient {
    @Override
    public ResultVo list() {
        return ResultVo.error("get list error");
    }
}
