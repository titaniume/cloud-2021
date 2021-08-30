package com.titaniume.alibaba.service;

import com.titaniume.alibaba.domain.Order;

/**
 * @program: cloud-2021
 * @description: 订单
 * @author: renfei.huang
 * @create: 2021-08-30 11:14
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
