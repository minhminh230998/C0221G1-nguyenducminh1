package com.example.model.entity.service;

import com.example.model.entity.contract.Contract;

import javax.persistence.*;
import java.util.List;

@Entity
public class Services {
    @Id
    private String id;
    private String name;
    private Double area;
    private Double cost;
    private Integer maxPeople;
    private String standardRoom;
    private Double foolArea;
    private Integer numberFloors;
    @ManyToOne
    @JoinColumn(name = "rent_type_id",referencedColumnName = "id")
    RentType rentType;
    @ManyToOne
    @JoinColumn(name = "service_type_id",referencedColumnName = "id")
    ServiceType serviceType;
    @OneToMany(mappedBy = "service")
    private List<Contract> contractList;

    public Services(String id, String name, Double area, Double cost, Integer maxPeople, String standardRoom, Double foolArea, Integer numberFloors, RentType rentType, ServiceType serviceType, List<Contract> contractList) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.standardRoom = standardRoom;
        this.foolArea = foolArea;
        this.numberFloors = numberFloors;
        this.rentType = rentType;
        this.serviceType = serviceType;
        this.contractList = contractList;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }

    public Services() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public Double getFoolArea() {
        return foolArea;
    }

    public void setFoolArea(Double foolArea) {
        this.foolArea = foolArea;
    }

    public Integer getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(Integer numberFloors) {
        this.numberFloors = numberFloors;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
