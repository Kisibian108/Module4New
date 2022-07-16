package com.codegym.service;

import com.codegym.model.MedicalDeclaration;
import com.codegym.repository.IMedicalRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MedicalServiceImpl implements IMedicalService{

    @Autowired
    IMedicalRepository medicalRepository;

    @Override
    public List<MedicalDeclaration> findAll() {
        return medicalRepository.findAll();
    }

    @Override
    public void save(Integer id, MedicalDeclaration medicalDeclaration) {
        medicalRepository.save(id,medicalDeclaration);
    }
}
