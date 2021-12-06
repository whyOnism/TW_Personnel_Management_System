package com.tw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/loginPage")
    public String turnToLoginPage() {
        return "login";
    }

    @RequestMapping("/verification")
    public String VerificationUserType(@RequestParam("userType") String userType) {
        if (userType == "Admin")
            return "redirect:/admin/login";
        if (userType == "Ordinary")
            return "redirect:/user/login";
        return "login";
    }
}
