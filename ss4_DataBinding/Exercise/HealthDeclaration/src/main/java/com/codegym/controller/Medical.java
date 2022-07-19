package com.codegym.controller;

import com.codegym.model.MedicalDeclaration;
import com.codegym.service.IMedicalService;
import com.codegym.service.MedicalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/medical")
public class Medical {

    private IMedicalService medicalService = new MedicalServiceImpl();

    @GetMapping("list")
    public String showList(Model model) {
        List<MedicalDeclaration> medicalDeclarationList = medicalService.findAll();
        model.addAttribute("medicalDeclarationList", medicalDeclarationList);
        return "list";
    }

    @GetMapping("showCreate")
    public String showCreate(Model model) {
        model.addAttribute("medical", new MedicalDeclaration());
        String[] yearOfBirthList = medicalService.yearOfBirth();
        String[] genderList = medicalService.gender();
        String[] nationalityList = medicalService.national();
        model.addAttribute("yearOfBirthList", yearOfBirthList);
        model.addAttribute("genderList", genderList);
        model.addAttribute("nationalityList", nationalityList);
        return "create";
    }

    @PostMapping("create")
    public String create(@ModelAttribute MedicalDeclaration medicalDeclaration) {
        medicalService.create(medicalDeclaration);
        return "redirect:/medical/list";
    }

    @GetMapping("showUpdate")
    public String showUpdate(@RequestParam int id, Model model) {
        MedicalDeclaration medicalDeclaration = medicalService.findById(id);
        String[] yearOfBirthList = medicalService.yearOfBirth();
        String[] genderList = medicalService.gender();
        String[] nationalityList = medicalService.national();
        model.addAttribute("yearOfBirthList", yearOfBirthList);
        model.addAttribute("genderList", genderList);
        model.addAttribute("nationalityList", nationalityList);
        model.addAttribute("medical", medicalDeclaration);
        return "update";
    }

    @PostMapping("update")
    public String update(@ModelAttribute MedicalDeclaration medicalDeclaration,
                         @RequestParam int id) {
        medicalService.update(id, medicalDeclaration);
        return "redirect:/medical/list";
    }

}
