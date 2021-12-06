package com.tw.service.impl;

import com.tw.dao.AdministratorsMapper;
import com.tw.pojo.Administrators;
import com.tw.service.AdministratorsService;

public class AdministratorsServiceImpl implements AdministratorsService {

    private AdministratorsMapper administratorsMapper;

    public AdministratorsMapper getAdministratorsMapper() {
        return administratorsMapper;
    }

    public void setAdministratorsMapper(AdministratorsMapper administratorsMapper) {
        this.administratorsMapper = administratorsMapper;
    }

    @Override
    public boolean selectAdminByAdminUserNameExist(String username) {
        Administrators exist = administratorsMapper.selectAdminByAdminUserNameExist(username);
        if (exist != null) {
            System.out.println(exist);
            return true;
        }
        return false;
    }

    @Override
    public boolean selectAdminByAdminUserNameCheck(Administrators administrators) {
        Administrators check = administratorsMapper.selectAdminByAdminUserNameCheck(administrators);
        return check != null;
    }
}
