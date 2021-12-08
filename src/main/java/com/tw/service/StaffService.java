package com.tw.service;

import com.tw.pojo.Page;
import com.tw.pojo.Staff;

import java.util.List;
import java.util.Map;

public interface StaffService {

    //  增加一个员工
    boolean addStaff(Staff staff);

    //  删除一个员工
    boolean deleteStaffByStaffId(String StaffId);

    //  更新员工信息
    boolean updateStaff(Staff staff);

    //  根据StaffId查询,返回一个员工
    Staff queryStaffByStaffId(String StaffId);

    //  查询所有员工返回一个List集合
    List<Staff> queryAllStaff();

    //姓名的模糊查询
    List<Staff> queryStaffLikeSurname(Map<String, Object> map);

    //分页查询
    List<Staff> list(Page page);

    int total();
}
