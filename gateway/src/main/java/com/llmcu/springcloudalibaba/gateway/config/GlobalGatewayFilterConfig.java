package com.llmcu.springcloudalibaba.gateway.config;

import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.gateway.config.LoadBalancerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalGatewayFilterConfig {
    @Bean
    public UserLoadBalancerClientFilter userLoadBalanceClientFilter(LoadBalancerClient client, LoadBalancerProperties properties) {
        return new UserLoadBalancerClientFilter(client, properties);
    }

}
