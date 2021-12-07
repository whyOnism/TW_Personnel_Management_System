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
    private String UserName;
    private String Password;

    public Administrators(String userName, String password) {
        UserName = userName;
        Password = password;
    }
}
