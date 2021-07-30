package com.example.model.entity.contract;

import javax.persistence.*;
import java.util.List;

@Entity
public class AttachService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double cost;
    private Integer unit;
    @OneToMany(mappedBy = "attachService")
    List<ContractDetail> contractDetailList;

    public AttachService() {
    }

    public AttachService(Integer id, String name, Double cost, Integer unit, List<ContractDetail> contractDetailList) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.unit = unit;
        this.contractDetailList = contractDetailList;
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

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public List<ContractDetail> getContractDetailList() {
        return contractDetailList;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetailList = contractDetailList;
    }
}
