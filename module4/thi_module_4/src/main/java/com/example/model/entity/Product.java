package com.example.model.entity;

import javax.persistence.*;

@Entity(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String name;
    private int price;
    @Column(name = "describes")
    private String describe;
    @ManyToOne
    @JoinColumn(name = "manufacturer_id",referencedColumnName = "id")
    private Manufacturer manufacturer;

    public Product(int id, String name, int price, String describe, Manufacturer manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.manufacturer = manufacturer;
    }

    public Product() {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
