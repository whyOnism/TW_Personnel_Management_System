<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增员工</title>
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
                    <small>新增员工</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/staff/addStaff" method="post">
        员工Id：<input type="text" name="StaffId"><br><br><br>
        员工姓名：<input type="text" name="StaffName"><br><br><br>
        员工年龄：<input type="text" name="StaffAge"><br><br><br>
        员工性别：<input type="text" name="StaffSex"><br><br><br>
        政治面貌：<input type="text" name="StaffPolitical"><br><br><br>
        员工职位：<input type="text" name="StaffPosition"><br><br><br>
        员工部门：<input type="text" name="StaffDepartment"><br><br><br>
        员工地址：<input type="text" name="StaffAddress"><br><br><br>
        入职时间：<input type="text" name="HireDate"><br><br><br>
        工龄：<input type="text" name="WorkingYears"><br><br><br>
        <input type="submit" value="添加">
    </form>

</div>