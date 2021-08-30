package com.titaniume.alibaba.service;

import com.titaniume.alibaba.dao.StorageDao;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud-2021
 * @description:
 * @author: renfei.huang
 * @create: 2021-08-30 14:32
 */
@Service
@Slf4j
public class StorageServiceImpl implements  StorageService{

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);



    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    @Override
    public void decrease(Long productId, Integer count) {
        storageDao.decrease(productId,count);
    }
}
