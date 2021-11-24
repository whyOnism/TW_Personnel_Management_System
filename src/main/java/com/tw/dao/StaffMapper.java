package com.tw.dao;

import com.tw.pojo.Staff;

import java.util.List;

public interface StaffMapper {
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


}
