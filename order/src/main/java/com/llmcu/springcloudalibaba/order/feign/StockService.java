package com.llmcu.springcloudalibaba.order.feign;

import com.llmcu.springcloudalibaba.order.feign.configuration.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/4/27 15:48
 */
@FeignClient(value = "stock-service",path="/stock")
//@FeignClient(value = "stock-service",path="/stock",configuration = FeignConfiguration.class)
public interface StockService {
    @GetMapping("reduce")
    String reduceStock();
}
