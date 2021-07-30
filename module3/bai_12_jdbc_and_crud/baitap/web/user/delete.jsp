<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/31/2021
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Remove Product</h1>
<form method="post">
    <table border="1">
        <tr>
            <td>Id:</td>
            <td>${users.id}</td>
        </tr>
        <tr>
            <td>Name:</td>
            <td>${users.name}</td>
        </tr>
        <tr>
            <td>Email:</td>
            <td>${users.email}</td>
        </tr>
        <tr>
            <td>country:</td>
            <td>${users.country}</td>
        </tr>

    </table>
    <input type="submit" value="Delete">

</form>
</body>
</html>
