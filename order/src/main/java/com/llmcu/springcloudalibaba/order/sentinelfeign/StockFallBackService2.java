package com.llmcu.springcloudalibaba.order.sentinelfeign;

import com.llmcu.springcloudalibaba.order.feign.StockService;
import org.springframework.stereotype.Component;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/8/7 19:38
 */
@Component
public class StockFallBackService2 implements StockService2 {


    public String reduceStock2() {
        return "feign整合sentinel2";
    }
}
