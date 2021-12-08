package com.tw.controller;

import com.tw.pojo.Page;
import com.tw.pojo.Staff;
import com.tw.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    @Qualifier("staffServiceImpl")
    private StaffService staffService;

    @RequestMapping("/allStaff")
    public String list() {
        return "StaffPage";
    }

    @RequestMapping("/toAddStaff")
    public String toAddPaper() {
        return "addStaff";
    }

    @RequestMapping("/addStaff")
    public String addPaper(Staff staff) {
        System.out.println(staff);
        staffService.addStaff(staff);
        return "redirect:/staff/allStaff";
    }

    @RequestMapping("/toUpdateStaff")
    public String toUpdateStaff(Model model, String staffId) {
        Staff staff = staffService.queryStaffByStaffId(staffId);
        System.out.println(staff);
        model.addAttribute("staff", staff);
        return "updateStaff";
    }

    @RequestMapping("/updateStaff")
    public String updateStaff(Model model, Staff staffs) {
        System.out.println(staffs);
        staffService.updateStaff(staffs);
        Staff staff = staffService.queryStaffByStaffId(staffs.getStaffId());
        model.addAttribute("staff", staff);
        return "redirect:/staff/allStaff";
    }

    @RequestMapping("/toDeleteStaff/{staffId}")
    public String deleteStaff(@PathVariable("staffId") String staffId) {
        staffService.deleteStaffByStaffId(staffId);
        System.out.println("删除成功！");
        return "redirect:/staff/allStaff";
    }

    @RequestMapping("staff_list")
    public String list(Model model, Page page) {
        List<Staff> list = staffService.list(page);
        int total = staffService.total();
        page.setTotal(total);
        model.addAttribute("list", list);
        model.addAttribute("page", page);
        System.out.println(page);
        for (Staff staff : list) {
            System.out.println(staff);
        }
        return "StaffPage";
    }
}
