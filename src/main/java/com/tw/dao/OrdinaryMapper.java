package com.tw.dao;

import com.tw.pojo.Ordinary;

/**
 * @author why099
 */
public interface OrdinaryMapper {
    //判断用户是否存在
    Ordinary selectUserByUserNameExist(String username);

    //选择用户
    Ordinary selectUserByUserNameCheck(Ordinary ordinary);

    //增加一个用户
    boolean addUser(Ordinary ordinary);
}
