package com.example.service.impl;

import com.example.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {

    public String result(double a, double b, String operator) {
        double c = 0;
        String result="";
        switch (operator) {
            case "plus":
                c =a + b ;
                result+=c;
                break;
            case "minus":
                c = a - b;
                result+=c;
                break;
            case "multiply":
                c = a * b;
                result+=c;
                break;
            case "division":
                if (b == 0) {
                    result="loi";
                }else {
                    c = a / b;
                    result += c;
                    break;
                }
        }
        return result;
    }

}
