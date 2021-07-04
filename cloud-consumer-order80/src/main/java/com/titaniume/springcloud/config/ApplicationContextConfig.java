package com.titaniume.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud2021
 * @description:
 * @author: renfei.huang
 * @create: 2021-05-26 23:41
 */
@Configuration
public class ApplicationContextConfig
{
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
