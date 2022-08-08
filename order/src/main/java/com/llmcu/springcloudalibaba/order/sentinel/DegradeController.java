package com.llmcu.springcloudalibaba.order.sentinel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/8/6 23:47
 */
@RestController
@RequestMapping("sentinel")
public class DegradeController {

    @GetMapping("slowCallRate")
    public String slowCallRate() throws InterruptedException {
        TimeUnit.SECONDS.sleep(6);
        return "slowCallRate success";
    }

    @GetMapping("exceptionRate")
    public String exceptionRate(){
        int a = 1/0;
        return "exceptionRate success";
    }

    @GetMapping("exceptionCnt")
    public String exceptionCnt(){
        int a = 1/0;
        return "exceptionCnt success";
    }
}
