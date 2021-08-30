package com.titaniume.alibaba.service;

import com.titaniume.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @program: cloud-2021
 * @description: 账户
 * @author: renfei.huang
 * @create: 2021-08-30 11:26
 */
@FeignClient("seata-account-service")
public interface AccountService {

    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money")BigDecimal money);
}
