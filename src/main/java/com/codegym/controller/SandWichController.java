package com.codegym.controller;

import com.codegym.service.ICondimentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandWichController {

    @Autowired
    ICondimentsService condimentsService;

    @GetMapping("")
    public String showFormList() {
        return "index";
    }

    @PostMapping("")
    public String save(@RequestParam(value = "condiment", defaultValue = "chua chon") String[] condiment, Model model) {
        String name = condimentsService.findAll(condiment);
        model.addAttribute("name", name);
        return "index";
    }
}

