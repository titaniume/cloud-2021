package com.titaniume.alibaba.service;

import com.titaniume.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: cloud-2021
 * @description: 库存
 * @author: renfei.huang
 * @create: 2021-08-30 11:24
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    /***
     * @description: 扣减库存
     * @param productId
     * @param count
     * @return CommonResult
     * @author: renfei.huang
     * @date: 2021/8/30  11:26
     */
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long  productId,@RequestParam("count") Integer count);
}
