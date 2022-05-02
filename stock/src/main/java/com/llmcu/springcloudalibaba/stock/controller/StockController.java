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
}
