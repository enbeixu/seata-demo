package com.enbei.stock.service;
import com.enbei.stock.mapper.StockMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Slf4j
@Service
public class StockService {

    @Resource
    private StockMapper storageMapper;
    
    public boolean updateUseNum(long productId , long used) {

        int i = 1/0;

        int index = storageMapper.updateUsed(productId, used);
        return index > 0;
    }
}
