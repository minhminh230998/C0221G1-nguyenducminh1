package com.example.model.service.impl;

import com.example.model.entity.customer.CustomerType;
import com.example.model.repository.CustomerTypeRepository;
import com.example.model.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerTypeServiceImpl implements ICustomerTypeService {
    @Autowired
    CustomerTypeRepository customerTypeRepository;
    @Override
    public List<CustomerType> findAll() {
        return (List<CustomerType>) customerTypeRepository.findAll();
    }

    @Override
    public CustomerType findById(Integer id) {
        return customerTypeRepository.findById(id).orElse(null);
    }
}
