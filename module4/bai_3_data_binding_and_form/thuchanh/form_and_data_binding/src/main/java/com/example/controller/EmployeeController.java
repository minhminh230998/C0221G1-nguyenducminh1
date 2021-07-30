package com.example.controller;

import com.example.model.bean.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.jws.WebParam;

@Controller
public class EmployeeController {
    @GetMapping
    public String showForm(ModelMap model) {
        model.addAttribute("employee", new Employee());
        return "employee/create";
    }
    @PostMapping(value = "addEmployee")
    public String Save(@ModelAttribute("employee" ) Employee employee, Model model){
        model.addAttribute("name",employee.getName());
        model.addAttribute("id",employee.getId());
        model.addAttribute("contactNumber",employee.getContactNumber());
        return "employee/create";
    }
}
