package com.titaniume.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud2021
 * @description:
 * @author: renfei.huang
 * @create: 2021-08-29 09:57
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate  getRestTemplate(){
        return  new RestTemplate();
    }
}
