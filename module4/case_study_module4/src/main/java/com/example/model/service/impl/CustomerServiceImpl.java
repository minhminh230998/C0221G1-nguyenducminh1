package com.example.model.service.impl;

import com.example.model.entity.customer.Customer;
import com.example.model.repository.CustomerRepository;
import com.example.model.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<Customer> findAllCustomer() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer findByIdCustomer(String id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Customer> findByNameCustomer(String name, Pageable pageable) {
        return customerRepository.findByNameContaining("%"+name+"%",pageable);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }
}
