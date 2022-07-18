package com.codegym.controller;

import com.codegym.model.Email;
import com.codegym.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmailController {

    @Autowired
    IEmailService emailService;

    @GetMapping("/list")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Email> emailList = emailService.findAll();
        modelAndView.addObject("emailList", emailList);
        return modelAndView;
    }

    @GetMapping("/edit")
    public ModelAndView showUpdate(@RequestParam Integer id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("email", emailService.findById(id));
        modelAndView.addObject("languageList", emailService.showLanguage());
        modelAndView.addObject("pageSizeList", emailService.showPaperSize());
        return modelAndView;
    }

    @PostMapping("edit")
    public String updateEmail(@ModelAttribute("email") Email email) {
        emailService.save(email.getId(), email);
        return "redirect:/list";
    }
}
