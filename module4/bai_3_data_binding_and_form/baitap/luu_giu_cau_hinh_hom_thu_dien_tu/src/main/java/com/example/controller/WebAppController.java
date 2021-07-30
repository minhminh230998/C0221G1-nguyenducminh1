package com.example.controller;

import com.example.model.bean.WebApp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebAppController {

    @GetMapping(value = {"/","/webapp"})
    public String setting(Model model){
        WebApp webApp=new WebApp();
        List<String> languages = new ArrayList<>();
        List<Integer> pageSizes = new ArrayList<>();
        languages.add("English");
        languages.add("Vietnamese");
        languages.add("Japanese");
        languages.add("Chinese");
        pageSizes.add(5);
        pageSizes.add(10);
        pageSizes.add(15);
        pageSizes.add(25);
        pageSizes.add(50);
        pageSizes.add(100);


        model.addAttribute("languages",languages);
        model.addAttribute("pageSizes",pageSizes);
        model.addAttribute("webApp",webApp);
        return "update";
    }
    @PostMapping(value = "/update")
    @GetMapping("/update")
    public String update(@ModelAttribute WebApp webApp, Model model){
        model.addAttribute("webApp",webApp);

        return "info";
    }
}
