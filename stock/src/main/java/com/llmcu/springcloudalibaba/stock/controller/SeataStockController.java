package com.llmcu.springcloudalibaba.stock.controller;

import com.llmcu.springcloudalibaba.stock.service.SeataStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/8/9 18:29
 */
@RestController
@RequestMapping("/stock/seata")
public class SeataStockController {

    @Autowired
    private SeataStockService seataStockService;

    @GetMapping("stock/create")
    public String createStock(){
        seataStockService.createStock();
        return "success";
    }
}
