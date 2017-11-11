<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>添加</title>
  </head>
  <body>
      <form method="post" action="addCar.action">
        name：<input type="text" name="carInfoEntity.car_name"><br>
        vin： <input type="text" name="carInfoEntity.car_vin"><br>
        <input type="submit" value="提交"/>
    </form>
  </body>
</html>