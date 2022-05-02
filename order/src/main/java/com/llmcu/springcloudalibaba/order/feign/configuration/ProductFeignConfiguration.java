package com.llmcu.springcloudalibaba.order.feign.configuration;

import com.llmcu.springcloudalibaba.order.feign.intercepter.MyIntercepter;
import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/4/27 19:33
 */
//@Configuration
public class ProductFeignConfiguration {
    @Bean
    public Logger.Level getLoggerLevel() {
        return Logger.Level.BASIC;
    }

    @Bean
    public Contract feignContract() {
        return new Contract.Default();
    }

    @Bean
    public MyIntercepter feignAuthRequestInterceptor() {
        return new MyIntercepter();
    }
}
