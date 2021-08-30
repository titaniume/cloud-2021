package com.titaniume.alibaba.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: cloud-2021
 * @description: 账户
 * @author: renfei.huang
 * @create: 2021-08-30 14:43
 */
@Data
public class Account {
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 总额度
     */
    private BigDecimal total;

    /**
     * 已用额度
     */
    private BigDecimal used;

    /**
     * 剩余额度
     */
    private BigDecimal residue;
}
