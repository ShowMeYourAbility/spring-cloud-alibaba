package com.llmcu.springcloudalibaba.order;

import com.llmcu.springcloudalibaba.configuration.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;*/

@SpringBootApplication
//@RibbonClients(value={
//        @RibbonClient(name="stock-service",configuration= RibbonConfiguration.class),
//        @RibbonClient(name="crm-service",configuration= RibbonConfiguration.class)
//})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
