package com.llmcu.springcloudalibaba.order.feign;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/4/27 15:48
 */
@FeignClient(contextId="stockService",value = "stock-service",path="/mall-stock/stock")
//@FeignClient(value = "stock-service",path="/stock",configuration = FeignConfiguration.class)
public interface StockService {

    @GetMapping("reduce")
    String reduceStock();

    @GetMapping("reduce3")
//    本来能正常返回的reduceStock3()接口，加上@SentinelResource后就报错
    @SentinelResource(value="reduceStock3",blockHandler = "blockHandler4reduceStock2" ,blockHandlerClass = StockServiceBlockHandlerClass.class )
    String reduceStock3();
}
