package com.titaniume.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: cloud-2021
 * @description:
 * @author: renfei.huang
 * @create: 2021-08-05 12:28
 */
@RestController
@Slf4j
public class OrderNacosController {

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @Resource
    private RestTemplate restTemplate;


    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public  String paymentInfo(@PathVariable("id") Long id){
       return restTemplate.getForObject(serverURL+"/payment/nacos/"+id,String.class);
    }
}


