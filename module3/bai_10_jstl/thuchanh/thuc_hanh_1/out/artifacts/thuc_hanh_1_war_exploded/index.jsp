<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/27/2021
  Time: 10:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="converter.jsp" method="post">
      <h4>Rate</h4>
      <input type="number" name="rate" value="Tỉ giá">
      <h4>USD</h4>
      <input type="number" name="usd" value="Nhập usd">
      <input type="submit" name="submit" value="Đổi tiền">
  </form>

  </body>
</html>
