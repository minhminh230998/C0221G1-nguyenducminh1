<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/30/2021
  Time: 3:44 PM
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
<form method="post">
    <div class="container-fluid">
        <div class="row">
            <div class=" col-lg-12"></div>
            <table class="table" style="background: #8fd19e ;">
                <tr style="background: #218838">
                    <th colspan="2"><h3 style="text-align: center">Edit Service Using Contract</h3></th>
                </tr>
                <tr>
                    <th>Id</th>
                    <td>
                        <input disabled  type="text" name="id" id="id" value="${contract.id}">
                    </td>
                </tr>

                <tr>
                    <th>Type Id</th>
                    <td>
                        <select  class="form-select" aria-label="Default select example"  name="serviceId">
                            <option value="${contract.services.id}" hidden selected>${contract.services.name}</option>
                            <c:forEach items="${services}" var="service">
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

                <button style="border-radius: 50px;background: #34ce57;width: 200px;height: 36px; "><a style="text-decoration: none; color: white" href="/cusseratt">Back to list</a>
                </button>

            </div>

            <div class="col-lg-3 ">
                <input type="submit" style="background: #34ce57 ;width: 200px;height: 36px;border-radius: 50px;color: white"
                       value="Edit Contract">
            </div>
        </div>
    </div>

    <div class="container-fluid">
        <c:if test="${message!=null}">
            <div style="width: 700px"><i class="text-success">${message}</i></div>
        </c:if>

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
