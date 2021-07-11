package com.titaniume.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: cloud2021
 * @description: consul 服务提供者
 * @author: renfei.huang
 * @create: 2021-07-10 10:07
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/consul")
    public String paymentzk(){
        return  "springboot with consul:"+ serverPort +"\t" + UUID.randomUUID().toString();
    }
}
