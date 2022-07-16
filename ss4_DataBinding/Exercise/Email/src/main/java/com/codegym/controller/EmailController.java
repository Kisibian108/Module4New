package com.codegym.controller;

import com.codegym.model.Email;
import com.codegym.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("email/")
public class EmailController {

    @Autowired
    IEmailService emailService;

    @GetMapping("/list")
    public String showList(Model model) {

        List<Email> emailList = emailService.findAll();
        model.addAttribute("emailList", emailList);
        return "list";
    }

    @GetMapping("/save")
    public String showCreateForm(Model model) {
        List<String> languagelist = new ArrayList<>();
        List<String> papersize = new ArrayList<>();
        List<String> enable = new ArrayList<>();
        languagelist.add("English");
        languagelist.add("Rusia");
        languagelist.add("China");

        papersize.add("25");
        papersize.add("50");
        papersize.add("100");

        enable.add("Enable spams filter");
        model.addAttribute("email", new Email());
        model.addAttribute("languagelist", languagelist);
        model.addAttribute("papersize", papersize);
        model.addAttribute("enable", enable);
        return "create";
    }

    @GetMapping("/edit")
    public String edit(@ModelAttribute("email") Email email, ModelMap model, @RequestParam("id") int id) {
        List<String> languagelist = new ArrayList<>();
        List<String> papersize = new ArrayList<>();
        List<String> enable = new ArrayList<>();
        languagelist.add("English");
        languagelist.add("Rusia");
        languagelist.add("China");

        papersize.add("25");
        papersize.add("50");
        papersize.add("100");

        enable.add("Enable spams filter");
        model.addAttribute("email", new Email());
        model.addAttribute("languagelist", languagelist);
        model.addAttribute("papersize", papersize);
        model.addAttribute("enable", enable);
        model.addAttribute("language", email.getLanguage());
        model.addAttribute("paperSize", email.getPageSize());
        model.addAttribute("spamFilter", email.getSpamFilter());
        model.addAttribute("signature", email.getSignature());
        return "edit";
    }

    @PostMapping
    public String save(){



    }
}

