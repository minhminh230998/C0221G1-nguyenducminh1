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
<h1>Customers</h1>
<h4><a href="/customer?action=create">Create customer</a></h4>
<table border="1">

    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${customers}" var="customer">
    <tr>
        <td>${customer.id}</td>
        <td><a href="#">${customer.name}</a></td>
        <td>${customer.email}</td>
        <td>${customer.address}</td>
        <td><a href="/customer?action=edit&id=${customer.id}">edit</a></td>
        <td><a href="/customer?action=remove&id=${customer.id}">delete</a></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
