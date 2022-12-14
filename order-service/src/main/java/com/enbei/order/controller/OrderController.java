package com.enbei.order.controller;

import com.enbei.order.model.Order;
import com.enbei.order.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Resource
    private OrderService orderService;


    @PostMapping("/create")
    public Boolean createOrder(long userId , long productId){
        Order order = new Order();
        order.setCount(1)
                .setMoney(BigDecimal.valueOf(88))
                .setProductId(productId)
                .setUserId(userId)
                .setStatus(0);
        return orderService.create(order);
    }

}
