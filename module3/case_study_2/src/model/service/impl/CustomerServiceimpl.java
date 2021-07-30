package model.service.impl;

import model.Repository.CustomerRepository;
import model.bean.customer.Customer;
import model.service.ICustomerService;

import java.util.List;

public class CustomerServiceimpl implements ICustomerService {
CustomerRepository customerRepository=new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.createCustomer(customer);
    }

    @Override
    public boolean editCustomer(Customer customer) {
        return customerRepository.editCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(int id) {
        return customerRepository.deleteCustomer(id);
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> findByName(String name) {
        return customerRepository.findByName(name);
    }
}
