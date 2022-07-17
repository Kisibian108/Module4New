package com.codegym.controller;

import com.codegym.model.MedicalDeclaration;
import com.codegym.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/medical")
public class Medical {

    @GetMapping("/list")
    public String showForm(Model model) {
        model.addAttribute("medicalDeclarationList", new MedicalDeclaration());
        return "list";
    }

    @PostMapping("/save")
    public String save() {

        return "list";
    }

}
