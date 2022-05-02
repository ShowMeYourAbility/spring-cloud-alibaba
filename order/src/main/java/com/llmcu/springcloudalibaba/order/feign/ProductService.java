package com.llmcu.springcloudalibaba.order.feign;

import com.llmcu.springcloudalibaba.order.feign.configuration.ProductFeignConfiguration;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/4/27 18:51
 */
@FeignClient(value = "product-service",path="/product",configuration = ProductFeignConfiguration.class)
public interface ProductService {
//    @GetMapping("/{id}")
//    String getProductById(@PathVariable(name = "id") String id);
    @RequestLine("GET /{id}")
    String getProductById(@Param("id") String id);
}
