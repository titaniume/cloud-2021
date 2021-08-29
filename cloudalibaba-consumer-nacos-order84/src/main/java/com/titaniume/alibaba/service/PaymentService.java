package com.titaniume.alibaba.service;


import com.titaniume.springcloud.entities.CommonResult;
import com.titaniume.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: cloud2021
 * @description: openfeign 接口
 * @author: renfei.huang
 * @create: 2021-08-29 16:12
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService
{
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
