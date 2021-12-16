package com.tw.controller;

import com.tw.pojo.Ordinary;
import com.tw.service.OrdinaryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author why099
 */
@Controller
@RequestMapping("/register")
public class RegisterController {

    private final OrdinaryService ordinaryService;

    public RegisterController(OrdinaryService ordinaryService) {
        this.ordinaryService = ordinaryService;
    }

    @RequestMapping("/registerPage")
    public String turnToRegisterPage() {
        return "register";
    }

    @RequestMapping("/verification")
    public String verificationUserType(HttpSession session,
                                       String username, String password) {
        System.out.println(username + " " + password);
        session.setAttribute("username", username);
        session.setAttribute("password", password);
        Ordinary ordinary = new Ordinary(username, password);
        List<Ordinary> ordinaryList = ordinaryService.queryUser();
        for (Ordinary ordinary1 : ordinaryList) {
            System.out.println(ordinary1);
        }
        ordinaryService.addUser(ordinary);
        return "redirect:/login/loginPage";
    }
}
