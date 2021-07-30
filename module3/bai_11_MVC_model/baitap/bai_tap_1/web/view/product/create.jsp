<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/28/2021
  Time: 9:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create product</h1>


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
                <td>price: </td>
                <td><input type="text" name="price" id="price"></td>
            </tr>
            <tr>
                <td>describe: </td>
                <td><input type="text" name="describe" id="describe" ></td>
            </tr>
            <tr>
                <td>producer: </td>
                <td><input type="text" name="producer" id="producer" ></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create Product"></td>
            </tr>
        </table>
    </fieldset>

</form>
</body>
</html>
