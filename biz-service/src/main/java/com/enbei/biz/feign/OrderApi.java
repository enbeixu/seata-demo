package com.enbei.biz.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "order-service",path = "order")
@Component
public interface OrderApi {
    @PostMapping("create")
    Boolean create(@RequestParam("userId") long userId ,@RequestParam("productId") long productId);

}
