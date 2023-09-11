package com.llmcu.springcloudalibaba.gateway.config;

import com.llmcu.springcloudalibaba.gateway.ribbon.MyRoundingRule;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.gateway.config.LoadBalancerProperties;
import org.springframework.cloud.gateway.filter.LoadBalancerClientFilter;
import org.springframework.web.server.ServerWebExchange;

public class UserLoadBalancerClientFilter extends LoadBalancerClientFilter {
    public UserLoadBalancerClientFilter(LoadBalancerClient loadBalancer, LoadBalancerProperties properties) {
        super(loadBalancer, properties);
    }

    @Override
    protected ServiceInstance choose(ServerWebExchange exchange) {
        MyRoundingRule.requestPath.set(exchange.getRequest().getPath().value());
        return super.choose(exchange);
    }
}
