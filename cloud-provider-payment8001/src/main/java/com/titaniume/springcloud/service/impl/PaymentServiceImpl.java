package com.titaniume.springcloud.service.impl;

import com.titaniume.springcloud.dao.PaymentDao;
import com.titaniume.springcloud.entities.Payment;
import com.titaniume.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud2021
 * @description:
 * @author: renfei.huang
 * @create: 2021-05-26 23:00
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return  paymentDao.create(payment);
    }

    public Payment getPaymentById(@Param("id")Long id){
       return  paymentDao.getPaymentById(id);
    }

}
