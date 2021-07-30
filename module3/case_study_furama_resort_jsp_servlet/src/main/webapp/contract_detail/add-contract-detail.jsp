<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/30/2021
  Time: 4:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
            crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css"/>
    <style>
        td input {
            width: 100%;
        }

        td {
            border: 1px solid black;
            width: 75%;

        }

        th {
            border: 1px solid black;

        }
    </style>
</head>
<body>
<nav class="navbar navbar-light bg-light">
    <div class="container-fluid">
        <div style="text-align: center ;width: 100%">
            <a class="navbar-brand " href="#">
                <img src="https://lh3.googleusercontent.com/proxy/6KuQyQLwm4W9r4URqU1TaNujqXEWSEweNHDoYQJECRhG8gLF-n8FgBgYo97JLAJTDvV4U69gxOGYXksNfPsp-fSG0Tm20If5lvXNjnwjVVIOJ5hu9Tr6_4UF7V4"
                     alt="" width="350px" height="150px" class="d-inline-block align-text-top ">
            </a>
        </div>
    </div>
</nav>
<form action="/contractDetail?action=add" method="post">
<div class="container-fluid">
    <div class="row">
        <div class=" col-lg-12"></div>
        <table class="table" style="background: #8fd19e ;">
            <tr style="background: #218838">
                <th colspan="2"><h3 style="text-align: center">Add contract detail</h3></th>
            </tr>
            <tr>
                <th>Contract Id</th>
                <td>

                    <select class="form-select" aria-label="Default select example" name="contractId">
                        <c:forEach items="${contracts}" var="contracts">
                            <option value="${contracts.id}">${contracts.id}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Attach service Id</th>
                <td>

                    <select class="form-select" aria-label="Default select example" name="attachServiceId">
                        <c:forEach items="${attachServices}" var="attachService">
                            <option value="${attachService.id}">${attachService.name}</option>
                        </c:forEach>
                    </select>

                </td>
            </tr>
            <th>Quantity</th>
            <td>
                <div>
                    <input type="text" name="quantity" id="quantity">
                </div>
            </td>

        </table>
    </div>
</div>
    <c:if test="${message!=null}">
        <p class="text-success">${message}</p>
    </c:if>
<div class="container-fluid " style="margin-top: 20px">
    <div class="row">
        <div class="col-lg-1"></div>
        <div class="col-lg-8 ">

                <button style="border-radius: 50px;background: #34ce57;width: 200px;height: 36px; "> <a style="text-decoration: none ;color: white" href="/home">Back to home</a>
                </button>

        </div>

        <div class="col-lg-3 ">
            <input style="background: #34ce57 ;width: 200px;height: 36px;border-radius: 50px;" type="submit"
                   value="Add contract detail">
        </div>
    </div>
</div>
<div class="container-fluid">

    <div style="background: black ;width: 100%;height: 70px ;margin-top: 20px">
        <div style="height: 50px;line-height: 70px">
            <p style="color: white ;text-align: center">Furama resort is pleased to serve.
                FuramaResortDaNang@gmail.com </p>
        </div>
    </div>
</div>
</form>
</body>
</html>
