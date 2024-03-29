package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    private int id;

    private String name;
    private double price;
    private String description;
    private String manufacturing;

    public Product() {
    }

    public Product(int id, String name, double price, String description, String manufacturing) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.manufacturing = manufacturing;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturing() {
        return manufacturing;
    }

    public void setManufacturing(String manufacturing) {
        this.manufacturing = manufacturing;
    }
}
