<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/17/2021
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Web App</h2>
<h3>Languages:</h3>
<p>${webApp.languages}</p>
<h3>Page Size:</h3>
<p>${webApp.pageSize}</p>
<h3>Signature:</h3>
<p>${webApp.signature}</p>
<h3>Spams Filter:</h3>
<p>${webApp.spamsFilter}</p>
</body>
</html>
