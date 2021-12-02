package com.tw.service;

import com.tw.dao.DepartmentMapper;
import com.tw.pojo.Department;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentMapper departmentMapper;

    @Override
    public boolean addDepartment(Department department) {
        return departmentMapper.addDepartment(department);
    }

    @Override
    public boolean deleteDepartmentByDepartmentId(String DepartmentId) {
        return departmentMapper.deleteDepartmentByDepartmentId(DepartmentId);
    }

    @Override
    public boolean updateDepartment(Department department) {
        return departmentMapper.updateDepartment(department);
    }

    @Override
    public Department queryDepartmentByDepartmentId(String DepartmentId) {
        return departmentMapper.queryDepartmentByDepartmentId(DepartmentId);
    }

    @Override
    public List<Department> queryAllDepartment() {
        return departmentMapper.queryAllDepartment();
    }
}
