<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/26/2021
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/prices" method="post">
    <h3>Product Description</h3>
    <input type="text" name="description" placeholder="Mô tả sản phẩm">
    <h3>List Price</h3>
    <input type="text" name="price" placeholder="Giá sản phẩm">
    <h3>Discount Percent</h3>
    <input type="text" name="discount" placeholder="chiết khấu sản phẩm">
    <input type="submit" name="ketQua">
  </form>
  </body>
</html>
