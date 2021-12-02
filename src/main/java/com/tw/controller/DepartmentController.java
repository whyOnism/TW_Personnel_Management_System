package com.tw.controller;

import com.tw.pojo.Department;
import com.tw.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    @Qualifier("DepartmentServiceImpl")
    private DepartmentService departmentService;

    @RequestMapping("/allDepartment")
    public String list(Model model) {
        List<Department> list = departmentService.queryAllDepartment();
        for (Department department : list) {
            System.out.println(department);
        }
        model.addAttribute("list", list);
        return "allDepartment";
    }

    @RequestMapping("/toAddDepartment")
    public String toAddPaper() {
        return "addDepartment";
    }

    @RequestMapping("/addDepartment")
    public String addPaper(Department department) {
        System.out.println(department);
        departmentService.addDepartment(department);
        return "redirect:/department/allDepartment";
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
        return "redirect:/department/allDepartment";
    }

    @RequestMapping("/toDeleteDepartment/{departmentId}")
    public String deleteDepartment(@PathVariable("departmentId") String departmentId) {
        departmentService.deleteDepartmentByDepartmentId(departmentId);
        System.out.println("删除成功！");
        return "redirect:/department/allDepartment";
    }
}
