package model.service;

import model.bean.service.RentType;

import java.util.List;

public interface IRentType {
    public List<RentType>findAll();
    public RentType findById(int id);
}
