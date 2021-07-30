<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/28/2021
  Time: 11:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Remove Customer</h1>
<form method="post">
    <table>
        <tr>
            <td>Id: </td>
            <td>${customers.id}</td>

            <td>Name: </td>
            <td >${customers.name}</td>

            <td>Email: </td>
            <td >${customers.email}</td>

            <td>Address: </td>
            <td>${customers.address}</td>
        </tr>

    </table>
    <input type="submit" value="Delete">

</form>
</body>
</html>
