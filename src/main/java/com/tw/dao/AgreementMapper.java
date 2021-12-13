package com.tw.dao;

import com.tw.pojo.Agreement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author why099
 */
public interface AgreementMapper {
    /**
     * 查询指定合同
     *
     * @param AgreementName
     * @return list
     */
    List<Agreement> findAgreement(@Param("AgreementName") String AgreementName);

    /**
     * 增加一个合同
     *
     * @param agreement
     * @return boolean
     */
    boolean addAgreement(Agreement agreement);

    /**
     * 删除一个合同
     *
     * @param AgreementId
     * @return boolean
     */
    boolean deleteAgreement(String AgreementId);

    /**
     * 更新合同信息
     *
     * @param agreement
     * @return boolean
     */
    boolean updateAgreement(Agreement agreement);

    /**
     * 查询所有合同信息
     *
     * @return list
     */
    List<Agreement> queryAllAgreement();


}
