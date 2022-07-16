package com.codegym.service;

import com.codegym.model.Email;
import com.codegym.repository.IEmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmailSeriveImpl implements IEmailService {

    @Autowired
    IEmailRepository emailRepository;
    @Override
    public List<Email> findAll() {
       return emailRepository.findAll();
    }

    @Override
    public void save(Integer id, Email email) {
       emailRepository.save(id,email);
    }

    @Override
    public Email findById(int id) {
        return emailRepository.findById(id);
    }
}

