package com.llmcu.springcloudalibaba.stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("reduce")
    public String reduceStock(HttpServletRequest request) {
        System.out.println("扣减库存");
        return "reduce sucess"+serverPort;
    }

    /**
     * 用于测试sentinel整合feign
     * @return
     */
    @GetMapping("reduce3")
    public String reduceStock3() {
//        int a = 1/0;
        return "reduce3 sucess"+serverPort;
    }
}
