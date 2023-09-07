package com.llmcu.springcloudalibaba.order.ribbon;

import com.alibaba.nacos.client.naming.utils.ThreadLocalRandom;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;

import java.util.List;

/**
 * 自定义负载均衡算法
 *
 * @author liuling
 * @date 2022/4/26 17:47
 */
public class MyRoundingRule extends AbstractLoadBalancerRule {
    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {

    }

    @Override
    public Server choose(Object key) {
        // 原理：通过ILoadBalancer获取服务器
        ILoadBalancer loadBalancer = this.getLoadBalancer();
        List<Server> reachableServers = loadBalancer.getReachableServers();
        // ali线程安全的随机数
        int serverId = ThreadLocalRandom.current().nextInt(reachableServers.size());
        return reachableServers.get(serverId);
    }
}
