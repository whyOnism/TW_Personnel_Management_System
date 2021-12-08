package com.tw.service.impl;

import com.tw.dao.StaffMapper;
import com.tw.pojo.Page;
import com.tw.pojo.Staff;
import com.tw.service.StaffService;

import java.util.List;
import java.util.Map;

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

    @Override
    public List<Staff> queryStaffLikeSurname(Map<String, Object> map) {
        return staffMapper.queryStaffLikeSurname(map);
    }

    @Override
    public List<Staff> list(Page page) {
        return staffMapper.list(page);
    }

    @Override
    public int total() {
        return staffMapper.total();
    }
}
