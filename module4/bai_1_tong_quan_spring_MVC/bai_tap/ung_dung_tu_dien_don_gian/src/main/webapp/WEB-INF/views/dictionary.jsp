<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/15/2021
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/dictionary" method="post">
    <label>English:</label>
    <input type="text" name="en" value="${en}">
    <label >VietNam:</label>
    <input  type="text" name="vn" value="${vn}">
    <p>${error}</p>
    <input type="submit" value="translate">
</form>
</body>
</html>
