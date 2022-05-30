package com.cgal.swiftsandesh.controller;

import com.cgal.swiftsandesh.domain.Employee;
import com.cgal.swiftsandesh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

//    @GetMapping("/")
//    public String viewHomePage(Model model){
//        var reactiveDataDrivenMode =
//                new ReactiveDataDriverContextVariable(employeeService.getEmployees(), 1);
//        Model allEmpList = model.addAttribute("allEmpList", reactiveDataDrivenMode);
//        return "index";
//    }

    @PostMapping("/convert")
    public String convert(Model model){
//        var reactiveDataDrivenMode =
//                new ReactiveDataDriverContextVariable(employeeService.getEmployees(), 1);
//        Model allEmpList = model.addAttribute("allEmpList", reactiveDataDrivenMode);
            return "convert";
    }


}
