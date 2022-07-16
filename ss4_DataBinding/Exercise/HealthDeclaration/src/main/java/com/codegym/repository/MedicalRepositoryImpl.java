package com.codegym.repository;

import com.codegym.model.MedicalDeclaration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicalRepositoryImpl implements IMedicalRepository{
//    private Integer id;
//    private String name;
//    private int year;
//    private String gender;
//    private String national;
//    private int idCard;
//    private String travel;
//    private String idTravel;
//    private String chair;
//    private String startDate;
//    private String endDate;
//    private String infomation;
    @Override
    public List<MedicalDeclaration> findAll() {
        List<MedicalDeclaration> medicalDeclarationList = new ArrayList<>();
        medicalDeclarationList.add(new MedicalDeclaration("Lam",1992,"Male","VietNam",184016595, "May bay", "VN129", "29L","10-8-2022","11-8-2022","Da tiem 2 mui"));
        return medicalDeclarationList;
    }

    @Override
    public void save(Integer id, MedicalDeclaration medicalDeclaration) {

    }
}
