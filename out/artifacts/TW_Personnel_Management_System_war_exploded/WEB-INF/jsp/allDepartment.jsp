<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>部门列表</title>
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
                    <small>部门列表 —— 显示所有部门</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/department/toAddDepartment">新增</a>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>部门编号</th>
                    <th>员工Id</th>
                    <th>部门名</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="department" items="${requestScope.get('list')}">
                    <tr>
                        <td>${department.getDepartmentId()}</td>
                        <td>${department.getStaffId()}</td>
                        <td>${department.getDepartmentName()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/department/toUpdateDepartment?departmentId=${department.getDepartmentId()}">更改</a>
                            |
                            <a href="${pageContext.request.contextPath}/department/toDeleteDepartment/${department.getDepartmentId()}">删除</a>
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