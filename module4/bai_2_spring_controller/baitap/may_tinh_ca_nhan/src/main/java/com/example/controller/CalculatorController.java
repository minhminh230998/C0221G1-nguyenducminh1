package com.example.controller;

import com.example.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    ICalculatorService calculatorService;

    @GetMapping(value = {"/", "calculator"})
    public String calculator() {
        return "index";
    }

    @PostMapping(value = "calculator")
    public String result(@RequestParam double nb1, @RequestParam double nb2, @RequestParam String operator, Model model) {
        String result = calculatorService.result(nb1, nb2, operator);
        model.addAttribute("result", result);
        return "index";
    }
}
