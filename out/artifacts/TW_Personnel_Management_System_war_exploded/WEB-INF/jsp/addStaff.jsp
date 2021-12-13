<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="xlink" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>TW - 企业人事管理系统</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">
    <!-- Bootstrap CSS-->
    <link rel="stylesheet" href="/vendor/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome CSS-->
    <link rel="stylesheet" href="/vendor/font-awesome/css/font-awesome.min.css">
    <!-- Fontastic Custom icon font-->
    <link rel="stylesheet" href="/css/fontastic.css">
    <!-- Google fonts - Roboto -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700">
    <!-- jQuery Circle-->
    <link rel="stylesheet" href="/css/grasp_mobile_progress_circle-1.0.0.min.css">
    <!-- Custom Scrollbar-->
    <link rel="stylesheet" href="/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.css">
    <!-- theme stylesheet-->
    <link rel="stylesheet" href="/css/style.default.css" id="theme-stylesheet">
    <!-- Custom stylesheet - for your changes-->
    <link rel="stylesheet" href="/css/custom.css">
    <!-- Favicon-->
    <link rel="shortcut icon" href="/img/Compare.png">
</head>
<body>
<!-- Side Navbar -->
<nav class="side-navbar">
    <div class="side-navbar-wrapper">
        <!-- Sidebar Header    -->
        <div class="sidenav-header d-flex align-items-center justify-content-center">
            <!-- User Info-->
            <div class="sidenav-header-inner text-center"><img src="/img/avatar-7.jpg" alt="person"
                                                               class="img-fluid rounded-circle">
                <h2 class="h5">${username}</h2><span>企业人事管理系统</span>
            </div>
            <!-- Small Brand information, appears on minimized sidebar-->
            <div class="sidenav-header-logo"><a href="index.html" class="brand-small text-center">
                <strong>T</strong><strong class="text-primary">W</strong></a></div>
        </div>
        <!-- Sidebar Navigation Menus-->
        <div class="main-menu">
            <h5 class="sidenav-heading">主要</h5>
            <ul id="side-main-menu" class="side-menu list-unstyled">
                <li><a href="/"> <i class="icon-home"></i>主页 </a></li>
                <li><a href="#exampledropdownDropdown" aria-expanded="false" data-toggle="collapse"> <i
                        class="icon-interface-windows"></i>数据信息</a>
                    <ul id="exampledropdownDropdown" class="collapse list-unstyled ">
                        <li><a href="${pageContext.request.contextPath}/staff/staff_list" class="active">员工信息</a></li>
                        <li><a href="${pageContext.request.contextPath}/department/allDepartment">部门信息</a></li>
                        <li><a href="${pageContext.request.contextPath}">合同信息</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="page">
    <!-- navbar-->
    <header class="header">
        <nav class="navbar">
            <div class="container-fluid">
                <div class="navbar-holder d-flex align-items-center justify-content-between">
                    <div class="navbar-header"><a id="toggle-btn" href="#" class="menu-btn"><i
                            class="icon-bars"> </i></a><a href="index.html" class="navbar-brand">
                        <div class="brand-text d-none d-md-inline-block"><strong
                                class="text-primary">TW - 企业人事管理系统</strong></div>
                    </a></div>
                    <ul class="nav-menu list-unstyled d-flex flex-md-row align-items-md-center">
                        <!-- Log out-->
                        <li class="nav-item"><a href="${pageContext.request.contextPath}/login/logout"
                                                class="nav-link logout"> <span
                                class="d-none d-sm-inline-block">Logout</span><i
                                class="fa fa-sign-out"></i></a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <!-- Counts Section -->
    <section class="dashboard-counts section-padding">
        <div class="container-fluid">
            <div class="row d-flex justify-content-between">
                <!-- Count item widget-->
                <div class="col-xl-2 col-md-4 col-6">
                    <div class="wrapper count-title d-flex">
                        <div class="icon"><i class="icon-user"></i></div>
                        <div class="name"><strong class="text-uppercase">员工数</strong><span>在职员工</span>
                            <div class="count-number"><% out.println(session.getAttribute("staffNumber"));%></div>
                        </div>
                    </div>
                </div>
                <!-- Count item widget-->
                <div class="col-xl-2 col-md-4 col-6">
                    <div class="wrapper count-title d-flex">
                        <div class="icon"><i class="icon-padnote"></i></div>
                        <div class="name"><strong class="text-uppercase">合同数</strong><span>过去五天</span>
                            <div class="count-number">5</div>
                        </div>
                    </div>
                </div>
                <!-- Count item widget-->
                <div class="col-xl-2 col-md-4 col-6">
                    <div class="wrapper count-title d-flex">
                        <div class="icon"><i class="icon-check"></i></div>
                        <div class="name"><strong class="text-uppercase">部门数</strong><span>过去两个月</span>
                            <div class="count-number">4</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <hr/>
    <!-- Statistics Section-->
    <section class="statistics">
        <div class="container-fluid">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <div class="page-header">
                        <h1>新增员工</h1>
                    </div>
                </div>
            </div>
            <form action="${pageContext.request.contextPath}/staff/addStaff" method="post">
                <hr class="my-4">
                <div class="row gy-3">
                    <div class="col-12">
                        <label for="StaffId" class="form-label">员工Id<span class="text-muted">: </span></label>
                        <input type="text" class="form-control" id="StaffId" placeholder="StaffId" name="StaffId">
                    </div>
                </div>
                <div class="row gy-3">
                    <div class="col-12">
                        <label for="StaffName" class="form-label">员工姓名<span class="text-muted">: </span></label>
                        <input type="text" class="form-control" id="StaffName" placeholder="StaffName" name="StaffName">
                    </div>
                </div>
                <div class="row gy-3">
                    <div class="col-12">
                        <label for="StaffAge" class="form-label">员工年龄<span class="text-muted">: </span></label>
                        <input type="text" class="form-control" id="StaffAge" placeholder="StaffAge" name="StaffAge">
                    </div>
                </div>
                <div class="row gy-3">
                    <div class="col-12">
                        <label for="StaffSex" class="form-label">员工性别<span class="text-muted">: </span></label>
                        <input type="text" class="form-control" id="StaffSex" placeholder="StaffSex" name="StaffSex">
                    </div>
                </div>
                <div class="row gy-3">
                    <div class="col-12">
                        <label for="StaffPolitical" class="form-label">政治面貌<span class="text-muted">: </span></label>
                        <input type="text" class="form-control" id="StaffPolitical" placeholder="StaffPolitical" name="StaffPolitical">
                    </div>
                </div>
                <div class="row gy-3">
                    <div class="col-12">
                        <label for="StaffPosition" class="form-label">员工职位<span class="text-muted">: </span></label>
                        <input type="text" class="form-control" id="StaffPosition" placeholder="StaffPosition" name="StaffPosition">
                    </div>
                </div>
                <div class="row gy-3">
                    <div class="col-12">
                        <label for="DepartmentId" class="form-label">部门Id<span class="text-muted">: </span></label>
                        <input type="text" class="form-control" id="DepartmentId" placeholder="DepartmentId" name="DepartmentId">
                    </div>
                </div>
                <div class="row gy-3">
                    <div class="col-12">
                        <label for="StaffAddress" class="form-label">员工地址<span class="text-muted">: </span></label>
                        <input type="text" class="form-control" id="StaffAddress" placeholder="StaffAddress" name="StaffAddress">
                    </div>
                </div>
                <div class="row gy-3">
                    <div class="col-12">
                        <label for="HireDate" class="form-label">入职时间<span class="text-muted">: </span></label>
                        <input type="text" class="form-control" id="HireDate" placeholder="HireDate" name="HireDate">
                    </div>
                </div>
                <div class="row gy-3">
                    <div class="col-12">
                        <label for="WorkingYears" class="form-label">工龄<span class="text-muted">: </span></label>
                        <input type="text" class="form-control" id="WorkingYears" placeholder="WorkingYears" name="WorkingYears">
                    </div>
                </div>
                <hr class="my-4">
                <button class="w-100 btn btn-primary btn-lg" type="submit">添加员工</button>
            </form>
        </div>
    </section>
    <footer class="main-footer">
        <div class="container-fluid">
            <div class="row d-flex justify-content-center">
                <div class="col-sm-6">
                    <p>TW &copy; 2021. 企业人事管理系统.</p>
                </div>
            </div>
        </div>
    </footer>
</div>
<!-- JavaScript files-->
<script src="/vendor/jquery/jquery.min.js"></script>
<script src="/vendor/popper.js/umd/popper.min.js"></script>
<script src="/vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="/js/grasp_mobile_progress_circle-1.0.0.min.js"></script>
<script src="/vendor/jquery.cookie/jquery.cookie.js"></script>
<script src="/vendor/chart.js/Chart.min.js"></script>
<script src="/vendor/jquery-validation/jquery.validate.min.js"></script>
<script src="/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
<script src="/js/charts-home.js"></script>
<!-- Main File-->
<script src="/js/front.js"></script>
</body>
</html>
