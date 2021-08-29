package com.titaniume.alibaba.service;


import com.titaniume.springcloud.entities.CommonResult;
import com.titaniume.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @program: cloud2021
 * @description:  服务降级兜底方法
 * @author: renfei.huang
 * @create: 2021-08-29 16:17
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
