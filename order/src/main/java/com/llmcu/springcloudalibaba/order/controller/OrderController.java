package com.llmcu.springcloudalibaba.order.controller;


import com.llmcu.springcloudalibaba.order.feign.ProductService;
import com.llmcu.springcloudalibaba.order.feign.StockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private StockService stockService;
    @Autowired
    private ProductService productService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/add")
    public String add(
//            @RequestHeader("X-Request-red") String color,
//            @RequestHeader("myAuth") String myAuth,
            @RequestParam String id) {
//        System.out.println("color:" + color);
//        System.out.println("myAuth:" + myAuth);
        logger.info("现在开始执行下单");
        System.out.println("下单成功");
        String productById = productService.getProductById(id);
//        return restTemplate.getForObject("http://stock-service/stock/reduce", String.class);
        String stockResult = stockService.reduceStock();
        return stockResult + productById;
    }
}
