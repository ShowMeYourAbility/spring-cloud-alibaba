package com.llmcu.springcloudalibaba.gateway.ribbon;

import com.alibaba.nacos.client.naming.utils.ThreadLocalRandom;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * 自定义负载均衡算法
 *
 * @author liuling
 * @date 2022/4/26 17:47
 */
public class MyRoundingRule extends AbstractLoadBalancerRule {

    public static ThreadLocal<String> requestPath=new ThreadLocal<>();

    public void initWithNiwsConfig(IClientConfig clientConfig) {

    }

    public Server choose(Object key) {
        // 原理：通过ILoadBalancer获取服务器
        ILoadBalancer loadBalancer = this.getLoadBalancer();
        List<Server> reachableServers = loadBalancer.getReachableServers();
        int serverId;

        String requestPath = MyRoundingRule.requestPath.get();
        char lastChar = requestPath.charAt(requestPath.length() - 1);
        // 以'i'后面字母结尾的请求只会访问第一个服务器，否则多个服务器随机
        if(lastChar>'i'){
            serverId =0;
        }else{
            // ali线程安全的随机数
            serverId = ThreadLocalRandom.current().nextInt(reachableServers.size());
        }

        MyRoundingRule.requestPath.remove();
        return reachableServers.get(serverId);
    }
}
