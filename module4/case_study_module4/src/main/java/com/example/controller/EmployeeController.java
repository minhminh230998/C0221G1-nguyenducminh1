package com.example.controller;

import com.example.config.WebSecurityConfig;
import com.example.dto.employee.AppUserDto;
import com.example.dto.employee.EmployeeDto;

import com.example.model.entity.employee.AppUser;
import com.example.model.entity.employee.Employee;

import com.example.model.service.IEmployeeService;
import com.example.model.service.impl.UserDetailsServiceImpl;
import com.example.util.EncrytedPasswordUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping(value = "employee")
public class EmployeeController {
    @Autowired
    IEmployeeService iEmployeeService;
    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @GetMapping(value = "/list")
    public String showListEmployee(Model model, @PageableDefault(size = 3) Pageable pageable,
                                   @RequestParam Optional<String> name) {

        String names="";
        if(name.isPresent()){
            names = name.get();
        }
        Page<Employee> employees = iEmployeeService.findByNameEmployee(names,pageable);
        model.addAttribute("employees", employees);
        model.addAttribute("names", names);
        return "/employee/list-employee";
    }

    @GetMapping(value = "/create")
    public String ShowFormCreateEmployee(Model model) {
        model.addAttribute("employeeDto", new EmployeeDto());
        model.addAttribute("appUserDto", new AppUserDto());
        model.addAttribute("positionList",iEmployeeService.findAllPosition());
        model.addAttribute("divisionList",iEmployeeService.findAllDivision());
        model.addAttribute("educationDegreeList",iEmployeeService.findAllEducationDegree());
        model.addAttribute("userAppUser",iEmployeeService.findAllEducationDegree());
        return "/employee/create-employee";
    }

    @PostMapping(value = "/create")
    public String createEmployee(@ModelAttribute @Valid EmployeeDto employeeDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("positionList",iEmployeeService.findAllPosition());
            model.addAttribute("divisionList",iEmployeeService.findAllDivision());
            model.addAttribute("educationDegreeList",userDetailsService.findAllAppUser());
            return "/employee/create-employee";
        }
        Employee employee=new Employee();
        AppUser appUser=new AppUser();
        BeanUtils.copyProperties(employeeDto,employee);

        appUser.setEncrytedPassword(EncrytedPasswordUtils.encrytePassword(employee.getAppUser().getEncrytedPassword()));
        appUser.setUserName(employee.getAppUser().getUserName());
        userDetailsService.addAppUser(appUser);
        employee.setAppUser(appUser);
        iEmployeeService.saveEmployee(employee);
        redirectAttributes.addFlashAttribute("message", "Update employee successfully!");
        return "redirect:/employee/list";
    }

    @GetMapping(value = "/update")
    public String showFormUpdateEmployee(@RequestParam Integer id, Model model){
        Employee employee=iEmployeeService.findByIdEmployee(id);

        EmployeeDto employeeDto=new EmployeeDto();
        BeanUtils.copyProperties(employee,employeeDto);
        model.addAttribute("employeeDto",employeeDto);
        model.addAttribute("positionList",iEmployeeService.findAllPosition());
        model.addAttribute("divisionList",iEmployeeService.findAllDivision());
        model.addAttribute("educationDegreeList",iEmployeeService.findAllEducationDegree());
        return "/employee/update-employee";
    }
    @PostMapping(value = "/update")
    public String updateEmployee(@ModelAttribute @Valid EmployeeDto employeeDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("positionList",iEmployeeService.findAllPosition());
            model.addAttribute("divisionList",iEmployeeService.findAllDivision());
            model.addAttribute("educationDegreeList",iEmployeeService.findAllEducationDegree());

            return "/employee/create-employee";
        }
        Employee employee=new Employee();

        BeanUtils.copyProperties(employeeDto,employee);
        iEmployeeService.saveEmployee(employee);
        redirectAttributes.addFlashAttribute("message", "Update employee successfully!");
        return "redirect:/employee/list";
    }
    @GetMapping(value = "/updateUser")
    public String showFormUpdateUser(@RequestParam Integer id, Model model){
        Employee employee=iEmployeeService.findByIdEmployee(id);
        AppUser appUser=userDetailsService.findByIdAppUser(employee.getAppUser().getUserId());
        model.addAttribute("appUser",appUser);
        return "/employee/update-user";
    }
    @PostMapping(value = "/updateUser")
    public String updateUser(@ModelAttribute  AppUser appUser, RedirectAttributes redirectAttributes, Model model){

        appUser.setEncrytedPassword(EncrytedPasswordUtils.encrytePassword(appUser.getEncrytedPassword()));
        userDetailsService.addAppUser1(appUser);
        redirectAttributes.addFlashAttribute("message", "Update employee successfully!");
        return "redirect:/employee/list";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam Integer idCustomer){
        iEmployeeService.deleteEmployee(idCustomer);
        return "redirect:/employee/list";
    }

}
