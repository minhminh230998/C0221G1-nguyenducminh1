package com.example.dto.service;

import com.example.model.entity.service.RentType;
import com.example.model.entity.service.ServiceType;

import javax.validation.constraints.*;


public class ServiceDto {
    @NotBlank(message = " Not Null")
    @Pattern(regexp = "^DV-[0-9]{4}$",message = " Enter the correct format")
    private String id;
    @NotBlank(message = " Not Null")
    private String name;
    @NotNull(message = " Not Null")
    @Min(value = 1,message = "Enter the correct format")
    private Double area;
    @NotNull(message = " Not Null")
    @Min(value = 1,message = "Enter the correct format")
    private Double cost;
    @NotNull(message = " Not Null")
    @Min(value = 1,message = "Enter the correct format")
    @Max(value = 20,message = "Enter the correct format")
    private Integer maxPeople;
    private String standardRoom;
    private Double foolArea;
    private Integer numberFloors;

    private RentType rentType;

    private ServiceType serviceType;


    public ServiceDto() {
    }

    public ServiceDto(String id, String name, Double area, Double cost, Integer maxPeople, String standardRoom, Double foolArea, Integer numberFloors, RentType rentType, ServiceType serviceType) {
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
