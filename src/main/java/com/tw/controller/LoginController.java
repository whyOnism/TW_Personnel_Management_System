package com.tw.controller;

import com.tw.pojo.Page;
import com.tw.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    @Qualifier("staffServiceImpl")
    private StaffService staffService;

    @RequestMapping("/loginPage")
    public String turnToLoginPage() {
        return "login";
    }

    @RequestMapping("/verification")
    public String VerificationUserType(HttpSession session, String userType,
                                       String username, String password, Page page) {
        System.out.println(username + " " + password);
        session.setAttribute("userType", userType);
        session.setAttribute("username", username);
        session.setAttribute("password", password);
        if (userType.equals("Admin")) {
            int total = staffService.total();
            page.setTotal(total);
            System.out.println(total);
            session.setAttribute("staffNumber", total);
            return "redirect:/admin/login";
        }
        if (userType.equals("Ordinary")) {
            return "redirect:/user/login";
        }
        return "login";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "index";
    }
}
