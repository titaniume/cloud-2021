package com.titaniume.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.titaniume.springcloud.entities.CommonResult;

/**
 * @program: cloud2021
 * @description:
 * @author: renfei.huang
 * @create: 2021-08-28 20:06
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
