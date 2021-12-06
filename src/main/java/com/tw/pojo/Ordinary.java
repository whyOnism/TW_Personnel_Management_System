package com.tw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ordinary {

    private String UserId;
    private String UserName;
    private String Password;

    public Ordinary(String userName, String password) {
        UserName = userName;
        Password = password;
    }
}
