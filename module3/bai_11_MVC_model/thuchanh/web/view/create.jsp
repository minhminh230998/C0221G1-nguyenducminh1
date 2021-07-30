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
<h1>Create customer</h1>


<form method="post">
    <fieldset>

        <table>
            <tr>
                <td>Id: </td>
                <td><input  type="text" name="id" id="id" ></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name" ></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><input type="text" name="email" id="email"></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="address" id="address" ></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create customer"></td>
            </tr>
        </table>
    </fieldset>

</form>
</body>
</html>
