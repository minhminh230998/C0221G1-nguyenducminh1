package com.example.model.service.impl;

import com.example.model.entity.Customer;
import com.example.model.repository.ICustomerRepository;
import com.example.model.service.DuplicateEmailException;
import com.example.model.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository;


    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return iCustomerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> findByName(String name, Pageable pageable) {
        return iCustomerRepository.findAllByFirstNameContaining(name,pageable);
    }

    @Override
    public Customer findById(Long id) {
        return iCustomerRepository.findById(id).orElse(null);
    }
    @Override
    public Optional<Customer> findOne(Long id) throws Exception {
        Optional<Customer> customerOptional = iCustomerRepository.findById(id);
        if (!customerOptional.isPresent()) {
            throw new Exception("customer not found!");
        }
        return customerOptional;
    }

    @Override
    public Customer saves(Customer customer) throws DuplicateEmailException {
        try {
            return iCustomerRepository.save(customer);
        } catch (DataIntegrityViolationException e) {
            throw new DuplicateEmailException();
        }
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
      iCustomerRepository.deleteById(id);
    }
}
