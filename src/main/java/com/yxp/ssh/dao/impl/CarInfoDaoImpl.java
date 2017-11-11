package com.yxp.ssh.dao.impl;

import com.yxp.ssh.dao.CarInfoDao;
import com.yxp.ssh.entity.CarInfoEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Repository
@Transactional
public class CarInfoDaoImpl implements CarInfoDao {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public void save(CarInfoEntity entity) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(entity);
    }

}
