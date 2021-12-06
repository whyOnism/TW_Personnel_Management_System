package com.tw.controller;

import com.tw.pojo.Administrators;
import com.tw.service.AdministratorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
@RequestMapping("/admin")
public class AdministratorsController {

    @Autowired
    @Qualifier("administratorsServiceImpl")
    private AdministratorsService administratorsService;

    @RequestMapping("/login")
    @ResponseBody
    public HashMap<String, Object> login(Administrators administrators, HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("name", administrators.getAdminUserName());

        HashMap<String, Object> map = new HashMap<>();
        if (administratorsService.selectAdminByAdminUserNameExist(administrators.getAdminUserName())) {
            System.out.println("账号正确！");
            if (administratorsService.selectAdminByAdminUserNameCheck(administrators)) {
                System.out.println("密码正确！");
                map.put("status", 200);
            } else {
                System.out.println("密码错误！");
                map.put("status", 500);
            }
        } else {
            System.out.println("账号错误！");
            map.put("status", 500);
        }
        return map;
    }
}
