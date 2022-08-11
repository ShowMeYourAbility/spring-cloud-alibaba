package com.llmcu.springcloudalibaba.gateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/8/11 13:31
 */
@Component
public class GlobalLogFilter implements GlobalFilter {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        logger.info("GlobalLogFilter log:{}",exchange.getRequest().getURI());
        return chain.filter(exchange);
    }
}
