package com.llmcu.springcloudalibaba.order.sentinelfeign;

import com.llmcu.springcloudalibaba.order.feign.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/8/6 23:47
 */
@RestController
@RequestMapping("sentinel")
public class FeignDegradeController {

    @Autowired
    private StockService stockService;

    @Qualifier("com.llmcu.springcloudalibaba.order.sentinelfeign.StockService2")
    @Autowired
    private StockService2 stockService2;


    /**
     * 想验证下，在feign接口方法上使用@SentinelResource
     * 结论：不能使用
     * @return
     */
    @GetMapping("feignException")
    public String exceptionRate() {
        return stockService.reduceStock3();
    }

    @GetMapping("feignException2")
    public String exceptionRate2() {
        return stockService2.reduceStock2();
    }
}
