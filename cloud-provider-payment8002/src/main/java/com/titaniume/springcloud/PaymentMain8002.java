package com.titaniume.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: cloud2021
 * @description: 启动类 EnableEurekaClient EurekaClient端 注册进EurekaServer成为服务提供者provider
 * @author: renfei.huang
 * @create: 2021-05-26 22:45
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
