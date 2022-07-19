package com.codegym.repository;

import com.codegym.model.MedicalDeclaration;

import java.util.List;

public interface IMedicalRepository {
    List<MedicalDeclaration> findAll();

    String[] yearOfBirth();

    String[] gender();

    String[] national();

    MedicalDeclaration findById(int id);

    void create(MedicalDeclaration medicalDeclaration);

    void update(int id, MedicalDeclaration medicalDeclaration);
}
