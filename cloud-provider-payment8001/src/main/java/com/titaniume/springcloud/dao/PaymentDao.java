package com.titaniume.springcloud.dao;

import com.mysql.jdbc.log.Log;
import com.titaniume.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.validation.constraints.Past;

/**
 * @program: cloud2021
 * @description:
 * @author: renfei.huang
 * @create: 2021-05-26 22:53
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
