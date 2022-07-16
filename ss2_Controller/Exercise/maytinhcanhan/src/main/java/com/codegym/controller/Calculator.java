package com.codegym.controller;

import com.codegym.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {

    @Autowired
    ICalculatorService calculatorService;

    @GetMapping("")
    public String showFormList() {
        return "index";
    }

    @PostMapping("")
    public String save(
                       @RequestParam(value = "ope") String ope,
                       @RequestParam(value = "a") double a,
                       @RequestParam(value = "b") double b,
                       Model model) {

        double result = calculatorService.calculate(ope,a,b);
        model.addAttribute("result", result);
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        return "index";
    }
}
