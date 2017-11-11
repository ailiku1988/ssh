package com.yxp.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.yxp.ssh.entity.CarInfoEntity;
import com.yxp.ssh.service.CarInfoService;
import org.apache.struts2.convention.annotation.*;


import javax.annotation.Resource;

@Results({@Result(name = "addCar", location = "addCar.jsp"), @Result(name = "success", location = "success.jsp"), @Result(name = "fail", location = "fail.jsp")})
public class CarInfoAction extends ActionSupport {
    @Resource
    private CarInfoService carInfoService;

    public CarInfoEntity getCarInfoEntity() {
        return carInfoEntity;
    }

    public void setCarInfoEntity(CarInfoEntity carInfoEntity) {
        this.carInfoEntity = carInfoEntity;
    }

    public CarInfoEntity carInfoEntity;
    @Action(value = "de")
    public String de() {
        return "addCar";
    }

    @Action(value = "addCar")
    public String addCar() {
        try {
            carInfoService.save(carInfoEntity);
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
        return "success";
    }


}

