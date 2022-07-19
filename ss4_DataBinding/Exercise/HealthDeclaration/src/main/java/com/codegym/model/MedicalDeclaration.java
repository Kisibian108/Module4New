package com.codegym.model;

public class MedicalDeclaration {

    private int id;
    private String name;
    private int year;
    private String gender;
    private String national;
    private int idCard;
    private String travel;
    private String idTravel;
    private String chair;
    private String startDate;
    private String endDate;
    private String infomation;

    public MedicalDeclaration() {
    }

    public MedicalDeclaration(int id, String name, int year, String gender, String national, int idCard, String travel, String idTravel, String chair, String startDate, String endDate, String infomation) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.gender = gender;
        this.national = national;
        this.idCard = idCard;
        this.travel = travel;
        this.idTravel = idTravel;
        this.chair = chair;
        this.startDate = startDate;
        this.endDate = endDate;
        this.infomation = infomation;
    }

    public MedicalDeclaration(String name, int year, String gender, String national, int idCard, String travel, String idTravel, String chair, String startDate, String endDate, String infomation) {

        this.name = name;
        this.year = year;
        this.gender = gender;
        this.national = national;
        this.idCard = idCard;
        this.travel = travel;
        this.idTravel = idTravel;
        this.chair = chair;
        this.startDate = startDate;
        this.endDate = endDate;
        this.infomation = infomation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getTravel() {
        return travel;
    }

    public void setTravel(String travel) {
        this.travel = travel;
    }

    public String getIdTravel() {
        return idTravel;
    }

    public void setIdTravel(String idTravel) {
        this.idTravel = idTravel;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getInfomation() {
        return infomation;
    }

    public void setInfomation(String infomation) {
        this.infomation = infomation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MedicalDeclaration{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", gender='" + gender + '\'' +
                ", national='" + national + '\'' +
                ", idCard=" + idCard +
                ", travel='" + travel + '\'' +
                ", idTravel='" + idTravel + '\'' +
                ", chair='" + chair + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", infomation='" + infomation + '\'' +
                '}';
    }
}
