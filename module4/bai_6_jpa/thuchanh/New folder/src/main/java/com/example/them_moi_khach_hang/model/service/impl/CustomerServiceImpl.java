package com.example.them_moi_khach_hang.model.service.impl;


import com.example.them_moi_khach_hang.model.entity.Customer;
import com.example.them_moi_khach_hang.model.repository.ICustomerRepository;
import com.example.them_moi_khach_hang.model.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository;
    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }


}
