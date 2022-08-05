package com.llmcu.springcloudalibaba.order.nacosconfigure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/5/2 4:30
 */
@RestController
@RequestMapping("/order/nacosConfigure")
@RefreshScope
public class NacosConfigureController {
    @Value("${users.names}")
    private String name;
    @Value("${user.age}")
    private int age;


    @GetMapping("/test")
    public String getName() {
        return name+"-"+age;
    }
}
