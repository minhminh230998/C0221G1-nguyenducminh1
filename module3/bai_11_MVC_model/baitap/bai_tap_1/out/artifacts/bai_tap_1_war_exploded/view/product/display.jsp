<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/28/2021
  Time: 9:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Display product</h1>
<form method="post">
    <table border="1">
        <tr>
            <td>Id: </td>
            <td>${products.id}</td>
        </tr>
        <tr>
            <td>Name: </td>
            <td >${products.name}</td>
        </tr>
        <tr>
            <td>Email: </td>
            <td >${products.price}</td>
        </tr>
        <tr>
            <td>Address: </td>
            <td>${products.describe}</td>
        </tr>
        <tr>
            <td>Address: </td>
            <td>${products.producer}</td>
        </tr>

    </table>
    <a href="/product"><input type="button" value="Back to list"></a>
</form>
</body>
</html>
