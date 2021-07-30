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
<h1>Sandwich Condiments</h1>
<form action="/display" method="post">
    <input type="checkbox" id="vehicle1" name="check" value="Lettuce">
    <label for="vehicle1"> Lettuce</label><br>
    <input type="checkbox" id="vehicle2" name="check" value="Tomato">
    <label for="vehicle2"> Tomato</label><br>
    <input type="checkbox" id="vehicle3" name="check" value="Mustard">
    <label for="vehicle3"> Mustard</label><br>
    <input type="checkbox" id="vehicle4" name="check" value="Sprouts">
    <label for="vehicle4">Sprouts</label><br><br>
    <input type="submit" value="Submit">
</form>
<h3>${check}</h3>
</body>
</html>
