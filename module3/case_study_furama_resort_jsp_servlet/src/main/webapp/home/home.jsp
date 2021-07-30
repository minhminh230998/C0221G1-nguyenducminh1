<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/29/2021
  Time: 3:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
    <style>
        * {
            border: 0px;
            margin: 0px;
            padding: 0px;
        }

        .navbar-nav li {
            margin-left: 30px;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-light bg-light" style="padding: 0">
    <div class="container-fluid" style="background:#94F08D;text-align: center">
        <div class="row">
            <div class="col-lg-12">

                <a class="navbar-brand" href="/">
                    <img style="margin-left:80px " src="../img/logo-chinh-thuc.png"
                         alt="" width="100%" height="140px" class="d-inline-block align-text-top">
                </a>
            </div>
        </div>
    </div>
</nav>

<nav class="navbar navbar-expand-lg navbar-light bg-light" style="background: lightgray">
    <div class="container-fluid">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav">
                    <li style="margin-left: 0px " class="nav-item active">
                        <a class="nav-link" href="/">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../customer">Customer</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../employee">Employee</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Service</a>
                        <a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="/service?action=add">AddService</a>
                            </div>
                        </a>

                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/contract?action=add">Contract</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/contractDetail?action=add">Contract Detail</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/cusseratt">CustomerAttach</a>
                    </li>

                </ul>
            </div>
        </nav>

        <div class="col-lg-3">

            <form class="d-flex ">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <span><button class="btn btn-outline-success" type="submit">Search</button></span>
            </form>

        </div>
    </div>
</nav>
<div class="container-fluid" style="top:0">
    <div class="row">


        <div class="card text-white col-lg-2" style="padding: 0">
            <img src="../img/hinh-nen-thien-nhien-dep-danh-cho-iphone-6-7-8-14.jpg" style="height: 100%;width: 100%"
                 class="card-img" alt="...">
            <div class="card-img-overlay">
                <div style="top:0">
                    <ul style="list-style: none;">
                        <li style="margin-bottom: 20px ;padding-top: 40px"><a class="dropdown-item" href="#">Regular
                            link</a>
                        </li>
                        <li style="margin-bottom: 20px"><a class="dropdown-item" href="#" aria-current="true">Active
                            link</a>
                        </li>
                        <li style="margin-bottom: 20px"><a class="dropdown-item" href="#">Another link</a></li>
                    </ul>
                </div>
            </div>


        </div>
        <div class="col-lg-10">
            <img src="../img/hinh1.jpg " style="width: 100%;height: auto">
            <div class="row">
                <div class="col-lg-6">
                    <img src="../img/hinh2.jpg " style="width: 100%;height: 300px">
                    <img src="../img/hinh3.jpg " style="width: 100%;height: 300px">

                </div>
                <div class="col-lg-6">
                    <p>Hướng ra bãi biển Đà Nẵng trải dài cát trắng, Furama Resort Đà Nẵng là cửa ngõ đến với 3 di sản
                        văn hoá thế giới: Hội An (20 phút), Mỹ Sơn (90 phút) và Huế (2 tiếng. 196 phòng hạng sang cùng
                        với 70 căn biệt thự từ hai đến bốn phòng ngủ có hồ bơi riêng đều được trang trí trang nhã, theo
                        phong cách thiết kế truyền thống của Việt Nam và kiến trúc thuộc địa của Pháp, biến Furama thành
                        khu nghỉ dưỡng danh giá nhất tại Việt Nam – vinh dự được đón tiếp nhiều người nổi tiếng, giới
                        hoàng gia, chính khách, ngôi sao điện ảnh và các nhà lãnh đạo kinh doanh quốc tế.</p>
                    <p>Khu nghỉ dưỡng có 196 phòng được thiết kế theo phong cách truyền thống Việt Nam kết hợp với phong
                        cách Pháp, 2 tòa nhà 4 tầng có hướng nhìn ra biển, nhìn ra hồ bơi trong xanh và những khu vườn
                        nhiệt đới xanh tươi mát. Ngoài ra, khu nghỉ dưỡng Furama còn cung cấp các liệu pháp spa, phòng
                        xông hơi ướt, phòng xông hơi khô, dịch vụ mát-xa cạnh hồ bơi, các dịch vụ thể thao dưới
                        nước và các lớp tập yoga và Thái Cực Quyền trên bãi biển.</p>
                    <p>Trải nghiệm chơi golf độc đáo và khó quên tại Sân golf Montgomerie Links 18 lỗ bên bờ biển Đà
                        Nẵng tĩnh lặng với một bên là Núi Ngũ Hành Sơn nổi tiếng. Đà Nẵng Golf Club được thiết kế bởi
                        doanh nhân người Úc – huyền thoại golf Greg Norman duy nhất tại Đông Nam Á. Cả hai sân golf nổi
                        tiếng này đều chỉ cách Furama Resort Đà nẵng 7 phút lái xe.</p>
                </div>

            </div>
        </div>
    </div>
</div>
<div class="container-fluid mt-5 " style="padding: 0">
    <div style="background: black ;width: 100%;height: 70px;margin: 0">
        <div style="height: 50px;line-height: 70px">
            <p style="color: white ;text-align: center">Furama resort is pleased to serve.
                FuramaResortDaNang@gmail.com </p>
        </div>

    </div>
</div>

</body>
</html>
