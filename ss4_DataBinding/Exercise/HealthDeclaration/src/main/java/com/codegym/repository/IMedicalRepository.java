package com.codegym.repository;

import com.codegym.model.MedicalDeclaration;

import java.util.List;

public interface IMedicalRepository {
    List<MedicalDeclaration> findAll();

    void save(Integer id, MedicalDeclaration medicalDeclaration);
}
