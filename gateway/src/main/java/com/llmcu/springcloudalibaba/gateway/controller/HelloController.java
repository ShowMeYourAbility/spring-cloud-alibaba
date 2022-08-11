package com.llmcu.springcloudalibaba.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/8/10 19:22
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public String sayHello(){
        return "hello gateway";
    }
}
