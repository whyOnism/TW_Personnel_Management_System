package com.tw.controller;

import com.tw.pojo.Ordinary;
import com.tw.service.OrdinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
@RequestMapping("/user")
public class OrdinaryController {

    @Autowired
    @Qualifier("ordinaryServiceImpl")
    private OrdinaryService ordinaryService;

    @RequestMapping("/login")
    @ResponseBody
    public HashMap<String, Object> login(Ordinary ordinary, HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("name", ordinary.getUserName());

        HashMap<String, Object> map = new HashMap<>();
        if (ordinaryService.selectUserByUserNameExist(ordinary.getUserName())) {
            System.out.println("账号正确！");
            if (ordinaryService.selectUserByUserNameCheck(ordinary)) {
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
