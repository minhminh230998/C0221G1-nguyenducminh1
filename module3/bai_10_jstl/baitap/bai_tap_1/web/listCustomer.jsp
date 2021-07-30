<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/27/2021
  Time: 1:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border: 1px solid red;
        }
        th{
            border: 1px solid red;
        }
        td{
            border: 1px solid red;
        }
        tr{
            border: 1px solid red;
        }
    </style>
</head>
<body>
<div style="width: 100%;height: 400px">

<table style="width: 50%">
    <tr>
        <th>Tên khách hàng</th>
        <th> Tuổi</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach items="${list}" var="customer">
        <tr>
        <td><c:out value="${customer.name}"></c:out></td>
        <td><c:out value="${customer.age}"></c:out></td>
        <td><c:out value="${customer.address}"></c:out></td>
        <td><img style="height: 30px;width: 30px" src="${customer.img}"></td>
        </tr>
    </c:forEach>
</table>
</div>
</body>
</html>
