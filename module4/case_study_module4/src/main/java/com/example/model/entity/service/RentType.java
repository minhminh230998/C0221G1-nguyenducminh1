package com.example.model.entity.service;

import javax.persistence.*;
import java.util.List;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double cost;
    @OneToMany(mappedBy = "rentType")
    private List<Services> serviceList;

    public RentType(Integer id, String name, Double cost, List<Services> serviceList) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.serviceList = serviceList;
    }

    public RentType() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public List<Services> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Services> serviceList) {
        this.serviceList = serviceList;
    }
}
