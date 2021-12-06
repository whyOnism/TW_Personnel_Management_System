package com.tw.service.impl;

import com.tw.dao.OrdinaryMapper;
import com.tw.pojo.Ordinary;
import com.tw.service.OrdinaryService;

public class OrdinaryServiceImpl implements OrdinaryService {

    private OrdinaryMapper ordinaryMapper;

    public OrdinaryMapper getOrdinaryMapper() {
        return ordinaryMapper;
    }

    public void setOrdinaryMapper(OrdinaryMapper ordinaryMapper) {
        this.ordinaryMapper = ordinaryMapper;
    }

    @Override
    public boolean selectUserByUserNameExist(String username) {
        Ordinary exist = ordinaryMapper.selectUserByUserNameExist(username);
        if (exist != null) {
            System.out.println(exist);
            return true;
        }
        return false;
    }

    @Override
    public boolean selectUserByUserNameCheck(Ordinary ordinary) {
        Ordinary check = ordinaryMapper.selectUserByUserNameCheck(ordinary);
        return check != null;
    }
}
