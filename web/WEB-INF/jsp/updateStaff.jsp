<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改信息</title>
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
                    <small>修改信息</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/staff/updateStaff" method="post">
        <input type="hidden" name="StaffId" value="${staff.getStaffId()}"/>
        员工姓名：<input type="text" name="StaffName" value="${staff.getStaffName()}"><br><br>
        员工年龄：<input type="text" name="StaffAge" value="${staff.getStaffAge()}"><br><br>
        员工性别：<input type="text" name="StaffSex" value="${staff.getStaffSex()}"><br><br>
        政治面貌：<input type="text" name="StaffPolitical" value="${staff.getStaffPolitical()}"><br><br>
        员工职位：<input type="text" name="StaffPosition" value="${staff.getStaffPosition()}"><br><br>
        员工部门：<input type="text" name="StaffDepartment" value="${staff.getStaffDepartment()}"><br><br>
        员工地址：<input type="text" name="StaffAddress" value="${staff.getStaffAddress()}"><br><br>
        入职时间：<input type="text" name="HireDate" value="${staff.getHireDate()}"><br><br>
        工龄：<input type="text" name="WorkingYears" value="${staff.getWorkingYears()}"><br><br>
        <input type="submit" value="提交"/>
    </form>

</div>
</body>
</html>
