package com.titaniume.springboot.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @program: cloud2021
 * @description: 过滤器配置
 * @author: renfei.huang
 * @create: 2021-07-28 21:52
 */
@Configuration
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {


    /***
     * @description: 拦截器规则 比如这里必须要有一个username http://localhost:9527/payment/lb?username=张三
     * @param exchange
     * @param chain
     * @return Mono
     * @author: renfei.huang
     * @date: 2021-07-28  21:57
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("*********come in MyLogGateWayFilter: "+new Date());
        String uname = exchange.getRequest().getQueryParams().getFirst("username");
        if(StringUtils.isEmpty(uname)){
            log.info("*****用户名为Null 非法用户,(┬＿┬)");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);//给人家一个回应
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }


    /***
     * @description: 过滤器优先级别 0是最高级别
     * @return int
     * @author: renfei.huang
     * @date: 2021-07-28  21:57
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
