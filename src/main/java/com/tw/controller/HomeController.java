package com.tw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author why099 2021/12/14
 */
@Controller
@RequestMapping("/toHome")
public class HomeController {
    @RequestMapping("/homePage")
    public String toHomePage() {
        return "home";
    }
}
