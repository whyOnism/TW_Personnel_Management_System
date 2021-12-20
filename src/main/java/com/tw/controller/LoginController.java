package com.tw.controller;

import com.tw.pojo.Page;
import com.tw.service.DepartmentService;
import com.tw.service.StaffService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author why099
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Qualifier("staffServiceImpl")
    private final StaffService staffService;

    private final DepartmentService departmentService;

    public LoginController(StaffService staffService, DepartmentService departmentService) {
        this.staffService = staffService;
        this.departmentService = departmentService;
    }

    @RequestMapping("/loginPage")
    public String turnToLoginPage() {
        return "login";
    }

    @RequestMapping("/verification")
    public String verificationUserType(HttpSession session, String userType,
                                       String username, String password, Page page) {
        System.out.println(username + " " + password);
        session.setAttribute("userType", userType);
        session.setAttribute("username", username);
        session.setAttribute("password", password);
        if ("Admin".equals(userType)) {
            int total = staffService.total();
            page.setTotal(total);
            System.out.println(total);
            session.setAttribute("staffNumber", total);
            total = departmentService.total();
            session.setAttribute("departmentNumber", total);
            int technology, sales, logistics;
            technology = departmentService.totalRespectively("D001");
            sales = departmentService.totalRespectively("D002");
            logistics = departmentService.totalRespectively("D003");
            System.out.println(technology + " " + sales + " " + logistics);
            session.setAttribute("technology", technology);
            session.setAttribute("sales", sales);
            session.setAttribute("logistics", logistics);
            return "redirect:/admin/login";
        }
        if ("Ordinary".equals(userType)) {
            int total = staffService.total();
            page.setTotal(total);
            System.out.println(total);
            session.setAttribute("staffNumber", total);
            total = departmentService.total();
            session.setAttribute("departmentNumber", total);
            int technology, sales, logistics;
            technology = departmentService.totalRespectively("D001");
            sales = departmentService.totalRespectively("D002");
            logistics = departmentService.totalRespectively("D003");
            System.out.println(technology + " " + sales + " " + logistics);
            session.setAttribute("technology", technology);
            session.setAttribute("sales", sales);
            session.setAttribute("logistics", logistics);
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
