package com.tw.service;

import com.tw.pojo.Administrators;

public interface AdministratorsService {
    //判断用户是否存在
    boolean selectAdminByAdminUserNameExist(String AdminUserName);

    //选择用户
    boolean selectAdminByAdminUserNameCheck(Administrators administrators);
}
