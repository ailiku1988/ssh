<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增</title>
</head>
<body>
    <h1>新增</h1>
    <form action="car_save" method="post" namespace="/" theme="simple">
        <table width="600px">
            <tr>
                <td>名字</td>
                <td><input type="text" id="car_name" name="car_name"/></td>

            </tr>
            <tr>
                <td>vin</td>
               <td><input type="text" id="car_vin" name="car_vin"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="保存"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>