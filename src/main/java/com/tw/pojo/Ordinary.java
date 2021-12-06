package com.tw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 普通用户类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ordinary {

    private static final long serialVersionUID = 1L;

    private String UserId;
    private String UserName;
    private String Password;

    public Ordinary(String userName, String password) {
        UserName = userName;
        Password = password;
    }
}
