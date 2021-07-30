package model.service;

import model.bean.customer.Customer;

import java.util.List;

public interface ICustomerService {
    public List<Customer> findAll();
    public String[] createCustomer(Customer customer);
    public boolean editCustomer(Customer customer);
    public boolean deleteCustomer(String id);
    public Customer findById(String id);
    public List<Customer>findByName(String name);
}