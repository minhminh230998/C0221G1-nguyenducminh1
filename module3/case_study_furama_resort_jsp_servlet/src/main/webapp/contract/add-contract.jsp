<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/30/2021
  Time: 4:22 PM
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
                <img src="../img/FURAMA.png"
                     alt="" width="350px" height="150px" class="d-inline-block align-text-top ">
            </a>
        </div>
    </div>
</nav>
<form action="/contract?action=add" method="post" >
<div class="container-fluid">
    <div class="row">
        <div class=" col-lg-12"></div>

        <table class="table" style="background: #8fd19e ;">
            <tr style="background: #218838">
                <th colspan="2"><h3 style="text-align: center">Add contract</h3></th>
            </tr>
            <tr>
                <th>Start date</th>
                <td>
                    <input type="date" name="startDate" id="startDate">
                </td>
            </tr>
            <tr>

                <th>End date</th>
                <td>
                    <input type="date" name="endDate" id="endDate">
                </td>
            </tr>
            <th>Deposit</th>
            <td>
                <div>
                    <input type="text" name="deposit" id="deposit">
                </div>
            </td>


            <tr>
                <th>Employee Id</th>
                <td>
                    <select class="form-select" aria-label="Default select example" name="employeeId">
                       <c:forEach items="${employees}" var="employee">
                           <option value="${employee.id}">${employee.name}</option>
                       </c:forEach>

                    </select>
                </td>
            </tr>
            <tr>
                <th>Customer Id</th>
                <td>

                    <select class="form-select" aria-label="Default select example" name="customerId">
                        <c:forEach items="${customer}" var="customer">
                            <option value="${customer.id}">${customer.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Service Id</th>
                <td>
                    <select class="form-select" aria-label="Default select example" name="serviceId">
                        <c:forEach items="${service}" var="service">
                            <option value="${service.id}">${service.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
        </table>

    </div>
</div>
<div class="container-fluid " style="margin-top: 20px">
    <div class="row">
        <div class="col-lg-1"></div>
        <div class="col-lg-8 ">

                <button style="border-radius: 50px;background: #34ce57;width: 200px;height: 36px; "><a style="text-decoration: none; color: white" href="/">Back to home</a>
                </button>

        </div>

        <div class="col-lg-3 ">
            <input style="background: #34ce57 ;width: 200px;height: 36px;border-radius: 50px; color: white" type="submit"
                   value="Add contract">
        </div>
    </div>
</div>
<c:if test="${message!=null}">
    <p class="text-success">${message}</p>
</c:if>
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
