package com.titaniume.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud2021
 * @description:Ribbon 自定义负债均衡规则
 * @author: renfei.huang
 * @create: 2021-07-11 18:37
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return  new RandomRule(); //定义随机
    }
}
