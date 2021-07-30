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
    <table class="table " style="background: #8fd19e">

        <tr style="background: #218838">

            <th colspan="11" scope="row"><h3 style="text-align: center">List Employee</h3></th>


        </tr>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>Gender</th>
            <th>Phone Number</th>
<%--            <th>Edit</th>--%>
<%--            <th>Delete</th>--%>
<%--            <th>Information</th>--%>
        </tr>
        <c:forEach items="${employeeList}" var="employee" varStatus="status">
            <tr>

                <td>${employee.id}</td>
                <td>${employee.name}</td>
                <td>${employee.dateOfBirth}</td>
                <td>${employee.gender}</td>
                <td>${employee.phone}</td>
                <td scope="col" style="text-align: center">
                    <button
                            class="btn bg-warning center-block"><a href="employee?action=edit&id=${employee.id}"><i
                            class="fa fa-pencil "
                            style="font-size: 1.3em ;text-shadow: 2px 2px  #ccc;color: yellow"
                            aria-hidden="true"></i></a></button>
                </td>
                <td scope="col" style="text-align: center">
                    <!-- Button trigger modal -->
                    <!-- Button trigger modal -->
                    <button type="button" class="btn bg-danger" data-toggle="modal" data-target="#staticBackdrop">
                        <i  style="font-size: 1.3em ;text-shadow: 2px 2px  #ccc;color: darkred" class="fa fa-trash" aria-hidden="true"></i>
                    </button>

                    <!-- Modal -->
                    <div class="modal fade" id="staticBackdrop" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="staticBackdropLabel">Modal title</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    Bạn có chắc muốn xóa nhân viên này
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                    <button type="button" class="btn btn-primary">Delete</button>
                                </div>
                            </div>
                        </div>
                    </div>


                </td>
                <td><!-- Button trigger modal -->
                    <div class="justify-content-center" style="text-align: center">
                        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                            <a href="customer?action=show&id=${employee.id}"><i
                                    style="font-size: 1.3em ;text-shadow: 2px 2px  #ccc;color: blue; " class="fa fa-eye"
                                    aria-hidden="true"></i></a>
                        </button>
                    </div>
                    <!-- Modal -->
                    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
                         aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    <table class="table" style="background: #8fd19e ;">
                                        <tr style="background: #218838">
                                            <th colspan="2"><h3 style="text-align: center">View Customer</h3></th>
                                        </tr>
                                        <tr>
                                            <th>Id</th>
                                            <td>

                                                <input disabled type="text" name="id" id="id" value="${employee.id}">
                                            </td>
                                        </tr>

                                        <tr>
                                            <th>Name</th>
                                            <td>
                                                <input disabled type="text" name="name" id="name"
                                                       value="${employee.name}">
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>Id Position</th>
                                            <td>
                                                <input disabled type="text" name="idPosition" id="idPosition"
                                                       value="${employee.idPosition}">
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>Id EducationDegree</th>
                                            <td>
                                                <input disabled type="text" name="idEducationDegree"
                                                       id="idEducationDegree" value="${employee.idEducationDegree}">
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>Id Division</th>
                                            <td>
                                                <input disabled type="text" name="idDivision" id="idDivision"
                                                       value="${employee.idDivision}">
                                            </td>
                                        </tr>
                                        <tr>

                                            <th>Birthday</th>
                                            <td>
                                                <input disabled type="text" name="birthday" id="birthday"
                                                       value="${employee.dateOfBirth}">
                                            </td>
                                        </tr>
                                        <th>Gender</th>
                                        <td>
                                            <div style="width: 50% " class="d-flex">
                                                <input disabled name="gioitinh" type="text" value="${employee.gender}"/>

                                            </div>
                                        </td>
                                        <tr>
                                            <th>Id Card</th>
                                            <td>
                                                <input disabled type="text" name="idCard" id="idCard"
                                                       value="${employee.idCard}">
                                            </td>
                                        </tr>

                                        <tr>
                                            <th>Phone Number</th>
                                            <td>
                                                <input disabled type="text" name="phoneNumber" id="phoneNumber"
                                                       value="${employee.phone}">
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>Email</th>
                                            <td>
                                                <input disabled type="text" name="email" id="email"
                                                       value="${employee.email}">
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>Salary</th>
                                            <td>
                                                <input disabled type="text" name="salary" id="salary"
                                                       value="${employee.salary}">
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>Address</th>
                                            <td>
                                                <input disabled type="text" name="address" id="address"
                                                       value="${employee.address}">
                                            </td>
                                        </tr>


                                    </table>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal"><a
                                            href="/customer">Close</a></button>
                                </div>
                            </div>
                        </div>
                    </div>
                </td>
            </tr>

        </c:forEach>
    </table>

</div>
<div class="container-fluid " style="margin-top: 20px">
    <div class="row">
        <div class="col-lg-1"></div>
        <div class="col-lg-8 ">

            <button style="border-radius: 50px;background: #34ce57;width: 200px;height: 36px; "><a style="text-decoration: none; color: white" href="/employee">Back to list
                customer</a>
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
