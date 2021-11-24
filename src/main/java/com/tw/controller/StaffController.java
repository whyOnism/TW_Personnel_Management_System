package com.tw.controller;

import com.tw.pojo.Staff;
import com.tw.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {
    private StaffService staffService;

    @RequestMapping("/allStaff")
    public String list(Model model) {
        List<Staff> list = staffService.queryAllStaff();
        model.addAttribute("list", list);
        return "allStaff";
    }
}
