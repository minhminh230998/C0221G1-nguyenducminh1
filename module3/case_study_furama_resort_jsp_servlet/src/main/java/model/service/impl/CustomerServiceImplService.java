package model.service.impl;

import model.Repository.CustomerServiceRepository;
import model.bean.customer.Customer;
import model.bean.customerService.CustomerService;
import model.service.ICustomerServiceService;

import java.util.List;

public class CustomerServiceImplService implements ICustomerServiceService {
    CustomerServiceRepository customerServiceRepository=new CustomerServiceRepository();
    @Override
    public List<CustomerService> findAll() {
        return customerServiceRepository.findAll();
    }

    @Override
    public List<CustomerService> findByName(String name) {
        return customerServiceRepository.findByName(name);
    }
}
