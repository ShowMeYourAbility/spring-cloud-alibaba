package com.llmcu.springcloudalibaba.configuration;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.ClientConfigEnabledRoundRobinRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.ZoneAvoidanceRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 指定负载均衡算法
 *
 * @author liuling
 * @date 2022/4/23 9:48
 */
//@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule myRule() {
//        return new RandomRule();
//        return new NacosRule();
        return new ZoneAvoidanceRule();
    }
}
