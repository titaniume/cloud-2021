package com.titaniume.springcloud.controller;

import com.titaniume.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: cloud2021
 * @description:
 * @author: renfei.huang
 * @create: 2021-08-01 23:31
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;


    @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }
}
