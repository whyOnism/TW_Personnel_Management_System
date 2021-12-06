package com.tw.service;

import com.tw.pojo.Ordinary;

public interface OrdinaryService {
    //判断用户是否存在
    boolean selectUserByUserNameExist(String username);

    //选择用户
    boolean selectUserByUserNameCheck(Ordinary ordinary);
}
