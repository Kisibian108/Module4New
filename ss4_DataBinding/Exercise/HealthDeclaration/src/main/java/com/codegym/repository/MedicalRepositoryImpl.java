package com.codegym.repository;

import com.codegym.model.MedicalDeclaration;

import java.util.ArrayList;
import java.util.List;

public class MedicalRepositoryImpl implements IMedicalRepository {

    private static List<MedicalDeclaration> medicalDeclarationList = new ArrayList<>();

    static {
        medicalDeclarationList.add(new MedicalDeclaration("Lam", 1992, "Male", "Viet Nam", 1232431, "Tàu bay", "31341", "2", "2022-18-09", "2022-20-09", "da nang"));
        medicalDeclarationList.add(new MedicalDeclaration("Linh", 1989, "Male", "Viet Nam", 1233212431, "Tàu hoa", "311341", "3", "2022-15-09", "2022-21-09", "ha tinh"));
        medicalDeclarationList.add(new MedicalDeclaration("Hoai", 1985, "FeMale", "Viet Nam", 122332431, "Xe ", "313341", "5", "2022-12-09", "2022-14-09", "hue"));

    }

    String[] yearOfBirth = new String[]{"1992", "1989", "...", "1985"};
    String[] gender = new String[]{"Male", "Female"};
    String[] national = new String[]{"Viet Nam", "Lao", "Campuchia"};

    @Override
    public List<MedicalDeclaration> findAll() {
        return medicalDeclarationList;
    }

    @Override
    public String[] yearOfBirth() {
        return new String[0];
    }

    @Override
    public String[] gender() {
        return new String[0];
    }

    @Override
    public String[] national() {
        return new String[0];
    }

    @Override
    public MedicalDeclaration findById(int id) {
        for (MedicalDeclaration item : medicalDeclarationList) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public void create(MedicalDeclaration medicalDeclaration) {
        medicalDeclarationList.add(medicalDeclaration);
    }

    @Override
    public void update(int id, MedicalDeclaration medicalDeclaration) {
        for (MedicalDeclaration item : medicalDeclarationList) {
            if (item.getId() == id) {
                item.setName(medicalDeclaration.getName());
                item.setYear(medicalDeclaration.getYear());
                item.setGender(medicalDeclaration.getGender());
                item.setNational(medicalDeclaration.getNational());
                item.setIdCard(medicalDeclaration.getIdCard());
                item.setTravel(medicalDeclaration.getTravel());
                item.setTravel(medicalDeclaration.getIdTravel());
                item.setChair(medicalDeclaration.getChair());
                item.setStartDate(medicalDeclaration.getStartDate());
                item.setEndDate(medicalDeclaration.getEndDate());
                item.setInfomation(medicalDeclaration.getInfomation());
            }
        }
    }
}
