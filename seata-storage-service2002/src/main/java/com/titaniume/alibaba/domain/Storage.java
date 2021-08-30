package com.titaniume.alibaba.domain;

import lombok.Data;

/**
 * @program: cloud-2021
 * @description: 库存
 * @author: renfei.huang
 * @create: 2021-08-30 14:16
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
