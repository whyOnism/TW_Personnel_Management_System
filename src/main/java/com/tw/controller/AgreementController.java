package com.tw.controller;

import com.tw.service.AgreementService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author why099
 */
@Controller
@RequestMapping("/agreement")
public class AgreementController {

    @Qualifier("agreementServiceImpl")
    private final AgreementService agreementService;

    public AgreementController(AgreementService agreementService) {
        this.agreementService = agreementService;
    }
}
