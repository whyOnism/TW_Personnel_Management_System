package com.tw.controller;

import com.tw.pojo.Page;
import com.tw.pojo.Staff;
import com.tw.service.StaffService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author why099
 */
@Controller
@RequestMapping("/staff")
public class StaffController {

    @Qualifier("staffServiceImpl")
    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @RequestMapping("/toAddStaff")
    public String toAddPaper(HttpSession session) {
        if ("Ordinary".equals(session.getAttribute("userType"))) {
            return "redirect:/staff/staff_list";
        }
        return "addStaff";
    }

    @RequestMapping("/addStaff")
    public String addPaper(HttpSession session, Staff staff, Page page) {
        System.out.println(staff);
        staffService.addStaff(staff);
        int total = staffService.total();
        page.setTotal(total);
        System.out.println(total);
        session.setAttribute("staffNumber", total);
        return "redirect:/staff/staff_list";
    }

    @RequestMapping("/toUpdateStaff")
    public String toUpdateStaff(HttpSession session, Model model, String staffId) {
        if ("Ordinary".equals(session.getAttribute("userType"))) {
            return "redirect:/staff/staff_list";
        }
        Staff staff = staffService.queryStaffByStaffId(staffId);
        System.out.println(staff);
        model.addAttribute("oneStaff", staff);
        return "updateStaff";
    }

    @RequestMapping("/updateStaff")
    public String updateStaff(Model model, Staff staffs) {
        System.out.println(staffs);
        staffService.updateStaff(staffs);
        Staff staff = staffService.queryStaffByStaffId(staffs.getStaffId());
        model.addAttribute("oneStaff", staff);
        return "redirect:/staff/staff_list";
    }

    @RequestMapping("/toDeleteStaff/{staffId}")
    public String deleteStaff(HttpSession session, @PathVariable("staffId") String staffId) {
        if ("Ordinary".equals(session.getAttribute("userType"))) {
            return "redirect:/staff/staff_list";
        }
        staffService.deleteStaffByStaffId(staffId);
        int total = staffService.total();
        System.out.println(total);
        System.out.println("???????????????");
        session.setAttribute("staffNumber", total);
        return "redirect:/staff/staff_list";
    }

    @RequestMapping("staff_list")
    public String list(Model model, Page page) {
        List<Staff> list = staffService.list(page);
        int total = staffService.total();
        page.setTotal(total);
        model.addAttribute("listStaff", list);
        model.addAttribute("pageStaff", page);
        System.out.println(page);
        for (Staff staff : list) {
            System.out.println(staff);
        }
        return "StaffPage";
    }
}
