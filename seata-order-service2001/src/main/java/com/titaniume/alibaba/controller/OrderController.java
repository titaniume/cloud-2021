package com.titaniume.alibaba.controller;

import com.titaniume.alibaba.domain.CommonResult;
import com.titaniume.alibaba.domain.Order;
import com.titaniume.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud-2021
 * @description:
 * @author: renfei.huang
 * @create: 2021-08-30 11:29
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return  new CommonResult(200,"创建订单成功");
    }
}
