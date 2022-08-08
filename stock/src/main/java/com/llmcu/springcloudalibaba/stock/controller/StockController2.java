package com.llmcu.springcloudalibaba.stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/stock2")
public class StockController2 {
    @Value("${server.port}")
    private String serverPort;

    /**
     * 用于测试sentinel整合feign
     * @return
     */
    @GetMapping("reduce2")
    public String reduceStock2() {
        int a = 1/0;
        return "reduce2 sucess"+serverPort;
    }
}
