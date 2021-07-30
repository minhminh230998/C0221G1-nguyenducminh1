<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/31/2021
  Time: 1:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>
    <a href="/user?action=create">Add New User</a>
</h2>
<form method="get" style="float: right; width: 250px" class="input-group">
    <input type="text" name="country" id="search" class="form-control" placeholder="Search ...">

    <div class="input-group-append">
        <button type="submit" class="btn btn-outline-info" value="Search">
            <i class="fas fa-search"></i>
        </button>
        <input name="action" value="search" hidden>
    </div>

</form>
<h2>
    <a href="/user?action=sort"> Sort User</a>
</h2>

<form action="/user">
    <div class="container">
        <table border="1" width="100%">
            <tr>
                <td>Id</td>
                <td>Name</td>
                <td>Email</td>
                <td>Country</td>
                <td>Sửa</td>
                <td>Xóa</td>

            </tr>
            <c:forEach items="${userLists}" var="user">
                <tr>
                    <th>${user.id}</th>
                    <th>${user.name}</th>
                    <th>${user.email}</th>
                    <th>${user.country}</th>
                    <th><a href="/user?action=edit&id=${user.id}">Update</a></th>
                    <th><a href="/user?action=delete&id=${user.id}">Delete</a></th>
                </tr>
            </c:forEach>
        </table>
    </div>
</form>
</body>
</html>
