package com.enbei.stock.mapper;

import com.enbei.stock.model.Stock;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface StockMapper extends BaseMapper<Stock> {

    @Update("update tab_storage set total = total - #{currentUsed} , used = used + #{currentUsed} where product_id = #{productId}")
    int updateUsed(@Param("productId") long productId , @Param("currentUsed") long currentUsed);

}
