package com.example.controller;


import com.example.model.entity.employee.AppUser;
import com.example.model.entity.employee.Employee;
import com.example.model.entity.employee.UserRole;
import com.example.model.service.IEmployeeService;
import com.example.model.service.impl.UserDetailsServiceImpl;
import com.example.util.EncrytedPasswordUtils;
import com.example.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class MainController {
    @Autowired
    UserDetailsServiceImpl userDetailsService;
    @Autowired
    IEmployeeService iEmployeeService;


    @GetMapping("/createUser")
    public String formCreateUser(Model model){
        model.addAttribute("appUser",new AppUser());
        model.addAttribute("listAppRole",userDetailsService.findAllAppRole());

        return "/create";
    }
    @PostMapping("/create_appUser")
    public ModelAndView saveAppAdmin(@ModelAttribute AppUser appUser,@RequestParam Long roleID) {

        appUser.setEncrytedPassword(EncrytedPasswordUtils.encrytePassword(appUser.getEncrytedPassword()));
        userDetailsService.addAppUser(appUser);
        UserRole userRole=new UserRole(appUser,userDetailsService.findByIdAppRole(roleID));
        userDetailsService.addUserRole(userRole);
        ModelAndView modelAndView = new ModelAndView("/login");
        return modelAndView;
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model) {
//        model.addAttribute("employee",iEmployeeService.findByUser());
        return "login";
    }


    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title", "Logout");
        return "redirect:/login";
    }

//    @RequestMapping(value = "/home", method = RequestMethod.GET)
//    public String userInfo(Model model, Principal principal) {
//
//        // Sau khi user login thanh cong se co principal
//
//
//        User loginedUser = (User) ((Authentication) principal).getPrincipal();
//        loginedUser.getUsername();
//        String userInfo = loginedUser.getUsername();
//        AppUser appUser=userDetailsService.findByName(userInfo);
//        Employee employee=iEmployeeService.findByUser(appUser.getUserId());
//
//        model.addAttribute("employee", employee);
//
//        return "/home";
//    }
//    @GetMapping(value = {"","/home"})
//    public String showHome(Model model, Principal principal){
//        Employee userName = iEmployeeService.findByUser(principal.getName());
//
//        System.out.println("User Name: " + userName);
//
//        User loginedUser = (User) ((Authentication) principal).getPrincipal();
//
//        String userInfo = WebUtils.toString(loginedUser);
//        model.addAttribute("userInfo", userInfo);
//        return "/home";
//    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied(Model model, Principal principal) {

        if (principal != null) {
            User loginedUser = (User) ((Authentication) principal).getPrincipal();

            String userInfo = WebUtils.toString(loginedUser);

            model.addAttribute("userInfo", userInfo);

            String message = "Hi " + principal.getName() //
                    + "<br> You do not have permission to access this page!";
            model.addAttribute("message", message);

        }

        return "403Page";
    }
//    @GetMapping
//    public String findByUserEmployee(){
//
//        return "header";
//    }

}
