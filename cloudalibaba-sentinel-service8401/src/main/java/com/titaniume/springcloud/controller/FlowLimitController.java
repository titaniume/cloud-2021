package com.titaniume.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud2021
 * @description:
 * @author: renfei.huang
 * @create: 2021-08-27 23:23
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public  String testA(){
        return "------------testA";
    }

    @GetMapping("/testB")
    public  String testB(){
        log.info(Thread.currentThread().getName()+"\t"+"...testB");
        return "------------testB";
    }
}
