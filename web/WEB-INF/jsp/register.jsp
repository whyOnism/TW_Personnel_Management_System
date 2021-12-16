<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="<c:url value="/css/bootstrap/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/login.css"/>">
</head>
<body class="text-center bg-dark">
<main class="form-sign-in">
    <form action="${pageContext.request.contextPath}/register/verification" method="post">
        <h1 class="h3 mb-3 fw-normal text-white">注&nbsp;&nbsp;册</h1>
        <div class="form-floating mb-2">
            <input type="username" class="form-control" name="username" id="floatingUsername" placeholder="username">
            <label for="floatingUsername">用户名</label>
        </div>
        <div class="form-floating mb-2">
            <input type="password" class="form-control" name="password" id="floatingPassword" placeholder="Password">
            <label for="floatingPassword">密码</label>
        </div>
        <button class="w-100 btn btn-lg bg-white mt-3" type="submit">注册</button>
        <p class="mt-5 mb-3 text-muted">© 2021–2022</p>
    </form>
</main>
<script type="text/javascript" src="<c:url value="/js/jquery-3.5.1.js"/>"/>
<script type="text/javascript" src="<c:url value="/js/bootstrap.min.js"/>"/>
</body>
</html>
