package com.llmcu.springcloudalibaba.order.sentinel;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.llmcu.springcloudalibaba.order.sentinel.service.FlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/8/6 15:36
 */
@RestController
@RequestMapping("sentinel")
public class FlowController {
    @Autowired
    private FlowService flowService;

    /**
     * 1、流控规则-QPS
     * @return
     */
    @GetMapping("qps")
    @SentinelResource(value="qps", blockHandler="blockHandlerForQps")
    public String qps(){
        return "qps request success";
    }

    /**
     * 2、流控规则-线程数
     * @return
     * @throws InterruptedException
     */
    @GetMapping("thread")
    @SentinelResource(value="thread", blockHandler="blockHandlerForQps")
    public String thread() throws InterruptedException {
        // 设置睡眠，让线程占据时间长。从而容易同一时间，多个线程在执行同一个请求的现象。以便通过线程数控制实现流控
        TimeUnit.SECONDS.sleep(5);
        return "thread request success";
    }

    public String blockHandlerForQps(BlockException e){
        return "被流控";
    }


    /**
     * 3、不使用{@link SentinelResource},而通过{@link MyBlockExceptionHandler}实现统一的规则实现
     * @return
     */
    @GetMapping("qps2")
    // 如果使用公共异常处理，@SentinelResource是不能写的
//    @SentinelResource(value="qps2")
    public String qps2(){
        return "qps2 request success";
    }

    @GetMapping("thread2")
    public String thread2() throws InterruptedException {
        // 设置睡眠，让线程占据时间长。从而容易同一时间，多个线程在执行同一个请求的现象。以便通过线程数控制实现流控
        TimeUnit.SECONDS.sleep(5);
        return "thread2 request success";
    }

    /**
     * 4、流控模式-关联。qps3关联qps4：qps4接口访问过多时，qps3受限
     * @return
     */
    @GetMapping("qps3")
    public String qps3(){
        return "qps3 request success";
    }

    @GetMapping("qps4")
    public String qps4(){
        return "qps4 request success";
    }

    /**
     * 4、流控模式-链路。即对方法限流
     * @return
     */
    @GetMapping("qps5")
    public String qps5(){
        return flowService.doSomething();
    }

    @GetMapping("qps6")
    public String qps6(){
        return flowService.doSomething();
    }
}
