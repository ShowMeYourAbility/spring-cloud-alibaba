package com.llmcu.springcloudalibaba.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/4/27 18:14
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/{id}")
    public String getProductById(@PathVariable(name = "id") String id, HttpServletRequest request) throws InterruptedException {
        TimeUnit.SECONDS.sleep(4);
        return "product" + id + "serverPort:" + serverPort;
    }
}
