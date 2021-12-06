package com.tw.dao;

import com.tw.pojo.Agreement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AgreementMapper {

    //  查询指定部门
    List<Agreement> findAgreement(@Param("AgreementName") String AgreementName);

    //  增加一个部门
    boolean addAgreement(Agreement agreement);

    //  删除一个部门
    boolean deleteAgreement(String AgreementId);

    //  更新部门信息
    boolean updateAgreement(Agreement agreement);

    //  查询所有部门信息
    List<Agreement> queryAllAgreement();


}
