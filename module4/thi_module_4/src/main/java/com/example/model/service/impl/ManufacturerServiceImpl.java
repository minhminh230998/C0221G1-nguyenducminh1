package com.example.model.service.impl;

import com.example.model.entity.Manufacturer;
import com.example.model.repository.IManufacturerRepository;
import com.example.model.service.IManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerServiceImpl implements IManufacturerService {
    @Autowired
    IManufacturerRepository iManufacturerRepository;
    @Override
    public List<Manufacturer> findAll() {
        return (List<Manufacturer>) iManufacturerRepository.findAll();
    }

    @Override
    public Manufacturer findById(int id) {
        return iManufacturerRepository.findById(id).orElse(null);
    }
}
