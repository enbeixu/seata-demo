package com.enbei.biz.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "stock-service",path = "stock")
@Component
public interface StockApi {

    @PostMapping("change")
    Boolean changeStorage(@RequestParam("productId") long productId , @RequestParam("used")  int used);
}
