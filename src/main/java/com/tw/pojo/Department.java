package com.tw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 部门类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private static final long serialVersionUID = 1L;

    private String DepartmentId;
    private String DepartmentName;

    private List<Staff> staffList;
}
