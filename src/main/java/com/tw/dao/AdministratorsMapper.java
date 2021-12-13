package com.tw.dao;

import com.tw.pojo.Administrators;

/**
 * @author why099
 */
public interface AdministratorsMapper {
    /**
     * 判断用户是否存在
     *
     * @param AdminUserName
     * @return Administrators
     */
    Administrators selectAdminByAdminUserNameExist(String AdminUserName);

    /**
     * 选择用户
     *
     * @param administrators
     * @return Administrators
     */
    Administrators selectAdminByAdminUserNameCheck(Administrators administrators);
}
