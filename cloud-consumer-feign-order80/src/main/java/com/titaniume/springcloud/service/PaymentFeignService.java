package com.titaniume.springcloud.service;

import com.titaniume.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @program: cloud2021
 * @description:
 * @author: renfei.huang
 * @create: 2021-07-19 23:16
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE") //CLOUD-PAYMENT-SERVICE euraka 服务提供者的名称
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public  CommonResult getPaymentById(@PathVariable("id") Long id);


    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();

}
