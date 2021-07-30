package com.example.controller;

import java.security.Principal;


import com.example.model.entity.AppUser;
import com.example.model.entity.UserRole;
import com.example.model.service.UserDetailsServiceImpl;
import com.example.util.EncrytedPasswordUtils;
import com.example.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @Autowired
    UserDetailsServiceImpl userDetailsService;
    @RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
    public String welcomePage(Model model) {
        model.addAttribute("title", "Welcome");
        model.addAttribute("message", "This is welcome page!");
        return "welcomePage";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage(Model model, Principal principal) {

        User loginedUser = (User) ((Authentication) principal).getPrincipal();

        String userInfo = WebUtils.toString(loginedUser);
        model.addAttribute("userInfo", userInfo);

        return "adminPage";
    }
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
        return "login";
    }

    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title", "Logout");
        return "redirect:/login";
    }

    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String userInfo(Model model, Principal principal) {

        // Sau khi user login thanh cong se co principal
        String userName = principal.getName();

        System.out.println("User Name: " + userName);

        User loginedUser = (User) ((Authentication) principal).getPrincipal();

        String userInfo = WebUtils.toString(loginedUser);
        model.addAttribute("userInfo", userInfo);

        return "userInfoPage";
    }

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

}
