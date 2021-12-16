package com.tw.service.impl;

import com.tw.dao.OrdinaryMapper;
import com.tw.pojo.Ordinary;
import com.tw.pojo.Page;
import com.tw.service.OrdinaryService;

import java.util.List;


/**
 * @author why099
 */
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

    @Override
    public boolean addUser(Ordinary ordinary) {
        return ordinaryMapper.addUser(ordinary);
    }

    @Override
    public List<Ordinary> queryUser() {
        return ordinaryMapper.queryUser();
    }

    @Override
    public List<Ordinary> list(Page page) {
        return ordinaryMapper.list(page);
    }

    @Override
    public int total() {
        return ordinaryMapper.total();
    }
}
