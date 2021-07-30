<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/15/2021
  Time: 1:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/convert" method="post">
    <h1>Ung Dung Chuyen Doi Tien Te</h1>
    <h3>Usd</h3>
    <input type="number" name="usd" placeholder="Nhap usd ....">
    <input type="submit" value="Ket Qua">
    <h3>Ket qua = <span>${vnd} vnd</span></h3>
</form>
</body>
</html>
