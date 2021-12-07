package com.tw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/loginPage")
    public String turnToLoginPage() {
        return "login";
    }

    @RequestMapping("/verification")
    public String VerificationUserType(HttpSession session, String userType, String username, String password) {
        System.out.println(username + " " + password);
        session.setAttribute("userType", userType);
        session.setAttribute("username", username);
        session.setAttribute("password", password);
        if (userType.equals("Admin")) {
            return "redirect:/admin/login";
        }
        if (userType.equals("Ordinary")) {
            return "redirect:/user/login";
        }
        return "login";
    }
}
