package com.titaniume.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: cloud2021
 * @description: 7002集群注册中心启动类
 * @author: renfei.huang
 * @create: 2021-07-04 09:58
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
    public static void main(String[] args) {
       SpringApplication.run(EurekaMain7002.class,args);
    }
}
