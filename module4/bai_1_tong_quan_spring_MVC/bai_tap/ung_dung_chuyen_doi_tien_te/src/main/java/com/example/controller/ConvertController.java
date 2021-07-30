package com.example.controller;

import com.example.service.IConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @Autowired
    private IConvertService convertService;
    @GetMapping(value = {"/", "/convert"})
    public String convert() {
     return "/convert";
    }
    @PostMapping(value = {"/convert"})
    public String result(@RequestParam String usd, Model model){
        double usd1=Double.parseDouble(usd);
        double vnd=convertService.convert(usd1);
        model.addAttribute("vnd",vnd);
        return "/convert";
    }
}
