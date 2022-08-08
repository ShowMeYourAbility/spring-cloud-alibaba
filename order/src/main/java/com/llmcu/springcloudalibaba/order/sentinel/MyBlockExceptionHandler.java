package com.llmcu.springcloudalibaba.order.sentinel;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import com.alibaba.nacos.common.http.param.MediaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/8/6 18:01
 */
@Component
public class MyBlockExceptionHandler implements BlockExceptionHandler {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    public void handle(HttpServletRequest request, HttpServletResponse response, BlockException e) throws Exception {
        logger.info("MyBlockExceptionHandler blocked exception:{}",e.getRule());
        String result;
        if(e instanceof FlowException){
            result="接口限流了";
        }else if(e instanceof DegradeException){
            result="服务降级了";
        }else if(e instanceof ParamFlowException){
            result = "热点参数限流了";
        }else if(e instanceof SystemBlockException){
            result="触发系统保护规则了";
        }else if(e instanceof AuthorityException){
            result="授权规则不通过";
        }else{
            result="sentinel不通过";
        }
        response.setStatus(500);
        response.setCharacterEncoding("utf-8");
        response.setContentType(MediaType.APPLICATION_JSON);
        new ObjectMapper().writeValue(response.getWriter(), result);
        new ObjectMapper().writeValue(System.out, result+"=========");
    }
}
