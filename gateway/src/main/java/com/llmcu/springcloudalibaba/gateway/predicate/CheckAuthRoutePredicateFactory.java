package com.llmcu.springcloudalibaba.gateway.predicate;

import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.cloud.gateway.handler.predicate.GatewayPredicate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.server.ServerWebExchange;

import javax.validation.constraints.NotEmpty;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/8/11 2:51
 */
@Component
public class CheckAuthRoutePredicateFactory extends AbstractRoutePredicateFactory<CheckAuthRoutePredicateFactory.Config> {

    /**
     * Param key.
     */
    public static final String PARAM_KEY = "param";

    /**
     * Regexp key.
     */
    public static final String REGEXP_KEY = "regexp";

    public CheckAuthRoutePredicateFactory() {
        super(CheckAuthRoutePredicateFactory.Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList(PARAM_KEY, REGEXP_KEY);
    }

    @Override
    public Predicate<ServerWebExchange> apply(CheckAuthRoutePredicateFactory.Config config) {
        return new GatewayPredicate() {
            @Override
            public boolean test(ServerWebExchange exchange) {
                List<String> headerList = exchange.getRequest().getHeaders().get(config.param);
                if(!CollectionUtils.isEmpty(headerList)&& Objects.equals(headerList.get(0),config.regexp)){
                    return true;
                }
                return false;
            }

            @Override
            public String toString() {
                return String.format("Query: param=%s regexp=%s", config.getParam(),
                        config.getRegexp());
            }
        };
    }

    @Validated
    public static class Config {

        @NotEmpty
        private String param;

        private String regexp;

        public String getParam() {
            return param;
        }

        public CheckAuthRoutePredicateFactory.Config setParam(String param) {
            this.param = param;
            return this;
        }

        public String getRegexp() {
            return regexp;
        }

        public CheckAuthRoutePredicateFactory.Config setRegexp(String regexp) {
            this.regexp = regexp;
            return this;
        }

    }

}
