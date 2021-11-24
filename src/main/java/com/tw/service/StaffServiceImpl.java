package com.tw.service;

import com.tw.dao.StaffMapper;
import com.tw.pojo.Staff;

import java.util.List;

public class StaffServiceImpl implements StaffService {
    private StaffMapper staffMapper;

    public void setStaffMapper(StaffMapper staffMapper) {
        this.staffMapper = staffMapper;
    }

    @Override
    public boolean addStaff(Staff staff) {
        return staffMapper.addStaff(staff);
    }

    @Override
    public boolean deleteStaffByStaffId(String StaffId) {
        return staffMapper.deleteStaffByStaffId(StaffId);
    }

    @Override
    public boolean updateStaff(Staff staff) {
        return staffMapper.updateStaff(staff);
    }

    @Override
    public Staff queryStaffByStaffId(String StaffId) {
        return staffMapper.queryStaffByStaffId(StaffId);
    }

    @Override
    public List<Staff> queryAllStaff() {
        return staffMapper.queryAllStaff();
    }
}
