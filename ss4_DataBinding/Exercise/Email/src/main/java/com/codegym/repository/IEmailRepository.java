package com.codegym.repository;

import com.codegym.model.Email;

import java.util.List;

public interface IEmailRepository {
    List<Email> findAll();
    void save(Integer id, Email email);
    Email findById(Integer id);
    List<String> showLanguage();
    List<Integer> showPaperSize();
}
