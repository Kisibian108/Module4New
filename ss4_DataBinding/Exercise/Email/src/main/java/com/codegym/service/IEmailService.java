package com.codegym.service;

import com.codegym.model.Email;

import java.util.List;

public interface IEmailService {
    List<Email> findAll();
    void save(Integer id, Email email);
    Email findById(Integer id);
    List<String> showLanguage();
    List<Integer> showPaperSize();
}
