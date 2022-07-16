package com.codegym.service;

import com.codegym.model.MedicalDeclaration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IMedicalService {

    List<MedicalDeclaration> findAll();

    void save(Integer id, MedicalDeclaration medicalDeclaration);
}
