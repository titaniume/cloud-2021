package com.titaniume.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: cloud2021
 * @description:
 * @author: renfei.huang
 * @create: 2021-07-04 23:41
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public String paymentzk(){
        return  "springboot with zookeeper:"+ serverPort +"\t" + UUID.randomUUID().toString();
    }
}
