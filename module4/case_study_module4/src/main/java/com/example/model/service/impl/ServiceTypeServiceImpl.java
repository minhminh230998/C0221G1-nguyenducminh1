package com.example.model.service.impl;

import com.example.model.entity.service.ServiceType;
import com.example.model.repository.service.IServiceTypeRepository;
import com.example.model.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceTypeServiceImpl implements IServiceTypeService {
    @Autowired
    IServiceTypeRepository iServiceTypeRepository;
    @Override
    public List<ServiceType> findAll() {
        return (List<ServiceType>) iServiceTypeRepository.findAll();
    }

    @Override
    public ServiceType findById(Integer id) {
        return iServiceTypeRepository.findById(id).orElse(null);
    }
}
