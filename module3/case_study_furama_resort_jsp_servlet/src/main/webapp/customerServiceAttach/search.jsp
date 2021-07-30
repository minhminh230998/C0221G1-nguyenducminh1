<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/2/2021
  Time: 8:42 PM
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
        * {
            border: 0px;
            margin: 0px;
            padding: 0px;
        }

        table td {
            border: 1px solid black;
        }

        table th {
            border: 1px solid black;
        }

        a:hover {
            background: #218838;
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
<div class="container-fluid" style="margin-top: 20px">
    <table id="tableEmployee" class="table table-striped table-bordered">
        <thead>
        <tr style="background: #218838">

            <th colspan="11" scope="row"><h3 style="text-align: center">List Customer Using Service</h3></th>


        </tr>

        <tr>
            <th>Name Customer</th>
            <th>Start Date</th>
            <th>End Date</th>
            <th>Name Service</th>
            <th>Id Contract</th>
            <th>Name Attach Service</th>
            <th>Edit</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${customerServiceList}" var="customerService" varStatus="status">
            <tr>
                <td>${customerService.nameCustomer}</td>
                <td>${customerService.startDate}</td>
                <td>${customerService.endDate}</td>
                <td>${customerService.nameService}</td>
                <td>${customerService.idContract}</td>
                <td>
                    <c:forEach items="${attachServiceContractList}" var="attachServiceContract">
                        <c:if test="${attachServiceContract.idContract == customerService.idContract}">
                            <p class="dropdown-item">${attachServiceContract.nameAttachService}</p>
                        </c:if>
                    </c:forEach>
                </td>
                <td>
                    <button
                            class="btn bg-warning center-block"><a
                            href="cusseratt?action=edit&id=${customerService.idContract}"><i
                            class="fa fa-pencil "
                            style="font-size: 1.3em ;text-shadow: 2px 2px  #ccc;color: yellow"
                            aria-hidden="true"></i></a></button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
<div class="container-fluid " style="margin-top: 20px">
    <div class="row">
        <div class="col-lg-1"></div>
        <div class="col-lg-8 ">

            <button style="border-radius: 50px;background: #34ce57;width: 200px;height: 36px; "><a style="text-decoration: none; color: white" href="/cusseratt">Back to list</a>
            </button>

        </div>
    </div>
</div>
<div class="container-fluid ">
    <div style="background: black ;width: 100%;height: 70px ;margin-top: 20px">
        <div style="height: 50px;line-height: 70px">
            <p style="color: white ;text-align: center">Furama resort is pleased to serve.
                FuramaResortDaNang@gmail.com </p>
        </div>

    </div>
</div>
</body>
</html>
