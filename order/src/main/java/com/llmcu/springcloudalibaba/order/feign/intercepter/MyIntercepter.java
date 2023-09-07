package com.llmcu.springcloudalibaba.order.feign.intercepter;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/4/28 21:15
 */
public class MyIntercepter implements RequestInterceptor {

    private static final Logger log = LoggerFactory.getLogger(MyIntercepter.class);

    @Override
    public void apply(RequestTemplate template) {
        // 设置请求头
        template.header("X-Auth-Token", "token123");
        // 设置请求参数
        template.query("username", "liuling");
        // 设置uri
        template.uri("/9");
        // 日志
        log.info("my intercepter");
    }
}
