<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/27/2021
  Time: 2:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/calculator" method="post">
<h2> Simple calculator</h2>
<p>first operand</p>
<input type="number" name="nb1">
<p>Operator</p>
<select name="operator">
    <option value="+">Addition</option>
    <option value="-">Subtraction</option>
    <option value="*">Multiplication</option>
    <option value="/">Division</option>
</select>
<p>Second operator</p>
<input type="number" name="nb2">
<input type="submit" value="Kết Quả">
</form>
</body>
</html>
