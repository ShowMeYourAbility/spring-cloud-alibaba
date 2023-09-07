package com.llmcu.springcloudalibaba.order.sentinelfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/4/27 15:48
 */
@FeignClient(contextId ="stockService2" ,value = "stock-service", path = "/mall-stock/stock2", fallback = StockFallBackService2.class)
public interface StockService2 {

    @GetMapping("reduce2")
    String reduceStock2();
}
