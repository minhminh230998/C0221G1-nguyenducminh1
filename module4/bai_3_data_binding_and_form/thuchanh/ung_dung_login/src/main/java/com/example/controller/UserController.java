package com.example.controller;


import com.example.model.bean.Login;
import com.example.model.bean.User;
import com.example.model.service.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping(value = {"/","/home"})
    public String home(Model  model) {
        model.addAttribute("login",new Login());
        return "home";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute("login") Login login,Model model){
        User user = UserDao.checkLogin(login);
        if(user == null){
           return "error";
        } else {
            ModelAndView modelAndView = new ModelAndView("user");
            model.addAttribute("user", user);
            return "user";
        }
    }

}
