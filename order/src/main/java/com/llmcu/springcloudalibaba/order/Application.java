package com.llmcu.springcloudalibaba.order;

import com.llmcu.springcloudalibaba.configuration.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@RibbonClients(value={
//        @RibbonClient(name="stock-service",configuration= RibbonConfiguration.class),
        @RibbonClient(name="product-service",configuration= RibbonConfiguration.class)
})
@EnableFeignClients
public class Application {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
    }

}
