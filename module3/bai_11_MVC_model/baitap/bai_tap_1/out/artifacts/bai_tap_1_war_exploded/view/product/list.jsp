<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/27/2021
  Time: 10:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../bootstrap-4.6.0-dist/bootstrap-4.6.0-dist/css/bootstrap.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="styles.css">
    <script src="../bai_tap_1/jquery-3.6.0.min.js"></script>
    <script src="../../bootstrap-4.6.0-dist/bootstrap-4.6.0-dist/js/bootstrap.js"></script>
</head>
<body>
<h1 style="color: darkmagenta">Product</h1>
<div><h3><a class="text-dark" href="/product?action=create">Add Product</a></h3></div>
<form method="post" action="/product" style="float: right">
    <input name="action" value="search" hidden>
    <input type="text" name="search" id="search" placeholder="Search ...">
    <button>Search</button>
</form>
<div class="container">
<table border="1" width="100%">
   <tr>
       <td>Id</td>
       <td>Tên sản phẩm</td>
       <td>Giá sản phẩm</td>
       <td>Mô tả</td>
       <td>Hãng sản xuất</td>
       <td>Sửa</td>
       <td>Xóa</td>
       <td>View</td>
   </tr>
    <c:forEach items="${products}" var="product">
    <tr>
        <th>${product.id}</th>
        <th>${product.name}</th>
        <th>${product.price}</th>
        <th>${product.describe}</th>
        <th>${product.producer}</th>
        <th><a href="/product?action=update&id=${product.id}">Update</a></th>
        <th><a href="/product?action=remove&id=${product.id}">Delete</a></th>
        <th><a href="/product?action=display&id=${product.id}">Display</a></th>

    </tr>
    </c:forEach>
</table>
</div>
</body>
</html>
