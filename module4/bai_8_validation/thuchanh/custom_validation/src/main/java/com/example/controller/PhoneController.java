package com.example.controller;

import com.example.dto.PhoneDto;
import com.example.model.entity.Phone;
import com.example.model.service.IPhoneService;
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
public class PhoneController {
    @Autowired
    IPhoneService iPhoneService;
    @GetMapping(value = {"","/phone"})
    public String formCreatePhone(Model model){
        model.addAttribute("phoneDto",new PhoneDto());
        return "/create";
    }
    @PostMapping(value = "/create")
    public String createUser(@ModelAttribute @Valid PhoneDto phoneDto, BindingResult bindingResult, Model model){
        new PhoneDto().validate(phoneDto,bindingResult);
        if(bindingResult.hasErrors()){
            return "/create";
        }
        Phone phone=new Phone();
        BeanUtils.copyProperties(phoneDto,phone);
        iPhoneService.save(phone);
        model.addAttribute("message","success");
        return "/create";
    }
}
