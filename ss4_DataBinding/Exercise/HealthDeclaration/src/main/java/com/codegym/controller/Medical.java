package com.codegym.controller;

import com.codegym.model.MedicalDeclaration;
import com.codegym.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("medical/")
public class Medical {

    @Autowired
    IMedicalService medicalService;

    @GetMapping("/list")
    public String showForm(@RequestParam Medical medical, Model model) {
        List<MedicalDeclaration> medicalDeclarationList = new ArrayList<>();
        medicalDeclarationList = medicalService.findAll();
        model.addAttribute("medicalDeclarationList", medicalDeclarationList);
        return "list";
    }

    @PostMapping
    public String save() {

        return "list";
    }

}
