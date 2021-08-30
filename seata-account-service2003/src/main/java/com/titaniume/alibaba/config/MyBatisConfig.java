package com.titaniume.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud-2021
 * @description:
 * @author: renfei.huang
 * @create: 2021-08-30 11:34
 */
@Configuration
@MapperScan({"com.titaniume.alibaba.dao"})
public class MyBatisConfig {
}
