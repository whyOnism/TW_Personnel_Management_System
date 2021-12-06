package com.tw.service.impl;

import com.tw.dao.AgreementMapper;
import com.tw.pojo.Agreement;
import com.tw.service.AgreementService;

import java.util.List;

public class AgreementServiceImpl implements AgreementService {

    private AgreementMapper agreementMapper;

    public AgreementMapper getAgreementMapper() {
        return agreementMapper;
    }

    public void setAgreementMapper(AgreementMapper agreementMapper) {
        this.agreementMapper = agreementMapper;
    }

    @Override
    public List<Agreement> findAgreement(String AgreementName) {
        return agreementMapper.findAgreement(AgreementName);
    }

    @Override
    public boolean addAgreement(Agreement agreement) {
        return agreementMapper.addAgreement(agreement);
    }

    @Override
    public boolean deleteAgreement(String AgreementId) {
        return agreementMapper.deleteAgreement(AgreementId);
    }

    @Override
    public boolean updateAgreement(Agreement agreement) {
        return agreementMapper.updateAgreement(agreement);
    }

    @Override
    public List<Agreement> queryAllAgreement() {
        return agreementMapper.queryAllAgreement();
    }
}
