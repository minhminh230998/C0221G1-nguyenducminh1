package com.example.model.service;

import com.example.model.entity.customer.CustomerType;
import com.example.model.entity.service.RentType;

import java.util.List;

public interface IRentTypeService {
    List<RentType> findAll();
    RentType findById(Integer id);
}
