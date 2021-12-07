package com.tw.controller;

import com.tw.pojo.Administrators;
import com.tw.service.AdministratorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.HashMap;

@Controller
@RequestMapping("/admin")
public class AdministratorsController {

    @Autowired
    @Qualifier("administratorsServiceImpl")
    private AdministratorsService administratorsService;

    @RequestMapping("/login")
    public Serializable login(HttpSession session, String username, String password) {
        username = (String) session.getAttribute("username");
        password = (String) session.getAttribute("password");
        System.out.println(username + "" + password);
        Administrators administrators = new Administrators(username, password);
        HashMap<String, Object> map = new HashMap<>();
        System.out.println(administrators);
        if (administratorsService.selectAdminByAdminUserNameExist(administrators.getUserName())) {
            System.out.println("账号正确！");
            if (administratorsService.selectAdminByAdminUserNameCheck(administrators)) {
                System.out.println("密码正确！");
                map.put("status", 200);
                return "home";
            } else {
                System.out.println("密码错误！");
                map.put("status", 500);
                return "login";
            }
        } else {
            System.out.println("账号错误！");
            map.put("status", 500);
            return "login";
        }
    }
}
