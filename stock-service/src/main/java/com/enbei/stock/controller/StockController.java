package com.enbei.stock.controller;
import com.enbei.stock.service.StockService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Resource
    private StockService stockService;

    @PostMapping("/change")
    public Boolean changeStorage(long productId , int used)  {
        return stockService.updateUseNum(productId , used);
    }
}
