package com.titaniume.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @program: cloud2021
 * @description: 获取到集群服务器实例
 * @author: renfei.huang
 * @create: 2021-07-18 20:41
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
