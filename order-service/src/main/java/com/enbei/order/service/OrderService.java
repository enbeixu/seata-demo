package com.enbei.order.service;
import com.enbei.order.mapper.OrderMapper;
import com.enbei.order.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Slf4j
@Service
public class OrderService {

    @Resource
    private OrderMapper orderMapper;

    public Boolean create(Order order) {
        log.info("创建订单开始");
        int index = orderMapper.insert(order);
        log.info("创建订单结束");
        return index > 0;
    }
}
