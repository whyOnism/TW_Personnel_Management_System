package com.tw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Administrators {

    private String AdminId;
    private String AdminUserName;
    private String AdminPassword;

    public Administrators(String adminUserName, String adminPassword) {
        AdminUserName = adminUserName;
        AdminPassword = adminPassword;
    }
}
