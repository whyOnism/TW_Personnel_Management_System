package com.tw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 部门类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private static final long serialVersionUID = 1L;

    private String DepartmentId;
    private String StaffId;
    private String DepartmentName;
}
