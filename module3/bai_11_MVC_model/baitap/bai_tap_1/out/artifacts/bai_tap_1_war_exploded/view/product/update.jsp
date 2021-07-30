<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/28/2021
  Time: 9:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit customer</h1>
<p >${message}</p>
<p>
    <a href="/product">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Id: </td>
                <td><input disabled type="text" name="id" id="id" value="${products.id}"></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name" value="${products.name}"></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><input type="text" name="price" id="price" value="${products.price}"></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="describe" id="describe" value="${products.describe}"></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="producer" id="producer" value="${products.producer}"></td>
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
