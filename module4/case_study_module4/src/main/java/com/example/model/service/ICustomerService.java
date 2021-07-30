package com.example.model.service;

import com.example.model.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAllCustomer();

    Customer findByIdCustomer(String id);

    Page<Customer> findByNameCustomer(String name, Pageable pageable);

    void saveCustomer(Customer customer);
    void deleteCustomer(String id);
}
