package com.example.model.service;

import com.example.model.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findByName(String name,Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
     Optional<Customer> findOne(Long id) throws Exception ;
     Customer saves(Customer customer) throws DuplicateEmailException;
}
