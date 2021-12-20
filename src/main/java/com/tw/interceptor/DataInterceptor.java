package com.tw.interceptor;

import com.tw.service.DepartmentService;
import com.tw.service.StaffService;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author why099 2021/12/20
 */
public class DataInterceptor implements HandlerInterceptor {
    private final StaffService staffService;
    private final DepartmentService departmentService;

    public DataInterceptor(StaffService staffService, DepartmentService departmentService) {
        this.staffService = staffService;
        this.departmentService = departmentService;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        int technology, sales, logistics;
        technology = departmentService.totalRespectively("D001");
        sales = departmentService.totalRespectively("D002");
        logistics = departmentService.totalRespectively("D003");
        System.out.println(technology + " " + sales + " " + logistics);
        session.setAttribute("technology", technology);
        session.setAttribute("sales", sales);
        session.setAttribute("logistics", logistics);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("------处理请求后-------");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("---------清理---------");
    }
}
