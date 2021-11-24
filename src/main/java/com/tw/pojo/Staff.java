package com.tw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {

    private String StaffId;
    private String StaffName;
    private int StaffAge;
    private String StaffSex;
    private String StaffPolitical;
    private String StaffPosition;
    private String StaffDepartment;
    private String StaffAddress;
    private String HireDate;
    private int WorkingYears;

}
