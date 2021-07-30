package com.example.model.service;

import com.example.model.entity.customer.Customer;
import com.example.model.entity.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();
    CustomerType findById(Integer id);
}
