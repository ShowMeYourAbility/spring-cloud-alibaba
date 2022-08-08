package com.llmcu.springcloudalibaba.order.feign;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/8/7 15:59
 */
public class StockServiceBlockHandlerClass {

    public static String blockHandler4reduceStock2(BlockException e){
        return "sentinel整合feign定制Block";
    }
}
