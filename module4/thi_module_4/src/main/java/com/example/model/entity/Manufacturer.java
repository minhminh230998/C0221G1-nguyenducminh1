package com.example.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "manufacturer")
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "manufacturer")
    List<Product> productList;

    public Manufacturer(int id, String name, List<Product> productList) {
        this.id = id;
        this.name = name;
        this.productList = productList;
    }

    public Manufacturer() {
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

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
