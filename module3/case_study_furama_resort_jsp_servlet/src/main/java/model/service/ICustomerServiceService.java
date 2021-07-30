package model.service;

import model.bean.customerService.CustomerService;

import java.util.List;

public interface ICustomerServiceService {
    public List<CustomerService> findAll();
    public List<CustomerService>findByName(String name);
}
