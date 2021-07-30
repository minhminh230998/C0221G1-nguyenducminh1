package com.example.model.service.impl;

import com.example.model.entity.service.RentType;
import com.example.model.repository.service.IRentTypeRepository;
import com.example.model.service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentTypeServiceImpl implements IRentTypeService {
    @Autowired
    IRentTypeRepository iRentTypeRepository;
    @Override
    public List<RentType> findAll() {
        return (List<RentType>) iRentTypeRepository.findAll();
    }

    @Override
    public RentType findById(Integer id) {
        return iRentTypeRepository.findById(id).orElse(null);
    }
}
