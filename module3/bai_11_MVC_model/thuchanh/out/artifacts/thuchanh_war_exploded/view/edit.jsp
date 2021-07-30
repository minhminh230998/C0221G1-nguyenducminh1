<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/28/2021
  Time: 11:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Edit customer</h1>
<p >${message}</p>
<p>
    <a href="/customer">Back to customer list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Id: </td>
                <td><input disabled type="text" name="id" id="id" value="${customers.id}"></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name" value="${customers.name}"></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><input type="text" name="email" id="email" value="${customers.email}"></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="address" id="address" value="${customers.address}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update customer"></td>
            </tr>
        </table>
    </fieldset>

</form>
</body>
</html>
