<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/15/2021
  Time: 8:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculator" method="post">
    <input type="number"  name="nb1" >
    <input type="number"  name="nb2" >

    <select name="operator">
        <option value="plus">plus</option>
        <option value="minus">minus</option>
        <option value="multiply">multiply</option>
        <option value="division">division</option>
    </select>

    <input type="submit" value="Submit">
</form>
<h3>Result: ${result}</h3>
</body>
</html>
