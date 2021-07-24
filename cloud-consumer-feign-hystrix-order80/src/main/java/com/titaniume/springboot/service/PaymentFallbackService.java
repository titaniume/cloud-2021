package com.titaniume.springboot.service;

import org.springframework.stereotype.Component;

/**
 * @program: cloud2021
 * @description: 服务降级处理
 * @author: renfei.huang
 * @create: 2021-07-24 21:20
 */
@Component
public class PaymentFallbackService  implements  PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
