<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/30/2021
  Time: 3:47 PM
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
<c:if test="${message!=null}">
    <p class="text-success">${message}</p>
</c:if>
<form action="/service?action=villa" method="post">
<div class="container-fluid">
    <div class="row">
        <div class=" col-lg-12"></div>
        <table class="table" style="background: #8fd19e ;">
            <tr style="background: #218838">
                <th colspan="2"><h3 style="text-align: center">Add Villa</h3></th>
            </tr>
            <tr>
                <th>Name</th>
                <td>
                    <input type="text" name="name" id="name">
                </td>
            </tr>

            <tr>
                <th>Area</th>
                <td>
                    <input type="text" name="area" id="area">
                </td>
            </tr>
            <th>Cost</th>
            <td>
                <input type="text" name="cost" id="cost">
            </td>
            <tr>
            <tr>
                <th>Max people</th>
                <td>
                    <input type="text" name="maxPeople" id="maxPeople">
                </td>
            </tr>
            <tr>
                <th>Rent type</th>
                <td>
                    <select class="form-select" aria-label="Default select example"  name="rentType">
                        <option value="1">Theo Nam</option>
                        <option value="2">Theo Thang</option>
                        <option value="3">Theo Ngay</option>
                        <option value="4">Theo Gio</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Service type</th>
                <td>
                    <input disabled type="text" name="serviceType" id="serviceType" value="Villa">
                </td>
            </tr>
            <tr>
                <th>Standard room</th>
                <td>
                    <input type="text" name="standardRoom" id="standardRoom">
                </td>
            </tr>
            <tr>
                <th>Description</th>
                <td>
                    <input type="text" name="description" id="description">
                </td>
            </tr>
            <tr>
                <th>Pool area</th>
                <td>
                    <input type="text" name="poolArea" id="poolArea">
                </td>
            </tr>
            <tr>
                <th>Number floors</th>
                <td>
                    <input type="text" name="numberFloors" id="numberFloors">
                </td>

            </tr>


        </table>
    </div>
</div>

<div class="container-fluid " style="margin-top: 20px">
    <div class="row">
        <div class="col-lg-1"></div>
        <div class="col-lg-8 ">
            <a href="/home">
                <button style="border-radius: 50px;background: #34ce57;width: 200px;height: 36px; ">Back to Home
                </button>
            </a>
        </div>

        <div class="col-lg-3 ">
            <input style="background: #34ce57 ;width: 200px;height: 36px;border-radius: 50px;" type="submit"
                   value="Add Service">
        </div>
    </div>
</div>
</form>
<div class="container-fluid">

    <div style="background: black ;width: 100%;height: 70px ;margin-top: 20px">
        <div style="height: 50px;line-height: 70px">
            <p style="color: white ;text-align: center">Furama resort is pleased to serve.
                FuramaResortDaNang@gmail.com </p>
        </div>
    </div>
</div>
</body>
</html>
