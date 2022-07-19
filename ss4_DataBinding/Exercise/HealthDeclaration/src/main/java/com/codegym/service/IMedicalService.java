package com.codegym.service;

import com.codegym.model.MedicalDeclaration;

import java.util.List;

public interface IMedicalService {
    List<MedicalDeclaration> findAll();

    String[] yearOfBirth();

    String[] gender();

    String[] national();

    MedicalDeclaration findById(int id);

    void create(MedicalDeclaration medicalDeclaration);

    void update(int id, MedicalDeclaration medicalDeclaration);
}
