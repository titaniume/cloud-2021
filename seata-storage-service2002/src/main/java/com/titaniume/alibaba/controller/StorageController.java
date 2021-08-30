package com.titaniume.alibaba.controller;

import com.titaniume.alibaba.domain.CommonResult;
import com.titaniume.alibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud-2021
 * @description:
 * @author: renfei.huang
 * @create: 2021-08-30 14:33
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;


    /**
     * 扣减库存
     * @param productId
     * @param count
     * @return
     */
    @PostMapping("/storage/decrease")
    public CommonResult decrease(Long productId,Integer count){
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}
