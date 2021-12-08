package com.tw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author why099
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
    @RequestMapping("/registerPage")
    public String turnToRegisterPage() {
        return "register";
    }
}
