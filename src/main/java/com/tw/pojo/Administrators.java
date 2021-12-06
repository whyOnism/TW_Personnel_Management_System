package com.tw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 管理员账号类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Administrators {

    private static final long serialVersionUID = 1L;

    private String AdminId;
    private String AdminUserName;
    private String AdminPassword;

    public Administrators(String adminUserName, String adminPassword) {
        AdminUserName = adminUserName;
        AdminPassword = adminPassword;
    }
}
