package com.tw.service;

import com.tw.pojo.Department;
import com.tw.pojo.Page;
import com.tw.pojo.Staff;

import java.util.List;

public interface DepartmentService {
    //  增加一个部门
    boolean addDepartment(Department department);

    //  删除一个部门
    boolean deleteDepartmentByDepartmentId(String DepartmentId);

    //  更新部门信息
    boolean updateDepartment(Department department);

    //  根据DepartmentId查询,返回一个部门
    Department queryDepartmentByDepartmentId(String DepartmentId);

    //  查询所有部门信息
    List<Department> queryAllDepartment();

    //分页
    List<Staff> list(Page page);

    int total();
}
