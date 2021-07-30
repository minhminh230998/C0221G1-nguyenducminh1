<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/28/2021
  Time: 10:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" width="100%">
    <tr>
        <td>Id</td>
        <td>Tên sản phẩm</td>
        <td>Giá sản phẩm</td>
        <td>Mô tả</td>
        <td>Hãng sản xuất</td>

    </tr>

    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.describe}</td>
            <td>${product.producer}</td>
        </tr>
    </c:forEach>
</table>
</div>
</body>
</html>
