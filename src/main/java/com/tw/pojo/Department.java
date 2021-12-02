package com.tw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private String DepartmentId;
    private Staff StaffId;
    private String DepartmentName;
}
