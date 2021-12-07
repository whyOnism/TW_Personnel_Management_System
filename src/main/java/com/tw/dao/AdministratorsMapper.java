package com.tw.dao;

import com.tw.pojo.Administrators;

public interface AdministratorsMapper {
    //判断用户是否存在
    Administrators selectAdminByAdminUserNameExist(String AdminUserName);

    //选择用户
    Administrators selectAdminByAdminUserNameCheck(Administrators administrators);
}
