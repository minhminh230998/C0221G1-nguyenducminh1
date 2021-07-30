package com.example.model.service;

import com.example.model.bean.Customer;

import java.util.List;

public interface ICustomerService {
    public List<Customer> findAll();
    public Customer findById(int id);
    public void updateCustomer(int id,Customer customer);
    void deleteCustomer(int id);
    void save(Customer customer);
}
