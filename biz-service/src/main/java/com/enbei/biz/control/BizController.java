package com.enbei.biz.control;
import com.enbei.biz.feign.OrderApi;
import com.enbei.biz.feign.StockApi;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class BizController {

    @Resource
    private OrderApi orderApi;

    @Resource
    private StockApi stockApi;

    @GetMapping("buy")
    @GlobalTransactional
    public String buy(long userId , long productId){
        orderApi.create(userId , productId);
        stockApi.changeStorage(userId , 1);
        return "ok";
    }
}
