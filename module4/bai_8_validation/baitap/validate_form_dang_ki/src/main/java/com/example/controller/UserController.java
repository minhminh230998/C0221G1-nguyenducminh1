package com.example.controller;

import com.example.dto.UserDto;
import com.example.model.entity.User;
import com.example.model.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    IUserService iUserService;
    @GetMapping(value = {"","/user"})
    public String formCreateUser(Model model){
        model.addAttribute("userDto",new UserDto());
        return "/create";
    }
    @PostMapping(value = "/create")
    public String createUser(@ModelAttribute @Valid UserDto userDto, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "/create";
        }
        User user=new User();
        BeanUtils.copyProperties(userDto,user);
        iUserService.save(user);
        model.addAttribute("message","success");
        return "/create";
    }
}
