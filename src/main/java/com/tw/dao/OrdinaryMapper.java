package com.tw.dao;

import com.tw.pojo.Ordinary;

public interface OrdinaryMapper {
    //判断用户是否存在
    Ordinary selectUserByUserNameExist(String username);

    //选择用户
    Ordinary selectUserByUserNameCheck(Ordinary ordinary);
}
