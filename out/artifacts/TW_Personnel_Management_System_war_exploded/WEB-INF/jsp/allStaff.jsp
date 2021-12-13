<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>员工列表 —— 显示所有员工</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/staff/toAddStaff">新增</a>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>员工Id</th>
                    <th>员工名</th>
                    <th>员工年龄</th>
                    <th>性别</th>
                    <th>政治面貌</th>
                    <th>职位</th>
                    <th>部门</th>
                    <th>地址</th>
                    <th>入职时间</th>
                    <th>工龄</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="staff" items="${requestScope.get('list')}">
                    <tr>
                        <td>${staff.getStaffId()}</td>
                        <td>${staff.getStaffName()}</td>
                        <td>${staff.getStaffAge()}</td>
                        <td>${staff.getStaffSex()}</td>
                        <td>${staff.getStaffPolitical()}</td>
                        <td>${staff.getStaffPosition()}</td>
                        <td>${staff.getDepartmentId()}</td>
                        <td>${staff.getStaffAddress()}</td>
                        <td>${staff.getHireDate()}</td>
                        <td>${staff.getWorkingYears()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/staff/toUpdateStaff?staffId=${staff.getStaffId()}">更改</a>
                            |
                            <a href="${pageContext.request.contextPath}/staff/toDeleteStaff/${staff.getStaffId()}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
