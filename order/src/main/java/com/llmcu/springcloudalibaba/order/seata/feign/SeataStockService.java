package com.llmcu.springcloudalibaba.order.seata.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/8/9 22:36
 */
@FeignClient(contextId = "seataStockService", value = "stock-service", path = "/stock/seata")
public interface SeataStockService {
    @GetMapping("stock/create")
    String createStock();
}