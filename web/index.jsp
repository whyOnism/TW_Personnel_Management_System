<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TW-企业人事管理系统</title>
    <link rel="stylesheet" href="/css/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="/css/cover.css">
</head>
<body class="d-flex h-100 text-center text-white bg-dark">

<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
    <header class="mb-auto">
        <div>
            <h3 class="float-md-start mb-0">TW-企业人事管理系统</h3>
            <nav class="nav nav-masthead justify-content-center float-md-end">
                <a class="nav-link active" aria-current="page" href="#">主页</a>
                <a class="nav-link" href="#">企业信息</a>
                <a class="nav-link" href="#">关于我们</a>
            </nav>
        </div>
    </header>

    <main class="px-3">
        <h1>欢迎进入TW - 企业人事管理系统</h1>
        <p class="lead">请登陆后进入系统</p>
        <p class="lead d-flex justify-content-around">
            <a href="${pageContext.request.contextPath}/login/loginPage"
               class="btn btn-lg btn-secondary fw-bold border-white bg-white">登&nbsp;&nbsp;录</a>
            <a href="${pageContext.request.contextPath}/register/registerPage"
               class="btn btn-lg btn-secondary fw-bold border-white bg-white">注&nbsp;&nbsp;册</a>
        </p>
    </main>

    <footer class="mt-auto text-white-50">
        <p>Created <a href="#" class="text-white">企业人事管理系统</a>&nbsp;&nbsp;by <a
                href="#" class="text-white">@ TW</a>.</p>
    </footer>
</div>
<script type="text/javascript" src="/js/jquery-3.5.1.js"/>
<script type="text/javascript" src="/js/bootstrap.min.js"/>
</body>
</html>
