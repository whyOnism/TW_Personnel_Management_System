package com.tw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 员工类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Staff {

    private static final long serialVersionUID = 1L;

    private String StaffId;
    private String StaffName;
    private int StaffAge;
    private String StaffSex;
    private String StaffPolitical;
    private String StaffPosition;
    private String DepartmentId;
    private String DepartmentName;
    private String StaffAddress;
    private String HireDate;
    private int WorkingYears;

}
