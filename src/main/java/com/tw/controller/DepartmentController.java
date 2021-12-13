package com.tw.controller;

import com.tw.pojo.Department;
import com.tw.pojo.Page;
import com.tw.pojo.Staff;
import com.tw.service.DepartmentService;
import com.tw.service.StaffService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author why099
 */
@Controller
@RequestMapping("/department")
public class DepartmentController {

    @Qualifier("departmentServiceImpl")
    private final DepartmentService departmentService;

    private final StaffService staffService;

    public DepartmentController(DepartmentService departmentService, StaffService staffService) {
        this.departmentService = departmentService;
        this.staffService = staffService;
    }

    @RequestMapping("/allDepartment")
    public String list(Model model) {
        List<Department> list = departmentService.queryAllDepartment();
        for (Department department : list) {
            System.out.println(department);
        }
        model.addAttribute("list", list);
        return "DepartmentPage";
    }

    @RequestMapping("/toAddDepartment")
    public String toAddPaper() {
        return "addDepartment";
    }

    @RequestMapping("/addDepartment")
    public String addPaper(Department department) {
        System.out.println(department);
        departmentService.addDepartment(department);
        return "redirect:/department/department_list";
    }

    @RequestMapping("/toUpdateDepartment")
    public String toUpdateDepartment(Model model, String departmentId) {
        Department department = departmentService.queryDepartmentByDepartmentId(departmentId);
        System.out.println(department);
        model.addAttribute("department", department);
        return "updateDepartment";
    }

    @RequestMapping("/updateDepartment")
    public String updateBook(Model model, Department departments) {
        System.out.println(departments);
        departmentService.updateDepartment(departments);
        Department department = departmentService.queryDepartmentByDepartmentId(departments.getDepartmentId());
        model.addAttribute("department", department);
        return "redirect:/department/department_list";
    }

    @RequestMapping("/toDeleteDepartment/{departmentId}")
    public String deleteDepartment(@PathVariable("departmentId") String departmentId) {
        departmentService.deleteDepartmentByDepartmentId(departmentId);
        System.out.println("删除成功！");
        return "redirect:/department/department_list";
    }

    @RequestMapping("department_list")
    public String list(Model model, Page page) {
        List<Staff> list = departmentService.list(page);
        int total = staffService.total();
        page.setTotal(total);
        model.addAttribute("listDepartment", list);
        model.addAttribute("pageDepartment", page);
        System.out.println(page);
        for (Staff department : list) {
            System.out.println(department);
        }
        return "DepartmentPage";
    }
}
