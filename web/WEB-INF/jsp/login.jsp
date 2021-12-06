<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="<c:url value="/css/bootstrap/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/login.css"/>">
</head>
<body class="text-center bg-dark">
<main class="form-sign-in">
    <form action="${pageContext.request.contextPath}/login/verification" method="post">
        <h1 class="h3 mb-3 fw-normal text-white">登&nbsp;&nbsp;录</h1>
        <div class="form-floating mb-2">
            <input type="username" class="form-control" id="floatingUsername" placeholder="username">
            <label for="floatingUsername">用户名</label>
        </div>
        <div class="form-floating mb-2">
            <input type="password" class="form-control" id="floatingPassword" placeholder="Password">
            <label for="floatingPassword">密码</label>
        </div>

        <div class="mb-3 text-white">
            <label class="d-flex justify-content-around">
                <input type="radio" name="userType" id="Admin" value="Admin" checked>管理员
                <input type="radio" name="userType" id="Ordinary" value="Ordinary">普通用户
            </label>
        </div>
        <button class="w-100 btn btn-lg bg-white" type="submit">登录</button>
        <p class="mt-5 mb-3 text-muted">© 2021–2022</p>
    </form>
</main>
<script type="text/javascript" src="<c:url value="/js/jquery-3.5.1.js"/>"/>
<script type="text/javascript" src="<c:url value="/js/bootstrap.min.js"/>"/>
</body>
</html>
