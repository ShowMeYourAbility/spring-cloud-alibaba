package com.llmcu.springcloudalibaba.order.feign.configuration;

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
public class FeignConfiguration {
    @Bean
    public Logger.Level getLoggerLevel() {
        return Logger.Level.FULL;
    }
}
