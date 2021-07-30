<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/27/2021
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    float rate=Float.parseFloat(request.getParameter("rate"));
    float usd=Float.parseFloat(request.getParameter("usd"));
    double vnd=usd*rate;
%>
<h3>VND: <%=vnd%></h3>
</body>
</html>
