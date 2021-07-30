package com.example.model.service;

import com.example.model.entity.service.RentType;
import com.example.model.entity.service.ServiceType;
import com.example.model.entity.service.Services;

import java.util.List;

public interface IServiceTypeService {
    List<ServiceType> findAll();
    ServiceType findById(Integer id);
}
