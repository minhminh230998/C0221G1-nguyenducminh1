package com.example.model.service.impl;

import com.example.model.entity.customer.CustomerType;
import com.example.model.entity.service.Services;
import com.example.model.repository.service.IServiceRepository;
import com.example.model.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements IServiceService {
    @Autowired
    IServiceRepository iServiceRepository;
    @Override
    public List<Services> findAllService() {
        return (List<Services>) iServiceRepository.findAll();
    }

    @Override
    public Services findByIdServiceService(String id) {
        return  iServiceRepository.findById(id).orElse(null);
    }

    @Override
    public void saveService(Services service) {
    iServiceRepository.save(service);
    }
}
