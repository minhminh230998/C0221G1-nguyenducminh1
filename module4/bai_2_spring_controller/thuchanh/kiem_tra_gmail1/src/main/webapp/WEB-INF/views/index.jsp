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
<h1>Email Validate</h1>


<form action="validate" method="post">
    <input type="text" name="email"><br>
    <input type="submit" value="Validate">
    <small style="color:red">${message}</small>
</form>
</body>
</html>
