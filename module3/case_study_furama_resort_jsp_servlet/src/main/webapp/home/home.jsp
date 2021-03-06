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
                    <p>H?????ng ra b??i bi???n ???? N???ng tr???i d??i c??t tr???ng, Furama Resort ???? N???ng l?? c???a ng?? ?????n v???i 3 di s???n
                        v??n ho?? th??? gi???i: H???i An (20 ph??t), M??? S??n (90 ph??t) v?? Hu??? (2 ti???ng. 196 ph??ng h???ng sang c??ng
                        v???i 70 c??n bi???t th??? t??? hai ?????n b???n ph??ng ng??? c?? h??? b??i ri??ng ?????u ???????c trang tr?? trang nh??, theo
                        phong c??ch thi???t k??? truy???n th???ng c???a Vi???t Nam v?? ki???n tr??c thu???c ?????a c???a Ph??p, bi???n Furama th??nh
                        khu ngh??? d?????ng danh gi?? nh???t t???i Vi???t Nam ??? vinh d??? ???????c ????n ti???p nhi???u ng?????i n???i ti???ng, gi???i
                        ho??ng gia, ch??nh kh??ch, ng??i sao ??i???n ???nh v?? c??c nh?? l??nh ?????o kinh doanh qu???c t???.</p>
                    <p>Khu ngh??? d?????ng c?? 196 ph??ng ???????c thi???t k??? theo phong c??ch truy???n th???ng Vi???t Nam k???t h???p v???i phong
                        c??ch Ph??p, 2 t??a nh?? 4 t???ng c?? h?????ng nh??n ra bi???n, nh??n ra h??? b??i trong xanh v?? nh???ng khu v?????n
                        nhi???t ?????i xanh t????i m??t. Ngo??i ra, khu ngh??? d?????ng Furama c??n cung c???p ca??c li????u ph??p spa, ph??ng
                        x??ng h??i ??????t, ph??ng x??ng h??i kh??, di??ch vu?? ma??t-xa ca??nh h???? b??i, c??c d???ch v??? th??? thao d?????i
                        n?????c v?? ca??c l????p t????p yoga v?? Tha??i C????c Quy????n tr??n b??i bi???n.</p>
                    <p>Tr???i nghi???m ch??i golf ?????c ????o v?? kh?? qu??n t???i S??n golf Montgomerie Links 18 l??? b??n b??? bi???n ????
                        N???ng t??nh l???ng v???i m???t b??n l?? N??i Ng?? H??nh S??n n???i ti???ng. ???? N???ng Golf Club ???????c thi???t k??? b???i
                        doanh nh??n ng?????i ??c ??? huy???n tho???i golf Greg Norman duy nh???t t???i ????ng Nam ??. C??? hai s??n golf n???i
                        ti???ng n??y ?????u ch??? c??ch Furama Resort ???? n???ng 7 ph??t l??i xe.</p>
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
