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
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
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
<div class="container-fluid d-flex" style="margin-top: 20px">
    <div class="col-lg-9">
        <div style="background: #34ce57 ;width: 150px;height: 40px;border-radius:50px ">
            <a style="text-decoration: none;color: white" href="/employee?action=create">
                <p style="width: 100%;height: 100%;line-height: 40px;text-align: center">Add Employee</p></a>
        </div>
    </div>
    <div class="col-lg-3">
        <form class="d-flex" method="post" action="/employee?action=search">
            <input class="form-control me-2" name="name" type="search" placeholder="Search" aria-label="Search">
            <span><button class="btn btn-outline-success" type="submit">Search</button></span>
        </form>

    </div>
</div>

<div class="container-fluid" style="margin-top: 20px">
    <table style="width: 100%" id="tableEmployee" class="table table-striped table-bordered">
        <thead>
        <tr style="background: #218838">

            <th colspan="11" scope="row"><h3 style="text-align: center">List Employee</h3></th>


        </tr>

        <tr>
            <th>STT</th>
            <th>Id</th>
            <th>Name</th>
            <th>Birthday</th>
            <td>Edit</td>
            <td>Delete</td>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${employeeLists}" var="employee" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${employee.id}</td>
                <td>${employee.name}</td>
                <td>${employee.birthday}</td>

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
                    <button type="button" class="btn bg-danger" data-toggle="modal"
                            onclick="deleteEmployee('${employee.id}')" data-target="#staticBackdrop">
                        <i style="font-size: 1.3em ;text-shadow: 2px 2px  #ccc;color: darkred" class="fa fa-trash"
                           aria-hidden="true"></i>
                    </button>
                </td>
            </tr>

        </c:forEach>
        </tbody>
    </table>
    <!-- Modal -->
    <form action="/employee?action=delete" method="post">
        <div class="modal fade" id="staticBackdrop" data-backdrop="static" data-keyboard="false" tabindex="-1"
             aria-labelledby="staticBackdropLabel" aria-hidden="true">
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
                        <button type="submit" id="idEmployee" name="id" class="btn btn-primary">Delete</button>
                    </div>
                </div>
            </div>
        </div>
    </form>

</div>


<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../bootstrap413/js/bootstrap.min.js"></script>
<script src="../datatables/js/jquery.dataTables.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableEmployee').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5,
        });
    })

    function deleteEmployee(id) {
        document.getElementById("idEmployee").value = id;
    }
</script>
</body>
</html>
