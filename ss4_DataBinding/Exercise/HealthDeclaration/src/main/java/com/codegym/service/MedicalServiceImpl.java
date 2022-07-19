package com.codegym.service;

import com.codegym.model.MedicalDeclaration;
import com.codegym.repository.IMedicalRepository;
import com.codegym.repository.MedicalRepositoryImpl;

import java.util.List;

public class MedicalServiceImpl implements IMedicalService {
    private IMedicalRepository personRepository = new MedicalRepositoryImpl();

    @Override
    public List<MedicalDeclaration> findAll() {
        return personRepository.findAll();
    }

    @Override
    public String[] yearOfBirth() {
        return personRepository.yearOfBirth();
    }

    @Override
    public String[] gender() {
        return personRepository.gender();
    }

    @Override
    public String[] national() {
        return personRepository.national();
    }

    @Override
    public MedicalDeclaration findById(int id) {
        return personRepository.findById(id);
    }

    @Override
    public void create(MedicalDeclaration medicalDeclaration) {
        personRepository.create(medicalDeclaration);
    }

    @Override
    public void update(int id, MedicalDeclaration medicalDeclaration) {
        personRepository.update(id, medicalDeclaration);
    }
}
