package model.service;

import model.bean.customer.Customer;

import java.util.List;

public interface ICustomerService {
    public List<Customer> findAll();
    public void createCustomer(Customer customer);
    public boolean editCustomer(Customer customer);
    public boolean deleteCustomer(int id);
    public Customer findById(int id);
    public List<Customer>findByName(String name);
}
