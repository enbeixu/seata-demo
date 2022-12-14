package com.enbei.order.mapper;
import com.enbei.order.model.Order;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
