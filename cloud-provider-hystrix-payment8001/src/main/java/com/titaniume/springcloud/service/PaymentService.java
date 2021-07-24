package com.titaniume.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @program: cloud2021
 * @description:
 * @author: renfei.huang
 * @create: 2021-07-20 21:24
 */
@Service
public class PaymentService {


    //正常访问，肯定OK
    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_OK,id：  "+id+"\t"+"哈哈哈"  ;
    }


   @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
           @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")
   })
    public String paymentInfo_TimeOut(Integer id){
//        int timeNumber = 5;
        int age = 10 / 0 ;
        try { TimeUnit.SECONDS.sleep(3000); }catch (Exception e) {e.printStackTrace();}
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_TimeOut,id：   "+id+"\t"+"哈哈哈"  ;
    }

    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池："+Thread.currentThread().getName()+"8001系统繁忙或者运行报错，请稍后再试 id："+id+"\t"+"o(╥﹏╥)o";
    }

}
