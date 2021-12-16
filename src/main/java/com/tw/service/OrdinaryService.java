package com.tw.service;

import com.tw.pojo.Ordinary;
import com.tw.pojo.Page;

import java.util.List;

public interface OrdinaryService {
    //判断用户是否存在
    boolean selectUserByUserNameExist(String username);

    //选择用户
    boolean selectUserByUserNameCheck(Ordinary ordinary);

    //增加一个用户
    boolean addUser(Ordinary ordinary);

    List<Ordinary> queryUser();

    List<Ordinary> list(Page page);

    int total();
}
