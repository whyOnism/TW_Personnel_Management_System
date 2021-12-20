<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="xlink" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <div class="sidenav-header-logo"><a href="#" class="brand-small text-center">
                <strong>T</strong><strong class="text-primary">W</strong></a></div>
        </div>
        <!-- Sidebar Navigation Menus-->
        <div class="main-menu">
            <h5 class="sidenav-heading">主要</h5>
            <ul id="side-main-menu" class="side-menu list-unstyled">
                <li><a href="${pageContext.request.contextPath}/toHome/homePage"> <i class="icon-home"></i>主页 </a></li>
                <li><a href="#exampledropdownDropdown" aria-expanded="false" data-toggle="collapse"> <i
                        class="icon-interface-windows"></i>数据信息</a>
                    <ul id="exampledropdownDropdown" class="collapse list-unstyled ">
                        <li><a href="${pageContext.request.contextPath}/staff/staff_list">员工信息</a></li>
                        <li><a href="${pageContext.request.contextPath}/department/department_list">部门信息</a></li>
                        <li><a href="${pageContext.request.contextPath}">合同信息</a></li>
                        <c:if test="${userType==\"Admin\"}">
                            <li><a href="${pageContext.request.contextPath}/user/ordinary_list">登录用户</a></li>
                        </c:if>
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
                            <div class="count-number"><% out.println(session.getAttribute("departmentNumber"));%></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Header Section-->
    <section class="dashboard-header section-padding">
        <div class="container-fluid">
            <div class="row d-flex align-items-md-stretch justify-content-center">
                <!-- Pie Chart-->
                <div class="col-lg-3 col-md-6">
                    <div class="card project-progress">
                        <h2 class="display h4">各部门人数占比</h2>
                        <div class="pie-chart">
                            <canvas id="pieChart" width="300" height="300"></canvas>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Statistics Section-->
    <section class="statistics">
        <div class="container-fluid">
            <div class="row d-flex justify-content-around">
                <div class="col-lg-4">
                    <!-- Income-->
                    <div class="card income text-center">
                        <div class="icon"><i class="icon-line-chart"></i></div>
                        <div class="number"><% out.println(session.getAttribute("staffNumber"));%></div>
                        <strong class="text-primary">员工总数</strong>
                    </div>
                </div>
                <div class="col-lg-4">
                    <!-- User Actibity-->
                    <div class="card user-activity">
                        <h2 class="display h4">网站访问活跃度</h2>
                        <div class="number">210</div>
                        <h3 class="h4 display">普通用户</h3>
                        <div class="progress">
                            <div role="progressbar" style="width: 25%" aria-valuenow="25" aria-valuemin="0"
                                 aria-valuemax="100" class="progress-bar progress-bar bg-primary"></div>
                        </div>
                        <div class="page-statistics d-flex justify-content-between">
                            <div class="page-statistics-left"><span>浏览条数</span><strong>230</strong>
                            </div>
                            <div class="page-statistics-right"><span>普通用户占比</span><strong>73.4%</strong>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
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
<script>
    $(document).ready(function () {

        'use strict';

        // Main Template Color
        var brandPrimary = '#33b35a';


        // ------------------------------------------------------- //
        // Line Chart
        // ------------------------------------------------------ //
        var LINECHART = $('#lineCahrt');
        var myLineChart = new Chart(LINECHART, {
            type: 'line',
            options: {
                legend: {
                    display: false
                }
            },
            data: {
                labels: ["Jan", "Feb", "Mar", "Apr", "May", "June", "July"],
                datasets: [
                    {
                        label: "My First dataset",
                        fill: true,
                        lineTension: 0.3,
                        backgroundColor: "rgba(77, 193, 75, 0.4)",
                        borderColor: brandPrimary,
                        borderCapStyle: 'butt',
                        borderDash: [],
                        borderDashOffset: 0.0,
                        borderJoinStyle: 'miter',
                        borderWidth: 1,
                        pointBorderColor: brandPrimary,
                        pointBackgroundColor: "#fff",
                        pointBorderWidth: 1,
                        pointHoverRadius: 5,
                        pointHoverBackgroundColor: brandPrimary,
                        pointHoverBorderColor: "rgba(220,220,220,1)",
                        pointHoverBorderWidth: 2,
                        pointRadius: 1,
                        pointHitRadius: 0,
                        data: [50, 20, 60, 31, 52, 22, 40],
                        spanGaps: false
                    },
                    {
                        label: "My First dataset",
                        fill: true,
                        lineTension: 0.3,
                        backgroundColor: "rgba(75,192,192,0.4)",
                        borderColor: "rgba(75,192,192,1)",
                        borderCapStyle: 'butt',
                        borderDash: [],
                        borderDashOffset: 0.0,
                        borderJoinStyle: 'miter',
                        borderWidth: 1,
                        pointBorderColor: "rgba(75,192,192,1)",
                        pointBackgroundColor: "#fff",
                        pointBorderWidth: 1,
                        pointHoverRadius: 5,
                        pointHoverBackgroundColor: "rgba(75,192,192,1)",
                        pointHoverBorderColor: "rgba(220,220,220,1)",
                        pointHoverBorderWidth: 2,
                        pointRadius: 1,
                        pointHitRadius: 10,
                        data: [65, 59, 30, 81, 46, 55, 30],
                        spanGaps: false
                    }
                ]
            }
        });


        // ------------------------------------------------------- //
        // Pie Chart
        // ------------------------------------------------------ //
        var PIECHART = $('#pieChart');
        var technology = <%=session.getAttribute("technology")%>;
        var sales = <%=session.getAttribute("sales")%>;
        var logistics = <%=session.getAttribute("logistics")%>;
        var myPieChart = new Chart(PIECHART, {
            type: 'doughnut',
            data: {
                labels: [
                    "技术部",
                    "销售部",
                    "后勤部"
                ],
                datasets: [
                    {
                        data: [technology, sales, logistics],
                        borderWidth: [1, 1, 1],
                        backgroundColor: [
                            brandPrimary,
                            "rgba(75,192,192,1)",
                            "#FFCE56"
                        ],
                        hoverBackgroundColor: [
                            brandPrimary,
                            "rgba(75,192,192,1)",
                            "#FFCE56"
                        ]
                    }]
            }
        });

    });
</script>
<!-- Main File-->
<script src="/js/front.js"></script>
</body>
</html>
