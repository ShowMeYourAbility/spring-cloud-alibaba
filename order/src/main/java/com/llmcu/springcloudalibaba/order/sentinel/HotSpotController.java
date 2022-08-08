package com.llmcu.springcloudalibaba.order.sentinel;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/8/8 3:15
 */
@RestController
@RequestMapping("sentinel")
public class HotSpotController {

    @GetMapping(value = "hotspot/{id}")
    @SentinelResource(value="getUserNameById",blockHandler = "blockHandler")
    public String getUserNameById(@PathVariable("id") int id) {
        return "user" + id;
    }

    public String blockHandler(int id, BlockException e) {
        return "热点参数"+id+"限流";
    }
}
