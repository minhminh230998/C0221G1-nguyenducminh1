<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/30/2021
  Time: 3:45 PM
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
<div>
    <c:if test="${message!=null}">
        <p class="text-success">${message}</p>
    </c:if>
</div>
<form method="post" action="/sanPham?action=create">
    <div class="container-fluid">
        <div class="row">
            <label class="col-lg-2 ">Name</label>
            <div class="col-lg-10">
                <input type="text" id="ten" style="width: 100%"
                       name="ten" value="${sanPham.ten}" placeholder="input name">
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row">
            <label class="col-lg-2 "></label>
            <div class="col-lg-10">
                <small style="color: red">${msgTen}</small>
            </div>
        </div>
    </div>


    <div class="container-fluid">
        <div class="row">
            <label class="col-lg-2 ">Gia</label>
            <div class="col-lg-10">
                <input value="${sanPham.gia}" type="number" class="form-control" id="gia" name="gia">
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row">
            <label class="col-lg-2 "></label>
            <div class="col-lg-10">
                <small style="color: red">${msgGia}</small>
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row">
            <label class="col-lg-2 ">So Luong</label>
            <div class="col-lg-10">
                <input value="${sanPham.soLuong}" type="number" class="form-control" id="soLuong" name="soLuong">
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row">
            <label class="col-lg-2 "></label>
            <div class="col-lg-10">
                <small style="color: red">${msgSoLuong}</small>
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row">
            <label class="col-lg-2 ">Mau Sac</label>
            <div class="col-lg-10">
                <input value="${sanPham.mauSac}" type="text" class="form-control" id="mauSac" name="mauSac">
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row">
            <label class="col-lg-2 "></label>
            <div class="col-lg-10">
                <small style="color: red">${msgMauSac}</small>
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row">
            <label class="col-lg-2 ">Mo Ta</label>
            <div class="col-lg-10">
                <input value="${sanPham.moTa}" type="text" class="form-control" id="moTa" name="moTa">
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row">
            <label class="col-lg-2 ">Danh Muc</label>
            <div class="col-lg-10">
                <select class="form-select" aria-label="Default select example" name="danhMuc">
                    <option value="${sanPham.danhMuc.id}" hidden selected>${sanPham.danhMuc.ten}</option>
                    <c:forEach items="${danhMucList}" var="danhMucList">
                        <option value="${danhMucList.id}">${danhMucList.ten}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
    </div>


    <div class="container-fluid " style="margin-top: 20px">
        <div class="row">
            <div class="col-lg-1"></div>
            <div class="col-lg-8 ">

                <button style="border-radius: 50px;background: #34ce57;width: 200px;height: 36px; "><a
                        style="text-decoration: none;color: white" href="/sanPham">Quay lai trang chu
                </a>
                </button>

            </div>

            <div class="col-lg-3 ">
                <input style="background: #34ce57 ;width: 200px;height: 36px;border-radius: 50px;color: white"
                       type="submit"
                       value="Them San Pham">
            </div>
        </div>
    </div>
</form>
</body>
</html>