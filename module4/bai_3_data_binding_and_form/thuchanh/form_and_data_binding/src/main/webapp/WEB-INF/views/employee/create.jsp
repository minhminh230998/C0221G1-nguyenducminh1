<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/16/2021
  Time: 6:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" action="addEmployee" modelAttribute="employee">
<h3><form:label path="id">ID Employee</form:label></h3>
    <form:input path="id"></form:input>
    <h3><form:label path="id">Name Employee</form:label></h3>
    <form:input path="name"></form:input>
    <h3><form:label path="id">Contact Number Employee</form:label></h3>
    <form:input path="contactNumber"></form:input>
    <input type="submit" value="Add Employee">
</form:form>
<h2>Submitted Employee Information</h2>
<table>
    <tr>
        <td>ID:</td>
        <td>${id}</td>
    </tr>
    <tr>
        <td>Name:</td>
        <td>${name}</td>
    </tr>

    <tr>
        <td>Contact Number:</td>
        <td>${contactNumber}</td>
    </tr>
</table>
</body>
</html>
