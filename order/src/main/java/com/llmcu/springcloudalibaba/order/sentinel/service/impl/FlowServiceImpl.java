package com.llmcu.springcloudalibaba.order.sentinel.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.llmcu.springcloudalibaba.order.feign.StockServiceBlockHandlerClass;
import com.llmcu.springcloudalibaba.order.sentinel.service.FlowService;
import org.springframework.stereotype.Service;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/8/6 20:53
 */
@Service
public class FlowServiceImpl implements FlowService {
    @Override
    @SentinelResource(value = "doSomething", blockHandler = "blockHandler4DoSomething")
//    @SentinelResource(value="reduceStock3",blockHandler = "blockHandler4reduceStock2" ,blockHandlerClass = StockServiceBlockHandlerClass.class )
    public String doSomething() {
        boolean flag = false;
        if(flag){
            int a = 1/0;
        }
        return "do something success";
    }


    public String blockHandler4DoSomething(BlockException e) {
        return "在service方法中被控流";
    }
}
