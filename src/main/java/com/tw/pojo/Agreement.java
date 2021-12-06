package com.tw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * 员工合同类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Agreement {

    private static final long serialVersionUID = 1L;

    //合同id
    private String AgreementId;
    //员工id
    private String StaffId;
    //合同生效时间
    private Date AgreementLife;
    //合同具体内容
    private String AgreementContext;
    //员工信息
    private Staff staff;
}
