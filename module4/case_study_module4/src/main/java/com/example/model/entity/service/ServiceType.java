package com.example.model.entity.service;

import javax.persistence.*;
import java.util.List;

@Entity
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "serviceType")
    private List<Services> serviceList;

    public ServiceType(Integer id, String name, List<Services> serviceList) {
        this.id = id;
        this.name = name;
        this.serviceList = serviceList;
    }

    public ServiceType() {
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

    public List<Services> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Services> serviceList) {
        this.serviceList = serviceList;
    }
}
