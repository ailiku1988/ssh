package com.yxp.ssh.service.impl;

import com.yxp.ssh.dao.CarInfoDao;
import com.yxp.ssh.entity.CarInfoEntity;
import com.yxp.ssh.service.CarInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CarInfoServiceImpl implements CarInfoService {
    @Resource
    private  CarInfoDao carInfoDao;

    public void save(CarInfoEntity entity) {
         carInfoDao.save(entity);
    }

}
